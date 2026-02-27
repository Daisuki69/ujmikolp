package io.flutter.plugins.googlemobileads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;

/* JADX INFO: loaded from: classes4.dex */
class FlutterAdSize {
    final int height;

    @NonNull
    final AdSize size;
    final int width;

    public static class AdSizeFactory {
        public AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i);
        }

        public AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i);
        }

        public AdSize getInlineAdaptiveBannerAdSize(int i, int i4) {
            return AdSize.getInlineAdaptiveBannerAdSize(i, i4);
        }

        public AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(context, i);
        }

        public AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getLandscapeInlineAdaptiveBannerAdSize(context, i);
        }

        public AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getPortraitAnchoredAdaptiveBannerAdSize(context, i);
        }

        public AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getPortraitInlineAdaptiveBannerAdSize(context, i);
        }
    }

    public static class AnchoredAdaptiveBannerAdSize extends FlutterAdSize {
        final String orientation;

        public AnchoredAdaptiveBannerAdSize(@NonNull Context context, @NonNull AdSizeFactory adSizeFactory, @Nullable String str, int i) {
            super(getAdSize(context, adSizeFactory, str, i));
            this.orientation = str;
        }

        @NonNull
        private static AdSize getAdSize(@NonNull Context context, @NonNull AdSizeFactory adSizeFactory, @Nullable String str, int i) {
            if (str == null) {
                return adSizeFactory.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i);
            }
            if (str.equals("portrait")) {
                return adSizeFactory.getPortraitAnchoredAdaptiveBannerAdSize(context, i);
            }
            if (str.equals("landscape")) {
                return adSizeFactory.getLandscapeAnchoredAdaptiveBannerAdSize(context, i);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: ".concat(str));
        }
    }

    public static class FluidAdSize extends FlutterAdSize {
        public FluidAdSize() {
            super(AdSize.FLUID);
        }
    }

    public static class InlineAdaptiveBannerAdSize extends FlutterAdSize {

        @Nullable
        final Integer maxHeight;

        @Nullable
        final Integer orientation;

        public InlineAdaptiveBannerAdSize(@NonNull AdSizeFactory adSizeFactory, @NonNull Context context, int i, @Nullable Integer num, @Nullable Integer num2) {
            super(getAdSize(adSizeFactory, context, i, num, num2));
            this.orientation = num;
            this.maxHeight = num2;
        }

        private static AdSize getAdSize(@NonNull AdSizeFactory adSizeFactory, @NonNull Context context, int i, @Nullable Integer num, @Nullable Integer num2) {
            return num != null ? num.intValue() == 0 ? adSizeFactory.getPortraitInlineAdaptiveBannerAdSize(context, i) : adSizeFactory.getLandscapeInlineAdaptiveBannerAdSize(context, i) : num2 != null ? adSizeFactory.getInlineAdaptiveBannerAdSize(i, num2.intValue()) : adSizeFactory.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i);
        }
    }

    public static class SmartBannerAdSize extends FlutterAdSize {
        public SmartBannerAdSize() {
            super(AdSize.SMART_BANNER);
        }
    }

    public FlutterAdSize(int i, int i4) {
        this(new AdSize(i, i4));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdSize)) {
            return false;
        }
        FlutterAdSize flutterAdSize = (FlutterAdSize) obj;
        return this.width == flutterAdSize.width && this.height == flutterAdSize.height;
    }

    public AdSize getAdSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public FlutterAdSize(@NonNull AdSize adSize) {
        this.size = adSize;
        this.width = adSize.getWidth();
        this.height = adSize.getHeight();
    }
}
