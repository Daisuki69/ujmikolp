package com.paymaya.ui.ekyc.view.activity.impl;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import com.paymaya.ui.travel.view.widget.StepProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDActivity f14497a;

    @UiThread
    public EDDActivity_ViewBinding(EDDActivity eDDActivity, View view) {
        this.f14497a = eDDActivity;
        eDDActivity.mStepProgressBar = (StepProgressBar) Utils.findRequiredViewAsType(view, R.id.step_progress_bar_pma_activity_edd, "field 'mStepProgressBar'", StepProgressBar.class);
        eDDActivity.mViewPager = (ViewPager2) Utils.findRequiredViewAsType(view, R.id.view_pager_pma_activity_edd, "field 'mViewPager'", ViewPager2.class);
        eDDActivity.mFrameLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.fragment_container_frame_layout_pma_activity_edd, "field 'mFrameLayout'", FrameLayout.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDActivity eDDActivity = this.f14497a;
        if (eDDActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14497a = null;
        eDDActivity.mStepProgressBar = null;
        eDDActivity.mViewPager = null;
        eDDActivity.mFrameLayout = null;
    }
}
