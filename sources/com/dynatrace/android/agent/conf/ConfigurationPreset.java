package com.dynatrace.android.agent.conf;

import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.android.agent.SessionReplayComponentProvider;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigurationPreset {
    protected static final boolean ACTIVITY_MONITORING_DEFAULT = true;
    protected static final boolean ANR_REPORTING_DEFAULT = true;
    protected static final boolean APPLICATION_MONITORING_DEFAULT = true;
    protected static final boolean AUTO_START_DEFAULT = true;
    protected static final boolean CERTIFICATE_VALIDATION_DEFAULT = true;
    protected static final boolean CRASH_REPORTING_DEFAULT = true;
    protected static final boolean DEBUG_LOG_LEVEL_DEFAULT = false;
    protected static final boolean DETECT_RAGE_TAP = true;
    protected static final int EVENT_THROTTLING_LIMIT = 500;
    protected static final boolean FILE_DOMAIN_COOKIE = true;
    protected static final int GRACE_TIME_DEFAULT = 500;
    protected static final boolean HYBRID_APP_DEFAULT = false;
    protected static final boolean NAME_PRIVACY_DEFAULT = false;
    protected static final boolean NATIVE_CRASH_REPORTING_DEFAULT = true;
    protected static final boolean SEND_EMPTY_ACTION_DEFAULT = true;
    protected static final boolean STARTUP_LOAD_BALANCING = false;
    protected static final boolean STARTUP_WITH_GRAIL = false;
    protected static final boolean USER_OPT_IN_DEFAULT = false;
    protected static final int WAIT_TIME_DEFAULT = 60000;
    protected static final boolean WEB_REQUEST_TIMING_DEFAULT = true;
    protected static final String[] MONITORED_DOMAINS_DEFAULT = new String[0];
    protected static final String[] MONITORED_HTTPS_DOMAINS_DEFAULT = new String[0];
    protected static final InstrumentationFlavor INSTRUMENTATION_FLAVOR = InstrumentationFlavor.PLAIN;

    @Deprecated
    public static Configuration generateImproperConfiguration() {
        ConfigurationPreset configurationPreset = new ConfigurationPreset();
        return new Configuration("", "", "", AgentMode.SAAS, configurationPreset.getCertificateValidation(), null, null, configurationPreset.getGraceTime(), configurationPreset.getWaitTime(), configurationPreset.getSendEmptyActions(), configurationPreset.getNamePrivacy(), configurationPreset.getApplicationMonitoring(), configurationPreset.getActivityMonitoring(), configurationPreset.getCrashReporting(), configurationPreset.getNativeCrashReporting(), configurationPreset.getAnrReporting(), configurationPreset.getWebRequestTiming(), configurationPreset.getMonitoredDomains(), configurationPreset.getMonitoredHttpsDomains(), configurationPreset.getHybridApp(), configurationPreset.getFileDomainCookies(), configurationPreset.getDebugLogLevel(), configurationPreset.getAutoStart(), null, configurationPreset.getUserOptIn(), configurationPreset.getStartupLoadBalancing(), configurationPreset.getStartupWithGrailEnabled(), configurationPreset.getInstrumentationFlavor(), configurationPreset.getSessionReplayComponentProvider(), configurationPreset.isRageTapDetectionEnabled(), null, null, configurationPreset.getEventThrottlingLimit());
    }

    public boolean getActivityMonitoring() {
        return true;
    }

    public boolean getAnrReporting() {
        return true;
    }

    public boolean getApplicationMonitoring() {
        return true;
    }

    public boolean getAutoStart() {
        return false;
    }

    public boolean getCertificateValidation() {
        return true;
    }

    public boolean getCrashReporting() {
        return true;
    }

    public boolean getDebugLogLevel() {
        return false;
    }

    public int getEventThrottlingLimit() {
        return 500;
    }

    public boolean getFileDomainCookies() {
        return true;
    }

    public int getGraceTime() {
        return 500;
    }

    public boolean getHybridApp() {
        return false;
    }

    public InstrumentationFlavor getInstrumentationFlavor() {
        return InstrumentationFlavor.PLAIN;
    }

    public String[] getMonitoredDomains() {
        return new String[0];
    }

    public String[] getMonitoredHttpsDomains() {
        return new String[0];
    }

    public boolean getNamePrivacy() {
        return false;
    }

    public boolean getNativeCrashReporting() {
        return true;
    }

    public boolean getSendEmptyActions() {
        return true;
    }

    public SessionReplayComponentProvider getSessionReplayComponentProvider() {
        return null;
    }

    public boolean getStartupLoadBalancing() {
        return false;
    }

    public boolean getStartupWithGrailEnabled() {
        return false;
    }

    public boolean getUserOptIn() {
        return false;
    }

    public int getWaitTime() {
        return 60000;
    }

    public boolean getWebRequestTiming() {
        return true;
    }

    public boolean isRageTapDetectionEnabled() {
        return true;
    }

    public String toString() {
        return "ConfigurationPreset{, graceTime=" + getGraceTime() + ", waitTime=" + getWaitTime() + ", applicationMonitoring=" + getApplicationMonitoring() + ", activityMonitoring=" + getActivityMonitoring() + ", certificateValidation=" + getCertificateValidation() + ", sendEmptyActions=" + getSendEmptyActions() + ", namePrivacy=" + getNamePrivacy() + ", crashReporting=" + getCrashReporting() + ", nativeCrashReporting=" + getNativeCrashReporting() + ", anrReporting=" + getAnrReporting() + ", webRequestTiming=" + getWebRequestTiming() + ", monitoredDomains=" + Arrays.toString(getMonitoredDomains()) + ", monitoredHttpsDomains=" + Arrays.toString(getMonitoredHttpsDomains()) + ", hybridApp=" + getHybridApp() + ", fileDomainCookies=" + getFileDomainCookies() + ", debugLogLevel=" + getDebugLogLevel() + ", autoStart=" + getAutoStart() + ", userOptIn=" + getUserOptIn() + ", startupLoadBalancing=" + getStartupLoadBalancing() + ", startupWithGrailEnabled=" + getStartupWithGrailEnabled() + ", instrumentationFlavor=" + getInstrumentationFlavor() + ", sessionReplayComponentProvider=" + getSessionReplayComponentProvider() + ", isRageTapDetectionEnabled=" + isRageTapDetectionEnabled() + ", eventThrottlingLimit=" + getEventThrottlingLimit() + '}';
    }
}
