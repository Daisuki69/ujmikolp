package io.flutter.plugins.googlemobileads;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class FlutterInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterInterstitialAd";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    @Nullable
    private InterstitialAd f17293ad;

    @NonNull
    private final String adUnitId;

    @NonNull
    private final FlutterAdLoader flutterAdLoader;

    @NonNull
    private final AdInstanceManager manager;

    @NonNull
    private final FlutterAdRequest request;

    public static final class DelegatingInterstitialAdLoadCallback extends InterstitialAdLoadCallback {
        private final WeakReference<FlutterInterstitialAd> delegate;

        public DelegatingInterstitialAdLoadCallback(FlutterInterstitialAd flutterInterstitialAd) {
            this.delegate = new WeakReference<>(flutterInterstitialAd);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdFailedToLoad(loadAdError);
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(interstitialAd);
            }
        }
    }

    public FlutterInterstitialAd(int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull FlutterAdRequest flutterAdRequest, @NonNull FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.flutterAdLoader = flutterAdLoader;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        this.f17293ad = null;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        String str;
        FlutterAdRequest flutterAdRequest;
        if (this.manager == null || (str = this.adUnitId) == null || (flutterAdRequest = this.request) == null) {
            return;
        }
        this.flutterAdLoader.loadInterstitial(str, flutterAdRequest.asAdRequest(str), new DelegatingInterstitialAdLoadCallback(this));
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    public void onAdLoaded(InterstitialAd interstitialAd) {
        this.f17293ad = interstitialAd;
        interstitialAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, interstitialAd.getResponseInfo());
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z4) {
        InterstitialAd interstitialAd = this.f17293ad;
        if (interstitialAd == null) {
            Log.e(TAG, "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            interstitialAd.setImmersiveMode(z4);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.f17293ad == null) {
            Log.e(TAG, "Error showing interstitial - the interstitial ad wasn't loaded yet.");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f17293ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.f17293ad.show(this.manager.getActivity());
        }
    }
}
