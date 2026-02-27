package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import io.flutter.plugin.platform.k;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class FlutterNativeAd extends FlutterAd {
    private static final String TAG = "FlutterNativeAd";

    @Nullable
    private final GoogleMobileAdsPlugin.NativeAdFactory adFactory;

    @Nullable
    private FlutterAdManagerAdRequest adManagerRequest;

    @NonNull
    private final String adUnitId;

    @NonNull
    private final Context context;

    @Nullable
    private Map<String, Object> customOptions;

    @NonNull
    private final FlutterAdLoader flutterAdLoader;

    @NonNull
    private final AdInstanceManager manager;

    @Nullable
    private final FlutterNativeAdOptions nativeAdOptions;

    @Nullable
    private NativeAdView nativeAdView;

    @Nullable
    private final FlutterNativeTemplateStyle nativeTemplateStyle;

    @Nullable
    private FlutterAdRequest request;

    @Nullable
    private TemplateView templateView;

    public static class Builder {

        @Nullable
        private GoogleMobileAdsPlugin.NativeAdFactory adFactory;

        @Nullable
        private FlutterAdManagerAdRequest adManagerRequest;

        @Nullable
        private String adUnitId;

        @NonNull
        private final Context context;

        @Nullable
        private Map<String, Object> customOptions;

        @Nullable
        private FlutterAdLoader flutterAdLoader;

        @Nullable
        private Integer id;

        @Nullable
        private AdInstanceManager manager;

        @Nullable
        private FlutterNativeAdOptions nativeAdOptions;

        @Nullable
        private FlutterNativeTemplateStyle nativeTemplateStyle;

        @Nullable
        private FlutterAdRequest request;

        public Builder(Context context) {
            this.context = context;
        }

        public FlutterNativeAd build() {
            if (this.manager == null) {
                throw new IllegalStateException("AdInstanceManager cannot be null.");
            }
            if (this.adUnitId == null) {
                throw new IllegalStateException("AdUnitId cannot be null.");
            }
            if (this.adFactory == null && this.nativeTemplateStyle == null) {
                throw new IllegalStateException("NativeAdFactory and nativeTemplateStyle cannot be null.");
            }
            FlutterAdRequest flutterAdRequest = this.request;
            if (flutterAdRequest == null && this.adManagerRequest == null) {
                throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
            }
            return flutterAdRequest == null ? new FlutterNativeAd(this.context, this.id.intValue(), this.manager, this.adUnitId, this.adFactory, this.adManagerRequest, this.flutterAdLoader, this.customOptions, this.nativeAdOptions, this.nativeTemplateStyle) : new FlutterNativeAd(this.context, this.id.intValue(), this.manager, this.adUnitId, this.adFactory, this.request, this.flutterAdLoader, this.customOptions, this.nativeAdOptions, this.nativeTemplateStyle);
        }

        public Builder setAdFactory(@NonNull GoogleMobileAdsPlugin.NativeAdFactory nativeAdFactory) {
            this.adFactory = nativeAdFactory;
            return this;
        }

        public Builder setAdManagerRequest(@NonNull FlutterAdManagerAdRequest flutterAdManagerAdRequest) {
            this.adManagerRequest = flutterAdManagerAdRequest;
            return this;
        }

        public Builder setAdUnitId(@NonNull String str) {
            this.adUnitId = str;
            return this;
        }

        public Builder setCustomOptions(@Nullable Map<String, Object> map) {
            this.customOptions = map;
            return this;
        }

        public Builder setFlutterAdLoader(@NonNull FlutterAdLoader flutterAdLoader) {
            this.flutterAdLoader = flutterAdLoader;
            return this;
        }

        public Builder setId(int i) {
            this.id = Integer.valueOf(i);
            return this;
        }

        public Builder setManager(@NonNull AdInstanceManager adInstanceManager) {
            this.manager = adInstanceManager;
            return this;
        }

        public Builder setNativeAdOptions(@Nullable FlutterNativeAdOptions flutterNativeAdOptions) {
            this.nativeAdOptions = flutterNativeAdOptions;
            return this;
        }

        public Builder setNativeTemplateStyle(@Nullable FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
            this.nativeTemplateStyle = flutterNativeTemplateStyle;
            return this;
        }

        public Builder setRequest(@NonNull FlutterAdRequest flutterAdRequest) {
            this.request = flutterAdRequest;
            return this;
        }
    }

    public FlutterNativeAd(@NonNull Context context, int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull GoogleMobileAdsPlugin.NativeAdFactory nativeAdFactory, @NonNull FlutterAdRequest flutterAdRequest, @NonNull FlutterAdLoader flutterAdLoader, @Nullable Map<String, Object> map, @Nullable FlutterNativeAdOptions flutterNativeAdOptions, @Nullable FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
        super(i);
        this.context = context;
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adFactory = nativeAdFactory;
        this.request = flutterAdRequest;
        this.flutterAdLoader = flutterAdLoader;
        this.customOptions = map;
        this.nativeAdOptions = flutterNativeAdOptions;
        this.nativeTemplateStyle = flutterNativeTemplateStyle;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        NativeAdView nativeAdView = this.nativeAdView;
        if (nativeAdView != null) {
            nativeAdView.destroy();
            this.nativeAdView = null;
        }
        TemplateView templateView = this.templateView;
        if (templateView != null) {
            templateView.c.destroy();
            this.templateView = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    @Nullable
    public k getPlatformView() {
        NativeAdView nativeAdView = this.nativeAdView;
        if (nativeAdView != null) {
            return new FlutterPlatformView(nativeAdView);
        }
        TemplateView templateView = this.templateView;
        if (templateView != null) {
            return new FlutterPlatformView(templateView);
        }
        return null;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        FlutterNativeAdLoadedListener flutterNativeAdLoadedListener = new FlutterNativeAdLoadedListener(this);
        FlutterNativeAdListener flutterNativeAdListener = new FlutterNativeAdListener(this.adId, this.manager);
        FlutterNativeAdOptions flutterNativeAdOptions = this.nativeAdOptions;
        NativeAdOptions nativeAdOptionsBuild = flutterNativeAdOptions == null ? new NativeAdOptions.Builder().build() : flutterNativeAdOptions.asNativeAdOptions();
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadNativeAd(str, flutterNativeAdLoadedListener, nativeAdOptionsBuild, flutterNativeAdListener, flutterAdRequest.asAdRequest(str));
        } else {
            FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
            if (flutterAdManagerAdRequest != null) {
                this.flutterAdLoader.loadAdManagerNativeAd(this.adUnitId, flutterNativeAdLoadedListener, nativeAdOptionsBuild, flutterNativeAdListener, flutterAdManagerAdRequest.asAdManagerAdRequest(this.adUnitId));
            } else {
                Log.e(TAG, "A null or invalid ad request was provided.");
            }
        }
    }

    public void onNativeAdLoaded(@NonNull NativeAd nativeAd) {
        FlutterNativeTemplateStyle flutterNativeTemplateStyle = this.nativeTemplateStyle;
        if (flutterNativeTemplateStyle != null) {
            TemplateView templateViewAsTemplateView = flutterNativeTemplateStyle.asTemplateView(this.context);
            this.templateView = templateViewAsTemplateView;
            templateViewAsTemplateView.setNativeAd(nativeAd);
        } else {
            this.nativeAdView = this.adFactory.createNativeAd(nativeAd, this.customOptions);
        }
        nativeAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, nativeAd.getResponseInfo());
    }

    public FlutterNativeAd(@NonNull Context context, int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull GoogleMobileAdsPlugin.NativeAdFactory nativeAdFactory, @NonNull FlutterAdManagerAdRequest flutterAdManagerAdRequest, @NonNull FlutterAdLoader flutterAdLoader, @Nullable Map<String, Object> map, @Nullable FlutterNativeAdOptions flutterNativeAdOptions, @Nullable FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
        super(i);
        this.context = context;
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adFactory = nativeAdFactory;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader;
        this.customOptions = map;
        this.nativeAdOptions = flutterNativeAdOptions;
        this.nativeTemplateStyle = flutterNativeTemplateStyle;
    }
}
