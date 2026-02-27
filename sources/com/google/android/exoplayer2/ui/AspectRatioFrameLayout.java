package com.google.android.exoplayer2.ui;

import H3.a;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import w1.AbstractC2366d;
import w1.InterfaceC2363a;

/* JADX INFO: loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9688d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9690b;
    public int c;

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2366d.f20559a, 0, 0);
            try {
                this.c = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f9689a = new a(this);
    }

    public int getResizeMode() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        float f;
        float f3;
        super.onMeasure(i, i4);
        if (this.f9690b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f7 = measuredWidth;
        float f10 = measuredHeight;
        float f11 = (this.f9690b / (f7 / f10)) - 1.0f;
        float fAbs = Math.abs(f11);
        a aVar = this.f9689a;
        if (fAbs <= 0.01f) {
            if (aVar.f2086b) {
                return;
            }
            aVar.f2086b = true;
            ((AspectRatioFrameLayout) aVar.c).post(aVar);
            return;
        }
        int i6 = this.c;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    f = this.f9690b;
                } else if (i6 == 4) {
                    if (f11 > 0.0f) {
                        f = this.f9690b;
                    } else {
                        f3 = this.f9690b;
                    }
                }
                measuredWidth = (int) (f10 * f);
            } else {
                f3 = this.f9690b;
            }
            measuredHeight = (int) (f7 / f3);
        } else if (f11 > 0.0f) {
            f3 = this.f9690b;
            measuredHeight = (int) (f7 / f3);
        } else {
            f = this.f9690b;
            measuredWidth = (int) (f10 * f);
        }
        if (!aVar.f2086b) {
            aVar.f2086b = true;
            ((AspectRatioFrameLayout) aVar.c).post(aVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f9690b != f) {
            this.f9690b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable InterfaceC2363a interfaceC2363a) {
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }
}
