package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesx implements zzeup {
    private final zzgpd zza;
    private final zzdtp zzb;

    public zzesx(zzgpd zzgpdVar, zzdtp zzdtpVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzesw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 62;
    }

    public final /* synthetic */ zzesy zzc() {
        return new zzesy(this.zzb.zzb());
    }
}
