package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbow extends zzaya implements zzbox {
    public zzbow() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbox zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbox ? (zzbox) iInterfaceQueryLocalInterface : new zzbov(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            zzayb.zzh(parcel);
            zzbpa zzbpaVarZzb = zzb(string);
            parcel2.writeNoException();
            zzayb.zze(parcel2, zzbpaVarZzb);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzayb.zzh(parcel);
            boolean zZzc = zzc(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzc ? 1 : 0);
        } else if (i == 3) {
            String string3 = parcel.readString();
            zzayb.zzh(parcel);
            zzbqw zzbqwVarZze = zze(string3);
            parcel2.writeNoException();
            zzayb.zze(parcel2, zzbqwVarZze);
        } else {
            if (i != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzayb.zzh(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
