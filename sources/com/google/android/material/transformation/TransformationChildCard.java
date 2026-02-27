package com.google.android.material.transformation;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class TransformationChildCard extends CircularRevealCardView {
    public TransformationChildCard(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.circularreveal.cardview.CircularRevealCardView, com.google.android.material.card.MaterialCardView, androidx.cardview.widget.CardView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public TransformationChildCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
