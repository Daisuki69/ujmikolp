package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface zzgb extends IInterface {
    void zzA(zzr zzrVar) throws RemoteException;

    void zzB(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) throws RemoteException;

    void zzC(zzr zzrVar, zzaf zzafVar) throws RemoteException;

    void zzD(zzr zzrVar, Bundle bundle, zzge zzgeVar) throws RemoteException;

    void zze(zzbg zzbgVar, zzr zzrVar) throws RemoteException;

    void zzf(zzpl zzplVar, zzr zzrVar) throws RemoteException;

    void zzg(zzr zzrVar) throws RemoteException;

    void zzh(zzbg zzbgVar, String str, @Nullable String str2) throws RemoteException;

    void zzi(zzr zzrVar) throws RemoteException;

    @Nullable
    List zzj(zzr zzrVar, boolean z4) throws RemoteException;

    @Nullable
    byte[] zzk(zzbg zzbgVar, String str) throws RemoteException;

    void zzl(long j, @Nullable String str, @Nullable String str2, String str3) throws RemoteException;

    @Nullable
    String zzm(zzr zzrVar) throws RemoteException;

    void zzn(zzah zzahVar, zzr zzrVar) throws RemoteException;

    void zzo(zzah zzahVar) throws RemoteException;

    List zzp(@Nullable String str, @Nullable String str2, boolean z4, zzr zzrVar) throws RemoteException;

    List zzq(String str, @Nullable String str2, @Nullable String str3, boolean z4) throws RemoteException;

    List zzr(@Nullable String str, @Nullable String str2, zzr zzrVar) throws RemoteException;

    List zzs(String str, @Nullable String str2, @Nullable String str3) throws RemoteException;

    void zzt(zzr zzrVar) throws RemoteException;

    void zzu(Bundle bundle, zzr zzrVar) throws RemoteException;

    void zzv(zzr zzrVar) throws RemoteException;

    zzao zzw(zzr zzrVar) throws RemoteException;

    List zzx(zzr zzrVar, Bundle bundle) throws RemoteException;

    void zzy(zzr zzrVar) throws RemoteException;

    void zzz(zzr zzrVar) throws RemoteException;
}
