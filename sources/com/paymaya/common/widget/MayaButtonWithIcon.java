package com.paymaya.common.widget;

import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class MayaButtonWithIcon extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f11281d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaButtonWithIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_button_with_icon, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.maya_button_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_button_icon);
        if (imageView != null) {
            i = R.id.maya_button_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_button_text);
            if (textView != null) {
                this.f11281d = imageView;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6295g);
                String string = typedArrayObtainStyledAttributes.getString(1);
                if (string == null) {
                    string = typedArrayObtainStyledAttributes.getResources().getString(R.string.maya_label_upload_qr);
                    j.f(string, "getString(...)");
                }
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.maya_ic_resources);
                textView.setText(string);
                imageView.setImageResource(resourceId);
                typedArrayObtainStyledAttributes.recycle();
                this.e = R.drawable.maya_ic_resources;
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final int getIconDrawable() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setIconDrawable(int i) {
        this.f11281d.setImageResource(i);
    }
}
