package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: loaded from: classes2.dex */
public final class zzy implements zzhpx {
    private final zzhqg zza;

    private zzy(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzy zza(zzhqg zzhqgVar) {
        return new zzy(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzv((zzdsr) this.zza.zzb());
    }
}
