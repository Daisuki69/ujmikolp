package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdd extends zzaxz implements zzdf {
    public zzdd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdf
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }
}
