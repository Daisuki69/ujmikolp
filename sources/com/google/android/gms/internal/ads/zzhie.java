package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhie implements zzhhv {
    final int zza;
    final zzhli zzb;
    final boolean zzc;
    final boolean zzd;

    public zzhie(zzhim zzhimVar, int i, zzhli zzhliVar, boolean z4, boolean z5) {
        this.zza = i;
        this.zzb = zzhliVar;
        this.zzc = z4;
        this.zzd = z5;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzhie) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhhv
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhhv
    public final zzhli zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhhv
    public final zzhlj zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhhv
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhhv
    public final boolean zze() {
        return this.zzd;
    }
}
