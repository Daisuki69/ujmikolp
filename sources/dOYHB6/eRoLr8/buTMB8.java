package dOYHB6.eRoLr8;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.media.MediaRouter;
import android.view.Display;
import dOYHB6.ewaEX1;
import dOYHB6.fVtPr9.f2Ela7;
import dOYHB6.krwAC8.slgMP8;
import dOYHB6.nm8AQ4;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.lang.reflect.Field;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class buTMB8 {
    private static boolean isAccessibilityChecksEnabled = false;
    private static boolean isDisplaysChecksEnabled = false;

    public static void init(Activity activity) {
        isAccessibilityChecksEnabled = qOnQ39.getBool(numX49.tnTj78("bHT2"), false);
        isDisplaysChecksEnabled = qOnQ39.getBool(numX49.tnTj78("bHTL"), false);
        xvvqS9 xvvqs9 = new xvvqS9();
        MediaRouter mediaRouter = (MediaRouter) activity.getSystemService(numX49.tnTj78("bHTr"));
        if (mediaRouter == null) {
            pg7W80();
        } else {
            mediaRouter.addCallback(2, xvvqs9, 2);
            pg7W80();
        }
    }

    private static boolean joFtz8(String str) {
        return !fChUQ4.jPliG6(str);
    }

    public static void pg7W80() {
        wHSa32();
    }

    private static String rMurz6(Display display) {
        if (display.getDisplayId() == 0) {
            return null;
        }
        try {
            Field fieldZYg5T4 = f2Ela7.zYg5T4(display.getClass(), "mOwnerPackageName");
            fieldZYg5T4.setAccessible(true);
            String str = (String) fieldZYg5T4.get(display);
            fieldZYg5T4.setAccessible(false);
            if (str != null) {
                return str;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    private static String sfdHf8(String str) {
        String str2 = str.split(numX49.tnTj78("bHTP"))[0];
        PackageManager packageManager = nm8AQ4.get().getPackageManager();
        try {
            return (String) packageManager.getApplicationLabel(ewaEX1.zeCO79() ? packageManager.getApplicationInfo(str2, PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(str2, 128));
        } catch (PackageManager.NameNotFoundException e) {
            return numX49.tnTj78("bHTb");
        }
    }

    static void wHSa32() {
        Display next;
        String strRMurz6;
        Iterator<Display> it = slgMP8.tFp7P6().iterator();
        while (it.hasNext() && (strRMurz6 = rMurz6((next = it.next()))) != null && !strRMurz6.isEmpty()) {
            if (joFtz8(strRMurz6.toLowerCase())) {
                fChUQ4.zJGTn5(numX49.tnTj78("bHTu"), numX49.tnTj78("bHTZ"), strRMurz6, numX49.tnTj78("bHTk"), next.getName(), numX49.tnTj78("bHTB"), sfdHf8(strRMurz6));
            }
        }
    }
}
