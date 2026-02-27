package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxl implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzbxl(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzbxl zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzbxl(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxk zzb() {
        return new zzbxk((Clock) this.zza.zzb(), (zzbxi) this.zzb.zzb());
    }
}
