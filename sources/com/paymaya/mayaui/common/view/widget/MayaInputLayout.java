package com.paymaya.mayaui.common.view.widget;

import N5.M0;
import W4.c;
import Y6.o;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.Locale;
import jk.b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaInputLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f12049a0 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f12050B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f12051K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f12052P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f12053Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f12054R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f12055S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f12056T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f12057U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Integer f12058V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Integer f12059W;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f12060d;
    public TextView e;
    public AppCompatEditText f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f12061g;
    public ImageView h;
    public TextView i;
    public ImageView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f12062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f12063l;
    public AppCompatEditText m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f12064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f12065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f12066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f12067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f12068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f12069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f12070t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12071u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12072v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12075y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.g(context, "context");
        M0 m0A = M0.a(LayoutInflater.from(getContext()), this);
        this.f12060d = m0A.f3767b;
        this.e = (TextView) m0A.f3770k;
        this.f = (AppCompatEditText) m0A.j;
        this.f12061g = (TextView) m0A.i;
        this.h = (ImageView) m0A.c;
        this.i = (TextView) m0A.h;
        this.j = (ImageView) m0A.f3769g;
        this.f12062k = (ImageView) m0A.f3771l;
        this.f12063l = (ImageView) m0A.m;
        this.m = (AppCompatEditText) m0A.f;
        this.f12064n = (TextView) m0A.f3772n;
        this.f12065o = (ImageView) m0A.e;
        this.f12071u = true;
        this.f12054R = R.style.JekoSemiBoldSmallText_LinksAccent;
        this.f12055S = R.style.JekoSemiBoldSmallText_Error;
        this.f12056T = R.style.JekoSemiBoldSmallText_Secondary;
        this.f12057U = R.style.JekoSemiBoldSmallText_Error;
        j(context, attributeSet, 0);
    }

    private final void setDisabledState(boolean z4) {
        setEnabled(!z4);
        if (z4) {
            m(true);
        } else {
            m(false);
        }
    }

    public final void b() {
        setDisabledState(true);
    }

    public final void c() {
        this.f.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f, 1);
        }
    }

    public final void d() {
        this.f.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f.getWindowToken(), 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray container) {
        j.g(container, "container");
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray container) {
        j.g(container, "container");
        dispatchFreezeSelfOnly(container);
    }

    public final void e() {
        setDisabledState(false);
    }

    public final void f() {
        this.f12073w = false;
        l();
    }

    public final void g() {
        this.f12072v = false;
        l();
    }

    @Override // android.view.View
    public int getBaseline() {
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        j.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return this.f.getPaddingBottom() + this.f.getBaseline() + this.e.getBaseline() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + 2;
    }

    public final ImageView getCloseIconImageView() {
        return this.f12065o;
    }

    public final AppCompatEditText getFloatingPrefix() {
        return this.m;
    }

    public final ConstraintLayout getFormContainerLayout() {
        return this.f12060d;
    }

    public final ImageView getHelperErrorIconImageView() {
        return this.j;
    }

    public final TextView getHelperErrorSpielTextView() {
        return this.i;
    }

    public final ImageView getHelperInfoIconImageView() {
        return this.h;
    }

    public final TextView getHelperInfoSpielTextView() {
        return this.f12061g;
    }

    public final AppCompatEditText getInputEditText() {
        return this.f;
    }

    public final CharSequence getLabel() {
        return this.e.getText();
    }

    public final TextView getLabelTextView() {
        return this.e;
    }

    public final ImageView getPrimaryIconImageView() {
        return this.f12062k;
    }

    public final ImageView getSecondaryIconImageView() {
        return this.f12063l;
    }

    public final boolean getShouldShowError() {
        return this.f12073w;
    }

    public final boolean getShouldShowPrimaryIcon() {
        return this.f12074x;
    }

    public final TextView getSubLabelTextView() {
        return this.f12064n;
    }

    public final void h() {
        this.f12074x = false;
        l();
    }

    public final void i() {
        this.f12075y = false;
        l();
    }

    public final void j(Context context, AttributeSet attributeSet, int i) {
        int i4 = 6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6297l, 0, i);
        this.f12072v = typedArrayObtainStyledAttributes.getBoolean(34, false);
        this.f12073w = typedArrayObtainStyledAttributes.getBoolean(33, false);
        this.f12053Q = typedArrayObtainStyledAttributes.getBoolean(31, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        this.f12066p = AppCompatResources.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(28, R.drawable.maya_bg_selector_input_layout_default));
        this.f12068r = AppCompatResources.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.maya_bg_selector_input_layout_error));
        Drawable drawable = AppCompatResources.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.maya_bg_selector_input_layout_disabled));
        this.f12067q = drawable;
        if (this.f12073w) {
            drawable = this.f12068r;
        } else if (!this.f12052P) {
            drawable = this.f12066p;
        }
        ConstraintLayout constraintLayout = this.f12060d;
        constraintLayout.setBackground(drawable);
        constraintLayout.setOnClickListener(new o(this, i4));
        this.f12054R = typedArrayObtainStyledAttributes.getResourceId(25, R.style.JekoSemiBoldSmallText_LinksAccent);
        this.f12055S = typedArrayObtainStyledAttributes.getResourceId(26, R.style.JekoSemiBoldSmallText_Error);
        TextViewCompat.setTextAppearance(this.e, this.f12054R);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(27);
        if (typedValuePeekValue != null && k(typedValuePeekValue)) {
            this.e.setTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(27, R.color.maya_primary_grown_green)));
        }
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(35, true);
        this.f12071u = z4;
        this.e.setVisibility(z4 ? 0 : 8);
        this.e.setText(typedArrayObtainStyledAttributes.getString(24));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 != null) {
            this.f.setInputType(typedValuePeekValue2.data);
        }
        AppCompatEditText appCompatEditText = this.f;
        appCompatEditText.setImeOptions(typedArrayObtainStyledAttributes.getInt(6, appCompatEditText.getImeOptions()));
        TypedValue typedValuePeekValue3 = typedArrayObtainStyledAttributes.peekValue(4);
        if (typedValuePeekValue3 != null) {
            this.f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(typedValuePeekValue3.data)});
        }
        this.f.setText(typedArrayObtainStyledAttributes.getString(1));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(21, this.f.getPaddingLeft());
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, this.f.getPaddingRight());
        AppCompatEditText appCompatEditText2 = this.f;
        appCompatEditText2.setPadding(dimensionPixelSize, appCompatEditText2.getPaddingTop(), dimensionPixelSize2, this.f.getPaddingBottom());
        TextViewCompat.setTextAppearance(this.f, typedArrayObtainStyledAttributes.getResourceId(19, R.style.JekoSemiBoldTextBody_Primary));
        TypedValue typedValuePeekValue4 = typedArrayObtainStyledAttributes.peekValue(23);
        if (typedValuePeekValue4 != null && k(typedValuePeekValue4)) {
            this.f.setTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(23, R.color.maya_primary_black)));
        }
        TypedValue typedValuePeekValue5 = typedArrayObtainStyledAttributes.peekValue(18);
        if (typedValuePeekValue5 != null && k(typedValuePeekValue5)) {
            this.f.setHintTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(18, R.color.maya_shades_of_grey_4)));
        }
        this.f.setHint(typedArrayObtainStyledAttributes.getString(2));
        this.f.setMaxLines(typedArrayObtainStyledAttributes.getInt(3, Integer.MAX_VALUE));
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(29);
        if (drawable2 != null) {
            this.f12062k.setImageDrawable(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(30);
        if (drawable3 != null) {
            this.f12063l.setImageDrawable(drawable3);
        }
        Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(7);
        if (drawable4 != null) {
            this.f12065o.setImageDrawable(drawable4);
        }
        this.f12074x = typedArrayObtainStyledAttributes.getBoolean(36, this.f12062k.getDrawable() != null);
        this.f12075y = typedArrayObtainStyledAttributes.getBoolean(37, this.f12063l.getDrawable() != null);
        this.f12053Q = typedArrayObtainStyledAttributes.getBoolean(31, this.f12065o.getDrawable() != null);
        this.f12062k.setVisibility(this.f12074x ? 0 : 8);
        this.f12063l.setVisibility(this.f12075y ? 0 : 8);
        this.f12065o.setVisibility(this.f12053Q ? 0 : 8);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, R.style.BodySmallStandardGray160);
        this.f12056T = resourceId;
        TextViewCompat.setTextAppearance(this.f12061g, resourceId);
        TypedValue typedValuePeekValue6 = typedArrayObtainStyledAttributes.peekValue(17);
        if (typedValuePeekValue6 != null && k(typedValuePeekValue6)) {
            this.f12058V = Integer.valueOf(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(17, R.color.maya_shades_of_grey_4)));
        }
        Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(15);
        if (drawable5 != null) {
            this.f12069s = drawable5;
        }
        this.f12061g.setText(typedArrayObtainStyledAttributes.getString(16));
        Integer num = this.f12058V;
        if (num != null) {
            this.f12061g.setTextColor(num.intValue());
        }
        this.h.setImageDrawable(this.f12069s);
        this.f12061g.setVisibility(this.f12072v ? 0 : 8);
        this.h.setVisibility((this.f12072v && this.f12050B) ? 0 : 8);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(10, R.style.BodySmallStandardWarning100);
        this.f12057U = resourceId2;
        TextViewCompat.setTextAppearance(this.i, resourceId2);
        TypedValue typedValuePeekValue7 = typedArrayObtainStyledAttributes.peekValue(13);
        if (typedValuePeekValue7 != null && k(typedValuePeekValue7)) {
            this.f12059W = Integer.valueOf(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(13, R.color.maya_system_error)));
        }
        Drawable drawable6 = typedArrayObtainStyledAttributes.getDrawable(11);
        if (drawable6 != null) {
            this.f12070t = drawable6;
        }
        this.i.setText(typedArrayObtainStyledAttributes.getString(12));
        Integer num2 = this.f12059W;
        if (num2 != null) {
            this.i.setTextColor(num2.intValue());
        }
        this.j.setImageDrawable(this.f12070t);
        this.i.setVisibility(this.f12073w ? 0 : 8);
        this.j.setVisibility((this.f12073w && this.f12051K) ? 0 : 8);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean k(TypedValue typedValue) {
        if (typedValue.type == 0) {
            return false;
        }
        if (j.b(getResources().getResourceTypeName(typedValue.resourceId), "color")) {
            return true;
        }
        int i = typedValue.type;
        return i >= 28 && i <= 31;
    }

    public void l() {
        if (this.f12072v) {
            TextViewCompat.setTextAppearance(this.f12061g, this.f12056T);
            Integer num = this.f12058V;
            if (num != null) {
                this.f12061g.setTextColor(num.intValue());
            }
            TextView textView = this.f12061g;
            CharSequence text = textView.getText();
            String string = text != null ? text.toString() : null;
            textView.setVisibility((string == null || string.length() == 0) ? 8 : 0);
            ImageView imageView = this.h;
            imageView.setVisibility((!this.f12050B || imageView.getDrawable() == null) ? 8 : 0);
        } else {
            this.f12061g.setVisibility(8);
            this.h.setVisibility(8);
        }
        boolean z4 = this.f12073w;
        ConstraintLayout constraintLayout = this.f12060d;
        if (z4) {
            constraintLayout.setBackground(this.f12068r);
            TextViewCompat.setTextAppearance(this.e, this.f12055S);
            TextViewCompat.setTextAppearance(this.i, this.f12057U);
            Integer num2 = this.f12059W;
            if (num2 != null) {
                this.i.setTextColor(num2.intValue());
            }
            TextView textView2 = this.i;
            CharSequence text2 = textView2.getText();
            String string2 = text2 != null ? text2.toString() : null;
            textView2.setVisibility((string2 == null || string2.length() == 0) ? 8 : 0);
            ImageView imageView2 = this.j;
            imageView2.setVisibility((!this.f12051K || imageView2.getDrawable() == null) ? 8 : 0);
        } else {
            constraintLayout.setBackground(this.f12066p);
            TextViewCompat.setTextAppearance(this.e, this.f12054R);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
        }
        this.f12062k.setVisibility(this.f12074x ? 0 : 8);
        this.f12063l.setVisibility(this.f12075y ? 0 : 8);
        if (!this.f12052P) {
            this.f12065o.setVisibility(this.f12053Q ? 0 : 8);
            return;
        }
        constraintLayout.setBackground(this.f12067q);
        this.e.setAlpha(0.5f);
        this.f12064n.setAlpha(0.5f);
        this.f.setAlpha(0.5f);
        if (this.f12062k.getVisibility() == 0) {
            this.f12062k.setAlpha(0.5f);
        }
    }

    public final void m(boolean z4) {
        if (this.f12074x) {
            this.f12062k.setColorFilter(ContextCompat.getColor(getContext(), z4 ? R.color.maya_shades_of_grey_4 : R.color.maya_primary_black));
        }
        if (z4) {
            this.e.setTextColor(ContextCompat.getColor(getContext(), R.color.maya_shades_of_grey_4));
        } else {
            l();
        }
    }

    public final void n(boolean z4, boolean z5) {
        if (z4) {
            Context context = getContext();
            j.f(context, "getContext(...)");
            t(context, 2131231351);
            AppCompatEditText appCompatEditText = this.f;
            if (!z5) {
                appCompatEditText.setText("");
            }
            appCompatEditText.setFocusable(false);
            appCompatEditText.setFocusableInTouchMode(false);
            appCompatEditText.setClickable(true);
            appCompatEditText.setLongClickable(false);
        } else {
            h();
            AppCompatEditText appCompatEditText2 = this.f;
            if (!z5) {
                appCompatEditText2.setText("");
            }
            appCompatEditText2.setFocusable(true);
            appCompatEditText2.setFocusableInTouchMode(true);
            appCompatEditText2.setClickable(true);
            appCompatEditText2.setLongClickable(true);
        }
        m(false);
    }

    public final void o(String str, boolean z4) {
        if (z4) {
            if (str != null) {
                Locale locale = Locale.getDefault();
                j.f(locale, "getDefault(...)");
                str = str.toLowerCase(locale);
                j.f(str, "toLowerCase(...)");
            } else {
                str = null;
            }
        }
        this.f.setHint(getContext().getString(R.string.maya_format_enter_x, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("state_child_views");
            this.f12071u = bundle.getBoolean("state_should_show_label", false);
            this.f12072v = bundle.getBoolean("state_should_show_helper_info", false);
            this.f12073w = bundle.getBoolean("state_should_show_error", false);
            this.f12074x = bundle.getBoolean("state_should_show_primary_icon", false);
            this.f12075y = bundle.getBoolean("state_should_show_secondary_icon", false);
            this.f12050B = bundle.getBoolean("state_should_show_helper_info_icon", false);
            this.f12051K = bundle.getBoolean("state_should_show_error_icon", false);
            this.f12053Q = bundle.getBoolean("state_should_show_close_icon", false);
            if (sparseParcelableArray != null) {
                b.t(this, sparseParcelableArray);
            }
            parcelable = bundle.getParcelable("state_super_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_super_state", super.onSaveInstanceState());
        bundle.putBoolean("state_should_show_label", this.f12071u);
        bundle.putBoolean("state_should_show_helper_info", this.f12072v);
        bundle.putBoolean("state_should_show_error", this.f12073w);
        bundle.putBoolean("state_should_show_primary_icon", this.f12074x);
        bundle.putBoolean("state_should_show_secondary_icon", this.f12075y);
        bundle.putBoolean("state_should_show_helper_info_icon", this.f12050B);
        bundle.putBoolean("state_should_show_error_icon", this.f12051K);
        bundle.putBoolean("state_should_show_close_icon", this.f12053Q);
        bundle.putSparseParcelableArray("state_child_views", b.u(this));
        return bundle;
    }

    public final void p() {
        this.f12073w = true;
        l();
    }

    public final void q() {
        this.f12072v = true;
        l();
    }

    public final void r() {
        this.f12074x = true;
        l();
    }

    public final void s() {
        this.f12075y = true;
        l();
    }

    public final void setBackgroundNormal(@DrawableRes int i) {
        Drawable drawable = AppCompatResources.getDrawable(getContext(), i);
        this.f12066p = drawable;
        if (this.f12073w) {
            return;
        }
        this.f12060d.setBackground(drawable);
    }

    public final void setCloseIconImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.f12065o = imageView;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        this.e.setEnabled(z4);
        this.f.setEnabled(z4);
        this.f12062k.setEnabled(z4);
        this.f12063l.setEnabled(z4);
        this.f12063l.setEnabled(z4);
        this.h.setEnabled(z4);
        this.f12061g.setEnabled(z4);
        this.j.setEnabled(z4);
        this.i.setEnabled(z4);
    }

    public final void setFloatingPrefix(AppCompatEditText appCompatEditText) {
        j.g(appCompatEditText, "<set-?>");
        this.m = appCompatEditText;
    }

    public final void setHelperErrorIconImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.j = imageView;
    }

    public final void setHelperErrorSpielTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.i = textView;
    }

    public final void setHelperErrorText(String str) {
        this.i.setText(str);
    }

    public final void setHelperInfoIconImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.h = imageView;
    }

    public final void setHelperInfoSpielTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.f12061g = textView;
    }

    public final void setHelperInfoText(String str) {
        this.f12061g.setText(str);
    }

    public final void setHint(String str) {
        this.f.setHint(str);
    }

    public final void setHintWithEnterAPrefix(String str) {
        String lowerCase;
        AppCompatEditText appCompatEditText = this.f;
        Context context = getContext();
        if (str != null) {
            Locale locale = Locale.getDefault();
            j.f(locale, "getDefault(...)");
            lowerCase = str.toLowerCase(locale);
            j.f(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        appCompatEditText.setHint(context.getString(R.string.maya_format_enter_a, lowerCase));
    }

    public final void setHintWithSelectPrefix(String str) {
        String lowerCase;
        AppCompatEditText appCompatEditText = this.f;
        Context context = getContext();
        if (str != null) {
            Locale locale = Locale.getDefault();
            j.f(locale, "getDefault(...)");
            lowerCase = str.toLowerCase(locale);
            j.f(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        appCompatEditText.setHint(context.getString(R.string.maya_format_select_x, lowerCase));
    }

    public final void setInputEditText(AppCompatEditText appCompatEditText) {
        j.g(appCompatEditText, "<set-?>");
        this.f = appCompatEditText;
    }

    public final void setLabel(String str) {
        this.e.setText(str);
    }

    public final void setLabelTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.e = textView;
    }

    public final void setOnDisabledClickListener(View.OnClickListener listener) {
        j.g(listener, "listener");
        setEnabled(false);
        this.f.setEnabled(true);
        this.f.setFocusable(false);
        this.f.setFocusableInTouchMode(false);
        this.f.setCursorVisible(false);
        this.f.setOnClickListener(listener);
        this.f12060d.setOnClickListener(listener);
    }

    public final void setPrimaryIconImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.f12062k = imageView;
    }

    public final void setSecondaryIconImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.f12063l = imageView;
    }

    public final void setShouldShowError(boolean z4) {
        this.f12073w = z4;
    }

    public final void setSingleLine(boolean z4) {
        this.f.setSingleLine(z4);
    }

    public final void setStyleDisabledState(boolean z4) {
        ConstraintLayout constraintLayout = this.f12060d;
        if (z4) {
            this.f12052P = true;
            setEnabled(false);
            constraintLayout.setEnabled(false);
            constraintLayout.setClickable(false);
            this.f.setEnabled(false);
            this.f.setClickable(false);
            l();
            return;
        }
        this.f12052P = false;
        setEnabled(true);
        constraintLayout.setEnabled(true);
        constraintLayout.setClickable(true);
        this.f.setEnabled(true);
        this.f.setClickable(true);
        this.e.setAlpha(1.0f);
        this.f12064n.setAlpha(1.0f);
        this.f.setAlpha(1.0f);
        this.f12062k.setAlpha(1.0f);
        this.f12065o.setAlpha(1.0f);
        l();
    }

    public final void setSubLabelTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.f12064n = textView;
    }

    public final void t(Context context, int i) {
        this.f12062k.setImageDrawable(ContextCompat.getDrawable(context, i));
        this.f12074x = true;
        l();
    }

    public MayaInputLayout(Context context) {
        super(context, null, 0, R.style.MayaInputLayoutDefault);
        M0 m0A = M0.a(LayoutInflater.from(getContext()), this);
        this.f12060d = m0A.f3767b;
        this.e = (TextView) m0A.f3770k;
        this.f = (AppCompatEditText) m0A.j;
        this.f12061g = (TextView) m0A.i;
        this.h = (ImageView) m0A.c;
        this.i = (TextView) m0A.h;
        this.j = (ImageView) m0A.f3769g;
        this.f12062k = (ImageView) m0A.f3771l;
        this.f12063l = (ImageView) m0A.m;
        this.m = (AppCompatEditText) m0A.f;
        this.f12064n = (TextView) m0A.f3772n;
        this.f12065o = (ImageView) m0A.e;
        this.f12071u = true;
        this.f12054R = R.style.JekoSemiBoldSmallText_LinksAccent;
        this.f12055S = R.style.JekoSemiBoldSmallText_Error;
        this.f12056T = R.style.JekoSemiBoldSmallText_Secondary;
        this.f12057U = R.style.JekoSemiBoldSmallText_Error;
        j(context, null, R.style.MayaInputLayoutDefault);
    }
}
