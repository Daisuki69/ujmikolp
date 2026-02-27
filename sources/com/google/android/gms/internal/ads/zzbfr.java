package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfr extends zzaxz implements zzbft {
    public zzbfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zze() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        float f = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final IObjectWrapper zzg() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzh() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        float f = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzi() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        float f = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final com.google.android.gms.ads.internal.client.zzed zzj() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzde = zzde(10, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzm(zzbhe zzbheVar) throws RemoteException {
        throw null;
    }
}
