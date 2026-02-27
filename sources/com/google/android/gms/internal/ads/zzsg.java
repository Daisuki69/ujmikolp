package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
final class zzsg extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;

    @Nullable
    @GuardedBy("lock")
    private MediaFormat zzh;

    @Nullable
    @GuardedBy("lock")
    private MediaFormat zzi;

    @Nullable
    @GuardedBy("lock")
    private MediaCodec.CodecException zzj;

    @Nullable
    @GuardedBy("lock")
    private MediaCodec.CryptoException zzk;

    @GuardedBy("lock")
    private long zzl;

    @GuardedBy("lock")
    private boolean zzm;

    @Nullable
    @GuardedBy("lock")
    private IllegalStateException zzn;

    @Nullable
    @GuardedBy("lock")
    private zzsp zzo;
    private final Object zza = new Object();

    @GuardedBy("lock")
    private final CircularIntArray zzd = new CircularIntArray();

    @GuardedBy("lock")
    private final CircularIntArray zze = new CircularIntArray();

    @GuardedBy("lock")
    private final ArrayDeque zzf = new ArrayDeque();

    @GuardedBy("lock")
    private final ArrayDeque zzg = new ArrayDeque();

    public zzsg(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    @GuardedBy("lock")
    private final void zzi() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        arrayDeque.clear();
    }

    @GuardedBy("lock")
    private final boolean zzj() {
        return this.zzl > 0 || this.zzm;
    }

    @GuardedBy("lock")
    private final void zzk(MediaFormat mediaFormat) {
        this.zze.addLast(-2);
        this.zzg.add(mediaFormat);
    }

    @GuardedBy("lock")
    private final void zzl() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            try {
                this.zzd.addLast(i);
                zzsp zzspVar = this.zzo;
                if (zzspVar != null) {
                    zzsz zzszVar = ((zzsx) zzspVar).zza;
                    if (zzszVar.zzbc() != null) {
                        zzszVar.zzbc().zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzk(mediaFormat);
                    this.zzi = null;
                }
                this.zze.addLast(i);
                this.zzf.add(bufferInfo);
                zzsp zzspVar = this.zzo;
                if (zzspVar != null) {
                    zzsz zzszVar = ((zzsx) zzspVar).zza;
                    if (zzszVar.zzbc() != null) {
                        zzszVar.zzbc().zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzk(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzghc.zzh(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzi();
        }
    }

    public final int zzc() {
        synchronized (this.zza) {
            try {
                zzl();
                int iPopFirst = -1;
                if (zzj()) {
                    return -1;
                }
                CircularIntArray circularIntArray = this.zzd;
                if (!circularIntArray.isEmpty()) {
                    iPopFirst = circularIntArray.popFirst();
                }
                return iPopFirst;
            } finally {
            }
        }
    }

    public final int zzd(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzl();
                if (zzj()) {
                    return -1;
                }
                CircularIntArray circularIntArray = this.zze;
                if (circularIntArray.isEmpty()) {
                    return -1;
                }
                int iPopFirst = circularIntArray.popFirst();
                if (iPopFirst >= 0) {
                    if (this.zzh == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iPopFirst == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    iPopFirst = -2;
                }
                return iPopFirst;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final MediaFormat zze() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public final void zzf() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzeo.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final void zzg(zzsp zzspVar) {
        synchronized (this.zza) {
            this.zzo = zzspVar;
        }
    }

    public final /* synthetic */ void zzh() {
        Object obj = this.zza;
        synchronized (obj) {
            try {
                if (this.zzm) {
                    return;
                }
                long j = this.zzl - 1;
                this.zzl = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    zzi();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.zzn = illegalStateException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
