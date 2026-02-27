package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlw implements zzkm {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzau zzd = zzau.zza;

    public zzlw(zzdb zzdbVar) {
    }

    public final void zza() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzb() {
        if (this.zza) {
            zzc(zzg());
            this.zza = false;
        }
    }

    public final void zzc(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final long zzg() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzau zzauVar = this.zzd;
        return (zzauVar.zzb == 1.0f ? zzeo.zzq(jElapsedRealtime) : zzauVar.zza(jElapsedRealtime)) + j;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final /* synthetic */ boolean zzh() {
        return E.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzi(zzau zzauVar) {
        if (this.zza) {
            zzc(zzg());
        }
        this.zzd = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzau zzj() {
        return this.zzd;
    }
}
