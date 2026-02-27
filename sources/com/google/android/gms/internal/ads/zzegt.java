package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzegt implements zzgoq {
    final /* synthetic */ zzfcj zza;
    final /* synthetic */ zzegu zzb;

    public zzegt(zzegu zzeguVar, zzfcj zzfcjVar) {
        this.zza = zzfcjVar;
        Objects.requireNonNull(zzeguVar);
        this.zzb = zzeguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        zzegu zzeguVar = this.zzb;
        synchronized (zzeguVar) {
            try {
                zzegv zzegvVarZzc = zzeguVar.zzc();
                zzfcj zzfcjVar = this.zza;
                zzegvVarZzc.zzc(th2, zzfcjVar);
                zzfcj zzfcjVarZza = zzeguVar.zzc().zza();
                if (zzfcjVar.zzav) {
                    while (zzfcjVarZza != null) {
                        zzeguVar.zzb(zzfcjVarZza);
                        zzfcjVarZza = zzeguVar.zzc().zza();
                    }
                } else if (zzfcjVarZza != null) {
                    zzeguVar.zzb(zzfcjVarZza);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegu zzeguVar = this.zzb;
        zzehl zzehlVar = (zzehl) obj;
        synchronized (zzeguVar) {
            try {
                zzeguVar.zzc().zzb(zzehlVar, this.zza);
                zzfcj zzfcjVarZza = zzeguVar.zzc().zza();
                if (zzfcjVarZza != null) {
                    zzeguVar.zzb(zzfcjVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
