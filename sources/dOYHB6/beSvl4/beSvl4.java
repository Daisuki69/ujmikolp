package dOYHB6.beSvl4;

import android.content.Context;
import android.content.pm.PackageManager;
import dOYHB6.speLp8.fChUQ4;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class beSvl4 {
    static boolean eventSent = false;

    public static void y2baC5(Context context) {
        if (eventSent) {
            return;
        }
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0) {
                eventSent = true;
                fChUQ4.zJGTn5("47f7e8ea1623a0849be22f7f0c891aa5", Constants.REASON, "Debuggble");
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
