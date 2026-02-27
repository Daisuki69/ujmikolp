package com.paymaya.mayaui.common.view.widget.inforeviewlist.item;

import N5.C0453g;
import android.app.Activity;
import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaEditTextReviewInfoItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0453g f12095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaEditTextReviewInfoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_edit_text_review_info_item_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.barrier_header;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_header)) != null) {
            i = R.id.edit_text_value;
            EditText editText = (EditText) ViewBindings.findChildViewById(viewInflate, R.id.edit_text_value);
            if (editText != null) {
                i = R.id.layout_content;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.layout_content);
                if (constraintLayout != null) {
                    i = R.id.text_view_action;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_action);
                    if (htmlTextView != null) {
                        i = R.id.text_view_description;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                        if (textView != null) {
                            i = R.id.text_view_header;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header);
                            if (textView2 != null) {
                                this.f12095a = new C0453g((ConstraintLayout) viewInflate, editText, constraintLayout, htmlTextView, textView, textView2);
                                return;
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
        TextView textView = (TextView) this.f12095a.f4095d;
        textView.setText(str);
        textView.setVisibility(str != null ? 0 : 8);
    }

    public final void setEditTextWatcher(TextWatcher textWatcher) {
        j.g(textWatcher, "textWatcher");
        ((EditText) this.f12095a.c).addTextChangedListener(textWatcher);
    }

    public final void setHeader(String text) {
        j.g(text, "text");
        ((TextView) this.f12095a.e).setText(text);
    }

    public final void setMultiLine(boolean z4) {
        if (z4) {
            ((EditText) this.f12095a.c).setMaxLines(1);
        }
    }

    public final void setValue(String str) {
        EditText editText = (EditText) this.f12095a.c;
        editText.setText(str);
        editText.setVisibility(str != null ? 0 : 8);
    }
}
