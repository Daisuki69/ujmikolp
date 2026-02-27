package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import dOYHB6.yFtIp6.ht2aO8;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgds extends BroadcastReceiver implements zzgcz {
    private boolean zza = true;

    @SuppressLint({"UnprotectedReceiver"})
    public zzgds(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        ht2aO8.registerReceiver(context, this, intentFilter);
    }

    private final synchronized void zze(boolean z4) {
        this.zza = z4;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zze(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zze(false);
        }
    }

    public final synchronized boolean zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzb(Map map) {
        map.put("up", Boolean.valueOf(zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzc(Map map, Context context, View view) {
        map.put("up", Boolean.valueOf(zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzd(Map map) {
        map.put("up", Boolean.valueOf(zza()));
    }
}
