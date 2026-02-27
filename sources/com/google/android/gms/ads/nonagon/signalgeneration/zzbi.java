package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdyc;
import com.google.android.gms.internal.ads.zzfgc;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbi implements zzhpx {
    private final zzhqg zza;

    private zzbi(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzbi zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzbi(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbh zzb() {
        return new zzbh(zzfgc.zzc(), ((zzdyc) this.zza).zzb());
    }
}
