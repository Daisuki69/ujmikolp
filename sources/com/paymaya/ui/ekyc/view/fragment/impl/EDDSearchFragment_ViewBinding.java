package com.paymaya.ui.ekyc.view.fragment.impl;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class EDDSearchFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDSearchFragment f14551a;

    @UiThread
    public EDDSearchFragment_ViewBinding(EDDSearchFragment eDDSearchFragment, View view) {
        this.f14551a = eDDSearchFragment;
        eDDSearchFragment.mSearchRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_search_list, "field 'mSearchRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDSearchFragment eDDSearchFragment = this.f14551a;
        if (eDDSearchFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14551a = null;
        eDDSearchFragment.mSearchRecyclerView = null;
    }
}
