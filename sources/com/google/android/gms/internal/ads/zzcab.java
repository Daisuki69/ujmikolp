package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzcab implements Runnable {
    final /* synthetic */ zzcah zza;

    public zzcab(zzcah zzcahVar) {
        Objects.requireNonNull(zzcahVar);
        this.zza = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcah zzcahVar = this.zza;
        if (zzcahVar.zzt() != null) {
            zzcahVar.zzt().zza();
        }
    }
}
