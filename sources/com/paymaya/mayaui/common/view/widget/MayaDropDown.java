package com.paymaya.mayaui.common.view.widget;

import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import jk.b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaDropDown extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12040d;
    public Pair e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f12041g;
    public final ImageView h;
    public final ConstraintLayout i;
    public final TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Function1 f12043l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f12044n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaDropDown(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.g(context, "context");
        this.e = new Pair(Boolean.TRUE, "");
        LayoutInflater.from(getContext()).inflate(R.layout.maya_view_drop_down_layout, this);
        int i = R.id.display_select_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(this, R.id.display_select_text);
        if (appCompatTextView != null) {
            i = R.id.error_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(this, R.id.error_text_view);
            if (textView != null) {
                i = R.id.form_constraint_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(this, R.id.form_constraint_layout);
                if (constraintLayout != null) {
                    i = R.id.label_text_view;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(this, R.id.label_text_view);
                    if (textView2 != null) {
                        i = R.id.primary_icon_image_view;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(this, R.id.primary_icon_image_view);
                        if (imageView != null) {
                            this.f = textView2;
                            this.f12041g = appCompatTextView;
                            this.h = imageView;
                            this.i = constraintLayout;
                            this.j = textView;
                            this.m = R.style.JekoSemiBoldSmallText_Error;
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.i, 0, 0);
                            setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
                            this.f12042k = typedArrayObtainStyledAttributes.getBoolean(33, false);
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(7, R.style.BodySmallStandardWarning100);
                            this.m = resourceId;
                            TextViewCompat.setTextAppearance(textView, resourceId);
                            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
                            if (typedValuePeekValue != null && c(typedValuePeekValue)) {
                                this.f12044n = Integer.valueOf(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(9, R.color.maya_system_error)));
                            }
                            textView.setText(typedArrayObtainStyledAttributes.getString(8));
                            Integer num = this.f12044n;
                            if (num != null) {
                                textView.setTextColor(num.intValue());
                            }
                            textView.setVisibility(this.f12042k ? 0 : 8);
                            TextViewCompat.setTextAppearance(textView2, typedArrayObtainStyledAttributes.getResourceId(14, R.style.JekoBoldLink));
                            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(16);
                            if (typedValuePeekValue2 != null && c(typedValuePeekValue2)) {
                                textView2.setTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(16, R.color.maya_shades_of_grey_5)));
                            }
                            textView2.setText(typedArrayObtainStyledAttributes.getString(13));
                            appCompatTextView.setText(typedArrayObtainStyledAttributes.getString(1));
                            TextViewCompat.setTextAppearance(appCompatTextView, typedArrayObtainStyledAttributes.getResourceId(11, R.style.CerebriBookH5));
                            TypedValue typedValuePeekValue3 = typedArrayObtainStyledAttributes.peekValue(12);
                            if (typedValuePeekValue3 != null && c(typedValuePeekValue3)) {
                                appCompatTextView.setTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(12, R.color.maya_primary_black)));
                            }
                            TypedValue typedValuePeekValue4 = typedArrayObtainStyledAttributes.peekValue(10);
                            if (typedValuePeekValue4 != null && c(typedValuePeekValue4)) {
                                appCompatTextView.setHintTextColor(ContextCompat.getColor(getContext(), typedArrayObtainStyledAttributes.getResourceId(10, R.color.maya_shades_of_grey_4)));
                            }
                            appCompatTextView.setHint(typedArrayObtainStyledAttributes.getString(2));
                            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(17);
                            if (drawable != null) {
                                imageView.setImageDrawable(drawable);
                            }
                            typedArrayObtainStyledAttributes.recycle();
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    public final void b() {
        this.f12042k = false;
        d();
    }

    public final boolean c(TypedValue typedValue) {
        if (typedValue.type == 0) {
            return false;
        }
        if (j.b(getResources().getResourceTypeName(typedValue.resourceId), "color")) {
            return true;
        }
        int i = typedValue.type;
        return i >= 28 && i <= 31;
    }

    public final void d() {
        boolean z4 = this.f12042k;
        int i = 8;
        TextView textView = this.j;
        if (!z4) {
            textView.setVisibility(8);
            return;
        }
        TextViewCompat.setTextAppearance(textView, this.m);
        Integer num = this.f12044n;
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
        CharSequence text = textView.getText();
        String string = text != null ? text.toString() : null;
        if (string != null && string.length() != 0) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final AppCompatTextView getDisplayText() {
        return this.f12041g;
    }

    public final TextView getDropDownErrorTextView() {
        return this.j;
    }

    public final TextView getDropDownFloatingLabel() {
        return this.f;
    }

    public final String getErrorMessage() {
        return this.j.getText().toString();
    }

    public final TextView getFloatingLabel() {
        return this.f;
    }

    public final String getLabel() {
        return this.f.getText().toString();
    }

    public final Pair<Boolean, String> getLastValidationResult() {
        return this.e;
    }

    public final ConstraintLayout getLayoutContainer() {
        return this.i;
    }

    public final Object getSelectedData() {
        return this.f12040d;
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
            this.f12042k = bundle.getBoolean("state_should_show_error", false);
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
        bundle.putBoolean("state_should_show_error", this.f12042k);
        bundle.putSparseParcelableArray("state_child_views", b.u(this));
        return bundle;
    }

    public final void setDropDownEnabled(boolean z4) {
        setEnabled(z4);
        AppCompatTextView appCompatTextView = this.f12041g;
        appCompatTextView.setEnabled(z4);
        appCompatTextView.setClickable(z4);
        ConstraintLayout constraintLayout = this.i;
        constraintLayout.setEnabled(z4);
        constraintLayout.setClickable(z4);
        this.h.setAlpha(z4 ? 1.0f : 0.5f);
    }

    public final void setHelperErrorText(String str) {
        this.j.setText(str);
    }

    public final void setLastValidationResult(Pair<Boolean, String> pair) {
        j.g(pair, "<set-?>");
        this.e = pair;
    }

    public final void setOnSelectionChangeListener(Function1<Object, Unit> listener) {
        j.g(listener, "listener");
        this.f12043l = listener;
    }

    public final void setSelectedData(Object obj) {
        this.f12040d = obj;
        Function1 function1 = this.f12043l;
        if (function1 != null) {
            function1.invoke(obj);
        }
    }
}
