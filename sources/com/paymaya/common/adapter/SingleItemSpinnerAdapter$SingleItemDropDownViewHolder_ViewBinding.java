package com.paymaya.common.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes3.dex */
public class SingleItemSpinnerAdapter$SingleItemDropDownViewHolder_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleItemSpinnerAdapter$SingleItemDropDownViewHolder f10229a;

    @UiThread
    public SingleItemSpinnerAdapter$SingleItemDropDownViewHolder_ViewBinding(SingleItemSpinnerAdapter$SingleItemDropDownViewHolder singleItemSpinnerAdapter$SingleItemDropDownViewHolder, View view) {
        this.f10229a = singleItemSpinnerAdapter$SingleItemDropDownViewHolder;
        singleItemSpinnerAdapter$SingleItemDropDownViewHolder.mTextViewItem = (TextView) Utils.findRequiredViewAsType(view, R.id.pma_view_spinner_single_item_drop_down_text_view_item, "field 'mTextViewItem'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        SingleItemSpinnerAdapter$SingleItemDropDownViewHolder singleItemSpinnerAdapter$SingleItemDropDownViewHolder = this.f10229a;
        if (singleItemSpinnerAdapter$SingleItemDropDownViewHolder == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f10229a = null;
        singleItemSpinnerAdapter$SingleItemDropDownViewHolder.mTextViewItem = null;
    }
}
