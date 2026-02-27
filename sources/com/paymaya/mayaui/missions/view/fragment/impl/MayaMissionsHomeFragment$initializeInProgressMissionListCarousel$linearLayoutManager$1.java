package com.paymaya.mayaui.missions.view.fragment.impl;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaMissionsHomeFragment$initializeInProgressMissionListCarousel$linearLayoutManager$1 extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        j.g(layoutParams, "layoutParams");
        if (getItemCount() > 1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) (((double) getWidth()) * 0.875d);
        }
        return true;
    }
}
