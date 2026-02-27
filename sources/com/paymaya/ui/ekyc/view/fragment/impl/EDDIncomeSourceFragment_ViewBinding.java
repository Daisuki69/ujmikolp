package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.e;
import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class EDDIncomeSourceFragment_ViewBinding extends AbstractBaseEDDFormFragmentImpl_ViewBinding {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EDDIncomeSourceFragment f14538d;
    public View e;

    @UiThread
    public EDDIncomeSourceFragment_ViewBinding(EDDIncomeSourceFragment eDDIncomeSourceFragment, View view) {
        super(eDDIncomeSourceFragment, view);
        this.f14538d = eDDIncomeSourceFragment;
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.add_item_layout_pma_fragment_edd_form, "method 'onAddIncomeSourceClicked'");
        this.e = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(eDDIncomeSourceFragment, 11));
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl_ViewBinding, butterknife.Unbinder
    public final void unbind() {
        if (this.f14538d == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14538d = null;
        this.e.setOnClickListener(null);
        this.e = null;
        super.unbind();
    }
}
