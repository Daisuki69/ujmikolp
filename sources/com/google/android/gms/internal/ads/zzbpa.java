package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface zzbpa extends IInterface {
    void zzA(boolean z4) throws RemoteException;

    com.google.android.gms.ads.internal.client.zzed zzB() throws RemoteException;

    zzbpm zzC() throws RemoteException;

    void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException;

    void zzE(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzF(IObjectWrapper iObjectWrapper, zzblo zzbloVar, List list) throws RemoteException;

    void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException;

    zzbrl zzH() throws RemoteException;

    zzbrl zzI() throws RemoteException;

    void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException;

    zzbpg zzK() throws RemoteException;

    void zzL(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException;

    void zzN(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzbpi zzO() throws RemoteException;

    zzbpj zzP() throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException;

    IObjectWrapper zzf() throws RemoteException;

    void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException;

    void zzh() throws RemoteException;

    void zzi() throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException;

    void zzl() throws RemoteException;

    void zzm() throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, @Nullable String str, zzbvs zzbvsVar, String str2) throws RemoteException;

    void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException;

    void zzp() throws RemoteException;

    boolean zzq() throws RemoteException;

    void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar, @Nullable zzbfl zzbflVar, List list) throws RemoteException;

    Bundle zzs() throws RemoteException;

    Bundle zzt() throws RemoteException;

    Bundle zzu() throws RemoteException;

    void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException;

    void zzw(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzx() throws RemoteException;

    void zzy(IObjectWrapper iObjectWrapper, zzbvs zzbvsVar, List list) throws RemoteException;

    zzbgq zzz() throws RemoteException;
}
