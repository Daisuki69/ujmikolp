package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdz extends zzaya implements zzea {
    public zzdz() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzea zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        switch (i) {
            case 1:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 3:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 4:
                zzv zzvVarZzh = zzh();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzvVarZzh);
                return true;
            case 5:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzi);
                return true;
            case 6:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            default:
                return false;
        }
    }
}
