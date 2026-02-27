package io.flutter.plugins.googlemobileads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;

/* JADX INFO: loaded from: classes4.dex */
class FlutterNativeAdOptions {

    @Nullable
    final Integer adChoicesPlacement;

    @Nullable
    final Integer mediaAspectRatio;

    @Nullable
    final Boolean requestCustomMuteThisAd;

    @Nullable
    final Boolean shouldRequestMultipleImages;

    @Nullable
    final Boolean shouldReturnUrlsForImageAssets;

    @Nullable
    final FlutterVideoOptions videoOptions;

    public FlutterNativeAdOptions(@Nullable Integer num, @Nullable Integer num2, @Nullable FlutterVideoOptions flutterVideoOptions, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.adChoicesPlacement = num;
        this.mediaAspectRatio = num2;
        this.videoOptions = flutterVideoOptions;
        this.requestCustomMuteThisAd = bool;
        this.shouldRequestMultipleImages = bool2;
        this.shouldReturnUrlsForImageAssets = bool3;
    }

    public NativeAdOptions asNativeAdOptions() {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        Integer num = this.adChoicesPlacement;
        if (num != null) {
            builder.setAdChoicesPlacement(num.intValue());
        }
        Integer num2 = this.mediaAspectRatio;
        if (num2 != null) {
            builder.setMediaAspectRatio(num2.intValue());
        }
        FlutterVideoOptions flutterVideoOptions = this.videoOptions;
        if (flutterVideoOptions != null) {
            builder.setVideoOptions(flutterVideoOptions.asVideoOptions());
        }
        Boolean bool = this.requestCustomMuteThisAd;
        if (bool != null) {
            builder.setRequestCustomMuteThisAd(bool.booleanValue());
        }
        Boolean bool2 = this.shouldRequestMultipleImages;
        if (bool2 != null) {
            builder.setRequestMultipleImages(bool2.booleanValue());
        }
        Boolean bool3 = this.shouldReturnUrlsForImageAssets;
        if (bool3 != null) {
            builder.setReturnUrlsForImageAssets(bool3.booleanValue());
        }
        return builder.build();
    }
}
