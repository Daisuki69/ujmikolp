package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzdwg extends InterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwp zzb;

    public zzdwg(zzdwp zzdwpVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdwpVar);
        this.zzb = zzdwpVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        this.zzb.zzg(zzdwp.zzm(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
        this.zzb.zzf(this.zza, interstitialAd);
    }
}
