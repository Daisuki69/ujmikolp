package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Transfer;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Transfer extends C$AutoValue_Transfer {
    public static final Parcelable.Creator<AutoValue_Transfer> CREATOR = new Parcelable.Creator<AutoValue_Transfer>() { // from class: com.paymaya.domain.model.AutoValue_Transfer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Transfer createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Decoration decoration;
            TransferSender transferSender;
            Amount amount;
            String str;
            AccountBalance accountBalance;
            DisplayName displayName;
            String string;
            TransferToken transferToken = (TransferToken) parcel.readParcelable(Transfer.class.getClassLoader());
            TransferSender transferSender2 = (TransferSender) parcel.readParcelable(Transfer.class.getClassLoader());
            TransferRecipient transferRecipient = (TransferRecipient) parcel.readParcelable(Transfer.class.getClassLoader());
            Amount amount2 = (Amount) parcel.readParcelable(Transfer.class.getClassLoader());
            Amount amount3 = (Amount) parcel.readParcelable(Transfer.class.getClassLoader());
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string3 = parcel.readInt() == 0 ? parcel.readString() : null;
            AccountBalance accountBalance2 = (AccountBalance) parcel.readParcelable(Transfer.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                boolValueOf = null;
            }
            String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
            DisplayName displayName2 = (DisplayName) parcel.readParcelable(Transfer.class.getClassLoader());
            CustomerAccountProductOffering customerAccountProductOffering = (CustomerAccountProductOffering) parcel.readParcelable(Transfer.class.getClassLoader());
            TransferPersonalization transferPersonalization = (TransferPersonalization) parcel.readParcelable(Transfer.class.getClassLoader());
            Decoration decoration2 = (Decoration) parcel.readParcelable(Transfer.class.getClassLoader());
            String string5 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                decoration = decoration2;
                transferSender = transferSender2;
                amount = amount2;
                str = string2;
                accountBalance = accountBalance2;
                displayName = displayName2;
                string = parcel.readString();
            } else {
                decoration = decoration2;
                transferSender = transferSender2;
                amount = amount2;
                str = string2;
                accountBalance = accountBalance2;
                displayName = displayName2;
                string = null;
            }
            return new AutoValue_Transfer(transferToken, transferSender, transferRecipient, amount, amount3, str, string3, accountBalance, boolValueOf, string4, displayName, customerAccountProductOffering, transferPersonalization, decoration, string5, string);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Transfer[] newArray(int i) {
            return new AutoValue_Transfer[i];
        }
    };

    public AutoValue_Transfer(@Nullable final TransferToken transferToken, @Nullable final TransferSender transferSender, @Nullable final TransferRecipient transferRecipient, @Nullable final Amount amount, @Nullable final Amount amount2, @Nullable final String str, @Nullable final String str2, @Nullable final AccountBalance accountBalance, @Nullable final Boolean bool, @Nullable final String str3, @Nullable final DisplayName displayName, @Nullable final CustomerAccountProductOffering customerAccountProductOffering, @Nullable final TransferPersonalization transferPersonalization, @Nullable final Decoration decoration, @Nullable final String str4, @Nullable final String str5) {
        new C$$AutoValue_Transfer(transferToken, transferSender, transferRecipient, amount, amount2, str, str2, accountBalance, bool, str3, displayName, customerAccountProductOffering, transferPersonalization, decoration, str4, str5) { // from class: com.paymaya.domain.model.$AutoValue_Transfer

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Transfer$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y accountBalance_adapter;
                private volatile y amount_adapter;
                private volatile y boolean__adapter;
                private volatile y customerAccountProductOffering_adapter;
                private volatile y decoration_adapter;
                private volatile y displayName_adapter;
                private final j gson;
                private volatile y string_adapter;
                private volatile y transferPersonalization_adapter;
                private volatile y transferRecipient_adapter;
                private volatile y transferSender_adapter;
                private volatile y transferToken_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Transfer)";
                }

                @Override // com.google.gson.y
                public Transfer read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Transfer.Builder builderSBuilder = Transfer.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "auth_challenge_id":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mAuthChallengeId((String) yVarH.read(aVar));
                                    break;
                                case "amount":
                                    y yVarH2 = this.amount_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH2;
                                    }
                                    builderSBuilder.mTransferAmount((Amount) yVarH2.read(aVar));
                                    break;
                                case "sender":
                                    y yVarH3 = this.transferSender_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(TransferSender.class);
                                        this.transferSender_adapter = yVarH3;
                                    }
                                    builderSBuilder.mTransferSender((TransferSender) yVarH3.read(aVar));
                                    break;
                                case "decoration":
                                    y yVarH4 = this.transferPersonalization_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(TransferPersonalization.class);
                                        this.transferPersonalization_adapter = yVarH4;
                                    }
                                    builderSBuilder.mPersonalization((TransferPersonalization) yVarH4.read(aVar));
                                    break;
                                case "balance":
                                    y yVarH5 = this.accountBalance_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(AccountBalance.class);
                                        this.accountBalance_adapter = yVarH5;
                                    }
                                    builderSBuilder.mBalance((AccountBalance) yVarH5.read(aVar));
                                    break;
                                case "fees":
                                    y yVarH6 = this.amount_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH6;
                                    }
                                    builderSBuilder.mTransferFees((Amount) yVarH6.read(aVar));
                                    break;
                                case "request_reference_no":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mRequestReferenceNo((String) yVarH7.read(aVar));
                                    break;
                                case "for_authentication":
                                    y yVarH8 = this.boolean__adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH8;
                                    }
                                    builderSBuilder.mForAuthentication((Boolean) yVarH8.read(aVar));
                                    break;
                                case "recipient":
                                    y yVarH9 = this.transferRecipient_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(TransferRecipient.class);
                                        this.transferRecipient_adapter = yVarH9;
                                    }
                                    builderSBuilder.mTransferRecipient((TransferRecipient) yVarH9.read(aVar));
                                    break;
                                case "message":
                                    y yVarH10 = this.string_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(String.class);
                                        this.string_adapter = yVarH10;
                                    }
                                    builderSBuilder.mMessage((String) yVarH10.read(aVar));
                                    break;
                                case "display_name":
                                    y yVarH11 = this.displayName_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(DisplayName.class);
                                        this.displayName_adapter = yVarH11;
                                    }
                                    builderSBuilder.mDisplayName((DisplayName) yVarH11.read(aVar));
                                    break;
                                case "product_offering":
                                    y yVarH12 = this.customerAccountProductOffering_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(CustomerAccountProductOffering.class);
                                        this.customerAccountProductOffering_adapter = yVarH12;
                                    }
                                    builderSBuilder.mCustomerAccountProductOffering((CustomerAccountProductOffering) yVarH12.read(aVar));
                                    break;
                                case "transfer_token":
                                    y yVarH13 = this.transferToken_adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(TransferToken.class);
                                        this.transferToken_adapter = yVarH13;
                                    }
                                    builderSBuilder.mTransferToken((TransferToken) yVarH13.read(aVar));
                                    break;
                                default:
                                    if ("mOldDecorationDetails".equals(strE)) {
                                        y yVarH14 = this.decoration_adapter;
                                        if (yVarH14 == null) {
                                            yVarH14 = this.gson.h(Decoration.class);
                                            this.decoration_adapter = yVarH14;
                                        }
                                        builderSBuilder.mOldDecorationDetails((Decoration) yVarH14.read(aVar));
                                        break;
                                    } else {
                                        if ("mRecipientPrimaryDestination".equals(strE)) {
                                            y yVarH15 = this.string_adapter;
                                            if (yVarH15 == null) {
                                                yVarH15 = this.gson.h(String.class);
                                                this.string_adapter = yVarH15;
                                            }
                                            builderSBuilder.mRecipientPrimaryDestination((String) yVarH15.read(aVar));
                                        } else if (!"mRecipientSecondaryDestination".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH16 = this.string_adapter;
                                            if (yVarH16 == null) {
                                                yVarH16 = this.gson.h(String.class);
                                                this.string_adapter = yVarH16;
                                            }
                                            builderSBuilder.mRecipientSecondaryDestination((String) yVarH16.read(aVar));
                                        }
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            aVar.G();
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, Transfer transfer) throws IOException {
                    if (transfer == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("transfer_token");
                    if (transfer.mTransferToken() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.transferToken_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(TransferToken.class);
                            this.transferToken_adapter = yVarH;
                        }
                        yVarH.write(bVar, transfer.mTransferToken());
                    }
                    bVar.m("sender");
                    if (transfer.mTransferSender() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.transferSender_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(TransferSender.class);
                            this.transferSender_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, transfer.mTransferSender());
                    }
                    bVar.m("recipient");
                    if (transfer.mTransferRecipient() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.transferRecipient_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(TransferRecipient.class);
                            this.transferRecipient_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, transfer.mTransferRecipient());
                    }
                    bVar.m("amount");
                    if (transfer.mTransferAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.amount_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, transfer.mTransferAmount());
                    }
                    bVar.m("fees");
                    if (transfer.mTransferFees() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.amount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, transfer.mTransferFees());
                    }
                    bVar.m("message");
                    if (transfer.mMessage() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, transfer.mMessage());
                    }
                    bVar.m("request_reference_no");
                    if (transfer.mRequestReferenceNo() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, transfer.mRequestReferenceNo());
                    }
                    bVar.m("balance");
                    if (transfer.mBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.accountBalance_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(AccountBalance.class);
                            this.accountBalance_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, transfer.mBalance());
                    }
                    bVar.m("for_authentication");
                    if (transfer.mForAuthentication() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.boolean__adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH9;
                        }
                        yVarH9.write(bVar, transfer.mForAuthentication());
                    }
                    bVar.m("auth_challenge_id");
                    if (transfer.mAuthChallengeId() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, transfer.mAuthChallengeId());
                    }
                    bVar.m("display_name");
                    if (transfer.mDisplayName() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.displayName_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(DisplayName.class);
                            this.displayName_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, transfer.mDisplayName());
                    }
                    bVar.m("product_offering");
                    if (transfer.mCustomerAccountProductOffering() == null) {
                        bVar.r();
                    } else {
                        y yVarH12 = this.customerAccountProductOffering_adapter;
                        if (yVarH12 == null) {
                            yVarH12 = this.gson.h(CustomerAccountProductOffering.class);
                            this.customerAccountProductOffering_adapter = yVarH12;
                        }
                        yVarH12.write(bVar, transfer.mCustomerAccountProductOffering());
                    }
                    bVar.m("decoration");
                    if (transfer.mPersonalization() == null) {
                        bVar.r();
                    } else {
                        y yVarH13 = this.transferPersonalization_adapter;
                        if (yVarH13 == null) {
                            yVarH13 = this.gson.h(TransferPersonalization.class);
                            this.transferPersonalization_adapter = yVarH13;
                        }
                        yVarH13.write(bVar, transfer.mPersonalization());
                    }
                    bVar.m("mOldDecorationDetails");
                    if (transfer.mOldDecorationDetails() == null) {
                        bVar.r();
                    } else {
                        y yVarH14 = this.decoration_adapter;
                        if (yVarH14 == null) {
                            yVarH14 = this.gson.h(Decoration.class);
                            this.decoration_adapter = yVarH14;
                        }
                        yVarH14.write(bVar, transfer.mOldDecorationDetails());
                    }
                    bVar.m("mRecipientPrimaryDestination");
                    if (transfer.mRecipientPrimaryDestination() == null) {
                        bVar.r();
                    } else {
                        y yVarH15 = this.string_adapter;
                        if (yVarH15 == null) {
                            yVarH15 = this.gson.h(String.class);
                            this.string_adapter = yVarH15;
                        }
                        yVarH15.write(bVar, transfer.mRecipientPrimaryDestination());
                    }
                    bVar.m("mRecipientSecondaryDestination");
                    if (transfer.mRecipientSecondaryDestination() == null) {
                        bVar.r();
                    } else {
                        y yVarH16 = this.string_adapter;
                        if (yVarH16 == null) {
                            yVarH16 = this.gson.h(String.class);
                            this.string_adapter = yVarH16;
                        }
                        yVarH16.write(bVar, transfer.mRecipientSecondaryDestination());
                    }
                    bVar.k();
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mTransferToken(), i);
        parcel.writeParcelable(mTransferSender(), i);
        parcel.writeParcelable(mTransferRecipient(), i);
        parcel.writeParcelable(mTransferAmount(), i);
        parcel.writeParcelable(mTransferFees(), i);
        if (mMessage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMessage());
        }
        if (mRequestReferenceNo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRequestReferenceNo());
        }
        parcel.writeParcelable(mBalance(), i);
        if (mForAuthentication() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mForAuthentication().booleanValue() ? 1 : 0);
        }
        if (mAuthChallengeId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAuthChallengeId());
        }
        parcel.writeParcelable(mDisplayName(), i);
        parcel.writeParcelable(mCustomerAccountProductOffering(), i);
        parcel.writeParcelable(mPersonalization(), i);
        parcel.writeParcelable(mOldDecorationDetails(), i);
        if (mRecipientPrimaryDestination() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRecipientPrimaryDestination());
        }
        if (mRecipientSecondaryDestination() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRecipientSecondaryDestination());
        }
    }
}
