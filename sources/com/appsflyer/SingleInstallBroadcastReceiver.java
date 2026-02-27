package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.media3.exoplayer.ExoPlayer;
import com.appsflyer.internal.AFb1wSDK;
import dOYHB6.yFtIp6.svM7M6;

/* JADX INFO: loaded from: classes2.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent == null) {
            return;
        }
        try {
            stringExtra = intent.getStringExtra("referrer");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th2);
            stringExtra = null;
        }
        if (stringExtra != null && svM7M6.getString(AFb1wSDK.valueOf(context), "referrer", null) != null) {
            AFb1wSDK.AFKeystoreWrapper().values(context, stringExtra);
            return;
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (string == null || jCurrentTimeMillis - Long.valueOf(string).longValue() >= ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
            AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
            AFb1wSDK.AFKeystoreWrapper().values(context, intent);
            AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}
