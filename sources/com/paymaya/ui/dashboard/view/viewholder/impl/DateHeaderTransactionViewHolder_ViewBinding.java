package com.paymaya.ui.dashboard.view.viewholder.impl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class DateHeaderTransactionViewHolder_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateHeaderTransactionViewHolder f14471a;

    @UiThread
    public DateHeaderTransactionViewHolder_ViewBinding(DateHeaderTransactionViewHolder dateHeaderTransactionViewHolder, View view) {
        this.f14471a = dateHeaderTransactionViewHolder;
        dateHeaderTransactionViewHolder.mTextViewDate = (TextView) Utils.findRequiredViewAsType(view, R.id.text_view_date_pma_view_date_header_view_all, "field 'mTextViewDate'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        DateHeaderTransactionViewHolder dateHeaderTransactionViewHolder = this.f14471a;
        if (dateHeaderTransactionViewHolder == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14471a = null;
        dateHeaderTransactionViewHolder.mTextViewDate = null;
    }
}
