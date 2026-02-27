package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfu extends zzaxz implements zzbfw {
    public zzbfu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final IObjectWrapper zzb() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Uri zzc() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        Uri uri = (Uri) zzayb.zzb(parcelZzde, Uri.CREATOR);
        parcelZzde.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final double zzd() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        double d10 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zze() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        int i = parcelZzde.readInt();
        parcelZzde.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzf() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        int i = parcelZzde.readInt();
        parcelZzde.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Map zzg() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        HashMap mapZzg = zzayb.zzg(parcelZzde);
        parcelZzde.recycle();
        return mapZzg;
    }
}
