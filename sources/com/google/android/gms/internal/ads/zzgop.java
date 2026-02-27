package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgop extends zzgon implements S1.y {
    @Override // S1.y
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public /* bridge */ /* synthetic */ Future zza() {
        throw null;
    }

    public abstract S1.y zzc();
}
