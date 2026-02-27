package com.paymaya.mayaui.kyczoloz.view.widget;

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
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycMayaInfoSection extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f12690d;
    public final TextView e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12691g;
    public Integer h;
    public Integer i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycMayaInfoSection(Context context, AttributeSet attrs) {
        super(context, attrs);
        j.g(context, "context");
        j.g(attrs, "attrs");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_info_section_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.description_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.description_text_view);
        if (textView != null) {
            i = R.id.header_text_view;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.header_text_view);
            if (textView2 != null) {
                this.f12690d = textView2;
                this.e = textView;
                this.f = R.style.JekoBoldSmallText_Primary;
                this.f12691g = R.style.CerebriBookSmallText_Secondary;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, c.e, 0, 0);
                setupHeaderConfiguration(typedArrayObtainStyledAttributes);
                setupDescriptionConfiguration(typedArrayObtainStyledAttributes);
                setupColorOverrides(typedArrayObtainStyledAttributes);
                setupLayoutConfiguration(typedArrayObtainStyledAttributes);
                typedArrayObtainStyledAttributes.recycle();
                c();
                b();
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupColorOverrides(android.content.res.TypedArray r12) {
        /*
            r11 = this;
            r0 = 6
            android.util.TypedValue r1 = r12.peekValue(r0)
            r2 = 1
            r3 = 31
            r4 = 28
            java.lang.String r5 = "color"
            r6 = 0
            r7 = 0
            java.lang.String r8 = "getContext(...)"
            if (r1 == 0) goto L57
            android.content.Context r9 = r11.getContext()
            kotlin.jvm.internal.j.f(r9, r8)
            int r10 = r1.type
            if (r10 != 0) goto L1f
        L1d:
            r1 = r7
            goto L38
        L1f:
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Exception -> L2a
            int r10 = r1.resourceId     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = r9.getResourceTypeName(r10)     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r9 = r6
        L2b:
            boolean r9 = kotlin.jvm.internal.j.b(r9, r5)
            if (r9 != 0) goto L37
            int r1 = r1.type
            if (r1 < r4) goto L1d
            if (r1 > r3) goto L1d
        L37:
            r1 = r2
        L38:
            if (r1 == 0) goto L57
            android.content.Context r1 = r11.getContext()
            kotlin.jvm.internal.j.f(r1, r8)
            r9 = 17170444(0x106000c, float:2.4611947E-38)
            int r0 = r12.getResourceId(r0, r9)
            int r0 = androidx.core.content.ContextCompat.getColor(r1, r0)     // Catch: java.lang.Exception -> L4d
            goto L51
        L4d:
            int r0 = androidx.core.content.ContextCompat.getColor(r1, r9)
        L51:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.h = r0
        L57:
            r0 = 3
            android.util.TypedValue r1 = r12.peekValue(r0)
            if (r1 == 0) goto La1
            android.content.Context r9 = r11.getContext()
            kotlin.jvm.internal.j.f(r9, r8)
            int r10 = r1.type
            if (r10 != 0) goto L6a
            goto L83
        L6a:
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Exception -> L74
            int r10 = r1.resourceId     // Catch: java.lang.Exception -> L74
            java.lang.String r6 = r9.getResourceTypeName(r10)     // Catch: java.lang.Exception -> L74
        L74:
            boolean r5 = kotlin.jvm.internal.j.b(r6, r5)
            if (r5 != 0) goto L82
            int r1 = r1.type
            if (r1 < r4) goto L81
            if (r1 > r3) goto L81
            goto L82
        L81:
            r2 = r7
        L82:
            r7 = r2
        L83:
            if (r7 == 0) goto La1
            android.content.Context r1 = r11.getContext()
            kotlin.jvm.internal.j.f(r1, r8)
            r2 = 17170432(0x1060000, float:2.4611913E-38)
            int r12 = r12.getResourceId(r0, r2)
            int r12 = androidx.core.content.ContextCompat.getColor(r1, r12)     // Catch: java.lang.Exception -> L97
            goto L9b
        L97:
            int r12 = androidx.core.content.ContextCompat.getColor(r1, r2)
        L9b:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.i = r12
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInfoSection.setupColorOverrides(android.content.res.TypedArray):void");
    }

    private final void setupDescriptionConfiguration(TypedArray typedArray) {
        CharSequence text = typedArray.getText(1);
        if (text != null) {
            this.e.setText(text);
        }
        this.f12691g = typedArray.getResourceId(2, this.f12691g);
    }

    private final void setupHeaderConfiguration(TypedArray typedArray) {
        CharSequence text = typedArray.getText(4);
        if (text != null) {
            this.f12690d.setText(text);
        }
        this.f = typedArray.getResourceId(5, this.f);
    }

    private final void setupLayoutConfiguration(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(0);
        if (drawable != null) {
            setBackground(drawable);
        }
        float dimension = typedArray.getDimension(8, -1.0f);
        if (dimension > 0.0f) {
            int i = (int) dimension;
            setPadding(i, i, i, i);
        }
    }

    public final void b() {
        TextView textView = this.e;
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        TextViewCompat.setTextAppearance(textView, this.f12691g);
        Integer num = this.i;
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
    }

    public final void c() {
        TextView textView = this.f12690d;
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        TextViewCompat.setTextAppearance(textView, this.f);
        Integer num = this.h;
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

    public final String getDescriptionText() {
        CharSequence text = this.e.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TextView getDescriptionTextView() {
        return this.e;
    }

    public final String getHeaderText() {
        CharSequence text = this.f12690d.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TextView getHeaderTextView() {
        return this.f12690d;
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
            String string = bundle.getString("state_header_text_" + getId());
            if (string != null) {
                this.f12690d.setText(string);
            }
            String string2 = bundle.getString("state_description_text_" + getId());
            if (string2 != null) {
                this.e.setText(string2);
            }
            parcelable = bundle.getParcelable("state_super_state");
            c();
            b();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_super_state", super.onSaveInstanceState());
        String str = "state_header_text" + Global.UNDERSCORE + getId();
        CharSequence text = this.f12690d.getText();
        bundle.putString(str, text != null ? text.toString() : null);
        String str2 = "state_description_text" + Global.UNDERSCORE + getId();
        CharSequence text2 = this.e.getText();
        bundle.putString(str2, text2 != null ? text2.toString() : null);
        return bundle;
    }

    public final void setDescriptionText(String str) {
        this.e.setText(str);
        b();
    }

    public final void setHeaderText(String str) {
        this.f12690d.setText(str);
        c();
    }
}
