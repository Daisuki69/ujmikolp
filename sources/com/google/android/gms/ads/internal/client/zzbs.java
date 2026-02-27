package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbs extends zzaya implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        zzbk zzbiVar = null;
        zzcs zzcsVar = null;
        switch (i) {
            case 1:
                zzbq zzbqVarZze = zze();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbqVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbiVar = iInterfaceQueryLocalInterface instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface : new zzbi(strongBinder);
                }
                zzayb.zzh(parcel);
                zzf(zzbiVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbgu zzbguVarZzb = zzbgt.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzg(zzbguVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbgx zzbgxVarZzb = zzbgw.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzh(zzbgxVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbhd zzbhdVarZzb = zzbhc.zzb(parcel.readStrongBinder());
                zzbha zzbhaVarZzb = zzbgz.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzi(string, zzbhdVarZzb, zzbhaVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbfl zzbflVar = (zzbfl) zzayb.zzb(parcel, zzbfl.CREATOR);
                zzayb.zzh(parcel);
                zzj(zzbflVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcsVar = iInterfaceQueryLocalInterface2 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface2 : new zzcs(strongBinder2);
                }
                zzayb.zzh(parcel);
                zzq(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbhh zzbhhVarZzb = zzbhg.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                zzayb.zzh(parcel);
                zzk(zzbhhVarZzb, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzayb.zzb(parcel, PublisherAdViewOptions.CREATOR);
                zzayb.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbhk zzbhkVarZzb = zzbhj.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzm(zzbhkVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzblw zzblwVar = (zzblw) zzayb.zzb(parcel, zzblw.CREATOR);
                zzayb.zzh(parcel);
                zzn(zzblwVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmf zzbmfVarZzb = zzbme.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzo(zzbmfVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzayb.zzb(parcel, AdManagerAdViewOptions.CREATOR);
                zzayb.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
