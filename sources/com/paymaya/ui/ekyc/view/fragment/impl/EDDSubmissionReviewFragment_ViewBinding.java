package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.e;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class EDDSubmissionReviewFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDSubmissionReviewFragment f14554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14555b;

    @UiThread
    public EDDSubmissionReviewFragment_ViewBinding(EDDSubmissionReviewFragment eDDSubmissionReviewFragment, View view) {
        this.f14554a = eDDSubmissionReviewFragment;
        eDDSubmissionReviewFragment.mPrimaryUsageTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.primary_usage_text_view_pma_fragment_edd_submission_review, "field 'mPrimaryUsageTextView'", TextView.class);
        eDDSubmissionReviewFragment.mRemittanceTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.remittance_text_view_pma_fragment_edd_submission_review, "field 'mRemittanceTextView'", TextView.class);
        eDDSubmissionReviewFragment.mPurposeTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.purpose_text_view_pma_fragment_edd_submission_review, "field 'mPurposeTextView'", TextView.class);
        eDDSubmissionReviewFragment.mPrimaryUsageOptionalGroup = (Group) Utils.findRequiredViewAsType(view, R.id.account_usage_optional_group_view_pma_fragment_edd_submission_review, "field 'mPrimaryUsageOptionalGroup'", Group.class);
        eDDSubmissionReviewFragment.mIncomeSourceTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.income_source_text_view_pma_fragment_edd_submission_review, "field 'mIncomeSourceTextView'", TextView.class);
        eDDSubmissionReviewFragment.mRelatedCompaniesTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.related_companies_text_view_pma_fragment_edd_submission_review, "field 'mRelatedCompaniesTextView'", TextView.class);
        eDDSubmissionReviewFragment.mBankInformationTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.bank_information_text_view_pma_fragment_edd_submission_review, "field 'mBankInformationTextView'", TextView.class);
        eDDSubmissionReviewFragment.mFinancialDocumentsLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.financial_documents_photo_linear_layout_pma_fragment_edd_submission_review, "field 'mFinancialDocumentsLayout'", LinearLayout.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.next_button_pma_fragment_pma_fragment_edd_submission_review, "method 'onNextClicked'");
        this.f14555b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(eDDSubmissionReviewFragment, 14));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDSubmissionReviewFragment eDDSubmissionReviewFragment = this.f14554a;
        if (eDDSubmissionReviewFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14554a = null;
        eDDSubmissionReviewFragment.mPrimaryUsageTextView = null;
        eDDSubmissionReviewFragment.mRemittanceTextView = null;
        eDDSubmissionReviewFragment.mPurposeTextView = null;
        eDDSubmissionReviewFragment.mPrimaryUsageOptionalGroup = null;
        eDDSubmissionReviewFragment.mIncomeSourceTextView = null;
        eDDSubmissionReviewFragment.mRelatedCompaniesTextView = null;
        eDDSubmissionReviewFragment.mBankInformationTextView = null;
        eDDSubmissionReviewFragment.mFinancialDocumentsLayout = null;
        this.f14555b.setOnClickListener(null);
        this.f14555b = null;
    }
}
