package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpi extends zzaxz implements IInterface {
    public zzbpi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final List zzf() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListZzf = zzayb.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }

    public final String zzg() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final zzbfw zzh() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        zzbfw zzbfwVarZzh = zzbfv.zzh(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbfwVarZzh;
    }

    public final String zzi() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final double zzj() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        double d10 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d10;
    }

    public final String zzk() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzde = zzde(9, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final void zzm() throws RemoteException {
        zzdf(10, zza());
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(11, parcelZza);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(12, parcelZza);
    }

    public final boolean zzp() throws RemoteException {
        Parcel parcelZzde = zzde(13, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel parcelZzde = zzde(14, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel parcelZzde = zzde(15, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(16, parcelZza);
    }

    public final com.google.android.gms.ads.internal.client.zzed zzt() throws RemoteException {
        Parcel parcelZzde = zzde(17, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(18, zza()));
    }

    public final zzbfp zzv() throws RemoteException {
        Parcel parcelZzde = zzde(19, zza());
        zzbfp zzbfpVarZzj = zzbfo.zzj(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbfpVarZzj;
    }

    public final IObjectWrapper zzw() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(20, zza()));
    }

    public final IObjectWrapper zzx() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(21, zza()));
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, iObjectWrapper2);
        zzayb.zze(parcelZza, iObjectWrapper3);
        zzdf(22, parcelZza);
    }
}
