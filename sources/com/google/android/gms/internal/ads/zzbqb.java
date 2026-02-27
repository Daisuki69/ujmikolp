package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqb extends zzbpc {
    private final Adapter zza;
    private final zzbvs zzb;

    public zzbqb(Adapter adapter, zzbvs zzbvsVar) {
        this.zza = adapter;
        this.zzb = zzbvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zze() throws RemoteException {
        zzbvs zzbvsVar = this.zzb;
        if (zzbvsVar != null) {
            zzbvsVar.zzl(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzf() throws RemoteException {
        zzbvs zzbvsVar = this.zzb;
        if (zzbvsVar != null) {
            zzbvsVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzg(int i) throws RemoteException {
        zzbvs zzbvsVar = this.zzb;
        if (zzbvsVar != null) {
            zzbvsVar.zzm(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzi() throws RemoteException {
        zzbvs zzbvsVar = this.zzb;
        if (zzbvsVar != null) {
            zzbvsVar.zzh(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzj() throws RemoteException {
        zzbvs zzbvsVar = this.zzb;
        if (zzbvsVar != null) {
            zzbvsVar.zzg(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzk() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzl(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzm(zzbgq zzbgqVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzo() throws RemoteException {
        zzbvs zzbvsVar = this.zzb;
        if (zzbvsVar != null) {
            zzbvsVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzp(@Nullable zzbvt zzbvtVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzr(zzbvx zzbvxVar) throws RemoteException {
        zzbvs zzbvsVar = this.zzb;
        if (zzbvsVar != null) {
            zzbvsVar.zzk(ObjectWrapper.wrap(this.zza), new zzbvt(zzbvxVar.zze(), zzbvxVar.zzf()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzs(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzt() throws RemoteException {
        zzbvs zzbvsVar = this.zzb;
        if (zzbvsVar != null) {
            zzbvsVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzu() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzw(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzz() throws RemoteException {
        zzbvs zzbvsVar = this.zzb;
        if (zzbvsVar != null) {
            zzbvsVar.zzp(ObjectWrapper.wrap(this.zza));
        }
    }
}
