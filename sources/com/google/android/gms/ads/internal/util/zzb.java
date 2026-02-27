package com.google.android.gms.ads.internal.util;

import S1.y;
import com.google.android.gms.internal.ads.zzbzh;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public y zzb() {
        return zzbzh.zza.zza(this.zza);
    }

    public final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}
