package com.paymaya.ui.dashboard.view.fragment.impl;

import Bd.e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import butterknife.internal.Utils;
import com.paymaya.R;
import com.paymaya.common.base.AbstractBaseReceiptFragmentImpl_ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public class UserActivityFragment_ViewBinding extends AbstractBaseReceiptFragmentImpl_ViewBinding {
    public UserActivityFragment e;
    public View f;

    @UiThread
    public UserActivityFragment_ViewBinding(UserActivityFragment userActivityFragment, View view) {
        super(userActivityFragment, view);
        this.e = userActivityFragment;
        userActivityFragment.mAccountInformationLabelText = (TextView) Utils.findRequiredViewAsType(view, R.id.account_information_label_pma_fragment_user_activity, "field 'mAccountInformationLabelText'", TextView.class);
        userActivityFragment.mAccountInformationText = (TextView) Utils.findRequiredViewAsType(view, R.id.account_information_text_pma_fragment_user_activity, "field 'mAccountInformationText'", TextView.class);
        userActivityFragment.mAccountNumberText = (TextView) Utils.findRequiredViewAsType(view, R.id.account_number_text_pma_fragment_user_activity, "field 'mAccountNumberText'", TextView.class);
        userActivityFragment.mActivityImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.activity_image_view_pma_fragment_shop_receipt, "field 'mActivityImageView'", ImageView.class);
        userActivityFragment.mAccountInformationHideGroup = (Group) Utils.findRequiredViewAsType(view, R.id.account_information_hide_group_pma_fragment_user_activity, "field 'mAccountInformationHideGroup'", Group.class);
        userActivityFragment.mAmountHideGroup = (Group) Utils.findRequiredViewAsType(view, R.id.amount_hide_group_pma_fragment_user_activity, "field 'mAmountHideGroup'", Group.class);
        userActivityFragment.mAmountLabelText = (TextView) Utils.findRequiredViewAsType(view, R.id.amount_title_text_pma_fragment_user_activity, "field 'mAmountLabelText'", TextView.class);
        userActivityFragment.mAmountText = (TextView) Utils.findRequiredViewAsType(view, R.id.amount_text_pma_fragment_user_activity, "field 'mAmountText'", TextView.class);
        userActivityFragment.mFeesText = (TextView) Utils.findRequiredViewAsType(view, R.id.fee_text_pma_fragment_user_activity, "field 'mFeesText'", TextView.class);
        userActivityFragment.mFeeLabelText = (TextView) Utils.findRequiredViewAsType(view, R.id.fee_label_text_pma_fragment_user_activity, "field 'mFeeLabelText'", TextView.class);
        userActivityFragment.mRecipientText = (TextView) Utils.findRequiredViewAsType(view, R.id.recipient_text_pma_fragment_user_activity, "field 'mRecipientText'", TextView.class);
        userActivityFragment.mRecipientHideGroup = (Group) Utils.findRequiredViewAsType(view, R.id.recipient_field_hide_group_pma_fragment_user_activity, "field 'mRecipientHideGroup'", Group.class);
        userActivityFragment.mProductNameText = (TextView) Utils.findRequiredViewAsType(view, R.id.product_name_text_pma_fragment_user_activity, "field 'mProductNameText'", TextView.class);
        userActivityFragment.mProductNameHideGroup = (Group) Utils.findRequiredViewAsType(view, R.id.product_name_field_hide_group_pma_fragment_user_activity, "field 'mProductNameHideGroup'", Group.class);
        userActivityFragment.mFundSourceText = (TextView) Utils.findRequiredViewAsType(view, R.id.fund_source_text_pma_fragment_user_activity, "field 'mFundSourceText'", TextView.class);
        userActivityFragment.mFundSourceHideGroup = (Group) Utils.findRequiredViewAsType(view, R.id.fund_source_field_hide_group_pma_fragment_user_activity, "field 'mFundSourceHideGroup'", Group.class);
        userActivityFragment.mDateText = (TextView) Utils.findRequiredViewAsType(view, R.id.date_text_pma_fragment_user_activity, "field 'mDateText'", TextView.class);
        userActivityFragment.mMerchantIdText = (TextView) Utils.findRequiredViewAsType(view, R.id.merchant_id_text_pma_fragment_user_activity, "field 'mMerchantIdText'", TextView.class);
        userActivityFragment.mMerchantIdFieldGroup = (Group) Utils.findRequiredViewAsType(view, R.id.merchant_id_field_group_pma_fragment_user_activity, "field 'mMerchantIdFieldGroup'", Group.class);
        userActivityFragment.mBankNameText = (TextView) Utils.findRequiredViewAsType(view, R.id.bank_name_text_pma_fragment_user_activity, "field 'mBankNameText'", TextView.class);
        userActivityFragment.mBankNameFieldGroup = (Group) Utils.findRequiredViewAsType(view, R.id.bank_name_field_group_pma_fragment_user_activity, "field 'mBankNameFieldGroup'", Group.class);
        userActivityFragment.mReferenceIdText = (TextView) Utils.findRequiredViewAsType(view, R.id.reference_id_text_pma_fragment_user_activity, "field 'mReferenceIdText'", TextView.class);
        userActivityFragment.mReferenceIdHideGroup = (Group) Utils.findRequiredViewAsType(view, R.id.reference_id_hide_group_pma_fragment_user_activity, "field 'mReferenceIdHideGroup'", Group.class);
        userActivityFragment.mTraceNumberLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.trace_number_label_text_pma_fragment_user_activity, "field 'mTraceNumberLabel'", TextView.class);
        userActivityFragment.mTraceNumberText = (TextView) Utils.findRequiredViewAsType(view, R.id.trace_number_text_pma_fragment_user_activity, "field 'mTraceNumberText'", TextView.class);
        userActivityFragment.mTraceNumberFieldGroup = (Group) Utils.findRequiredViewAsType(view, R.id.trace_number_field_group_pma_fragment_user_activity, "field 'mTraceNumberFieldGroup'", Group.class);
        userActivityFragment.mInvoiceNumberLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.invoice_number_label_text_pma_fragment_user_activity, "field 'mInvoiceNumberLabel'", TextView.class);
        userActivityFragment.mInvoiceNumberText = (TextView) Utils.findRequiredViewAsType(view, R.id.invoice_number_text_pma_fragment_user_activity, "field 'mInvoiceNumberText'", TextView.class);
        userActivityFragment.mInvoiceNumberFieldGroup = (Group) Utils.findRequiredViewAsType(view, R.id.invoice_number_field_group_pma_fragment_user_activity, "field 'mInvoiceNumberFieldGroup'", Group.class);
        userActivityFragment.mTransactionDetailsDivider = Utils.findRequiredView(view, R.id.transaction_details_divider_pma_fragment_user_activity, "field 'mTransactionDetailsDivider'");
        userActivityFragment.mAuthorizedAmountLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.authorized_amount_title_text_pma_fragment_user_activity, "field 'mAuthorizedAmountLabel'", TextView.class);
        userActivityFragment.mAuthorizedAmountText = (TextView) Utils.findRequiredViewAsType(view, R.id.authorized_amount_text_pma_fragment_user_activity, "field 'mAuthorizedAmountText'", TextView.class);
        userActivityFragment.mAuthorizedAmountHideGroup = (Group) Utils.findRequiredViewAsType(view, R.id.authorized_amount_field_hide_group_pma_fragment_user_activity, "field 'mAuthorizedAmountHideGroup'", Group.class);
        userActivityFragment.mAuthorizedDateText = (TextView) Utils.findRequiredViewAsType(view, R.id.authorized_date_text_pma_fragment_user_activity, "field 'mAuthorizedDateText'", TextView.class);
        userActivityFragment.mAuthorizedDateHideGroup = (Group) Utils.findRequiredViewAsType(view, R.id.authorized_date_field_hide_group_pma_fragment_user_activity, "field 'mAuthorizedDateHideGroup'", Group.class);
        userActivityFragment.mMessageText = (TextView) Utils.findRequiredViewAsType(view, R.id.message_text_pma_fragment_user_activity, "field 'mMessageText'", TextView.class);
        userActivityFragment.mStatusText = (TextView) Utils.findRequiredViewAsType(view, R.id.status_text_pma_fragment_user_activity, "field 'mStatusText'", TextView.class);
        userActivityFragment.mViewGroupDynamicFields = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.dynamic_fields_container_pma_fragment_user_activity, "field 'mViewGroupDynamicFields'", ViewGroup.class);
        userActivityFragment.mAccountTypeGroup = (Group) Utils.findRequiredViewAsType(view, R.id.account_type_hide_group_pma_fragment_user_activity, "field 'mAccountTypeGroup'", Group.class);
        userActivityFragment.mAccountTypeText = (TextView) Utils.findRequiredViewAsType(view, R.id.account_type_text_pma_fragment_user_activity, "field 'mAccountTypeText'", TextView.class);
        userActivityFragment.mPurposeGroup = (Group) Utils.findRequiredViewAsType(view, R.id.purpose_group_pma_fragment_user_activity, "field 'mPurposeGroup'", Group.class);
        userActivityFragment.mPurposeText = (TextView) Utils.findRequiredViewAsType(view, R.id.purpose_text_pma_fragment_user_activity, "field 'mPurposeText'", TextView.class);
        userActivityFragment.mReceiptNoText = (TextView) Utils.findRequiredViewAsType(view, R.id.receipt_no_text_pma_fragment_user_activity, "field 'mReceiptNoText'", TextView.class);
        userActivityFragment.mReceiptNoGroup = (Group) Utils.findRequiredViewAsType(view, R.id.receipt_no_group_pma_fragment_user_activity, "field 'mReceiptNoGroup'", Group.class);
        userActivityFragment.mPaymentIdTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.payment_id_title_text_pma_fragment_user_activity, "field 'mPaymentIdTitle'", TextView.class);
        userActivityFragment.mPaymentIdText = (TextView) Utils.findRequiredViewAsType(view, R.id.payment_id_text_pma_fragment_user_activity, "field 'mPaymentIdText'", TextView.class);
        userActivityFragment.mPaymentIdGroup = (Group) Utils.findRequiredViewAsType(view, R.id.payment_id_field_hide_group_pma_fragment_user_activity, "field 'mPaymentIdGroup'", Group.class);
        userActivityFragment.mAccountText = (TextView) Utils.findRequiredViewAsType(view, R.id.account_text_pma_fragment_user_activity, "field 'mAccountText'", TextView.class);
        userActivityFragment.mAccountGroup = (Group) Utils.findRequiredViewAsType(view, R.id.account_field_hide_group_pma_fragment_user_activity, "field 'mAccountGroup'", Group.class);
        userActivityFragment.mMessageIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.message_icon_image_view_pma_fragment_user_activity, "field 'mMessageIcon'", ImageView.class);
        userActivityFragment.mMessageArrowIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.message_arrow_icon_image_view_pma_fragment_user_activity, "field 'mMessageArrowIcon'", ImageView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.message_view_group_pma_fragment_user_activity, "field 'mMessageGroup' and method 'onMessageClicked'");
        userActivityFragment.mMessageGroup = (ViewGroup) Utils.castView(viewFindRequiredView, R.id.message_view_group_pma_fragment_user_activity, "field 'mMessageGroup'", ViewGroup.class);
        this.f = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(userActivityFragment, 7));
        userActivityFragment.mTotalAmountLabelText = (TextView) Utils.findRequiredViewAsType(view, R.id.total_amount_label_text_pma_fragment_user_activity, "field 'mTotalAmountLabelText'", TextView.class);
        userActivityFragment.mTotalAmountText = (TextView) Utils.findRequiredViewAsType(view, R.id.total_amount_text_pma_fragment_user_activity, "field 'mTotalAmountText'", TextView.class);
        userActivityFragment.mAppCompatTextViewPoweredByGiphy = (AppCompatTextView) Utils.findRequiredViewAsType(view, R.id.powered_by_giphy_label, "field 'mAppCompatTextViewPoweredByGiphy'", AppCompatTextView.class);
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl_ViewBinding, butterknife.Unbinder
    public final void unbind() {
        UserActivityFragment userActivityFragment = this.e;
        if (userActivityFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.e = null;
        userActivityFragment.mAccountInformationLabelText = null;
        userActivityFragment.mAccountInformationText = null;
        userActivityFragment.mAccountNumberText = null;
        userActivityFragment.mActivityImageView = null;
        userActivityFragment.mAccountInformationHideGroup = null;
        userActivityFragment.mAmountHideGroup = null;
        userActivityFragment.mAmountLabelText = null;
        userActivityFragment.mAmountText = null;
        userActivityFragment.mFeesText = null;
        userActivityFragment.mFeeLabelText = null;
        userActivityFragment.mRecipientText = null;
        userActivityFragment.mRecipientHideGroup = null;
        userActivityFragment.mProductNameText = null;
        userActivityFragment.mProductNameHideGroup = null;
        userActivityFragment.mFundSourceText = null;
        userActivityFragment.mFundSourceHideGroup = null;
        userActivityFragment.mDateText = null;
        userActivityFragment.mMerchantIdText = null;
        userActivityFragment.mMerchantIdFieldGroup = null;
        userActivityFragment.mBankNameText = null;
        userActivityFragment.mBankNameFieldGroup = null;
        userActivityFragment.mReferenceIdText = null;
        userActivityFragment.mReferenceIdHideGroup = null;
        userActivityFragment.mTraceNumberLabel = null;
        userActivityFragment.mTraceNumberText = null;
        userActivityFragment.mTraceNumberFieldGroup = null;
        userActivityFragment.mInvoiceNumberLabel = null;
        userActivityFragment.mInvoiceNumberText = null;
        userActivityFragment.mInvoiceNumberFieldGroup = null;
        userActivityFragment.mTransactionDetailsDivider = null;
        userActivityFragment.mAuthorizedAmountLabel = null;
        userActivityFragment.mAuthorizedAmountText = null;
        userActivityFragment.mAuthorizedAmountHideGroup = null;
        userActivityFragment.mAuthorizedDateText = null;
        userActivityFragment.mAuthorizedDateHideGroup = null;
        userActivityFragment.mMessageText = null;
        userActivityFragment.mStatusText = null;
        userActivityFragment.mViewGroupDynamicFields = null;
        userActivityFragment.mAccountTypeGroup = null;
        userActivityFragment.mAccountTypeText = null;
        userActivityFragment.mPurposeGroup = null;
        userActivityFragment.mPurposeText = null;
        userActivityFragment.mReceiptNoText = null;
        userActivityFragment.mReceiptNoGroup = null;
        userActivityFragment.mPaymentIdTitle = null;
        userActivityFragment.mPaymentIdText = null;
        userActivityFragment.mPaymentIdGroup = null;
        userActivityFragment.mAccountText = null;
        userActivityFragment.mAccountGroup = null;
        userActivityFragment.mMessageIcon = null;
        userActivityFragment.mMessageArrowIcon = null;
        userActivityFragment.mMessageGroup = null;
        userActivityFragment.mTotalAmountLabelText = null;
        userActivityFragment.mTotalAmountText = null;
        userActivityFragment.mAppCompatTextViewPoweredByGiphy = null;
        this.f.setOnClickListener(null);
        this.f = null;
        super.unbind();
    }
}
