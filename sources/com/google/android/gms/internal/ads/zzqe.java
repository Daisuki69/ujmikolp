package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.dash.DashMediaSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzqe {
    private final zzqd zza;
    private final int zzb;
    private final zzqf zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzqe(AudioTrack audioTrack, zzqf zzqfVar) {
        this.zza = new zzqd(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzqfVar;
        zzf(0);
    }

    private final void zzf(int i) {
        this.zzd = i;
        long j = 10000;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = androidx.media3.common.C.TIME_UNSET;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzf = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    private final long zzg(long j, float f) {
        zzqd zzqdVar = this.zza;
        return zzh(zzqdVar.zzc(), zzqdVar.zzb(), j, f);
    }

    private final long zzh(long j, long j6, long j7, float f) {
        long j9 = j7 - j6;
        return zzeo.zzv(j9, f) + zzeo.zzr(j, this.zzb);
    }

    public final void zza(long j, float f, long j6) {
        if (j - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j;
        zzqd zzqdVar = this.zza;
        boolean zZza = zzqdVar.zza();
        if (zZza) {
            long jZzb = zzqdVar.zzb();
            long jZzg = zzg(j, f);
            if (Math.abs(jZzb - j) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.zzc.zzc(zzqdVar.zzc(), jZzb, j, j6);
                zzf(4);
            } else if (Math.abs(jZzg - j6) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.zzc.zzb(zzqdVar.zzc(), jZzb, j, j6);
                zzf(4);
            } else if (this.zzd == 4) {
                zzf(0);
            }
        }
        int i = this.zzd;
        if (i == 0) {
            if (!zZza) {
                if (j - this.zze > 500000) {
                    zzf(3);
                    return;
                }
                return;
            } else {
                if (zzqdVar.zzb() >= this.zze) {
                    this.zzh = zzqdVar.zzc();
                    this.zzi = zzqdVar.zzb();
                    zzf(1);
                    return;
                }
                return;
            }
        }
        if (i != 1) {
            if (i == 2) {
                if (zZza) {
                    return;
                }
                zzf(0);
                return;
            } else {
                if (i == 3 && zZza) {
                    zzf(0);
                    return;
                }
                return;
            }
        }
        if (!zZza) {
            zzf(0);
            return;
        }
        long jZzc = zzqdVar.zzc();
        long j7 = this.zzh;
        if (jZzc > j7) {
            if (Math.abs(zzg(j, f) - zzh(j7, this.zzi, j, f)) < 1000) {
                zzf(2);
                return;
            }
        }
        if (j - this.zze > SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US) {
            zzf(3);
        } else {
            this.zzh = zzqdVar.zzc();
            this.zzi = zzqdVar.zzb();
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j, float f) {
        return zzg(j, f);
    }
}
