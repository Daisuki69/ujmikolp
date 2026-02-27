package com.google.android.gms.vision.face.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzs;

/* JADX INFO: loaded from: classes3.dex */
public interface zzh extends IInterface {
    void zza() throws RemoteException;

    boolean zza(int i) throws RemoteException;

    FaceParcel[] zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i, int i4, int i6, int i10, int i11, int i12, zzs zzsVar) throws RemoteException;

    FaceParcel[] zza(IObjectWrapper iObjectWrapper, zzs zzsVar) throws RemoteException;
}
