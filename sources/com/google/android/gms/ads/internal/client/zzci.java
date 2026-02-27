package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwa;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzci extends zzaxz implements zzck {
    public zzci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zze(List list, zzce zzceVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzayb.zze(parcelZza, zzceVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(2, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbwa zzg(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(3, parcelZza);
        zzbwa zzbwaVarZzt = zzbvz.zzt(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbwaVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(4, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbab zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(5, parcelZza);
        zzbab zzbabVarZzb = zzbaa.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbabVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzj(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(6, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzk(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(7, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(strongBinder);
        }
        parcelZzde.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzl(zzbox zzboxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzboxVar);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzm(String str, zzft zzftVar, zzch zzchVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayb.zzc(parcelZza, zzftVar);
        zzayb.zze(parcelZza, zzchVar);
        Parcel parcelZzde = zzde(9, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzn(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(10, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzo(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(11, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(strongBinder);
        }
        parcelZzde.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbab zzp(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(12, parcelZza);
        zzbab zzbabVarZzb = zzbaa.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbabVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbwa zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(13, parcelZza);
        zzbwa zzbwaVarZzt = zzbvz.zzt(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbwaVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzft zzr(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(14, parcelZza);
        zzft zzftVar = (zzft) zzayb.zzb(parcelZzde, zzft.CREATOR);
        parcelZzde.recycle();
        return zzftVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final Bundle zzs(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        Parcel parcelZzde = zzde(15, parcelZza);
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final int zzt(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(16, parcelZza);
        int i4 = parcelZzde.readInt();
        parcelZzde.recycle();
        return i4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzu(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(17, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzv(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdf(18, parcelZza);
    }
}
