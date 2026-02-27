package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class zzfop implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    @VisibleForTesting
    protected final zzfpj zza;
    private final String zzb;
    private final String zzc;
    private final zzaxq zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfoh zzg;
    private final long zzh;

    public zzfop(Context context, int i, zzaxq zzaxqVar, String str, String str2, String str3, zzfoh zzfohVar) {
        this.zzb = str;
        this.zzd = zzaxqVar;
        this.zzc = str2;
        this.zzg = zzfohVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfpj zzfpjVar = new zzfpj(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfpjVar;
        this.zze = new LinkedBlockingQueue();
        zzfpjVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j, Exception exc) {
        zzfoh zzfohVar = this.zzg;
        if (zzfohVar != null) {
            zzfohVar.zzc(i, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfpo zzfpoVarZzc = zzc();
        if (zzfpoVarZzc != null) {
            try {
                zzfpv zzfpvVarZzg = zzfpoVarZzc.zzg(new zzfpt(1, this.zzd, this.zzb, this.zzc));
                zzd(5011, this.zzh, null);
                this.zze.put(zzfpvVarZzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzfpv(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzfpv(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfpv zza(int i) {
        zzfpv zzfpvVar;
        try {
            zzfpvVar = (zzfpv) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzd(2009, this.zzh, e);
            zzfpvVar = null;
        }
        zzd(3004, this.zzh, null);
        if (zzfpvVar != null) {
            if (zzfpvVar.zzc == 7) {
                zzfoh.zzg(3);
            } else {
                zzfoh.zzg(2);
            }
        }
        return zzfpvVar == null ? new zzfpv(null, 1) : zzfpvVar;
    }

    public final void zzb() {
        zzfpj zzfpjVar = this.zza;
        if (zzfpjVar != null) {
            if (zzfpjVar.isConnected() || zzfpjVar.isConnecting()) {
                zzfpjVar.disconnect();
            }
        }
    }

    public final zzfpo zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
