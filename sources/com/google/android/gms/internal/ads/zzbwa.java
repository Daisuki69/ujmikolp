package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public interface zzbwa extends IInterface {
    void zzb(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwh zzbwhVar) throws RemoteException;

    void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwh zzbwhVar) throws RemoteException;

    void zze(zzbwd zzbwdVar) throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    Bundle zzg() throws RemoteException;

    void zzh(zzbwo zzbwoVar) throws RemoteException;

    boolean zzi() throws RemoteException;

    String zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper, boolean z4) throws RemoteException;

    zzbvx zzl() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzea zzm() throws RemoteException;

    @Nullable
    String zzn() throws RemoteException;

    void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException;

    void zzp(boolean z4) throws RemoteException;

    long zzq() throws RemoteException;

    void zzr(long j) throws RemoteException;

    void zzs(zzbwi zzbwiVar) throws RemoteException;
}
