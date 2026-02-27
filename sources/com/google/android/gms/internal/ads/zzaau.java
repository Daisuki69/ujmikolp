package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaau {
    private final zzaat zza;
    private final zzaaz zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = androidx.media3.common.C.TIME_UNSET;
    private long zzg = androidx.media3.common.C.TIME_UNSET;
    private long zzh = androidx.media3.common.C.TIME_UNSET;
    private float zzj = 1.0f;
    private zzdb zzk = zzdb.zza;

    public zzaau(Context context, zzaat zzaatVar, long j) {
        this.zza = zzaatVar;
        this.zzb = new zzaaz(context);
    }

    private final void zzo(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    public final void zza(int i) {
        if (i == 0) {
            this.zzd = 1;
        } else if (i != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzeo.zzq(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = androidx.media3.common.C.TIME_UNSET;
        this.zzb.zzh();
    }

    public final void zzd(@Nullable Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f) {
        this.zzb.zzf(f);
    }

    public final boolean zzf() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzeo.zzq(this.zzk.zzb());
        return i != 3;
    }

    public final void zzg(zzdb zzdbVar) {
        this.zzk = zzdbVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z4) {
        if (z4 && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = androidx.media3.common.C.TIME_UNSET;
            return true;
        }
        if (this.zzh == androidx.media3.common.C.TIME_UNSET) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = androidx.media3.common.C.TIME_UNSET;
        return false;
    }

    public final void zzj(boolean z4) {
        this.zzi = z4;
        this.zzh = androidx.media3.common.C.TIME_UNSET;
    }

    public final int zzk(long j, long j6, long j7, long j9, boolean z4, boolean z5, zzaas zzaasVar) throws zzhz {
        boolean z8;
        zzaasVar.zzc();
        if (this.zzc && this.zze == androidx.media3.common.C.TIME_UNSET) {
            this.zze = j6;
        }
        if (this.zzg != j) {
            this.zzb.zzg(j);
            this.zzg = j;
        }
        long jZzq = (long) ((j - j6) / ((double) this.zzj));
        if (this.zzc) {
            jZzq -= zzeo.zzq(this.zzk.zzb()) - j7;
        }
        zzaasVar.zze(jZzq);
        if (z4 && !z5) {
            return 3;
        }
        if (!this.zzl) {
            this.zzm = true;
            if (this.zza.zzan(zzaasVar.zzd(), j6, j7, z5, true)) {
                return 4;
            }
            return (!this.zzc || zzaasVar.zzd() >= 30000) ? 5 : 3;
        }
        long jZzd = zzaasVar.zzd();
        if (this.zzh == androidx.media3.common.C.TIME_UNSET || this.zzi) {
            int i = this.zzd;
            if (i == 0) {
                z8 = false;
                if (this.zzc) {
                    return 0;
                }
            } else {
                if (i == 1) {
                    return 0;
                }
                if (i == 2) {
                    z8 = false;
                    if (j6 >= j9) {
                        return 0;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    z8 = false;
                    long jZzq2 = zzeo.zzq(this.zzk.zzb()) - this.zzf;
                    if (this.zzc) {
                        long j10 = this.zze;
                        if (j10 != androidx.media3.common.C.TIME_UNSET && j10 != j6 && jZzd < -30000 && jZzq2 > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                            return 0;
                        }
                    }
                }
            }
        } else {
            z8 = false;
        }
        if (!this.zzc || j6 == this.zze) {
            return 5;
        }
        long jZzc = this.zzk.zzc();
        zzaasVar.zzg(this.zzb.zzi((zzaasVar.zzd() * 1000) + jZzc));
        zzaasVar.zze((zzaasVar.zzf() - jZzc) / 1000);
        boolean z9 = (this.zzh == androidx.media3.common.C.TIME_UNSET || this.zzi) ? z8 : true;
        if (this.zza.zzan(zzaasVar.zzd(), j6, j7, z5, z9)) {
            return 4;
        }
        return (zzaasVar.zzd() >= -30000 || z5) ? zzaasVar.zzd() > 50000 ? 5 : 1 : z9 ? 3 : 2;
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = androidx.media3.common.C.TIME_UNSET;
        this.zze = androidx.media3.common.C.TIME_UNSET;
        zzo(1);
        this.zzh = androidx.media3.common.C.TIME_UNSET;
    }

    public final void zzm(int i) {
        this.zzb.zza(i);
    }

    public final void zzn(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
        zzghc.zza(f > 0.0f);
        if (f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzb.zze(f);
    }
}
