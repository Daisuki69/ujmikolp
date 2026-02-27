package C4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.paymaya.R;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements GoogleMobileAdsPlugin.NativeAdFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f738a;

    public d(Context context) {
        this.f738a = context;
    }

    @Override // io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin.NativeAdFactory
    public final NativeAdView createNativeAd(NativeAd nativeAd, Map map) {
        Object obj;
        j.g(nativeAd, "nativeAd");
        if (map == null || (obj = map.get("adFormat")) == null) {
            obj = "VerticalBannerCarouselAd";
        }
        int iOrdinal = D4.a.valueOf(obj.toString()).ordinal();
        Context context = this.f738a;
        int i = 4;
        if (iOrdinal == 0) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.standard_native_ad, (ViewGroup) null);
            j.e(viewInflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
            NativeAdView nativeAdView = (NativeAdView) viewInflate;
            TextView textView = (TextView) nativeAdView.findViewById(R.id.standard_native_ad_headline);
            textView.setText(nativeAd.getHeadline());
            nativeAdView.setHeadlineView(textView);
            TextView textView2 = (TextView) nativeAdView.findViewById(R.id.standard_native_ad_body);
            textView2.setText(nativeAd.getBody());
            String body = nativeAd.getBody();
            if (body != null && body.length() > 0) {
                i = 0;
            }
            textView2.setVisibility(i);
            nativeAdView.setBodyView(textView2);
            MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.standard_native_ad_media);
            nativeAdView.setMediaView(mediaView);
            mediaView.setVisibility(nativeAd.getMediaContent() != null ? 0 : 8);
            nativeAdView.setNativeAd(nativeAd);
            return nativeAdView;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.inline_banner_native_ad, (ViewGroup) null);
        j.e(viewInflate2, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
        NativeAdView nativeAdView2 = (NativeAdView) viewInflate2;
        TextView textView3 = (TextView) nativeAdView2.findViewById(R.id.txt_headline);
        textView3.setText(nativeAd.getHeadline());
        nativeAdView2.setHeadlineView(textView3);
        TextView textView4 = (TextView) nativeAdView2.findViewById(R.id.txt_body);
        textView4.setText(nativeAd.getBody());
        String body2 = nativeAd.getBody();
        if (body2 != null && body2.length() > 0) {
            i = 0;
        }
        textView4.setVisibility(i);
        nativeAdView2.setBodyView(textView4);
        MediaView mediaView2 = (MediaView) nativeAdView2.findViewById(R.id.img_banner_logo);
        nativeAdView2.setMediaView(mediaView2);
        mediaView2.setVisibility(nativeAd.getMediaContent() != null ? 0 : 8);
        nativeAdView2.setNativeAd(nativeAd);
        return nativeAdView2;
    }
}
