package io.flutter.plugins.googlemobileads;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import dOYHB6.lN8Dz0.gDiks7;
import io.flutter.plugin.platform.k;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
final class FluidAdManagerBannerAd extends FlutterAdManagerBannerAd {
    private static final String TAG = "FluidAdManagerBannerAd";

    @Nullable
    private ViewGroup containerView;
    private int height;

    public FluidAdManagerBannerAd(int i, @NonNull AdInstanceManager adInstanceManager, @NonNull String str, @NonNull FlutterAdManagerAdRequest flutterAdManagerAdRequest, @NonNull BannerAdCreator bannerAdCreator) {
        super(i, adInstanceManager, str, Collections.singletonList(new FlutterAdSize(AdSize.FLUID)), flutterAdManagerAdRequest, bannerAdCreator);
        this.height = -1;
    }

    @Nullable
    @VisibleForTesting
    public ScrollView createContainerView() {
        if (this.manager.getActivity() != null) {
            return new gDiks7(this.manager.getActivity());
        }
        Log.e(TAG, "Tried to create container view before plugin is attached to an activity.");
        return null;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd, io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.adView = null;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.containerView = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd, io.flutter.plugins.googlemobileads.FlutterAd
    @Nullable
    public k getPlatformView() {
        if (this.adView == null) {
            return null;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            return new FlutterPlatformView(viewGroup);
        }
        ScrollView scrollViewCreateContainerView = createContainerView();
        if (scrollViewCreateContainerView == null) {
            return null;
        }
        scrollViewCreateContainerView.setClipChildren(false);
        scrollViewCreateContainerView.setVerticalScrollBarEnabled(false);
        scrollViewCreateContainerView.setHorizontalScrollBarEnabled(false);
        this.containerView = scrollViewCreateContainerView;
        scrollViewCreateContainerView.addView(this.adView);
        return new FlutterPlatformView(this.adView);
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd, io.flutter.plugins.googlemobileads.FlutterAdLoadedListener
    public void onAdLoaded() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView != null) {
            adManagerAdView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: io.flutter.plugins.googlemobileads.FluidAdManagerBannerAd.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredHeight != FluidAdManagerBannerAd.this.height) {
                        FluidAdManagerBannerAd fluidAdManagerBannerAd = FluidAdManagerBannerAd.this;
                        fluidAdManagerBannerAd.manager.onFluidAdHeightChanged(fluidAdManagerBannerAd.adId, measuredHeight);
                    }
                    FluidAdManagerBannerAd.this.height = measuredHeight;
                }
            });
            this.manager.onAdLoaded(this.adId, this.adView.getResponseInfo());
        }
    }
}
