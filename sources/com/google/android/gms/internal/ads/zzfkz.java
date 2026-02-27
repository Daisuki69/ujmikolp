package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfkz implements Runnable {
    final /* synthetic */ zzflb zza;

    public zzfkz(zzflb zzflbVar) {
        Objects.requireNonNull(zzflbVar);
        this.zza = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzy();
    }
}
