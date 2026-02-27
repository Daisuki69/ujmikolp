package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.e;
import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class EDDBankInformationFragment_ViewBinding extends AbstractBaseEDDFormFragmentImpl_ViewBinding {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EDDBankInformationFragment f14531d;
    public View e;

    @UiThread
    public EDDBankInformationFragment_ViewBinding(EDDBankInformationFragment eDDBankInformationFragment, View view) {
        super(eDDBankInformationFragment, view);
        this.f14531d = eDDBankInformationFragment;
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.add_item_layout_pma_fragment_edd_form, "method 'onAddIncomeSourceClicked'");
        this.e = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(eDDBankInformationFragment, 9));
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl_ViewBinding, butterknife.Unbinder
    public final void unbind() {
        if (this.f14531d == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14531d = null;
        this.e.setOnClickListener(null);
        this.e = null;
        super.unbind();
    }
}
