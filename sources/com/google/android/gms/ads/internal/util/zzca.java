package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: loaded from: classes2.dex */
public final class zzca implements zzhpx {
    private final zzhqg zza;

    private zzca(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzca zza(zzhqg zzhqgVar) {
        return new zzca(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbz(((zzchd) this.zza).zza());
    }
}
