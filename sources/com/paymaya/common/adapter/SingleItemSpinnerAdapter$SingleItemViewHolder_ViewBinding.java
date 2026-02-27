package com.paymaya.common.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes3.dex */
public class SingleItemSpinnerAdapter$SingleItemViewHolder_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleItemSpinnerAdapter$SingleItemViewHolder f10230a;

    @UiThread
    public SingleItemSpinnerAdapter$SingleItemViewHolder_ViewBinding(SingleItemSpinnerAdapter$SingleItemViewHolder singleItemSpinnerAdapter$SingleItemViewHolder, View view) {
        this.f10230a = singleItemSpinnerAdapter$SingleItemViewHolder;
        singleItemSpinnerAdapter$SingleItemViewHolder.mTextViewItem = (TextView) Utils.findRequiredViewAsType(view, R.id.pma_view_spinner_single_item_text_view_item, "field 'mTextViewItem'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        SingleItemSpinnerAdapter$SingleItemViewHolder singleItemSpinnerAdapter$SingleItemViewHolder = this.f10230a;
        if (singleItemSpinnerAdapter$SingleItemViewHolder == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f10230a = null;
        singleItemSpinnerAdapter$SingleItemViewHolder.mTextViewItem = null;
    }
}
