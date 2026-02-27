package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnj extends zzbzt {
    private final Object zza = new Object();
    private final zzbno zzb;
    private boolean zzc;

    public zzbnj(zzbno zzbnoVar) {
        this.zzb = zzbnoVar;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
                if (this.zzc) {
                    com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zze(new zzbng(this), new zzbzp());
                zze(new zzbnh(this), new zzbni(this));
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ zzbno zzb() {
        return this.zzb;
    }
}
