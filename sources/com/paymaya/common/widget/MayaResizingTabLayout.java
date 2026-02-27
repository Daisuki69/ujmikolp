package com.paymaya.common.widget;

import G5.B;
import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import cj.C1132s;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class MayaResizingTabLayout extends TabLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11286b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaResizingTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.g(context, "context");
        this.f11285a = getResources().getDimensionPixelSize(R.dimen.maya_padding_small);
        this.f11286b = getResources().getDimensionPixelSize(R.dimen.maya_padding_large);
        this.c = getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
        this.f11287d = getResources().getDimensionPixelSize(R.dimen.maya_margin_large);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6298n, 0, 0);
        this.f11285a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f11286b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f11287d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new B(this));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        View childAt = getChildAt(0);
        j.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        int i = 0;
        for (Object obj : ViewGroupKt.getChildren((ViewGroup) childAt)) {
            int i4 = i + 1;
            if (i < 0) {
                C1132s.k();
                throw null;
            }
            View view = (View) obj;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            j.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (i == 0) {
                layoutParams2.setMarginStart(this.f11287d);
            } else {
                layoutParams2.setMarginStart(this.c);
            }
            if (i == r1.getChildCount() - 1) {
                layoutParams2.setMarginEnd(this.f11287d);
            } else {
                layoutParams2.setMarginEnd(0);
            }
            view.setLayoutParams(layoutParams2);
            i = i4;
        }
        View childAt2 = getChildAt(0);
        j.e(childAt2, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view2 : ViewGroupKt.getChildren((ViewGroup) childAt2)) {
            if (view2.isSelected()) {
                int i6 = this.f11286b;
                view2.setPadding(i6, view2.getPaddingTop(), i6, view2.getPaddingBottom());
            } else {
                int i10 = this.f11285a;
                view2.setPadding(i10, view2.getPaddingTop(), i10, view2.getPaddingBottom());
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void addTab(TabLayout.Tab tab, int i, boolean z4) {
        j.g(tab, "tab");
        super.addTab(tab, i, z4);
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void removeTabAt(int i) {
        super.removeTabAt(i);
        a();
    }
}
