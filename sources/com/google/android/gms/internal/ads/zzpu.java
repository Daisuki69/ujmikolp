package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpu {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzpv zzb;

    public zzpu(@Nullable Handler handler, @Nullable zzpv zzpvVar) {
        this.zza = zzpvVar == null ? null : handler;
        this.zzb = zzpvVar;
    }

    public final void zza(final zzhr zzhrVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(zzhrVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j6) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(str, j, j6);
                }
            });
        }
    }

    public final void zzc(final zzu zzuVar, @Nullable final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(zzuVar, zzhsVar);
                }
            });
        }
    }

    public final void zzd(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(j);
                }
            });
        }
    }

    public final void zze(final int i, final long j, final long j6) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(i, j, j6);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(str);
                }
            });
        }
    }

    public final void zzg(final zzhr zzhrVar) {
        zzhrVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(zzhrVar);
                }
            });
        }
    }

    public final void zzh(final boolean z4) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(z4);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw(exc);
                }
            });
        }
    }

    public final void zzk(final zzpw zzpwVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzps
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx(zzpwVar);
                }
            });
        }
    }

    public final void zzl(final zzpw zzpwVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzy(zzpwVar);
                }
            });
        }
    }

    public final void zzm(final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzz(i);
                }
            });
        }
    }

    public final /* synthetic */ void zzn(zzhr zzhrVar) {
        String str = zzeo.zza;
        this.zzb.zzk(zzhrVar);
    }

    public final /* synthetic */ void zzo(String str, long j, long j6) {
        String str2 = zzeo.zza;
        this.zzb.zzl(str, j, j6);
    }

    public final /* synthetic */ void zzp(zzu zzuVar, zzhs zzhsVar) {
        String str = zzeo.zza;
        this.zzb.zzm(zzuVar, zzhsVar);
    }

    public final /* synthetic */ void zzq(long j) {
        String str = zzeo.zza;
        this.zzb.zzn(j);
    }

    public final /* synthetic */ void zzr(int i, long j, long j6) {
        String str = zzeo.zza;
        this.zzb.zzo(i, j, j6);
    }

    public final /* synthetic */ void zzs(String str) {
        String str2 = zzeo.zza;
        this.zzb.zzp(str);
    }

    public final /* synthetic */ void zzt(zzhr zzhrVar) {
        zzhrVar.zza();
        String str = zzeo.zza;
        this.zzb.zzq(zzhrVar);
    }

    public final /* synthetic */ void zzu(boolean z4) {
        String str = zzeo.zza;
        this.zzb.zzr(z4);
    }

    public final /* synthetic */ void zzv(Exception exc) {
        String str = zzeo.zza;
        this.zzb.zzs(exc);
    }

    public final /* synthetic */ void zzw(Exception exc) {
        String str = zzeo.zza;
        this.zzb.zzt(exc);
    }

    public final /* synthetic */ void zzx(zzpw zzpwVar) {
        String str = zzeo.zza;
        this.zzb.zzu(zzpwVar);
    }

    public final /* synthetic */ void zzy(zzpw zzpwVar) {
        String str = zzeo.zza;
        this.zzb.zzv(zzpwVar);
    }

    public final /* synthetic */ void zzz(int i) {
        String str = zzeo.zza;
        this.zzb.zzw(i);
    }
}
