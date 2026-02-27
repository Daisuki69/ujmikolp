package com.paymaya.mayaui.common.view.widget;

import N5.q1;
import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaHorizontalLabelWithArrow extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f12047a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaHorizontalLabelWithArrow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_view_horizontal_label_with_arrow, (ViewGroup) this, false);
        addView(viewInflate);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.horizontal_label_with_arrow_icon;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.horizontal_label_with_arrow_icon)) != null) {
            i = R.id.horizontal_label_with_arrow_image_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.horizontal_label_with_arrow_image_view);
            if (imageView != null) {
                i = R.id.horizontal_label_with_arrow_label_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.horizontal_label_with_arrow_label_text_view);
                if (textView != null) {
                    this.f12047a = new q1(linearLayout, imageView, textView, 1);
                    if (attributeSet != null) {
                        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f6296k);
                        j.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                        String string = typedArrayObtainStyledAttributes.getString(1);
                        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                        if (string != null) {
                            setLabel(string);
                        }
                        if (drawable != null) {
                            setIcon(drawable);
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setIcon(Drawable icon) {
        j.g(icon, "icon");
        this.f12047a.c.setImageDrawable(icon);
    }

    public final void setLabel(String text) {
        j.g(text, "text");
        this.f12047a.f4189d.setText(text);
    }
}
