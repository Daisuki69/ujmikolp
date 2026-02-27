package dOYHB6.speLp8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import dOYHB6.beSvl4.beSvl4;
import dOYHB6.bgtm94.bgtm94;
import dOYHB6.eRoLr8.buTMB8;
import dOYHB6.ewaEX1;
import dOYHB6.iY9fr2.bnpAj5;
import dOYHB6.iY9fr2.mrTaD6;
import dOYHB6.iY9fr2.rizFN0;
import dOYHB6.lBzGT9.i5fG65;
import dOYHB6.lI6F16.x065T0;
import dOYHB6.lPFdA1;
import dOYHB6.nm8AQ4;
import dOYHB6.oCnbV3.d3TV41;
import dOYHB6.oNEjN0.grdhp4;
import dOYHB6.oyJjL8;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.iYyaV5;
import dOYHB6.yFtIp6.v3Z7h2;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
public class iKNpI8 {
    private static final int MAX_QUEUED_TOASTS = 20;
    private static final int TOAST_DURATION_MILLI = 4000;
    private static boolean isExitingAfterToast;
    private static boolean isFirstOnResumeOfActivity;
    private static Activity sCurrentActivity;
    private static final Stack<Toast> toastStack;
    private static hl5Bx6 waitedMessage;

    private static class hl5Bx6 {
        String localeKey;
        String messageSuffix;
        String msg;
        boolean notifyViaUrl;
        boolean restart;
        String shortMsg;
        boolean shouldExit;
        String urlToOpen;

        hl5Bx6(hl5Bx6 hl5bx6) {
            this(hl5bx6.msg, hl5bx6.shortMsg, hl5bx6.shouldExit, hl5bx6.restart, hl5bx6.notifyViaUrl, hl5bx6.urlToOpen, hl5bx6.localeKey, hl5bx6.messageSuffix);
        }

        hl5Bx6(String str, String str2, boolean z4, boolean z5, boolean z8, String str3, String str4, String str5) {
            this.msg = str;
            this.shortMsg = str2;
            this.shouldExit = z4;
            this.restart = z5;
            this.notifyViaUrl = z8;
            this.urlToOpen = str3;
            this.localeKey = str4;
            this.messageSuffix = str5;
        }
    }

    static {
        nm8AQ4.syG0J1(new oyJjL8() { // from class: dOYHB6.speLp8.iKNpI8.1
            @Override // dOYHB6.oyJjL8
            public void onContextSet() {
                synchronized (iKNpI8.class) {
                    if (iKNpI8.waitedMessage != null) {
                        iKNpI8.showPopup(iKNpI8.waitedMessage.msg, iKNpI8.waitedMessage.shortMsg, iKNpI8.waitedMessage.shouldExit, iKNpI8.waitedMessage.restart, iKNpI8.waitedMessage.notifyViaUrl, iKNpI8.waitedMessage.urlToOpen, iKNpI8.waitedMessage.localeKey, iKNpI8.waitedMessage.messageSuffix);
                    }
                }
            }
        });
        waitedMessage = null;
        isExitingAfterToast = false;
        sCurrentActivity = null;
        toastStack = new Stack<>();
        isFirstOnResumeOfActivity = true;
    }

    private static String bAS9Q3() {
        return numX49.tnTj78("bFZP");
    }

    public static void dHTW22(Activity activity) {
        Activity activity2;
        synchronized (iKNpI8.class) {
            activity2 = sCurrentActivity;
            sCurrentActivity = activity;
        }
        if (activity2 != null || activity == null) {
            return;
        }
        fChUQ4.dHTW22();
        d3TV41.tqJ2n8();
        ewaEX1.vma4u7();
        buTMB8.init(activity);
        grdhp4.init();
        bgtm94.init();
        i5fG65.svwdc1(activity);
    }

    public static void fBndJ9(Activity activity) {
        fChUQ4.onUserInteraction();
    }

    public static void gRLNd5(Activity activity) {
        if (isExitingAfterToast) {
            yxLdc6.kwxel7();
        }
        yxLdc6.onActivityDestroy();
    }

