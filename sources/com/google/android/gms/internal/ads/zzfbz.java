package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfbz implements zzelx {
    final /* synthetic */ zzfca zza;

    public zzfbz(zzfca zzfcaVar) {
        Objects.requireNonNull(zzfcaVar);
        this.zza = zzfcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        zzfca zzfcaVar = this.zza;
        synchronized (zzfcaVar) {
            zzfcaVar.zzw(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfca zzfcaVar = this.zza;
        zzdom zzdomVar = (zzdom) obj;
        synchronized (zzfcaVar) {
            try {
                zzfcaVar.zzw(zzdomVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdX)).booleanValue()) {
                    zzdomVar.zzh().zza = zzfcaVar.zzu();
                }
                zzfcaVar.zzv().zzj();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
