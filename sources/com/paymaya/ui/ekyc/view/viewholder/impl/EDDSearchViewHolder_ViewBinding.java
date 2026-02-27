package com.paymaya.ui.ekyc.view.viewholder.impl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDSearchViewHolder_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDSearchViewHolder f14595a;

    @UiThread
    public EDDSearchViewHolder_ViewBinding(EDDSearchViewHolder eDDSearchViewHolder, View view) {
        this.f14595a = eDDSearchViewHolder;
        eDDSearchViewHolder.mItemTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.pma_item_edd_search_item_text, "field 'mItemTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDSearchViewHolder eDDSearchViewHolder = this.f14595a;
        if (eDDSearchViewHolder == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14595a = null;
        eDDSearchViewHolder.mItemTextView = null;
    }
}
