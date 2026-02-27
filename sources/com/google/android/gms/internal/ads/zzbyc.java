package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyc extends zzaxz implements zzbye {
    public zzbyc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zze(IObjectWrapper iObjectWrapper, zzbyi zzbyiVar, zzbyb zzbybVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zzc(parcelZza, zzbyiVar);
        zzayb.zze(parcelZza, zzbybVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzi(zzbto zzbtoVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, iObjectWrapper3);
        return androidx.media3.datasource.cache.c.f(zzde(11, parcelZza));
    }
}
