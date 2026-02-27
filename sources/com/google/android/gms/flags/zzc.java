package com.google.android.gms.flags;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public interface zzc extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z4, int i) throws RemoteException;

    int getIntFlagValue(String str, int i, int i4) throws RemoteException;

    long getLongFlagValue(String str, long j, int i) throws RemoteException;

    String getStringFlagValue(String str, String str2, int i) throws RemoteException;

    void init(IObjectWrapper iObjectWrapper) throws RemoteException;
}
