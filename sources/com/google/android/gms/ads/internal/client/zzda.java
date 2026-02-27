package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzda extends zzaya implements zzdb {
    public zzda() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        zzdn zzdlVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                zzayb.zzh(parcel);
                zzf(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzayb.zzh(parcel);
                zzg(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                zzi(iObjectWrapperAsInterface, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzj(string3, iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i6 = zzayb.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzayb.zzh(parcel);
                zzn(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbox zzboxVarZzf = zzbow.zzf(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzo(zzboxVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzblr zzblrVarZzc = zzblq.zzc(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzp(zzblrVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 14:
                zzfv zzfvVar = (zzfv) zzayb.zzb(parcel, zzfv.CREATOR);
                zzayb.zzh(parcel);
                zzr(zzfvVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdlVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdlVar = iInterfaceQueryLocalInterface instanceof zzdn ? (zzdn) iInterfaceQueryLocalInterface : new zzdl(strongBinder);
                }
                zzayb.zzh(parcel);
                zzt(zzdlVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZza2 = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzu(zZza2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzayb.zzh(parcel);
                zzv(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
