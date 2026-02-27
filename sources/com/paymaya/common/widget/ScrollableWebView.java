package com.paymaya.common.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;
import qj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class ScrollableWebView extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f11288a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
    }

    public final p getMOnScrollChanged() {
        return this.f11288a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i4, int i6, int i10) {
        int i11 = i4 == 0 ? 1 : i4 == computeVerticalScrollRange() - getHeight() ? 2 : 0;
        p pVar = this.f11288a;
        if (pVar != null) {
            pVar.c(Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        super.onScrollChanged(i, i4, i6, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onTouchEvent(motionEvent);
    }

    public final void setMOnScrollChanged(p pVar) {
        this.f11288a = pVar;
    }
}
