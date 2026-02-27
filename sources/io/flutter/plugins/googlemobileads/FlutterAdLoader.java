package io.flutter.plugins.googlemobileads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterAdLoader {

    @NonNull
    private final Context context;

    public FlutterAdLoader(@NonNull Context context) {
        this.context = context;
    }

    public void loadAdManagerAppOpen(@NonNull String str, @NonNull AdManagerAdRequest adManagerAdRequest, @NonNull AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        AppOpenAd.load(this.context, str, adManagerAdRequest, appOpenAdLoadCallback);
    }

    public void loadAdManagerInterstitial(@NonNull String str, @NonNull AdManagerAdRequest adManagerAdRequest, @NonNull AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        AdManagerInterstitialAd.load(this.context, str, adManagerAdRequest, adManagerInterstitialAdLoadCallback);
    }

    public void loadAdManagerNativeAd(@NonNull String str, @NonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener, @NonNull NativeAdOptions nativeAdOptions, @NonNull AdListener adListener, @NonNull AdManagerAdRequest adManagerAdRequest) {
        new AdLoader.Builder(this.context, str).forNativeAd(onNativeAdLoadedListener).withNativeAdOptions(nativeAdOptions).withAdListener(adListener).build().loadAd(adManagerAdRequest);
    }

    public void loadAdManagerRewarded(@NonNull String str, @NonNull AdManagerAdRequest adManagerAdRequest, @NonNull RewardedAdLoadCallback rewardedAdLoadCallback) {
        RewardedAd.load(this.context, str, adManagerAdRequest, rewardedAdLoadCallback);
    }

    public void loadAdManagerRewardedInterstitial(@NonNull String str, @NonNull AdManagerAdRequest adManagerAdRequest, @NonNull RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        RewardedInterstitialAd.load(this.context, str, adManagerAdRequest, rewardedInterstitialAdLoadCallback);
    }

    public void loadAppOpen(@NonNull String str, @NonNull AdRequest adRequest, @NonNull AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        AppOpenAd.load(this.context, str, adRequest, appOpenAdLoadCallback);
    }

    public void loadInterstitial(@NonNull String str, @NonNull AdRequest adRequest, @NonNull InterstitialAdLoadCallback interstitialAdLoadCallback) {
        InterstitialAd.load(this.context, str, adRequest, interstitialAdLoadCallback);
    }

    public void loadNativeAd(@NonNull String str, @NonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener, @NonNull NativeAdOptions nativeAdOptions, @NonNull AdListener adListener, @NonNull AdRequest adRequest) {
        new AdLoader.Builder(this.context, str).forNativeAd(onNativeAdLoadedListener).withNativeAdOptions(nativeAdOptions).withAdListener(adListener).build().loadAd(adRequest);
    }

    public void loadRewarded(@NonNull String str, @NonNull AdRequest adRequest, @NonNull RewardedAdLoadCallback rewardedAdLoadCallback) {
        RewardedAd.load(this.context, str, adRequest, rewardedAdLoadCallback);
    }

    public void loadRewardedInterstitial(@NonNull String str, @NonNull AdRequest adRequest, @NonNull RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        RewardedInterstitialAd.load(this.context, str, adRequest, rewardedInterstitialAdLoadCallback);
    }
}
