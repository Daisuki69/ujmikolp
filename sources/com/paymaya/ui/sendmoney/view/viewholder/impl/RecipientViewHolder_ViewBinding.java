package com.paymaya.ui.sendmoney.view.viewholder.impl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class RecipientViewHolder_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecipientViewHolder f14773a;

    @UiThread
    public RecipientViewHolder_ViewBinding(RecipientViewHolder recipientViewHolder, View view) {
        this.f14773a = recipientViewHolder;
        recipientViewHolder.mTextViewRecipientItemContactName = (TextView) Utils.findRequiredViewAsType(view, R.id.contact_name_text_view_pma_view_send_money_recipient_item, "field 'mTextViewRecipientItemContactName'", TextView.class);
        recipientViewHolder.mTextViewRecipientItemType = (TextView) Utils.findRequiredViewAsType(view, R.id.type_text_view_pma_view_send_money_recipient_item, "field 'mTextViewRecipientItemType'", TextView.class);
        recipientViewHolder.mTextViewRecipientItemMobileNumber = (TextView) Utils.findRequiredViewAsType(view, R.id.mobile_number_text_view_pma_view_send_money_recipient_item, "field 'mTextViewRecipientItemMobileNumber'", TextView.class);
        recipientViewHolder.mTextViewRecipientRecentIndicator = (TextView) Utils.findRequiredViewAsType(view, R.id.recent_indicator_text_view_pma_view_send_money_recipient_item, "field 'mTextViewRecipientRecentIndicator'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        RecipientViewHolder recipientViewHolder = this.f14773a;
        if (recipientViewHolder == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14773a = null;
        recipientViewHolder.mTextViewRecipientItemContactName = null;
        recipientViewHolder.mTextViewRecipientItemType = null;
        recipientViewHolder.mTextViewRecipientItemMobileNumber = null;
        recipientViewHolder.mTextViewRecipientRecentIndicator = null;
    }
}