    public static String getDisplayName() {
        Intent launchIntentForPackage;
        CharSequence charSequenceLoadLabel;
        ApplicationInfo applicationInfo = nm8AQ4.get().getApplicationInfo();
        int i = applicationInfo.labelRes;
        Context context = nm8AQ4.get();
        if (i != 0 || applicationInfo.nonLocalizedLabel != null) {
            return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
        }
        try {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (launchIntentForPackage != null && (charSequenceLoadLabel = context.getPackageManager().resolveActivity(launchIntentForPackage, 65536).activityInfo.loadLabel(context.getPackageManager())) != null) {
            return charSequenceLoadLabel.toString();
        }
        CharSequence charSequenceLoadLabel2 = context.getPackageManager().getActivityInfo(jqldq5().getComponentName(), 128).loadLabel(context.getPackageManager());
        if (charSequenceLoadLabel2 != null) {
            return charSequenceLoadLabel2.toString();
        }
        CharSequence title = jqldq5().getTitle();
        return title != null ? title.toString() : numX49.tnTj78("bFZb");
    }

    public static void jG8Sm1(Activity activity) {
        fChUQ4.y5dJh4();
    }

    public static Activity jqldq5() {
        return sCurrentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Toast o8ilk3(hl5Bx6 hl5bx6) {
        boolean z4;
        String[] localizedMessage;
        if (nm8AQ4.get() == null) {
            return null;
        }
        String str = hl5bx6.msg;
        String str2 = hl5bx6.shortMsg;
        if (!lPFdA1.isNullOrEmpty(hl5bx6.localeKey) && (localizedMessage = iYyaV5.getLocalizedMessage(nm8AQ4.get(), hl5bx6.localeKey)) != null) {
            String str3 = localizedMessage[0];
            String str4 = localizedMessage[1];
            if (!lPFdA1.isNullOrEmpty(str3)) {
                str = str3;
            }
            if (!lPFdA1.isNullOrEmpty(str4) && !lPFdA1.isNullOrEmpty(str2)) {
                str2 = str4;
            }
        }
        boolean bool = qOnQ39.getBool(numX49.tnTj78("bFZL"), false);
        if (Build.VERSION.SDK_INT < 31) {
            bool = true;
            z4 = false;
        } else if (lPFdA1.isNullOrEmpty(str2)) {
            z4 = false;
        } else {
            bool = true;
            z4 = true;
        }
        String strTnTj78 = numX49.tnTj78("bFZr");
        Toast toastXw9V08 = v3Z7h2.xw9V08(nm8AQ4.get(), (z4 ? qOnQ39.getBool(numX49.tnTj78("bFZZ"), false) ? String.format(strTnTj78, str2, hl5bx6.messageSuffix) : String.format(numX49.tnTj78("bFZk"), hl5bx6.messageSuffix, str2) : String.format(strTnTj78, str, hl5bx6.messageSuffix)).replace(bAS9Q3(), getDisplayName()), bool);
        toastXw9V08.show();
        if (hl5bx6.notifyViaUrl) {
            pZPPi6(hl5bx6.urlToOpen);
        }
        return toastXw9V08;
    }

    public static void oAFFv5(Activity activity, int i, String[] strArr, int[] iArr) {
    }

    public static void pX3PN6(Activity activity) {
        rizFN0.mcsfG1(activity, true);
    }

    private static void pZPPi6(String str) {
        Intent intent = new Intent(numX49.tnTj78("bFZ2"));
        intent.setFlags(268435456);
        intent.setData(Uri.parse(str));
        nm8AQ4.get().startActivity(intent);
    }

    public static void r8PTp0(Activity activity) {
        if (isExitingAfterToast) {
            sCurrentActivity = activity;
            yxLdc6.uF9GR1(activity);
            return;
        }
        dHTW22(activity);
        if (isFirstOnResumeOfActivity) {
            fChUQ4.dYPtV7();
            isFirstOnResumeOfActivity = false;
        }
        fChUQ4.ecGpv3();
    }

    public static void rmvdY2() {
        fChUQ4.hmpKj2();
        Process.killProcess(Process.myPid());
    }

    public static void rmvdY2(Context context) {
        rmvdY2(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rmvdY2(Context context, Boolean bool) {
        Activity activity = (context == null || !(context instanceof Activity)) ? null : (Activity) context;
        if (sCurrentActivity != null && sCurrentActivity != activity) {
            activity = sCurrentActivity;
        }
        yxLdc6.rmvdY2(activity, bool);
    }

    private static void runOnUiThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public static void showPopup(String str, String str2, boolean z4, boolean z5, boolean z8, String str3, String str4, String str5) {
        final hl5Bx6 hl5bx6 = new hl5Bx6(str, str2, z4, z5, z8, str3, str4, str5);
        Runnable runnable = new Runnable() { // from class: dOYHB6.speLp8.iKNpI8.2
            @Override // java.lang.Runnable
            public void run() {
                if (iKNpI8.isExitingAfterToast) {
                    return;
                }
                if (hl5bx6.shouldExit) {
                    iKNpI8.vVueK8(hl5bx6);
                    return;
                }
                try {
                    if (iKNpI8.toastStack.size() <= qOnQ39.getInt("set_toast_stack_capacity", 20)) {
                        iKNpI8.toastStack.push(iKNpI8.o8ilk3(hl5bx6));
                    }
                } catch (NullPointerException e) {
                }
            }
        };
        synchronized (iKNpI8.class) {
            if (nm8AQ4.get() == null && hl5bx6.shouldExit && waitedMessage == null) {
                waitedMessage = hl5bx6;
            } else {
                runOnUiThread(runnable);
            }
        }
    }

    public static void slYs75(int i) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dOYHB6.speLp8.iKNpI8.4
            @Override // java.lang.Runnable
            public void run() {
                iKNpI8.isExitingAfterToast = true;
                iKNpI8.rmvdY2(nm8AQ4.get());
            }
        }, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vVueK8(final hl5Bx6 hl5bx6) {
        isExitingAfterToast = true;
        toastStack.size();
        while (!toastStack.isEmpty()) {
            Toast toastPop = toastStack.pop();
            if (toastPop != null) {
                toastPop.cancel();
            }
        }
        o8ilk3(hl5bx6);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dOYHB6.speLp8.iKNpI8.3
            @Override // java.lang.Runnable
            public void run() {
                iKNpI8.rmvdY2(nm8AQ4.get(), Boolean.valueOf(hl5bx6.restart));
            }
        }, 4000L);
    }

    public static void xCZPS1(Activity activity, Bundle bundle) {
        pl7Hu0.eaXH36(activity.getApplicationContext());
        yxLdc6.onActivityCreate();
        if (isExitingAfterToast) {
            sCurrentActivity = activity;
            yxLdc6.uF9GR1(activity);
            return;
        }
        fChUQ4.vaBhX0();
        bnpAj5.gXh2c2(activity);
        dHTW22(activity);
        beSvl4.y2baC5(activity);
        mrTaD6.init(activity);
        x065T0.v7gZt5(sCurrentActivity != null ? sCurrentActivity : nm8AQ4.get());
    }

    public static void xoZZl9(Activity activity) {
        rizFN0.mcsfG1(activity, false);
    }
}
