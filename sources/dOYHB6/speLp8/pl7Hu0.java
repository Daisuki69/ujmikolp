package dOYHB6.speLp8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import dOYHB6.led5D4.ouslB5;
import dOYHB6.nm8AQ4;
import dOYHB6.yFtIp6.xK2AO1;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class pl7Hu0 {
    private static boolean dynamicInitDone = false;

    public static void eaXH36(Context context) {
        if (dynamicInitDone) {
            return;
        }
        dynamicInitDone = true;
        if (ilLni8.nuNd54()) {
            return;
        }
        fChUQ4.yp1491();
        nm8AQ4.set(context.getApplicationContext());
        fChUQ4.xzUL35(context);
        uDje24(context);
    }

    static String[] scb4T0() {
        List<ApplicationInfo> installedApplications = nm8AQ4.get().getPackageManager().getInstalledApplications(128);
        if (installedApplications == null) {
            return null;
        }
        String[] strArr = new String[installedApplications.size()];
        for (int i = 0; i < installedApplications.size(); i++) {
            strArr[i] = installedApplications.get(i).packageName;
        }
        return strArr;
    }

    private static void uDje24(Context context) {
        String[] strArrScb4T0 = scb4T0();
        if (strArrScb4T0 != null) {
            fChUQ4.wFT4i7(strArrScb4T0);
        }
        ouslB5.dbVPJ7(context);
        xK2AO1.register(context);
    }
}
