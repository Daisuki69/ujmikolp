package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes3.dex */
final class zzbw extends zzbx {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbx zzc;

    public zzbw(zzbx zzbxVar, int i, int i4) {
        this.zzc = zzbxVar;
        this.zza = i;
        this.zzb = i4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbr.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.location.zzbx, java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzbx subList(int i, int i4) {
        zzbr.zzc(i, i4, this.zzb);
        zzbx zzbxVar = this.zzc;
        int i6 = this.zza;
        return zzbxVar.subList(i + i6, i4 + i6);
    }
}
