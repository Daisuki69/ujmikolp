package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BillerTransaction;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BillerTransaction extends C$AutoValue_BillerTransaction {
    public static final Parcelable.Creator<AutoValue_BillerTransaction> CREATOR = new Parcelable.Creator<AutoValue_BillerTransaction>() { // from class: com.paymaya.domain.model.AutoValue_BillerTransaction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerTransaction createFromParcel(Parcel parcel) {
            return new AutoValue_BillerTransaction(parcel.readInt() == 0 ? parcel.readString() : null, (BillerDetails) parcel.readParcelable(BillerTransaction.class.getClassLoader()), (Amount) parcel.readParcelable(BillerTransaction.class.getClassLoader()), (Amount) parcel.readParcelable(BillerTransaction.class.getClassLoader()), (Amount) parcel.readParcelable(BillerTransaction.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (AccountBalance) parcel.readParcelable(BillerTransaction.class.getClassLoader()), (BillerTransactionPayment) parcel.readParcelable(BillerTransaction.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerTransaction[] newArray(int i) {
            return new AutoValue_BillerTransaction[i];
        }
    };

    public AutoValue_BillerTransaction(@Nullable String str, BillerDetails billerDetails, Amount amount, @Nullable Amount amount2, @Nullable Amount amount3, @Nullable String str2, @Nullable AccountBalance accountBalance, @Nullable BillerTransactionPayment billerTransactionPayment, @Nullable String str3, @Nullable String str4) {
        new C$$AutoValue_BillerTransaction(str, billerDetails, amount, amount2, amount3, str2, accountBalance, billerTransactionPayment, str3, str4) { // from class: com.paymaya.domain.model.$AutoValue_BillerTransaction

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BillerTransaction$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y accountBalance_adapter;
                private volatile y amount_adapter;
                private volatile y billerDetails_adapter;
                private volatile y billerTransactionPayment_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BillerTransaction)";
                }

                @Override // com.google.gson.y
                public BillerTransaction read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BillerTransaction.Builder builderSBuilder = BillerTransaction.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "bill_payment_id":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mBillPaymentId((String) yVarH.read(aVar));
                                    break;
                                case "amount":
                                    y yVarH2 = this.amount_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH2;
                                    }
                                    builderSBuilder.mAmount((Amount) yVarH2.read(aVar));
                                    break;
                                case "biller":
                                    y yVarH3 = this.billerDetails_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(BillerDetails.class);
                                        this.billerDetails_adapter = yVarH3;
                                    }
                                    builderSBuilder.mBiller((BillerDetails) yVarH3.read(aVar));
                                    break;
                                case "totalAmount":
                                    y yVarH4 = this.amount_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH4;
                                    }
                                    builderSBuilder.mTotalAmount((Amount) yVarH4.read(aVar));
                                    break;
                                case "status":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mStatus((String) yVarH5.read(aVar));
                                    break;
                                case "payment":
                                    y yVarH6 = this.billerTransactionPayment_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(BillerTransactionPayment.class);
                                        this.billerTransactionPayment_adapter = yVarH6;
                                    }
                                    builderSBuilder.mBillerTransactionPayment((BillerTransactionPayment) yVarH6.read(aVar));
                                    break;
                                case "balance":
                                    y yVarH7 = this.accountBalance_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(AccountBalance.class);
                                        this.accountBalance_adapter = yVarH7;
                                    }
                                    builderSBuilder.mAccountBalance((AccountBalance) yVarH7.read(aVar));
                                    break;
                                case "fee":
                                    y yVarH8 = this.amount_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH8;
                                    }
                                    builderSBuilder.mFee((Amount) yVarH8.read(aVar));
                                    break;
                                case "created_date":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mCreatedDate((String) yVarH9.read(aVar));
                                    break;
                                default:
                                    if (!"mUserMin".equals(strE)) {
                                        aVar.Q();
                                        break;
                                    } else {
                                        y yVarH10 = this.string_adapter;
                                        if (yVarH10 == null) {
                                            yVarH10 = this.gson.h(String.class);
                                            this.string_adapter = yVarH10;
                                        }
                                        builderSBuilder.mUserMin((String) yVarH10.read(aVar));
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
                public void write(b bVar, BillerTransaction billerTransaction) throws IOException {
                    if (billerTransaction == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("bill_payment_id");
                    if (billerTransaction.mBillPaymentId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, billerTransaction.mBillPaymentId());
                    }
                    bVar.m("biller");
                    if (billerTransaction.mBiller() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.billerDetails_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(BillerDetails.class);
                            this.billerDetails_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, billerTransaction.mBiller());
                    }
                    bVar.m("amount");
                    if (billerTransaction.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.amount_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, billerTransaction.mAmount());
                    }
                    bVar.m("fee");
                    if (billerTransaction.mFee() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.amount_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, billerTransaction.mFee());
                    }
                    bVar.m("totalAmount");
                    if (billerTransaction.mTotalAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.amount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, billerTransaction.mTotalAmount());
                    }
                    bVar.m("status");
                    if (billerTransaction.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, billerTransaction.mStatus());
                    }
                    bVar.m("balance");
                    if (billerTransaction.mAccountBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.accountBalance_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(AccountBalance.class);
                            this.accountBalance_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, billerTransaction.mAccountBalance());
                    }
                    bVar.m("payment");
                    if (billerTransaction.mBillerTransactionPayment() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.billerTransactionPayment_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(BillerTransactionPayment.class);
                            this.billerTransactionPayment_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, billerTransaction.mBillerTransactionPayment());
                    }
                    bVar.m("created_date");
                    if (billerTransaction.mCreatedDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.string_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(String.class);
                            this.string_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, billerTransaction.mCreatedDate());
                    }
                    bVar.m("mUserMin");
                    if (billerTransaction.mUserMin() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, billerTransaction.mUserMin());
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
        if (mBillPaymentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBillPaymentId());
        }
        parcel.writeParcelable(mBiller(), i);
        parcel.writeParcelable(mAmount(), i);
        parcel.writeParcelable(mFee(), i);
        parcel.writeParcelable(mTotalAmount(), i);
        if (mStatus() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mStatus());
        }
        parcel.writeParcelable(mAccountBalance(), i);
        parcel.writeParcelable(mBillerTransactionPayment(), i);
        if (mCreatedDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCreatedDate());
        }
        if (mUserMin() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mUserMin());
        }
    }
}
