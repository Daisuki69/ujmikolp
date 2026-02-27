package com.dynatrace.android.agent.metrics;

import We.s;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Display;
import com.dynatrace.agent.di.CoreComponent;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.agent.util.RootDetector;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.util.SdkVersionProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.ActivityScreenMetricsCollector;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidMetrics {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "AndroidMetrics");
    private static volatile AndroidMetrics theInstance = null;
    private AppVersion appVersion;
    private final AppVersionTracker appVersionTracker;
    private final BatteryTracker batteryTracker;
    private final Context context;
    public String cpuInformation;
    private String currentActivityName;
    public String deviceCarrier;
    public Integer deviceMemoryFree;
    public Integer deviceMemorySize;
    public boolean deviceRooted;
    public String manufacturer;
    public String modelId;
    public String operatingSystem;
    public String osVersion;
    TimeLineProvider timeLineProvider;
    public String userLang;
    public volatile ConnectionType connectionType = ConnectionType.OFFLINE;
    public String networkProtocol = null;
    public int deviceOrientation = 0;
    public int batteryLevel = Integer.MIN_VALUE;
    public Location mockDeviceLocation = null;
    ScreenMetrics screenMetrics = null;
    private long commonMetricsTimestamp = 0;

    /* JADX INFO: renamed from: com.dynatrace.android.agent.metrics.AndroidMetrics$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            $SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType = iArr;
            try {
                iArr[ConnectionType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType[ConnectionType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType[ConnectionType.LAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AndroidMetrics(Context context) {
        this.context = context;
        if (context == null) {
            this.appVersionTracker = null;
            this.batteryTracker = null;
        } else {
            this.appVersionTracker = new AppVersionTracker(context, new SdkVersionProviderImpl());
            this.batteryTracker = BatteryTracker.generateBatteryTracker(context);
        }
        this.timeLineProvider = TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER;
    }

    public static String formatUserLanguage(Locale locale) {
        String language = locale.getLanguage();
        if (locale.getCountry().length() <= 0) {
            return language;
        }
        StringBuilder sbV = s.v(language, Global.UNDERSCORE);
        sbV.append(locale.getCountry());
        return sbV.toString();
    }

    private ActivityManager getActivityMgr() {
        try {
            return (ActivityManager) this.context.getSystemService("activity");
        } catch (Exception e) {
            if (!Global.DEBUG) {
                return null;
            }
            Utility.zlogW(LOGTAG, e.toString());
            return null;
        }
    }

    public static AndroidMetrics getInstance() {
        if (theInstance == null) {
            synchronized (AndroidMetrics.class) {
                try {
                    if (theInstance == null) {
                        theInstance = new AndroidMetrics(AdkSettings.getInstance().getContext());
                        theInstance.init();
                    }
                } finally {
                }
            }
        }
        return theInstance;
    }

    private String getMobileNetworkProtocol(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            case 20:
                return "5G";
            default:
                return networkInfo.getSubtypeName();
        }
    }

    private NetworkInfo getNetworkInfo() {
        Context context = this.context;
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            if (!Global.DEBUG) {
                return null;
            }
            Utility.zlogW(LOGTAG, e.toString());
            return null;
        }
    }

    private void init() throws Throwable {
        this.manufacturer = Build.MANUFACTURER;
        Context context = this.context;
        this.deviceRooted = context != null && RootDetector.INSTANCE.isDeviceRooted(context);
        this.osVersion = Build.VERSION.RELEASE;
        this.operatingSystem = "Android " + this.osVersion;
        this.cpuInformation = Utility.getCPUInfo();
        this.modelId = Build.MODEL;
        this.userLang = formatUserLanguage(Locale.getDefault());
        updateVerboseMetrics();
        updateBasicMetrics();
        updateCommonMetrics();
        ScreenMetrics initialScreenMetrics = getInitialScreenMetrics();
        this.screenMetrics = initialScreenMetrics;
        setInitialScreenMetricsIn3rdGen(initialScreenMetrics);
    }

    private void setInitialScreenMetricsIn3rdGen(ScreenMetrics screenMetrics) {
        CoreComponent holder = CoreComponent.Holder.getInstance();
        if (holder != null) {
            holder.getMetricsRepository().updateScreenMetrics(screenMetrics);
        }
    }

    private void updateBatteryStrength() {
        BatteryTracker batteryTracker = this.batteryTracker;
        if (batteryTracker != null) {
            this.batteryLevel = batteryTracker.captureBatteryLevel();
        }
    }

    private void updateCarrier() {
        Context context = this.context;
        if (context == null) {
            return;
        }
        this.deviceCarrier = null;
        try {
            String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            if (networkOperatorName != null) {
                this.deviceCarrier = Utility.truncateString(networkOperatorName, 250);
            }
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogW(LOGTAG, e.toString());
            }
        }
    }

    private void updateConnInfo() {
        NetworkInfo networkInfo = getNetworkInfo();
        this.connectionType = getConnType(networkInfo);
        int i = AnonymousClass1.$SwitchMap$com$dynatrace$android$agent$metrics$ConnectionType[this.connectionType.ordinal()];
        if (i == 1) {
            this.networkProtocol = "802.11x";
            return;
        }
        if (i == 2) {
            this.networkProtocol = getMobileNetworkProtocol(networkInfo);
        } else if (i != 3) {
            this.networkProtocol = null;
        } else {
            this.networkProtocol = "Ethernet";
        }
    }

    private void updateDeviceOrientation() {
        Context context = this.context;
        if (context != null) {
            this.deviceOrientation = context.getResources().getConfiguration().orientation;
        }
    }

    private void updateMemoryInfo() {
        ActivityManager activityMgr = getActivityMgr();
        if (activityMgr == null) {
            this.deviceMemoryFree = null;
            return;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityMgr.getMemoryInfo(memoryInfo);
        this.deviceMemoryFree = Integer.valueOf((int) (memoryInfo.availMem / 1048576));
    }

    public AppVersion getAppVersion() {
        return this.appVersion;
    }

    public long getCommonMetricsAge() {
        return this.timeLineProvider.now() - this.commonMetricsTimestamp;
    }

    public ConnectionType getConnType() {
        return getConnType(getNetworkInfo());
    }

    public String getCurrentActivityName() {
        return this.currentActivityName;
    }

    public ScreenMetrics getInitialScreenMetrics() {
        Context context = this.context;
        if (context == null) {
            return null;
        }
        Display display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
        if (display != null) {
            return ActivityScreenMetricsCollector.calculateMetrics(display, this.deviceOrientation);
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Could not find a default Display");
        }
        return null;
    }

    public ScreenMetrics getScreenMetrics() {
        return this.screenMetrics;
    }

    public boolean isNetworkAvailable() {
        NetworkInfo networkInfo = getNetworkInfo();
        boolean z4 = networkInfo != null && (networkInfo.isAvailable() || networkInfo.isConnected());
        if (!z4 && Global.DEBUG) {
            Utility.zlogI(LOGTAG, "Network connection is not available");
        }
        return z4;
    }

    public boolean screenMetricsAreValid(ScreenMetrics screenMetrics) {
        return screenMetrics != null && screenMetrics.getScreenHeight() > 0 && screenMetrics.getScreenWidth() > 0 && screenMetrics.getScreenDensityDpi() > 0 && screenMetrics.getScreenDensityFactor() != Float.POSITIVE_INFINITY && screenMetrics.getScreenDensityFactor() > 0.0f;
    }

    public void setAppVersion(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    public void setCurrentActivityName(String str) {
        this.currentActivityName = str;
    }

    public void setGpsLocation(Location location) {
        this.mockDeviceLocation = location;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "GPS/Network getLastKnownLocation mockDeviceLocation:" + this.mockDeviceLocation);
        }
    }

    public void updateBasicMetrics() {
        Long lValueOf = Global.DEBUG ? Long.valueOf(this.timeLineProvider.now()) : 0L;
        updateCarrier();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Basic metrics updated in " + (this.timeLineProvider.now() - lValueOf.longValue()) + " ms");
        }
    }

    public void updateCommonMetrics() {
        Long lValueOf = Global.DEBUG ? Long.valueOf(this.timeLineProvider.now()) : 0L;
        updateConnInfo();
        updateDeviceOrientation();
        updateBatteryStrength();
        updateMemoryInfo();
        AppVersionTracker appVersionTracker = this.appVersionTracker;
        if (appVersionTracker != null) {
            AppVersion appVersionDetermineAppVersion = appVersionTracker.determineAppVersion();
            if (appVersionDetermineAppVersion.getVersionCode() < 1 || appVersionDetermineAppVersion.getVersionName() == null) {
                this.appVersion = null;
            } else {
                this.appVersion = appVersionDetermineAppVersion;
            }
        }
        long jNow = this.timeLineProvider.now();
        this.commonMetricsTimestamp = jNow;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Common metrics updated in " + (jNow - lValueOf.longValue()) + " ms");
        }
    }

    public void updateScreenMetrics(ScreenMetrics screenMetrics) {
        if (screenMetricsAreValid(screenMetrics)) {
            this.screenMetrics = screenMetrics;
        } else {
            if (Global.DEBUG) {
                Utility.zlogW(LOGTAG, "Rejecting invalid screen metrics: " + screenMetrics);
            }
            this.screenMetrics = null;
        }
        updateDeviceOrientation();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[PHI: r2 r3
  0x0058: PHI (r2v15 'e' java.io.IOException) = (r2v14 'e' java.io.IOException), (r2v22 'e' java.io.IOException) binds: [B:50:0x0096, B:21:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r3v6 int) = (r3v5 int), (r3v10 int) binds: [B:50:0x0096, B:21:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateVerboseMetrics() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.metrics.AndroidMetrics.updateVerboseMetrics():void");
    }

    public ConnectionType getConnType(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable() || !networkInfo.isConnected()) {
            return ConnectionType.OFFLINE;
        }
        switch (networkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return ConnectionType.MOBILE;
            case 1:
            case 13:
                return ConnectionType.WIFI;
            case 6:
            case 7:
            case 8:
            default:
                return ConnectionType.OTHER;
            case 9:
                return ConnectionType.LAN;
        }
    }
}
