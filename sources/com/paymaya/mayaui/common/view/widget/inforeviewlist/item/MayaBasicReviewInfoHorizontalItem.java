package com.paymaya.mayaui.common.view.widget.inforeviewlist.item;

import N5.C0435a;
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
public final class MayaBasicReviewInfoHorizontalItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0435a f12093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaBasicReviewInfoHorizontalItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_basic_review_info_horizontal_item_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.guide_line;
        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guide_line)) != null) {
            i = R.id.layout_content;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.layout_content)) != null) {
                i = R.id.text_view_action_secondary;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_action_secondary);
                if (textView != null) {
                    i = R.id.text_view_badge;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_badge);
                    if (textView2 != null) {
                        i = R.id.text_view_description;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                        if (textView3 != null) {
                            i = R.id.text_view_header;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header);
                            if (textView4 != null) {
                                i = R.id.text_view_value;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_value);
                                if (textView5 != null) {
                                    this.f12093a = new C0435a((ViewGroup) viewInflate, (Object) textView, (Object) textView2, (Object) textView3, (View) textView4, (Object) textView5, 1);
                                    return;
                                }
                            }
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

    public final void setDescription(String str) {
        TextView textView = (TextView) this.f12093a.e;
        textView.setText(str);
        textView.setVisibility(str != null ? 0 : 8);
    }

    public final void setHeader(String text) {
        j.g(text, "text");
        ((TextView) this.f12093a.f).setText(text);
    }

    public final void setTitleColor(int i) {
        ((TextView) this.f12093a.f).setTextColor(i);
    }

    public final void setValue(String str) {
        TextView textView = (TextView) this.f12093a.f4049g;
        textView.setText(str);
        textView.setVisibility(str != null ? 0 : 8);
    }

    public final void setValueColor(int i) {
        ((TextView) this.f12093a.f4049g).setTextColor(i);
    }
}
