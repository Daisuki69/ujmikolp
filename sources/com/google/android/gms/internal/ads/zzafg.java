package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzafg {
    protected final zzaeb zza;

    public zzafg(zzaeb zzaebVar) {
        this.zza = zzaebVar;
    }

    public abstract boolean zza(zzef zzefVar) throws zzas;

    public abstract boolean zzb(zzef zzefVar, long j) throws zzas;

    public final boolean zzf(zzef zzefVar, long j) throws zzas {
        return zza(zzefVar) && zzb(zzefVar, j);
    }
}
