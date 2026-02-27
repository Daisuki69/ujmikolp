package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeof implements zzeup {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcsi zze;
    private final zzfek zzf;
    private final zzfdc zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzh().zzo();
    private final zzdsg zzi;
    private final zzcsw zzj;

    public zzeof(Context context, String str, String str2, zzcsi zzcsiVar, zzfek zzfekVar, zzfdc zzfdcVar, zzdsg zzdsgVar, zzcsw zzcswVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcsiVar;
        this.zzf = zzfekVar;
        this.zzg = zzfdcVar;
        this.zzi = zzdsgVar;
        this.zzj = zzcswVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        Bundle bundle = new Bundle();
        zzdsg zzdsgVar = this.zzi;
        Map mapZzc = zzdsgVar.zzc();
        String str = this.zzb;
        mapZzc.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue()) {
            zzdsgVar.zzd("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd));
            com.google.android.gms.ads.internal.zzt.zzc();
            zzdsgVar.zzd(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzK(this.zza) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        }
        zzcsi zzcsiVar = this.zze;
        zzfdc zzfdcVar = this.zzg;
        zzcsiVar.zzi(zzfdcVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzgot.zza(new zzeog(this.zza, bundle, str, this.zzc, this.zzh, zzfdcVar.zzg, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 12;
    }
}
