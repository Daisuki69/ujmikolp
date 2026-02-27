package dOYHB6.speLp8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import dOYHB6.nm8AQ4;

/* JADX INFO: loaded from: classes6.dex */
public class yxLdc6 {
    private static boolean shouldFinishActivities = false;
    private static int currentActivitiesCount = 0;
    private static final Object activitiesCountLock = new Object();

    public static void kwxel7() {
        synchronized (activitiesCountLock) {
            if (currentActivitiesCount <= 1) {
                Process.killProcess(Process.myPid());
            }
        }
    }

    public static void onActivityCreate() {
        synchronized (activitiesCountLock) {
            currentActivitiesCount++;
        }
    }

    public static void onActivityDestroy() {
        synchronized (activitiesCountLock) {
            currentActivitiesCount--;
        }
    }

    private static void poJjb7() {
        synchronized (activitiesCountLock) {
            shouldFinishActivities = true;
        }
    }

    private static void q6Lc15() {
        Context context = nm8AQ4.get();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.setFlags(335577088);
        context.startActivity(launchIntentForPackage);
        Process.killProcess(Process.myPid());
    }

    public static void rmvdY2(Activity activity, Boolean bool) {
        poJjb7();
        zlxIP6(activity);
        fChUQ4.hmpKj2();
        if (bool.booleanValue()) {
            q6Lc15();
        } else {
            kwxel7();
        }
    }

    public static void uF9GR1(Activity activity) {
        synchronized (activitiesCountLock) {
            if (shouldFinishActivities) {
                zlxIP6(activity);
                kwxel7();
            }
        }
    }

    private static void zlxIP6(Activity activity) {
        if (activity != null) {
            activity.setResult(0);
            activity.finishAndRemoveTask();
        }
    }
}
