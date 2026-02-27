package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcia implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcia(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcia zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcia(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbup zzb() {
        Context contextZza = ((zzchd) this.zza).zza();
        zzfie zzfieVar = (zzfie) this.zzb.zzb();
        zzbod zzbodVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfieVar);
        zzbnx zzbnxVar = zzboa.zza;
        zzbodVarZza.zza("google.afma.request.getAdDictionary", zzbnxVar, zzbnxVar);
        return new zzbur(contextZza, com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfieVar).zza("google.afma.sdkConstants.getSdkConstants", zzbnxVar, zzbnxVar), VersionInfoParcel.forPackage());
    }
}
