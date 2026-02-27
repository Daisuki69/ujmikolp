package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbj extends com.google.android.gms.internal.location.zza implements zzbl {
    public zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.location.zzbl
    public final void zzd(Location location) throws RemoteException {
        throw null;
    }
}
