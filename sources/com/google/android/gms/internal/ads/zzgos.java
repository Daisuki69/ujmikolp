package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgos {
    private final boolean zza;
    private final zzgjz zzb;

    public /* synthetic */ zzgos(boolean z4, zzgjz zzgjzVar, byte[] bArr) {
        this.zza = z4;
        this.zzb = zzgjzVar;
    }

    public final S1.y zza(Callable callable, Executor executor) {
        return new zzgoh(this.zzb, this.zza, executor, callable);
    }
}
