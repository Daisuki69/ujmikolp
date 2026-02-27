package com.google.android.gms.internal.ads;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzccl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzccq zzk;

    public zzccl(zzccq zzccqVar, String str, String str2, long j, long j6, long j7, long j9, long j10, boolean z4, int i, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j6;
        this.zze = j7;
        this.zzf = j9;
        this.zzg = j10;
        this.zzh = z4;
        this.zzi = i;
        this.zzj = i4;
        Objects.requireNonNull(zzccqVar);
        this.zzk = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapP = androidx.media3.datasource.cache.c.p("event", "precacheProgress");
        mapP.put("src", this.zza);
        mapP.put("cachedSrc", this.zzb);
        mapP.put("bufferedDuration", Long.toString(this.zzc));
        mapP.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue()) {
            mapP.put("qoeLoadedBytes", Long.toString(this.zze));
            mapP.put("qoeCachedBytes", Long.toString(this.zzf));
            mapP.put("totalBytes", Long.toString(this.zzg));
            mapP.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        }
        mapP.put("cacheReady", true != this.zzh ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        mapP.put("playerCount", Integer.toString(this.zzi));
        mapP.put("playerPreparedCount", Integer.toString(this.zzj));
        this.zzk.zzw("onPrecacheEvent", mapP);
    }
}
