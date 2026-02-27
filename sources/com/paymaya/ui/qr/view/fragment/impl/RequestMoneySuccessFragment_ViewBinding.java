package com.paymaya.ui.qr.view.fragment.impl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import de.v;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneySuccessFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RequestMoneySuccessFragment f14720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14721b;
    public View c;

    @UiThread
    public RequestMoneySuccessFragment_ViewBinding(RequestMoneySuccessFragment requestMoneySuccessFragment, View view) {
        this.f14720a = requestMoneySuccessFragment;
        requestMoneySuccessFragment.mTextViewAmount = (TextView) Utils.findRequiredViewAsType(view, R.id.amount_text_view_pma_fragment_request_money_success, "field 'mTextViewAmount'", TextView.class);
        requestMoneySuccessFragment.mTextViewMessage = (TextView) Utils.findRequiredViewAsType(view, R.id.message_text_view_pma_fragment_request_money_success, "field 'mTextViewMessage'", TextView.class);
        requestMoneySuccessFragment.mGroupMessage = (Group) Utils.findRequiredViewAsType(view, R.id.message_group_pma_fragment_request_money_success, "field 'mGroupMessage'", Group.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.share_view_group_pma_fragment_request_money_success, "method 'onShareClick'");
        this.f14721b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new v(requestMoneySuccessFragment, 0));
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.back_to_home_view_group_pma_fragment_request_money_success, "method 'onBackToHomeClick'");
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new v(requestMoneySuccessFragment, 1));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        RequestMoneySuccessFragment requestMoneySuccessFragment = this.f14720a;
        if (requestMoneySuccessFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14720a = null;
        requestMoneySuccessFragment.mTextViewAmount = null;
        requestMoneySuccessFragment.mTextViewMessage = null;
        requestMoneySuccessFragment.mGroupMessage = null;
        this.f14721b.setOnClickListener(null);
        this.f14721b = null;
        this.c.setOnClickListener(null);
        this.c = null;
    }
}
