package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzgph extends zzgoo implements zzgpc {
    private final ScheduledFuture zza;

    public zzgph(S1.y yVar, ScheduledFuture scheduledFuture) {
        super(yVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgon, java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        boolean zCancel = zza().cancel(z4);
        if (zCancel) {
            this.zza.cancel(z4);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
