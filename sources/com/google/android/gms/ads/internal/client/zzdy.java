package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdy extends zzaxz implements zzea {
    public zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zze() throws RemoteException {
        Parcel parcelZzde = zzde(1, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzf() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final List zzg() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzde.createTypedArrayList(zzv.CREATOR);
        parcelZzde.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzv zzh() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        zzv zzvVar = (zzv) zzayb.zzb(parcelZzde, zzv.CREATOR);
        parcelZzde.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzj() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }
}
