package com.paymaya.mayaui.common.view.widget.snackbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.snackbar.ContentViewCallback;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaSwipeableSnackbarView extends ConstraintLayout implements ContentViewCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f12099d;
    public final TextView e;
    public final ImageView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaSwipeableSnackbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = View.inflate(context, R.layout.maya_snackbar_swipeable_layout, this);
        this.f12099d = viewInflate;
        this.e = viewInflate != null ? (TextView) viewInflate.findViewById(R.id.view_content_text) : null;
        this.f = viewInflate != null ? (ImageView) viewInflate.findViewById(R.id.view_content_image) : null;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public final void animateContentIn(int i, int i4) {
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public final void animateContentOut(int i, int i4) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setImage(Drawable drawable) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setText(String text) {
        j.g(text, "text");
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(text);
        }
    }
}
