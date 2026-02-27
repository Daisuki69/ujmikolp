package com.paymaya.common.widget;

import Ad.a;
import G5.x;
import G5.y;
import G5.z;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemSlideLayoutView extends ConstraintLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f11272r = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GestureDetector f11273d;
    public View e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f11274g;
    public boolean h;
    public float i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11276l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y f11277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f11280q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemSlideLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        this.m = 1.0f;
        this.f11278o = true;
        this.f11273d = new GestureDetector(context, new x(this, 0));
        c(false);
        this.f11274g = 0.0f;
        this.i = 0.0f;
    }

    public static void d(ItemSlideLayoutView itemSlideLayoutView) {
        itemSlideLayoutView.e(itemSlideLayoutView.getPrimaryViewTranslationX(), itemSlideLayoutView.f11279p == 0 ? -itemSlideLayoutView.getMaxSwipeDistance() : itemSlideLayoutView.getMaxSwipeDistance());
        itemSlideLayoutView.h = true;
    }

    private final int getMaxSwipeDistance() {
        return (this.f11279p == 0 ? ((Number) getPrimaryViewHorizontalMargin().f18161b).intValue() : ((Number) getPrimaryViewHorizontalMargin().f18160a).intValue()) + getSecondaryViewWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> getPrimaryViewHorizontalMargin() {
        /*
            r4 = this;
            android.view.View r0 = r4.e
            r1 = 0
            if (r0 == 0) goto L14
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L14
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.getMarginStart()
            goto L15
        L14:
            r0 = r1
        L15:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.view.View r2 = r4.e
            if (r2 == 0) goto L2b
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L2b
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r2.getMarginEnd()
        L2b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.common.widget.ItemSlideLayoutView.getPrimaryViewHorizontalMargin():kotlin.Pair");
    }

    private final float getPrimaryViewTranslationX() {
        View view = this.e;
        if (view != null) {
            return view.getTranslationX();
        }
        return 0.0f;
    }

    private final int getSecondaryViewWidth() {
        View view = this.f;
        if (view != null) {
            return view.getWidth();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPrimaryViewTranslationX(float f) {
        View view = this.e;
        if (view != null) {
            view.setTranslationX(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0051 A[PHI: r2 r5 r8
  0x0051: PHI (r2v8 boolean) = (r2v3 boolean), (r2v11 boolean) binds: [B:44:0x006e, B:30:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r5v6 boolean) = (r5v2 boolean), (r5v9 boolean) binds: [B:44:0x006e, B:30:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r8v20 float) = (r8v13 float), (r8v23 float) binds: [B:44:0x006e, B:30:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053 A[PHI: r2 r5 r8
  0x0053: PHI (r2v6 boolean) = (r2v3 boolean), (r2v11 boolean) binds: [B:44:0x006e, B:30:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r5v4 boolean) = (r5v2 boolean), (r5v9 boolean) binds: [B:44:0x006e, B:30:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r8v14 float) = (r8v13 float), (r8v23 float) binds: [B:44:0x006e, B:30:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.common.widget.ItemSlideLayoutView.setTouchEvent(android.view.MotionEvent):void");
    }

    public boolean __replaced_14537_6_onInterceptTouchEvent(MotionEvent event) {
        j.g(event, "event");
        GestureDetector gestureDetector = this.f11273d;
        if (gestureDetector == null) {
            j.n("mGestureDetector");
            throw null;
        }
        gestureDetector.onTouchEvent(event);
        if (!this.j) {
            setTouchEvent(event);
        }
        return super.onInterceptTouchEvent(event);
    }

    public final void c(boolean z4) {
        float primaryViewTranslationX = getPrimaryViewTranslationX();
        if (z4) {
            e(primaryViewTranslationX, 0.0f);
        } else {
            this.j = false;
            this.f11275k = 0;
            setPrimaryViewTranslationX(0.0f);
        }
        this.h = false;
        y yVar = this.f11277n;
        if (yVar != null) {
            yVar.d();
        }
    }

    public final void e(float f, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.e, "translationX", f, f3);
        objectAnimatorOfFloat.setDuration(100L);
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.addListener(new z(this, f3));
        animatorSet.start();
    }

    public final float getAutoSwipeDistance() {
        float f = this.f11280q;
        return f == 0.0f ? getMaxSwipeDistance() / 2.0f : f;
    }

    public final int getDirection() {
        return this.f11279p;
    }

    public final float getMaxTapDistance() {
        return this.m;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() >= 2) {
            this.f = getChildAt(0);
            this.e = getChildAt(1);
        } else if (getChildCount() == 1) {
            this.e = getChildAt(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return __replaced_14537_6_onInterceptTouchEvent(motionEvent);
    }

    public final void setAutoSwipeDistance(float f) {
        this.f11280q = f;
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        this.f11278o = z4;
        super.setClickable(z4);
    }

    public final void setDirection(int i) {
        this.f11279p = i;
    }

    public final void setItemSlideLayoutListener(y listener) {
        j.g(listener, "listener");
        this.f11277n = listener;
    }

    public final void setMaxTapDistance(float f) {
        this.m = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View view = this.e;
        if (view != null) {
            view.setOnClickListener(new a(4, this, onClickListener));
        }
    }
}
