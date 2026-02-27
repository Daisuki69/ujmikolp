package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsw implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;

    private zzdsw(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
        this.zzd = zzhqgVar5;
    }

    public static zzdsw zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        return new zzdsw(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsr(zzfgc.zzc(), (com.google.android.gms.ads.internal.util.client.zzu) this.zza.zzb(), ((CsiParamDefaults_Factory) this.zzb).zzb(), ((CsiUrlBuilder_Factory) this.zzc).zzb(), ((zzchd) this.zzd).zza());
    }
}
