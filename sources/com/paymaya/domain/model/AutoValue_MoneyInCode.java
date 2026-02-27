package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MoneyInCode;
import j3.a;
import j3.b;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MoneyInCode extends C$AutoValue_MoneyInCode {
    public static final Parcelable.Creator<AutoValue_MoneyInCode> CREATOR = new Parcelable.Creator<AutoValue_MoneyInCode>() { // from class: com.paymaya.domain.model.AutoValue_MoneyInCode.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MoneyInCode createFromParcel(Parcel parcel) {
            return new AutoValue_MoneyInCode(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MoneyInCode[] newArray(int i) {
            return new AutoValue_MoneyInCode[i];
        }
    };

    public AutoValue_MoneyInCode(final String str, final String str2, final BigDecimal bigDecimal) {
        new C$$AutoValue_MoneyInCode(str, str2, bigDecimal) { // from class: com.paymaya.domain.model.$AutoValue_MoneyInCode

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MoneyInCode$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y bigDecimal_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MoneyInCode)";
                }

                @Override // com.google.gson.y
                public MoneyInCode read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MoneyInCode.Builder builderSBuilder = MoneyInCode.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "amount":
                                    y yVarH = this.bigDecimal_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(BigDecimal.class);
                                        this.bigDecimal_adapter = yVarH;
                                    }
                                    builderSBuilder.mAmount((BigDecimal) yVarH.read(aVar));
                                    break;
                                case "code":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mCode((String) yVarH2.read(aVar));
                                    break;
                                case "expiry_date":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mExpiryDate((String) yVarH3.read(aVar));
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
                public void write(b bVar, MoneyInCode moneyInCode) throws IOException {
                    if (moneyInCode == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("expiry_date");
                    if (moneyInCode.mExpiryDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, moneyInCode.mExpiryDate());
                    }
                    bVar.m("code");
                    if (moneyInCode.mCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, moneyInCode.mCode());
                    }
                    bVar.m("amount");
                    if (moneyInCode.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.bigDecimal_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(BigDecimal.class);
                            this.bigDecimal_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, moneyInCode.mAmount());
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
        parcel.writeSerializable(mAmount());
    }
}
