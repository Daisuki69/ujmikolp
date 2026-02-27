package com.paymaya.domain.model;

import Ah.h;
import Gh.c;
import Kh.C0305j;
import Kh.C0312q;
import Kh.H;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.impl.e;
import bg.AbstractC0983W;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.n;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_LoanInstance;
import com.paymaya.domain.model.C$AutoValue_LoanInstance;
import com.paymaya.domain.model.LoanItem;
import g3.InterfaceC1498b;
import java.text.NumberFormat;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LoanInstance implements Parcelable, LoanItem, Billable {

    public static abstract class Builder {
        public abstract LoanInstance build();

        public abstract Builder mBillerSlug(String str);

        public abstract Builder mDescription(String str);

        public abstract Builder mId(String str);

        public abstract Builder mInterestRate(String str);

        public abstract Builder mLoanId(String str);

        public abstract Builder mLoanProviderLogo(ImageUrl imageUrl);

        public abstract Builder mLoanTerm(Term term);

        public abstract Builder mName(String str);

        public abstract Builder mNetDisbursementAmount(Amount amount);

        public abstract Builder mPaymentDueDate(String str);

        public abstract Builder mPrincipal(Amount amount);

        public abstract Builder mProcessingFee(Amount amount);

        public abstract Builder mProductKey(String str);

        public abstract Builder mRemainingDays(Term term);

        public abstract Builder mRepaymentAmount(Amount amount);

        public abstract Builder mStatus(String str);

        public abstract Builder mSubmissionDate(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getRemainingDaysUnit$0(String str) throws Throwable {
        return !C.e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getRemainingDaysUnit$1(String str) throws Throwable {
        return Integer.parseInt(getRemainingDays()) == 1 ? str.substring(0, str.length() - 1).toLowerCase() : str.toLowerCase();
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_LoanInstance.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_LoanInstance.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.Billable
    public String getAccountNumber() {
        return mLoanId();
    }

    @Override // com.paymaya.domain.model.Billable
    public Amount getAmount() {
        return mRepaymentAmount();
    }

    @Override // com.paymaya.domain.model.Billable
    public String getBillerSlug() {
        return mBillerSlug();
    }

    public String getInterestPercentage() {
        Float fValueOf = Float.valueOf(Float.parseFloat(mInterestRate()));
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(2);
        return percentInstance.format(fValueOf);
    }

    public int getMaxTerm() {
        return Integer.parseInt(mLoanTerm().mValue());
    }

    public String getPaymentDueDate() {
        return (mStatus().equalsIgnoreCase("processing") || mStatus().equalsIgnoreCase("paid") || mStatus().equalsIgnoreCase("unprocessed")) ? "" : AbstractC1234x.h(AbstractC1234x.b(mPaymentDueDate()));
    }

    public int getProgress() {
        if (!mStatus().equalsIgnoreCase("overdue") && mStatus().equalsIgnoreCase(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)) {
            return (int) Math.round(Double.parseDouble(mLoanTerm().mValue()) - Double.parseDouble(getRemainingDays()));
        }
        return 0;
    }

    public String getRemainingDays() {
        return !C.e(mRemainingDays()) ? String.valueOf((int) Math.ceil(Math.abs(Double.parseDouble(mRemainingDays().mValue())))) : "";
    }

    public String getRemainingDaysUnit() {
        if (C.e(mRemainingDays())) {
            return "";
        }
        C0305j c0305jC = h.d(mRemainingDays().mUnit()).c(new n(13));
        e eVar = new e(this, 18);
        c cVar = new c(1, 0);
        try {
            try {
                c0305jC.g(new C0312q(new H(cVar, 0), eVar, 1));
                Object objB = cVar.b();
                if (objB != null) {
                    return (String) objB;
                }
                throw new NoSuchElementException();
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                E1.c.k(th2);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th2);
                throw nullPointerException;
            }
        } catch (NullPointerException e7) {
            throw e7;
        } catch (Throwable th3) {
            throw AbstractC1213b.L(th3, "subscribeActual failed", th3);
        }
    }

    public String getSubmissionDate() {
        return AbstractC1234x.h(AbstractC1234x.b(mSubmissionDate()));
    }

    @Override // com.paymaya.domain.model.LoanItem
    public LoanItem.VIEW_TYPE getViewType() {
        return LoanItem.VIEW_TYPE.VIEW_TYPE_LOAN_INSTANCE;
    }

    @InterfaceC1498b("biller_slug")
    public abstract String mBillerSlug();

    @InterfaceC1498b("description")
    public abstract String mDescription();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b("interest_rate")
    public abstract String mInterestRate();

    @Nullable
    @InterfaceC1498b("loan_id")
    public abstract String mLoanId();

    @InterfaceC1498b("loan_provider_logo")
    public abstract ImageUrl mLoanProviderLogo();

    @InterfaceC1498b("loan_term")
    public abstract Term mLoanTerm();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b("net_disbursement_amount")
    public abstract Amount mNetDisbursementAmount();

    @Nullable
    @InterfaceC1498b("payment_due_date")
    public abstract String mPaymentDueDate();

    @InterfaceC1498b("principal")
    public abstract Amount mPrincipal();

    @InterfaceC1498b("processing_fee")
    public abstract Amount mProcessingFee();

    @InterfaceC1498b("product_key")
    public abstract String mProductKey();

    @Nullable
    @InterfaceC1498b("remaining_days")
    public abstract Term mRemainingDays();

    @InterfaceC1498b("repayment_amount")
    public abstract Amount mRepaymentAmount();

    @InterfaceC1498b("status")
    public abstract String mStatus();

    @InterfaceC1498b("submission_date")
    public abstract String mSubmissionDate();
}
