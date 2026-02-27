package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeuv implements zzeup {
    private final Context zza;
    private final zzgpd zzb;

    public zzeuv(Context context, zzgpd zzgpdVar) {
        this.zza = context;
        this.zzb = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return ((Boolean) zzbea.zzb.zze()).booleanValue() ? this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }) : zzgot.zza(new zzeuw(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 59;
    }

    public final /* synthetic */ zzeuw zzc() {
        Context context = this.zza;
        return new zzeuw(zzbbt.zzc(context), zzbbt.zzd(context));
    }
}
