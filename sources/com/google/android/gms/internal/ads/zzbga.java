package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public interface zzbga extends IInterface {
    void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzc(String str) throws RemoteException;

    void zzd(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdG(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdH(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdI(@Nullable zzbft zzbftVar) throws RemoteException;

    void zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    void zzg(IObjectWrapper iObjectWrapper) throws RemoteException;
}
