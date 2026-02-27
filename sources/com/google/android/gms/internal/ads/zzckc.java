package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzckc implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzckc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzckc zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzckc(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.util.client.zzu(((zzchd) this.zza).zza(), (String) this.zzb.zzb());
    }
}
