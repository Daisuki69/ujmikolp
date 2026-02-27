package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfjt implements zzgoq {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzcyh zzc;
    final /* synthetic */ zzfjv zzd;

    public zzfjt(zzfjv zzfjvVar, zzfhr zzfhrVar, zzfib zzfibVar, zzcyh zzcyhVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfibVar;
        this.zzc = zzcyhVar;
        Objects.requireNonNull(zzfjvVar);
        this.zzd = zzfjvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(@NonNull Throwable th2) {
        zzfhr zzfhrVar = this.zza;
        if (zzfhrVar == null) {
            return;
        }
        zzfhrVar.zzd(false);
        zzfib zzfibVar = this.zzb;
        if (zzfibVar != null) {
            zzfibVar.zza(zzfhrVar);
            zzfibVar.zzh();
        } else {
            zzfjv zzfjvVar = this.zzd;
            zzfjvVar.zze().zzb(zzfhrVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    @Override // com.google.android.gms.internal.ads.zzgoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjt.zzb(java.lang.Object):void");
    }
}
