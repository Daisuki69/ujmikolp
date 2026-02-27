package com.dynatrace.android.agent;

import We.s;
import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.android.agent.comm.MonitoringDataPacket;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;
import com.dynatrace.android.agent.crash.CrashCatcher;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.metrics.ConnectionType;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class BasicSegment {
    private static final String CRASH_REP_LEVEL_CONFIRMED = "2";
    private static final String CRASH_REP_LEVEL_DISCONFIRMED = "1";
    private static final String CRASH_REP_LEVEL_OFF = "0";
    private static final String DEV_GENUINE = "g";
    private static final String DEV_ORIENT_L = "l";
    private static final String DEV_ORIENT_P = "p";
    private static final String DEV_ROOTED = "r";
    private static final int MAX_VERSION_NAME_LENGTH = 50;
    private static final long OCUPDT_STALE = 6000;
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "BasicSegment");
    private final InstrumentationFlavor instrumentationFlavor;
    protected AndroidMetrics metrics = AndroidMetrics.getInstance();

    public static class UpdatableDataGenerator {
        public String generateUpdatableData(long j, int i, String str) {
            StringBuilder sbS = androidx.camera.core.impl.a.s(j, SegmentConstants.B_TV, "&tx=__tsNow__&mp=");
            if (i < 0) {
                i = 1;
            }
            sbS.append(i);
            if (str != null) {
                sbS.append("&sr=");
                sbS.append(str);
            }
            return sbS.toString();
        }
    }

    public BasicSegment(InstrumentationFlavor instrumentationFlavor) {
        this.instrumentationFlavor = instrumentationFlavor;
    }

    public static boolean addNewVisitorInfoToDataChunk(MonitoringDataPacket monitoringDataPacket) {
        Iterator<String> it = monitoringDataPacket.events.iterator();
        while (it.hasNext()) {
            if (it.next().contains("&pa=0")) {
                monitoringDataPacket.basicData = s.p(new StringBuilder(), monitoringDataPacket.basicData, "&nu=1");
                return true;
            }
        }
        return false;
    }

    private String determineCrashReportingLevel(UserPrivacyOptions userPrivacyOptions) {
        return !CrashCatcher.registered ? "0" : userPrivacyOptions.isCrashReportingOptedIn() ? "2" : "1";
    }

    public StringBuilder createEventData(Session session) {
        StringBuilder sb2 = new StringBuilder();
        ScreenMetrics screenMetrics = this.metrics.getScreenMetrics();
        sb2.append("vv=3&va=");
        sb2.append(Version.getFullVersion());
        sb2.append("&ap=");
        sb2.append(AdkSettings.appIdEncoded);
        sb2.append("&an=");
        sb2.append(Utility.urlEncode(AdkSettings.applName));
        sb2.append("&ai=");
        sb2.append(Utility.urlEncode(AdkSettings.applIdentifier));
        AppVersion appVersion = this.metrics.getAppVersion();
        if (appVersion == null) {
            sb2.append("&vb=0");
        } else {
            sb2.append("&vb=");
            sb2.append(appVersion.getVersionCode());
            if (appVersion.getVersionName() != null) {
                String strTruncateString = Utility.truncateString(appVersion.getVersionName(), 50);
                sb2.append("&vn=");
                sb2.append(Utility.urlEncode(strTruncateString));
            }
        }
        sb2.append("&vi=");
        sb2.append(session.visitorId);
        sb2.append("&sn=");
        sb2.append(session.sessionId);
        sb2.append("&ss=");
        sb2.append(session.sequenceNumber);
        sb2.append("&rm=");
        sb2.append(this.metrics.deviceMemorySize.intValue());
        sb2.append("&cp=");
        sb2.append(Utility.urlEncode(this.metrics.cpuInformation));
        sb2.append("&os=");
        sb2.append(Utility.urlEncode(this.metrics.operatingSystem));
        sb2.append("&mf=");
        String str = this.metrics.manufacturer;
        if (str == null) {
            str = "unknown";
        }
        sb2.append(Utility.urlEncode(Utility.truncateString(str, 250)));
        sb2.append("&md=");
        sb2.append(Utility.urlEncode(this.metrics.modelId));
        sb2.append("&rj=");
        sb2.append(this.metrics.deviceRooted ? DEV_ROOTED : DEV_GENUINE);
        sb2.append("&ul=");
        sb2.append(this.metrics.userLang);
        if (screenMetrics != null) {
            if (screenMetrics.getScreenWidth() > screenMetrics.getScreenHeight()) {
                sb2.append("&sw=");
                sb2.append(screenMetrics.getScreenHeight());
                sb2.append("&sh=");
                sb2.append(screenMetrics.getScreenWidth());
            } else {
                sb2.append("&sw=");
                sb2.append(screenMetrics.getScreenWidth());
                sb2.append("&sh=");
                sb2.append(screenMetrics.getScreenHeight());
            }
            sb2.append("&sd=");
            sb2.append(screenMetrics.getScreenDensityDpi());
        }
        sb2.append("&pt=0");
        int i = this.metrics.deviceOrientation;
        String str2 = i == 2 ? "l" : i == 1 ? "p" : null;
        if (str2 != null) {
            sb2.append("&so=");
            sb2.append(str2);
        }
        if (this.metrics.batteryLevel >= 0) {
            sb2.append("&bl=");
            sb2.append(this.metrics.batteryLevel);
        }
        if (this.metrics.deviceMemoryFree != null) {
            sb2.append("&fm=");
            sb2.append(this.metrics.deviceMemoryFree.intValue());
        }
        if (this.metrics.deviceCarrier != null) {
            sb2.append("&cr=");
            sb2.append(Utility.urlEncode(this.metrics.deviceCarrier));
        }
        if (this.metrics.connectionType != ConnectionType.OTHER) {
            sb2.append("&ct=");
            sb2.append(this.metrics.connectionType.getProtocolValue());
            String str3 = this.metrics.networkProtocol;
            if (str3 != null && str3.length() > 0) {
                sb2.append("&np=");
                sb2.append(Utility.urlEncode(this.metrics.networkProtocol));
            }
        }
        PrivacyRules privacyRules = session.getPrivacyRules();
        if (this.metrics.mockDeviceLocation != null && privacyRules.allowLocationReporting()) {
            String str4 = String.format(Locale.US, "%3.3fx%3.3f", Double.valueOf(this.metrics.mockDeviceLocation.getLatitude()), Double.valueOf(this.metrics.mockDeviceLocation.getLongitude()));
            sb2.append("&lx=");
            sb2.append(Utility.urlEncode(str4));
        }
        sb2.append("&tt=maandroid&dl=");
        sb2.append(privacyRules.getPrivacySettings().getDataCollectionLevel().ordinal());
        sb2.append("&cl=");
        sb2.append(determineCrashReportingLevel(privacyRules.getPrivacySettings()));
        sb2.append("&fv=");
        sb2.append(this.instrumentationFlavor.getProtocolValue());
        return sb2;
    }

    public void update(boolean z4) {
        if (z4) {
            this.metrics.updateBasicMetrics();
        }
        if (this.metrics.getCommonMetricsAge() <= 6000) {
            return;
        }
        this.metrics.updateCommonMetrics();
    }
}
