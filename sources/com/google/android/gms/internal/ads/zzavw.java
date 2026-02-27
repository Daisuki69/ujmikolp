package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzavw implements Runnable {
    final /* synthetic */ zzavx zza;

    public zzavw(zzavx zzavxVar) {
        Objects.requireNonNull(zzavxVar);
        this.zza = zzavxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbci.zza(this.zza.zza);
    }
}
