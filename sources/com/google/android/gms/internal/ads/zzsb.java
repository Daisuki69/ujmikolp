package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class zzsb implements zzsq {
    private final MediaCodec zza;
    private final zzsg zzb;
    private final zzsr zzc;

    @Nullable
    private final zzsm zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zzsb(MediaCodec mediaCodec, HandlerThread handlerThread, zzsr zzsrVar, zzsm zzsmVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = new zzsg(handlerThread);
        this.zzc = zzsrVar;
        this.zzd = zzsmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zza(int i, int i4, int i6, long j, int i10) {
        this.zzc.zzb(i, 0, i6, j, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzb(int i, int i4, zzhd zzhdVar, long j, int i6) {
        this.zzc.zzc(i, 0, zzhdVar, j, i6);
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
        this.zzc.zzg();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzg();
        return this.zzb.zzd(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final MediaFormat zzg() {
        return this.zzb.zze();
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
        this.zzc.zze();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zzf();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() {
        zzsm zzsmVar;
        zzsm zzsmVar2;
        zzsm zzsmVar3;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzf();
                    this.zzb.zzb();
                }
                this.zzf = 2;
                if (this.zze) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.zza.stop();
                }
                if (i >= 35 && (zzsmVar3 = this.zzd) != null) {
                    zzsmVar3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            } catch (Throwable th2) {
                if (!this.zze) {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30 && i4 < 33) {
                        this.zza.stop();
                    }
                    if (i4 >= 35 && (zzsmVar2 = this.zzd) != null) {
                        zzsmVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (Build.VERSION.SDK_INT >= 35 && (zzsmVar = this.zzd) != null) {
                zzsmVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final boolean zzl(zzsp zzspVar) {
        this.zzb.zzg(zzspVar);
        return true;
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
        this.zzc.zzd(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzp(int i) {
        this.zza.setVideoScalingMode(i);
    }

    public final /* synthetic */ void zzq(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzsm zzsmVar;
        zzsg zzsgVar = this.zzb;
        MediaCodec mediaCodec = this.zza;
        zzsgVar.zza(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        this.zzc.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzsmVar = this.zzd) != null) {
            zzsmVar.zzb(mediaCodec);
        }
        this.zzf = 1;
    }
}
