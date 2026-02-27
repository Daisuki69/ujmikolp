package com.paymaya.ui.shopv3.view.widget;

import Ah.p;
import M8.X1;
import N5.K;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.camera.lifecycle.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.store.C1281r0;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ConfirmationBottomSheetFragment;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.NoWhenBranchMatchedException;
import o6.C1967a;
import ph.C2070f1;
import ve.InterfaceC2347a;
import ye.C2530a;
import ye.c;
import ye.d;
import ye.e;
import ye.f;
import ye.g;
import ye.h;
import ye.i;
import ye.j;
import ye.k;
import ye.l;
import ye.m;
import ye.n;
import ye.o;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public final class SliderActionView extends ConstraintLayout {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f14896e0 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f14897B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public g f14898K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public f f14899P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public c f14900Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public h f14901R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public n f14902S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f14903T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ObjectAnimator f14904U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ObjectAnimator f14905V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public AnimatorSet f14906W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AnimatorSet f14907a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final InterfaceC1033d f14908b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final InterfaceC1033d f14909c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f14910d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final InterfaceC1033d f14911d0;
    public final View e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressBar f14912g;
    public int h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f14913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f14914l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f14915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f14916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f14917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f14918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14920s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f14921t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f14922u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f14923v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f14924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f14925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k f14926y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.j.g(context, "context");
        this.j = true;
        this.f14913k = 300L;
        this.f14914l = 200L;
        this.m = 300L;
        this.f14915n = 500L;
        this.f14920s = 1.0f;
        this.f14902S = n.f21143a;
        this.f14908b0 = C1034e.b(new n0.e(10));
        this.f14909c0 = C1034e.b(new n0.e(11));
        this.f14911d0 = C1034e.b(new n0.e(12));
        View.OnTouchListener x12 = new X1(this, 5);
        setMinWidth((int) (getResources().getDisplayMetrics().density * 60.0f));
        setMinHeight((int) (40.0f * getResources().getDisplayMetrics().density));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, W4.c.f6303s, 0, 0);
        kotlin.jvm.internal.j.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.j = typedArrayObtainStyledAttributes.getBoolean(7, true);
        this.f14913k = typedArrayObtainStyledAttributes.getInt(11, 300);
        this.f14914l = typedArrayObtainStyledAttributes.getInt(10, 200);
        this.m = typedArrayObtainStyledAttributes.getInt(2, 300);
        this.f14915n = typedArrayObtainStyledAttributes.getInt(3, 500);
        typedArrayObtainStyledAttributes.getInt(6, 300);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
        if (typedValuePeekValue == null || typedValuePeekValue.type == 0 || isInEditMode()) {
            View view = new View(getContext());
            this.e = view;
            view.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.pma_background_gradient_gainsboro_light_gray_light_light));
        } else {
            String resourceTypeName = getResources().getResourceTypeName(typedValuePeekValue.resourceId);
            int i = typedValuePeekValue.type;
            if ((i >= 28 && i <= 31) || kotlin.jvm.internal.j.b(resourceTypeName, "color") || kotlin.jvm.internal.j.b(resourceTypeName, "drawable")) {
                View view2 = new View(getContext());
                view2.setBackground(ContextCompat.getDrawable(view2.getContext(), typedValuePeekValue.resourceId));
                this.e = view2;
            } else {
                View view3 = new View(getContext());
                this.e = view3;
                ContextCompat.getDrawable(view3.getContext(), R.drawable.pma_background_gradient_gainsboro_light_gray_light_light);
            }
        }
        ViewGroup.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        View view4 = this.e;
        if (view4 == null) {
            kotlin.jvm.internal.j.n("mBackgroundView");
            throw null;
        }
        addView(view4, layoutParams);
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(1);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type == 0 || isInEditMode()) {
            View view5 = new View(getContext());
            this.f = view5;
            view5.setBackground(ContextCompat.getDrawable(getContext(), android.R.color.transparent));
        } else {
            String resourceTypeName2 = getResources().getResourceTypeName(typedValuePeekValue2.resourceId);
            int i4 = typedValuePeekValue2.type;
            if ((i4 >= 28 && i4 <= 31) || kotlin.jvm.internal.j.b(resourceTypeName2, "color") || kotlin.jvm.internal.j.b(resourceTypeName2, "drawable")) {
                View view6 = new View(getContext());
                view6.setBackground(ContextCompat.getDrawable(view6.getContext(), typedValuePeekValue2.resourceId));
                this.f = view6;
            } else if (kotlin.jvm.internal.j.b(resourceTypeName2, TtmlNode.TAG_LAYOUT)) {
                this.f = View.inflate(getContext(), typedValuePeekValue2.resourceId, null);
            } else {
                View view7 = new View(getContext());
                this.f = view7;
                ContextCompat.getDrawable(view7.getContext(), android.R.color.transparent);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -1);
        View view8 = this.f;
        if (view8 == null) {
            kotlin.jvm.internal.j.n("mForegroundView");
            throw null;
        }
        addView(view8, layoutParams2);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, (int) (60.0f * getResources().getDisplayMetrics().density));
        this.f14916o = ContextCompat.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.pma_selectable_background_primary_rounded));
        this.f14917p = ContextCompat.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(13, R.drawable.pma_ic_arrow_forward_light_light));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(this.f14917p);
        imageView.setBackground(this.f14916o);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f14910d = imageView;
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(this.h, -1);
        layoutParams3.leftToLeft = 0;
        layoutParams3.rightToRight = 0;
        layoutParams3.horizontalBias = 0.0f;
        View view9 = this.f14910d;
        if (view9 == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        addView(view9, layoutParams3);
        int color = typedArrayObtainStyledAttributes.getColor(4, ContextCompat.getColor(context, R.color.light));
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, (int) (24.0f * getResources().getDisplayMetrics().density));
        ProgressBar progressBar = new ProgressBar(context);
        this.f14912g = progressBar;
        progressBar.setIndeterminate(true);
        if (!isInEditMode()) {
            ProgressBar progressBar2 = this.f14912g;
            if (progressBar2 == null) {
                kotlin.jvm.internal.j.n("mLoadProgressBar");
                throw null;
            }
            progressBar2.setVisibility(8);
        }
        int i6 = this.i;
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(i6, i6);
        layoutParams4.leftToLeft = 0;
        layoutParams4.rightToRight = 0;
        layoutParams4.topToTop = 0;
        layoutParams4.bottomToBottom = 0;
        layoutParams4.horizontalBias = 0.5f;
        ProgressBar progressBar3 = this.f14912g;
        if (progressBar3 == null) {
            kotlin.jvm.internal.j.n("mLoadProgressBar");
            throw null;
        }
        DrawableCompat.setTint(progressBar3.getIndeterminateDrawable(), color);
        View view10 = this.f14912g;
        if (view10 == null) {
            kotlin.jvm.internal.j.n("mLoadProgressBar");
            throw null;
        }
        addView(view10, layoutParams4);
        this.f14918q = ContextCompat.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(14, R.drawable.pma_ic_check_with_circle));
        this.f14919r = typedArrayObtainStyledAttributes.getBoolean(8, false);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 1.0f);
        float f3 = f > 1.0f ? 1.0f : f;
        this.f14920s = f3 < 0.25f ? 0.25f : f3;
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(x12);
    }

    public static boolean b(SliderActionView sliderActionView, View view, MotionEvent event) {
        kotlin.jvm.internal.j.g(view, "view");
        kotlin.jvm.internal.j.g(event, "event");
        int action = event.getAction();
        if (action == 0) {
            if (sliderActionView.f14902S == n.f21143a && sliderActionView.j(event)) {
                float x6 = event.getX();
                ImageView imageView = sliderActionView.f14910d;
                if (imageView == null) {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
                sliderActionView.f14903T = x6 - imageView.getX();
                sliderActionView.setMState(n.f21144b);
                sliderActionView.setMState(n.c);
            } else if (sliderActionView.f14902S == n.f21145d && sliderActionView.j(event)) {
                ObjectAnimator objectAnimator = sliderActionView.f14904U;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                float x8 = event.getX();
                ImageView imageView2 = sliderActionView.f14910d;
                if (imageView2 == null) {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
                sliderActionView.f14903T = x8 - imageView2.getX();
                sliderActionView.setMState(n.c);
            } else if (sliderActionView.f14902S == n.e && sliderActionView.j(event) && sliderActionView.e() < 1.0f) {
                ObjectAnimator objectAnimator2 = sliderActionView.f14905V;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                float x10 = event.getX();
                ImageView imageView3 = sliderActionView.f14910d;
                if (imageView3 == null) {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
                sliderActionView.f14903T = x10 - imageView3.getX();
                sliderActionView.setMState(n.c);
            }
            ViewParent parent = sliderActionView.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1) {
            if (sliderActionView.f14902S == n.c) {
                if (sliderActionView.k(sliderActionView.e())) {
                    sliderActionView.setMState(n.e);
                    sliderActionView.f14905V = sliderActionView.g();
                } else {
                    sliderActionView.f14903T = -1.0f;
                    sliderActionView.setMState(n.f21145d);
                    sliderActionView.f14904U = sliderActionView.h();
                }
            }
            ViewParent parent2 = sliderActionView.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
                return true;
            }
        } else if (action == 2) {
            if (sliderActionView.f14902S == n.c) {
                ImageView imageView4 = sliderActionView.f14910d;
                if (imageView4 == null) {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
                float x11 = imageView4.getX();
                if (sliderActionView.f14910d == null) {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
                if (x11 + r4.getWidth() >= sliderActionView.getWidth()) {
                    sliderActionView.setMState(n.f);
                    sliderActionView.setMState(n.f21146g);
                    sliderActionView.f14906W = sliderActionView.f();
                } else {
                    float fMax = Math.max(0.0f, event.getX() - sliderActionView.f14903T);
                    float width = sliderActionView.getWidth();
                    if (sliderActionView.f14910d == null) {
                        kotlin.jvm.internal.j.n("mSliderImageView");
                        throw null;
                    }
                    float width2 = (width - r5.getWidth()) + 1;
                    if (fMax > width2) {
                        fMax = width2;
                    }
                    ImageView imageView5 = sliderActionView.f14910d;
                    if (imageView5 == null) {
                        kotlin.jvm.internal.j.n("mSliderImageView");
                        throw null;
                    }
                    imageView5.setX(fMax);
                    sliderActionView.l();
                    if (sliderActionView.f14923v != null) {
                        sliderActionView.e();
                    }
                }
                if (!sliderActionView.j(event)) {
                    if (sliderActionView.k(sliderActionView.e())) {
                        sliderActionView.setMState(n.e);
                        sliderActionView.f14905V = sliderActionView.g();
                    } else {
                        sliderActionView.f14903T = -1.0f;
                        sliderActionView.setMState(n.f21145d);
                        sliderActionView.f14904U = sliderActionView.h();
                    }
                }
            }
            ViewParent parent3 = sliderActionView.getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(sliderActionView.j(event));
                return true;
            }
        } else {
            if (action != 3) {
                return false;
            }
            if (sliderActionView.f14902S == n.c) {
                if (sliderActionView.k(sliderActionView.e())) {
                    sliderActionView.setMState(n.e);
                    sliderActionView.f14905V = sliderActionView.g();
                } else {
                    sliderActionView.f14903T = -1.0f;
                    sliderActionView.setMState(n.f21145d);
                    sliderActionView.f14904U = sliderActionView.h();
                }
            }
            ViewParent parent4 = sliderActionView.getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return true;
    }

    private final Interpolator getMAccelerateDecelerateInterpolator() {
        return (Interpolator) this.f14908b0.getValue();
    }

    private final Interpolator getMAccelerateInterpolator() {
        return (Interpolator) this.f14909c0.getValue();
    }

    private final Interpolator getMDecelerateInterpolator() {
        return (Interpolator) this.f14911d0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMState(n nVar) {
        int i = 2;
        int i4 = 13;
        int i6 = 0;
        this.f14902S = nVar;
        int iOrdinal = nVar.ordinal();
        EnumC1215d enumC1215d = EnumC1215d.SHOP;
        switch (iOrdinal) {
            case 0:
            case 6:
            case 8:
            case 10:
                return;
            case 1:
                l lVar = this.f14922u;
                if (lVar != null) {
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment = (ShopV3ConfirmationBottomSheetFragment) ((C2070f1) lVar).f19463b;
                    C1220i c1220i = shopV3ConfirmationBottomSheetFragment.f10238B;
                    FragmentActivity activity = shopV3ConfirmationBottomSheetFragment.getActivity();
                    C1219h c1219hD = C1219h.d(enumC1215d);
                    c1219hD.n(13);
                    c1219hD.t(EnumC1217f.BUY);
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hD.j.put("progress", TtmlNode.START);
                    c1220i.c(activity, c1219hD);
                    return;
                }
                return;
            case 2:
                if (this.f14923v != null) {
                    e();
                    return;
                }
                return;
            case 3:
                if (this.f14924w != null) {
                    e();
                    return;
                }
                return;
            case 4:
                if (this.f14925x != null) {
                    e();
                    return;
                }
                return;
            case 5:
                k kVar = this.f14926y;
                if (kVar != null) {
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment2 = (ShopV3ConfirmationBottomSheetFragment) ((C2070f1) kVar).f19463b;
                    K k8 = shopV3ConfirmationBottomSheetFragment2.f14780R;
                    kotlin.jvm.internal.j.d(k8);
                    k8.f3699k.setVisibility(8);
                    C1220i c1220i2 = shopV3ConfirmationBottomSheetFragment2.f10238B;
                    FragmentActivity activity2 = shopV3ConfirmationBottomSheetFragment2.getActivity();
                    C1219h c1219hD2 = C1219h.d(enumC1215d);
                    c1219hD2.n(13);
                    c1219hD2.t(EnumC1217f.BUY);
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hD2.j.put("progress", "finish");
                    c1220i2.c(activity2, c1219hD2);
                    return;
                }
                return;
            case 7:
                g gVar = this.f14898K;
                if (gVar != null) {
                    A7.j jVarQ1 = ((ShopV3ConfirmationBottomSheetFragment) ((C2070f1) gVar).f19463b).q1();
                    Order order = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get())).f14782T;
                    if (order == null) {
                        kotlin.jvm.internal.j.n("mPurchaseOrder");
                        throw null;
                    }
                    PaymentConfirmationSummary paymentConfirmationSummary = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVarQ1.c.get())).f14781S;
                    if (paymentConfirmationSummary == null) {
                        kotlin.jvm.internal.j.n("mPaymentConfirmationSummary");
                        throw null;
                    }
                    String id = paymentConfirmationSummary.getTargetProduct().getId();
                    C1281r0 c1281r0 = (C1281r0) jVarQ1.e;
                    p<Order> pVarExecutePurchaseOrder = c1281r0.f11477b.executePurchaseOrder(order.mId());
                    a aVar = new a(26, c1281r0, id);
                    pVarExecutePurchaseOrder.getClass();
                    jVarQ1.e(new Lh.d(new Lh.d(new Lh.h(new Lh.d(pVarExecutePurchaseOrder, aVar, i), b.a(), i6), new o6.f(jVarQ1, 9), i), new C1967a(jVarQ1, i4), i6).e());
                    return;
                }
                return;
            case 9:
                c cVar = this.f14900Q;
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void d(int i) {
        int i4 = 1;
        int i6 = 2;
        setLoadFinishedIcon(i);
        if (this.f14902S != n.h) {
            yk.a.c();
            return;
        }
        setMState(n.i);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(100.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(getMAccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addListener(new o(this, 3));
        valueAnimatorOfFloat.addUpdateListener(new C2530a(this, 4));
        long j = this.f14915n;
        if (j < 20) {
            j = 20;
        }
        valueAnimatorOfFloat.setDuration(j);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setInterpolator(getMAccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addListener(new o(this, i6));
        valueAnimatorOfInt.addUpdateListener(new C2530a(this, 5));
        long j6 = this.f14915n;
        valueAnimatorOfInt.setDuration(j6 >= 20 ? j6 : 20L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new o(this, i4));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfInt);
        animatorSet.start();
        this.f14907a0 = animatorSet;
    }

    public final float e() {
        ImageView imageView = this.f14910d;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        float x6 = imageView.getX();
        int width = getWidth();
        if (this.f14910d == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        float fMax = Math.max(0.0f, x6 / (width - r4.getWidth()));
        if (fMax > 1.0f) {
            return 1.0f;
        }
        return fMax;
    }

    public final AnimatorSet f() {
        int i = 2;
        int i4 = 1;
        int i6 = 0;
        ImageView imageView = this.f14910d;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(imageView.getMeasuredWidth(), getMeasuredWidth());
        valueAnimatorOfInt.setInterpolator(getMDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new C2530a(this, i4));
        long j = this.m;
        if (j < 20) {
            j = 20;
        }
        valueAnimatorOfInt.setDuration(j);
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "x", imageView.getX(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(getMAccelerateDecelerateInterpolator());
        long j6 = this.m;
        if (j6 < 20) {
            j6 = 20;
        }
        objectAnimatorOfFloat.setDuration(j6);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt2.addUpdateListener(new C2530a(this, i));
        valueAnimatorOfInt2.setInterpolator(getMAccelerateDecelerateInterpolator());
        long j7 = this.m;
        valueAnimatorOfInt2.setDuration(j7 >= 20 ? j7 : 20L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new o(this, i6));
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat, valueAnimatorOfInt2);
        animatorSet.start();
        return animatorSet;
    }

    public final ObjectAnimator g() {
        int i = 0;
        ImageView imageView = this.f14910d;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        float x6 = imageView.getX();
        int width = getWidth();
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "x", x6, width - imageView.getWidth());
        objectAnimatorOfFloat.setInterpolator(getMDecelerateInterpolator());
        long jE = (long) (((1.0f - e()) / (1.0f - this.f14920s)) * this.f14914l);
        if (jE < 20) {
            jE = 20;
        }
        objectAnimatorOfFloat.setDuration(jE);
        objectAnimatorOfFloat.addListener(new o(this, 4));
        objectAnimatorOfFloat.addUpdateListener(new C2530a(this, i));
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    public final c getMStateFinishedListener() {
        return this.f14900Q;
    }

    public final d getMStateIdleListener() {
        return this.f14921t;
    }

    public final e getMStateLoadExpandingListener() {
        return this.f14897B;
    }

    public final f getMStateLoadFinishingListener() {
        return this.f14899P;
    }

    public final g getMStateLoadInProgressListener() {
        return this.f14898K;
    }

    public final h getMStateResettingListener() {
        return this.f14901R;
    }

    public final i getMStateSlideAutoCompletingListener() {
        return this.f14925x;
    }

    public final j getMStateSlideBackListener() {
        return this.f14924w;
    }

    public final k getMStateSlideCompletedListener() {
        return this.f14926y;
    }

    public final l getMStateSlideStartedListener() {
        return this.f14922u;
    }

    public final m getMStateSlidingListener() {
        return this.f14923v;
    }

    public final ObjectAnimator h() {
        ImageView imageView = this.f14910d;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "x", imageView.getX(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(getMAccelerateDecelerateInterpolator());
        long jE = (long) (e() * this.f14913k);
        if (jE < 20) {
            jE = 20;
        }
        objectAnimatorOfFloat.setDuration(jE);
        objectAnimatorOfFloat.addListener(new o(this, 5));
        objectAnimatorOfFloat.addUpdateListener(new C2530a(this, 3));
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    public final void i() {
        ObjectAnimator objectAnimator = this.f14904U;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f14905V;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        AnimatorSet animatorSet = this.f14906W;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f14907a0;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ImageView imageView = this.f14910d;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        imageView.setX(0.0f);
        imageView.setVisibility(0);
        imageView.setImageDrawable(this.f14917p);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(this.h, -1);
        layoutParams.leftToLeft = 0;
        layoutParams.rightToRight = 0;
        layoutParams.horizontalBias = 0.0f;
        imageView.setLayoutParams(layoutParams);
        View view = this.f;
        if (view == null) {
            kotlin.jvm.internal.j.n("mForegroundView");
            throw null;
        }
        view.setAlpha(1.0f);
        ProgressBar progressBar = this.f14912g;
        if (progressBar == null) {
            kotlin.jvm.internal.j.n("mLoadProgressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        ProgressBar progressBar2 = this.f14912g;
        if (progressBar2 == null) {
            kotlin.jvm.internal.j.n("mLoadProgressBar");
            throw null;
        }
        progressBar2.setAlpha(1.0f);
        setMState(n.f21143a);
    }

    public final boolean j(MotionEvent motionEvent) {
        ImageView imageView = this.f14910d;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        float x6 = imageView.getX();
        ImageView imageView2 = this.f14910d;
        if (imageView2 == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        float x8 = imageView2.getX();
        if (this.f14910d == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        float width = x8 + r4.getWidth();
        float x10 = motionEvent.getX();
        if (x6 > x10 || x10 > width) {
            return false;
        }
        ImageView imageView3 = this.f14910d;
        if (imageView3 == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        float y7 = imageView3.getY();
        ImageView imageView4 = this.f14910d;
        if (imageView4 == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        float y10 = imageView4.getY();
        if (this.f14910d == null) {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
        float height = y10 + r4.getHeight();
        float y11 = motionEvent.getY();
        return y7 <= y11 && y11 <= height;
    }

    public final boolean k(float f) {
        return this.f14919r && f >= this.f14920s && f < 1.0f;
    }

    public final void l() {
        boolean z4 = this.j;
        if (z4) {
            float fMax = Math.max(0.0f, 1.0f - e());
            View view = this.f;
            if (view != null) {
                view.setAlpha(fMax);
                return;
            } else {
                kotlin.jvm.internal.j.n("mForegroundView");
                throw null;
            }
        }
        if (z4) {
            return;
        }
        View view2 = this.f;
        if (view2 == null) {
            kotlin.jvm.internal.j.n("mForegroundView");
            throw null;
        }
        if (view2.getAlpha() == 1.0f) {
            return;
        }
        View view3 = this.f;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        } else {
            kotlin.jvm.internal.j.n("mForegroundView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setLoadExpandingAnimationDuration(long j) {
        this.m = j;
    }

    public final void setLoadFinishedIcon(@DrawableRes int i) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i);
        this.f14918q = drawable;
        n nVar = this.f14902S;
        if (nVar == n.j || nVar == n.i) {
            ImageView imageView = this.f14910d;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                kotlin.jvm.internal.j.n("mSliderImageView");
                throw null;
            }
        }
    }

    public final void setLoadFinishingAnimationDuration(long j) {
        this.f14915n = j;
    }

    public final void setLoadProgressBarTintColor(@ColorRes int i) {
        ProgressBar progressBar = this.f14912g;
        if (progressBar != null) {
            DrawableCompat.setTint(progressBar.getIndeterminateDrawable(), ContextCompat.getColor(getContext(), i));
        } else {
            kotlin.jvm.internal.j.n("mLoadProgressBar");
            throw null;
        }
    }

    public final void setLoadProgressBarWidth(@DimenRes int i) {
        this.i = getResources().getDimensionPixelSize(i);
        n nVar = this.f14902S;
        if (nVar == n.f21146g || nVar == n.h || nVar == n.i) {
            return;
        }
        ProgressBar progressBar = this.f14912g;
        if (progressBar == null) {
            kotlin.jvm.internal.j.n("mLoadProgressBar");
            throw null;
        }
        int i4 = this.i;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(i4, i4);
        layoutParams.leftToLeft = 0;
        layoutParams.rightToRight = 0;
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.horizontalBias = 0.5f;
        progressBar.setLayoutParams(layoutParams);
    }

    public final void setMStateFinishedListener(c cVar) {
        this.f14900Q = cVar;
    }

    public final void setMStateIdleListener(d dVar) {
        this.f14921t = dVar;
    }

    public final void setMStateLoadExpandingListener(e eVar) {
        this.f14897B = eVar;
    }

    public final void setMStateLoadFinishingListener(f fVar) {
        this.f14899P = fVar;
    }

    public final void setMStateLoadInProgressListener(g gVar) {
        this.f14898K = gVar;
    }

    public final void setMStateResettingListener(h hVar) {
        this.f14901R = hVar;
    }

    public final void setMStateSlideAutoCompletingListener(i iVar) {
        this.f14925x = iVar;
    }

    public final void setMStateSlideBackListener(j jVar) {
        this.f14924w = jVar;
    }

    public final void setMStateSlideCompletedListener(k kVar) {
        this.f14926y = kVar;
    }

    public final void setMStateSlideStartedListener(l lVar) {
        this.f14922u = lVar;
    }

    public final void setMStateSlidingListener(m mVar) {
        this.f14923v = mVar;
    }

    public final void setOnStateChangeListener(ye.b changeStateListener) {
        kotlin.jvm.internal.j.g(changeStateListener, "changeStateListener");
        this.f14921t = changeStateListener;
        this.f14922u = changeStateListener;
        this.f14923v = changeStateListener;
        this.f14924w = changeStateListener;
        this.f14925x = changeStateListener;
        this.f14926y = changeStateListener;
        this.f14897B = changeStateListener;
        this.f14898K = changeStateListener;
        this.f14899P = changeStateListener;
        this.f14900Q = changeStateListener;
        this.f14901R = changeStateListener;
    }

    public final void setResettingAnimationDuration(long j) {
    }

    public final void setShouldFadeForegroundOnSlide(boolean z4) {
        this.j = z4;
        if (z4) {
            return;
        }
        View view = this.f;
        if (view != null) {
            view.setAlpha(1.0f);
        } else {
            kotlin.jvm.internal.j.n("mForegroundView");
            throw null;
        }
    }

    public final void setSlideAutoCompleteEnabled(boolean z4) {
        this.f14919r = z4;
    }

    public final void setSlideAutoCompleteThreshold(@FloatRange(from = 0.25d, to = 1.0d) float f) {
        this.f14920s = f;
    }

    public final void setSlideAutoCompletingAnimationDuration(long j) {
        this.f14914l = j;
    }

    public final void setSlideBackAnimationDuration(long j) {
        this.f14913k = j;
    }

    public final void setSliderBackground(@DrawableRes int i) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i);
        this.f14916o = drawable;
        ImageView imageView = this.f14910d;
        if (imageView != null) {
            imageView.setBackground(drawable);
        } else {
            kotlin.jvm.internal.j.n("mSliderImageView");
            throw null;
        }
    }

    public final void setSliderForwardIcon(@DrawableRes int i) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i);
        this.f14917p = drawable;
        n nVar = this.f14902S;
        if (nVar == n.f21143a || nVar == n.c || nVar == n.f21145d || nVar == n.f21146g || nVar == n.f21147k) {
            ImageView imageView = this.f14910d;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                kotlin.jvm.internal.j.n("mSliderImageView");
                throw null;
            }
        }
    }

    public final void setSliderWidth(@DimenRes int i) {
        this.h = getResources().getDimensionPixelSize(i);
        if (this.f14902S == n.f21143a) {
            ImageView imageView = this.f14910d;
            if (imageView == null) {
                kotlin.jvm.internal.j.n("mSliderImageView");
                throw null;
            }
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(this.h, -1);
            layoutParams.leftToLeft = 0;
            layoutParams.rightToRight = 0;
            layoutParams.horizontalBias = 0.0f;
            imageView.setLayoutParams(layoutParams);
        }
    }
}
