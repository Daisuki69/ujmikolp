package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaaz {
    private final zzzx zza = new zzzx();

    @Nullable
    private final zzaax zzb;

    @Nullable
    private final zzaay zzc;
    private boolean zzd;

    @Nullable
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzaaz(@Nullable Context context) {
        DisplayManager displayManager;
        zzaax zzaaxVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new zzaax(this, displayManager);
        this.zzb = zzaaxVar;
        this.zzc = zzaaxVar != null ? zzaay.zza() : null;
        this.zzk = androidx.media3.common.C.TIME_UNSET;
        this.zzl = androidx.media3.common.C.TIME_UNSET;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    private final void zzk() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzl() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzzx zzzxVar = this.zza;
        float fZzg = zzzxVar.zzc() ? zzzxVar.zzg() : this.zzf;
        float f = this.zzg;
        if (fZzg != f) {
            if (fZzg != -1.0f && f != -1.0f) {
                float f3 = 1.0f;
                if (zzzxVar.zzc() && zzzxVar.zze() >= 5000000000L) {
                    f3 = 0.02f;
                }
                if (Math.abs(fZzg - this.zzg) < f3) {
                    return;
                }
            } else if (fZzg == -1.0f && zzzxVar.zzd() < 30) {
                return;
            }
            this.zzg = fZzg;
            zzm(false);
        }
    }

    private final void zzm(boolean z4) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f3 = this.zzg;
            if (f3 != -1.0f) {
                f = this.zzi * f3;
            }
        }
        if (z4 || this.zzh != f) {
            this.zzh = f;
            zzaaw.zza(surface, f);
        }
    }

    private final void zzn() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzaaw.zza(surface, 0.0f);
    }

    public final void zza(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzm(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzk();
        zzaax zzaaxVar = this.zzb;
        if (zzaaxVar != null) {
            zzaay zzaayVar = this.zzc;
            zzaayVar.getClass();
            zzaayVar.zzb();
            zzaaxVar.zza();
        }
        zzm(false);
    }

    public final void zzc(@Nullable Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzn();
        this.zze = surface;
        zzm(true);
    }

    public final void zzd() {
        zzk();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzk();
        zzm(false);
    }

    public final void zzf(float f) {
        this.zzf = f;
        this.zza.zza();
        zzl();
    }

    public final void zzg(long j) {
        long j6 = this.zzn;
        if (j6 != -1) {
            this.zzp = j6;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zzb(j * 1000);
        zzl();
    }

    public final void zzh() {
        this.zzd = false;
        zzaax zzaaxVar = this.zzb;
        if (zzaaxVar != null) {
            zzaaxVar.zzb();
            zzaay zzaayVar = this.zzc;
            zzaayVar.getClass();
            zzaayVar.zzc();
        }
        zzn();
    }

    public final long zzi(long j) {
        long j6;
        if (this.zzp != -1) {
            zzzx zzzxVar = this.zza;
            if (zzzxVar.zzc()) {
                long jZzf = zzzxVar.zzf();
                long j7 = this.zzq + ((long) (((this.zzm - this.zzp) * jZzf) / this.zzi));
                if (Math.abs(j - j7) > 20000000) {
                    zzk();
                } else {
                    j = j7;
                }
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzaay zzaayVar = this.zzc;
        if (zzaayVar != null && this.zzk != androidx.media3.common.C.TIME_UNSET) {
            long j9 = zzaayVar.zza;
            if (j9 != androidx.media3.common.C.TIME_UNSET) {
                long j10 = this.zzk;
                long j11 = (((j - j9) / j10) * j10) + j9;
                if (j <= j11) {
                    j6 = j11 - j10;
                } else {
                    j6 = j11;
                    j11 = j10 + j11;
                }
                long j12 = this.zzl;
                if (j11 - j >= j - j6) {
                    j11 = j6;
                }
                return j11 - j12;
            }
        }
        return j;
    }

    public final /* synthetic */ void zzj(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.zzk = refreshRate;
            this.zzl = (refreshRate * 80) / 100;
        } else {
            zzds.zzc("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.zzk = androidx.media3.common.C.TIME_UNSET;
            this.zzl = androidx.media3.common.C.TIME_UNSET;
        }
    }
}
