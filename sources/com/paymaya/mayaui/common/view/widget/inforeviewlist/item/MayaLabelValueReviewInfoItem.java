package com.paymaya.mayaui.common.view.widget.inforeviewlist.item;

import N5.C0447e;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaLabelValueReviewInfoItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0447e f12098a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaLabelValueReviewInfoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_label_value_review_info_item_view, (ViewGroup) this, false);
        addView(viewInflate);
        this.f12098a = C0447e.a(viewInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setTextAlignment(boolean z4) {
        if (z4) {
            C0447e c0447e = this.f12098a;
            ((Guideline) c0447e.f4080d).setGuidelinePercent(0.4f);
            ((TextView) c0447e.e).setTextAlignment(6);
        }
    }

    public final void setTitle(String text) {
        j.g(text, "text");
        ((TextView) this.f12098a.f).setText(text);
    }

    public final void setTitleColor(int i) {
        ((TextView) this.f12098a.f).setTextColor(i);
    }

    public final void setValue(String text) {
        j.g(text, "text");
        ((TextView) this.f12098a.e).setText(text);
    }

    public final void setValueTextAlignment(int i) {
        ((TextView) this.f12098a.e).setTextAlignment(i);
    }
}
