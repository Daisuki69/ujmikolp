package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemn implements zzeup {
    private final Clock zza;
    private final zzfdc zzb;

    public zzemn(Clock clock, zzfdc zzfdcVar) {
        this.zza = clock;
        this.zzb = zzfdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return zzgot.zza(new zzemo(this.zzb, this.zza.currentTimeMillis()));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 4;
    }
}
