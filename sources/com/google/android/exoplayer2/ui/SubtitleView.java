package com.google.android.exoplayer2.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u1.C2292a;
import w1.B;
import w1.C2364b;
import w1.G;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f9691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2292a f9692b;
    public float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9693d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9694g;
    public B h;
    public View i;

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9691a = Collections.EMPTY_LIST;
        this.f9692b = C2292a.e;
        this.c = 0.0533f;
        this.f9693d = 0.08f;
        this.e = true;
        this.f = true;
        C2364b c2364b = new C2364b(context, attributeSet);
        this.h = c2364b;
        this.i = c2364b;
        addView(c2364b);
        this.f9694g = 1;
    }

    private List<Object> getCuesWithStylingPreferencesApplied() {
        if (this.e && this.f) {
            return this.f9691a;
        }
        ArrayList arrayList = new ArrayList(this.f9691a.size());
        if (this.f9691a.size() <= 0) {
            return arrayList;
        }
        this.f9691a.get(0).getClass();
        throw new ClassCastException();
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (AbstractC2550e.f21351a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C2292a getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i = AbstractC2550e.f21351a;
        C2292a c2292a = C2292a.e;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c2292a;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            return new C2292a(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new C2292a(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & B> void setView(T t5) {
        removeView(this.i);
        View view = this.i;
        if (view instanceof G) {
            ((G) view).f20521b.destroy();
        }
        this.i = t5;
        this.h = t5;
        addView(t5);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.h.a(getCuesWithStylingPreferencesApplied(), this.f9692b, this.c, this.f9693d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setApplyEmbeddedFontSizes(boolean z4) {
        this.f = z4;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z4) {
        this.e = z4;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f9693d = f;
        c();
    }

    public void setCues(@Nullable List<Object> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f9691a = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.c = f;
        c();
    }

    public void setStyle(C2292a c2292a) {
        this.f9692b = c2292a;
        c();
    }

    public void setViewType(int i) {
        if (this.f9694g == i) {
            return;
        }
        if (i == 1) {
            setView(new C2364b(getContext(), null));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new G(getContext()));
        }
        this.f9694g = i;
    }
}
