package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzgeo extends zzgfq {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final zzgfq zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final zzgfq zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final zzgfr zzc() {
        return new zzgep(this.zza, this.zzb, null);
    }
}
