package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfkx implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb;
    final /* synthetic */ zzflb zzc;

    public zzfkx(zzflb zzflbVar, long j, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = j;
        this.zzb = zzeaVar;
        Objects.requireNonNull(zzflbVar);
        this.zzc = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzflb zzflbVar = this.zzc;
        if (zzflbVar.zzA() != null) {
            zzfkk zzfkkVarZzA = zzflbVar.zzA();
            long j = this.zza;
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            zzfkkVarZzA.zzi(j, zzflb.zzQ(zzeaVar), zzflbVar.zzC(), zzflbVar.zze.zzd, zzflbVar.zzn(), zzflbVar.zzz());
        }
    }
}
