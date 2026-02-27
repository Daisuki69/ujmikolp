package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: loaded from: classes2.dex */
public final class zze implements zzhpx {
    private final zzhqg zza;

    private zze(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zze zza(zzhqg zzhqgVar) {
        return new zze(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzd(((zzchd) this.zza).zza());
    }
}
