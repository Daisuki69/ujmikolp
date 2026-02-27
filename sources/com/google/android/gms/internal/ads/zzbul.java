package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbul extends zzaxz implements zzbun {
    public zzbul(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, parcelFileDescriptor);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbaVar);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuv zzbuvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, parcelFileDescriptor);
        zzayb.zzc(parcelZza, zzbuvVar);
        zzdf(3, parcelZza);
    }
}
