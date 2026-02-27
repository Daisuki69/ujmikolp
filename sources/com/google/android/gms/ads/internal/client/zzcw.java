package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcw extends zzaxz implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzbox getAdapterCreator() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        zzbox zzboxVarZzf = zzbow.zzf(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzboxVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzfc getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzde = zzde(1, zza());
        zzfc zzfcVar = (zzfc) zzayb.zzb(parcelZzde, zzfc.CREATOR);
        parcelZzde.recycle();
        return zzfcVar;
    }
}
