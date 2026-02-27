package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.C$$AutoValue_Transfer;
import com.paymaya.domain.model.C$AutoValue_Transfer;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Transfer implements Parcelable {

    public static abstract class Builder {
        public abstract Transfer build();

        public abstract Builder mAuthChallengeId(@Nullable String str);

        public abstract Builder mBalance(@Nullable AccountBalance accountBalance);

        public abstract Builder mCustomerAccountProductOffering(@Nullable CustomerAccountProductOffering customerAccountProductOffering);

        public abstract Builder mDisplayName(@Nullable DisplayName displayName);

        public abstract Builder mForAuthentication(Boolean bool);

        public abstract Builder mMessage(@Nullable String str);

        public abstract Builder mOldDecorationDetails(@Nullable Decoration decoration);

        public abstract Builder mPersonalization(@Nullable TransferPersonalization transferPersonalization);

        public abstract Builder mRecipientPrimaryDestination(@Nullable String str);

        public abstract Builder mRecipientSecondaryDestination(@Nullable String str);

        public abstract Builder mRequestReferenceNo(@Nullable String str);

        public abstract Builder mTransferAmount(@Nullable Amount amount);

        public abstract Builder mTransferFees(Amount amount);

        public abstract Builder mTransferRecipient(@Nullable TransferRecipient transferRecipient);

        public abstract Builder mTransferSender(@Nullable TransferSender transferSender);

        public abstract Builder mTransferToken(TransferToken transferToken);
    }

    public static Transfer fromFavoriteDetails(FavoriteDetails favoriteDetails) {
        return fromJson(favoriteDetails.mTemplateJson()).toFavoriteTemplate();
    }

    public static Transfer fromJson(String str) {
        return (Transfer) A.f10366a.e(str, Transfer.class);
    }

    public static Transfer fromPadalaTransfer(PadalaTransfer padalaTransfer, TransferRecipient transferRecipient, Amount amount, String str) {
        TransferSender transferSenderBuild = padalaTransfer.mSource() != null ? TransferSender.sBuilder().mType(padalaTransfer.mSource().mType()).mValue(padalaTransfer.mSource().mValue()).build() : null;
        if (padalaTransfer.mTarget() != null) {
            transferRecipient = TransferRecipient.sBuilder().mType(padalaTransfer.mTarget().mType()).mValue(padalaTransfer.mTarget().mValue()).build();
        } else if (transferRecipient == null) {
            transferRecipient = null;
        }
        if (padalaTransfer.mAmount() != null) {
            amount = padalaTransfer.mAmount();
        } else if (amount == null) {
            amount = null;
        }
        return sBuilder().mTransferToken(padalaTransfer.mTransferToken()).mTransferSender(transferSenderBuild).mTransferRecipient(transferRecipient).mTransferAmount(amount).mTransferFees(padalaTransfer.mFees()).mRequestReferenceNo(padalaTransfer.mRequestReferenceNo()).mBalance(padalaTransfer.mBalance()).mMessage(str).build();
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Transfer.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Transfer.GsonTypeAdapter(jVar);
    }

    public String getDisplayFullName() {
        return mDisplayName().getFullName();
    }

    public String getFormattedAmount() {
        return mTransferAmount().getCurrencyFormattedValue();
    }

    public String getFormattedFee() {
        return mTransferFees().getCurrencyFormattedValue();
    }

    public String getFormattedUpdatedBalance() {
        return mBalance().mAvailableBalance().getCurrencyFormattedValue();
    }

    public boolean isForAuthentication() {
        return mForAuthentication() != null && mForAuthentication().booleanValue();
    }

    @Nullable
    @InterfaceC1498b("auth_challenge_id")
    public abstract String mAuthChallengeId();

    @Nullable
    @InterfaceC1498b("balance")
    public abstract AccountBalance mBalance();

    @Nullable
    @InterfaceC1498b("product_offering")
    public abstract CustomerAccountProductOffering mCustomerAccountProductOffering();

    @Nullable
    @InterfaceC1498b("display_name")
    public abstract DisplayName mDisplayName();

    @Nullable
    @InterfaceC1498b("for_authentication")
    public abstract Boolean mForAuthentication();

    @Nullable
    @InterfaceC1498b("message")
    public abstract String mMessage();

    @Nullable
    public abstract Decoration mOldDecorationDetails();

    @Nullable
    @InterfaceC1498b("decoration")
    public abstract TransferPersonalization mPersonalization();

    @Nullable
    public abstract String mRecipientPrimaryDestination();

    @Nullable
    public abstract String mRecipientSecondaryDestination();

    @Nullable
    @InterfaceC1498b("request_reference_no")
    public abstract String mRequestReferenceNo();

    @Nullable
    @InterfaceC1498b("amount")
    public abstract Amount mTransferAmount();

    @Nullable
    @InterfaceC1498b("fees")
    public abstract Amount mTransferFees();

    @Nullable
    @InterfaceC1498b("recipient")
    public abstract TransferRecipient mTransferRecipient();

    @Nullable
    @InterfaceC1498b("sender")
    public abstract TransferSender mTransferSender();

    @Nullable
    @InterfaceC1498b("transfer_token")
    public abstract TransferToken mTransferToken();

    public abstract Builder toBuilder();

    public Transfer toFavoriteTemplate() {
        return toBuilder().mTransferToken(null).mTransferSender(null).mBalance(null).mTransferFees(null).mRequestReferenceNo(null).mBalance(null).mForAuthentication(null).mAuthChallengeId(null).mDisplayName(null).mOldDecorationDetails(null).mPersonalization(null).mRecipientPrimaryDestination(null).mRecipientSecondaryDestination(null).build();
    }

    public String toJson() {
        return A.f10366a.l(this, Transfer.class);
    }
}
