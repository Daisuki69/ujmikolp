package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbum extends zzaya implements zzbun {
    public zzbum() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzayb.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzayb.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzayb.zzb(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzayb.zzh(parcel);
            zzf(zzbaVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzayb.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbuv zzbuvVar = (zzbuv) zzayb.zzb(parcel, zzbuv.CREATOR);
            zzayb.zzh(parcel);
            zzg(parcelFileDescriptor2, zzbuvVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
