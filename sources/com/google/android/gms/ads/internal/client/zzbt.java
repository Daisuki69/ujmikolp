package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbmf;

/* JADX INFO: loaded from: classes2.dex */
public interface zzbt extends IInterface {
    zzbq zze() throws RemoteException;

    void zzf(zzbk zzbkVar) throws RemoteException;

    void zzg(zzbgu zzbguVar) throws RemoteException;

    void zzh(zzbgx zzbgxVar) throws RemoteException;

    void zzi(String str, zzbhd zzbhdVar, @Nullable zzbha zzbhaVar) throws RemoteException;

    void zzj(zzbfl zzbflVar) throws RemoteException;

    void zzk(zzbhh zzbhhVar, zzr zzrVar) throws RemoteException;

    void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzm(zzbhk zzbhkVar) throws RemoteException;

    void zzn(zzblw zzblwVar) throws RemoteException;

    void zzo(zzbmf zzbmfVar) throws RemoteException;

    void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzq(zzcs zzcsVar) throws RemoteException;
}
