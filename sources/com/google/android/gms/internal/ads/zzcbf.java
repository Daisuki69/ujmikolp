package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzcbf implements Runnable {
    private final zzcar zza;
    private boolean zzb = false;

    public zzcbf(zzcar zzcarVar) {
        this.zza = zzcarVar;
    }

    private final void zzc() {
        zzfro zzfroVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfroVar.removeCallbacks(this);
        zzfroVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
