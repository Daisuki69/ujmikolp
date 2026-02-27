package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes3.dex */
public interface zzba {
    void zzA(@Nullable Surface surface);

    void zza(long j);

    Looper zzc();

    void zzd(zzay zzayVar);

    void zze(zzay zzayVar);

    void zzf();

    int zzg();

    int zzh();

    void zzi(boolean z4);

    boolean zzj();

    int zzk();

    boolean zzl();

    void zzm();

    zzbm zzn();

    zzbe zzo();

    int zzp();

    int zzq();

    long zzr();

    long zzs();

    long zzt();

    long zzu();

    boolean zzv();

    int zzw();

    int zzx();

    long zzy();

    void zzz(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f);
}
