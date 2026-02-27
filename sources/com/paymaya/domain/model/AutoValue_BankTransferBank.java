package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BankTransferBank;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BankTransferBank extends C$AutoValue_BankTransferBank {
    public static final Parcelable.Creator<AutoValue_BankTransferBank> CREATOR = new Parcelable.Creator<AutoValue_BankTransferBank>() { // from class: com.paymaya.domain.model.AutoValue_BankTransferBank.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BankTransferBank createFromParcel(Parcel parcel) {
            return new AutoValue_BankTransferBank(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (BankAccount) parcel.readParcelable(BankTransferBank.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BankTransferBank[] newArray(int i) {
            return new AutoValue_BankTransferBank[i];
        }
    };

    public AutoValue_BankTransferBank(final String str, @Nullable final String str2, final BankAccount bankAccount) {
        new C$$AutoValue_BankTransferBank(str, str2, bankAccount) { // from class: com.paymaya.domain.model.$AutoValue_BankTransferBank

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BankTransferBank$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y bankAccount_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BankTransferBank)";
                }

                @Override // com.google.gson.y
                public BankTransferBank read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BankTransferBank.Builder builderSBuilder = BankTransferBank.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "account":
                                    y yVarH = this.bankAccount_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(BankAccount.class);
                                        this.bankAccount_adapter = yVarH;
                                    }
                                    builderSBuilder.mBankAccount((BankAccount) yVarH.read(aVar));
                                    break;
                                case "code":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mBankCode((String) yVarH2.read(aVar));
                                    break;
                                case "name":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mBankName((String) yVarH3.read(aVar));
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
                public void write(b bVar, BankTransferBank bankTransferBank) throws IOException {
                    if (bankTransferBank == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("code");
                    if (bankTransferBank.mBankCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, bankTransferBank.mBankCode());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (bankTransferBank.mBankName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, bankTransferBank.mBankName());
                    }
                    bVar.m("account");
                    if (bankTransferBank.mBankAccount() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.bankAccount_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(BankAccount.class);
                            this.bankAccount_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, bankTransferBank.mBankAccount());
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
        parcel.writeString(mBankCode());
        if (mBankName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBankName());
        }
        parcel.writeParcelable(mBankAccount(), i);
    }
}
