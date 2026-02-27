package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbuh extends zzaxz implements zzbuj {
    public zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zze(zzbuv zzbuvVar, zzbun zzbunVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbuvVar);
        zzayb.zze(parcelZza, zzbunVar);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzf(zzbuv zzbuvVar, zzbun zzbunVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbuvVar);
        zzayb.zze(parcelZza, zzbunVar);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzg(zzbuv zzbuvVar, zzbun zzbunVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbuvVar);
        zzayb.zze(parcelZza, zzbunVar);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzh(String str, zzbun zzbunVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzbunVar);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzi(zzbuf zzbufVar, zzbuo zzbuoVar) throws RemoteException {
        throw null;
    }
}
