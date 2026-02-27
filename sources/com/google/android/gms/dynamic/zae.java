package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes2.dex */
final class zae implements View.OnClickListener {
    final /* synthetic */ Context zaa;
    final /* synthetic */ Intent zab;

    public zae(Context context, Intent intent) {
        this.zaa = context;
        this.zab = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            try {
                this.zaa.startActivity(this.zab);
                Callback.onClick_exit();
            } catch (ActivityNotFoundException e) {
                Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                Callback.onClick_exit();
            }
        } catch (Throwable th2) {
            Callback.onClick_exit();
            throw th2;
        }
    }
}
