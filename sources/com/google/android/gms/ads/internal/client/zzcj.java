package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbwa;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcj extends zzaya implements zzck {
    public zzcj() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        zzce zzccVar = null;
        zzch zzcfVar = null;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzft.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzccVar = iInterfaceQueryLocalInterface instanceof zzce ? (zzce) iInterfaceQueryLocalInterface : new zzcc(strongBinder);
                }
                zzayb.zzh(parcel);
                zze(arrayListCreateTypedArrayList, zzccVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzf = zzf(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzf ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                zzbwa zzbwaVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbwaVarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzh = zzh(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzayb.zzh(parcel);
                zzbab zzbabVarZzi = zzi(string4);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbabVarZzi);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzj = zzj(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzayb.zzh(parcel);
                zzbx zzbxVarZzk = zzk(string6);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbxVarZzk);
                return true;
            case 8:
                zzbow.zzf(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                zzft zzftVar = (zzft) zzayb.zzb(parcel, zzft.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzch ? (zzch) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzayb.zzh(parcel);
                boolean zZzm = zzm(string7, zzftVar, zzcfVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 10:
                int i6 = parcel.readInt();
                String string8 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzn = zzn(i6, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                zzayb.zzh(parcel);
                zzbx zzbxVarZzo = zzo(string9);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbxVarZzo);
                return true;
            case 12:
                String string10 = parcel.readString();
                zzayb.zzh(parcel);
                zzbab zzbabVarZzp = zzp(string10);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbabVarZzp);
                return true;
            case 13:
                String string11 = parcel.readString();
                zzayb.zzh(parcel);
                zzbwa zzbwaVarZzq = zzq(string11);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbwaVarZzq);
                return true;
            case 14:
                int i10 = parcel.readInt();
                String string12 = parcel.readString();
                zzayb.zzh(parcel);
                zzft zzftVarZzr = zzr(i10, string12);
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzftVarZzr);
                return true;
            case 15:
                int i11 = parcel.readInt();
                zzayb.zzh(parcel);
                Bundle bundleZzs = zzs(i11);
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzs);
                return true;
            case 16:
                int i12 = parcel.readInt();
                String string13 = parcel.readString();
                zzayb.zzh(parcel);
                int iZzt = zzt(i12, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iZzt);
                return true;
            case 17:
                int i13 = parcel.readInt();
                String string14 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zZzu = zzu(i13, string14);
                parcel2.writeNoException();
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 18:
                int i14 = parcel.readInt();
                zzayb.zzh(parcel);
                zzv(i14);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
