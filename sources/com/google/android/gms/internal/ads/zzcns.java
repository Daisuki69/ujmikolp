package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcns {
    private final zzdsm zza;
    private final zzfcu zzb;

    public zzcns(zzdsm zzdsmVar, zzfcu zzfcuVar) {
        this.zza = zzdsmVar;
        this.zzb = zzfcuVar;
    }

    public final void zza(long j, int i) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zza(this.zzb.zzb.zzb);
        zzdslVarZza.zzc("action", "ad_closed");
        zzdslVarZza.zzc("show_time", String.valueOf(j));
        zzdslVarZza.zzc("ad_format", "app_open_ad");
        int i4 = i - 1;
        zzdslVarZza.zzc("acr", i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "u" : "ac" : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.i : "cc" : "bb" : CmcdData.Factory.STREAMING_FORMAT_HLS);
        zzdslVarZza.zzd();
    }
}
