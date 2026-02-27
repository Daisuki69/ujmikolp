package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public interface zzgpd extends ExecutorService {
    /* bridge */ /* synthetic */ Future submit(Runnable runnable);

    /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj);

    /* bridge */ /* synthetic */ Future submit(Callable callable);

    S1.y zza(Runnable runnable);

    S1.y zzb(Runnable runnable, Object obj);

    S1.y zzc(Callable callable);
}
