package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import io.flutter.plugins.googlemobileads.FlutterAd;

/* JADX INFO: loaded from: classes4.dex */
class FlutterAdListener extends AdListener {
    protected final int adId;

    @NonNull
    protected final AdInstanceManager manager;

    public FlutterAdListener(int i, @NonNull AdInstanceManager adInstanceManager) {
        this.adId = i;
        this.manager = adInstanceManager;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        this.manager.onAdClicked(this.adId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        this.manager.onAdClosed(this.adId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        this.manager.onAdImpression(this.adId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        this.manager.onAdOpened(this.adId);
    }
}
