package dOYHB6.d3Lw18;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import dOYHB6.nm8AQ4;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes6.dex */
public class uwFGA2 {
    private static String mLastProxy = null;

    private static String amS0s9() {
        ProxyInfo defaultProxy;
        ConnectivityManager connectivityManager = (ConnectivityManager) nm8AQ4.get().getSystemService(numX49.tnTj78("bHGP"));
        if (connectivityManager == null || (defaultProxy = connectivityManager.getDefaultProxy()) == null) {
            return null;
        }
        return defaultProxy.getHost() + numX49.tnTj78("bHGb") + defaultProxy.getPort();
    }

    public static void init() {
        qmgVg4();
        vGqcm3();
    }

    public static void qmgVg4() {
        String strAmS0s9 = amS0s9();
        if (strAmS0s9 != null) {
            mLastProxy = strAmS0s9;
            fChUQ4.jdZIh9(strAmS0s9);
        } else if (mLastProxy != null) {
            mLastProxy = null;
            fChUQ4.iP65S1();
        }
    }

    private static void vGqcm3() {
        nm8AQ4.get().registerReceiver(new BroadcastReceiver() { // from class: dOYHB6.d3Lw18.uwFGA2.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                uwFGA2.qmgVg4();
            }
        }, new IntentFilter(numX49.tnTj78("bHG2")));
    }
}
