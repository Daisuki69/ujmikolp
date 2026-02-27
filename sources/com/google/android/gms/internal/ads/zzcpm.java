package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcpm implements zzcwm {

    @Nullable
    private final zzcek zza;
    private final zzdsm zzb;
    private final zzfcj zzc;

    public zzcpm(@Nullable zzcek zzcekVar, zzdsm zzdsmVar, zzfcj zzfcjVar) {
        this.zza = zzcekVar;
        this.zzb = zzdsmVar;
        this.zzc = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzcek zzcekVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznK)).booleanValue() || (zzcekVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzcekVar.zzE()) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        zzdsl zzdslVarZza = this.zzb.zza();
        zzdslVarZza.zzc("action", "hcp");
        zzdslVarZza.zzc("hcp", str);
        zzdslVarZza.zzb(this.zzc);
        zzdslVarZza.zzd();
    }
}
