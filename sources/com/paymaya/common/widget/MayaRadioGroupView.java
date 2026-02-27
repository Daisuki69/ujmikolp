package com.paymaya.common.widget;

import Ad.a;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RadioGroup;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class MayaRadioGroupView extends RadioGroup {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MayaRadioOptionView f11282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RadioGroup.OnCheckedChangeListener f11283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaRadioGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.g(context, "context");
    }

    @Override // android.widget.RadioGroup
    public final void check(int i) {
        if (i == -1) {
            MayaRadioOptionView mayaRadioOptionView = this.f11282a;
            if (mayaRadioOptionView != null) {
                mayaRadioOptionView.setChecked(false);
            }
            this.f11282a = null;
            return;
        }
        MayaRadioOptionView mayaRadioOptionView2 = this.f11282a;
        if (mayaRadioOptionView2 == null || mayaRadioOptionView2.getId() != i) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt instanceof MayaRadioOptionView) {
                    MayaRadioOptionView mayaRadioOptionView3 = (MayaRadioOptionView) childAt;
                    if (mayaRadioOptionView3.getRadioButton().getId() == i) {
                        MayaRadioOptionView mayaRadioOptionView4 = this.f11282a;
                        if (mayaRadioOptionView4 != null) {
                            mayaRadioOptionView4.setChecked(false);
                        }
                        this.f11282a = mayaRadioOptionView3;
                        if (mayaRadioOptionView3 != null) {
                            mayaRadioOptionView3.setChecked(true);
                        }
                        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f11283b;
                        if (onCheckedChangeListener != null) {
                            onCheckedChangeListener.onCheckedChanged(this, i);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // android.widget.RadioGroup
    public int getCheckedRadioButtonId() {
        MayaRadioOptionView mayaRadioOptionView = this.f11282a;
        if (mayaRadioOptionView != null) {
            return mayaRadioOptionView.getId();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MayaRadioOptionView) {
            MayaRadioOptionView mayaRadioOptionView = (MayaRadioOptionView) view;
            mayaRadioOptionView.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
            if (mayaRadioOptionView.getRadioButton().getId() == -1) {
                mayaRadioOptionView.getRadioButton().setId(View.generateViewId());
            }
            if (mayaRadioOptionView.getId() == -1) {
                mayaRadioOptionView.setId(View.generateViewId());
            }
            mayaRadioOptionView.setOnClickListener(new a(5, this, (MayaRadioOptionView) view));
        }
    }

    @Override // android.widget.RadioGroup
    public void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11283b = onCheckedChangeListener;
    }
}
