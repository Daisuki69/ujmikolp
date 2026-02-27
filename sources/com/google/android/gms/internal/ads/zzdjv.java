package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjv {
    private final zzdsm zza;

    public zzdjv(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public final void zza(@Nullable View view, zzfcj zzfcjVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznK)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("action", "hcp");
        zzdslVarZza.zzc("hcp", str);
        zzdslVarZza.zzb(zzfcjVar);
        zzdslVarZza.zzd();
    }
}
