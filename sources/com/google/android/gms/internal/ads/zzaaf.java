package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzaaf extends HandlerThread implements Handler.Callback {
    private zzdh zza;
    private Handler zzb;

    @Nullable
    private Error zzc;

    @Nullable
    private RuntimeException zzd;

    @Nullable
    private zzaag zze;

    public zzaaf() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdh zzdhVar;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        int i4 = message.arg1;
                        zzdh zzdhVar2 = this.zza;
                        if (zzdhVar2 == null) {
                            throw null;
                        }
                        zzdhVar2.zza(i4);
                        this.zze = new zzaag(this, this.zza.zzc(), i4 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (zzdi e) {
                        zzds.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.zzd = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e7) {
                    zzds.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.zzc = e7;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    zzds.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.zzd = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    zzdhVar = this.zza;
                } finally {
                    try {
                    } finally {
                    }
                }
                if (zzdhVar == null) {
                    throw null;
                }
                zzdhVar.zzb();
                return true;
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzaag zza(int i) {
        boolean z4;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdh(handler, null);
        synchronized (this) {
            z4 = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzaag zzaagVar = this.zze;
        zzaagVar.getClass();
        return zzaagVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
