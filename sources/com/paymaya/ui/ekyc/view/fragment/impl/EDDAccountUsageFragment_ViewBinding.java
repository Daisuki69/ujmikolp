package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.d;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import zd.C2561e;

/* JADX INFO: loaded from: classes4.dex */
public class EDDAccountUsageFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDAccountUsageFragment f14517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14518b;
    public View c;

    @UiThread
    public EDDAccountUsageFragment_ViewBinding(EDDAccountUsageFragment eDDAccountUsageFragment, View view) {
        this.f14517a = eDDAccountUsageFragment;
        eDDAccountUsageFragment.mPrimaryUseTextInputLayout = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_account_usage_primary_use_text_input_layout, "field 'mPrimaryUseTextInputLayout'", TextInputLayout.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.pma_fragment_edd_account_usage_primary_use_edit_text, "field 'mPrimaryUseEditText', method 'onPrimaryUseClicked', and method 'onPrimaryUseFocusChanged'");
        eDDAccountUsageFragment.mPrimaryUseEditText = (TextInputEditText) Utils.castView(viewFindRequiredView, R.id.pma_fragment_edd_account_usage_primary_use_edit_text, "field 'mPrimaryUseEditText'", TextInputEditText.class);
        this.f14518b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new C2561e(eDDAccountUsageFragment, 0));
        viewFindRequiredView.setOnFocusChangeListener(new d(eDDAccountUsageFragment, 2));
        eDDAccountUsageFragment.mPrimaryUseOtherTextInputLayout = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_account_usage_primary_use_other_text_input_layout, "field 'mPrimaryUseOtherTextInputLayout'", TextInputLayout.class);
        eDDAccountUsageFragment.mPrimaryUseOtherEditText = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_account_usage_primary_use_other_edit_text, "field 'mPrimaryUseOtherEditText'", TextInputEditText.class);
        eDDAccountUsageFragment.mRemittanceTextInputLayout = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_account_usage_remittance_text_input_layout, "field 'mRemittanceTextInputLayout'", TextInputLayout.class);
        eDDAccountUsageFragment.mRemittanceEditText = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_account_usage_remittance_edit_text, "field 'mRemittanceEditText'", TextInputEditText.class);
        eDDAccountUsageFragment.mPurposeTextInputLayout = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_account_usage_purpose_text_input_layout, "field 'mPurposeTextInputLayout'", TextInputLayout.class);
        eDDAccountUsageFragment.mPurposeEditText = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_account_usage_purpose_edit_text, "field 'mPurposeEditText'", TextInputEditText.class);
        eDDAccountUsageFragment.mRemittanceGroup = (Group) Utils.findRequiredViewAsType(view, R.id.pma_fragment_edd_account_usage_remittance_group, "field 'mRemittanceGroup'", Group.class);
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.pma_fragment_edd_account_usage_next, "method 'onNextClicked'");
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new C2561e(eDDAccountUsageFragment, 1));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDAccountUsageFragment eDDAccountUsageFragment = this.f14517a;
        if (eDDAccountUsageFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14517a = null;
        eDDAccountUsageFragment.mPrimaryUseTextInputLayout = null;
        eDDAccountUsageFragment.mPrimaryUseEditText = null;
        eDDAccountUsageFragment.mPrimaryUseOtherTextInputLayout = null;
        eDDAccountUsageFragment.mPrimaryUseOtherEditText = null;
        eDDAccountUsageFragment.mRemittanceTextInputLayout = null;
        eDDAccountUsageFragment.mRemittanceEditText = null;
        eDDAccountUsageFragment.mPurposeTextInputLayout = null;
        eDDAccountUsageFragment.mPurposeEditText = null;
        eDDAccountUsageFragment.mRemittanceGroup = null;
        this.f14518b.setOnClickListener(null);
        this.f14518b.setOnFocusChangeListener(null);
        this.f14518b = null;
        this.c.setOnClickListener(null);
        this.c = null;
    }
}
