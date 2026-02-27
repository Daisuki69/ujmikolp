package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.C$$AutoValue_UserActivity;
import com.paymaya.domain.model.C$AutoValue_UserActivity;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UserActivity implements Parcelable, Dated {
    private static final int ID_MAX_LENGTH = 12;

    public static abstract class Builder {
        public abstract UserActivity build();

        public abstract Builder mAccountLastFour(@Nullable String str);

        public abstract Builder mAccountNo(@Nullable String str);

        public abstract Builder mAmount(@Nullable Amount amount);

        public abstract Builder mAuthAmount(@Nullable Amount amount);

        public abstract Builder mAuthTimestamp(@Nullable String str);

        public abstract Builder mBankName(@Nullable String str);

        public abstract Builder mBillerReason(@Nullable String str);

        public abstract Builder mBillerReceiptNo(@Nullable String str);

        public abstract Builder mBillerslug(@Nullable String str);

        public abstract Builder mDecoration(@Nullable Decoration decoration);

        public abstract Builder mDescription(@Nullable ActivityDescription activityDescription);

        public abstract Builder mDisplay(String str);

        public abstract Builder mFee(@Nullable Fee fee);

        public abstract Builder mFundSourceId(@Nullable String str);

        public abstract Builder mId(@Nullable String str);

        public abstract Builder mInstapayAccount(@Nullable InstapayAccount instapayAccount);

        public abstract Builder mInvoiceNumber(@Nullable String str);

        public abstract Builder mInvoiceNumberLabel(@Nullable String str);

        public abstract Builder mIsAmountVisible(@Nullable Boolean bool);

        public abstract Builder mItem(@Nullable String str);

        public abstract Builder mMerchantId(@Nullable String str);

        public abstract Builder mMerchantReferenceNumber(@Nullable String str);

        public abstract Builder mMessage(@Nullable String str);

        public abstract Builder mMethod(@Nullable String str);

        public abstract Builder mOtherFields(@Nullable List<BillerDynamicField> list);

        public abstract Builder mP2PTarget(@Nullable String str);

        public abstract Builder mPaymentId(@Nullable String str);

        public abstract Builder mPaymentReferenceNo(@Nullable String str);

        public abstract Builder mProductName(@Nullable String str);

        public abstract Builder mProvider(@Nullable String str);

        public abstract Builder mRecipient(@Nullable String str);

        public abstract Builder mRequestReferenceNo(@Nullable String str);

        public abstract Builder mSchemeType(@Nullable String str);

        public abstract Builder mStatus(@Nullable String str);

        public abstract Builder mStatusDisplay(String str);

        public abstract Builder mTimestamp(@Nullable String str);

        public abstract Builder mTotalAmount(@Nullable TotalAmount totalAmount);

        public abstract Builder mTraceNumber(@Nullable String str);

        public abstract Builder mTraceNumberLabel(@Nullable String str);

        public abstract Builder mTransferPersonalizationMeta(@Nullable TransferPersonalizationMeta transferPersonalizationMeta);

        public abstract Builder mType(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_UserActivity.Builder().mAccountNo("").mAmount(null).mInstapayAccount(null).mFee(null).mAuthAmount(null).mAuthTimestamp("").mBillerReason("").mBillerReceiptNo("").mBillerslug("").mDescription(null).mFundSourceId("").mId("").mItem("").mMessage("").mMethod("").mP2PTarget("").mPaymentReferenceNo("").mRecipient("").mRequestReferenceNo("").mStatus("").mTimestamp("").mType("").mStatusDisplay("").mOtherFields(new ArrayList()).mAccountLastFour("").mPaymentId("").mMerchantId(null).mBankName(null).mTraceNumber(null).mTraceNumberLabel(null).mInvoiceNumber(null).mInvoiceNumberLabel(null).mTotalAmount(null).mProductName("").mSchemeType(null).mMerchantReferenceNumber(null).mDecoration(null).mProvider("").mIsAmountVisible(Boolean.TRUE).mTransferPersonalizationMeta(null);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_UserActivity.GsonTypeAdapter(jVar);
    }

    public String getAmountFormattedValue() {
        if (mAmount() == null || mAmount().getCurrencyFormattedValue() == null) {
            return null;
        }
        return mAmount().getCurrencyFormattedValue();
    }

    public String getAuthAmountFormattedValue() {
        return mAuthAmount().getCurrencyFormattedValue();
    }

    public String getFeeFormattedValue() {
        return mFee().getCurrencyFormattedValue();
    }

    public String getFeeLabel(String str) {
        return (!hasFee() || mFee().mLabel() == null) ? str : mFee().mLabel();
    }

    public String getInstapayAccountName() {
        if (mInstapayAccount() == null) {
            return null;
        }
        return mInstapayAccount().mName();
    }

    public String getInstapayAccountNumber() {
        if (mInstapayAccount() == null) {
            return null;
        }
        return mInstapayAccount().mNumber();
    }

    public String getInstapayAccountType() {
        if (mInstapayAccount() == null) {
            return null;
        }
        return mInstapayAccount().mType();
    }

    @Override // com.paymaya.domain.model.Dated
    public DateTime getLocalDateTime() {
        return AbstractC1234x.b(mTimestamp());
    }

    public String getLocalDateTimeForBillsPayShare() {
        return AbstractC1234x.f11253l.withLocale(AbstractC1234x.l()).print(getLocalDateTime());
    }

    public String getLocalDateTimeForDashboardDisplay() {
        DateTime localDateTime = getLocalDateTime();
        return AbstractC1234x.n(localDateTime) ? AbstractC1234x.g(localDateTime) : AbstractC1234x.f11248a.withLocale(AbstractC1234x.l()).print(localDateTime);
    }

    public String getLocalDateTimeForDashboardDisplaySimpleDate3() {
        DateTime localDateTime = getLocalDateTime();
        return AbstractC1234x.n(localDateTime) ? AbstractC1234x.g(localDateTime) : AbstractC1234x.c.withLocale(AbstractC1234x.l()).print(localDateTime);
    }

    @Override // com.paymaya.domain.model.Dated
    public String getLocalDateTimeForDateHeader(Locale locale) {
        DateTime localDateTime = getLocalDateTime();
        return AbstractC1234x.n(localDateTime) ? AbstractC1234x.f11265y : AbstractC1234x.f11248a.withLocale(AbstractC1234x.l()).print(localDateTime);
    }

    @Override // com.paymaya.domain.model.Dated
    public String getLocalDateTimeForDisplay(Locale locale) {
        DateTime localDateTime = getLocalDateTime();
        return AbstractC1234x.n(localDateTime) ? AbstractC1234x.g(localDateTime) : AbstractC1234x.f11251g.withLocale(AbstractC1234x.l()).print(localDateTime).replace("am", "AM").replace("pm", "PM");
    }

    public String getMaskedLastFour() {
        return "···· " + mAccountLastFour();
    }

    @Override // com.paymaya.domain.model.Dated
    public String getMayaLocalDateTimeForDateHeader(Locale locale, boolean z4) {
        DateTime localDateTime = getLocalDateTime();
        return AbstractC1234x.n(localDateTime) ? AbstractC1234x.f11265y : AbstractC1234x.h(localDateTime);
    }

    public String getParsedPaymentId() {
        if (mPaymentId() == null) {
            return null;
        }
        return mPaymentId().length() < 12 ? mPaymentId() : mPaymentId().substring(mPaymentId().length() - 12);
    }

    public String getParsedPaymentIdWithSpaces() {
        return setPaymentIdWithSpaces(getParsedPaymentId());
    }

    public String getParsedReferenceNo() {
        if (mRequestReferenceNo() == null) {
            return null;
        }
        return mRequestReferenceNo().length() < 12 ? mRequestReferenceNo() : mRequestReferenceNo().substring(mRequestReferenceNo().length() - 12);
    }

    public String getParsedReferenceNoWithSpaces() {
        return setPaymentIdWithSpaces(getParsedReferenceNo());
    }

    public String getTotalAmountFormattedValue() {
        return mTotalAmount().getCurrencyFormattedValue();
    }

    public String getTotalAmountLabel(String str) {
        return (!hasTotalAmount() || mTotalAmount().getLabel() == null) ? str : mTotalAmount().getLabel();
    }

    public boolean hasAuthAmount() {
        return (mAuthAmount() == null || mAuthAmount().mValue() == null || mAuthAmount().mValue().isEmpty()) ? false : true;
    }

    public boolean hasFee() {
        return (mFee() == null || mFee().mValue() == null || mFee().mCurrency() == null) ? false : true;
    }

    public boolean hasOtherFields() {
        return mOtherFields() != null && mOtherFields().size() > 0;
    }

    public boolean hasTotalAmount() {
        return (mTotalAmount() == null || mTotalAmount().getValue() == null || mTotalAmount().getCurrency() == null) ? false : true;
    }

    public boolean isBillsPayMethod(boolean z4) {
        ArrayList arrayList = new ArrayList(AbstractC1233w.f);
        if (z4) {
            arrayList.addAll(AbstractC1233w.f11236g);
        }
        return arrayList.contains(mMethod());
    }

    @Nullable
    @InterfaceC1498b("account_last_four")
    public abstract String mAccountLastFour();

    @Nullable
    @InterfaceC1498b("account_no")
    public abstract String mAccountNo();

    @Nullable
    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @Nullable
    @InterfaceC1498b("auth_amount")
    public abstract Amount mAuthAmount();

    @Nullable
    @InterfaceC1498b("auth_timestamp")
    public abstract String mAuthTimestamp();

    @Nullable
    @InterfaceC1498b("bank_name")
    public abstract String mBankName();

    @Nullable
    @InterfaceC1498b("biller_reason")
    public abstract String mBillerReason();

    @Nullable
    @InterfaceC1498b("biller_receipt_no")
    public abstract String mBillerReceiptNo();

    @Nullable
    @InterfaceC1498b("biller_slug")
    public abstract String mBillerslug();

    @Nullable
    public abstract Decoration mDecoration();

    @Nullable
    @InterfaceC1498b("description")
    public abstract ActivityDescription mDescription();

    @Nullable
    @InterfaceC1498b("display")
    public abstract String mDisplay();

    @Nullable
    @InterfaceC1498b("fee")
    public abstract Fee mFee();

    @Nullable
    @InterfaceC1498b("fund_source_id")
    public abstract String mFundSourceId();

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("account")
    public abstract InstapayAccount mInstapayAccount();

    @Nullable
    @InterfaceC1498b("invoice_number")
    public abstract String mInvoiceNumber();

    @Nullable
    @InterfaceC1498b("invoice_number_label")
    public abstract String mInvoiceNumberLabel();

    @Nullable
    public abstract Boolean mIsAmountVisible();

    @Nullable
    @InterfaceC1498b("item")
    public abstract String mItem();

    @Nullable
    @InterfaceC1498b("merchant_id")
    public abstract String mMerchantId();

    @Nullable
    @InterfaceC1498b("merchant_reference_number")
    public abstract String mMerchantReferenceNumber();

    @Nullable
    @InterfaceC1498b("message")
    public abstract String mMessage();

    @Nullable
    @InterfaceC1498b(Constants.METHOD)
    public abstract String mMethod();

    @Nullable
    @InterfaceC1498b("biller_other_fields")
    public abstract List<BillerDynamicField> mOtherFields();

    @Nullable
    @InterfaceC1498b("p2p_target")
    public abstract String mP2PTarget();

    @Nullable
    @InterfaceC1498b("payment_id")
    public abstract String mPaymentId();

    @Nullable
    @InterfaceC1498b("payment_reference_no")
    public abstract String mPaymentReferenceNo();

    @Nullable
    @InterfaceC1498b("product_name")
    public abstract String mProductName();

    @Nullable
    public abstract String mProvider();

    @Nullable
    @InterfaceC1498b("recipient")
    public abstract String mRecipient();

    @Nullable
    @InterfaceC1498b("request_reference_no")
    public abstract String mRequestReferenceNo();

    @Nullable
    @InterfaceC1498b("scheme_type")
    public abstract String mSchemeType();

    @Nullable
    @InterfaceC1498b("status")
    public abstract String mStatus();

    @Nullable
    @InterfaceC1498b("status_display")
    public abstract String mStatusDisplay();

    @Nullable
    @InterfaceC1498b("timestamp")
    public abstract String mTimestamp();

    @Nullable
    @InterfaceC1498b("total_amount")
    public abstract TotalAmount mTotalAmount();

    @Nullable
    @InterfaceC1498b("trace_number")
    public abstract String mTraceNumber();

    @Nullable
    @InterfaceC1498b("trace_number_label")
    public abstract String mTraceNumberLabel();

    @Nullable
    public abstract TransferPersonalizationMeta mTransferPersonalizationMeta();

    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    public String setPaymentIdWithSpaces(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() < 12) {
            return str;
        }
        return str.substring(0, 4) + Global.BLANK + str.substring(4, 8) + Global.BLANK + str.substring(8, 12);
    }

    public abstract Builder toBuilder();
}
