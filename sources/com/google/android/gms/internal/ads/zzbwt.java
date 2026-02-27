package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwt extends zzbwg {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbwu zzb;

    public zzbwt(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbwu zzbwuVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze() {
        zzbwu zzbwuVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbwuVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbwuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
