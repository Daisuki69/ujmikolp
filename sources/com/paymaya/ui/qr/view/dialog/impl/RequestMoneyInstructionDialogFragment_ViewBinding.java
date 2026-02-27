package com.paymaya.ui.qr.view.dialog.impl;

import Bd.e;
import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneyInstructionDialogFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RequestMoneyInstructionDialogFragment f14661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14662b;

    @UiThread
    public RequestMoneyInstructionDialogFragment_ViewBinding(RequestMoneyInstructionDialogFragment requestMoneyInstructionDialogFragment, View view) {
        this.f14661a = requestMoneyInstructionDialogFragment;
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.close_image_view_pma_dialog_request_money_instruction, "method 'onCloseClick'");
        this.f14662b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(requestMoneyInstructionDialogFragment, 5));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        if (this.f14661a == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14661a = null;
        this.f14662b.setOnClickListener(null);
        this.f14662b = null;
    }
}
