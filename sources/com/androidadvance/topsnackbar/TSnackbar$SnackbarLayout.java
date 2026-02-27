package com.androidadvance.topsnackbar;

import C.b;
import C.d;
import C.f;
import C.h;
import C.k;
import C.l;
import C.m;
import V2.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.firebase.messaging.r;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes2.dex */
public class TSnackbar$SnackbarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f9425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f9426b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9427d;
    public l e;
    public k f;

    public TSnackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f650a);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f9427d = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            ViewCompat.setElevation(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
        LayoutInflater.from(context).inflate(R.layout.tsnackbar_layout_include, this);
        ViewCompat.setAccessibilityLiveRegion(this, 1);
    }

    public final boolean a(int i, int i4, int i6) {
        boolean z4;
        if (i != getOrientation()) {
            setOrientation(i);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f9425a.getPaddingTop() == i4 && this.f9425a.getPaddingBottom() == i6) {
            return z4;
        }
        TextView textView = this.f9425a;
        if (ViewCompat.isPaddingRelative(textView)) {
            ViewCompat.setPaddingRelative(textView, ViewCompat.getPaddingStart(textView), i4, ViewCompat.getPaddingEnd(textView), i6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i6);
        return true;
    }

    public Button getActionView() {
        return this.f9426b;
    }

    public TextView getMessageView() {
        return this.f9425a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k kVar = this.f;
        if (kVar != null) {
            kVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z4;
        super.onDetachedFromWindow();
        k kVar = this.f;
        if (kVar != null) {
            c cVar = (c) kVar;
            m mVar = (m) cVar.f6042b;
            r rVarS = r.s();
            f fVar = mVar.c;
            synchronized (rVarS.f9803b) {
                z4 = true;
                if (!rVarS.E(fVar)) {
                    d dVar = (d) rVarS.e;
                    if (!(dVar != null && dVar.f653a.get() == fVar)) {
                        z4 = false;
                    }
                }
            }
            if (z4) {
                m.f661d.post(new h(cVar, 0));
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9425a = (TextView) findViewById(R.id.snackbar_text);
        this.f9426b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        super.onLayout(z4, i, i4, i6, i10);
        l lVar = this.e;
        if (lVar != null) {
            m mVar = (m) ((A5.l) lVar).f175b;
            mVar.a();
            mVar.f663b.setOnLayoutChangeListener(null);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i6;
        super.onMeasure(i, i4);
        if (this.c > 0) {
            int measuredWidth = getMeasuredWidth();
            int i10 = this.c;
            if (measuredWidth > i10) {
                i = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                super.onMeasure(i, i4);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z4 = this.f9425a.getLayout().getLineCount() > 1;
        if (!z4 || (i6 = this.f9427d) <= 0 || this.f9426b.getMeasuredWidth() <= i6) {
            if (!z4) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i4);
    }

    public void setOnAttachStateChangeListener(k kVar) {
        this.f = kVar;
    }

    public void setOnLayoutChangeListener(l lVar) {
        this.e = lVar;
    }
}
