package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes2.dex */
final class AFa1kSDK {

    public static final class AFa1wSDK {
        static final AFa1kSDK AFInAppEventParameterName = new AFa1kSDK();
    }

    public static final class AFa1zSDK {
        final String AFInAppEventParameterName;
        final String valueOf;
        final String values;

        public AFa1zSDK(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.values = str;
            this.AFInAppEventParameterName = str2;
            this.valueOf = str3;
        }
    }

    public static AFa1zSDK AFInAppEventType(@NonNull Context context) {
        String str;
        String simOperatorName;
        String str2 = "unknown";
        String networkOperatorName = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (!values(networkInfo)) {
                        i++;
                    } else if (1 == networkInfo.getType()) {
                        str2 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str2 = "MOBILE";
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            simOperatorName = telephonyManager.getSimOperatorName();
            try {
                networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (networkOperatorName == null || networkOperatorName.isEmpty()) {
                    if (2 == telephonyManager.getPhoneType()) {
                        networkOperatorName = "CDMA";
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str = networkOperatorName;
                networkOperatorName = simOperatorName;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                String str3 = str;
                simOperatorName = networkOperatorName;
                networkOperatorName = str3;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
        return new AFa1zSDK(str2, networkOperatorName, simOperatorName);
    }

    private static boolean values(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }
}
