package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgnp extends AbstractExecutorService implements zzgpd {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgps.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (S1.y) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgpd
    public final S1.y zza(Runnable runnable) {
        return (S1.y) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgpd
    public final S1.y zzb(Runnable runnable, Object obj) {
        return (S1.y) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpd
    public final S1.y zzc(Callable callable) {
        return (S1.y) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzgps(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (S1.y) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    public final /* synthetic */ Future submit(Callable callable) {
        return (S1.y) super.submit(callable);
    }
}
