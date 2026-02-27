package com.paymaya.mayaui.cashin.view.widget;

import G5.t;
import J7.a;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCashInAccountLimitSection extends LinearLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f11781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f11782b;
    public final HtmlTextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1033d f11783d;
    public final InterfaceC1033d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaCashInAccountLimitSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_view_account_limit_amount_section, (ViewGroup) null, false);
        int i = R.id.image_view_account_limit_information;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_account_limit_information);
        if (imageView != null) {
            i = R.id.text_view_account_limit_learn_more;
            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_limit_learn_more);
            if (htmlTextView != null) {
                i = R.id.text_view_account_limit_remaining_amount;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_limit_remaining_amount);
                if (textView != null) {
                    this.f11781a = imageView;
                    this.f11782b = textView;
                    this.c = htmlTextView;
                    this.f11783d = C1034e.b(new a(context, 3));
                    this.e = C1034e.b(new a(context, 4));
                    setOrientation(1);
                    addView((ConstraintLayout) viewInflate);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    private final Drawable getDefaultInfoDrawable() {
        return (Drawable) this.f11783d.getValue();
    }

    private final Drawable getErrorInfoDrawable() {
        return (Drawable) this.e.getValue();
    }

    public final void a() {
        TextViewCompat.setTextAppearance(this.f11782b, R.style.JekoBoldSmallText_Primary);
        this.f11781a.setImageDrawable(getDefaultInfoDrawable());
    }

    public final void b() {
        TextViewCompat.setTextAppearance(this.f11782b, R.style.JekoBoldSmallText_Error);
        this.f11781a.setImageDrawable(getErrorInfoDrawable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnLinkClickListener(t onLinkClickListener) {
        j.g(onLinkClickListener, "onLinkClickListener");
        this.c.setOnLinkClickListener(onLinkClickListener);
    }

    public final void setRemainingValue(String str) {
        this.f11782b.setText(getContext().getString(R.string.maya_label_account_limits_remaining_cash_in_format, str));
    }
}
