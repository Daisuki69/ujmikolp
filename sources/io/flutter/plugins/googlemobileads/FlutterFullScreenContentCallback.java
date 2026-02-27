package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes4.dex */
class FlutterFullScreenContentCallback extends FullScreenContentCallback {

    @NonNull
    protected final int adId;

    @NonNull
    protected final AdInstanceManager manager;

    public FlutterFullScreenContentCallback(@NonNull AdInstanceManager adInstanceManager, int i) {
        this.manager = adInstanceManager;
        this.adId = i;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.manager.onAdClicked(this.adId);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.manager.onAdDismissedFullScreenContent(this.adId);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
        this.manager.onFailedToShowFullScreenContent(this.adId, adError);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.manager.onAdImpression(this.adId);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        this.manager.onAdShowedFullScreenContent(this.adId);
    }
}
