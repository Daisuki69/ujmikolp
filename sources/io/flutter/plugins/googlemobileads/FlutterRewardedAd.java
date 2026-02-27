package io.flutter.plugins.googlemobileads;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class FlutterRewardedAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterRewardedAd";

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
    RewardedAd rewardedAd;

    public static final class DelegatingRewardedCallback extends RewardedAdLoadCallback implements OnAdMetadataChangedListener, OnUserEarnedRewardListener {
        private final WeakReference<FlutterRewardedAd> delegate;

        public DelegatingRewardedCallback(FlutterRewardedAd flutterRewardedAd) {
            this.delegate = new WeakReference<>(flutterRewardedAd);
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
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(rewardedAd);
            }
        }
    }

    public static class FlutterRewardItem {

        @NonNull
        final Integer amount;

        @NonNull
        final String type;

        public FlutterRewardItem(@NonNull Integer num, @NonNull String str) {
            this.amount = num;
            this.type = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterRewardItem)) {
                return false;
            }
            FlutterRewardItem flutterRewardItem = (FlutterRewardItem) obj;
            if (this.amount.equals(flutterRewardItem.amount)) {
                return this.type.equals(flutterRewardItem.type);
            }
            return false;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.amount.hashCode() * 31);
        }
    }

    public FlutterRewardedAd(int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull FlutterAdRequest flutterAdRequest, @NonNull FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerRequest = null;
        this.flutterAdLoader = flutterAdLoader;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        this.rewardedAd = null;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        DelegatingRewardedCallback delegatingRewardedCallback = new DelegatingRewardedCallback(this);
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadRewarded(str, flutterAdRequest.asAdRequest(str), delegatingRewardedCallback);
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
        if (flutterAdManagerAdRequest == null) {
            Log.e(TAG, "A null or invalid ad request was provided.");
            return;
        }
        FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
        String str2 = this.adUnitId;
        flutterAdLoader2.loadAdManagerRewarded(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), delegatingRewardedCallback);
    }

    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
        this.rewardedAd = rewardedAd;
        rewardedAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, rewardedAd.getResponseInfo());
    }

    public void onAdMetadataChanged() {
        this.manager.onAdMetadataChanged(this.adId);
    }

    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
        this.manager.onRewardedAdUserEarnedReward(this.adId, new FlutterRewardItem(Integer.valueOf(rewardItem.getAmount()), rewardItem.getType()));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z4) {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            Log.e(TAG, "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            rewardedAd.setImmersiveMode(z4);
        }
    }

    public void setServerSideVerificationOptions(FlutterServerSideVerificationOptions flutterServerSideVerificationOptions) {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setServerSideVerificationOptions(flutterServerSideVerificationOptions.asServerSideVerificationOptions());
        } else {
            Log.e(TAG, "RewardedAd is null in setServerSideVerificationOptions");
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.rewardedAd == null) {
            Log.e(TAG, "Error showing rewarded - the rewarded ad wasn't loaded yet.");
        } else {
            if (this.manager.getActivity() == null) {
                Log.e(TAG, "Tried to show rewarded ad before activity was bound to the plugin.");
                return;
            }
            this.rewardedAd.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.rewardedAd.setOnAdMetadataChangedListener(new DelegatingRewardedCallback(this));
            this.rewardedAd.show(this.manager.getActivity(), new DelegatingRewardedCallback(this));
        }
    }

    public FlutterRewardedAd(int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull FlutterAdManagerAdRequest flutterAdManagerAdRequest, @NonNull FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.request = null;
        this.flutterAdLoader = flutterAdLoader;
    }
}
