package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpk extends zzaxz implements zzbpm {
    public zzbpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzA() throws RemoteException {
        Parcel parcelZzde = zzde(24, zza());
        float f = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzB() throws RemoteException {
        Parcel parcelZzde = zzde(25, zza());
        float f = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzC() throws RemoteException {
        zzdf(26, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zze() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final List zzf() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListZzf = zzayb.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzg() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfw zzh() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        zzbfw zzbfwVarZzh = zzbfv.zzh(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbfwVarZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzi() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzj() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final double zzk() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        double d10 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzl() throws RemoteException {
        Parcel parcelZzde = zzde(9, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzm() throws RemoteException {
        Parcel parcelZzde = zzde(10, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        Parcel parcelZzde = zzde(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfp zzo() throws RemoteException {
        Parcel parcelZzde = zzde(12, zza());
        zzbfp zzbfpVarZzj = zzbfo.zzj(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbfpVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzp() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzq() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzr() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final Bundle zzs() throws RemoteException {
        Parcel parcelZzde = zzde(16, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzde = zzde(17, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzu() throws RemoteException {
        Parcel parcelZzde = zzde(18, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzv() throws RemoteException {
        zzdf(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, iObjectWrapper2);
        zzayb.zze(parcelZza, iObjectWrapper3);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzz() throws RemoteException {
        Parcel parcelZzde = zzde(23, zza());
        float f = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f;
    }
}
