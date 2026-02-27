package mx_com.mixpanel.android.mpmetrics;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import mx_com.mixpanel.android.util.MPLog;

/* JADX INFO: loaded from: classes7.dex */
class SystemInformation {
    private static final String LOGTAG = "MixpanelAPI.SysInfo";
    private static SystemInformation sInstance;
    private static final Object sInstanceLock = new Object();
    private final String mAppName;
    private final Integer mAppVersionCode;
    private final String mAppVersionName;
    private final Context mContext;
    private final DisplayMetrics mDisplayMetrics;
    private final Boolean mHasNFC;
    private final Boolean mHasTelephony;

    static SystemInformation getInstance(Context context) {
        synchronized (sInstanceLock) {
            if (sInstance == null) {
                sInstance = new SystemInformation(context.getApplicationContext());
            }
        }
        return sInstance;
    }

    private SystemInformation(Context context) {
        String str;
        Integer numValueOf;
        String string;
        Method method;
        Boolean bool;
        Boolean bool2;
        this.mContext = context;
        PackageManager packageManager = context.getPackageManager();
        Boolean bool3 = null;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                numValueOf = Integer.valueOf(packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                MPLog.w(LOGTAG, "System information constructed with a context that apparently doesn't exist.");
                numValueOf = null;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str = null;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        this.mAppVersionName = str;
        this.mAppVersionCode = numValueOf;
        if (i == 0) {
            string = applicationInfo.nonLocalizedLabel == null ? "Misc" : applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = context.getString(i);
        }
        this.mAppName = string;
        try {
            method = packageManager.getClass().getMethod("hasSystemFeature", String.class);
        } catch (NoSuchMethodException unused3) {
            method = null;
        }
        if (method != null) {
            try {
                bool = (Boolean) method.invoke(packageManager, "android.hardware.nfc");
                try {
                    bool2 = (Boolean) method.invoke(packageManager, "android.hardware.telephony");
                } catch (IllegalAccessException unused4) {
                    MPLog.w(LOGTAG, "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
                    bool2 = null;
                } catch (InvocationTargetException unused5) {
                    MPLog.w(LOGTAG, "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
                    bool2 = null;
                }
            } catch (IllegalAccessException unused6) {
                bool = null;
            } catch (InvocationTargetException unused7) {
                bool = null;
            }
            bool3 = bool;
        } else {
            bool2 = null;
        }
        this.mHasNFC = bool3;
        this.mHasTelephony = bool2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mDisplayMetrics = displayMetrics;
        ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public String getAppVersionName() {
        return this.mAppVersionName;
    }

    public Integer getAppVersionCode() {
        return this.mAppVersionCode;
    }

    public String getAppName() {
        return this.mAppName;
    }

    public boolean hasNFC() {
        return this.mHasNFC.booleanValue();
    }

    public boolean hasTelephony() {
        return this.mHasTelephony.booleanValue();
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.mDisplayMetrics;
    }

    public String getCurrentNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    public Boolean isWifiConnected() {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        return Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected());
    }

    public Boolean isBluetoothEnabled() {
        BluetoothAdapter defaultAdapter;
        try {
            if (this.mContext.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.mContext.getPackageName()) != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return null;
            }
            return Boolean.valueOf(defaultAdapter.isEnabled());
        } catch (Exception unused) {
            return null;
        }
    }

    public String getBluetoothVersion() {
        return (Build.VERSION.SDK_INT < 18 || !this.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) ? this.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? "classic" : "none" : "ble";
    }
}
