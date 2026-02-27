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
public final class zzbpj extends zzaxz implements IInterface {
    public zzbpj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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

    public final String zzj() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final void zzk() throws RemoteException {
        zzdf(8, zza());
    }

    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(9, parcelZza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(10, parcelZza);
    }

    public final boolean zzn() throws RemoteException {
        Parcel parcelZzde = zzde(11, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    public final boolean zzo() throws RemoteException {
        Parcel parcelZzde = zzde(12, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    public final Bundle zzp() throws RemoteException {
        Parcel parcelZzde = zzde(13, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(14, parcelZza);
    }

    public final IObjectWrapper zzr() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(15, zza()));
    }

    public final com.google.android.gms.ads.internal.client.zzed zzs() throws RemoteException {
        Parcel parcelZzde = zzde(16, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    public final zzbfp zzt() throws RemoteException {
        Parcel parcelZzde = zzde(19, zza());
        zzbfp zzbfpVarZzj = zzbfo.zzj(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbfpVarZzj;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(20, zza()));
    }

    public final IObjectWrapper zzv() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(21, zza()));
    }

    public final void zzw(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, iObjectWrapper2);
        zzayb.zze(parcelZza, iObjectWrapper3);
        zzdf(22, parcelZza);
    }
}
