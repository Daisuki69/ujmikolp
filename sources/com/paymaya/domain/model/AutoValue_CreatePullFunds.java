package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.CreatePullFunds;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CreatePullFunds extends C$AutoValue_CreatePullFunds {
    public static final Parcelable.Creator<AutoValue_CreatePullFunds> CREATOR = new Parcelable.Creator<AutoValue_CreatePullFunds>() { // from class: com.paymaya.domain.model.AutoValue_CreatePullFunds.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CreatePullFunds createFromParcel(Parcel parcel) {
            return new AutoValue_CreatePullFunds((Amount) parcel.readParcelable(CreatePullFunds.class.getClassLoader()), (Amount) parcel.readParcelable(CreatePullFunds.class.getClassLoader()), (PullFundsCard) parcel.readParcelable(CreatePullFunds.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CreatePullFunds[] newArray(int i) {
            return new AutoValue_CreatePullFunds[i];
        }
    };

    public AutoValue_CreatePullFunds(final Amount amount, final Amount amount2, @Nullable final PullFundsCard pullFundsCard, final String str, final String str2) {
        new C$$AutoValue_CreatePullFunds(amount, amount2, pullFundsCard, str, str2) { // from class: com.paymaya.domain.model.$AutoValue_CreatePullFunds

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_CreatePullFunds$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y pullFundsCard_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(CreatePullFunds)";
                }

                @Override // com.google.gson.y
                public CreatePullFunds read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    CreatePullFunds.Builder builderSBuilder = CreatePullFunds.sBuilder();
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
                                case "purchase_id":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mPurchaseId((String) yVarH5.read(aVar));
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
                public void write(b bVar, CreatePullFunds createPullFunds) throws IOException {
                    if (createPullFunds == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("amount");
                    if (createPullFunds.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.amount_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH;
                        }
                        yVarH.write(bVar, createPullFunds.mAmount());
                    }
                    bVar.m("fees");
                    if (createPullFunds.mFees() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.amount_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, createPullFunds.mFees());
                    }
                    bVar.m("card");
                    if (createPullFunds.mCard() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.pullFundsCard_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(PullFundsCard.class);
                            this.pullFundsCard_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, createPullFunds.mCard());
                    }
                    bVar.m("purchase_id");
                    if (createPullFunds.mPurchaseId() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, createPullFunds.mPurchaseId());
                    }
                    bVar.m("status");
                    if (createPullFunds.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, createPullFunds.mStatus());
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
        parcel.writeString(mStatus());
    }
}
