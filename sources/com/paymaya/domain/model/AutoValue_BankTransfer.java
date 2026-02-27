package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BankTransfer;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BankTransfer extends C$AutoValue_BankTransfer {
    public static final Parcelable.Creator<AutoValue_BankTransfer> CREATOR = new Parcelable.Creator<AutoValue_BankTransfer>() { // from class: com.paymaya.domain.model.AutoValue_BankTransfer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BankTransfer createFromParcel(Parcel parcel) {
            return new AutoValue_BankTransfer((BankTransferRecipient) parcel.readParcelable(BankTransfer.class.getClassLoader()), (Amount) parcel.readParcelable(BankTransfer.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (BankTransferBank) parcel.readParcelable(BankTransfer.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Amount) parcel.readParcelable(BankTransfer.class.getClassLoader()), (AccountBalance) parcel.readParcelable(BankTransfer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BankTransfer[] newArray(int i) {
            return new AutoValue_BankTransfer[i];
        }
    };

    public AutoValue_BankTransfer(@Nullable final BankTransferRecipient bankTransferRecipient, @Nullable final Amount amount, @Nullable final String str, @Nullable final String str2, @Nullable final BankTransferBank bankTransferBank, @Nullable final String str3, @Nullable final String str4, @Nullable final Amount amount2, @Nullable final AccountBalance accountBalance) {
        new C$$AutoValue_BankTransfer(bankTransferRecipient, amount, str, str2, bankTransferBank, str3, str4, amount2, accountBalance) { // from class: com.paymaya.domain.model.$AutoValue_BankTransfer

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BankTransfer$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y accountBalance_adapter;
                private volatile y amount_adapter;
                private volatile y bankTransferBank_adapter;
                private volatile y bankTransferRecipient_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BankTransfer)";
                }

                @Override // com.google.gson.y
                public BankTransfer read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BankTransfer.Builder builderSBuilder = BankTransfer.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "amount":
                                    y yVarH = this.amount_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH;
                                    }
                                    builderSBuilder.mAmount((Amount) yVarH.read(aVar));
                                    break;
                                case "status":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mStatus((String) yVarH2.read(aVar));
                                    break;
                                case "balance":
                                    y yVarH3 = this.accountBalance_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(AccountBalance.class);
                                        this.accountBalance_adapter = yVarH3;
                                    }
                                    builderSBuilder.mBalance((AccountBalance) yVarH3.read(aVar));
                                    break;
                                case "purpose":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mPurpose((String) yVarH4.read(aVar));
                                    break;
                                case "id":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mId((String) yVarH5.read(aVar));
                                    break;
                                case "bank":
                                    y yVarH6 = this.bankTransferBank_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(BankTransferBank.class);
                                        this.bankTransferBank_adapter = yVarH6;
                                    }
                                    builderSBuilder.mBankTransferBank((BankTransferBank) yVarH6.read(aVar));
                                    break;
                                case "fees":
                                    y yVarH7 = this.amount_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH7;
                                    }
                                    builderSBuilder.mFees((Amount) yVarH7.read(aVar));
                                    break;
                                case "recipient":
                                    y yVarH8 = this.bankTransferRecipient_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(BankTransferRecipient.class);
                                        this.bankTransferRecipient_adapter = yVarH8;
                                    }
                                    builderSBuilder.mBankTransferRecipient((BankTransferRecipient) yVarH8.read(aVar));
                                    break;
                                case "message":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mMessage((String) yVarH9.read(aVar));
                                    break;
                                default:
                                    aVar.Q();
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
                public void write(b bVar, BankTransfer bankTransfer) throws IOException {
                    if (bankTransfer == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("recipient");
                    if (bankTransfer.mBankTransferRecipient() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.bankTransferRecipient_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(BankTransferRecipient.class);
                            this.bankTransferRecipient_adapter = yVarH;
                        }
                        yVarH.write(bVar, bankTransfer.mBankTransferRecipient());
                    }
                    bVar.m("amount");
                    if (bankTransfer.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.amount_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, bankTransfer.mAmount());
                    }
                    bVar.m("message");
                    if (bankTransfer.mMessage() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, bankTransfer.mMessage());
                    }
                    bVar.m("purpose");
                    if (bankTransfer.mPurpose() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, bankTransfer.mPurpose());
                    }
                    bVar.m("bank");
                    if (bankTransfer.mBankTransferBank() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.bankTransferBank_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(BankTransferBank.class);
                            this.bankTransferBank_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, bankTransfer.mBankTransferBank());
                    }
                    bVar.m(TtmlNode.ATTR_ID);
                    if (bankTransfer.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, bankTransfer.mId());
                    }
                    bVar.m("status");
                    if (bankTransfer.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, bankTransfer.mStatus());
                    }
                    bVar.m("fees");
                    if (bankTransfer.mFees() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.amount_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, bankTransfer.mFees());
                    }
                    bVar.m("balance");
                    if (bankTransfer.mBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.accountBalance_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(AccountBalance.class);
                            this.accountBalance_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, bankTransfer.mBalance());
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
        parcel.writeParcelable(mBankTransferRecipient(), i);
        parcel.writeParcelable(mAmount(), i);
        if (mMessage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMessage());
        }
        if (mPurpose() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPurpose());
        }
        parcel.writeParcelable(mBankTransferBank(), i);
        if (mId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mId());
        }
        if (mStatus() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mStatus());
        }
        parcel.writeParcelable(mFees(), i);
        parcel.writeParcelable(mBalance(), i);
    }
}
