package com.paymaya.ui.sendmoney.view.viewholder.impl;

import android.widget.TextView;
import butterknife.BindView;
import com.paymaya.R;
import com.paymaya.domain.store.T;

/* JADX INFO: loaded from: classes4.dex */
public class RecipientViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f14771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14772b;
    public int c;

    @BindView(R.id.contact_name_text_view_pma_view_send_money_recipient_item)
    TextView mTextViewRecipientItemContactName;

    @BindView(R.id.mobile_number_text_view_pma_view_send_money_recipient_item)
    TextView mTextViewRecipientItemMobileNumber;

    @BindView(R.id.type_text_view_pma_view_send_money_recipient_item)
    TextView mTextViewRecipientItemType;

    @BindView(R.id.recent_indicator_text_view_pma_view_send_money_recipient_item)
    TextView mTextViewRecipientRecentIndicator;

    public final void a(String str) {
        this.mTextViewRecipientItemContactName.setText(str);
    }

    public final void b() {
        this.mTextViewRecipientItemContactName.setTextColor(this.f14772b);
    }

    public final void c() {
        this.mTextViewRecipientItemContactName.setTextColor(this.c);
    }

    public final void d() {
        this.mTextViewRecipientItemContactName.setVisibility(8);
    }

    public final void e() {
        this.mTextViewRecipientItemContactName.setVisibility(0);
    }

    public final void f(String str) {
        this.mTextViewRecipientItemMobileNumber.setText(str);
    }

    public final void g() {
        this.mTextViewRecipientItemMobileNumber.setTextColor(this.f14772b);
    }

    public final void h() {
        this.mTextViewRecipientItemMobileNumber.setTextColor(this.c);
    }

    public final void i() {
        this.mTextViewRecipientRecentIndicator.setVisibility(8);
    }

    public final void j() {
        this.mTextViewRecipientRecentIndicator.setVisibility(0);
    }

    public final void k(String str) {
        this.mTextViewRecipientItemType.setText(str);
    }

    public final void l() {
        this.mTextViewRecipientItemType.setTextColor(this.f14772b);
    }

    public final void m() {
        this.mTextViewRecipientItemType.setTextColor(this.c);
    }

    public final void n() {
        this.mTextViewRecipientItemType.setVisibility(8);
    }

    public final void o() {
        this.mTextViewRecipientItemType.setVisibility(0);
    }
}
