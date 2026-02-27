package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface zzsq {
    void zza(int i, int i4, int i6, long j, int i10);

    void zzb(int i, int i4, zzhd zzhdVar, long j, int i6);

    void zzc(int i, boolean z4);

    void zzd(int i, long j);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    @Nullable
    ByteBuffer zzh(int i);

    @Nullable
    ByteBuffer zzi(int i);

    void zzj();

    void zzk();

    boolean zzl(zzsp zzspVar);

    void zzm(Surface surface);

    @RequiresApi(35)
    void zzn();

    void zzo(Bundle bundle);

    void zzp(int i);
}
