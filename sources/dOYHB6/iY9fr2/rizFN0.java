package dOYHB6.iY9fr2;

import android.app.Activity;
import android.os.Build;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class rizFN0 {
    private static String activityName;
    private static final Activity.ScreenCaptureCallback screenCaptureCallback = awNBu8();

    private static Activity.ScreenCaptureCallback awNBu8() {
        if (Build.VERSION.SDK_INT < 34) {
            return null;
        }
        return new Activity.ScreenCaptureCallback() { // from class: dOYHB6.iY9fr2.rizFN0.1
            @Override // android.app.Activity.ScreenCaptureCallback
            public void onScreenCaptured() {
                fChUQ4.zJGTn5(numX49.tnTj78("bFSL"), numX49.tnTj78("bFSP"), numX49.tnTj78("bFSb"), numX49.tnTj78("bFS2"), rizFN0.activityName);
            }
        };
    }

    private static void gqlOk2(String str) {
        activityName = str;
    }

    public static void mcsfG1(Activity activity, boolean z4) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        String string = activity.getClass().toString();
        if (z4) {
            register(activity, activity.getMainExecutor(), string);
        } else {
            unregister(activity);
        }
    }

    private static void register(Activity activity, Executor executor, String str) {
        gqlOk2(str);
        try {
            activity.registerScreenCaptureCallback(executor, screenCaptureCallback);
        } catch (RuntimeException e) {
        }
    }

    private static void unregister(Activity activity) {
        try {
            activity.unregisterScreenCaptureCallback(screenCaptureCallback);
        } catch (RuntimeException e) {
        }
    }
}
