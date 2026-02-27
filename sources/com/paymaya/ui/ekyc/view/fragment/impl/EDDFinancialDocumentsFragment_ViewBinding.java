package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.e;
import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class EDDFinancialDocumentsFragment_ViewBinding extends AbstractBaseEDDFormFragmentImpl_ViewBinding {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EDDFinancialDocumentsFragment f14535d;
    public View e;

    @UiThread
    public EDDFinancialDocumentsFragment_ViewBinding(EDDFinancialDocumentsFragment eDDFinancialDocumentsFragment, View view) {
        super(eDDFinancialDocumentsFragment, view);
        this.f14535d = eDDFinancialDocumentsFragment;
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.add_item_layout_pma_fragment_edd_form, "method 'onAddCompanyClick'");
        this.e = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(eDDFinancialDocumentsFragment, 10));
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl_ViewBinding, butterknife.Unbinder
    public final void unbind() {
        if (this.f14535d == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14535d = null;
        this.e.setOnClickListener(null);
        this.e = null;
        super.unbind();
    }
}
