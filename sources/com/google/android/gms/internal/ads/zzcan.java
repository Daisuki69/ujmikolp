package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzcan implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcar zzb;

    public zzcan(zzcar zzcarVar, boolean z4) {
        this.zza = z4;
        Objects.requireNonNull(zzcarVar);
        this.zzb = zzcarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
