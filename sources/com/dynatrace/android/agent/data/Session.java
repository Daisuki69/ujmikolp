package com.dynatrace.android.agent.data;

import We.s;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.RageTapConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.util.Utility;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class Session {
    private static final int SELF_MONITORING_SESSION_LIMIT = 20;
    static final int TC_MAX_VALUE = 100;
    private volatile long lastInteractionTime;
    private PrivacyRules privacyRules;
    private final RageTapConfiguration rageTapConfiguration;
    private Random random;
    public int sessionId;
    public final long sessionStartTime;
    public String userTag;
    public long visitorId;
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, RtspHeaders.SESSION);
    static RandomFactory randomFactory = new RandomFactory();
    private static volatile Session currentSession = null;
    public int sequenceNumber = 0;
    public int multiplicity = -1;
    public String srBasicParam = null;
    private SessionState state = SessionState.CREATED;
    private boolean isGrailEventsShouldBeCaptured = false;
    private volatile int selfMonitoringCount = 0;

    public Session(long j, Random random, PrivacyRules privacyRules, RageTapConfiguration rageTapConfiguration) {
        this.sessionStartTime = j;
        this.lastInteractionTime = j;
        this.random = random;
        this.privacyRules = privacyRules;
        this.rageTapConfiguration = rageTapConfiguration;
    }

    public static Session currentSession() {
        return currentSession != null ? currentSession : startNewSessionIfNeeded(PrivacyRules.PRIVACY_MODE_DEACTIVATED);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dynatrace.android.agent.data.Session determineActiveSession(boolean r5, long r6) {
        /*
            com.dynatrace.android.agent.data.Session r0 = currentSession()
            if (r5 != 0) goto L4c
            com.dynatrace.android.agent.AdkSettings r5 = com.dynatrace.android.agent.AdkSettings.getInstance()
            com.dynatrace.android.agent.conf.SessionSplitConfiguration r5 = r5.getSessionSplitConfiguration()
            long r1 = r0.lastInteractionTime
            long r3 = r5.getInactivityTimeoutMs()
            long r3 = r3 + r1
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 < 0) goto L24
            long r1 = r0.sessionStartTime
            long r3 = r5.getMaxSessionDurationMs()
            long r3 = r3 + r1
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 >= 0) goto L4c
        L24:
            r5 = 1
            com.dynatrace.android.agent.conf.PrivacyRules r1 = r0.getPrivacyRules()
            com.dynatrace.android.agent.Core.startNewSession(r5, r1, r6)
            java.lang.String r5 = r0.getUserTag()
            if (r5 == 0) goto L4a
            com.dynatrace.android.agent.conf.PrivacyRules r5 = r0.getPrivacyRules()
            com.dynatrace.android.agent.EventType r1 = com.dynatrace.android.agent.EventType.IDENTIFY_USER
            boolean r5 = r5.shouldCollectEvent(r1)
            if (r5 == 0) goto L4a
            com.dynatrace.android.agent.data.Session r5 = com.dynatrace.android.agent.data.Session.currentSession
            java.lang.String r0 = r0.userTag
            r5.setUserTag(r0)
            com.dynatrace.android.agent.data.Session r5 = com.dynatrace.android.agent.data.Session.currentSession
            com.dynatrace.android.agent.Core.reportUserTag(r5)
        L4a:
            com.dynatrace.android.agent.data.Session r0 = com.dynatrace.android.agent.data.Session.currentSession
        L4c:
            r0.lastInteractionTime = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.data.Session.determineActiveSession(boolean, long):com.dynatrace.android.agent.data.Session");
    }

    public static Session determineActiveSessionForInternalEvent() {
        return currentSession;
    }

    private boolean rollDice(int i, int i4) {
        return this.random.nextInt(i) < i4;
    }

    public static Session startNewSession(PrivacyRules privacyRules) {
        return startNewSession(privacyRules, TimeLineProvider.getSystemTime());
    }

    public static Session startNewSessionIfNeeded(PrivacyRules privacyRules) {
        if (currentSession == null) {
            synchronized (Session.class) {
                try {
                    if (currentSession == null) {
                        return startNewSession(privacyRules);
                    }
                } finally {
                }
            }
        }
        return currentSession;
    }

    public void addSelfMonitoringEvent() {
        this.selfMonitoringCount++;
    }

    public PrivacyRules getPrivacyRules() {
        return this.privacyRules;
    }

    public RageTapConfiguration getRageTapConfiguration() {
        return this.rageTapConfiguration;
    }

    public long getRunningTime() {
        return TimeLineProvider.getSystemTime() - this.sessionStartTime;
    }

    public long getSessionStartTime() {
        return this.sessionStartTime;
    }

    public String getUserTag() {
        return this.userTag;
    }

    public void handleTrafficLimitation(ServerConfiguration serverConfiguration) {
        if (this.state != SessionState.CREATED) {
            return;
        }
        int multiplicity = serverConfiguration.getMultiplicity();
        boolean zRollDice = multiplicity > 0;
        if (!zRollDice && Global.DEBUG) {
            Utility.zlogD(TAG, "Session disabled by overload prevention (mp=0)");
        }
        if (zRollDice && !(zRollDice = rollDice(100, serverConfiguration.getTrafficControlPercentage())) && Global.DEBUG) {
            Utility.zlogD(TAG, "Session disabled by traffic control: tc=" + serverConfiguration.getTrafficControlPercentage());
        }
        this.state = zRollDice ? SessionState.ENABLED : SessionState.DISABLED;
        this.multiplicity = multiplicity;
    }

    @Deprecated
    public void internalSetPrivacyRules(PrivacyRules privacyRules) {
        this.privacyRules = privacyRules;
    }

    public boolean isActive() {
        return this.state.isActive();
    }

    public boolean isConfigurationApplied() {
        return this.state.isConfigurationApplied();
    }

    public boolean isGrailEventsShouldBeCaptured() {
        return this.isGrailEventsShouldBeCaptured;
    }

    public boolean isSelfMonitoringLimitReached() {
        return this.selfMonitoringCount >= 20;
    }

    public void setGrailEventsShouldBeCaptured(boolean z4) {
        this.isGrailEventsShouldBeCaptured = z4;
    }

    public void setUserTag(String str) {
        this.userTag = str;
    }

    public synchronized void updateLastInteractionTime(long j) {
        if (j > this.lastInteractionTime) {
            this.lastInteractionTime = j;
        }
    }

    public static void startNewSession(PrivacyRules privacyRules, boolean z4) {
        startNewSession(privacyRules, TimeLineProvider.getSystemTime()).setGrailEventsShouldBeCaptured(z4);
    }

    public static Session startNewSession(PrivacyRules privacyRules, long j) {
        ServerConfiguration serverConfiguration = AdkSettings.getInstance().getServerConfiguration();
        boolean zIsGrailEventsShouldBeCaptured = currentSession != null ? currentSession.isGrailEventsShouldBeCaptured() : false;
        currentSession = new Session(j, randomFactory.generateRandom(), privacyRules, serverConfiguration.getRageTapConfiguration());
        currentSession.setGrailEventsShouldBeCaptured(zIsGrailEventsShouldBeCaptured);
        return currentSession;
    }

    public static void startNewSessionIfNeeded(PrivacyRules privacyRules, boolean z4) {
        if (currentSession == null) {
            synchronized (Session.class) {
                try {
                    if (currentSession == null) {
                        startNewSession(privacyRules).setGrailEventsShouldBeCaptured(z4);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static Session determineActiveSession(boolean z4) {
        return determineActiveSession(z4, TimeLineProvider.getSystemTime());
    }
}
