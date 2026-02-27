package com.google.android.gms.internal.ads;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzccm implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzccq zzj;

    public zzccm(zzccq zzccqVar, String str, String str2, int i, int i4, long j, long j6, boolean z4, int i6, int i10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i4;
        this.zze = j;
        this.zzf = j6;
        this.zzg = z4;
        this.zzh = i6;
        this.zzi = i10;
        Objects.requireNonNull(zzccqVar);
        this.zzj = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapP = androidx.media3.datasource.cache.c.p("event", "precacheProgress");
        mapP.put("src", this.zza);
        mapP.put("cachedSrc", this.zzb);
        mapP.put("bytesLoaded", Integer.toString(this.zzc));
        mapP.put("totalBytes", Integer.toString(this.zzd));
        mapP.put("bufferedDuration", Long.toString(this.zze));
        mapP.put("totalDuration", Long.toString(this.zzf));
        mapP.put("cacheReady", true != this.zzg ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        mapP.put("playerCount", Integer.toString(this.zzh));
        mapP.put("playerPreparedCount", Integer.toString(this.zzi));
        this.zzj.zzw("onPrecacheEvent", mapP);
    }
}
