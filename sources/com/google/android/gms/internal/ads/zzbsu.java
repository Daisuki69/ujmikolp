package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsu extends zzaxz implements zzbsw {
    public zzbsu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzH(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzdf(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze() throws RemoteException {
        zzdf(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf() throws RemoteException {
        zzdf(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzde = zzde(11, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzk() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzl() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzm(int i, int i4, Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeInt(i4);
        zzayb.zzc(parcelZza, intent);
        zzdf(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzo(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        Parcel parcelZzde = zzde(6, parcelZza);
        if (parcelZzde.readInt() != 0) {
            bundle.readFromParcel(parcelZzde);
        }
        parcelZzde.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzp() throws RemoteException {
        zzdf(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzq() throws RemoteException {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzs() throws RemoteException {
        zzdf(9, zza());
    }
}
