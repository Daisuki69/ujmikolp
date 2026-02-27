package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.C$$AutoValue_BankTransfer;
import com.paymaya.domain.model.C$AutoValue_BankTransfer;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BankTransfer implements Parcelable {

    public static abstract class Builder {
        public abstract BankTransfer build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mBalance(AccountBalance accountBalance);

        public abstract Builder mBankTransferBank(BankTransferBank bankTransferBank);

        public abstract Builder mBankTransferRecipient(BankTransferRecipient bankTransferRecipient);

        public abstract Builder mFees(Amount amount);

        public abstract Builder mId(String str);

        public abstract Builder mMessage(String str);

        public abstract Builder mPurpose(String str);

        public abstract Builder mStatus(String str);
    }

    public static BankTransfer fromJson(String str) {
        return (BankTransfer) A.f10366a.e(str, BankTransfer.class);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BankTransfer.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BankTransfer.GsonTypeAdapter(jVar);
    }

    public String getAccountFirstAndLastName() {
        return mBankTransferBank().mBankAccount().getAccountFirstAndLastName();
    }

    public String getAccountName() {
        return mBankTransferBank().mBankAccount().getAccountName();
    }

    public String getAccountNumber() {
        return mBankTransferRecipient().mValue();
    }

    public String getAmountFormattedValue() {
        return mAmount().getCurrencyFormattedValue();
    }

    public String getBankName() {
        return mBankTransferBank().mBankName();
    }

    public String getFeesFormattedValue() {
        return mFees().getCurrencyFormattedValue();
    }

    public String getFormattedAmount() {
        return mAmount().getFormattedValue();
    }

    public String getFormattedUpdatedBalance() {
        return mBalance().mAvailableBalance().getCurrencyFormattedValue();
    }

    public String getParsedReferenceId() {
        return mId().length() < 12 ? mId() : mId().substring(mId().length() - 12);
    }

    public String getRecipientMobileNumber() {
        return mBankTransferBank().mBankAccount().mRecipientMobileNumber();
    }

    @Nullable
    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @Nullable
    @InterfaceC1498b("balance")
    public abstract AccountBalance mBalance();

    @Nullable
    @InterfaceC1498b("bank")
    public abstract BankTransferBank mBankTransferBank();

    @Nullable
    @InterfaceC1498b("recipient")
    public abstract BankTransferRecipient mBankTransferRecipient();

    @Nullable
    @InterfaceC1498b("fees")
    public abstract Amount mFees();

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("message")
    public abstract String mMessage();

    @Nullable
    @InterfaceC1498b("purpose")
    public abstract String mPurpose();

    @Nullable
    @InterfaceC1498b("status")
    public abstract String mStatus();

    public abstract Builder toBuilder();

    public BankTransfer toFavoriteTemplate() {
        return toBuilder().mStatus(null).mMessage(null).mBalance(null).mFees(null).mId(null).build();
    }

    public String toJson() {
        return A.f10366a.l(this, BankTransfer.class);
    }
}
