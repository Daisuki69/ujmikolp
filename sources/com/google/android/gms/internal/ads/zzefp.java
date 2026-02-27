package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefp extends zzbvr implements zzcxc {
    private zzbvs zza;
    private zzcxb zzb;
    private zzdek zzc;

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zza(zzcxb zzcxbVar) {
        this.zzb = zzcxbVar;
    }

    public final synchronized void zzc(zzbvs zzbvsVar) {
        this.zza = zzbvsVar;
    }

    public final synchronized void zzd(zzdek zzdekVar) {
        this.zzc = zzdekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdek zzdekVar = this.zzc;
        if (zzdekVar != null) {
            final zzeec zzeecVar = ((zzeip) zzdekVar).zzc;
            final zzfcj zzfcjVar = ((zzeip) zzdekVar).zzb;
            final zzfcu zzfcuVar = ((zzeip) zzdekVar).zza;
            final zzeip zzeipVar = (zzeip) zzdekVar;
            ((zzeip) zzdekVar).zzd.zzc().execute(new Runnable(zzeipVar, zzfcuVar, zzfcjVar, zzeecVar) { // from class: com.google.android.gms.internal.ads.zzeio
                private final /* synthetic */ zzfcu zza;
                private final /* synthetic */ zzfcj zzb;
                private final /* synthetic */ zzeec zzc;

                {
                    this.zza = zzfcuVar;
                    this.zzb = zzfcjVar;
                    this.zzc = zzeecVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeis.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdek zzdekVar = this.zzc;
        if (zzdekVar != null) {
            String str = ((zzeip) zzdekVar).zzc.zza;
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcxb zzcxbVar = this.zzb;
        if (zzcxbVar != null) {
            zzcxbVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            zzbvsVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzbvt zzbvtVar) throws RemoteException {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzd.zzb(zzbvtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcxb zzcxbVar = this.zzb;
        if (zzcxbVar != null) {
            zzcxbVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvs zzbvsVar = this.zza;
        if (zzbvsVar != null) {
            ((zzeir) zzbvsVar).zzd.zzb(null);
        }
    }
}
