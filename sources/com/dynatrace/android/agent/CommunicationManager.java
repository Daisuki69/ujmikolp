package com.dynatrace.android.agent;

import We.s;
import android.os.Looper;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.android.agent.BasicSegment;
import com.dynatrace.android.agent.comm.CommHandler;
import com.dynatrace.android.agent.comm.CommunicationProblemListener;
import com.dynatrace.android.agent.comm.CommunicationProblemListenerTask;
import com.dynatrace.android.agent.comm.HttpResponse;
import com.dynatrace.android.agent.comm.InvalidResponseException;
import com.dynatrace.android.agent.comm.MonitoringDataPacket;
import com.dynatrace.android.agent.comm.RequestExecutor;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationManager;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.db.DataAccessObject;
import com.dynatrace.android.agent.db.DatabaseWriteQueue;
import com.dynatrace.android.agent.db.MonitoringDataEntity;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class CommunicationManager {
    private static final int COMM_MAX_RETRIES = 3;
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "CommunicationManager");
    private CalloutTable calloutTable;
    private CommunicationProblemListener communicationProblemListener;
    private ConnectionAttemptMonitor connAttemptMonitor;
    protected DataAccessObject dao;
    private ThreadPoolExecutor executor;
    private Thread mtEventSender;
    private Timer mtTimer;
    RequestExecutor requestExecutor;
    BasicSegment.UpdatableDataGenerator updatableDataGenerator = new BasicSegment.UpdatableDataGenerator();
    TimeLineProvider timeLineProvider = TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER;
    private final Object serverConfigLock = new Object();
    private final Object sessionConfigLock = new Object();
    private AgentState state = new AgentState.Enabled(false);
    private AtomicBoolean mForceUemUpdate = new AtomicBoolean(false);
    private AtomicBoolean mForceSendEvent = new AtomicBoolean(false);
    private AtomicBoolean mUemActive = new AtomicBoolean(false);
    private boolean mEventSenderActive = false;
    private long uemLastUpdate = 0;
    private AgentStateListener agentStateListener = null;
    private CommunicationManagerBridge communicationManagerBridge = null;
    private boolean gen3Enabled = false;
    private volatile boolean waitingForInitialBPv4Config = true;
    private WriteLock writeLock = new WriteLock(this, null);

    /* JADX INFO: renamed from: com.dynatrace.android.agent.CommunicationManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState;

        static {
            int[] iArr = new int[SendState.values().length];
            $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState = iArr;
            try {
                iArr[SendState.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState[SendState.MORE_DATA_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState[SendState.DATA_NOT_SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState[SendState.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class DataSendTimerTask extends TimerTask {
        public DataSendTimerTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (CommunicationManager.this.connAttemptMonitor == null) {
                if (Global.DEBUG) {
                    Utility.zlogD(CommunicationManager.TAG, "invalid DataSendTimerTask appeared");
                }
                CommunicationManager.this.stopTimerLoop();
                return;
            }
            if (!CommunicationManager.this.connAttemptMonitor.moreAttemptsAllowed() && !CommunicationManager.this.mUemActive.get()) {
                CommunicationManager.this.stopTimerLoop();
                Core.shutdown(99L);
                CommunicationManager.this.connAttemptMonitor = null;
                return;
            }
            long jNow = CommunicationManager.this.timeLineProvider.now() - CommunicationManager.this.uemLastUpdate;
            if (CommunicationManager.this.connAttemptMonitor.reconnAttemptInProgress()) {
                CommunicationManager.this.mForceUemUpdate.set(CommunicationManager.this.connAttemptMonitor.isTimeToConnect());
                if (!CommunicationManager.this.mForceUemUpdate.get()) {
                    if (Global.DEBUG) {
                        Utility.zlogD(CommunicationManager.TAG, String.format("ReconnWait: mUemActive=%b lastCheck=%ds ago", Boolean.valueOf(CommunicationManager.this.mUemActive.get()), Long.valueOf(jNow / 1000)));
                        return;
                    }
                    return;
                }
            }
            if (jNow >= 7200000 && !CommunicationManager.this.gen3Enabled) {
                CommunicationManager.this.mForceUemUpdate.set(true);
            }
            if (!CommunicationManager.this.mForceUemUpdate.get()) {
                if (CommunicationManager.this.waitingForInitialBPv4Config) {
                    Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "taskTimer: keep waiting for the GET request executed via BPv4");
                } else {
                    CommunicationManager.this.mForceUemUpdate.set(CommunicationManager.this.connAttemptMonitor.isTimeToConnect() && Session.currentSession().isActive());
                }
            }
            if (Global.DEBUG) {
                Utility.zlogD(CommunicationManager.TAG, "TaskTimer mForceUemUpdate=" + CommunicationManager.this.mForceUemUpdate.get() + " mUemActive=" + CommunicationManager.this.mUemActive.get() + " waitingForInitialBPv4Config=" + CommunicationManager.this.waitingForInitialBPv4Config);
            }
            if (CommunicationManager.this.mUemActive.get() || CommunicationManager.this.mForceUemUpdate.get()) {
                if (!CommunicationManager.this.waitingForInitialBPv4Config) {
                    if (CommunicationManager.this.calloutTable.isItTimeToSend()) {
                        CommunicationManager.this.mForceSendEvent.set(true);
                    }
                    if (CustomSegment.firstSendOccurred.get() == 1) {
                        CommunicationManager.this.mForceSendEvent.set(true);
                        CustomSegment.firstSendOccurred.set(2);
                    }
                }
                if (Global.DEBUG) {
                    Utility.zlogD(CommunicationManager.TAG, String.format("TaskTimer mForceSendEvent=%s thread ID=%d", Boolean.valueOf(CommunicationManager.this.mForceSendEvent.get()), Long.valueOf(Utility.getThreadId(CommunicationManager.this.mtEventSender))));
                }
                if (CommunicationManager.this.mForceSendEvent.get() || CommunicationManager.this.mForceUemUpdate.get()) {
                    synchronized (CommunicationManager.this.mtEventSender) {
                        CommunicationManager.this.mtEventSender.notify();
                    }
                    CommunicationManager communicationManager = CommunicationManager.this;
                    communicationManager.uemLastUpdate = communicationManager.timeLineProvider.now();
                }
            }
        }
    }

    public class EventSenderThread extends Thread {
        public /* synthetic */ EventSenderThread(CommunicationManager communicationManager, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z4;
            CommunicationManager.this.mEventSenderActive = true;
            do {
                try {
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    if (Global.DEBUG) {
                        Utility.zlogD(CommunicationManager.TAG, e.getMessage(), e);
                        return;
                    }
                    return;
                }
                synchronized (this) {
                    try {
                        if (!CommunicationManager.this.mEventSenderActive) {
                            return;
                        }
                        wait();
                        z4 = CommunicationManager.this.mEventSenderActive;
                        CommunicationManager.this.doSenderTask(AndroidMetrics.getInstance().isNetworkAvailable());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    return;
                }
            } while (z4);
        }

        private EventSenderThread() {
            super(s.p(new StringBuilder(), Global.LOG_PREFIX, "EventSenderThread"));
        }
    }

    public class PostCrashReportThread extends Thread {
        private final boolean isRootEvent;
        private final MonitoringDataPacket monitoringData;
        private final ServerConfiguration serverConfig;
        private final int serverId;
        private final int sessionId;
        private boolean successfully;
        private final long visitorId;

        public /* synthetic */ PostCrashReportThread(CommunicationManager communicationManager, ServerConfiguration serverConfiguration, MonitoringDataPacket monitoringDataPacket, int i, boolean z4, long j, int i4, AnonymousClass1 anonymousClass1) {
            this(serverConfiguration, monitoringDataPacket, i, z4, j, i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasBeenSuccessfully() {
            return this.successfully;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.successfully = CommunicationManager.this.handleSendEvents(this.serverConfig, this.monitoringData, this.serverId, this.isRootEvent, this.visitorId, this.sessionId, false);
        }

        private PostCrashReportThread(ServerConfiguration serverConfiguration, MonitoringDataPacket monitoringDataPacket, int i, boolean z4, long j, int i4) {
            this.successfully = false;
            setName("POST CrashReport");
            this.serverConfig = serverConfiguration;
            this.monitoringData = monitoringDataPacket;
            this.serverId = i;
            this.isRootEvent = z4;
            this.visitorId = j;
            this.sessionId = i4;
        }
    }

    public enum SendState {
        NO_DATA,
        DATA_NOT_SENT,
        MORE_DATA_AVAILABLE,
        FINISHED
    }

    public class WriteLock {
        private File lockFile;

        public /* synthetic */ WriteLock(CommunicationManager communicationManager, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean available() {
            boolean z4 = false;
            try {
                File file = new File(AdkSettings.getInstance().getContext().getCacheDir() + File.separator + "Write.lock");
                boolean zExists = file.exists();
                if (!zExists || CommunicationManager.this.timeLineProvider.now() - file.lastModified() <= 60000) {
                    z4 = zExists;
                } else {
                    file.delete();
                    if (Global.DEBUG) {
                        Utility.zlogD(CommunicationManager.TAG, "Force taking write lock");
                    }
                }
                if (!z4) {
                    try {
                    } catch (IOException e) {
                        if (Global.DEBUG) {
                            Utility.zlogE(CommunicationManager.TAG, e.toString());
                        }
                    }
                    if (file.createNewFile()) {
                        file.deleteOnExit();
                        this.lockFile = file;
                    } else {
                        z4 = true;
                    }
                }
                return !z4;
            } catch (Exception e7) {
                if (Global.DEBUG) {
                    Utility.zlogE(CommunicationManager.TAG, e7.toString());
                }
                return false;
            }
        }

        public void release() {
            File file = this.lockFile;
            if (file != null) {
                file.delete();
                this.lockFile = null;
            }
        }

        private WriteLock() {
        }
    }

    public CommunicationManager(CalloutTable calloutTable) {
        this.calloutTable = calloutTable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doSenderTask(boolean z4) {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "EventSender active ... mForceSendEvent=" + this.mForceSendEvent.get() + " mForceUemUpdate=" + this.mForceUemUpdate.get());
        }
        ServerConfiguration serverConfiguration = AdkSettings.getInstance().getServerConfiguration();
        if (!z4) {
            this.dao.deleteOldEvents(this.timeLineProvider.now(), serverConfiguration.isCachingCrashes());
            return;
        }
        Session sessionCurrentSession = Session.currentSession();
        if (!sessionCurrentSession.isConfigurationApplied() || !this.mForceSendEvent.compareAndSet(true, false)) {
            if (this.mForceUemUpdate.get()) {
                forceUemStateUpdate(serverConfiguration, sessionCurrentSession);
                return;
            } else {
                if (sessionCurrentSession.isConfigurationApplied() || !this.mForceSendEvent.get()) {
                    return;
                }
                forceUemStateUpdate(serverConfiguration, sessionCurrentSession);
                return;
            }
        }
        int i = AnonymousClass1.$SwitchMap$com$dynatrace$android$agent$CommunicationManager$SendState[sendMonitoringData(serverConfiguration, sessionCurrentSession.visitorId).ordinal()];
        if (i == 1) {
            handleFlagUemUpdate(serverConfiguration);
            return;
        }
        if (i == 2) {
            this.mForceSendEvent.set(true);
            handleFlagUemUpdate(serverConfiguration);
        } else if (i == 3) {
            this.mForceSendEvent.set(true);
        } else if (i == 4 && this.mForceUemUpdate.get()) {
            forceUemStateUpdate(serverConfiguration, sessionCurrentSession);
        }
    }

    private void forceUemStateUpdate(ServerConfiguration serverConfiguration, Session session) {
        this.dao.deleteOldEvents(this.timeLineProvider.now(), serverConfiguration.isCachingCrashes());
        boolean zIsConfigurationApplied = true;
        try {
            handleConfigReceivedFromConfigRequest(session, this.requestExecutor.sendBeacon(serverConfiguration, !session.isConfigurationApplied(), AdkSettings.getInstance().serverId, session));
            zIsConfigurationApplied = Session.currentSession().isConfigurationApplied();
        } catch (Exception e) {
            if (Global.DEBUG) {
                logRequestError("beacon request failed", e);
            }
            handleRequestError(e);
        }
        if (zIsConfigurationApplied) {
            this.mForceUemUpdate.set(false);
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "UEM state update: UEM state: " + this.mUemActive.get() + " mForceUemUpdate: " + this.mForceUemUpdate.get());
        }
    }

    private void handleConfigReceived(Session session, ServerConfiguration serverConfiguration, boolean z4) {
        CommunicationManagerBridge communicationManagerBridge;
        synchronized (this.serverConfigLock) {
            try {
                ServerConfiguration serverConfiguration2 = AdkSettings.getInstance().getServerConfiguration();
                if (serverConfiguration.getTimestamp() < serverConfiguration2.getTimestamp()) {
                    Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "discard too old configuration");
                    return;
                }
                boolean z5 = false;
                this.mUemActive.set(serverConfiguration.isCaptureOn() && (this.state instanceof AgentState.Enabled));
                if (serverConfiguration.getStatus() != ServerConfiguration.Status.ERROR) {
                    AdkSettings.getInstance().preferencesManager.setServerConfiguration(serverConfiguration);
                } else if (Global.DEBUG) {
                    Utility.zlogD(TAG, "Received faulty settings that will turn the agent off");
                }
                Core.applyServerConfiguration(serverConfiguration);
                boolean z8 = serverConfiguration.getTimestamp() > serverConfiguration2.getTimestamp();
                if (z4 && (communicationManagerBridge = this.communicationManagerBridge) != null) {
                    communicationManagerBridge.updateConfigurationInOneAgent(serverConfiguration);
                }
                AgentStateListener agentStateListener = this.agentStateListener;
                if (agentStateListener != null) {
                    if (z8) {
                        agentStateListener.onServerConfigurationChanged(serverConfiguration);
                    }
                    if (serverConfiguration.isSwitchServer()) {
                        this.agentStateListener.onServerIdForceChanged(serverConfiguration.getServerId());
                    }
                }
                if (session == null || session.isConfigurationApplied()) {
                    return;
                }
                synchronized (this.sessionConfigLock) {
                    try {
                        if (!session.isConfigurationApplied()) {
                            session.handleTrafficLimitation(serverConfiguration);
                            z5 = true;
                        }
                    } finally {
                    }
                }
                if (z5) {
                    if (this.agentStateListener != null) {
                        this.agentStateListener.onSessionStatusChanged(session, serverConfiguration, new SrBeaconParamListener());
                    }
                    if (session.isActive()) {
                        updateSessionPropertiesForEvents(session);
                    } else {
                        this.dao.deleteEventsFromVisit(session.visitorId, session.sessionId);
                    }
                    Core.handleTrafficLimitationForCookies(session);
                }
            } finally {
            }
        }
    }

    private void handleConfigReceivedFromConfigRequest(Session session, ServerConfiguration serverConfiguration) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        handleConfigReceived(session, serverConfiguration, true);
        if (this.mtTimer == null || (connectionAttemptMonitor = this.connAttemptMonitor) == null) {
            return;
        }
        connectionAttemptMonitor.notifyConnectionState(true, false);
    }

    private void handleConfigReceivedFromDataRequest(ServerConfiguration serverConfiguration) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        handleConfigReceived(null, serverConfiguration, true);
        if (this.mtTimer == null || (connectionAttemptMonitor = this.connAttemptMonitor) == null) {
            return;
        }
        connectionAttemptMonitor.notifyConnectionState(true, false);
    }

    private void handleFlagUemUpdate(ServerConfiguration serverConfiguration) {
        Session sessionCurrentSession = Session.currentSession();
        if (sessionCurrentSession.isConfigurationApplied()) {
            this.mForceUemUpdate.set(false);
        } else if (this.mForceUemUpdate.get()) {
            forceUemStateUpdate(serverConfiguration, sessionCurrentSession);
        }
    }

    private void handleRequestError(Exception exc) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        List<String> list;
        boolean z4 = exc instanceof InvalidResponseException;
        if (z4) {
            HttpResponse response = ((InvalidResponseException) exc).getResponse();
            if (response.responseCode == 429 && (list = response.headers.get("Retry-After")) != null && !list.isEmpty()) {
                try {
                    int i = Integer.parseInt(list.get(0));
                    this.mUemActive.set(false);
                    DatabaseWriteQueue.getInstance().flushQueue();
                    Core.dao.deleteAllEvents();
                    ConnectionAttemptMonitor connectionAttemptMonitor2 = this.connAttemptMonitor;
                    if (connectionAttemptMonitor2 != null) {
                        connectionAttemptMonitor2.notifyStateTooManyRequests(i);
                        return;
                    }
                } catch (NumberFormatException e) {
                    if (Global.DEBUG) {
                        Utility.zlogE(TAG, "can't parse Retry-After header", e);
                    }
                }
            }
        }
        if (this.communicationProblemListener == null) {
            handleRequestError(false);
            return;
        }
        if (z4) {
            this.mUemActive.set(false);
            if (this.mtTimer != null && (connectionAttemptMonitor = this.connAttemptMonitor) != null) {
                connectionAttemptMonitor.stop();
            }
        } else {
            handleRequestError(true);
        }
        if (this.executor.isShutdown()) {
            return;
        }
        this.executor.execute(new CommunicationProblemListenerTask(this.communicationProblemListener, exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleSendEvents(ServerConfiguration serverConfiguration, MonitoringDataPacket monitoringDataPacket, int i, boolean z4, long j, int i4, boolean z5) {
        Exception exc;
        boolean zAddNewVisitorInfoToDataChunk;
        try {
            if (AdkSettings.getInstance().newVisitorSent.get() || AdkSettings.getInstance().newVisitorSentPending.get() || !z4) {
                zAddNewVisitorInfoToDataChunk = false;
            } else {
                zAddNewVisitorInfoToDataChunk = BasicSegment.addNewVisitorInfoToDataChunk(monitoringDataPacket);
                if (zAddNewVisitorInfoToDataChunk) {
                    try {
                        AdkSettings.getInstance().newVisitorSentPending.set(true);
                    } catch (Exception e) {
                        exc = e;
                        if (zAddNewVisitorInfoToDataChunk) {
                            AdkSettings.getInstance().newVisitorSentPending.set(false);
                        }
                        if (Global.DEBUG) {
                            logRequestError("data request failed", exc);
                        }
                        handleRequestError(exc);
                        return false;
                    }
                }
            }
            ServerConfiguration serverConfigurationSendData = this.requestExecutor.sendData(serverConfiguration, monitoringDataPacket.generatePayload(), i, j, i4, z5);
            if (zAddNewVisitorInfoToDataChunk) {
                AdkSettings.getInstance().setNewVisitorSent(true);
                AdkSettings.getInstance().newVisitorSentPending.set(false);
            }
            handleConfigReceivedFromDataRequest(serverConfigurationSendData);
            return true;
        } catch (Exception e7) {
            exc = e7;
            zAddNewVisitorInfoToDataChunk = false;
        }
    }

    private void logRequestError(String str, Exception exc) {
        if (!(exc instanceof UnknownHostException)) {
            Utility.zlogD(TAG, str, exc);
            return;
        }
        String str2 = TAG;
        Utility.zlogD(str2, str);
        Utility.zlogD(str2, exc.toString());
    }

    private void updateSessionPropertiesForEvents(Session session) {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "updateSessionPropertiesForEvents");
        }
        DatabaseWriteQueue.getInstance().flushQueue();
        this.dao.updateSessionProperties(session);
    }

    public void flushEvents() {
        if (this.waitingForInitialBPv4Config) {
            Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "cannot flush events while still waiting for BPv4 configuration");
            return;
        }
        synchronized (this.mtEventSender) {
            this.mForceSendEvent.set(true);
            this.mtEventSender.notify();
        }
    }

    public void handleAgentStateReceivedFromOneAgent(AgentState agentState) {
        this.state = agentState;
        this.mUemActive.set((agentState instanceof AgentState.Enabled) && AdkSettings.getInstance().getServerConfiguration().isCaptureOn());
        Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "applied AgentState: " + agentState + " mUemActive: " + this.mUemActive.get());
    }

    public void handleConfigReceivedFromOneAgent(ServerConfiguration serverConfiguration) {
        handleConfigReceived(Session.currentSession(), serverConfiguration, false);
        if (this.waitingForInitialBPv4Config && this.mtTimer != null && this.connAttemptMonitor != null) {
            Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "config received from OneAgent, notify connection state: connected == true, restartTimer == false");
            this.connAttemptMonitor.notifyConnectionState(true, false);
        }
        this.waitingForInitialBPv4Config = false;
    }

    public boolean isUemActive() {
        return this.mUemActive.get();
    }

    public void scheduleNewBeaconRequest() {
        synchronized (this.mtEventSender) {
            this.mForceUemUpdate.set(true);
            this.mtEventSender.notify();
        }
    }

    public boolean sendCrashData(CustomSegment customSegment, int i, Session session, int i4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(customSegment.createEventData().toString());
        MonitoringDataPacket monitoringDataPacket = new MonitoringDataPacket(Core.getOcvbString(customSegment.session) + this.updatableDataGenerator.generateUpdatableData(session.sessionStartTime, i4, session.srBasicParam), arrayList);
        boolean z4 = Thread.currentThread() == Looper.getMainLooper().getThread();
        boolean z5 = customSegment.getParentTagId() == 0;
        ServerConfiguration serverConfiguration = AdkSettings.getInstance().getServerConfiguration();
        if (!z4) {
            return handleSendEvents(serverConfiguration, monitoringDataPacket, i, z5, session.visitorId, session.sessionId, false);
        }
        PostCrashReportThread postCrashReportThread = new PostCrashReportThread(this, serverConfiguration, monitoringDataPacket, i, z5, session.visitorId, session.sessionId, null);
        postCrashReportThread.start();
        try {
            postCrashReportThread.join(5000L);
        } catch (InterruptedException e) {
            if (Global.DEBUG) {
                Utility.zlogE(TAG, "crash reporting thread problem", e);
            }
        }
        return postCrashReportThread.hasBeenSuccessfully();
    }

    public SendState sendMonitoringData(ServerConfiguration serverConfiguration, long j) {
        SendState sendState;
        String str;
        StringBuilder sb2;
        if (!this.writeLock.available()) {
            return SendState.NO_DATA;
        }
        try {
            long jNow = this.timeLineProvider.now();
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "sendMonitoringData begin @" + jNow);
            }
            DatabaseWriteQueue.getInstance().flushQueue();
            this.dao.deleteOldEvents(jNow, serverConfiguration.isCachingCrashes());
            if (serverConfiguration.isCachingCrashes()) {
                this.dao.deleteOldCrashes(serverConfiguration.getMaxCachedCrashesCount());
            }
            MonitoringDataEntity monitoringDataEntityFetchEvents = this.dao.fetchEvents(serverConfiguration.maxSendLength(), this.updatableDataGenerator, jNow);
            if (monitoringDataEntityFetchEvents == null) {
                sendState = SendState.NO_DATA;
                if (Global.DEBUG) {
                    str = TAG;
                    sb2 = new StringBuilder("sendMonitoringData end @");
                    sb2.append(this.timeLineProvider.now());
                    Utility.zlogD(str, sb2.toString());
                }
            } else {
                boolean z4 = !monitoringDataEntityFetchEvents.finished;
                long j6 = monitoringDataEntityFetchEvents.visitorId;
                if (handleSendEvents(serverConfiguration, monitoringDataEntityFetchEvents.monitoringData, monitoringDataEntityFetchEvents.serverId, j6 == j, j6, monitoringDataEntityFetchEvents.sessionId, z4)) {
                    this.dao.deleteSentEvents(monitoringDataEntityFetchEvents);
                    sendState = monitoringDataEntityFetchEvents.finished ? SendState.FINISHED : SendState.MORE_DATA_AVAILABLE;
                    if (Global.DEBUG) {
                        str = TAG;
                        sb2 = new StringBuilder("sendMonitoringData end @");
                        sb2.append(this.timeLineProvider.now());
                        Utility.zlogD(str, sb2.toString());
                    }
                } else {
                    sendState = SendState.DATA_NOT_SENT;
                    if (Global.DEBUG) {
                        str = TAG;
                        sb2 = new StringBuilder("sendMonitoringData end @");
                        sb2.append(this.timeLineProvider.now());
                        Utility.zlogD(str, sb2.toString());
                    }
                }
            }
            this.writeLock.release();
            return sendState;
        } catch (Throwable th2) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "sendMonitoringData end @" + this.timeLineProvider.now());
            }
            this.writeLock.release();
            throw th2;
        }
    }

    public void shutdown(long j) {
        ThreadPoolExecutor threadPoolExecutor = this.executor;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdownNow();
        }
        this.mUemActive.set(false);
        Thread thread = this.mtEventSender;
        if (Global.DEBUG) {
            String str = TAG;
            long threadId = Utility.getThreadId(thread);
            StringBuilder sbS = androidx.camera.core.impl.a.s(j, "Shutdown allocated time: ", " ms threadId=");
            sbS.append(threadId);
            Utility.zlogD(str, sbS.toString());
        }
        long jNow = this.timeLineProvider.now();
        synchronized (thread) {
            try {
                if (this.waitingForInitialBPv4Config) {
                    Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "cannot flush events while still waiting for BPv4 configuration");
                } else {
                    this.mForceSendEvent.set(true);
                }
                this.mEventSenderActive = false;
                thread.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (thread.isAlive()) {
            try {
                thread.join(j);
            } catch (InterruptedException e) {
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, androidx.media3.datasource.cache.c.i(j, "Thread to send final events Interrupted, allotted time: ", " ms"), e);
                }
            }
            if (thread.isAlive() && Global.DEBUG) {
                Utility.zlogE(TAG, "Thread to send final events didn't complete in allotted time:" + j + " ms");
            }
        }
        this.requestExecutor.resetBeaconRetries();
        this.waitingForInitialBPv4Config = true;
        if (Global.DEBUG) {
            String str2 = TAG;
            long jNow2 = this.timeLineProvider.now() - jNow;
            long threadId2 = Utility.getThreadId(thread);
            StringBuilder sbS2 = androidx.camera.core.impl.a.s(jNow2, "Shutdown took: ", " ms threadID=");
            sbS2.append(threadId2);
            Utility.zlogD(str2, sbS2.toString());
        }
    }

    public void startNewSession(Session session) {
        if (this.waitingForInitialBPv4Config) {
            Utility.devLog(OneAgentLoggingKt.TAG_LEGACY_COMMUNICATION, "startNewSession: waiting for the GET request executed via BPv4");
        } else {
            this.mForceUemUpdate.set(session.isActive());
        }
    }

    public synchronized void startTimerLoop(boolean z4) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        try {
            if (this.mtTimer != null) {
                return;
            }
            if (z4 || (connectionAttemptMonitor = this.connAttemptMonitor) == null) {
                this.connAttemptMonitor = new ConnectionAttemptMonitor(3);
            } else {
                connectionAttemptMonitor.restartTimer();
            }
            Timer timer = new Timer(TAG);
            this.mtTimer = timer;
            timer.schedule(new DataSendTimerTask(), this.mEventSenderActive ? 0L : 100L, 10000L);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void startup(DataAccessObject dataAccessObject, Configuration configuration, AgentStateListener agentStateListener, CommunicationManagerBridge communicationManagerBridge) {
        this.communicationManagerBridge = communicationManagerBridge;
        this.dao = dataAccessObject;
        this.agentStateListener = agentStateListener;
        this.communicationProblemListener = configuration.communicationProblemListener;
        boolean zIsGen3Enabled = AdkSettings.getInstance().getServerConfiguration().isGen3Enabled();
        this.gen3Enabled = zIsGen3Enabled;
        if (!zIsGen3Enabled) {
            this.waitingForInitialBPv4Config = false;
        }
        if (this.communicationProblemListener != null) {
            this.executor = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        this.requestExecutor = new RequestExecutor(new CommHandler(configuration), configuration, new ServerConfigurationManager(configuration.appIdEncoded));
        Thread thread = this.mtEventSender;
        if (thread != null && thread.isAlive()) {
            try {
                this.mtEventSender.interrupt();
            } catch (Exception e) {
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, "event sender thread problem", e);
                }
            }
        }
        EventSenderThread eventSenderThread = new EventSenderThread(this, null);
        this.mtEventSender = eventSenderThread;
        eventSenderThread.start();
        this.mUemActive.set(true);
    }

    public synchronized void stopTimerLoop() {
        try {
            Timer timer = this.mtTimer;
            if (timer != null) {
                timer.cancel();
                this.mtTimer.purge();
            }
            this.mtTimer = null;
            this.calloutTable.purge();
            ConnectionAttemptMonitor connectionAttemptMonitor = this.connAttemptMonitor;
            if (connectionAttemptMonitor != null) {
                connectionAttemptMonitor.cancelTimer();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void handleRequestError(boolean z4) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        this.mUemActive.set(false);
        if (this.mtTimer == null || (connectionAttemptMonitor = this.connAttemptMonitor) == null) {
            return;
        }
        connectionAttemptMonitor.notifyConnectionState(false, z4);
    }
}
