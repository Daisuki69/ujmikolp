package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface zzqc {
    void zzA();

    void zzB();

    void zza(zzpz zzpzVar);

    void zzb(@Nullable zzox zzoxVar);

    void zzc(zzdb zzdbVar);

    boolean zzd(zzu zzuVar);

    int zze(zzu zzuVar);

    zzpg zzf(zzu zzuVar);

    long zzg(boolean z4);

    void zzh(zzu zzuVar, int i, @Nullable int[] iArr) throws zzpx;

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzpy, zzqb;

    void zzl() throws zzqb;

    boolean zzm();

    boolean zzn();

    void zzo(zzau zzauVar);

    zzau zzp();

    void zzq(boolean z4);

    void zzr(zzc zzcVar);

    void zzs(int i);

    void zzt(zzd zzdVar);

    void zzu(@Nullable AudioDeviceInfo audioDeviceInfo);

    long zzv();

    @RequiresApi(29)
    void zzw(int i, int i4);

    void zzx(float f);

    void zzy();

    void zzz();
}
