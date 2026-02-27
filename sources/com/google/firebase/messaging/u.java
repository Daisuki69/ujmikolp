package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import dOYHB6.yFtIp6.ht2aO8;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f9809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f9810b;

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        v vVar = this.f9809a;
        if (vVar != null) {
            Context context = vVar.c.f9761b;
            this.f9810b = context;
            ht2aO8.registerReceiver(context, this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        v vVar = this.f9809a;
        if (vVar != null && vVar.a()) {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            v vVar2 = this.f9809a;
            vVar2.c.getClass();
            FirebaseMessaging.b(vVar2, 0L);
            Context context2 = this.f9810b;
            if (context2 != null) {
                ht2aO8.unregisterReceiver(context2, this);
            }
            this.f9809a = null;
        }
    }
}
