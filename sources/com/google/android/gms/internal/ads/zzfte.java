package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfte implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzfte(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar3;
    }

    public static zzfte zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzfte(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzftd zzb() {
        return new zzftd((DataStore) this.zza.zzb(), zzchf.zzc(), (zzdpw) this.zzb.zzb(), new zzfsf());
    }
}
