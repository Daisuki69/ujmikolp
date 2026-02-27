package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterPaidEventListener implements OnPaidEventListener {

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    @NonNull
    private final FlutterAd f17294ad;

    @NonNull
    private final AdInstanceManager manager;

    public FlutterPaidEventListener(@NonNull AdInstanceManager adInstanceManager, @NonNull FlutterAd flutterAd) {
        this.manager = adInstanceManager;
        this.f17294ad = flutterAd;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this.manager.onPaidEvent(this.f17294ad, new FlutterAdValue(adValue.getPrecisionType(), adValue.getCurrencyCode(), adValue.getValueMicros()));
    }
}
