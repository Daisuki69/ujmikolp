package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeru implements zzeun {
    private final boolean zza;

    public zzeru(boolean z4) {
        this.zza = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcuu) obj).zza.putBoolean("is_gbid", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcuu) obj).zzb.putBoolean("is_gbid", this.zza);
    }
}
