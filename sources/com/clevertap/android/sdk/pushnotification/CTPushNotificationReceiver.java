package com.clevertap.android.sdk.pushnotification;

import D.C0187u;
import D.S;
import D.d0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import dOYHB6.yFtIp6.kKDWJ7;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "4.3.0")
public class CTPushNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent launchIntentForPackage;
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey("wzrk_dl")) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra("wzrk_dl")));
                d0.j(context, launchIntentForPackage);
            } else {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage == null) {
                    return;
                }
            }
            C0187u.i(context, extras);
            launchIntentForPackage.setFlags(872415232);
            launchIntentForPackage.putExtras(extras);
            launchIntentForPackage.putExtra("wzrk_from", "CTPushNotificationReceiver");
            if (extras.containsKey("close_system_dialogs") && extras.getBoolean("close_system_dialogs")) {
                kKDWJ7.sendBroadcast(context, new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
            context.startActivity(launchIntentForPackage);
            S.b("CTPushNotificationReceiver: handled notification: " + extras.toString());
        } catch (Throwable th2) {
            S.o("CTPushNotificationReceiver: error handling notification", th2);
        }
    }
}
