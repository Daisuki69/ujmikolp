package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.e;
import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class EDDRelatedCompaniesFragment_ViewBinding extends AbstractBaseEDDFormFragmentImpl_ViewBinding {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EDDRelatedCompaniesFragment f14545d;
    public View e;

    @UiThread
    public EDDRelatedCompaniesFragment_ViewBinding(EDDRelatedCompaniesFragment eDDRelatedCompaniesFragment, View view) {
        super(eDDRelatedCompaniesFragment, view);
        this.f14545d = eDDRelatedCompaniesFragment;
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.add_item_layout_pma_fragment_edd_form, "method 'onAddCompanyClick'");
        this.e = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(eDDRelatedCompaniesFragment, 13));
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl_ViewBinding, butterknife.Unbinder
    public final void unbind() {
        if (this.f14545d == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14545d = null;
        this.e.setOnClickListener(null);
        this.e = null;
        super.unbind();
    }
}
