package com.paymaya.mayaui.kyczoloz.view.widget;

import M8.C0332a;
import M8.T2;
import N5.C0447e;
import O8.a;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompleteYourMayaExperienceFragment;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ExpandableBenefitsRecyclerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f12662d;
    public final C0447e e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableBenefitsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        LayoutInflater.from(context).inflate(R.layout.maya_expandable_recycler_view, this);
        int i = R.id.maya_kyc_benefits_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(this, R.id.maya_kyc_benefits_recycler_view);
        if (recyclerView != null) {
            i = R.id.maya_kyc_chevron_image_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(this, R.id.maya_kyc_chevron_image_view);
            if (imageView != null) {
                i = R.id.maya_kyc_chevron_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(this, R.id.maya_kyc_chevron_text_view);
                if (textView != null) {
                    i = R.id.maya_kyc_expand_linear_layout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(this, R.id.maya_kyc_expand_linear_layout);
                    if (linearLayout != null) {
                        this.e = new C0447e(this, recyclerView, imageView, textView, linearLayout);
                        C.r0(linearLayout, new C0332a(this, 20));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    public static Unit b(ExpandableBenefitsRecyclerView expandableBenefitsRecyclerView) {
        expandableBenefitsRecyclerView.setExpanded(!expandableBenefitsRecyclerView.f);
        a aVar = expandableBenefitsRecyclerView.f12662d;
        if (aVar != null) {
            MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment = (MayaKycCompleteYourMayaExperienceFragment) aVar;
            if (expandableBenefitsRecyclerView.f) {
                String string = mayaKycCompleteYourMayaExperienceFragment.getString(R.string.maya_kyc_complete_your_maya_experience_expand_benefits);
                j.f(string, "getString(...)");
                T2.Q(mayaKycCompleteYourMayaExperienceFragment, string, null, null, 14);
            } else {
                String string2 = mayaKycCompleteYourMayaExperienceFragment.getString(R.string.maya_kyc_complete_your_maya_experience_collapse_benefits);
                j.f(string2, "getString(...)");
                T2.Q(mayaKycCompleteYourMayaExperienceFragment, string2, null, null, 14);
            }
        }
        return Unit.f18162a;
    }

    private final void setExpanded(boolean z4) {
        C0447e c0447e = this.e;
        if (z4) {
            ((TextView) c0447e.f).setText(getResources().getText(R.string.maya_kyc_complete_your_maya_experience_collapse_benefits));
            ((ImageView) c0447e.e).setImageResource(R.drawable.maya_ic_chevron_up_green);
            ((RecyclerView) c0447e.f4080d).getLayoutParams().height = -2;
        } else {
            ((TextView) c0447e.f).setText(getResources().getText(R.string.maya_kyc_complete_your_maya_experience_expand_benefits));
            ((ImageView) c0447e.e).setImageResource(R.drawable.maya_ic_chevron_down_green);
            ((RecyclerView) c0447e.f4080d).getLayoutParams().height = (int) getResources().getDimension(R.dimen.maya_kyc_complete_your_maya_experience_benefits_view_holder_height);
        }
        this.f = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setListHideExpandListener(a listener) {
        j.g(listener, "listener");
        this.f12662d = listener;
    }
}
