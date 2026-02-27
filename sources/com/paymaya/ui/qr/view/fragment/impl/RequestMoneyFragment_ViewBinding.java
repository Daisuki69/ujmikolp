package com.paymaya.ui.qr.view.fragment.impl;

import Bd.e;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneyFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RequestMoneyFragment f14716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14717b;

    @UiThread
    public RequestMoneyFragment_ViewBinding(RequestMoneyFragment requestMoneyFragment, View view) {
        this.f14716a = requestMoneyFragment;
        requestMoneyFragment.mTextInputLayoutAmount = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.amount_text_input_layout_pma_fragment_request_money, "field 'mTextInputLayoutAmount'", TextInputLayout.class);
        requestMoneyFragment.mEditTextAmount = (EditText) Utils.findRequiredViewAsType(view, R.id.amount_edit_text_pma_fragment_request_money, "field 'mEditTextAmount'", EditText.class);
        requestMoneyFragment.mEditTextMessage = (EditText) Utils.findRequiredViewAsType(view, R.id.message_edit_text_pma_fragment_request_money, "field 'mEditTextMessage'", EditText.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.continue_button_pma_fragment_request_money, "field 'mButtonContinue' and method 'onContinueClicked'");
        requestMoneyFragment.mButtonContinue = (Button) Utils.castView(viewFindRequiredView, R.id.continue_button_pma_fragment_request_money, "field 'mButtonContinue'", Button.class);
        this.f14717b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(requestMoneyFragment, 6));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        RequestMoneyFragment requestMoneyFragment = this.f14716a;
        if (requestMoneyFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14716a = null;
        requestMoneyFragment.mTextInputLayoutAmount = null;
        requestMoneyFragment.mEditTextAmount = null;
        requestMoneyFragment.mEditTextMessage = null;
        requestMoneyFragment.mButtonContinue = null;
        this.f14717b.setOnClickListener(null);
        this.f14717b = null;
    }
}
