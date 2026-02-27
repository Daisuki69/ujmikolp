package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class zzkf implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlj zzc;

    public zzkf(zzlj zzljVar, AtomicReference atomicReference, boolean z4) {
        this.zza = atomicReference;
        this.zzb = z4;
        Objects.requireNonNull(zzljVar);
        this.zzc = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzu.zzt().zzv(this.zza, this.zzb);
    }
}
