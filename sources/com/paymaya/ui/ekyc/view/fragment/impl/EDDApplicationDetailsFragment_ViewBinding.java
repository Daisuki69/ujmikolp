package com.paymaya.ui.ekyc.view.fragment.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import zd.C2563g;

/* JADX INFO: loaded from: classes4.dex */
public class EDDApplicationDetailsFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EDDApplicationDetailsFragment f14521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14522b;
    public View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f14523d;
    public View e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f14524g;
    public View h;
    public View i;
    public View j;

    @UiThread
    public EDDApplicationDetailsFragment_ViewBinding(EDDApplicationDetailsFragment eDDApplicationDetailsFragment, View view) {
        this.f14521a = eDDApplicationDetailsFragment;
        eDDApplicationDetailsFragment.mTextViewName = (TextView) Utils.findRequiredViewAsType(view, R.id.name_text_view_pma_fragment_edd_application_details, "field 'mTextViewName'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewNationality = (TextView) Utils.findRequiredViewAsType(view, R.id.nationality_text_view_pma_fragment_edd_application_details, "field 'mTextViewNationality'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewBirthDate = (TextView) Utils.findRequiredViewAsType(view, R.id.birth_date_text_view_pma_fragment_edd_application_details, "field 'mTextViewBirthDate'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewBirthPlace = (TextView) Utils.findRequiredViewAsType(view, R.id.birth_place_text_view_pma_fragment_edd_application_details, "field 'mTextViewBirthPlace'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewIncomeSource = (TextView) Utils.findRequiredViewAsType(view, R.id.income_source_text_view_pma_fragment_edd_application_details, "field 'mTextViewIncomeSource'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewWorkNature = (TextView) Utils.findRequiredViewAsType(view, R.id.work_nature_text_view_pma_fragment_edd_application_details, "field 'mTextViewWorkNature'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewPresentAddress = (TextView) Utils.findRequiredViewAsType(view, R.id.present_address_text_view_pma_fragment_edd_application_details, "field 'mTextViewPresentAddress'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewPermanentAddress = (TextView) Utils.findRequiredViewAsType(view, R.id.permanent_address_text_view_pma_fragment_edd_application_details, "field 'mTextViewPermanentAddress'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewIdTypeLabelFirstId = (TextView) Utils.findRequiredViewAsType(view, R.id.id_type_label_text_view_pma_view_application_details_first_id, "field 'mTextViewIdTypeLabelFirstId'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewIdTypeFirstId = (TextView) Utils.findRequiredViewAsType(view, R.id.id_type_text_view_pma_view_application_details_first_id, "field 'mTextViewIdTypeFirstId'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewIdNumberFirstId = (TextView) Utils.findRequiredViewAsType(view, R.id.id_number_text_view_pma_view_application_details_first_id, "field 'mTextViewIdNumberFirstId'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewIdExpiryLabelFirstId = (TextView) Utils.findRequiredViewAsType(view, R.id.id_expiration_date_label_text_view_pma_view_application_details_first_id, "field 'mTextViewIdExpiryLabelFirstId'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewIdExpiryFirstId = (TextView) Utils.findRequiredViewAsType(view, R.id.id_expiration_date_text_view_pma_view_application_details_first_id, "field 'mTextViewIdExpiryFirstId'", TextView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.id_photo_image_view_pma_view_application_details_first_id, "field 'mImageViewIdPhotoFirstId' and method 'onFirstIdClicked'");
        eDDApplicationDetailsFragment.mImageViewIdPhotoFirstId = (ImageView) Utils.castView(viewFindRequiredView, R.id.id_photo_image_view_pma_view_application_details_first_id, "field 'mImageViewIdPhotoFirstId'", ImageView.class);
        this.f14522b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new C2563g(eDDApplicationDetailsFragment, 0));
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.back_id_photo_image_view_pma_view_application_details_first_id, "field 'mImageViewBackIdPhotoFirst' and method 'onFirstIdBackClicked'");
        eDDApplicationDetailsFragment.mImageViewBackIdPhotoFirst = (ImageView) Utils.castView(viewFindRequiredView2, R.id.back_id_photo_image_view_pma_view_application_details_first_id, "field 'mImageViewBackIdPhotoFirst'", ImageView.class);
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new C2563g(eDDApplicationDetailsFragment, 1));
        eDDApplicationDetailsFragment.mViewGroupSecondId = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.second_id_view_group_pma_fragment_edd_application_details, "field 'mViewGroupSecondId'", ViewGroup.class);
        eDDApplicationDetailsFragment.mTextViewIdTypeSecondId = (TextView) Utils.findRequiredViewAsType(view, R.id.id_type_text_view_pma_view_application_details_second_id, "field 'mTextViewIdTypeSecondId'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewIdNumberSecondId = (TextView) Utils.findRequiredViewAsType(view, R.id.id_number_text_view_pma_view_application_details_second_id, "field 'mTextViewIdNumberSecondId'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewIdExpiryLabelSecondId = (TextView) Utils.findRequiredViewAsType(view, R.id.id_expiration_date_label_text_view_pma_view_application_details_second_id, "field 'mTextViewIdExpiryLabelSecondId'", TextView.class);
        eDDApplicationDetailsFragment.mTextViewIdExpirySecondId = (TextView) Utils.findRequiredViewAsType(view, R.id.id_expiration_date_text_view_pma_view_application_details_second_id, "field 'mTextViewIdExpirySecondId'", TextView.class);
        View viewFindRequiredView3 = Utils.findRequiredView(view, R.id.id_photo_image_view_pma_view_application_details_second_id, "field 'mImageViewIdPhotoSecondId' and method 'onSecondIdClicked'");
        eDDApplicationDetailsFragment.mImageViewIdPhotoSecondId = (ImageView) Utils.castView(viewFindRequiredView3, R.id.id_photo_image_view_pma_view_application_details_second_id, "field 'mImageViewIdPhotoSecondId'", ImageView.class);
        this.f14523d = viewFindRequiredView3;
        viewFindRequiredView3.setOnClickListener(new C2563g(eDDApplicationDetailsFragment, 2));
        View viewFindRequiredView4 = Utils.findRequiredView(view, R.id.back_id_photo_image_view_pma_view_application_details_second_id, "field 'mImageViewBackIdPhotoSecond' and method 'onSecondIdBackClicked'");
        eDDApplicationDetailsFragment.mImageViewBackIdPhotoSecond = (ImageView) Utils.castView(viewFindRequiredView4, R.id.back_id_photo_image_view_pma_view_application_details_second_id, "field 'mImageViewBackIdPhotoSecond'", ImageView.class);
        this.e = viewFindRequiredView4;
        viewFindRequiredView4.setOnClickListener(new C2563g(eDDApplicationDetailsFragment, 3));
        eDDApplicationDetailsFragment.mViewGroupBirthCertificate = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.birth_certificate_view_group_pma_fragment_edd_application_details, "field 'mViewGroupBirthCertificate'", ViewGroup.class);
        View viewFindRequiredView5 = Utils.findRequiredView(view, R.id.birth_certificate_image_view_pma_view_application_details_birth_certificate, "field 'mImageViewBirthCertificate' and method 'onViewBirthCertificate'");
        eDDApplicationDetailsFragment.mImageViewBirthCertificate = (ImageView) Utils.castView(viewFindRequiredView5, R.id.birth_certificate_image_view_pma_view_application_details_birth_certificate, "field 'mImageViewBirthCertificate'", ImageView.class);
        this.f = viewFindRequiredView5;
        viewFindRequiredView5.setOnClickListener(new C2563g(eDDApplicationDetailsFragment, 4));
        eDDApplicationDetailsFragment.mViewGroupParentId = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.parent_id_view_group_pma_fragment_edd_application_details, "field 'mViewGroupParentId'", ViewGroup.class);
        View viewFindRequiredView6 = Utils.findRequiredView(view, R.id.parent_id_image_view_pma_view_application_details_parent_id, "field 'mImageViewParentId' and method 'onViewParentId'");
        eDDApplicationDetailsFragment.mImageViewParentId = (ImageView) Utils.castView(viewFindRequiredView6, R.id.parent_id_image_view_pma_view_application_details_parent_id, "field 'mImageViewParentId'", ImageView.class);
        this.f14524g = viewFindRequiredView6;
        viewFindRequiredView6.setOnClickListener(new C2563g(eDDApplicationDetailsFragment, 5));
        eDDApplicationDetailsFragment.mViewGroupParentalConsent = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.parental_consent_view_group_pma_fragment_edd_application_details, "field 'mViewGroupParentalConsent'", ViewGroup.class);
        View viewFindRequiredView7 = Utils.findRequiredView(view, R.id.parental_consent_image_view_pma_view_application_details_parental_consent, "field 'mImageViewParentalConsent' and method 'onViewParentalConsent'");
        eDDApplicationDetailsFragment.mImageViewParentalConsent = (ImageView) Utils.castView(viewFindRequiredView7, R.id.parental_consent_image_view_pma_view_application_details_parental_consent, "field 'mImageViewParentalConsent'", ImageView.class);
        this.h = viewFindRequiredView7;
        viewFindRequiredView7.setOnClickListener(new C2563g(eDDApplicationDetailsFragment, 6));
        View viewFindRequiredView8 = Utils.findRequiredView(view, R.id.account_upgrade_details_arrow_pma_fragment_edd_application_details, "field 'mAccountUpgradeDetailsArrow' and method 'onAccountUpgradeDetailsArrowClick'");
        eDDApplicationDetailsFragment.mAccountUpgradeDetailsArrow = (ImageView) Utils.castView(viewFindRequiredView8, R.id.account_upgrade_details_arrow_pma_fragment_edd_application_details, "field 'mAccountUpgradeDetailsArrow'", ImageView.class);
        this.i = viewFindRequiredView8;
        viewFindRequiredView8.setOnClickListener(new C2563g(eDDApplicationDetailsFragment, 7));
        eDDApplicationDetailsFragment.mAccountUpgradeDetailsGroup = (Group) Utils.findRequiredViewAsType(view, R.id.account_upgrade_details_group_pma_fragment_edd_application_details, "field 'mAccountUpgradeDetailsGroup'", Group.class);
        eDDApplicationDetailsFragment.mPrimaryUsageTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.primary_usage_text_view_pma_fragment_edd_application_details, "field 'mPrimaryUsageTextView'", TextView.class);
        eDDApplicationDetailsFragment.mRemittanceTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.remittance_text_view_pma_fragment_edd_application_details, "field 'mRemittanceTextView'", TextView.class);
        eDDApplicationDetailsFragment.mPurposeTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.purpose_text_view_pma_fragment_edd_application_details, "field 'mPurposeTextView'", TextView.class);
        eDDApplicationDetailsFragment.mPrimaryUsageOptionalGroup = (Group) Utils.findRequiredViewAsType(view, R.id.account_usage_optional_group_view_pma_fragment_edd_application_details, "field 'mPrimaryUsageOptionalGroup'", Group.class);
        eDDApplicationDetailsFragment.mIncomeSourceTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.alternative_income_source_text_view_pma_fragment_edd_application_details, "field 'mIncomeSourceTextView'", TextView.class);
        eDDApplicationDetailsFragment.mRelatedCompaniesTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.related_companies_text_view_pma_fragment_edd_application_details, "field 'mRelatedCompaniesTextView'", TextView.class);
        eDDApplicationDetailsFragment.mBankInformationTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.bank_information_text_view_pma_fragment_edd_application_details, "field 'mBankInformationTextView'", TextView.class);
        eDDApplicationDetailsFragment.mFinancialDocumentsLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.financial_documents_photo_linear_layout_pma_fragment_edd_application_details, "field 'mFinancialDocumentsLayout'", LinearLayout.class);
        eDDApplicationDetailsFragment.mContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.container_pma_fragment_edd_application_details, "field 'mContainer'", ViewGroup.class);
        View viewFindRequiredView9 = Utils.findRequiredView(view, R.id.additional_account_information_arrow_pma_fragment_edd_application_details, "field 'mAdditionalAccountInformationArrow' and method 'onApplicationDetailsArrowClick'");
        eDDApplicationDetailsFragment.mAdditionalAccountInformationArrow = (ImageView) Utils.castView(viewFindRequiredView9, R.id.additional_account_information_arrow_pma_fragment_edd_application_details, "field 'mAdditionalAccountInformationArrow'", ImageView.class);
        this.j = viewFindRequiredView9;
        viewFindRequiredView9.setOnClickListener(new C2563g(eDDApplicationDetailsFragment, 8));
        eDDApplicationDetailsFragment.mAdditionalAccountInformationGroup = (Group) Utils.findRequiredViewAsType(view, R.id.additional_account_information_group, "field 'mAdditionalAccountInformationGroup'", Group.class);
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        EDDApplicationDetailsFragment eDDApplicationDetailsFragment = this.f14521a;
        if (eDDApplicationDetailsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14521a = null;
        eDDApplicationDetailsFragment.mTextViewName = null;
        eDDApplicationDetailsFragment.mTextViewNationality = null;
        eDDApplicationDetailsFragment.mTextViewBirthDate = null;
        eDDApplicationDetailsFragment.mTextViewBirthPlace = null;
        eDDApplicationDetailsFragment.mTextViewIncomeSource = null;
        eDDApplicationDetailsFragment.mTextViewWorkNature = null;
        eDDApplicationDetailsFragment.mTextViewPresentAddress = null;
        eDDApplicationDetailsFragment.mTextViewPermanentAddress = null;
        eDDApplicationDetailsFragment.mTextViewIdTypeLabelFirstId = null;
        eDDApplicationDetailsFragment.mTextViewIdTypeFirstId = null;
        eDDApplicationDetailsFragment.mTextViewIdNumberFirstId = null;
        eDDApplicationDetailsFragment.mTextViewIdExpiryLabelFirstId = null;
        eDDApplicationDetailsFragment.mTextViewIdExpiryFirstId = null;
        eDDApplicationDetailsFragment.mImageViewIdPhotoFirstId = null;
        eDDApplicationDetailsFragment.mImageViewBackIdPhotoFirst = null;
        eDDApplicationDetailsFragment.mViewGroupSecondId = null;
        eDDApplicationDetailsFragment.mTextViewIdTypeSecondId = null;
        eDDApplicationDetailsFragment.mTextViewIdNumberSecondId = null;
        eDDApplicationDetailsFragment.mTextViewIdExpiryLabelSecondId = null;
        eDDApplicationDetailsFragment.mTextViewIdExpirySecondId = null;
        eDDApplicationDetailsFragment.mImageViewIdPhotoSecondId = null;
        eDDApplicationDetailsFragment.mImageViewBackIdPhotoSecond = null;
        eDDApplicationDetailsFragment.mViewGroupBirthCertificate = null;
        eDDApplicationDetailsFragment.mImageViewBirthCertificate = null;
        eDDApplicationDetailsFragment.mViewGroupParentId = null;
        eDDApplicationDetailsFragment.mImageViewParentId = null;
        eDDApplicationDetailsFragment.mViewGroupParentalConsent = null;
        eDDApplicationDetailsFragment.mImageViewParentalConsent = null;
        eDDApplicationDetailsFragment.mAccountUpgradeDetailsArrow = null;
        eDDApplicationDetailsFragment.mAccountUpgradeDetailsGroup = null;
        eDDApplicationDetailsFragment.mPrimaryUsageTextView = null;
        eDDApplicationDetailsFragment.mRemittanceTextView = null;
        eDDApplicationDetailsFragment.mPurposeTextView = null;
        eDDApplicationDetailsFragment.mPrimaryUsageOptionalGroup = null;
        eDDApplicationDetailsFragment.mIncomeSourceTextView = null;
        eDDApplicationDetailsFragment.mRelatedCompaniesTextView = null;
        eDDApplicationDetailsFragment.mBankInformationTextView = null;
        eDDApplicationDetailsFragment.mFinancialDocumentsLayout = null;
        eDDApplicationDetailsFragment.mContainer = null;
        eDDApplicationDetailsFragment.mAdditionalAccountInformationArrow = null;
        eDDApplicationDetailsFragment.mAdditionalAccountInformationGroup = null;
        this.f14522b.setOnClickListener(null);
        this.f14522b = null;
        this.c.setOnClickListener(null);
        this.c = null;
        this.f14523d.setOnClickListener(null);
        this.f14523d = null;
        this.e.setOnClickListener(null);
        this.e = null;
        this.f.setOnClickListener(null);
        this.f = null;
        this.f14524g.setOnClickListener(null);
        this.f14524g = null;
        this.h.setOnClickListener(null);
        this.h = null;
        this.i.setOnClickListener(null);
        this.i = null;
        this.j.setOnClickListener(null);
        this.j = null;
    }
}
