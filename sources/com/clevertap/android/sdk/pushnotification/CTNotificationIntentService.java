package com.clevertap.android.sdk.pushnotification;

import D.C0187u;
import D.S;
import D.d0;
import N4.d;
import a0.InterfaceC0619a;
import android.annotation.SuppressLint;
import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import dOYHB6.yFtIp6.kKDWJ7;
import g0.e;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "4.3.0")
public class CTNotificationIntentService extends IntentService {
    public static final String MAIN_ACTION = "com.clevertap.PUSH_EVENT";
    public static final String TYPE_BUTTON_CLICK = "com.clevertap.ACTION_BUTTON_CLICK";
    private InterfaceC0619a mActionButtonClickHandler;

    public CTNotificationIntentService() {
        super("CTNotificationIntentService");
    }

    @SuppressLint({"MissingPermission"})
    private void handleActionButtonClick(Bundle bundle) {
        Intent launchIntentForPackage;
        NotificationManager notificationManager;
        try {
            boolean z4 = bundle.getBoolean("autoCancel", false);
            int i = bundle.getInt("notificationId", -1);
            String string = bundle.getString(CmcdConfiguration.KEY_DEADLINE);
            Context applicationContext = getApplicationContext();
            this.mActionButtonClickHandler.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                return;
            }
            if (string != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(string));
                d0.j(applicationContext, launchIntentForPackage);
            } else {
                launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
            }
            if (launchIntentForPackage == null) {
                S.l("CTNotificationService: create launch intent.");
                return;
            }
            launchIntentForPackage.setFlags(872415232);
            launchIntentForPackage.putExtras(bundle);
            launchIntentForPackage.removeExtra(CmcdConfiguration.KEY_DEADLINE);
            String string2 = bundle.getString("pt_dismiss_on_click", "");
            if (z4 && i > -1 && string2.isEmpty() && (notificationManager = (NotificationManager) getApplicationContext().getSystemService("notification")) != null) {
                notificationManager.cancel(i);
            }
            kKDWJ7.sendBroadcast(this, new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            startActivity(launchIntentForPackage);
        } catch (Throwable th2) {
            S.l("CTNotificationService: unable to process action button click:  " + th2.getLocalizedMessage());
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        int i = C0187u.c;
        d.b(extras);
        this.mActionButtonClickHandler = e.f16774b;
        if (TYPE_BUTTON_CLICK.equals(extras.getString("ct_type"))) {
            S.l("CTNotificationIntentService handling com.clevertap.ACTION_BUTTON_CLICK");
            handleActionButtonClick(extras);
        } else {
            S.l("CTNotificationIntentService: unhandled intent " + intent.getAction());
        }
    }
}
