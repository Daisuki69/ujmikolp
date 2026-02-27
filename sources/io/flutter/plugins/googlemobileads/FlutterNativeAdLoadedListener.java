package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class FlutterNativeAdLoadedListener implements NativeAd.OnNativeAdLoadedListener {
    private final WeakReference<FlutterNativeAd> nativeAdWeakReference;

    public FlutterNativeAdLoadedListener(FlutterNativeAd flutterNativeAd) {
        this.nativeAdWeakReference = new WeakReference<>(flutterNativeAd);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(@NonNull NativeAd nativeAd) {
        if (this.nativeAdWeakReference.get() != null) {
            this.nativeAdWeakReference.get().onNativeAdLoaded(nativeAd);
        }
    }
}
