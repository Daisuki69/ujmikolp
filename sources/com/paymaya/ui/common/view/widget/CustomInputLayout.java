package com.paymaya.ui.common.view.widget;

import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.Locale;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomInputLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14464d;
    public final boolean e;
    public final Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14465g;
    public final Integer h;
    public TextView i;
    public AppCompatEditText j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f14466k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        LayoutInflater.from(context).inflate(R.layout.pma_view_text_input_layout_revamp, this);
        int i = R.id.revamp_edit_text;
        AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(this, R.id.revamp_edit_text);
        if (appCompatEditText != null) {
            i = R.id.revamp_edit_text_helper;
            TextView textView = (TextView) ViewBindings.findChildViewById(this, R.id.revamp_edit_text_helper);
            if (textView != null) {
                i = R.id.revamp_edit_text_label;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(this, R.id.revamp_edit_text_label);
                if (textView2 != null) {
                    this.f14465g = R.style.BodySmallStandardGray160;
                    this.i = textView2;
                    this.j = appCompatEditText;
                    this.f14466k = textView;
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6292a);
                    j.d(typedArrayObtainStyledAttributes);
                    TextViewCompat.setTextAppearance(this.i, typedArrayObtainStyledAttributes.getResourceId(17, R.style.Heading04StandardGray200));
                    TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(18);
                    if (typedValuePeekValue != null && b(typedValuePeekValue)) {
                        this.i.setTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(18, R.color.pma_gray_200_shade)));
                    }
                    this.i.setVisibility(typedArrayObtainStyledAttributes.getBoolean(21, true) ? 0 : 8);
                    this.i.setText(typedArrayObtainStyledAttributes.getString(16));
                    this.j.setInputType(typedArrayObtainStyledAttributes.getInt(3, 0));
                    AppCompatEditText appCompatEditText2 = this.j;
                    appCompatEditText2.setImeOptions(typedArrayObtainStyledAttributes.getInt(4, appCompatEditText2.getImeOptions()));
                    this.j.setText(typedArrayObtainStyledAttributes.getString(0));
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, this.j.getPaddingLeft());
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, this.j.getPaddingRight());
                    AppCompatEditText appCompatEditText3 = this.j;
                    appCompatEditText3.setPadding(dimensionPixelSize, appCompatEditText3.getPaddingTop(), dimensionPixelSize2, this.j.getPaddingBottom());
                    this.f = AppCompatResources.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(19, R.drawable.pma_bg_selector_edit_text_line_light));
                    AppCompatResources.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, R.drawable.pma_bg_selector_edit_text_line_light_error));
                    ViewCompat.setBackground(this.j, this.f);
                    TextViewCompat.setTextAppearance(this.j, typedArrayObtainStyledAttributes.getResourceId(12, R.style.BodyXLargeStandardGray160));
                    TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(15);
                    if (typedValuePeekValue2 != null && b(typedValuePeekValue2)) {
                        this.j.setTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(15, R.color.pma_gray_160_shade)));
                    }
                    TypedValue typedValuePeekValue3 = typedArrayObtainStyledAttributes.peekValue(11);
                    if (typedValuePeekValue3 != null && b(typedValuePeekValue3)) {
                        this.j.setHintTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(11, R.color.pma_gray_60_tint)));
                    }
                    this.j.setHint(typedArrayObtainStyledAttributes.getString(1));
                    this.j.setMaxLines(typedArrayObtainStyledAttributes.getInt(2, Integer.MAX_VALUE));
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(8, R.style.BodySmallStandardGray160);
                    this.f14465g = resourceId;
                    TextViewCompat.setTextAppearance(this.f14466k, resourceId);
                    TypedValue typedValuePeekValue4 = typedArrayObtainStyledAttributes.peekValue(10);
                    if (typedValuePeekValue4 != null && b(typedValuePeekValue4)) {
                        int color = ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(10, R.color.pma_gray_160_shade));
                        this.h = Integer.valueOf(color);
                        this.f14466k.setTextColor(color);
                    }
                    typedArrayObtainStyledAttributes.getResourceId(7, R.style.BodySmallStandardWarning100);
                    TypedValue typedValuePeekValue5 = typedArrayObtainStyledAttributes.peekValue(6);
                    if (typedValuePeekValue5 != null && b(typedValuePeekValue5)) {
                        ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(6, R.color.pma_warning_100_base));
                    }
                    this.f14464d = typedArrayObtainStyledAttributes.getString(9);
                    this.e = typedArrayObtainStyledAttributes.getBoolean(20, false);
                    Integer num = this.h;
                    if (num != null) {
                        this.f14466k.setTextColor(num.intValue());
                    }
                    this.f14466k.setText(this.f14464d);
                    this.f14466k.setVisibility(this.e ? 0 : 8);
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    public final boolean b(TypedValue typedValue) {
        if (typedValue.type == 0) {
            return false;
        }
        if (j.b(getResources().getResourceTypeName(typedValue.resourceId), "color")) {
            return true;
        }
        int i = typedValue.type;
        return i >= 28 && i <= 31;
    }

    public final void c() {
        ViewCompat.setBackground(this.j, this.f);
        TextViewCompat.setTextAppearance(this.f14466k, this.f14465g);
        Integer num = this.h;
        if (num != null) {
            this.f14466k.setTextColor(num.intValue());
        }
        this.f14466k.setText(this.f14464d);
        this.f14466k.setVisibility(this.e ? 0 : 8);
    }

    @Override // android.view.View
    public int getBaseline() {
        ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
        j.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return this.j.getPaddingBottom() + this.j.getBaseline() + this.i.getBaseline() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + 2;
    }

    public final TextView getHelperTextView() {
        return this.f14466k;
    }

    public final AppCompatEditText getInputEditText() {
        return this.j;
    }

    public final CharSequence getLabel() {
        return this.i.getText();
    }

    public final TextView getLabelTextView() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setErrorText(String str) {
        c();
    }

    public final void setHelperText(String str) {
        this.f14464d = str;
        c();
    }

    public final void setHelperTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.f14466k = textView;
    }

    public final void setHint(String str) {
        this.j.setHint(str);
    }

    public final void setHintWithEnterPrefix(String str) {
        String lowerCase;
        AppCompatEditText appCompatEditText = this.j;
        Context context = getContext();
        if (str != null) {
            Locale locale = Locale.getDefault();
            j.f(locale, "getDefault(...)");
            lowerCase = str.toLowerCase(locale);
            j.f(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        appCompatEditText.setHint(context.getString(R.string.maya_format_enter_x, lowerCase));
    }

    public final void setHintWithSelectPrefix(String str) {
        String lowerCase;
        AppCompatEditText appCompatEditText = this.j;
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
        this.j = appCompatEditText;
    }

    public final void setLabel(String str) {
        this.i.setText(str);
    }

    public final void setLabelTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.i = textView;
    }
}
