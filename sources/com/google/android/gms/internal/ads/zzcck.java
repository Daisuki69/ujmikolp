package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzcck implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzccq zze;

    public zzcck(zzccq zzccqVar, String str, String str2, int i, int i4, boolean z4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i4;
        Objects.requireNonNull(zzccqVar);
        this.zze = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapP = androidx.media3.datasource.cache.c.p("event", "precacheProgress");
        mapP.put("src", this.zza);
        mapP.put("cachedSrc", this.zzb);
        mapP.put("bytesLoaded", Integer.toString(this.zzc));
        mapP.put("totalBytes", Integer.toString(this.zzd));
        mapP.put("cacheReady", "0");
        this.zze.zzw("onPrecacheEvent", mapP);
    }
}
