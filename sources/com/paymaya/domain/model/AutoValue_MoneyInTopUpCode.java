package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MoneyInTopUpCode;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MoneyInTopUpCode extends C$AutoValue_MoneyInTopUpCode {
    public static final Parcelable.Creator<AutoValue_MoneyInTopUpCode> CREATOR = new Parcelable.Creator<AutoValue_MoneyInTopUpCode>() { // from class: com.paymaya.domain.model.AutoValue_MoneyInTopUpCode.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MoneyInTopUpCode createFromParcel(Parcel parcel) {
            return new AutoValue_MoneyInTopUpCode(parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(MoneyInTopUpCode.class.getClassLoader()), (Amount) parcel.readParcelable(MoneyInTopUpCode.class.getClassLoader()), (Amount) parcel.readParcelable(MoneyInTopUpCode.class.getClassLoader()), (Amount) parcel.readParcelable(MoneyInTopUpCode.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MoneyInTopUpCode[] newArray(int i) {
            return new AutoValue_MoneyInTopUpCode[i];
        }
    };

    public AutoValue_MoneyInTopUpCode(final String str, final String str2, final Amount amount, @Nullable final Amount amount2, @Nullable final Amount amount3, @Nullable final Amount amount4) {
        new C$$AutoValue_MoneyInTopUpCode(str, str2, amount, amount2, amount3, amount4) { // from class: com.paymaya.domain.model.$AutoValue_MoneyInTopUpCode

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MoneyInTopUpCode$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MoneyInTopUpCode)";
                }

                @Override // com.google.gson.y
                public MoneyInTopUpCode read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MoneyInTopUpCode.Builder builderSBuilder = MoneyInTopUpCode.sBuilder();
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
                                case "original_amount":
                                    y yVarH2 = this.amount_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH2;
                                    }
                                    builderSBuilder.mOriginalAmount((Amount) yVarH2.read(aVar));
                                    break;
                                case "fee":
                                    y yVarH3 = this.amount_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH3;
                                    }
                                    builderSBuilder.mFee((Amount) yVarH3.read(aVar));
                                    break;
                                case "code":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mCode((String) yVarH4.read(aVar));
                                    break;
                                case "total_amount":
                                    y yVarH5 = this.amount_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH5;
                                    }
                                    builderSBuilder.mTotalAmount((Amount) yVarH5.read(aVar));
                                    break;
                                case "expiry_date":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mExpiryDate((String) yVarH6.read(aVar));
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
                public void write(b bVar, MoneyInTopUpCode moneyInTopUpCode) throws IOException {
                    if (moneyInTopUpCode == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("expiry_date");
                    if (moneyInTopUpCode.mExpiryDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, moneyInTopUpCode.mExpiryDate());
                    }
                    bVar.m("code");
                    if (moneyInTopUpCode.mCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, moneyInTopUpCode.mCode());
                    }
                    bVar.m("amount");
                    if (moneyInTopUpCode.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.amount_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, moneyInTopUpCode.mAmount());
                    }
                    bVar.m("fee");
                    if (moneyInTopUpCode.mFee() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.amount_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, moneyInTopUpCode.mFee());
                    }
                    bVar.m("total_amount");
                    if (moneyInTopUpCode.mTotalAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.amount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, moneyInTopUpCode.mTotalAmount());
                    }
                    bVar.m("original_amount");
                    if (moneyInTopUpCode.mOriginalAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.amount_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, moneyInTopUpCode.mOriginalAmount());
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
        parcel.writeString(mExpiryDate());
        parcel.writeString(mCode());
        parcel.writeParcelable(mAmount(), i);
        parcel.writeParcelable(mFee(), i);
        parcel.writeParcelable(mTotalAmount(), i);
        parcel.writeParcelable(mOriginalAmount(), i);
    }
}
