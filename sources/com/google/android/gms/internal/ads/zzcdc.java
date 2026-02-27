package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.dash.DashMediaSource;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdc implements zzkj {
    private final zzyv zza = new zzyv(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zza(zzox zzoxVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzb(zzki zzkiVar, zzwq zzwqVar, zzyf[] zzyfVarArr) {
        int i;
        this.zzf = 0;
        for (zzyf zzyfVar : zzyfVarArr) {
            if (zzyfVar != null) {
                int i4 = this.zzf;
                int i6 = zzyfVar.zza().zzc;
                if (i6 == 0) {
                    i = DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
                } else if (i6 == 1) {
                    i = 13107200;
                } else if (i6 != 2) {
                    i = 131072;
                    if (i6 != 3 && i6 != 5 && i6 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                }
                this.zzf = i4 + i;
            }
        }
        this.zza.zzb(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzc(zzox zzoxVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzd(zzox zzoxVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final long zze(zzox zzoxVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzf(zzox zzoxVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzg(zzki zzkiVar) {
        long j = zzkiVar.zze;
        boolean z4 = true;
        char c = j > this.zzc ? (char) 0 : j < this.zzb ? (char) 2 : (char) 1;
        int iZzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || iZzg >= i)) {
            z4 = false;
        }
        this.zzg = z4;
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzh(zzki zzkiVar) {
        long j = zzkiVar.zzg ? this.zze : this.zzd;
        return j <= 0 || zzkiVar.zze >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final /* synthetic */ boolean zzi(zzbe zzbeVar, zzup zzupVar, long j) {
        return D.i(this, zzbeVar, zzupVar, j);
    }

    public final synchronized void zzj(int i) {
        this.zzb = ((long) i) * 1000;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final zzyv zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zze = ((long) i) * 1000;
    }

    @VisibleForTesting
    public final void zzo(boolean z4) {
        this.zzf = 0;
        this.zzg = false;
        if (z4) {
            this.zza.zza();
        }
    }
}
