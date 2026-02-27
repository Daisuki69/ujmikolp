package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import dOYHB6.lN8Dz0.d8NVX3;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwr {
    public static final void zza(Context context, ViewGroup viewGroup, AdView adView) {
        d8NVX3 d8nvx3 = new d8NVX3(context);
        d8nvx3.setTag(TtmlNode.TAG_LAYOUT);
        zzf(d8nvx3, -1, -1);
        d8nvx3.setGravity(17);
        d8nvx3.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(d8nvx3);
    }

    public static final void zzb(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        zzf(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        d8NVX3 d8nvx3 = new d8NVX3(context);
        d8nvx3.setTag("layout_tag");
        d8nvx3.setOrientation(1);
        zzf(d8nvx3, -1, -1);
        d8nvx3.setBackgroundColor(-1);
        nativeAdView.addView(d8nvx3);
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        d8nvx3.addView(zzc(context, resourcesZzf == null ? "Headline" : resourcesZzf.getString(R.string.native_headline), "headline_header_tag"));
        View viewZzd = zzd(context, zzghs.zza(nativeAd.getHeadline()), "headline_tag");
        nativeAdView.setHeadlineView(viewZzd);
        d8nvx3.addView(viewZzd);
        d8nvx3.addView(zzc(context, resourcesZzf == null ? "Body" : resourcesZzf.getString(R.string.native_body), "body_header_tag"));
        View viewZzd2 = zzd(context, zzghs.zza(nativeAd.getBody()), "body_tag");
        nativeAdView.setBodyView(viewZzd2);
        d8nvx3.addView(viewZzd2);
        d8nvx3.addView(zzc(context, resourcesZzf == null ? "Media View" : resourcesZzf.getString(R.string.native_media_view), "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        d8nvx3.addView(mediaView);
        nativeAdView.setNativeAd(nativeAd);
    }

    private static TextView zzc(Context context, String str, String str2) {
        return zze(context, str, android.R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static TextView zzd(Context context, String str, String str2) {
        return zze(context, str, android.R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static TextView zze(Context context, String str, int i, int i4, float f, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        zzf(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i4);
        textView.setText(str);
        return textView;
    }

    private static void zzf(View view, int i, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i4;
        view.setLayoutParams(layoutParams2);
    }
}
