package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefo extends zzbpc implements zzcxc {
    private zzbpd zza;
    private zzcxb zzb;

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zza(zzcxb zzcxbVar) {
        this.zzb = zzcxbVar;
    }

    public final synchronized void zzc(zzbpd zzbpdVar) {
        this.zza = zzbpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zze() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzf() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzg(int i) throws RemoteException {
        zzcxb zzcxbVar = this.zzb;
        if (zzcxbVar != null) {
            zzcxbVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzh() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzi() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzj() throws RemoteException {
        try {
            zzbpd zzbpdVar = this.zza;
            if (zzbpdVar != null) {
                zzbpdVar.zzj();
            }
            zzcxb zzcxbVar = this.zzb;
            if (zzcxbVar != null) {
                zzcxbVar.zza();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzk() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzl(String str, String str2) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzm(zzbgq zzbgqVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzn() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzo() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzp(zzbvt zzbvtVar) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzp(zzbvtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzq() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzr(zzbvx zzbvxVar) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzr(zzbvxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzs(int i) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzt() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzu() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzv(String str) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzw(int i, String str) throws RemoteException {
        zzcxb zzcxbVar = this.zzb;
        if (zzcxbVar != null) {
            zzcxbVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzcxb zzcxbVar = this.zzb;
        if (zzcxbVar != null) {
            zzcxbVar.zzd(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzy(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void zzz() throws RemoteException {
        zzbpd zzbpdVar = this.zza;
        if (zzbpdVar != null) {
            zzbpdVar.zzz();
        }
    }
}
