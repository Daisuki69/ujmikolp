package com.paymaya.mayaui.kyczoloz.view.widget;

import G5.F;
import G5.ViewOnFocusChangeListenerC0253c;
import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import of.p;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class KycMayaInputLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f12692y = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f12693d;
    public final AppCompatEditText e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f12694g;
    public final LinearLayout h;
    public final ConstraintLayout i;
    public final ConstraintLayout j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12696l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12697n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12698o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f12703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f12704u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f12705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f12706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Function1 f12707x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycMayaInputLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        j.g(context, "context");
        j.g(attrs, "attrs");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_input_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.error_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.error_container);
        if (linearLayout != null) {
            i = R.id.error_info_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.error_info_icon);
            if (imageView != null) {
                i = R.id.error_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.error_text_view);
                if (textView != null) {
                    ConstraintLayout formConstraintLayout = (ConstraintLayout) viewInflate;
                    int i4 = R.id.input_content_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_content_container);
                    if (constraintLayout != null) {
                        i4 = R.id.input_edit_text;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(viewInflate, R.id.input_edit_text);
                        if (appCompatEditText != null) {
                            i4 = R.id.label_text_view;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.label_text_view);
                            if (textView2 != null) {
                                this.f12693d = textView2;
                                this.e = appCompatEditText;
                                this.f = textView;
                                this.f12694g = imageView;
                                this.h = linearLayout;
                                j.f(formConstraintLayout, "formConstraintLayout");
                                this.i = formConstraintLayout;
                                this.j = constraintLayout;
                                this.f12695k = true;
                                this.m = true;
                                this.f12699p = R.style.JekoBoldLink_Tertiary;
                                this.f12700q = R.style.CerebriMediumH5;
                                this.f12701r = R.style.CerebriMediumH5;
                                this.f12702s = R.style.JekoSemiBoldSmallText_Error;
                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, c.f, 0, 0);
                                setupBasicProperties(typedArrayObtainStyledAttributes);
                                setupInputConfiguration(typedArrayObtainStyledAttributes);
                                setupLabelConfiguration(typedArrayObtainStyledAttributes);
                                setupErrorConfiguration(typedArrayObtainStyledAttributes);
                                setupCopyPasteConfiguration(typedArrayObtainStyledAttributes);
                                setupColorOverrides(typedArrayObtainStyledAttributes);
                                setupBackgroundConfiguration(typedArrayObtainStyledAttributes);
                                typedArrayObtainStyledAttributes.recycle();
                                if (this.f12697n) {
                                    appCompatEditText.setOnLongClickListener(new O8.c());
                                    appCompatEditText.setLongClickable(false);
                                    appCompatEditText.setTextIsSelectable(true);
                                }
                                appCompatEditText.addTextChangedListener(new F(this, 5));
                                appCompatEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0253c(this, 1));
                                c();
                                return;
                            }
                        }
                    }
                    i = i4;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    private final void setupBackgroundConfiguration(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(8);
        if (drawable != null) {
            this.i.setBackground(drawable);
        }
    }

    private final void setupBasicProperties(TypedArray typedArray) {
        setEnabled(typedArray.getBoolean(0, true));
        String string = typedArray.getString(1);
        AppCompatEditText appCompatEditText = this.e;
        appCompatEditText.setText(string);
        appCompatEditText.setHint(typedArray.getString(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupColorOverrides(android.content.res.TypedArray r13) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout.setupColorOverrides(android.content.res.TypedArray):void");
    }

    private final void setupCopyPasteConfiguration(TypedArray typedArray) {
        this.f12697n = typedArray.getBoolean(9, this.f12697n);
    }

    private final void setupErrorConfiguration(TypedArray typedArray) {
        String string = typedArray.getString(13);
        if (string != null) {
            this.f.setText(string);
        }
        this.f12702s = typedArray.getResourceId(10, this.f12702s);
        this.f12696l = typedArray.getBoolean(22, this.f12696l);
        this.m = typedArray.getBoolean(7, this.m);
        this.f12698o = typedArray.getBoolean(23, this.f12698o);
        Drawable drawable = typedArray.getDrawable(12);
        if (drawable != null) {
            this.f12694g.setImageDrawable(drawable);
        }
    }

    private final void setupInputConfiguration(TypedArray typedArray) {
        int i = typedArray.getInt(5, 1);
        AppCompatEditText appCompatEditText = this.e;
        appCompatEditText.setInputType(i);
        int i4 = typedArray.getInt(4, -1);
        if (i4 > 0) {
            appCompatEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i4)});
        }
        appCompatEditText.setMaxLines(typedArray.getInt(3, 1));
        int i6 = typedArray.getInt(6, -1);
        if (i6 != -1) {
            appCompatEditText.setImeOptions(i6);
        }
    }

    private final void setupLabelConfiguration(TypedArray typedArray) {
        String string = typedArray.getString(19);
        if (string != null) {
            this.f12693d.setText(string);
        }
        this.f12699p = typedArray.getResourceId(20, this.f12699p);
        this.f12695k = typedArray.getBoolean(24, this.f12695k);
        this.f12700q = typedArray.getResourceId(17, this.f12700q);
        this.f12701r = typedArray.getResourceId(15, this.f12701r);
    }

    public final boolean b() {
        CharSequence text;
        if (getVisibility() == 0) {
            String string = C2576A.b0(getText()).toString();
            boolean z4 = (!this.f12696l || (text = this.f.getText()) == null || text.length() == 0) ? false : true;
            if ((isEnabled() || string.length() != 0) && ((string.length() <= 0 || z4) && (z4 || (string.length() == 0 && isEnabled())))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        e();
        int i = this.f12700q;
        AppCompatEditText appCompatEditText = this.e;
        TextViewCompat.setTextAppearance(appCompatEditText, i);
        Integer num = this.f12704u;
        if (num != null) {
            appCompatEditText.setTextColor(num.intValue());
        }
        Integer num2 = this.f12705v;
        if (num2 != null) {
            appCompatEditText.setHintTextColor(num2.intValue());
        }
        d();
    }

    public final void d() {
        CharSequence text;
        boolean z4 = this.f12696l;
        TextView textView = this.f;
        boolean z5 = (!z4 || (text = textView.getText()) == null || text.length() == 0) ? false : true;
        this.h.setVisibility(z5 ? 0 : 8);
        textView.setVisibility(z5 ? 0 : 8);
        this.f12694g.setVisibility(z5 && this.f12698o ? 0 : 8);
        TextViewCompat.setTextAppearance(textView, this.f12702s);
        Integer num = this.f12706w;
        if (num != null) {
            textView.setTextColor(num.intValue());
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
        CharSequence text;
        boolean z4 = this.f12695k;
        TextView textView = this.f12693d;
        textView.setVisibility(z4 && (text = textView.getText()) != null && text.length() != 0 ? 0 : 8);
        TextViewCompat.setTextAppearance(textView, this.f12699p);
        Integer num = this.f12703t;
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
    }

    public final ConstraintLayout getContainerLayout() {
        return this.i;
    }

    public final ConstraintLayout getContentContainer() {
        return this.j;
    }

    public final LinearLayout getErrorContainer() {
        return this.h;
    }

    public final ImageView getErrorInfoIcon() {
        return this.f12694g;
    }

    public final String getErrorText() {
        CharSequence text = this.f.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TextView getErrorTextView() {
        return this.f;
    }

    public final String getHintText() {
        CharSequence hint = this.e.getHint();
        if (hint != null) {
            return hint.toString();
        }
        return null;
    }

    public final EditText getInputEditText() {
        return this.e;
    }

    public final String getLabelText() {
        CharSequence text = this.f12693d.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TextView getLabelTextView() {
        return this.f12693d;
    }

    public final Function1<String, Unit> getOnTextChangeListener() {
        return this.f12707x;
    }

    public final String getText() {
        String string;
        Editable text = this.e.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
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
            this.f12696l = bundle.getBoolean(p.o(getId(), "state_should_show_error"), false);
            this.f12695k = bundle.getBoolean(p.o(getId(), "state_should_show_label"), true);
            this.m = bundle.getBoolean(p.o(getId(), "state_auto_hide_error"), true);
            this.f12697n = bundle.getBoolean(p.o(getId(), "state_disable_copy_paste"), false);
            this.f12698o = bundle.getBoolean(p.o(getId(), "state_show_error_icon"), false);
            String string = bundle.getString(p.o(getId(), "state_input_text"));
            if (string != null) {
                setText(string);
            }
            String string2 = bundle.getString(p.o(getId(), "state_label_text"));
            if (string2 != null) {
                this.f12693d.setText(string2);
            }
            String string3 = bundle.getString(p.o(getId(), "state_hint_text"));
            if (string3 != null) {
                this.e.setHint(string3);
            }
            String string4 = bundle.getString(p.o(getId(), "state_error_text"));
            if (string4 != null) {
                this.f.setText(string4);
            }
            parcelable = bundle.getParcelable("state_super_state");
            c();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_super_state", super.onSaveInstanceState());
        bundle.putBoolean(p.o(getId(), "state_should_show_error"), this.f12696l);
        bundle.putBoolean(p.o(getId(), "state_should_show_label"), this.f12695k);
        bundle.putBoolean(p.o(getId(), "state_auto_hide_error"), this.m);
        bundle.putString(p.o(getId(), "state_input_text"), getText());
        bundle.putBoolean(p.o(getId(), "state_disable_copy_paste"), this.f12697n);
        bundle.putBoolean(p.o(getId(), "state_show_error_icon"), this.f12698o);
        String strO = p.o(getId(), "state_label_text");
        CharSequence text = this.f12693d.getText();
        bundle.putString(strO, text != null ? text.toString() : null);
        String strO2 = p.o(getId(), "state_hint_text");
        CharSequence hint = this.e.getHint();
        bundle.putString(strO2, hint != null ? hint.toString() : null);
        String strO3 = p.o(getId(), "state_error_text");
        CharSequence text2 = this.f.getText();
        bundle.putString(strO3, text2 != null ? text2.toString() : null);
        return bundle;
    }

    public final void setAutoHideError(boolean z4) {
        this.m = z4;
    }

    public final void setCopyPasteEnabled(boolean z4) {
        this.f12697n = !z4;
        AppCompatEditText appCompatEditText = this.e;
        if (z4) {
            appCompatEditText.setOnLongClickListener(null);
            appCompatEditText.setLongClickable(true);
        } else {
            appCompatEditText.setOnLongClickListener(new O8.c());
            appCompatEditText.setLongClickable(false);
            appCompatEditText.setTextIsSelectable(true);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.e.setEnabled(z4);
        this.i.setAlpha(z4 ? 1.0f : 0.6f);
    }

    public final void setErrorIcon(@DrawableRes int i) {
        this.f12694g.setImageResource(i);
    }

    public final void setErrorIconVisible(boolean z4) {
        this.f12698o = z4;
        d();
    }

    public final void setErrorText(String str) {
        this.f.setText(str);
        d();
    }

    public final void setHintText(String str) {
        this.e.setHint(str);
    }

    public final void setInputBackground(@DrawableRes int i) {
        this.i.setBackgroundResource(i);
    }

    public final void setLabelText(String str) {
        this.f12693d.setText(str);
        e();
    }

    public final void setLabelVisible(boolean z4) {
        this.f12695k = z4;
        e();
    }

    public final void setOnTextChangeListener(Function1<? super String, Unit> function1) {
        this.f12707x = function1;
    }

    public final void setText(String str) {
        this.e.setText(str);
    }
}
