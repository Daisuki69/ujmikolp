package com.paymaya.ui.qr.view.fragment.impl;

import G5.InterfaceC0254d;
import com.paymaya.R;
import com.paymaya.common.utility.C;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements InterfaceC0254d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RequestMoneyFragment f14760a;

    public b(RequestMoneyFragment requestMoneyFragment) {
        this.f14760a = requestMoneyFragment;
    }

    @Override // G5.InterfaceC0254d
    public final void T() {
        RequestMoneyFragment requestMoneyFragment = this.f14760a;
        if (C.e(requestMoneyFragment.mTextInputLayoutAmount.getError())) {
            requestMoneyFragment.mTextInputLayoutAmount.setErrorEnabled(true);
            requestMoneyFragment.mTextInputLayoutAmount.setError(requestMoneyFragment.getString(R.string.pma_label_minimum_n_maximum_n, "0", Double.valueOf(50000.0d).toString()));
            requestMoneyFragment.mButtonContinue.setEnabled(false);
        }
    }

    @Override // G5.InterfaceC0254d
    public final void u() {
        RequestMoneyFragment requestMoneyFragment = this.f14760a;
        requestMoneyFragment.mTextInputLayoutAmount.setError(null);
        requestMoneyFragment.mTextInputLayoutAmount.setErrorEnabled(false);
        requestMoneyFragment.mButtonContinue.setEnabled(true);
    }
}
