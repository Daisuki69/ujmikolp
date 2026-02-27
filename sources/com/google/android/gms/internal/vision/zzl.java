package com.google.android.gms.internal.vision;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.vision.barcode.Barcode;

/* JADX INFO: loaded from: classes3.dex */
public interface zzl extends IInterface {
    void zza() throws RemoteException;

    Barcode[] zza(IObjectWrapper iObjectWrapper, zzs zzsVar) throws RemoteException;

    Barcode[] zzb(IObjectWrapper iObjectWrapper, zzs zzsVar) throws RemoteException;
}
