package com.paymaya.common.widget;

import Ba.a;
import N5.C0453g;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class MayaRadioOptionView extends ConstraintLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0453g f11284d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MayaRadioOptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.g(context, "context");
    }

    public final RadioButton getRadioButton() {
        RadioButton radioButton = (RadioButton) this.f11284d.c;
        j.f(radioButton, "radioButton");
        return radioButton;
    }

    public final String getText() {
        return ((TextView) this.f11284d.e).getText().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setChecked(boolean z4) {
        ((RadioButton) this.f11284d.c).setChecked(z4);
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        super.setClickable(z4);
        setFocusable(z4);
    }

    public MayaRadioOptionView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_radio_option_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i6 = R.id.radio_button;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(viewInflate, R.id.radio_button);
        if (radioButton != null) {
            i6 = R.id.text_view_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
            if (textView != null) {
                i6 = R.id.text_view_label;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_label);
                if (textView2 != null) {
                    this.f11284d = new C0453g(24, (ConstraintLayout) viewInflate, radioButton, textView, textView2);
                    radioButton.setClickable(false);
                    radioButton.setFocusable(false);
                    setOnClickListener(new a(this, 5));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }
}
