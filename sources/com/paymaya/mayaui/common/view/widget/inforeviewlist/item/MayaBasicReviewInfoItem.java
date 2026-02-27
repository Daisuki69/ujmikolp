package com.paymaya.mayaui.common.view.widget.inforeviewlist.item;

import N5.C0462k;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public final class MayaBasicReviewInfoItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0462k f12094a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaBasicReviewInfoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_basic_review_info_item_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.barrier_header;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_header)) != null) {
            i = R.id.image_view_action;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_action);
            if (imageView != null) {
                i = R.id.layout_content;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.layout_content);
                if (constraintLayout != null) {
                    i = R.id.text_view_action;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_action);
                    if (htmlTextView != null) {
                        i = R.id.text_view_action_secondary;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_action_secondary);
                        if (textView != null) {
                            i = R.id.text_view_badge;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_badge);
                            if (textView2 != null) {
                                i = R.id.text_view_description;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                                if (textView3 != null) {
                                    i = R.id.text_view_description_secondary;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description_secondary);
                                    if (textView4 != null) {
                                        i = R.id.text_view_header;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header);
                                        if (textView5 != null) {
                                            i = R.id.text_view_value;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_value);
                                            if (textView6 != null) {
                                                this.f12094a = new C0462k((ConstraintLayout) viewInflate, imageView, constraintLayout, htmlTextView, textView, textView2, textView3, textView4, textView5, textView6);
                                                return;
                                            }
                                        }
                                    }
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

    public final void setActionImageView(Drawable drawable) {
        C0462k c0462k = this.f12094a;
        if (drawable == null) {
            ((ImageView) c0462k.f4133g).setVisibility(8);
        } else {
            ((ImageView) c0462k.f4133g).setImageDrawable(drawable);
            ((ImageView) c0462k.f4133g).setVisibility(0);
        }
    }

    public final void setDescription(String str) {
        TextView textView = (TextView) this.f12094a.e;
        textView.setText(str);
        textView.setVisibility(str != null ? 0 : 8);
    }

    public final void setDescriptionSecondary(String str) {
        TextView textView = (TextView) this.f12094a.i;
        textView.setText(str);
        textView.setVisibility(str != null ? 0 : 8);
    }

    public final void setHeader(String text) {
        j.g(text, "text");
        ((TextView) this.f12094a.j).setText(text);
    }

    public final void setTitleColor(int i) {
        ((TextView) this.f12094a.j).setTextColor(i);
    }

    public final void setValue(String str) {
        TextView textView = (TextView) this.f12094a.f4134k;
        textView.setText(str);
        textView.setVisibility(str != null ? 0 : 8);
    }

    public final void setValueColor(int i) {
        ((TextView) this.f12094a.f4134k).setTextColor(i);
    }
}
