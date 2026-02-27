package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface zzbun extends IInterface {
    @Deprecated
    void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException;

    void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuv zzbuvVar) throws RemoteException;
}
