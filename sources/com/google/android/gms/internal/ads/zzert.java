package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzert implements zzeup {
    private final zzgpd zza;
    private final zzfdc zzb;

    public zzert(zzgpd zzgpdVar, zzfdc zzfdcVar) {
        this.zza = zzgpdVar;
        this.zzb = zzfdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzers
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 21;
    }

    public final /* synthetic */ zzeru zzc() {
        return new zzeru("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(this.zzb.zzd)));
    }
}
