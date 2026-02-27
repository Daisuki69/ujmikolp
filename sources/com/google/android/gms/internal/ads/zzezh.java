package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzezh implements zzffl {
    public final zzfaa zza;
    public final zzfac zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzx zzf;
    public final zzffb zzg;

    public zzezh(zzfaa zzfaaVar, zzfac zzfacVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzffb zzffbVar) {
        this.zza = zzfaaVar;
        this.zzb = zzfacVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzxVar;
        this.zzg = zzffbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffl
    public final Executor zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzffl
    public final zzffb zzb() {
        return this.zzg;
    }
}
