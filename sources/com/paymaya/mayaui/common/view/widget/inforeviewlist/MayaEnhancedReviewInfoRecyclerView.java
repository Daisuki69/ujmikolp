package com.paymaya.mayaui.common.view.widget.inforeviewlist;

import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaEnhancedReviewInfoRecyclerView extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaEnhancedReviewInfoRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        setLayoutManager(new LinearLayoutManager(getContext()));
        setOverScrollMode(2);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f6299o);
            j.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
