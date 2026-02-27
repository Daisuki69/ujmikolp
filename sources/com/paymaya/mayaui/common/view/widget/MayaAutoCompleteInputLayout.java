package com.paymaya.mayaui.common.view.widget;

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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import jk.b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaAutoCompleteInputLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f11974K = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Integer f11975B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f11976d;
    public final View e;
    public TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ForcedAutoCompleteTextView f11977g;
    public ImageView h;
    public ImageView i;
    public TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f11978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f11979l;
    public ImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f11980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f11981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11986t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11987u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f11988v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11989w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f11990x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Integer f11991y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaAutoCompleteInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 3;
        j.g(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.maya_view_auto_complete_input_layout, this);
        int i4 = R.id.contact_auto_complete_text_view;
        ForcedAutoCompleteTextView forcedAutoCompleteTextView = (ForcedAutoCompleteTextView) ViewBindings.findChildViewById(this, R.id.contact_auto_complete_text_view);
        if (forcedAutoCompleteTextView != null) {
            i4 = R.id.contact_container_input_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(this, R.id.contact_container_input_layout);
            if (constraintLayout != null) {
                i4 = R.id.dropdown_anchor_view;
                View viewFindChildViewById = ViewBindings.findChildViewById(this, R.id.dropdown_anchor_view);
                if (viewFindChildViewById != null) {
                    i4 = R.id.helper_error_icon_image_view;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(this, R.id.helper_error_icon_image_view);
                    if (imageView != null) {
                        i4 = R.id.helper_error_spiel_text_view;
                        TextView textView = (TextView) ViewBindings.findChildViewById(this, R.id.helper_error_spiel_text_view);
                        if (textView != null) {
                            i4 = R.id.helper_info_icon_image_view;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(this, R.id.helper_info_icon_image_view);
                            if (imageView2 != null) {
                                i4 = R.id.helper_info_spiel_text_view;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(this, R.id.helper_info_spiel_text_view);
                                if (textView2 != null) {
                                    i4 = R.id.label_text_view;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(this, R.id.label_text_view);
                                    if (textView3 != null) {
                                        i4 = R.id.primary_icon;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(this, R.id.primary_icon);
                                        if (imageView3 != null) {
                                            i4 = R.id.secondary_icon;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(this, R.id.secondary_icon);
                                            if (imageView4 != null) {
                                                this.f11976d = constraintLayout;
                                                this.e = viewFindChildViewById;
                                                this.f = textView3;
                                                this.f11977g = forcedAutoCompleteTextView;
                                                this.h = imageView3;
                                                this.i = imageView4;
                                                this.j = textView2;
                                                this.f11978k = imageView2;
                                                this.f11979l = textView;
                                                this.m = imageView;
                                                this.f11982p = true;
                                                this.f11987u = R.style.JekoSemiBoldSmallText_LinksAccent;
                                                this.f11988v = R.style.JekoSemiBoldSmallText_Error;
                                                this.f11989w = R.style.JekoSemiBoldSmallText_Secondary;
                                                this.f11990x = R.style.JekoSemiBoldSmallText_Error;
                                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6297l, 0, 0);
                                                this.f11983q = typedArrayObtainStyledAttributes.getBoolean(34, false);
                                                this.f11984r = typedArrayObtainStyledAttributes.getBoolean(33, false);
                                                setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
                                                this.f11980n = AppCompatResources.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(28, R.drawable.maya_bg_selector_input_layout_default));
                                                Drawable drawable = AppCompatResources.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.maya_bg_selector_input_layout_error));
                                                this.f11981o = drawable;
                                                constraintLayout.setBackground(this.f11984r ? drawable : this.f11980n);
                                                constraintLayout.setOnClickListener(new o(this, i));
                                                this.f11987u = typedArrayObtainStyledAttributes.getResourceId(25, R.style.JekoSemiBoldSmallText_LinksAccent);
                                                this.f11988v = typedArrayObtainStyledAttributes.getResourceId(26, R.style.JekoSemiBoldSmallText_Error);
                                                TextViewCompat.setTextAppearance(this.f, this.f11987u);
                                                TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(27);
                                                if (typedValuePeekValue != null && b(typedValuePeekValue)) {
                                                    this.f.setTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(27, R.color.maya_primary_grown_green)));
                                                }
                                                boolean z4 = typedArrayObtainStyledAttributes.getBoolean(35, true);
                                                this.f11982p = z4;
                                                this.f.setVisibility(z4 ? 0 : 8);
                                                this.f.setText(typedArrayObtainStyledAttributes.getString(24));
                                                TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
                                                if (typedValuePeekValue2 != null) {
                                                    this.f11977g.setInputType(typedValuePeekValue2.data);
                                                }
                                                ForcedAutoCompleteTextView forcedAutoCompleteTextView2 = this.f11977g;
                                                forcedAutoCompleteTextView2.setImeOptions(typedArrayObtainStyledAttributes.getInt(6, forcedAutoCompleteTextView2.getImeOptions()));
                                                TypedValue typedValuePeekValue3 = typedArrayObtainStyledAttributes.peekValue(4);
                                                if (typedValuePeekValue3 != null) {
                                                    this.f11977g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(typedValuePeekValue3.data)});
                                                }
                                                this.f11977g.setText(typedArrayObtainStyledAttributes.getString(1));
                                                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(21, this.f11977g.getPaddingLeft());
                                                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, this.f11977g.getPaddingRight());
                                                ForcedAutoCompleteTextView forcedAutoCompleteTextView3 = this.f11977g;
                                                forcedAutoCompleteTextView3.setPadding(dimensionPixelSize, forcedAutoCompleteTextView3.getPaddingTop(), dimensionPixelSize2, this.f11977g.getPaddingBottom());
                                                TextViewCompat.setTextAppearance(this.f11977g, typedArrayObtainStyledAttributes.getResourceId(19, R.style.JekoSemiBoldTextBody_Primary));
                                                TypedValue typedValuePeekValue4 = typedArrayObtainStyledAttributes.peekValue(23);
                                                if (typedValuePeekValue4 != null && b(typedValuePeekValue4)) {
                                                    this.f11977g.setTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(23, R.color.maya_primary_black)));
                                                }
                                                TypedValue typedValuePeekValue5 = typedArrayObtainStyledAttributes.peekValue(18);
                                                if (typedValuePeekValue5 != null && b(typedValuePeekValue5)) {
                                                    this.f11977g.setHintTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(18, R.color.maya_shades_of_grey_4)));
                                                }
                                                this.f11977g.setHint(typedArrayObtainStyledAttributes.getString(2));
                                                this.f11977g.setMaxLines(typedArrayObtainStyledAttributes.getInt(3, Integer.MAX_VALUE));
                                                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(29);
                                                if (drawable2 != null) {
                                                    this.h.setImageDrawable(drawable2);
                                                }
                                                Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(30);
                                                if (drawable3 != null) {
                                                    this.i.setImageDrawable(drawable3);
                                                }
                                                this.f11985s = typedArrayObtainStyledAttributes.getBoolean(36, this.h.getDrawable() != null);
                                                this.f11986t = typedArrayObtainStyledAttributes.getBoolean(37, this.i.getDrawable() != null);
                                                this.h.setVisibility(this.f11985s ? 0 : 8);
                                                this.i.setVisibility(this.f11986t ? 0 : 8);
                                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, R.style.BodySmallStandardGray160);
                                                this.f11989w = resourceId;
                                                TextViewCompat.setTextAppearance(this.j, resourceId);
                                                TypedValue typedValuePeekValue6 = typedArrayObtainStyledAttributes.peekValue(17);
                                                if (typedValuePeekValue6 != null && b(typedValuePeekValue6)) {
                                                    this.f11991y = Integer.valueOf(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(17, R.color.maya_shades_of_grey_4)));
                                                }
                                                this.j.setText(typedArrayObtainStyledAttributes.getString(16));
                                                Integer num = this.f11991y;
                                                if (num != null) {
                                                    this.j.setTextColor(num.intValue());
                                                }
                                                this.f11978k.setImageDrawable(null);
                                                this.j.setVisibility(this.f11983q ? 0 : 8);
                                                this.f11978k.setVisibility(this.f11983q ? 0 : 8);
                                                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(10, R.style.BodySmallStandardWarning100);
                                                this.f11990x = resourceId2;
                                                TextViewCompat.setTextAppearance(this.f11979l, resourceId2);
                                                TypedValue typedValuePeekValue7 = typedArrayObtainStyledAttributes.peekValue(13);
                                                if (typedValuePeekValue7 != null && b(typedValuePeekValue7)) {
                                                    this.f11975B = Integer.valueOf(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(13, R.color.maya_system_error)));
                                                }
                                                this.f11979l.setText(typedArrayObtainStyledAttributes.getString(12));
                                                Integer num2 = this.f11975B;
                                                if (num2 != null) {
                                                    this.f11979l.setTextColor(num2.intValue());
                                                }
                                                this.m.setImageDrawable(null);
                                                this.f11979l.setVisibility(this.f11984r ? 0 : 8);
                                                this.m.setVisibility(this.f11984r ? 0 : 8);
                                                typedArrayObtainStyledAttributes.recycle();
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
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i4)));
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
        if (this.f11983q) {
            TextViewCompat.setTextAppearance(this.j, this.f11989w);
            Integer num = this.f11991y;
            if (num != null) {
                this.j.setTextColor(num.intValue());
            }
            TextView textView = this.j;
            CharSequence text = textView.getText();
            String string = text != null ? text.toString() : null;
            textView.setVisibility((string == null || string.length() == 0) ? 8 : 0);
            ImageView imageView = this.f11978k;
            imageView.setVisibility(imageView.getDrawable() != null ? 0 : 8);
        } else {
            this.j.setVisibility(8);
            this.f11978k.setVisibility(8);
        }
        boolean z4 = this.f11984r;
        ConstraintLayout constraintLayout = this.f11976d;
        if (z4) {
            constraintLayout.setBackground(this.f11981o);
            TextViewCompat.setTextAppearance(this.f, this.f11988v);
            TextViewCompat.setTextAppearance(this.f11979l, this.f11990x);
            Integer num2 = this.f11975B;
            if (num2 != null) {
                this.f11979l.setTextColor(num2.intValue());
            }
            TextView textView2 = this.f11979l;
            CharSequence text2 = textView2.getText();
            String string2 = text2 != null ? text2.toString() : null;
            textView2.setVisibility((string2 == null || string2.length() == 0) ? 8 : 0);
            ImageView imageView2 = this.m;
            imageView2.setVisibility(imageView2.getDrawable() != null ? 0 : 8);
        } else {
            constraintLayout.setBackground(this.f11980n);
            TextViewCompat.setTextAppearance(this.f, this.f11987u);
            this.f11979l.setVisibility(8);
            this.m.setVisibility(8);
        }
        this.h.setVisibility(this.f11985s ? 0 : 8);
        this.i.setVisibility(this.f11986t ? 0 : 8);
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

    @Override // android.view.View
    public int getBaseline() {
        ViewGroup.LayoutParams layoutParams = this.f11977g.getLayoutParams();
        j.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return this.f11977g.getPaddingBottom() + this.f11977g.getBaseline() + this.f.getBaseline() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + 2;
    }

    public final View getDropdownAnchorView() {
        return this.e;
    }

    public final ConstraintLayout getFormContainerLayout() {
        return this.f11976d;
    }

    public final ImageView getHelperErrorIconImageView() {
        return this.m;
    }

    public final TextView getHelperErrorSpielTextView() {
        return this.f11979l;
    }

    public final ImageView getHelperInfoIconImageView() {
        return this.f11978k;
    }

    public final TextView getHelperInfoSpielTextView() {
        return this.j;
    }

    public final ForcedAutoCompleteTextView getInputAutoCompleteEditText() {
        return this.f11977g;
    }

    public final TextView getLabelTextView() {
        return this.f;
    }

    public final ImageView getPrimaryIconImageView() {
        return this.h;
    }

    public final ImageView getSecondaryIconImageView() {
        return this.i;
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
            this.f11982p = bundle.getBoolean("state_should_show_label", false);
            this.f11983q = bundle.getBoolean("state_should_show_helper_info", false);
            this.f11984r = bundle.getBoolean("state_should_show_error", false);
            this.f11985s = bundle.getBoolean("state_should_show_primary_icon", false);
            this.f11986t = bundle.getBoolean("state_should_show_secondary_icon", false);
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
        bundle.putBoolean("state_should_show_label", this.f11982p);
        bundle.putBoolean("state_should_show_helper_info", this.f11983q);
        bundle.putBoolean("state_should_show_error", this.f11984r);
        bundle.putBoolean("state_should_show_primary_icon", this.f11985s);
        bundle.putBoolean("state_should_show_secondary_icon", this.f11986t);
        bundle.putSparseParcelableArray("state_child_views", b.u(this));
        return bundle;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        this.f.setEnabled(z4);
        this.f11977g.setEnabled(z4);
        this.h.setEnabled(z4);
        this.i.setEnabled(z4);
        this.f11978k.setEnabled(z4);
        this.j.setEnabled(z4);
        this.m.setEnabled(z4);
        this.f11979l.setEnabled(z4);
    }

    public final void setHelperErrorIconImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.m = imageView;
    }

    public final void setHelperErrorSpielTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.f11979l = textView;
    }

    public final void setHelperErrorText(String str) {
        this.f11979l.setText(str);
    }

    public final void setHelperInfoIconImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.f11978k = imageView;
    }

    public final void setHelperInfoSpielTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.j = textView;
    }

    public final void setHint(String str) {
        this.f11977g.setHint(str);
    }

    public final void setInputAutoCompleteEditText(ForcedAutoCompleteTextView forcedAutoCompleteTextView) {
        j.g(forcedAutoCompleteTextView, "<set-?>");
        this.f11977g = forcedAutoCompleteTextView;
    }

    public final void setLabel(String str) {
        this.f.setText(str);
    }

    public final void setLabelTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.f = textView;
    }

    public final void setPrimaryIconImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.h = imageView;
    }

    public final void setSecondaryIconImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.i = imageView;
    }
}
