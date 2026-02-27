package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvy extends zzaxz implements zzbwa {
    public zzbvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwh zzbwhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, zzbwhVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwh zzbwhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, zzbwhVar);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(zzbwd zzbwdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbwdVar);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzdqVar);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final Bundle zzg() throws RemoteException {
        Parcel parcelZzde = zzde(9, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh(zzbwo zzbwoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbwoVar);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z4) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final zzbvx zzl() throws RemoteException {
        zzbvx zzbvvVar;
        Parcel parcelZzde = zzde(11, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbvvVar = iInterfaceQueryLocalInterface instanceof zzbvx ? (zzbvx) iInterfaceQueryLocalInterface : new zzbvv(strongBinder);
        }
        parcelZzde.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final com.google.android.gms.ads.internal.client.zzea zzm() throws RemoteException {
        Parcel parcelZzde = zzde(12, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzn() throws RemoteException {
        Parcel parcelZzde = zzde(16, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzdtVar);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzp(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayb.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdf(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final long zzq() throws RemoteException {
        Parcel parcelZzde = zzde(17, zza());
        long j = parcelZzde.readLong();
        parcelZzde.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzr(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzdf(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(zzbwi zzbwiVar) throws RemoteException {
        throw null;
    }
}
