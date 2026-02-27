package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbyd extends zzaya implements zzbye {
    public zzbyd() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbye zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzbye ? (zzbye) iInterfaceQueryLocalInterface : new zzbyc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        zzbyb zzbxzVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbyi zzbyiVar = (zzbyi) zzayb.zzb(parcel, zzbyi.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbxzVar = iInterfaceQueryLocalInterface instanceof zzbyb ? (zzbyb) iInterfaceQueryLocalInterface : new zzbxz(strongBinder);
                }
                zzayb.zzh(parcel);
                zze(iObjectWrapperAsInterface, zzbyiVar, zzbxzVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzf(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtl zzbtlVarZzb = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzg(arrayListCreateTypedArrayList, iObjectWrapperAsInterface3, zzbtlVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtl zzbtlVarZzb2 = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzh(arrayListCreateTypedArrayList2, iObjectWrapperAsInterface4, zzbtlVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbto zzbtoVar = (zzbto) zzayb.zzb(parcel, zzbto.CREATOR);
                zzayb.zzh(parcel);
                zzi(zzbtoVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzj(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtl zzbtlVarZzb3 = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzk(arrayListCreateTypedArrayList3, iObjectWrapperAsInterface6, zzbtlVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtl zzbtlVarZzb4 = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzl(arrayListCreateTypedArrayList4, iObjectWrapperAsInterface7, zzbtlVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                IObjectWrapper iObjectWrapperZzm = zzm(iObjectWrapperAsInterface8, iObjectWrapperAsInterface9, string, iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                zzayb.zze(parcel2, iObjectWrapperZzm);
                return true;
            default:
                return false;
        }
    }
}
