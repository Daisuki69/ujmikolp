package com.dynatrace.android.agent.conf;

import We.s;
import com.dynatrace.agent.OneAgentConfiguration;
import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.android.agent.SessionReplayComponentProvider;
import com.dynatrace.android.agent.UserActionModifier;
import com.dynatrace.android.agent.Version;
import com.dynatrace.android.agent.comm.CommunicationProblemListener;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public class Configuration {
    public final boolean activityMonitoring;
    public final boolean anrReporting;
    public final String appIdEncoded;
    public final String applicationId;
    public final boolean applicationMonitoring;
    public final boolean autoStart;
    public final UserActionModifier autoUserActionModifier;
    public final String beaconUrl;
    public final boolean certificateValidation;
    public final CommunicationProblemListener communicationProblemListener;
    public final boolean crashReporting;
    public final boolean debugLogLevel;
    public final int eventThrottlingLimit;
    public final boolean fileDomainCookies;
    public final int graceTime;
    public final Call.Factory httpFactory;
    public final boolean hybridApp;
    public final InstrumentationFlavor instrumentationFlavor;
    public final boolean isRageTapDetectionEnabled;
    public final KeyManager[] keyManagers;
    public final KeyStore keyStore;
    public final AgentMode mode;
    public final String[] monitoredDomains;
    public final String[] monitoredHttpsDomains;
    public final boolean namePrivacy;
    public final boolean nativeCrashReporting;
    public final boolean sendEmptyAction;
    public final SessionReplayComponentProvider sessionReplayComponentProvider;
    public final boolean startupLoadBalancing;
    public final boolean startupWithGrailEnabled;
    public final boolean userOptIn;
    public final int waitTime;
    public final boolean webRequestTiming;

    public Configuration(String str, String str2, String str3, AgentMode agentMode, boolean z4, KeyStore keyStore, KeyManager[] keyManagerArr, int i, int i4, boolean z5, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String[] strArr, String[] strArr2, boolean z15, boolean z16, boolean z17, boolean z18, CommunicationProblemListener communicationProblemListener, boolean z19, boolean z20, boolean z21, InstrumentationFlavor instrumentationFlavor, SessionReplayComponentProvider sessionReplayComponentProvider, boolean z22, UserActionModifier userActionModifier, Call.Factory factory, int i6) {
        this.applicationId = str;
        this.appIdEncoded = str2;
        this.beaconUrl = str3;
        this.mode = agentMode;
        this.certificateValidation = z4;
        this.keyStore = keyStore;
        this.keyManagers = keyManagerArr;
        this.graceTime = i;
        this.waitTime = i4;
        this.sendEmptyAction = z5;
        this.namePrivacy = z8;
        this.applicationMonitoring = z9;
        this.activityMonitoring = z10;
        this.crashReporting = z11;
        this.nativeCrashReporting = z12;
        this.anrReporting = z13;
        this.webRequestTiming = z14;
        this.monitoredDomains = strArr;
        this.monitoredHttpsDomains = strArr2;
        this.hybridApp = z15;
        this.fileDomainCookies = z16;
        this.debugLogLevel = z17;
        this.autoStart = z18;
        this.communicationProblemListener = communicationProblemListener;
        this.userOptIn = z19;
        this.startupLoadBalancing = z20;
        this.startupWithGrailEnabled = z21;
        this.instrumentationFlavor = instrumentationFlavor;
        this.sessionReplayComponentProvider = sessionReplayComponentProvider;
        this.isRageTapDetectionEnabled = z22;
        this.autoUserActionModifier = userActionModifier;
        this.httpFactory = factory;
        this.eventThrottlingLimit = i6;
    }

    private static String objectToString(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + "@" + System.identityHashCode(obj);
    }

    public String getServerUrl() {
        return this.beaconUrl;
    }

    public OneAgentConfiguration toOneAgentConfiguration() {
        return new OneAgentConfiguration(Version.getFullVersion(), this.applicationId, this.beaconUrl, this.applicationMonitoring, this.activityMonitoring, this.nativeCrashReporting, this.anrReporting, this.eventThrottlingLimit, this.instrumentationFlavor);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration{applicationId='");
        sb2.append(this.applicationId);
        sb2.append("', appIdEncoded='");
        sb2.append(this.appIdEncoded);
        sb2.append("', beaconUrl='");
        sb2.append(this.beaconUrl);
        sb2.append("', mode=");
        sb2.append(this.mode);
        sb2.append(", certificateValidation=");
        sb2.append(this.certificateValidation);
        sb2.append(", keyStore=");
        sb2.append(this.keyStore);
        sb2.append(", keyManagers=");
        sb2.append(Arrays.toString(this.keyManagers));
        sb2.append(", graceTime=");
        sb2.append(this.graceTime);
        sb2.append(", waitTime=");
        sb2.append(this.waitTime);
        sb2.append(", sendEmptyAction=");
        sb2.append(this.sendEmptyAction);
        sb2.append(", namePrivacy=");
        sb2.append(this.namePrivacy);
        sb2.append(", applicationMonitoring=");
        sb2.append(this.applicationMonitoring);
        sb2.append(", activityMonitoring=");
        sb2.append(this.activityMonitoring);
        sb2.append(", crashReporting=");
        sb2.append(this.crashReporting);
        sb2.append(", nativeCrashReporting=");
        sb2.append(this.nativeCrashReporting);
        sb2.append(", anrReporting=");
        sb2.append(this.anrReporting);
        sb2.append(", webRequestTiming=");
        sb2.append(this.webRequestTiming);
        sb2.append(", monitoredDomains=");
        sb2.append(Arrays.toString(this.monitoredDomains));
        sb2.append(", monitoredHttpsDomains=");
        sb2.append(Arrays.toString(this.monitoredHttpsDomains));
        sb2.append(", hybridApp=");
        sb2.append(this.hybridApp);
        sb2.append(", fileDomainCookies=");
        sb2.append(this.fileDomainCookies);
        sb2.append(", debugLogLevel=");
        sb2.append(this.debugLogLevel);
        sb2.append(", autoStart=");
        sb2.append(this.autoStart);
        sb2.append(", communicationProblemListener=");
        sb2.append(objectToString(this.communicationProblemListener));
        sb2.append(", userOptIn=");
        sb2.append(this.userOptIn);
        sb2.append(", startupLoadBalancing=");
        sb2.append(this.startupLoadBalancing);
        sb2.append(", startupWithGrailEnabled=");
        sb2.append(this.startupWithGrailEnabled);
        sb2.append(", instrumentationFlavor=");
        sb2.append(this.instrumentationFlavor);
        sb2.append(", sessionReplayComponentProvider=");
        sb2.append(this.sessionReplayComponentProvider);
        sb2.append(", isRageTapDetectionEnabled=");
        sb2.append(this.isRageTapDetectionEnabled);
        sb2.append(", autoUserActionModifier=");
        sb2.append(objectToString(this.autoUserActionModifier));
        sb2.append(", httpFactory=");
        sb2.append(objectToString(this.httpFactory));
        sb2.append(", eventThrottlingLimit=");
        return s.m(sb2, this.eventThrottlingLimit, '}');
    }
}
