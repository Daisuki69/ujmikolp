package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class FlutterBannerAdListener extends FlutterAdListener {

    @NonNull
    final WeakReference<FlutterAdLoadedListener> adLoadedListenerWeakReference;

    public FlutterBannerAdListener(int i, @NonNull AdInstanceManager adInstanceManager, FlutterAdLoadedListener flutterAdLoadedListener) {
        super(i, adInstanceManager);
        this.adLoadedListenerWeakReference = new WeakReference<>(flutterAdLoadedListener);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        if (this.adLoadedListenerWeakReference.get() != null) {
            this.adLoadedListenerWeakReference.get().onAdLoaded();
        }
    }
}
