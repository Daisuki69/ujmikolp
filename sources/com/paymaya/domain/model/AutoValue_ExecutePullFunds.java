package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ExecutePullFunds;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ExecutePullFunds extends C$AutoValue_ExecutePullFunds {
    public static final Parcelable.Creator<AutoValue_ExecutePullFunds> CREATOR = new Parcelable.Creator<AutoValue_ExecutePullFunds>() { // from class: com.paymaya.domain.model.AutoValue_ExecutePullFunds.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ExecutePullFunds createFromParcel(Parcel parcel) {
            String string;
            String string2;
            Amount amount = (Amount) parcel.readParcelable(ExecutePullFunds.class.getClassLoader());
            Amount amount2 = (Amount) parcel.readParcelable(ExecutePullFunds.class.getClassLoader());
            PullFundsCard pullFundsCard = (PullFundsCard) parcel.readParcelable(ExecutePullFunds.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                string = parcel.readString();
                string2 = null;
            } else {
                string = null;
                string2 = null;
            }
            String string5 = parcel.readString();
            boolean z4 = parcel.readInt() == 1;
            if (parcel.readInt() == 0) {
                string2 = parcel.readString();
            }
            return new AutoValue_ExecutePullFunds(amount, amount2, pullFundsCard, string3, string4, string, string5, z4, string2, (RedirectUrls) parcel.readParcelable(ExecutePullFunds.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ExecutePullFunds[] newArray(int i) {
            return new AutoValue_ExecutePullFunds[i];
        }
    };

    public AutoValue_ExecutePullFunds(final Amount amount, final Amount amount2, @Nullable final PullFundsCard pullFundsCard, final String str, @Nullable final String str2, @Nullable final String str3, final String str4, final boolean z4, @Nullable final String str5, @Nullable final RedirectUrls redirectUrls) {
        new C$$AutoValue_ExecutePullFunds(amount, amount2, pullFundsCard, str, str2, str3, str4, z4, str5, redirectUrls) { // from class: com.paymaya.domain.model.$AutoValue_ExecutePullFunds

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ExecutePullFunds$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y pullFundsCard_adapter;
                private volatile y redirectUrls_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ExecutePullFunds)";
                }

                @Override // com.google.gson.y
                public ExecutePullFunds read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ExecutePullFunds.Builder builderSBuilder = ExecutePullFunds.sBuilder();
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
                                case "card":
                                    y yVarH3 = this.pullFundsCard_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(PullFundsCard.class);
                                        this.pullFundsCard_adapter = yVarH3;
                                    }
                                    builderSBuilder.mCard((PullFundsCard) yVarH3.read(aVar));
                                    break;
                                case "fees":
                                    y yVarH4 = this.amount_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH4;
                                    }
                                    builderSBuilder.mFees((Amount) yVarH4.read(aVar));
                                    break;
                                case "request_reference_no":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mRequestReferenceNo((String) yVarH5.read(aVar));
                                    break;
                                case "purchase_id":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mPurchaseId((String) yVarH6.read(aVar));
                                    break;
                                case "verification_url":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mVerificationUrl((String) yVarH7.read(aVar));
                                    break;
                                case "redirect_url":
                                    y yVarH8 = this.redirectUrls_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(RedirectUrls.class);
                                        this.redirectUrls_adapter = yVarH8;
                                    }
                                    builderSBuilder.mRedirectUrls((RedirectUrls) yVarH8.read(aVar));
                                    break;
                                case "payment_id":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mPaymentId((String) yVarH9.read(aVar));
                                    break;
                                case "is_paid":
                                    y yVarH10 = this.boolean__adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH10;
                                    }
                                    builderSBuilder.mIsPaid(((Boolean) yVarH10.read(aVar)).booleanValue());
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
                public void write(b bVar, ExecutePullFunds executePullFunds) throws IOException {
                    if (executePullFunds == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("amount");
                    if (executePullFunds.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.amount_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH;
                        }
                        yVarH.write(bVar, executePullFunds.mAmount());
                    }
                    bVar.m("fees");
                    if (executePullFunds.mFees() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.amount_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, executePullFunds.mFees());
                    }
                    bVar.m("card");
                    if (executePullFunds.mCard() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.pullFundsCard_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(PullFundsCard.class);
                            this.pullFundsCard_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, executePullFunds.mCard());
                    }
                    bVar.m("purchase_id");
                    if (executePullFunds.mPurchaseId() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, executePullFunds.mPurchaseId());
                    }
                    bVar.m("payment_id");
                    if (executePullFunds.mPaymentId() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, executePullFunds.mPaymentId());
                    }
                    bVar.m("request_reference_no");
                    if (executePullFunds.mRequestReferenceNo() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, executePullFunds.mRequestReferenceNo());
                    }
                    bVar.m("status");
                    if (executePullFunds.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, executePullFunds.mStatus());
                    }
                    bVar.m("is_paid");
                    y yVarH8 = this.boolean__adapter;
                    if (yVarH8 == null) {
                        yVarH8 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH8;
                    }
                    yVarH8.write(bVar, Boolean.valueOf(executePullFunds.mIsPaid()));
                    bVar.m("verification_url");
                    if (executePullFunds.mVerificationUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.string_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(String.class);
                            this.string_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, executePullFunds.mVerificationUrl());
                    }
                    bVar.m("redirect_url");
                    if (executePullFunds.mRedirectUrls() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.redirectUrls_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(RedirectUrls.class);
                            this.redirectUrls_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, executePullFunds.mRedirectUrls());
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
        parcel.writeParcelable(mAmount(), i);
        parcel.writeParcelable(mFees(), i);
        parcel.writeParcelable(mCard(), i);
        parcel.writeString(mPurchaseId());
        if (mPaymentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPaymentId());
        }
        if (mRequestReferenceNo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRequestReferenceNo());
        }
        parcel.writeString(mStatus());
        parcel.writeInt(mIsPaid() ? 1 : 0);
        if (mVerificationUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mVerificationUrl());
        }
        parcel.writeParcelable(mRedirectUrls(), i);
    }
}
