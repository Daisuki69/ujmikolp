package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewk implements zzeup {
    public zzewk(zzbyk zzbykVar, zzgpd zzgpdVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        final S1.y yVarZza = zzgot.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgn)).booleanValue()) {
            yVarZza = zzgot.zza(null);
        }
        final S1.y yVarZza2 = zzgot.zza(null);
        return zzgot.zzn(yVarZza, yVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzewl((String) yVarZza.get(), (String) yVarZza2.get());
            }
        }, zzbzh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 47;
    }
}
