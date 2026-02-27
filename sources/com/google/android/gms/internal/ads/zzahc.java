package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzahc extends zzack implements zzahi {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzahc(long j, long j6, int i, int i4, boolean z4) {
        super(j, j6, i, i4, false);
        this.zza = j6;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = j != -1 ? j : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j) {
        return zzd(j);
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return this.zzb;
    }

    public final zzahc zzh(long j) {
        return new zzahc(j, this.zza, this.zzb, this.zzc, false);
    }
}
