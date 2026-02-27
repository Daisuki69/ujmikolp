package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpo extends zzaxz implements IInterface {
    public zzfpo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfpm zze(zzfpk zzfpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzfpkVar);
        Parcel parcelZzde = zzde(1, parcelZza);
        zzfpm zzfpmVar = (zzfpm) zzayb.zzb(parcelZzde, zzfpm.CREATOR);
        parcelZzde.recycle();
        return zzfpmVar;
    }

    public final void zzf(zzfph zzfphVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzfphVar);
        zzdf(2, parcelZza);
    }

    public final zzfpv zzg(zzfpt zzfptVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzfptVar);
        Parcel parcelZzde = zzde(3, parcelZza);
        zzfpv zzfpvVar = (zzfpv) zzayb.zzb(parcelZzde, zzfpv.CREATOR);
        parcelZzde.recycle();
        return zzfpvVar;
    }
}
