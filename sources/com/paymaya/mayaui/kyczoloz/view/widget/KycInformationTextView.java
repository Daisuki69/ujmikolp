package com.paymaya.mayaui.kyczoloz.view.widget;

import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycInformationTextView extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycInformationTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        LayoutInflater.from(context).inflate(R.layout.maya_view_kyc_info_box, this);
        int i = R.id.image_view_information_text_icon;
        if (((ImageView) ViewBindings.findChildViewById(this, R.id.image_view_information_text_icon)) != null) {
            i = R.id.text_view_information_text;
            MultiColorTextView multiColorTextView = (MultiColorTextView) ViewBindings.findChildViewById(this, R.id.text_view_information_text);
            if (multiColorTextView != null) {
                setOrientation(0);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.c);
                String string = typedArrayObtainStyledAttributes.getString(0);
                string = string == null ? "" : string;
                String string2 = typedArrayObtainStyledAttributes.getString(1);
                multiColorTextView.a(getAccentColor(), string, string2 != null ? string2 : "");
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    private final int getAccentColor() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.mayaColorAccent, typedValue, true);
        return typedValue.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
