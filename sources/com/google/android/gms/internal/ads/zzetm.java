package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetm implements zzeup {
    private final String zza;
    private final int zzb;

    public zzetm(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return zzgot.zza(new zzetn(this.zza, this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 31;
    }
}
