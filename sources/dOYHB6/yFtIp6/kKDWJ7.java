package dOYHB6.yFtIp6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import dOYHB6.nm8AQ4;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes6.dex */
public class kKDWJ7 {
    public static void doDispatch(String str, Bundle bundle, boolean z4) {
        final Context context;
        if (TextUtils.isEmpty(str) || (context = nm8AQ4.get()) == null) {
            return;
        }
        final Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        intent.putExtras(bundle);
        context.sendBroadcast(intent, ht2aO8.szBXG1());
        if (z4) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: dOYHB6.yFtIp6.kKDWJ7.1
            @Override // java.lang.Runnable
            public void run() {
                kKDWJ7.rlPc68(numX49.tnTj78("bHfB"), context, intent);
                kKDWJ7.rlPc68(numX49.tnTj78("bHfu"), context, intent);
            }
        });
    }

    public static void doDispatch(String str, String str2, boolean z4) {
        Bundle bundleMQ1R12 = xmpVH2.mQ1R12(str2);
        String strTnTj78 = numX49.tnTj78("bHfd");
        String string = bundleMQ1R12.getString(strTnTj78);
        if (string != null) {
            bundleMQ1R12.putString(strTnTj78, string.replace(numX49.tnTj78("bHfi"), iKNpI8.getDisplayName()));
        }
        doDispatch(str, bundleMQ1R12, z4);
    }

    public static void lBJjw4(Intent intent) {
        if (intent == null) {
            return;
        }
        sendBroadcast(null, intent);
    }

    public static void rlPc68(String str, Context context, Intent intent) {
        try {
            Class<?> cls = Class.forName(str);
            cls.getMethod("sendBroadcastSync", Intent.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), intent);
        } catch (Exception e) {
        }
    }

    public static void sendBroadcast(Object obj, Intent intent) {
        Context context = nm8AQ4.get();
        if (context == null) {
            return;
        }
        if (intent.getAction() == null || !fChUQ4.h4HHR8(intent.getAction())) {
            context.sendBroadcast(intent);
        } else {
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, ht2aO8.szBXG1());
        }
    }

    public static void sendBroadcast(Object obj, Intent intent, String str) {
        Context context = nm8AQ4.get();
        if (context == null) {
            return;
        }
        if (intent.getAction() == null || !fChUQ4.h4HHR8(intent.getAction())) {
            context.sendBroadcast(intent);
            return;
        }
        intent.setPackage(context.getPackageName());
        if (TextUtils.isEmpty(str)) {
            str = ht2aO8.szBXG1();
        }
        context.sendBroadcast(intent, str);
    }

    public static boolean slA3q7(Intent intent) {
        if (intent == null) {
            return false;
        }
        return fChUQ4.h4HHR8(intent.getAction());
    }
}
