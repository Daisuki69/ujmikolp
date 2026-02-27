package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyx extends zzdyv {
    private final Context zzg;
    private final Executor zzh;

    public zzdyx(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbua(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzf(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznM)).booleanValue() ? new zzdyu(this.zza, this.zze) : new zzdyt(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdzk(1));
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "RemoteSignalsClientTask.onConnected");
                        this.zza.zzd(new zzdzk(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final S1.y zza(zzbuv zzbuvVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbuvVar;
                this.zzf.checkAvailabilityAndConnect();
                zzbzm zzbzmVar = this.zza;
                zzbzmVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzbzh.zzg);
                zzdyv.zzc(this.zzg, zzbzmVar, this.zzh);
                return zzbzmVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
