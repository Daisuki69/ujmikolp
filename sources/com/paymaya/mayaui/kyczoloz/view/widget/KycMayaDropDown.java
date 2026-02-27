package com.paymaya.mayaui.kyczoloz.view.widget;

import M8.L;
import O8.b;
import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import of.p;

/* JADX INFO: loaded from: classes4.dex */
public final class KycMayaDropDown extends ConstraintLayout {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f12663a0 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12664B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Integer f12665K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Integer f12666P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Integer f12667Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Integer f12668R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Integer f12669S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public b f12670T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Object f12671U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public String f12672V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Function0 f12673W;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f12674d;
    public final AppCompatTextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f12675g;
    public final ImageView h;
    public final LinearLayout i;
    public final ImageView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f12676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f12677l;
    public final ConstraintLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12689y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycMayaDropDown(Context context, AttributeSet attrs) {
        super(context, attrs);
        j.g(context, "context");
        j.g(attrs, "attrs");
        LayoutInflater.from(context).inflate(R.layout.maya_drop_down_layout, this);
        int i = R.id.display_select_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(this, R.id.display_select_text);
        if (appCompatTextView != null) {
            i = R.id.error_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(this, R.id.error_container);
            if (linearLayout != null) {
                i = R.id.error_info_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(this, R.id.error_info_icon);
                if (imageView != null) {
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
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(this, R.id.primary_icon_image_view);
                                if (imageView2 != null) {
                                    i = R.id.warning_container;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(this, R.id.warning_container);
                                    if (linearLayout2 != null) {
                                        i = R.id.warning_icon;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(this, R.id.warning_icon);
                                        if (imageView3 != null) {
                                            i = R.id.warning_text_view;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(this, R.id.warning_text_view);
                                            if (textView3 != null) {
                                                this.f12674d = textView2;
                                                this.e = appCompatTextView;
                                                this.f = textView;
                                                this.f12675g = linearLayout;
                                                this.h = imageView;
                                                this.i = linearLayout2;
                                                this.j = imageView3;
                                                this.f12676k = textView3;
                                                this.f12677l = imageView2;
                                                this.m = constraintLayout;
                                                this.f12678n = true;
                                                this.f12681q = true;
                                                this.f12682r = true;
                                                this.f12683s = true;
                                                this.f12685u = true;
                                                this.f12686v = R.style.JekoBoldLink_Tertiary;
                                                this.f12687w = R.style.CerebriBookH5;
                                                this.f12688x = R.style.CerebriBookH5;
                                                this.f12689y = R.style.JekoSemiBoldSmallText_Error;
                                                this.f12664B = R.style.CerebriBookLongRead;
                                                this.f12670T = b.f4762a;
                                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, c.f6294d, 0, 0);
                                                setupBasicProperties(typedArrayObtainStyledAttributes);
                                                setupLabelConfiguration(typedArrayObtainStyledAttributes);
                                                setupErrorConfiguration(typedArrayObtainStyledAttributes);
                                                setupWarningConfiguration(typedArrayObtainStyledAttributes);
                                                setupIconConfiguration(typedArrayObtainStyledAttributes);
                                                setupColorOverrides(typedArrayObtainStyledAttributes);
                                                setupBackgroundConfiguration(typedArrayObtainStyledAttributes);
                                                typedArrayObtainStyledAttributes.recycle();
                                                constraintLayout.setOnClickListener(new L(this, 23));
                                                e();
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
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    private final void setCurrentState(b bVar) {
        this.f12670T = bVar;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            this.f12679o = false;
            this.f12680p = false;
        } else if (iOrdinal == 1) {
            this.f12679o = true;
            this.f12680p = false;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f12679o = false;
            this.f12680p = true;
        }
        f();
        h();
    }

    private final void setupBackgroundConfiguration(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(5);
        if (drawable != null) {
            this.m.setBackground(drawable);
        }
    }

    private final void setupBasicProperties(TypedArray typedArray) {
        setEnabled(typedArray.getBoolean(0, true));
        this.f12672V = typedArray.getString(2);
        setDisplayText(typedArray.getString(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupColorOverrides(android.content.res.TypedArray r13) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown.setupColorOverrides(android.content.res.TypedArray):void");
    }

    private final void setupErrorConfiguration(TypedArray typedArray) {
        String string = typedArray.getString(12);
        if (string != null) {
            this.f.setText(string);
        }
        this.f12689y = typedArray.getResourceId(9, this.f12689y);
        this.f12679o = typedArray.getBoolean(20, this.f12679o);
        this.f12681q = typedArray.getBoolean(3, this.f12681q);
        this.f12684t = typedArray.getBoolean(21, this.f12684t);
        Drawable drawable = typedArray.getDrawable(11);
        if (drawable != null) {
            this.h.setImageDrawable(drawable);
        }
    }

    private final void setupIconConfiguration(TypedArray typedArray) {
        this.f12683s = typedArray.getBoolean(19, this.f12683s);
        Drawable drawable = typedArray.getDrawable(8);
        if (drawable != null) {
            this.f12677l.setImageDrawable(drawable);
        }
    }

    private final void setupLabelConfiguration(TypedArray typedArray) {
        String string = typedArray.getString(16);
        if (string != null) {
            this.f12674d.setText(string);
        }
        this.f12686v = typedArray.getResourceId(17, this.f12686v);
        this.f12678n = typedArray.getBoolean(22, this.f12678n);
        this.f12687w = typedArray.getResourceId(6, this.f12687w);
        this.f12688x = typedArray.getResourceId(14, this.f12688x);
    }

    private final void setupWarningConfiguration(TypedArray typedArray) {
        String string = typedArray.getString(27);
        if (string != null) {
            this.f12676k.setText(string);
        }
        this.f12664B = typedArray.getResourceId(25, this.f12664B);
        this.f12680p = typedArray.getBoolean(23, this.f12680p);
        this.f12682r = typedArray.getBoolean(4, this.f12682r);
        this.f12685u = typedArray.getBoolean(24, this.f12685u);
        Drawable drawable = typedArray.getDrawable(26);
        if (drawable != null) {
            this.j.setImageDrawable(drawable);
        }
    }

    public final void b() {
        this.f12679o = false;
        f();
    }

    public final void c() {
        setCurrentState(b.f4762a);
    }

    public final boolean d() {
        if (getVisibility() == 0) {
            boolean z4 = this.f12671U != null;
            boolean z5 = this.f12679o && this.f.getVisibility() == 0;
            if ((!z4 || z5) && (z5 || !z4)) {
                return false;
            }
        }
        return true;
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
        g();
        int i = this.f12687w;
        AppCompatTextView appCompatTextView = this.e;
        TextViewCompat.setTextAppearance(appCompatTextView, i);
        Integer num = this.f12666P;
        if (num != null) {
            appCompatTextView.setTextColor(num.intValue());
        }
        Integer num2 = this.f12667Q;
        if (num2 != null) {
            appCompatTextView.setHintTextColor(num2.intValue());
        }
        f();
        h();
        this.f12677l.setVisibility(this.f12683s ? 0 : 8);
    }

    public final void f() {
        TextView textView = this.f;
        CharSequence text = textView.getText();
        boolean z4 = text == null || text.length() == 0;
        this.f12675g.setVisibility(this.f12679o && !z4 ? 0 : 8);
        textView.setVisibility(this.f12679o && !z4 ? 0 : 8);
        this.h.setVisibility(this.f12679o && !z4 && this.f12684t ? 0 : 8);
        TextViewCompat.setTextAppearance(textView, this.f12689y);
        Integer num = this.f12668R;
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
    }

    public final void g() {
        CharSequence text;
        boolean z4 = this.f12678n;
        TextView textView = this.f12674d;
        textView.setVisibility(z4 && (text = textView.getText()) != null && text.length() != 0 ? 0 : 8);
        TextViewCompat.setTextAppearance(textView, this.f12686v);
        Integer num = this.f12665K;
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
    }

    public final ConstraintLayout getContainerLayout() {
        return this.m;
    }

    public final String getDisplayText() {
        CharSequence text = this.e.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TextView getDisplayTextView() {
        return this.e;
    }

    public final ImageView getDropdownIcon() {
        return this.f12677l;
    }

    public final LinearLayout getErrorContainer() {
        return this.f12675g;
    }

    public final ImageView getErrorInfoIcon() {
        return this.h;
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

    public final String getLabelText() {
        CharSequence text = this.f12674d.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TextView getLabelTextView() {
        return this.f12674d;
    }

    public final Function0<Unit> getOnDropdownClickListener() {
        return this.f12673W;
    }

    public final Object getSelectedData() {
        return this.f12671U;
    }

    public final <T> T getSelectedItem() {
        getSelectedData();
        j.m();
        throw null;
    }

    public final LinearLayout getWarningContainer() {
        return this.i;
    }

    public final ImageView getWarningIcon() {
        return this.j;
    }

    public final String getWarningText() {
        CharSequence text = this.f12676k.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TextView getWarningTextView() {
        return this.f12676k;
    }

    public final void h() {
        TextView textView = this.f12676k;
        CharSequence text = textView.getText();
        boolean z4 = text == null || text.length() == 0;
        this.i.setVisibility(this.f12680p && !z4 ? 0 : 8);
        textView.setVisibility(this.f12680p && !z4 ? 0 : 8);
        this.j.setVisibility(this.f12680p && !z4 && this.f12685u ? 0 : 8);
        TextViewCompat.setTextAppearance(textView, this.f12664B);
        Integer num = this.f12669S;
        if (num != null) {
            textView.setTextColor(num.intValue());
        } else {
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.pumpkin_orange));
        }
    }

    public final void i() {
        setCurrentState(b.f4763b);
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
        b bVarValueOf;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f12679o = bundle.getBoolean(p.o(getId(), "state_should_show_error"), false);
            this.f12680p = bundle.getBoolean(p.o(getId(), "state_should_show_warning"), false);
            this.f12678n = bundle.getBoolean(p.o(getId(), "state_should_show_label"), true);
            this.f12681q = bundle.getBoolean(p.o(getId(), "state_auto_hide_error"), true);
            this.f12682r = bundle.getBoolean(p.o(getId(), "state_auto_hide_warning"), false);
            this.f12684t = bundle.getBoolean(p.o(getId(), "state_show_error_icon"), false);
            this.f12685u = bundle.getBoolean(p.o(getId(), "state_show_warning_icon"), true);
            setSelectedData(bundle.getString(p.o(getId(), "state_selected_data")));
            String string = bundle.getString(p.o(getId(), "state_current_state"));
            if (string != null) {
                try {
                    bVarValueOf = b.valueOf(string);
                } catch (IllegalArgumentException unused) {
                    bVarValueOf = b.f4762a;
                }
                setCurrentState(bVarValueOf);
            }
            String string2 = bundle.getString(p.o(getId(), "state_display_text"));
            if (string2 != null) {
                this.e.setText(string2);
            }
            String string3 = bundle.getString(p.o(getId(), "state_label_text"));
            if (string3 != null) {
                this.f12674d.setText(string3);
            }
            String string4 = bundle.getString(p.o(getId(), "state_hint_text"));
            if (string4 != null) {
                this.f12672V = string4;
            }
            String string5 = bundle.getString(p.o(getId(), "state_error_text"));
            if (string5 != null) {
                this.f.setText(string5);
            }
            String string6 = bundle.getString(p.o(getId(), "state_warning_text"));
            if (string6 != null) {
                this.f12676k.setText(string6);
            }
            parcelable = bundle.getParcelable("state_super_state");
            e();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_super_state", super.onSaveInstanceState());
        bundle.putBoolean(p.o(getId(), "state_should_show_error"), this.f12679o);
        bundle.putBoolean(p.o(getId(), "state_should_show_warning"), this.f12680p);
        bundle.putBoolean(p.o(getId(), "state_should_show_label"), this.f12678n);
        bundle.putBoolean(p.o(getId(), "state_auto_hide_error"), this.f12681q);
        bundle.putBoolean(p.o(getId(), "state_auto_hide_warning"), this.f12682r);
        bundle.putBoolean(p.o(getId(), "state_show_error_icon"), this.f12684t);
        bundle.putBoolean(p.o(getId(), "state_show_warning_icon"), this.f12685u);
        bundle.putString(p.o(getId(), "state_current_state"), this.f12670T.name());
        String strO = p.o(getId(), "state_selected_data");
        Object obj = this.f12671U;
        bundle.putString(strO, obj != null ? obj.toString() : null);
        String strO2 = p.o(getId(), "state_display_text");
        CharSequence text = this.e.getText();
        bundle.putString(strO2, text != null ? text.toString() : null);
        String strO3 = p.o(getId(), "state_label_text");
        CharSequence text2 = this.f12674d.getText();
        bundle.putString(strO3, text2 != null ? text2.toString() : null);
        bundle.putString(p.o(getId(), "state_hint_text"), this.f12672V);
        String strO4 = p.o(getId(), "state_error_text");
        CharSequence text3 = this.f.getText();
        bundle.putString(strO4, text3 != null ? text3.toString() : null);
        String strO5 = p.o(getId(), "state_warning_text");
        CharSequence text4 = this.f12676k.getText();
        bundle.putString(strO5, text4 != null ? text4.toString() : null);
        return bundle;
    }

    public final void setAutoHideError(boolean z4) {
        this.f12681q = z4;
    }

    public final void setAutoHideWarning(boolean z4) {
        this.f12682r = z4;
    }

    public final void setDisplayText(String str) {
        AppCompatTextView appCompatTextView = this.e;
        appCompatTextView.setText(str);
        if (str == null || str.length() == 0) {
            appCompatTextView.setHint(this.f12672V);
        } else {
            appCompatTextView.setHint((CharSequence) null);
        }
    }

    public final void setDropdownBackground(@DrawableRes int i) {
        this.m.setBackgroundResource(i);
    }

    public final void setDropdownIcon(@DrawableRes int i) {
        this.f12677l.setImageResource(i);
    }

    public final void setDropdownIconVisible(boolean z4) {
        this.f12683s = z4;
        this.f12677l.setVisibility(z4 ? 0 : 8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        ConstraintLayout constraintLayout = this.m;
        constraintLayout.setEnabled(z4);
        this.e.setEnabled(z4);
        constraintLayout.setAlpha(z4 ? 1.0f : 0.6f);
        this.f12677l.setAlpha(z4 ? 1.0f : 0.4f);
    }

    public final void setErrorText(String str) {
        this.f.setText(str);
        f();
    }

    public final void setHintText(String str) {
        this.f12672V = str;
        this.e.setHint(str);
    }

    public final void setLabelText(String str) {
        this.f12674d.setText(str);
        g();
    }

    public final void setLabelVisible(boolean z4) {
        this.f12678n = z4;
        g();
    }

    public final void setOnDropdownClickListener(Function0<Unit> function0) {
        this.f12673W = function0;
        this.m.setOnClickListener(new L(this, 23));
    }

    public final void setSelectedData(Object obj) {
        this.f12671U = obj;
        setDisplayText(obj != null ? obj.toString() : null);
    }

    public final void setSelectedItem(Object obj) {
        setSelectedData(obj);
        setDisplayText(obj != null ? obj.toString() : null);
    }

    public final void setWarningIcon(@DrawableRes int i) {
        this.j.setImageResource(i);
    }

    public final void setWarningIconVisible(boolean z4) {
        this.f12685u = z4;
        h();
    }

    public final void setWarningText(String str) {
        this.f12676k.setText(str);
        h();
    }
}
