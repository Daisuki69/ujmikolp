package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdView;
import io.flutter.plugin.platform.k;

/* JADX INFO: loaded from: classes4.dex */
class FlutterBannerAd extends FlutterAd implements FlutterAdLoadedListener {

    @NonNull
    private final String adUnitId;

    @Nullable
    private AdView adView;

    @NonNull
    private final BannerAdCreator bannerAdCreator;

    @NonNull
    private final AdInstanceManager manager;

    @NonNull
    private final FlutterAdRequest request;

    @NonNull
    private final FlutterAdSize size;

    public FlutterBannerAd(int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull FlutterAdRequest flutterAdRequest, @NonNull FlutterAdSize flutterAdSize, @NonNull BannerAdCreator bannerAdCreator) {
        super(i);
        adInstanceManager.getClass();
        str.getClass();
        flutterAdRequest.getClass();
        flutterAdSize.getClass();
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.size = flutterAdSize;
        this.bannerAdCreator = bannerAdCreator;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        AdView adView = this.adView;
        if (adView != null) {
            adView.destroy();
            this.adView = null;
        }
    }

    @Nullable
    public FlutterAdSize getAdSize() {
        AdView adView = this.adView;
        if (adView == null || adView.getAdSize() == null) {
            return null;
        }
        return new FlutterAdSize(this.adView.getAdSize());
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    @Nullable
    public k getPlatformView() {
        AdView adView = this.adView;
        if (adView == null) {
            return null;
        }
        return new FlutterPlatformView(adView);
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        AdView adViewCreateAdView = this.bannerAdCreator.createAdView();
        this.adView = adViewCreateAdView;
        adViewCreateAdView.setAdUnitId(this.adUnitId);
        this.adView.setAdSize(this.size.getAdSize());
        this.adView.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.adView.setAdListener(new FlutterBannerAdListener(this.adId, this.manager, this));
        this.adView.loadAd(this.request.asAdRequest(this.adUnitId));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdLoadedListener
    public void onAdLoaded() {
        AdView adView = this.adView;
        if (adView != null) {
            this.manager.onAdLoaded(this.adId, adView.getResponseInfo());
        }
    }
}
