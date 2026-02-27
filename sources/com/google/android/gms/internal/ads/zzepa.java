package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
final class zzepa {
    public final S1.y zza;
    private final long zzb;
    private final Clock zzc;

    public zzepa(S1.y yVar, long j, Clock clock) {
        this.zza = yVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
