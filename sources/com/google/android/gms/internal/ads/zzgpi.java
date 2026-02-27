package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnm;

/* JADX INFO: loaded from: classes3.dex */
final class zzgpi extends zzgnm.zzf implements Runnable {
    private final Runnable zza;

    public zzgpi(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th2) {
            zzb(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        String string = this.zza.toString();
        return We.s.q(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }
}
