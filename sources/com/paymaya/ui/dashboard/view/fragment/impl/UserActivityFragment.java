package com.paymaya.ui.dashboard.view.fragment.impl;

import G6.p;
import Lh.d;
import O5.a;
import We.A;
import We.G;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.datasource.cache.c;
import butterknife.BindView;
import butterknife.OnClick;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.AbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1230t;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.PersonalizationGiphy;
import com.paymaya.domain.model.PersonalizationPayMaya;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.W0;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import d4.AbstractC1331a;
import de.m;
import gd.InterfaceC1517a;
import java.util.HashMap;
import k2.v0;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class UserActivityFragment extends AbstractBaseReceiptFragmentImpl {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public p f14467U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public InterfaceC1517a f14468V;

    @BindView(R.id.account_field_hide_group_pma_fragment_user_activity)
    Group mAccountGroup;

    @BindView(R.id.account_information_hide_group_pma_fragment_user_activity)
    Group mAccountInformationHideGroup;

    @BindView(R.id.account_information_label_pma_fragment_user_activity)
    TextView mAccountInformationLabelText;

    @BindView(R.id.account_information_text_pma_fragment_user_activity)
    TextView mAccountInformationText;

    @BindView(R.id.account_number_text_pma_fragment_user_activity)
    TextView mAccountNumberText;

    @BindView(R.id.account_text_pma_fragment_user_activity)
    TextView mAccountText;

    @BindView(R.id.account_type_hide_group_pma_fragment_user_activity)
    Group mAccountTypeGroup;

    @BindView(R.id.account_type_text_pma_fragment_user_activity)
    TextView mAccountTypeText;

    @BindView(R.id.activity_image_view_pma_fragment_shop_receipt)
    ImageView mActivityImageView;

    @BindView(R.id.amount_hide_group_pma_fragment_user_activity)
    Group mAmountHideGroup;

    @BindView(R.id.amount_title_text_pma_fragment_user_activity)
    TextView mAmountLabelText;

    @BindView(R.id.amount_text_pma_fragment_user_activity)
    TextView mAmountText;

    @BindView(R.id.powered_by_giphy_label)
    AppCompatTextView mAppCompatTextViewPoweredByGiphy;

    @BindView(R.id.authorized_amount_field_hide_group_pma_fragment_user_activity)
    Group mAuthorizedAmountHideGroup;

    @BindView(R.id.authorized_amount_title_text_pma_fragment_user_activity)
    TextView mAuthorizedAmountLabel;

    @BindView(R.id.authorized_amount_text_pma_fragment_user_activity)
    TextView mAuthorizedAmountText;

    @BindView(R.id.authorized_date_field_hide_group_pma_fragment_user_activity)
    Group mAuthorizedDateHideGroup;

    @BindView(R.id.authorized_date_text_pma_fragment_user_activity)
    TextView mAuthorizedDateText;

    @BindView(R.id.bank_name_field_group_pma_fragment_user_activity)
    Group mBankNameFieldGroup;

    @BindView(R.id.bank_name_text_pma_fragment_user_activity)
    TextView mBankNameText;

    @BindView(R.id.date_text_pma_fragment_user_activity)
    TextView mDateText;

    @BindView(R.id.fee_label_text_pma_fragment_user_activity)
    TextView mFeeLabelText;

    @BindView(R.id.fee_text_pma_fragment_user_activity)
    TextView mFeesText;

    @BindView(R.id.fund_source_field_hide_group_pma_fragment_user_activity)
    Group mFundSourceHideGroup;

    @BindView(R.id.fund_source_text_pma_fragment_user_activity)
    TextView mFundSourceText;

    @BindView(R.id.invoice_number_field_group_pma_fragment_user_activity)
    Group mInvoiceNumberFieldGroup;

    @BindView(R.id.invoice_number_label_text_pma_fragment_user_activity)
    TextView mInvoiceNumberLabel;

    @BindView(R.id.invoice_number_text_pma_fragment_user_activity)
    TextView mInvoiceNumberText;

    @BindView(R.id.merchant_id_field_group_pma_fragment_user_activity)
    Group mMerchantIdFieldGroup;

    @BindView(R.id.merchant_id_text_pma_fragment_user_activity)
    TextView mMerchantIdText;

    @BindView(R.id.message_arrow_icon_image_view_pma_fragment_user_activity)
    ImageView mMessageArrowIcon;

    @BindView(R.id.message_view_group_pma_fragment_user_activity)
    ViewGroup mMessageGroup;

    @BindView(R.id.message_icon_image_view_pma_fragment_user_activity)
    ImageView mMessageIcon;

    @BindView(R.id.message_text_pma_fragment_user_activity)
    TextView mMessageText;

    @BindView(R.id.payment_id_field_hide_group_pma_fragment_user_activity)
    Group mPaymentIdGroup;

    @BindView(R.id.payment_id_text_pma_fragment_user_activity)
    TextView mPaymentIdText;

    @BindView(R.id.payment_id_title_text_pma_fragment_user_activity)
    TextView mPaymentIdTitle;

    @BindView(R.id.product_name_field_hide_group_pma_fragment_user_activity)
    Group mProductNameHideGroup;

    @BindView(R.id.product_name_text_pma_fragment_user_activity)
    TextView mProductNameText;

    @BindView(R.id.purpose_group_pma_fragment_user_activity)
    Group mPurposeGroup;

    @BindView(R.id.purpose_text_pma_fragment_user_activity)
    TextView mPurposeText;

    @BindView(R.id.receipt_no_group_pma_fragment_user_activity)
    Group mReceiptNoGroup;

    @BindView(R.id.receipt_no_text_pma_fragment_user_activity)
    TextView mReceiptNoText;

    @BindView(R.id.recipient_field_hide_group_pma_fragment_user_activity)
    Group mRecipientHideGroup;

    @BindView(R.id.recipient_text_pma_fragment_user_activity)
    TextView mRecipientText;

    @BindView(R.id.reference_id_hide_group_pma_fragment_user_activity)
    Group mReferenceIdHideGroup;

    @BindView(R.id.reference_id_text_pma_fragment_user_activity)
    TextView mReferenceIdText;

    @BindView(R.id.status_text_pma_fragment_user_activity)
    TextView mStatusText;

    @BindView(R.id.total_amount_label_text_pma_fragment_user_activity)
    TextView mTotalAmountLabelText;

    @BindView(R.id.total_amount_text_pma_fragment_user_activity)
    TextView mTotalAmountText;

    @BindView(R.id.trace_number_field_group_pma_fragment_user_activity)
    Group mTraceNumberFieldGroup;

    @BindView(R.id.trace_number_label_text_pma_fragment_user_activity)
    TextView mTraceNumberLabel;

    @BindView(R.id.trace_number_text_pma_fragment_user_activity)
    TextView mTraceNumberText;

    @BindView(R.id.transaction_details_divider_pma_fragment_user_activity)
    View mTransactionDetailsDivider;

    @BindView(R.id.dynamic_fields_container_pma_fragment_user_activity)
    ViewGroup mViewGroupDynamicFields;

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void A1() {
        int i = 0;
        Bundle arguments = getArguments();
        if (arguments != null) {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.VIEW_QR);
            o1(c1219hH);
            UserActivity userActivity = (UserActivity) arguments.getParcelable("user_activity");
            p pVar = this.f14467U;
            pVar.getClass();
            j.g(userActivity, "userActivity");
            ((UserActivityFragment) pVar.c.get()).p1();
            Ah.p<PurchasedTicket> ticketDetails = ((W0) pVar.i).f11403b.getTicketDetails(userActivity.mRequestReferenceNo());
            pVar.e(new d(new d(AbstractC1331a.l(ticketDetails, ticketDetails, b.a()), new com.google.firebase.messaging.p(pVar, 6), 2), new A0(pVar, 3), i).e());
        }
    }

    public final void A2(String str) {
        this.mAuthorizedDateText.setText(str);
    }

    public final void B2(String str) {
        this.mBankNameText.setText(str);
    }

    public final void C2(String str) {
        this.mDateText.setText(str);
    }

    public final void D2() {
        this.mFeesText.setTextColor(getResources().getColor(R.color.dark_light));
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final View E1(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.pma_fragment_user_activity, (ViewGroup) null);
    }

    public final void E2(String str) {
        this.mFundSourceText.setText(str);
    }

    public final void F2() {
        int iO = v0.o(56);
        G gF = A.d().f(2131231939);
        gF.i(new C1230t(iO, iO));
        gF.e(this.mActivityImageView, null);
    }

    public final void G2(String str) {
        this.mInvoiceNumberText.setText(str);
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void H1() {
        this.mStatusText.setVisibility(0);
        this.mStatusText.setText(R.string.pma_label_processing);
        this.mStatusText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pma_ic_processing_status, 0, 0, 0);
    }

    public final void H2(String str) {
        this.mInvoiceNumberLabel.setText(str);
    }

    public final void I2(String str) {
        this.mMerchantIdText.setText(str);
    }

    public final void J2() {
        this.mPaymentIdTitle.setText(getString(R.string.pma_label_payment_id));
    }

    public final void K2(String str) {
        this.mPaymentIdText.setText(str);
    }

    public final void L2(String str) {
        this.mProductNameText.setText(str);
    }

    public final void M2(String str) {
        this.mRecipientText.setText(str);
    }

    public final void N2(String str) {
        this.mReferenceIdText.setText(str);
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void O1() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.GET_HELP);
        o1(c1219hH);
        ((MayaTransactionsActivity) this.f14468V).X1();
    }

    public final void O2() {
        this.mStatusText.setVisibility(0);
        this.mStatusText.setText(R.string.pma_label_completed);
        this.mStatusText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pma_ic_check_status, 0, 0, 0);
    }

    public final void P2(String str) {
        this.mTotalAmountText.setText(str);
    }

    public final void Q2() {
        this.mTotalAmountText.setTextColor(getResources().getColor(R.color.success));
    }

    public final void R2() {
        this.mTotalAmountText.setTextColor(getResources().getColor(R.color.dark_light));
    }

    public final void S2() {
        this.mTotalAmountText.setTextColor(getResources().getColor(R.color.error));
    }

    public final void T2(String str) {
        if (!str.endsWith(Global.COLON)) {
            str = str.concat(Global.COLON);
        }
        this.mTotalAmountLabelText.setText(str);
    }

    public final void U2() {
        this.mTotalAmountLabelText.setText(R.string.pma_label_amount_paid);
    }

    public final void V1(String str, String str2) {
        View viewInflate = getLayoutInflater().inflate(R.layout.pma_view_pay_bills_receipt_dynamic_field, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.transaction_details_dynamic_field_label_text_pma_fragment_pay_bills_receipt);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.transaction_details_dynamic_field_text_pma_fragment_pay_bills_receipt);
        textView.setText(str);
        textView2.setText(str2);
        this.mViewGroupDynamicFields.addView(viewInflate);
    }

    public final void V2(String str) {
        this.mTraceNumberText.setText(str);
    }

    public final void W1() {
        this.mAccountGroup.setVisibility(8);
    }

    public final void W2(String str) {
        this.mTraceNumberLabel.setText(str);
    }

    public final void X1() {
        this.mAccountTypeGroup.setVisibility(8);
    }

    public final void X2() {
        this.mBankNameFieldGroup.setVisibility(0);
    }

    public final void Y1() {
        this.mAmountHideGroup.setVisibility(8);
        this.mStatusText.setVisibility(8);
        d2();
    }

    public final void Y2(String str) {
        getContext();
        C.e0(str, this.mMessageIcon, R.drawable.pma_ic_no_card_design);
        this.mMessageIcon.setVisibility(0);
        this.mMessageArrowIcon.setVisibility(0);
    }

    public final void Z1() {
        this.mAuthorizedAmountHideGroup.setVisibility(8);
    }

    public final void Z2() {
        this.mInvoiceNumberFieldGroup.setVisibility(0);
    }

    public final void a2() {
        this.mAuthorizedDateHideGroup.setVisibility(8);
    }

    public final void a3() {
        this.mMerchantIdFieldGroup.setVisibility(0);
    }

    public final void b2() {
        this.mBankNameFieldGroup.setVisibility(8);
    }

    public final void b3() {
        this.mTraceNumberFieldGroup.setVisibility(0);
    }

    public final void c2() {
        this.mMessageArrowIcon.setVisibility(8);
        this.mMessageIcon.setVisibility(8);
        this.mMessageGroup.setEnabled(false);
    }

    public final void c3() {
        this.mTransactionDetailsDivider.setVisibility(0);
    }

    public final void d2() {
        this.mFeeLabelText.setVisibility(8);
        this.mFeesText.setVisibility(8);
    }

    public final void e2() {
        this.mFundSourceHideGroup.setVisibility(8);
    }

    public final void f2() {
        this.mInvoiceNumberFieldGroup.setVisibility(8);
    }

    public final void g2() {
        this.mMerchantIdFieldGroup.setVisibility(8);
    }

    public final void h2() {
        this.mMessageText.setVisibility(8);
    }

    public final void i2() {
        this.mPaymentIdGroup.setVisibility(8);
    }

    public final void j2() {
        this.mProductNameHideGroup.setVisibility(8);
    }

    public final void k2() {
        this.mPurposeGroup.setVisibility(8);
    }

    public final void l2() {
        this.mRecipientHideGroup.setVisibility(8);
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.ACTIVITY_LIST;
    }

    public final void m2() {
        this.mReferenceIdHideGroup.setVisibility(8);
    }

    public final void n2() {
        this.mStatusText.setVisibility(8);
    }

    public final void o2() {
        this.mTotalAmountText.setVisibility(8);
        this.mTotalAmountLabelText.setVisibility(8);
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void onCloseClick() {
        p pVar = this.f14467U;
        if (pVar.f) {
            ((UserActivityFragment) pVar.c.get()).f14468V.finish();
        } else {
            ((MayaTransactionsActivity) ((UserActivityFragment) pVar.c.get()).f14468V).onBackPressed();
        }
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f10248Q.r(EnumC1216e.DETAILS);
        this.f14468V = (InterfaceC1517a) getActivity();
        a aVar = (a) W4.a.e().b().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        p pVar = new p(aVar.t(), aVar.g(), (com.paymaya.data.preference.a) aVar.e.get(), aVar.U());
        this.f14467U = pVar;
        pVar.h(this);
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14467U.i();
        super.onDestroy();
    }

    @OnClick({R.id.message_view_group_pma_fragment_user_activity})
    public void onMessageClicked() {
        PersonalizationPayMaya mayaDecoration;
        String mId;
        PersonalizationGiphy gifDecoration;
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserActivity userActivity = (UserActivity) arguments.getParcelable("user_activity");
            p pVar = this.f14467U;
            pVar.getClass();
            j.g(userActivity, "userActivity");
            String strMMethod = userActivity.mMethod();
            boolean z4 = false;
            if (strMMethod != null && (strMMethod.equals("MONEYINCR") || strMMethod.equals("SMP2PCONCD"))) {
                z4 = true;
            }
            TransferPersonalizationMeta transferPersonalizationMetaMTransferPersonalizationMeta = userActivity.mTransferPersonalizationMeta();
            String decorationId = null;
            String gifId = (transferPersonalizationMetaMTransferPersonalizationMeta == null || (gifDecoration = transferPersonalizationMetaMTransferPersonalizationMeta.getGifDecoration()) == null) ? null : gifDecoration.getGifId();
            if (gifId != null) {
                pVar.q(EnumC1212a.GIF_ID, gifId, z4);
            } else {
                EnumC1212a enumC1212a = EnumC1212a.THEME_ID;
                Decoration decorationMDecoration = userActivity.mDecoration();
                if (decorationMDecoration == null || (mId = decorationMDecoration.getMId()) == null) {
                    TransferPersonalizationMeta transferPersonalizationMetaMTransferPersonalizationMeta2 = userActivity.mTransferPersonalizationMeta();
                    if (transferPersonalizationMetaMTransferPersonalizationMeta2 != null && (mayaDecoration = transferPersonalizationMetaMTransferPersonalizationMeta2.getMayaDecoration()) != null) {
                        decorationId = mayaDecoration.getDecorationId();
                    }
                } else {
                    decorationId = mId;
                }
                pVar.q(enumC1212a, decorationId, z4);
            }
            ((MayaTransactionsActivity) ((UserActivityFragment) pVar.c.get()).f14468V).Y1(userActivity, z4);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((MayaTransactionsActivity) this.f14468V).Q(this);
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void onShareClick() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserActivity userActivity = (UserActivity) arguments.getParcelable("user_activity");
            p pVar = this.f14467U;
            pVar.getClass();
            j.g(userActivity, "userActivity");
            UserActivityFragment userActivityFragment = (UserActivityFragment) pVar.c.get();
            String strMMethod = userActivity.mMethod();
            userActivityFragment.getClass();
            C1219h c1219h = new C1219h();
            c1219h.r(EnumC1216e.DETAILS);
            c1219h.n(17);
            c1219h.t(EnumC1217f.SHARE_OR_SAVE);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("service", strMMethod);
            C1220i c1220i = userActivityFragment.f10245B;
            FragmentActivity activity = userActivityFragment.getActivity();
            c1219h.p(EnumC1215d.ACTIVITY_LIST);
            c1220i.c(activity, c1219h);
            String strMType = userActivity.mType();
            String strMStatus = userActivity.mStatus();
            String strMMethod2 = userActivity.mMethod();
            String amountFormattedValue = userActivity.getAmountFormattedValue();
            String strMRequestReferenceNo = userActivity.mRequestReferenceNo();
            String localDateTimeForBillsPayShare = userActivity.getLocalDateTimeForBillsPayShare();
            if (userActivity.isBillsPayMethod(false) && ("authorized".equals(strMStatus) || "posted".equals(strMStatus))) {
                UserActivityFragment userActivityFragment2 = (UserActivityFragment) pVar.c.get();
                Biller biller = (Biller) ((HashMap) J5.a.c().f2414b).get(userActivity.mBillerslug());
                userActivityFragment2.r2(userActivityFragment2.getString(R.string.pma_label_share_authorized_without_account_number, amountFormattedValue, biller != null ? biller.mName() : null, strMRequestReferenceNo, localDateTimeForBillsPayShare));
                return;
            }
            if (("MONEYINDB".equals(strMMethod2) || "SMP2PCONDB".equals(strMMethod2)) && "Send Money".equals(strMType)) {
                UserActivityFragment userActivityFragment3 = (UserActivityFragment) pVar.c.get();
                ActivityDescription activityDescriptionMDescription = userActivity.mDescription();
                j.d(activityDescriptionMDescription);
                userActivityFragment3.r2(userActivityFragment3.getString(R.string.pma_label_share_authorized_p2p, amountFormattedValue, activityDescriptionMDescription.mTarget(), strMRequestReferenceNo, localDateTimeForBillsPayShare));
                return;
            }
            UserActivityFragment userActivityFragment4 = (UserActivityFragment) pVar.c.get();
            userActivityFragment4.getClass();
            String strI = c.i(System.currentTimeMillis(), "receipt_snapshot_", ".jpg");
            h0 h0VarD = h0.d(userActivityFragment4.t1(), new m(userActivityFragment4, 7));
            h0VarD.f11211g = userActivityFragment4.getResources().getDimensionPixelSize(R.dimen.pma_margin_20dp);
            h0VarD.e(ContextCompat.getColor(userActivityFragment4.getContext(), R.color.light_light));
            h0VarD.f11209b = userActivityFragment4.r1();
            h0VarD.f(userActivityFragment4.s1());
            h0VarD.b(strI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0d0a A[REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ab A[REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022b A[ADDED_TO_REGION, REMOVE] */
    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 3371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.ui.dashboard.view.fragment.impl.UserActivityFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void p2() {
        this.mTraceNumberFieldGroup.setVisibility(8);
    }

    public final void q2() {
        this.mTransactionDetailsDivider.setVisibility(8);
    }

    public final void r2(String str) {
        String strI = c.i(System.currentTimeMillis(), "receipt_snapshot_", ".jpg");
        h0 h0VarD = h0.d(t1(), new androidx.camera.lifecycle.a(28, this, str));
        h0VarD.f11211g = getResources().getDimensionPixelSize(R.dimen.pma_margin_20dp);
        h0VarD.e(ContextCompat.getColor(getContext(), R.color.light_light));
        h0VarD.f11209b = r1();
        h0VarD.f(s1());
        h0VarD.b(strI);
    }

    public final void s2(String str) {
        this.mAccountInformationText.setText(str);
    }

    public final void t2(String str, String str2) {
        this.mAccountNumberText.setText(getString(str.endsWith(Global.COLON) ? R.string.pma_label_format_label_account_number : R.string.pma_label_format_label_account_number_colon, str, str2));
    }

    public final void u2(String str) {
        this.mAccountTypeText.setText(str);
    }

    public final void v2(String str) {
        this.mAmountText.setText(str);
    }

    public final void w2() {
        this.mAmountText.setTextColor(getResources().getColor(R.color.dark_light));
    }

    public final void x2(String str) {
        this.mAmountLabelText.setText(str);
    }

    public final void y2(String str) {
        this.mAuthorizedAmountText.setText(str);
    }

    public final void z2() {
        this.mAuthorizedAmountLabel.setText(getString(R.string.pma_label_amount_void));
    }
}
