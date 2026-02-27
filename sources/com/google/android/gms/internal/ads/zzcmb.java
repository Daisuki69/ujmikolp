package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzcmb implements zzgoq {
    final /* synthetic */ zzfjv zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzcmi zzd;

    public zzcmb(zzcmi zzcmiVar, zzfjv zzfjvVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfjvVar;
        this.zzb = str;
        this.zzc = zzvVar;
        Objects.requireNonNull(zzcmiVar);
        this.zzd = zzcmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(final Throwable th2) {
        final zzfjv zzfjvVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcma
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzle)).booleanValue();
                Throwable th3 = th2;
                zzcmb zzcmbVar = this.zza;
                if (zBooleanValue) {
                    zzcmi zzcmiVar = zzcmbVar.zzd;
                    zzbtv zzbtvVarZzc = zzbtt.zzc(zzcmiVar.zzi());
                    zzcmiVar.zzb = zzbtvVarZzc;
                    zzbtvVarZzc.zzh(th3, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcmi zzcmiVar2 = zzcmbVar.zzd;
                    zzbtv zzbtvVarZza = zzbtt.zza(zzcmiVar2.zzi());
                    zzcmiVar2.zza = zzbtvVarZza;
                    zzbtvVarZza.zzh(th3, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfjvVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfjv zzfjvVar = this.zza;
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfjvVar.zzb(str, zzvVar, null, null);
            }
        });
    }
}
