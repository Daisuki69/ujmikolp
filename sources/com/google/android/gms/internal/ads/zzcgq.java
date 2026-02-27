package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class zzcgq implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);
    private final int zzb;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        return new zzcgp(this, runnable, androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(andIncrement).length() + 26), "AdWorker(WebViewStartup) #", andIncrement), runnable);
    }

    public final /* synthetic */ int zza() {
        return this.zzb;
    }
}
