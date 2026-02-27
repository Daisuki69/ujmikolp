package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfhx implements zzgoq {
    final /* synthetic */ zzfib zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ boolean zzc;

    public zzfhx(zzfib zzfibVar, zzfhr zzfhrVar, boolean z4) {
        this.zza = zzfibVar;
        this.zzb = zzfhrVar;
        this.zzc = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        zzfhr zzfhrVar = this.zzb;
        if (zzfhrVar.zzb()) {
            zzfib zzfibVar = this.zza;
            zzfhrVar.zzj(th2);
            zzfhrVar.zzd(false);
            zzfibVar.zza(zzfhrVar);
            if (this.zzc) {
                zzfibVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        zzfhr zzfhrVar = this.zzb;
        zzfhrVar.zzd(true);
        zzfib zzfibVar = this.zza;
        zzfibVar.zza(zzfhrVar);
        if (this.zzc) {
            zzfibVar.zzh();
        }
    }
}
