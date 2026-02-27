package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbgm extends zzaya implements zzbgn {
    public zzbgm() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper iObjectWrapperZzb = zzb();
                parcel2.writeNoException();
                zzayb.zze(parcel2, iObjectWrapperZzb);
                return true;
            case 3:
                String strZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 4:
                List listZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(listZzd);
                return true;
            case 5:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 6:
                zzbfw zzbfwVarZzf = zzf();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbfwVarZzf);
                return true;
            case 7:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 8:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzi);
                return true;
            case 10:
                zzj();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzed zzedVarZzk = zzk();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzedVarZzk);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                boolean zZzm = zzm(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                zzn(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbfp zzbfpVarZzo = zzo();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbfpVarZzo);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperZzp = zzp();
                parcel2.writeNoException();
                zzayb.zze(parcel2, iObjectWrapperZzp);
                return true;
            case 17:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            default:
                return false;
        }
    }
}
