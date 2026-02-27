package com.paymaya.mayaui.dashboard.view.widget;

import J7.c;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.domain.model.SecondaryFeature;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaServicesCoreItemsView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12258d;
    public final int e;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function2 f12259g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaServicesCoreItemsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_view_services_core_tiles, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        this.f12258d = new ArrayList();
        this.e = 5;
        this.f = new ArrayList();
        b();
    }

    public final void b() {
        removeAllViews();
        ArrayList arrayList = this.f12258d;
        arrayList.clear();
        int i = 0;
        for (Object obj : this.f) {
            int i4 = i + 1;
            if (i < 0) {
                C1132s.k();
                throw null;
            }
            Context context = getContext();
            j.f(context, "getContext(...)");
            c cVar = new c(context);
            cVar.b(i, (SecondaryFeature) obj, this.f12259g);
            cVar.setId(View.generateViewId());
            addView(cVar);
            arrayList.add(cVar);
            i = i4;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context2 = getContext();
        j.e(context2, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context2).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int paddingEnd = ((displayMetrics.widthPixels - (getPaddingEnd() + getPaddingStart())) / this.e) - getContext().getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
        int i6 = 0;
        for (Object obj2 : arrayList) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                C1132s.k();
                throw null;
            }
            c cVar2 = (c) obj2;
            ViewGroup.LayoutParams layoutParams = cVar2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
            layoutParams2.matchConstraintMaxWidth = paddingEnd;
            if (i6 == 0) {
                layoutParams2.startToStart = 0;
                layoutParams2.horizontalChainStyle = 1;
            }
            int i11 = i6 - 1;
            if (i11 >= 0) {
                layoutParams2.startToEnd = ((c) arrayList.get(i11)).getId();
            }
            if (i10 <= C1132s.f(arrayList)) {
                layoutParams2.endToStart = ((c) arrayList.get(i10)).getId();
            }
            if (i6 == C1132s.f(arrayList)) {
                layoutParams2.endToEnd = 0;
            }
            cVar2.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = cVar2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.maya_margin_extra_small);
            int i12 = i6 == 0 ? 0 : dimensionPixelSize;
            if (i6 == C1132s.f(arrayList)) {
                dimensionPixelSize = 0;
            }
            marginLayoutParams.setMargins(i12, marginLayoutParams.topMargin, dimensionPixelSize, marginLayoutParams.bottomMargin);
            cVar2.setLayoutParams(marginLayoutParams);
            i6 = i10;
        }
    }

    public final List<SecondaryFeature> getItems() {
        return this.f;
    }

    public final Function2<Integer, SecondaryFeature, Unit> getListener() {
        return this.f12259g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setItems(List<? extends SecondaryFeature> value) {
        j.g(value, "value");
        this.f = value;
        b();
        invalidate();
    }

    public final void setListener(Function2<? super Integer, ? super SecondaryFeature, Unit> function2) {
        this.f12259g = function2;
    }
}
