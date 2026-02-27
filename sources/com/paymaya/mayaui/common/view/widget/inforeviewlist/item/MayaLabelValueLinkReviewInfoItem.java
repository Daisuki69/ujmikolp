package com.paymaya.mayaui.common.view.widget.inforeviewlist.item;

import N5.C0447e;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaLabelValueLinkReviewInfoItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0447e f12097a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaLabelValueLinkReviewInfoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_label_value_link_review_info_item_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.link_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.link_text_view);
        if (textView != null) {
            i = R.id.middle_vertical_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.middle_vertical_guideline);
            if (guideline != null) {
                i = R.id.title_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view);
                if (textView2 != null) {
                    i = R.id.value_text_view;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.value_text_view);
                    if (textView3 != null) {
                        this.f12097a = new C0447e((ConstraintLayout) viewInflate, textView, (View) guideline, textView2, (View) textView3, 27);
                        return;
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

    public final void setTextAlignment(boolean z4) {
        if (z4) {
            C0447e c0447e = this.f12097a;
            ((Guideline) c0447e.c).setGuidelinePercent(0.4f);
            ((TextView) c0447e.e).setTextAlignment(6);
            ((TextView) c0447e.f).setTextAlignment(6);
        }
    }

    public final void setTitle(String text) {
        j.g(text, "text");
        ((TextView) this.f12097a.f4080d).setText(text);
    }

    public final void setValue(String text) {
        j.g(text, "text");
        ((TextView) this.f12097a.e).setText(text);
    }
}
