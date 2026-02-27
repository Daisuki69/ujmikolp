package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzfob extends ViewGroup {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        throw null;
    }
}
