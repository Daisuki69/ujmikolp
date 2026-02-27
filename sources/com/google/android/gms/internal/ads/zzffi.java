package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzffi implements zzgoq {
    final /* synthetic */ zzffl zza;
    final /* synthetic */ zzffn zzb;

    public zzffi(zzffn zzffnVar, zzffl zzfflVar) {
        this.zza = zzfflVar;
        Objects.requireNonNull(zzffnVar);
        this.zzb = zzffnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        zzffn zzffnVar = this.zzb;
        synchronized (zzffnVar) {
            zzffnVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffn zzffnVar = this.zzb;
        synchronized (zzffnVar) {
            try {
                zzffnVar.zzf(null);
                zzffnVar.zze().addFirst(this.zza);
                if (zzffnVar.zzg() == 1) {
                    zzffnVar.zzd();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
