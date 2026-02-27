package com.paymaya.ui.qr.view.dialog.impl;

import O5.a;
import Q6.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.base.BaseDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneyInstructionDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public l f14660R;

    @OnClick({R.id.close_image_view_pma_dialog_request_money_instruction})
    public void onCloseClick() {
        dismiss();
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10244Q = true;
        this.f10243P.r(EnumC1216e.REQUEST_MONEY_INSTRUCTION);
        a aVar = (a) W4.a.e().E().c;
        this.f10241B = (C1220i) aVar.f4716g.get();
        l lVar = new l(21);
        this.f14660R = lVar;
        lVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_dialog_fragment_request_money_instruction, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14660R.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        dialog.getWindow().setLayout(-1, -2);
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getDialog() != null) {
            getDialog().setCanceledOnTouchOutside(false);
        }
        this.f14660R.j();
    }
}
