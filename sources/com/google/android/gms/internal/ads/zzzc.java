package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.DefaultLoadControl;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"HandlerLeak"})
final class zzzc extends Handler implements Runnable {
    final /* synthetic */ zzzh zza;
    private final zzzd zzb;
    private final long zzc;

    @Nullable
    private zzyz zzd;

    @Nullable
    private IOException zze;
    private int zzf;

    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzc(zzzh zzzhVar, Looper looper, zzzd zzzdVar, zzyz zzyzVar, int i, long j) {
        super(looper);
        Objects.requireNonNull(zzzhVar);
        this.zza = zzzhVar;
        this.zzb = zzzdVar;
        this.zzd = zzyzVar;
        this.zzc = j;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.zzc;
        zzyz zzyzVar = this.zzd;
        zzyzVar.getClass();
        zzyzVar.zzC(this.zzb, jElapsedRealtime, j, this.zzf);
        this.zze = null;
        zzzh zzzhVar = this.zza;
        zzzc zzzcVarZzj = zzzhVar.zzj();
        zzzcVarZzj.getClass();
        zzzhVar.zzi().execute(zzzcVarZzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            zzd();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        zzzh zzzhVar = this.zza;
        zzzhVar.zzk(null);
        long j = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = jElapsedRealtime - j;
        zzyz zzyzVar = this.zzd;
        zzyzVar.getClass();
        if (this.zzh) {
            zzyzVar.zzA(this.zzb, jElapsedRealtime, j6, false);
            return;
        }
        int i4 = message.what;
        if (i4 == 2) {
            try {
                zzyzVar.zzB(this.zzb, jElapsedRealtime, j6);
                return;
            } catch (RuntimeException e) {
                zzds.zzf("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzl(new zzzg(e));
                return;
            }
        }
        if (i4 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i6 = this.zzf + 1;
        this.zzf = i6;
        zzzb zzzbVarZzz = zzyzVar.zzz(this.zzb, jElapsedRealtime, j6, iOException, i6);
        if (zzzbVarZzz.zzb() == 3) {
            zzzhVar.zzl(this.zze);
        } else if (zzzbVarZzz.zzb() != 2) {
            if (zzzbVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzzbVarZzz.zzc() != androidx.media3.common.C.TIME_UNSET ? zzzbVarZzz.zzc() : Math.min((this.zzf - 1) * 1000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z4) {
                zzzd zzzdVar = this.zzb;
                String simpleName = zzzdVar.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    zzzdVar.zzc();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e7) {
            if (this.zzi) {
                return;
            }
            zzds.zzf("LoadTask", "Unexpected exception loading stream", e7);
            obtainMessage(3, new zzzg(e7)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.zzi) {
                return;
            }
            zzds.zzf("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(3, new zzzg(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.zzi) {
                zzds.zzf("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }

    public final void zza(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        zzzh zzzhVar = this.zza;
        zzghc.zzh(zzzhVar.zzj() == null);
        zzzhVar.zzk(this);
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z4) {
        this.zzi = z4;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z4) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z4) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzyz zzyzVar = this.zzd;
            zzyzVar.getClass();
            zzyzVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
