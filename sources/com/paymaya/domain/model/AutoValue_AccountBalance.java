package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AccountBalance;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AccountBalance extends C$AutoValue_AccountBalance {
    public static final Parcelable.Creator<AutoValue_AccountBalance> CREATOR = new Parcelable.Creator<AutoValue_AccountBalance>() { // from class: com.paymaya.domain.model.AutoValue_AccountBalance.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AccountBalance createFromParcel(Parcel parcel) {
            return new AutoValue_AccountBalance((Amount) parcel.readParcelable(AccountBalance.class.getClassLoader()), (Amount) parcel.readParcelable(AccountBalance.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AccountBalance[] newArray(int i) {
            return new AutoValue_AccountBalance[i];
        }
    };

    public AutoValue_AccountBalance(Amount amount, Amount amount2) {
        new C$$AutoValue_AccountBalance(amount, amount2) { // from class: com.paymaya.domain.model.$AutoValue_AccountBalance

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AccountBalance$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(AccountBalance)";
                }

                @Override // com.google.gson.y
                public AccountBalance read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    AccountBalance.Builder builderSBuilder = AccountBalance.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("available_balance")) {
                                y yVarH = this.amount_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(Amount.class);
                                    this.amount_adapter = yVarH;
                                }
                                builderSBuilder.mAvailableBalance((Amount) yVarH.read(aVar));
                            } else if (strE.equals("current_balance")) {
                                y yVarH2 = this.amount_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(Amount.class);
                                    this.amount_adapter = yVarH2;
                                }
                                builderSBuilder.mCurrentBalance((Amount) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, AccountBalance accountBalance) throws IOException {
                    if (accountBalance == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("current_balance");
                    if (accountBalance.mCurrentBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.amount_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH;
                        }
                        yVarH.write(bVar, accountBalance.mCurrentBalance());
                    }
                    bVar.m("available_balance");
                    if (accountBalance.mAvailableBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.amount_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, accountBalance.mAvailableBalance());
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
        parcel.writeParcelable(mCurrentBalance(), i);
        parcel.writeParcelable(mAvailableBalance(), i);
    }
}
