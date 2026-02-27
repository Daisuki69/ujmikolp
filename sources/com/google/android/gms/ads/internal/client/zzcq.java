package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbye;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcq extends zzaya implements zzcr {
    public zzcq() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                String string = parcel.readString();
                zzbox zzboxVarZzf = zzbow.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbx zzbxVarZzb = zzb(iObjectWrapperAsInterface, zzrVar, string, zzboxVarZzf, i6);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbxVarZzb);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                zzbox zzboxVarZzf2 = zzbow.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbx zzbxVarZzc = zzc(iObjectWrapperAsInterface2, zzrVar2, string2, zzboxVarZzf2, i10);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbxVarZzc);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbox zzboxVarZzf3 = zzbow.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbt zzbtVarZzd = zzd(iObjectWrapperAsInterface3, string3, zzboxVarZzf3, i11);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbtVarZzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbga zzbgaVarZze = zze(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbgaVarZze);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzboxVarZzf4 = zzbow.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbvk zzbvkVarZzf = zzf(iObjectWrapperAsInterface6, zzboxVarZzf4, i12);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbvkVarZzf);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbsw zzbswVarZzg = zzg(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbswVarZzg);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzayb.zzh(parcel);
                zzdb zzdbVarZzi = zzi(iObjectWrapperAsInterface8, i13);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzdbVarZzi);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i14 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbx zzbxVarZzj = zzj(iObjectWrapperAsInterface9, zzrVar3, string4, i14);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbxVarZzj);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbgg zzbggVarZzk = zzk(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbggVarZzk);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbox zzboxVarZzf5 = zzbow.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbwa zzbwaVarZzl = zzl(iObjectWrapperAsInterface13, string5, zzboxVarZzf5, i15);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbwaVarZzl);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                zzbox zzboxVarZzf6 = zzbow.zzf(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbx zzbxVarZzm = zzm(iObjectWrapperAsInterface14, zzrVar4, string6, zzboxVarZzf6, i16);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbxVarZzm);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzboxVarZzf7 = zzbow.zzf(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbye zzbyeVarZzn = zzn(iObjectWrapperAsInterface15, zzboxVarZzf7, i17);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbyeVarZzn);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzboxVarZzf8 = zzbow.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbsp zzbspVarZzo = zzo(iObjectWrapperAsInterface16, zzboxVarZzf8, i18);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbspVarZzo);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzboxVarZzf9 = zzbow.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                zzbkl zzbklVarZzc = zzbkk.zzc(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbko zzbkoVarZzp = zzp(iObjectWrapperAsInterface17, zzboxVarZzf9, i19, zzbklVarZzc);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbkoVarZzp);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzboxVarZzf10 = zzbow.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                zzayb.zzh(parcel);
                zzdw zzdwVarZzq = zzq(iObjectWrapperAsInterface18, zzboxVarZzf10, i20);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzdwVarZzq);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperAsInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzboxVarZzf11 = zzbow.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                zzayb.zzh(parcel);
                zzck zzckVarZzh = zzh(iObjectWrapperAsInterface19, zzboxVarZzf11, i21);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzckVarZzh);
                return true;
            default:
                return false;
        }
    }
}
