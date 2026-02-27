package com.paymaya.mayaui.common.view.widget.inforeviewlist.item;

import N5.C0435a;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaLabelTwoValuesReviewInfoItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0435a f12096a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaLabelTwoValuesReviewInfoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_label_two_values_review_info_item_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.icon_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.icon_image_view);
        if (imageView != null) {
            i = R.id.middle_vertical_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.middle_vertical_guideline);
            if (guideline != null) {
                i = R.id.second_value_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.second_value_text_view);
                if (textView != null) {
                    i = R.id.title_text_view;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view);
                    if (textView2 != null) {
                        i = R.id.value_text_view;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.value_text_view);
                        if (textView3 != null) {
                            this.f12096a = new C0435a((ViewGroup) viewInflate, (Object) imageView, (Object) guideline, (Object) textView, (View) textView2, (Object) textView3, 18);
                            return;
                        }
                    }
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

    public final void setIcon(@DrawableRes int i) {
        C0435a c0435a = this.f12096a;
        ((ImageView) c0435a.c).setVisibility(0);
        ((ImageView) c0435a.c).setImageResource(i);
    }

    public final void setSecondValue(String str) {
        C0435a c0435a = this.f12096a;
        if (str == null || C2576A.H(str)) {
            ((TextView) c0435a.e).setVisibility(8);
        } else {
            ((TextView) c0435a.e).setVisibility(0);
            ((TextView) c0435a.e).setText(str);
        }
    }

    public final void setTextAlignment(boolean z4) {
        C0435a c0435a = this.f12096a;
        if (!z4) {
            ((TextView) c0435a.f4049g).setTextAlignment(5);
            ((TextView) c0435a.e).setTextAlignment(5);
        } else {
            ((Guideline) c0435a.f4048d).setGuidelinePercent(0.4f);
            ((TextView) c0435a.f4049g).setTextAlignment(6);
            ((TextView) c0435a.e).setTextAlignment(6);
        }
    }

    public final void setTitle(String text) {
        j.g(text, "text");
        ((TextView) this.f12096a.f).setText(text);
    }

    public final void setValue(String text) {
        j.g(text, "text");
        ((TextView) this.f12096a.f4049g).setText(text);
    }
}
