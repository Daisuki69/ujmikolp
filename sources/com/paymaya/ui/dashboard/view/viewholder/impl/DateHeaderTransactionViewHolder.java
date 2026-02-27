package com.paymaya.ui.dashboard.view.viewholder.impl;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.paymaya.R;
import com.paymaya.domain.store.M;

/* JADX INFO: loaded from: classes4.dex */
public class DateHeaderTransactionViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M f14469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f14470b;

    @BindView(R.id.text_view_date_pma_view_date_header_view_all)
    TextView mTextViewDate;

    public final void D(String str) {
        this.mTextViewDate.setText(str);
    }
}
