package com.dynatrace.android.agent.conf;

import We.s;
import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.SessionReplayComponentProvider;
import com.dynatrace.android.agent.UserActionModifier;
import com.dynatrace.android.agent.comm.CommunicationProblemListener;
import com.dynatrace.android.agent.util.Utility;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigurationBuilder {
    protected static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "ConfigurationBuilder");
    private boolean activityMonitoring;
    private boolean anrReporting;
    private final String applicationId;
    private final boolean applicationMonitoring;
    private final boolean autoStart;
    private UserActionModifier autoUserActionModifier;
    private final String beaconUrl;
    private boolean certificateValidation;
    private CommunicationProblemListener communicationProblemListener;
    private boolean crashReporting;
    private boolean debugLogLevel;
    private final int eventThrottlingLimit;
    private boolean fileDomainCookies;
    private final int graceTime;
    private Call.Factory httpFactory;
    private boolean hybridApp;
    private final InstrumentationFlavor instrumentationFlavor;
    private final boolean isRageTapDetectionEnabled;
    private KeyManager[] keyManagers;
    private KeyStore keyStore;
    private final AgentMode mode;
    private String[] monitoredDomains;
    private String[] monitoredHttpsDomains;
    private final boolean namePrivacy;
    private boolean nativeCrashReporting;
    private final boolean sendEmptyAction;
    private final SessionReplayComponentProvider sessionReplayComponentProvider;
    private boolean startupLoadBalancing;
    private boolean startupWithGrailEnabled;
    private boolean userOptIn;
    private final int waitTime;
    private final boolean webRequestTiming;

    public ConfigurationBuilder(AgentMode agentMode, String str, String str2) {
        this(agentMode, str, str2, new ConfigurationPreset());
    }

    public Configuration buildConfiguration() {
        String str = this.beaconUrl;
        if (str == null || this.mode == null) {
            if (this.debugLogLevel) {
                Utility.zlogE(LOGTAG, "discard invalid configuration");
            }
            return null;
        }
        String verifiedBeaconUrl = BuilderUtil.getVerifiedBeaconUrl(str);
        if (verifiedBeaconUrl == null) {
            if (this.debugLogLevel) {
                String str2 = LOGTAG;
                Utility.zlogE(str2, "invalid value for the beacon url \"" + this.beaconUrl + "\"");
                Utility.zlogE(str2, "discard invalid configuration");
            }
            return null;
        }
        String strTrimString = BuilderUtil.trimString(this.applicationId);
        if (strTrimString != null) {
            String strTruncateString = Utility.truncateString(strTrimString, 250);
            return new Configuration(strTruncateString, Utility.urlEncode(strTruncateString).replaceAll(Global.UNDERSCORE, Global.UNDERSCORE_ENCODED), verifiedBeaconUrl, this.mode, this.certificateValidation, this.keyStore, this.keyManagers, this.graceTime, this.waitTime, this.sendEmptyAction, this.namePrivacy, this.applicationMonitoring, this.activityMonitoring, this.crashReporting, this.nativeCrashReporting, this.anrReporting, this.webRequestTiming, this.monitoredDomains, this.monitoredHttpsDomains, this.hybridApp, this.fileDomainCookies, this.debugLogLevel, this.autoStart, this.communicationProblemListener, this.userOptIn, this.startupLoadBalancing, this.startupWithGrailEnabled, (this.instrumentationFlavor == InstrumentationFlavor.PLAIN && ComposeDependencyChecker.hasComposeDependency()) ? InstrumentationFlavor.JETPACK_COMPOSE : this.instrumentationFlavor, this.sessionReplayComponentProvider, this.isRageTapDetectionEnabled, this.autoUserActionModifier, this.httpFactory, this.eventThrottlingLimit);
        }
        if (this.debugLogLevel) {
            String str3 = LOGTAG;
            Utility.zlogE(str3, "invalid value for application id \"" + this.applicationId + "\"");
            Utility.zlogE(str3, "discard invalid configuration");
        }
        return null;
    }

    public ConfigurationBuilder withActivityMonitoring(boolean z4) {
        this.activityMonitoring = z4;
        return this;
    }

    public ConfigurationBuilder withAnrReporting(boolean z4) {
        this.anrReporting = z4;
        return this;
    }

    public ConfigurationBuilder withAutoUserActionModifier(UserActionModifier userActionModifier) {
        this.autoUserActionModifier = userActionModifier;
        return this;
    }

    @Deprecated
    public ConfigurationBuilder withCertificateValidation(boolean z4) {
        this.certificateValidation = z4;
        return this;
    }

    public ConfigurationBuilder withCommunicationProblemListener(CommunicationProblemListener communicationProblemListener) {
        this.communicationProblemListener = communicationProblemListener;
        return this;
    }

    public ConfigurationBuilder withCrashReporting(boolean z4) {
        this.crashReporting = z4;
        return this;
    }

    public ConfigurationBuilder withDebugLogging(boolean z4) {
        this.debugLogLevel = z4;
        return this;
    }

    public ConfigurationBuilder withFileDomainCookies(boolean z4) {
        this.fileDomainCookies = z4;
        return this;
    }

    public ConfigurationBuilder withHybridMonitoring(boolean z4) {
        this.hybridApp = z4;
        return this;
    }

    @Deprecated
    public ConfigurationBuilder withKeyManagers(KeyManager[] keyManagerArr) {
        this.keyManagers = keyManagerArr;
        return this;
    }

    @Deprecated
    public ConfigurationBuilder withKeyStore(KeyStore keyStore) {
        this.keyStore = keyStore;
        return this;
    }

    public ConfigurationBuilder withMonitoredDomains(String... strArr) {
        String[] strArrTrimStrings = BuilderUtil.trimStrings(strArr);
        if (strArrTrimStrings != null) {
            this.monitoredDomains = strArrTrimStrings;
        }
        return this;
    }

    public ConfigurationBuilder withMonitoredHttpsDomains(String... strArr) {
        String[] strArrTrimStrings = BuilderUtil.trimStrings(strArr);
        if (strArrTrimStrings != null) {
            this.monitoredHttpsDomains = strArrTrimStrings;
        }
        return this;
    }

    public ConfigurationBuilder withNativeCrashReporting(boolean z4) {
        this.nativeCrashReporting = z4;
        return this;
    }

    public ConfigurationBuilder withOkHttpClient(OkHttpClient okHttpClient) {
        this.httpFactory = okHttpClient;
        return this;
    }

    public ConfigurationBuilder withOkHttpFactory(Call.Factory factory) {
        this.httpFactory = factory;
        return this;
    }

    public ConfigurationBuilder withStartupLoadBalancing(boolean z4) {
        if (this.mode != AgentMode.APP_MON) {
            this.startupLoadBalancing = z4;
        }
        return this;
    }

    public ConfigurationBuilder withStartupWithGrailEnabled(boolean z4) {
        this.startupWithGrailEnabled = z4;
        return this;
    }

    public ConfigurationBuilder withUserOptIn(boolean z4) {
        this.userOptIn = z4;
        return this;
    }

    public ConfigurationBuilder(AgentMode agentMode, String str, String str2, ConfigurationPreset configurationPreset) {
        this.monitoredDomains = new String[0];
        this.monitoredHttpsDomains = new String[0];
        this.autoUserActionModifier = null;
        this.httpFactory = null;
        this.mode = agentMode;
        this.applicationId = str;
        this.beaconUrl = str2;
        withCertificateValidation(configurationPreset.getCertificateValidation());
        withHybridMonitoring(configurationPreset.getHybridApp());
        withFileDomainCookies(configurationPreset.getFileDomainCookies());
        withDebugLogging(configurationPreset.getDebugLogLevel());
        withUserOptIn(configurationPreset.getUserOptIn());
        withMonitoredDomains(configurationPreset.getMonitoredDomains());
        withMonitoredHttpsDomains(configurationPreset.getMonitoredHttpsDomains());
        withStartupLoadBalancing(configurationPreset.getStartupLoadBalancing());
        withStartupWithGrailEnabled(configurationPreset.getStartupWithGrailEnabled());
        this.graceTime = configurationPreset.getGraceTime();
        this.waitTime = configurationPreset.getWaitTime();
        this.applicationMonitoring = configurationPreset.getApplicationMonitoring();
        this.activityMonitoring = configurationPreset.getActivityMonitoring();
        this.webRequestTiming = configurationPreset.getWebRequestTiming();
        this.autoStart = configurationPreset.getAutoStart();
        this.crashReporting = configurationPreset.getCrashReporting();
        this.nativeCrashReporting = configurationPreset.getNativeCrashReporting();
        this.anrReporting = configurationPreset.getAnrReporting();
        this.sendEmptyAction = configurationPreset.getSendEmptyActions();
        this.namePrivacy = configurationPreset.getNamePrivacy();
        this.communicationProblemListener = null;
        this.keyStore = null;
        this.keyManagers = null;
        this.instrumentationFlavor = configurationPreset.getInstrumentationFlavor();
        this.sessionReplayComponentProvider = configurationPreset.getSessionReplayComponentProvider();
        this.isRageTapDetectionEnabled = configurationPreset.isRageTapDetectionEnabled();
        this.eventThrottlingLimit = configurationPreset.getEventThrottlingLimit();
    }
}
