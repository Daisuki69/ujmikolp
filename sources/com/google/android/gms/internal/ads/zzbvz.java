package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbvz extends zzaya implements zzbwa {
    public zzbvz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwa zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbwa ? (zzbwa) iInterfaceQueryLocalInterface : new zzbvy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        zzbwh zzbwfVar = null;
        zzbwh zzbwfVar2 = null;
        zzbwi zzbwiVar = null;
        zzbwd zzbwbVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwfVar = iInterfaceQueryLocalInterface instanceof zzbwh ? (zzbwh) iInterfaceQueryLocalInterface : new zzbwf(strongBinder);
                }
                zzayb.zzh(parcel);
                zzc(zzmVar, zzbwfVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbwbVar = iInterfaceQueryLocalInterface2 instanceof zzbwd ? (zzbwd) iInterfaceQueryLocalInterface2 : new zzbwb(strongBinder2);
                }
                zzayb.zzh(parcel);
                zze(zzbwbVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                int i6 = zzayb.zza;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzb(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbwiVar = iInterfaceQueryLocalInterface3 instanceof zzbwi ? (zzbwi) iInterfaceQueryLocalInterface3 : new zzbwi(strongBinder3);
                }
                zzayb.zzh(parcel);
                zzs(zzbwiVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbwo zzbwoVar = (zzbwo) zzayb.zzb(parcel, zzbwo.CREATOR);
                zzayb.zzh(parcel);
                zzh(zzbwoVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzf(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzk(iObjectWrapperAsInterface2, zZza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvx zzbvxVarZzl = zzl();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbvxVarZzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzm = zzm();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzeaVarZzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdt zzdtVarZzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzo(zzdtVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwfVar2 = iInterfaceQueryLocalInterface4 instanceof zzbwh ? (zzbwh) iInterfaceQueryLocalInterface4 : new zzbwf(strongBinder4);
                }
                zzayb.zzh(parcel);
                zzd(zzmVar2, zzbwfVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZza2 = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzp(zZza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 17:
                long jZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(jZzq);
                return true;
            case 18:
                long j = parcel.readLong();
                zzayb.zzh(parcel);
                zzr(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
