package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zztm implements zzsq {
    private final MediaCodec zza;

    @Nullable
    private final zzsm zzb;

    public /* synthetic */ zztm(MediaCodec mediaCodec, zzsm zzsmVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzsmVar;
        if (Build.VERSION.SDK_INT < 35 || zzsmVar == null) {
            return;
        }
        zzsmVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zza(int i, int i4, int i6, long j, int i10) {
        this.zza.queueInputBuffer(i, 0, i6, j, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzb(int i, int i4, zzhd zzhdVar, long j, int i6) {
        this.zza.queueSecureInputBuffer(i, 0, zzhdVar.zzb(), j, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzc(int i, boolean z4) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzd(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    @Nullable
    public final ByteBuffer zzh(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    @Nullable
    public final ByteBuffer zzi(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() {
        zzsm zzsmVar;
        zzsm zzsmVar2;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                this.zza.stop();
            }
            if (i >= 35 && (zzsmVar2 = this.zzb) != null) {
                zzsmVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (zzsmVar = this.zzb) != null) {
                zzsmVar.zzc(this.zza);
            }
            this.zza.release();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final /* synthetic */ boolean zzl(zzsp zzspVar) {
        return L.a(this, zzspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzm(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    @RequiresApi(35)
    public final void zzn() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzo(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzp(int i) {
        this.zza.setVideoScalingMode(i);
    }
}
