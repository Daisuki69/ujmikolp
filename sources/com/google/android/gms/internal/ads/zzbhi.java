package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhi extends zzaxz implements zzbhk {
    public zzbhi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void zze(zzbhq zzbhqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbhqVar);
        zzdf(1, parcelZza);
    }
}
