package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public interface zzblz extends IInterface {
    com.google.android.gms.ads.internal.client.zzed zzb() throws RemoteException;

    void zzc() throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper, zzbmc zzbmcVar) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzbft zzf() throws RemoteException;
}
