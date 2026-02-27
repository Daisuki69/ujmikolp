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
public final class zzbho extends zzaxz implements zzbhq {
    public zzbho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzde = zzde(24, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzB(com.google.android.gms.ads.internal.client.zzdj zzdjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzdjVar);
        zzdf(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzC(com.google.android.gms.ads.internal.client.zzdf zzdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzdfVar);
        zzdf(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzD() throws RemoteException {
        zzdf(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzE() throws RemoteException {
        zzdf(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbft zzF() throws RemoteException {
        zzbft zzbfrVar;
        Parcel parcelZzde = zzde(29, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbfrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbfrVar = iInterfaceQueryLocalInterface instanceof zzbft ? (zzbft) iInterfaceQueryLocalInterface : new zzbfr(strongBinder);
        }
        parcelZzde.recycle();
        return zzbfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzde = zzde(30, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final com.google.android.gms.ads.internal.client.zzea zzH() throws RemoteException {
        Parcel parcelZzde = zzde(31, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzI(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzdtVar);
        zzdf(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzJ(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzdf(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final long zzK() throws RemoteException {
        Parcel parcelZzde = zzde(34, zza());
        long j = parcelZzde.readLong();
        parcelZzde.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzL(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzdf(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zze() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final List zzf() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListZzf = zzayb.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzg() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbfw zzh() throws RemoteException {
        zzbfw zzbfuVar;
        Parcel parcelZzde = zzde(5, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbfuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfuVar = iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfu(strongBinder);
        }
        parcelZzde.recycle();
        return zzbfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzi() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzj() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final double zzk() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        double d10 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzl() throws RemoteException {
        Parcel parcelZzde = zzde(9, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzm() throws RemoteException {
        Parcel parcelZzde = zzde(10, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        Parcel parcelZzde = zzde(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzp() throws RemoteException {
        zzdf(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbfp zzq() throws RemoteException {
        zzbfp zzbfnVar;
        Parcel parcelZzde = zzde(14, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbfnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbfnVar = iInterfaceQueryLocalInterface instanceof zzbfp ? (zzbfp) iInterfaceQueryLocalInterface : new zzbfn(strongBinder);
        }
        parcelZzde.recycle();
        return zzbfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzdf(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        Parcel parcelZzde = zzde(16, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzdf(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final IObjectWrapper zzu() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final IObjectWrapper zzv() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final Bundle zzw() throws RemoteException {
        Parcel parcelZzde = zzde(20, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzx(zzbhn zzbhnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbhnVar);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzy() throws RemoteException {
        zzdf(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final List zzz() throws RemoteException {
        Parcel parcelZzde = zzde(23, zza());
        ArrayList arrayListZzf = zzayb.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }
}
