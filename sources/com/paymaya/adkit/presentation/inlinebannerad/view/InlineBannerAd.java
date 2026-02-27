package com.paymaya.adkit.presentation.inlinebannerad.view;

import N5.C0452f1;
import N5.k1;
import N5.r1;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.j;
import l5.k;

/* JADX INFO: loaded from: classes3.dex */
public final class InlineBannerAd extends FrameLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f10222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f10223b;
    public LifecycleOwner c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f10224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineBannerAd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.inline_banner_ad, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.inline_banner_ad_card_view;
        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.inline_banner_ad_card_view)) != null) {
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            i = R.id.inline_banner_native_ad;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.inline_banner_native_ad);
            if (viewFindChildViewById != null) {
                int i4 = R.id.ad_badge_container;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.ad_badge_container);
                if (viewFindChildViewById2 != null) {
                    TextView textView = (TextView) viewFindChildViewById2;
                    C0452f1 c0452f1 = new C0452f1(textView, textView, 6);
                    i4 = R.id.img_banner_logo;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.img_banner_logo);
                    if (imageView != null) {
                        i4 = R.id.txt_body;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.txt_body);
                        if (textView2 != null) {
                            i4 = R.id.txt_headline;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.txt_headline);
                            if (textView3 != null) {
                                k1 k1Var = new k1((ViewGroup) viewFindChildViewById, (Object) c0452f1, imageView, textView2, (View) textView3, 19);
                                i = R.id.shimmer_inline_view_container;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.shimmer_inline_view_container);
                                if (lottieAnimationView != null) {
                                    this.f10222a = new r1(frameLayout, frameLayout, k1Var, lottieAnimationView, 11);
                                    this.f10224d = new WeakReference(context);
                                    return;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
