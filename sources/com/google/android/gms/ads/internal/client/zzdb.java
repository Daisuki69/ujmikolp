package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbox;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface zzdb extends IInterface {
    void zze() throws RemoteException;

    void zzf(float f) throws RemoteException;

    void zzg(String str) throws RemoteException;

    void zzh(boolean z4) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzj(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    float zzk() throws RemoteException;

    boolean zzl() throws RemoteException;

    String zzm() throws RemoteException;

    void zzn(@Nullable String str) throws RemoteException;

    void zzo(zzbox zzboxVar) throws RemoteException;

    void zzp(zzblr zzblrVar) throws RemoteException;

    List zzq() throws RemoteException;

    void zzr(zzfv zzfvVar) throws RemoteException;

    void zzs() throws RemoteException;

    void zzt(zzdn zzdnVar) throws RemoteException;

    void zzu(boolean z4) throws RemoteException;

    void zzv(String str) throws RemoteException;
}
