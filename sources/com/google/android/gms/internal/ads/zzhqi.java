package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhqi {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzhqi(int i, int i4, zzhqh zzhqhVar) {
        this.zza = zzhpu.zza(i);
        this.zzb = zzhpu.zza(i4);
    }

    public final zzhqi zza(zzhqg zzhqgVar) {
        this.zza.add(zzhqgVar);
        return this;
    }

    public final zzhqi zzb(zzhqg zzhqgVar) {
        this.zzb.add(zzhqgVar);
        return this;
    }

    public final zzhqj zzc() {
        return new zzhqj(this.zza, this.zzb, null);
    }
}
