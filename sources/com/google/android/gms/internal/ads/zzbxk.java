package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxk {
    private final Clock zza;
    private final zzbxi zzb;

    public zzbxk(Clock clock, zzbxi zzbxiVar) {
        this.zza = clock;
        this.zzb = zzbxiVar;
    }

    public static zzbxk zza(Context context) {
        return zzbxs.zzb(context).zza();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i, long j) {
        this.zzb.zza(i, j);
    }
}
