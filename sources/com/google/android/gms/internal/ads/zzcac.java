package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzcac implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcah zzc;

    public zzcac(zzcah zzcahVar, int i, int i4) {
        this.zza = i;
        this.zzb = i4;
        Objects.requireNonNull(zzcahVar);
        this.zzc = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcah zzcahVar = this.zzc;
        if (zzcahVar.zzt() != null) {
            zzcahVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
