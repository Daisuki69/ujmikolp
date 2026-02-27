package com.google.android.ads.nativetemplates;

import Y0.a;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import io.flutter.plugins.googlemobileads.R;

/* JADX INFO: loaded from: classes2.dex */
public final class TemplateView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f9604b;
    public NativeAd c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAdView f9605d;
    public TextView e;
    public TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RatingBar f9606g;
    public TextView h;
    public ImageView i;
    public MediaView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f9607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ConstraintLayout f9608l;

    public TemplateView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TemplateView, 0, 0);
        try {
            this.f9603a = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TemplateView_gnt_template_type, R.layout.gnt_medium_template_view);
            typedArrayObtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f9603a, this);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public NativeAdView getNativeAdView() {
        return this.f9605d;
    }

    public String getTemplateTypeName() {
        int i = this.f9603a;
        return i == R.layout.gnt_medium_template_view ? "medium_template" : i == R.layout.gnt_small_template_view ? "small_template" : "";
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9605d = (NativeAdView) findViewById(R.id.native_ad_view);
        this.e = (TextView) findViewById(R.id.primary);
        this.f = (TextView) findViewById(R.id.secondary);
        this.h = (TextView) findViewById(R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        this.f9606g = ratingBar;
        ratingBar.setEnabled(false);
        this.f9607k = (Button) findViewById(R.id.cta);
        this.i = (ImageView) findViewById(R.id.icon);
        this.j = (MediaView) findViewById(R.id.media_view);
        this.f9608l = (ConstraintLayout) findViewById(R.id.background);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.c = nativeAd;
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.Image icon = nativeAd.getIcon();
        this.f9605d.setCallToActionView(this.f9607k);
        this.f9605d.setHeadlineView(this.e);
        this.f9605d.setMediaView(this.j);
        this.f.setVisibility(0);
        String store2 = nativeAd.getStore();
        String advertiser2 = nativeAd.getAdvertiser();
        if (!TextUtils.isEmpty(store2) && TextUtils.isEmpty(advertiser2)) {
            this.f9605d.setStoreView(this.f);
        } else if (TextUtils.isEmpty(advertiser)) {
            store = "";
        } else {
            this.f9605d.setAdvertiserView(this.f);
            store = advertiser;
        }
        this.e.setText(headline);
        this.f9607k.setText(callToAction);
        if (starRating == null || starRating.doubleValue() <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            this.f.setText(store);
            this.f.setVisibility(0);
            this.f9606g.setVisibility(8);
        } else {
            this.f.setVisibility(8);
            this.f9606g.setVisibility(0);
            this.f9606g.setRating(starRating.floatValue());
            this.f9605d.setStarRatingView(this.f9606g);
        }
        if (icon != null) {
            this.i.setVisibility(0);
            this.i.setImageDrawable(icon.getDrawable());
        } else {
            this.i.setVisibility(8);
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(body);
            this.f9605d.setBodyView(this.h);
        }
        this.f9605d.setNativeAd(nativeAd);
    }

    public void setStyles(a aVar) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        this.f9604b = aVar;
        ColorDrawable colorDrawable = aVar.f6721q;
        if (colorDrawable != null) {
            this.f9608l.setBackground(colorDrawable);
            TextView textView13 = this.e;
            if (textView13 != null) {
                textView13.setBackground(colorDrawable);
            }
            TextView textView14 = this.f;
            if (textView14 != null) {
                textView14.setBackground(colorDrawable);
            }
            TextView textView15 = this.h;
            if (textView15 != null) {
                textView15.setBackground(colorDrawable);
            }
        }
        Typeface typeface = this.f9604b.e;
        if (typeface != null && (textView12 = this.e) != null) {
            textView12.setTypeface(typeface);
        }
        Typeface typeface2 = this.f9604b.i;
        if (typeface2 != null && (textView11 = this.f) != null) {
            textView11.setTypeface(typeface2);
        }
        Typeface typeface3 = this.f9604b.m;
        if (typeface3 != null && (textView10 = this.h) != null) {
            textView10.setTypeface(typeface3);
        }
        Typeface typeface4 = this.f9604b.f6712a;
        if (typeface4 != null && (button4 = this.f9607k) != null) {
            button4.setTypeface(typeface4);
        }
        Integer num = this.f9604b.f6715g;
        if (num != null && (textView9 = this.e) != null) {
            textView9.setTextColor(num.intValue());
        }
        Integer num2 = this.f9604b.f6716k;
        if (num2 != null && (textView8 = this.f) != null) {
            textView8.setTextColor(num2.intValue());
        }
        Integer num3 = this.f9604b.f6719o;
        if (num3 != null && (textView7 = this.h) != null) {
            textView7.setTextColor(num3.intValue());
        }
        Integer num4 = this.f9604b.c;
        if (num4 != null && (button3 = this.f9607k) != null) {
            button3.setTextColor(num4.intValue());
        }
        float f = this.f9604b.f6713b;
        if (f > 0.0f && (button2 = this.f9607k) != null) {
            button2.setTextSize(f);
        }
        float f3 = this.f9604b.f;
        if (f3 > 0.0f && (textView6 = this.e) != null) {
            textView6.setTextSize(f3);
        }
        float f7 = this.f9604b.j;
        if (f7 > 0.0f && (textView5 = this.f) != null) {
            textView5.setTextSize(f7);
        }
        float f10 = this.f9604b.f6718n;
        if (f10 > 0.0f && (textView4 = this.h) != null) {
            textView4.setTextSize(f10);
        }
        ColorDrawable colorDrawable2 = this.f9604b.f6714d;
        if (colorDrawable2 != null && (button = this.f9607k) != null) {
            button.setBackground(colorDrawable2);
        }
        ColorDrawable colorDrawable3 = this.f9604b.h;
        if (colorDrawable3 != null && (textView3 = this.e) != null) {
            textView3.setBackground(colorDrawable3);
        }
        ColorDrawable colorDrawable4 = this.f9604b.f6717l;
        if (colorDrawable4 != null && (textView2 = this.f) != null) {
            textView2.setBackground(colorDrawable4);
        }
        ColorDrawable colorDrawable5 = this.f9604b.f6720p;
        if (colorDrawable5 != null && (textView = this.h) != null) {
            textView.setBackground(colorDrawable5);
        }
        invalidate();
        requestLayout();
    }
}
