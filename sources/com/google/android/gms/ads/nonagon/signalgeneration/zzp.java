package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzdsr;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends QueryInfoGenerationCallback {
    private final zzo zza;
    private final zzdsr zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();

    @Nullable
    private final Boolean zzf;

    public zzp(zzo zzoVar, boolean z4, int i, @Nullable Boolean bool, zzdsr zzdsrVar) {
        this.zza = zzoVar;
        this.zzc = z4;
        this.zzd = i;
        this.zzf = bool;
        this.zzb = zzdsrVar;
    }

    private static long zza() {
        return ((Long) zzben.zzh.zze()).longValue() + com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(zzb()));
        int i = this.zzd;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z4 = this.zzc;
        zzaa.zze(this.zzb, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z4 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        this.zza.zzc(z4, new zzq(null, str, zza(), i));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(zzb()));
        int i = this.zzd;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z4 = this.zzc;
        zzaa.zze(this.zzb, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z4 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        this.zza.zzc(z4, new zzq(queryInfo, "", zza(), i));
    }
}
