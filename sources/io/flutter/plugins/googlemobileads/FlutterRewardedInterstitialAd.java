package io.flutter.plugins.googlemobileads;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class FlutterRewardedInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterRIAd";

    @Nullable
    private final FlutterAdManagerAdRequest adManagerRequest;

    @NonNull
    private final String adUnitId;

    @NonNull
    private final FlutterAdLoader flutterAdLoader;

    @NonNull
    private final AdInstanceManager manager;

    @Nullable
    private final FlutterAdRequest request;

    @Nullable
    RewardedInterstitialAd rewardedInterstitialAd;

    public static final class DelegatingRewardedCallback extends RewardedInterstitialAdLoadCallback implements OnAdMetadataChangedListener, OnUserEarnedRewardListener {
        private final WeakReference<FlutterRewardedInterstitialAd> delegate;

        public DelegatingRewardedCallback(FlutterRewardedInterstitialAd flutterRewardedInterstitialAd) {
            this.delegate = new WeakReference<>(flutterRewardedInterstitialAd);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdFailedToLoad(loadAdError);
            }
        }

        @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
        public void onAdMetadataChanged() {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdMetadataChanged();
            }
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
            if (this.delegate.get() != null) {
                this.delegate.get().onUserEarnedReward(rewardItem);
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(rewardedInterstitialAd);
            }
        }
    }

    public FlutterRewardedInterstitialAd(int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull FlutterAdRequest flutterAdRequest, @NonNull FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerRequest = null;
        this.flutterAdLoader = flutterAdLoader;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        this.rewardedInterstitialAd = null;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        DelegatingRewardedCallback delegatingRewardedCallback = new DelegatingRewardedCallback(this);
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadRewardedInterstitial(str, flutterAdRequest.asAdRequest(str), delegatingRewardedCallback);
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
        if (flutterAdManagerAdRequest == null) {
            Log.e(TAG, "A null or invalid ad request was provided.");
            return;
        }
        FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
        String str2 = this.adUnitId;
        flutterAdLoader2.loadAdManagerRewardedInterstitial(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), delegatingRewardedCallback);
    }

    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    public void onAdLoaded(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {
        this.rewardedInterstitialAd = rewardedInterstitialAd;
        rewardedInterstitialAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, rewardedInterstitialAd.getResponseInfo());
    }

    public void onAdMetadataChanged() {
        this.manager.onAdMetadataChanged(this.adId);
    }

    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
        this.manager.onRewardedAdUserEarnedReward(this.adId, new FlutterRewardedAd.FlutterRewardItem(Integer.valueOf(rewardItem.getAmount()), rewardItem.getType()));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z4) {
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd == null) {
            Log.e(TAG, "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            rewardedInterstitialAd.setImmersiveMode(z4);
        }
    }

    public void setServerSideVerificationOptions(FlutterServerSideVerificationOptions flutterServerSideVerificationOptions) {
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.setServerSideVerificationOptions(flutterServerSideVerificationOptions.asServerSideVerificationOptions());
        } else {
            Log.e(TAG, "RewardedInterstitialAd is null in setServerSideVerificationOptions");
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.rewardedInterstitialAd == null) {
            Log.e(TAG, "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            if (this.manager.getActivity() == null) {
                Log.e(TAG, "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
                return;
            }
            this.rewardedInterstitialAd.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.rewardedInterstitialAd.setOnAdMetadataChangedListener(new DelegatingRewardedCallback(this));
            this.rewardedInterstitialAd.show(this.manager.getActivity(), new DelegatingRewardedCallback(this));
        }
    }

    public FlutterRewardedInterstitialAd(int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull FlutterAdManagerAdRequest flutterAdManagerAdRequest, @NonNull FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.request = null;
        this.flutterAdLoader = flutterAdLoader;
    }
}
