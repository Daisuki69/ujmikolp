package com.paymaya.mayaui.common.view.widget.inforeviewlist;

import O6.b;
import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b7.g;
import b7.h;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaReviewInfoRecyclerView extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaReviewInfoRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        setLayoutManager(new LinearLayoutManager(getContext()));
        setOverScrollMode(2);
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.maya_bg_content_information));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f6299o);
            j.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = typedArrayObtainStyledAttributes.getString(0);
            g gVar = (!j.b(string, "full") && j.b(string, "short")) ? g.f8547b : g.f8546a;
            int i = h.f8548a[gVar.ordinal()];
            int i4 = R.drawable.maya_divider_recycler_view_long;
            if (i != 1 && i == 2) {
                i4 = R.drawable.maya_divider_recycler_view_short;
            }
            Context context2 = getContext();
            j.f(context2, "getContext(...)");
            b bVar = new b(context2, 1);
            Drawable drawable = ContextCompat.getDrawable(getContext(), i4);
            if (drawable != null) {
                bVar.f4759a = drawable;
            }
            addItemDecoration(bVar);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
