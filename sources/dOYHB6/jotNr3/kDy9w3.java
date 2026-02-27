package dOYHB6.jotNr3;

import android.media.AudioManager;
import android.os.Build;
import dOYHB6.nm8AQ4;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.uXNAP0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class kDy9w3 {
    private static boolean recentlyDetected = false;
    private static boolean recentlyLaunched = true;

    public static void euJFi4() {
        int mode = ((AudioManager) nm8AQ4.get().getSystemService(numX49.tnTj78("bHpP"))).getMode();
        boolean zY47Sb3 = y47Sb3(mode);
        boolean zLCNBo5 = lCNBo5(mode);
        String strTnTj78 = numX49.tnTj78("bHpb");
        if (!zY47Sb3 && !zLCNBo5) {
            if (recentlyDetected) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(strTnTj78);
                arrayList.add(numX49.tnTj78("bHp2"));
                fChUQ4.zJGTn5(numX49.tnTj78("bHpL"), (String[]) arrayList.toArray(new String[0]));
                recentlyDetected = false;
            }
            recentlyLaunched = false;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(strTnTj78);
        String strTnTj782 = numX49.tnTj78("bHpr");
        arrayList2.add(strTnTj782);
        arrayList2.add(numX49.tnTj78("bHpZ"));
        arrayList2.add(uXNAP0.bool(zLCNBo5));
        arrayList2.add(numX49.tnTj78("bHpk"));
        arrayList2.add(uXNAP0.bool(recentlyLaunched));
        arrayList2.add(numX49.tnTj78("bHpB"));
        arrayList2.add(strTnTj782);
        fChUQ4.zJGTn5(numX49.tnTj78("bHpu"), (String[]) arrayList2.toArray(new String[0]));
        recentlyDetected = true;
    }

    private static boolean lCNBo5(int i) {
        if (i == 3) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 33 && i == 6;
    }

    private static boolean y47Sb3(int i) {
        if (i == 2) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 4) {
            return Build.VERSION.SDK_INT >= 33 && i == 5;
        }
        return true;
    }
}
