package com.dynatrace.android.agent;

import We.s;
import c2.C1059b;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.agent.events.error.ErrorEvent;
import com.dynatrace.android.agent.crash.CrashListener;
import com.dynatrace.android.agent.crash.StacktraceData;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CrashReporter implements CrashListener {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "CrashReporter");
    public static boolean hasCrashed = false;
    protected CommunicationManager communicationManager;
    private final StacktraceProcessorFactory processorFactory = new StacktraceProcessorFactory();

    public CrashReporter(CommunicationManager communicationManager) {
        this.communicationManager = communicationManager;
    }

    public static boolean hasCrashed() {
        return hasCrashed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reportCrash$0(Throwable th2, Thread thread, Session session, long j, RumEventDispatcher rumEventDispatcher) {
        Object[] objArr = {th2, thread};
        JSONObject jSONObjectCrashEvent = ErrorEvent.crashEvent(th2);
        if (jSONObjectCrashEvent != null) {
            rumEventDispatcher.dispatchEvent(jSONObjectCrashEvent, j, 0L, SessionInformationGenerator.generate(session), false, objArr);
        }
    }

    @Override // com.dynatrace.android.agent.crash.CrashListener
    public synchronized void notifyCustomCrash(String str, String str2, String str3, String str4) {
    }

    @Override // com.dynatrace.android.agent.crash.CrashListener
    public synchronized void notifyJavaCrash(Thread thread, Throwable th2) {
        try {
            Session sessionDetermineActiveSession = Session.determineActiveSession(true);
            int i = AdkSettings.getInstance().serverId;
            this.communicationManager.stopTimerLoop();
            if (sessionDetermineActiveSession.isActive()) {
                reportCrash(thread, th2, sessionDetermineActiveSession, i);
            }
            Core.shutdown(5000L);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public void reportCrash(Thread thread, Throwable th2, Session session, int i) {
        long systemTime = TimeLineProvider.getSystemTime();
        if (Global.DEBUG) {
            Utility.zlogE(LOGTAG, "Processing exception (in thread " + (thread != null ? thread.getName() : "unknown") + ") ...", th2);
        }
        if (!session.getPrivacyRules().shouldCollectEvent(EventType.CRASH)) {
            Core.forceCloseActiveActions("a crash");
            return;
        }
        InstrumentationFlavor instrumentationFlavor = AdkSettings.getInstance().getConfiguration().instrumentationFlavor;
        StacktraceData stacktraceDataProcess = this.processorFactory.determineCrashProcessor(th2, instrumentationFlavor).process();
        String name = stacktraceDataProcess.getName();
        if (instrumentationFlavor == InstrumentationFlavor.REACT_NATIVE && name != null && name.contains("JavascriptException")) {
            Core.forceCloseActiveActions("a crash");
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportCrash, thread: " + thread + ", throwable: " + th2 + ", serverId: " + i);
        Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(session, new C1059b(th2, thread, session, systemTime, 2));
        CrashSegment crashSegment = new CrashSegment(name, stacktraceDataProcess.getReason(), stacktraceDataProcess.getStacktrace(), session, i, stacktraceDataProcess.getType().getProtocolValue(), session.isGrailEventsShouldBeCaptured() ^ true);
        Core.forceCloseActiveActions("a crash");
        int i4 = session.multiplicity;
        int i6 = i4 != -1 ? i4 : 1;
        if (!session.isActive()) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Session state changed to inactive while processing crash: abort.");
            }
        } else {
            if (this.communicationManager.sendCrashData(crashSegment, i, session, i6)) {
                return;
            }
            crashSegment.setSendImmediately(false);
            Core.saveSegment(crashSegment);
        }
    }
}
