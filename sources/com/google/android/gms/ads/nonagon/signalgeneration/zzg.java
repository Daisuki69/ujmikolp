package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzckg;
import com.google.android.gms.internal.ads.zzepw;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzg(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar4;
    }

    public static zzg zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzg(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzf(((zzchd) this.zza).zza(), zzckg.zza(), zzepw.zzc(), ((zzchs) this.zzb).zza());
    }
}
