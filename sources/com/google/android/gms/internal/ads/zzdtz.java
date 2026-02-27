package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdtz {
    private final zzbkl zza;

    public zzdtz(zzbkl zzbklVar) {
        this.zza = zzbklVar;
    }

    private final void zzs(zzdty zzdtyVar) throws RemoteException {
        String strZza = zzdtyVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdty("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("creation", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("nativeObjectCreated");
        zzs(zzdtyVar);
    }

    public final void zzc(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("creation", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("nativeObjectNotCreated");
        zzs(zzdtyVar);
    }

    public final void zzd(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdtyVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onAdLoaded");
        zzs(zzdtyVar);
    }

    public final void zzf(long j, int i) throws RemoteException {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onAdFailedToLoad");
        zzdtyVar.zzd(Integer.valueOf(i));
        zzs(zzdtyVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onAdOpened");
        zzs(zzdtyVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onAdClicked");
        this.zza.zzb(zzdtyVar.zza());
    }

    public final void zzi(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onAdClosed");
        zzs(zzdtyVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdtyVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onRewardedAdLoaded");
        zzs(zzdtyVar);
    }

    public final void zzl(long j, int i) throws RemoteException {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onRewardedAdFailedToLoad");
        zzdtyVar.zzd(Integer.valueOf(i));
        zzs(zzdtyVar);
    }

    public final void zzm(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onRewardedAdOpened");
        zzs(zzdtyVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onRewardedAdFailedToShow");
        zzdtyVar.zzd(Integer.valueOf(i));
        zzs(zzdtyVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onRewardedAdClosed");
        zzs(zzdtyVar);
    }

    public final void zzp(long j, zzbvx zzbvxVar) throws RemoteException {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onUserEarnedReward");
        zzdtyVar.zze(zzbvxVar.zze());
        zzdtyVar.zzf(Integer.valueOf(zzbvxVar.zzf()));
        zzs(zzdtyVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onAdImpression");
        zzs(zzdtyVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j));
        zzdtyVar.zzc("onAdClicked");
        zzs(zzdtyVar);
    }
}
