package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzged extends zzaxz implements zzgef {
    public zzged(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final void zze(String str, Bundle bundle, zzgeh zzgehVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayb.zzc(parcelZza, bundle);
        zzayb.zze(parcelZza, zzgehVar);
        zzdg(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final void zzf(Bundle bundle, zzgeh zzgehVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzayb.zze(parcelZza, zzgehVar);
        zzdg(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final void zzg(Bundle bundle, zzgeh zzgehVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzayb.zze(parcelZza, zzgehVar);
        zzdg(3, parcelZza);
    }
}
