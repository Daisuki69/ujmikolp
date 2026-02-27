package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvv extends zzaxz implements zzbvx {
    public zzbvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final String zze() throws RemoteException {
        Parcel parcelZzde = zzde(1, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final int zzf() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        int i = parcelZzde.readInt();
        parcelZzde.recycle();
        return i;
    }
}
