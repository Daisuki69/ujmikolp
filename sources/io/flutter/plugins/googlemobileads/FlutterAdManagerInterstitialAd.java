package io.flutter.plugins.googlemobileads;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.admanager.AppEventListener;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class FlutterAdManagerInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FltGAMInterstitialAd";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    @Nullable
    private AdManagerInterstitialAd f17291ad;

    @NonNull
    private final String adUnitId;

    @NonNull
    private final FlutterAdLoader flutterAdLoader;

    @NonNull
    private final AdInstanceManager manager;

    @NonNull
    private final FlutterAdManagerAdRequest request;

    public static final class DelegatingAdManagerInterstitialAdCallbacks extends AdManagerInterstitialAdLoadCallback implements AppEventListener {
        private final WeakReference<FlutterAdManagerInterstitialAd> delegate;

        public DelegatingAdManagerInterstitialAdCallbacks(FlutterAdManagerInterstitialAd flutterAdManagerInterstitialAd) {
            this.delegate = new WeakReference<>(flutterAdManagerInterstitialAd);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdFailedToLoad(loadAdError);
            }
        }

        @Override // com.google.android.gms.ads.admanager.AppEventListener
        public void onAppEvent(@NonNull String str, @NonNull String str2) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAppEvent(str, str2);
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull AdManagerInterstitialAd adManagerInterstitialAd) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(adManagerInterstitialAd);
            }
        }
    }

    public FlutterAdManagerInterstitialAd(int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull FlutterAdManagerAdRequest flutterAdManagerAdRequest, @NonNull FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        this.f17291ad = null;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
        String str = this.adUnitId;
        flutterAdLoader.loadAdManagerInterstitial(str, this.request.asAdManagerAdRequest(str), new DelegatingAdManagerInterstitialAdCallbacks(this));
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        this.f17291ad = adManagerInterstitialAd;
        adManagerInterstitialAd.setAppEventListener(new DelegatingAdManagerInterstitialAdCallbacks(this));
        adManagerInterstitialAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, adManagerInterstitialAd.getResponseInfo());
    }

    public void onAppEvent(@NonNull String str, @NonNull String str2) {
        this.manager.onAppEvent(this.adId, str, str2);
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z4) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f17291ad;
        if (adManagerInterstitialAd == null) {
            Log.e(TAG, "The interstitial wasn't loaded yet.");
        } else {
            adManagerInterstitialAd.setImmersiveMode(z4);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.f17291ad == null) {
            Log.e(TAG, "The interstitial wasn't loaded yet.");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f17291ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.f17291ad.show(this.manager.getActivity());
        }
    }
}
