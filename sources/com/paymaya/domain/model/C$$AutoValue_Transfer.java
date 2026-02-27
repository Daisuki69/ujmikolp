package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Transfer;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Transfer, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Transfer extends Transfer {
    private final String mAuthChallengeId;
    private final AccountBalance mBalance;
    private final CustomerAccountProductOffering mCustomerAccountProductOffering;
    private final DisplayName mDisplayName;
    private final Boolean mForAuthentication;
    private final String mMessage;
    private final Decoration mOldDecorationDetails;
    private final TransferPersonalization mPersonalization;
    private final String mRecipientPrimaryDestination;
    private final String mRecipientSecondaryDestination;
    private final String mRequestReferenceNo;
    private final Amount mTransferAmount;
    private final Amount mTransferFees;
    private final TransferRecipient mTransferRecipient;
    private final TransferSender mTransferSender;
    private final TransferToken mTransferToken;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Transfer$Builder */
    public static class Builder extends Transfer.Builder {
        private String mAuthChallengeId;
        private AccountBalance mBalance;
        private CustomerAccountProductOffering mCustomerAccountProductOffering;
        private DisplayName mDisplayName;
        private Boolean mForAuthentication;
        private String mMessage;
        private Decoration mOldDecorationDetails;
        private TransferPersonalization mPersonalization;
        private String mRecipientPrimaryDestination;
        private String mRecipientSecondaryDestination;
        private String mRequestReferenceNo;
        private Amount mTransferAmount;
        private Amount mTransferFees;
        private TransferRecipient mTransferRecipient;
        private TransferSender mTransferSender;
        private TransferToken mTransferToken;

        public /* synthetic */ Builder(Transfer transfer, int i) {
            this(transfer);
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer build() {
            return new AutoValue_Transfer(this.mTransferToken, this.mTransferSender, this.mTransferRecipient, this.mTransferAmount, this.mTransferFees, this.mMessage, this.mRequestReferenceNo, this.mBalance, this.mForAuthentication, this.mAuthChallengeId, this.mDisplayName, this.mCustomerAccountProductOffering, this.mPersonalization, this.mOldDecorationDetails, this.mRecipientPrimaryDestination, this.mRecipientSecondaryDestination);
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mAuthChallengeId(@Nullable String str) {
            this.mAuthChallengeId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mBalance(@Nullable AccountBalance accountBalance) {
            this.mBalance = accountBalance;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mCustomerAccountProductOffering(@Nullable CustomerAccountProductOffering customerAccountProductOffering) {
            this.mCustomerAccountProductOffering = customerAccountProductOffering;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mDisplayName(@Nullable DisplayName displayName) {
            this.mDisplayName = displayName;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mForAuthentication(Boolean bool) {
            this.mForAuthentication = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mMessage(@Nullable String str) {
            this.mMessage = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mOldDecorationDetails(@Nullable Decoration decoration) {
            this.mOldDecorationDetails = decoration;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mPersonalization(@Nullable TransferPersonalization transferPersonalization) {
            this.mPersonalization = transferPersonalization;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mRecipientPrimaryDestination(@Nullable String str) {
            this.mRecipientPrimaryDestination = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mRecipientSecondaryDestination(@Nullable String str) {
            this.mRecipientSecondaryDestination = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mRequestReferenceNo(@Nullable String str) {
            this.mRequestReferenceNo = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mTransferAmount(@Nullable Amount amount) {
            this.mTransferAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mTransferFees(Amount amount) {
            this.mTransferFees = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mTransferRecipient(@Nullable TransferRecipient transferRecipient) {
            this.mTransferRecipient = transferRecipient;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mTransferSender(@Nullable TransferSender transferSender) {
            this.mTransferSender = transferSender;
            return this;
        }

        @Override // com.paymaya.domain.model.Transfer.Builder
        public Transfer.Builder mTransferToken(TransferToken transferToken) {
            this.mTransferToken = transferToken;
            return this;
        }

        public Builder() {
        }

        private Builder(Transfer transfer) {
            this.mTransferToken = transfer.mTransferToken();
            this.mTransferSender = transfer.mTransferSender();
            this.mTransferRecipient = transfer.mTransferRecipient();
            this.mTransferAmount = transfer.mTransferAmount();
            this.mTransferFees = transfer.mTransferFees();
            this.mMessage = transfer.mMessage();
            this.mRequestReferenceNo = transfer.mRequestReferenceNo();
            this.mBalance = transfer.mBalance();
            this.mForAuthentication = transfer.mForAuthentication();
            this.mAuthChallengeId = transfer.mAuthChallengeId();
            this.mDisplayName = transfer.mDisplayName();
            this.mCustomerAccountProductOffering = transfer.mCustomerAccountProductOffering();
            this.mPersonalization = transfer.mPersonalization();
            this.mOldDecorationDetails = transfer.mOldDecorationDetails();
            this.mRecipientPrimaryDestination = transfer.mRecipientPrimaryDestination();
            this.mRecipientSecondaryDestination = transfer.mRecipientSecondaryDestination();
        }
    }

    public C$$AutoValue_Transfer(@Nullable TransferToken transferToken, @Nullable TransferSender transferSender, @Nullable TransferRecipient transferRecipient, @Nullable Amount amount, @Nullable Amount amount2, @Nullable String str, @Nullable String str2, @Nullable AccountBalance accountBalance, @Nullable Boolean bool, @Nullable String str3, @Nullable DisplayName displayName, @Nullable CustomerAccountProductOffering customerAccountProductOffering, @Nullable TransferPersonalization transferPersonalization, @Nullable Decoration decoration, @Nullable String str4, @Nullable String str5) {
        this.mTransferToken = transferToken;
        this.mTransferSender = transferSender;
        this.mTransferRecipient = transferRecipient;
        this.mTransferAmount = amount;
        this.mTransferFees = amount2;
        this.mMessage = str;
        this.mRequestReferenceNo = str2;
        this.mBalance = accountBalance;
        this.mForAuthentication = bool;
        this.mAuthChallengeId = str3;
        this.mDisplayName = displayName;
        this.mCustomerAccountProductOffering = customerAccountProductOffering;
        this.mPersonalization = transferPersonalization;
        this.mOldDecorationDetails = decoration;
        this.mRecipientPrimaryDestination = str4;
        this.mRecipientSecondaryDestination = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Transfer) {
            Transfer transfer = (Transfer) obj;
            TransferToken transferToken = this.mTransferToken;
            if (transferToken != null ? transferToken.equals(transfer.mTransferToken()) : transfer.mTransferToken() == null) {
                TransferSender transferSender = this.mTransferSender;
                if (transferSender != null ? transferSender.equals(transfer.mTransferSender()) : transfer.mTransferSender() == null) {
                    TransferRecipient transferRecipient = this.mTransferRecipient;
                    if (transferRecipient != null ? transferRecipient.equals(transfer.mTransferRecipient()) : transfer.mTransferRecipient() == null) {
                        Amount amount = this.mTransferAmount;
                        if (amount != null ? amount.equals(transfer.mTransferAmount()) : transfer.mTransferAmount() == null) {
                            Amount amount2 = this.mTransferFees;
                            if (amount2 != null ? amount2.equals(transfer.mTransferFees()) : transfer.mTransferFees() == null) {
                                String str = this.mMessage;
                                if (str != null ? str.equals(transfer.mMessage()) : transfer.mMessage() == null) {
                                    String str2 = this.mRequestReferenceNo;
                                    if (str2 != null ? str2.equals(transfer.mRequestReferenceNo()) : transfer.mRequestReferenceNo() == null) {
                                        AccountBalance accountBalance = this.mBalance;
                                        if (accountBalance != null ? accountBalance.equals(transfer.mBalance()) : transfer.mBalance() == null) {
                                            Boolean bool = this.mForAuthentication;
                                            if (bool != null ? bool.equals(transfer.mForAuthentication()) : transfer.mForAuthentication() == null) {
                                                String str3 = this.mAuthChallengeId;
                                                if (str3 != null ? str3.equals(transfer.mAuthChallengeId()) : transfer.mAuthChallengeId() == null) {
                                                    DisplayName displayName = this.mDisplayName;
                                                    if (displayName != null ? displayName.equals(transfer.mDisplayName()) : transfer.mDisplayName() == null) {
                                                        CustomerAccountProductOffering customerAccountProductOffering = this.mCustomerAccountProductOffering;
                                                        if (customerAccountProductOffering != null ? customerAccountProductOffering.equals(transfer.mCustomerAccountProductOffering()) : transfer.mCustomerAccountProductOffering() == null) {
                                                            TransferPersonalization transferPersonalization = this.mPersonalization;
                                                            if (transferPersonalization != null ? transferPersonalization.equals(transfer.mPersonalization()) : transfer.mPersonalization() == null) {
                                                                Decoration decoration = this.mOldDecorationDetails;
                                                                if (decoration != null ? decoration.equals(transfer.mOldDecorationDetails()) : transfer.mOldDecorationDetails() == null) {
                                                                    String str4 = this.mRecipientPrimaryDestination;
                                                                    if (str4 != null ? str4.equals(transfer.mRecipientPrimaryDestination()) : transfer.mRecipientPrimaryDestination() == null) {
                                                                        String str5 = this.mRecipientSecondaryDestination;
                                                                        if (str5 != null ? str5.equals(transfer.mRecipientSecondaryDestination()) : transfer.mRecipientSecondaryDestination() == null) {
                                                                            return true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        TransferToken transferToken = this.mTransferToken;
        int iHashCode = ((transferToken == null ? 0 : transferToken.hashCode()) ^ 1000003) * 1000003;
        TransferSender transferSender = this.mTransferSender;
        int iHashCode2 = (iHashCode ^ (transferSender == null ? 0 : transferSender.hashCode())) * 1000003;
        TransferRecipient transferRecipient = this.mTransferRecipient;
        int iHashCode3 = (iHashCode2 ^ (transferRecipient == null ? 0 : transferRecipient.hashCode())) * 1000003;
        Amount amount = this.mTransferAmount;
        int iHashCode4 = (iHashCode3 ^ (amount == null ? 0 : amount.hashCode())) * 1000003;
        Amount amount2 = this.mTransferFees;
        int iHashCode5 = (iHashCode4 ^ (amount2 == null ? 0 : amount2.hashCode())) * 1000003;
        String str = this.mMessage;
        int iHashCode6 = (iHashCode5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mRequestReferenceNo;
        int iHashCode7 = (iHashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        AccountBalance accountBalance = this.mBalance;
        int iHashCode8 = (iHashCode7 ^ (accountBalance == null ? 0 : accountBalance.hashCode())) * 1000003;
        Boolean bool = this.mForAuthentication;
        int iHashCode9 = (iHashCode8 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str3 = this.mAuthChallengeId;
        int iHashCode10 = (iHashCode9 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        DisplayName displayName = this.mDisplayName;
        int iHashCode11 = (iHashCode10 ^ (displayName == null ? 0 : displayName.hashCode())) * 1000003;
        CustomerAccountProductOffering customerAccountProductOffering = this.mCustomerAccountProductOffering;
        int iHashCode12 = (iHashCode11 ^ (customerAccountProductOffering == null ? 0 : customerAccountProductOffering.hashCode())) * 1000003;
        TransferPersonalization transferPersonalization = this.mPersonalization;
        int iHashCode13 = (iHashCode12 ^ (transferPersonalization == null ? 0 : transferPersonalization.hashCode())) * 1000003;
        Decoration decoration = this.mOldDecorationDetails;
        int iHashCode14 = (iHashCode13 ^ (decoration == null ? 0 : decoration.hashCode())) * 1000003;
        String str4 = this.mRecipientPrimaryDestination;
        int iHashCode15 = (iHashCode14 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mRecipientSecondaryDestination;
        return iHashCode15 ^ (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("auth_challenge_id")
    public String mAuthChallengeId() {
        return this.mAuthChallengeId;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("balance")
    public AccountBalance mBalance() {
        return this.mBalance;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("product_offering")
    public CustomerAccountProductOffering mCustomerAccountProductOffering() {
        return this.mCustomerAccountProductOffering;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("display_name")
    public DisplayName mDisplayName() {
        return this.mDisplayName;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("for_authentication")
    public Boolean mForAuthentication() {
        return this.mForAuthentication;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("message")
    public String mMessage() {
        return this.mMessage;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    public Decoration mOldDecorationDetails() {
        return this.mOldDecorationDetails;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("decoration")
    public TransferPersonalization mPersonalization() {
        return this.mPersonalization;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    public String mRecipientPrimaryDestination() {
        return this.mRecipientPrimaryDestination;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    public String mRecipientSecondaryDestination() {
        return this.mRecipientSecondaryDestination;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("request_reference_no")
    public String mRequestReferenceNo() {
        return this.mRequestReferenceNo;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("amount")
    public Amount mTransferAmount() {
        return this.mTransferAmount;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("fees")
    public Amount mTransferFees() {
        return this.mTransferFees;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("recipient")
    public TransferRecipient mTransferRecipient() {
        return this.mTransferRecipient;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("sender")
    public TransferSender mTransferSender() {
        return this.mTransferSender;
    }

    @Override // com.paymaya.domain.model.Transfer
    @Nullable
    @InterfaceC1498b("transfer_token")
    public TransferToken mTransferToken() {
        return this.mTransferToken;
    }

    @Override // com.paymaya.domain.model.Transfer
    public Transfer.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Transfer{mTransferToken=");
        sb2.append(this.mTransferToken);
        sb2.append(", mTransferSender=");
        sb2.append(this.mTransferSender);
        sb2.append(", mTransferRecipient=");
        sb2.append(this.mTransferRecipient);
        sb2.append(", mTransferAmount=");
        sb2.append(this.mTransferAmount);
        sb2.append(", mTransferFees=");
        sb2.append(this.mTransferFees);
        sb2.append(", mMessage=");
        sb2.append(this.mMessage);
        sb2.append(", mRequestReferenceNo=");
        sb2.append(this.mRequestReferenceNo);
        sb2.append(", mBalance=");
        sb2.append(this.mBalance);
        sb2.append(", mForAuthentication=");
        sb2.append(this.mForAuthentication);
        sb2.append(", mAuthChallengeId=");
        sb2.append(this.mAuthChallengeId);
        sb2.append(", mDisplayName=");
        sb2.append(this.mDisplayName);
        sb2.append(", mCustomerAccountProductOffering=");
        sb2.append(this.mCustomerAccountProductOffering);
        sb2.append(", mPersonalization=");
        sb2.append(this.mPersonalization);
        sb2.append(", mOldDecorationDetails=");
        sb2.append(this.mOldDecorationDetails);
        sb2.append(", mRecipientPrimaryDestination=");
        sb2.append(this.mRecipientPrimaryDestination);
        sb2.append(", mRecipientSecondaryDestination=");
        return s.p(sb2, this.mRecipientSecondaryDestination, "}");
    }
}
