package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzxv {
    public final int zza;
    public final zzbf zzb;
    public final int zzc;
    public final zzu zzd;

    public zzxv(int i, zzbf zzbfVar, int i4) {
        this.zza = i;
        this.zzb = zzbfVar;
        this.zzc = i4;
        this.zzd = zzbfVar.zza(i4);
    }

    public abstract int zza();

    public abstract boolean zzc(zzxv zzxvVar);
}
