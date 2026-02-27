package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class zzse implements zzsr {

    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzde zzg;
    private boolean zzh;

    public zzse(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzde zzdeVar = new zzde(zzdb.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdeVar;
        this.zzf = new AtomicReference();
    }

    private static zzsd zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzsd();
                }
                return (zzsd) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    private static int[] zzj(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Nullable
    private static byte[] zzk(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzsc(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzb(int i, int i4, int i6, long j, int i10) {
        zzg();
        zzsd zzsdVarZzi = zzi();
        zzsdVarZzi.zza(i, 0, i6, j, i10);
        Handler handler = this.zze;
        String str = zzeo.zza;
        handler.obtainMessage(1, zzsdVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzc(int i, int i4, zzhd zzhdVar, long j, int i6) {
        zzg();
        zzsd zzsdVarZzi = zzi();
        zzsdVarZzi.zza(i, 0, 0, j, i6);
        MediaCodec.CryptoInfo cryptoInfo = zzsdVarZzi.zzd;
        cryptoInfo.numSubSamples = zzhdVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzhdVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzhdVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzhdVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzhdVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzhdVar.zzc;
        if (Build.VERSION.SDK_INT >= 24) {
            androidx.media3.common.util.d.m();
            cryptoInfo.setPattern(androidx.media3.common.util.d.f(zzhdVar.zzg, zzhdVar.zzh));
        }
        Handler handler = this.zze;
        String str = zzeo.zza;
        handler.obtainMessage(2, zzsdVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzeo.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzde zzdeVar = this.zzg;
                zzdeVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdeVar.zzc();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final /* synthetic */ void zzh(Message message) {
        int i = message.what;
        zzsd zzsdVar = null;
        if (i == 1) {
            zzsd zzsdVar2 = (zzsd) message.obj;
            try {
                this.zzc.queueInputBuffer(zzsdVar2.zza, 0, zzsdVar2.zzc, zzsdVar2.zze, zzsdVar2.zzf);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = this.zzf;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            zzsdVar = zzsdVar2;
        } else if (i == 2) {
            zzsd zzsdVar3 = (zzsd) message.obj;
            int i4 = zzsdVar3.zza;
            MediaCodec.CryptoInfo cryptoInfo = zzsdVar3.zzd;
            long j = zzsdVar3.zze;
            int i6 = zzsdVar3.zzf;
            try {
                synchronized (zzb) {
                    this.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e7) {
                AtomicReference atomicReference2 = this.zzf;
                while (!atomicReference2.compareAndSet(null, e7) && atomicReference2.get() == null) {
                }
            }
            zzsdVar = zzsdVar3;
        } else if (i == 3) {
            this.zzg.zza();
        } else if (i != 4) {
            AtomicReference atomicReference3 = this.zzf;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                this.zzc.setParameters((Bundle) message.obj);
            } catch (RuntimeException e10) {
                AtomicReference atomicReference4 = this.zzf;
                while (!atomicReference4.compareAndSet(null, e10) && atomicReference4.get() == null) {
                }
            }
        }
        if (zzsdVar != null) {
            ArrayDeque arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzsdVar);
            }
        }
    }
}
