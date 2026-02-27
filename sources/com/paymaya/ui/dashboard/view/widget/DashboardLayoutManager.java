package com.paymaya.ui.dashboard.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public class DashboardLayoutManager extends LinearLayoutManager {
    public DashboardLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
