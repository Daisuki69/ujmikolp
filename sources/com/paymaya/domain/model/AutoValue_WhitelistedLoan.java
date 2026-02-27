package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.WhitelistedLoan;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_WhitelistedLoan extends C$AutoValue_WhitelistedLoan {
    public static final Parcelable.Creator<AutoValue_WhitelistedLoan> CREATOR = new Parcelable.Creator<AutoValue_WhitelistedLoan>() { // from class: com.paymaya.domain.model.AutoValue_WhitelistedLoan.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_WhitelistedLoan createFromParcel(Parcel parcel) {
            return new AutoValue_WhitelistedLoan(parcel.readString(), parcel.readString(), (Term) parcel.readParcelable(WhitelistedLoan.class.getClassLoader()), (Amount) parcel.readParcelable(WhitelistedLoan.class.getClassLoader()), (Term) parcel.readParcelable(WhitelistedLoan.class.getClassLoader()), parcel.readString(), (ImageUrl) parcel.readParcelable(WhitelistedLoan.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_WhitelistedLoan[] newArray(int i) {
            return new AutoValue_WhitelistedLoan[i];
        }
    };

    public AutoValue_WhitelistedLoan(final String str, final String str2, final Term term, final Amount amount, final Term term2, final String str3, final ImageUrl imageUrl) {
        new C$$AutoValue_WhitelistedLoan(str, str2, term, amount, term2, str3, imageUrl) { // from class: com.paymaya.domain.model.$AutoValue_WhitelistedLoan

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_WhitelistedLoan$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y imageUrl_adapter;
                private volatile y string_adapter;
                private volatile y term_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(WhitelistedLoan)";
                }

                @Override // com.google.gson.y
                public WhitelistedLoan read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    WhitelistedLoan.Builder builderSBuilder = WhitelistedLoan.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "interest_rate":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mInterestRate((String) yVarH.read(aVar));
                                    break;
                                case "principal":
                                    y yVarH2 = this.amount_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH2;
                                    }
                                    builderSBuilder.mPrincipal((Amount) yVarH2.read(aVar));
                                    break;
                                case "product_key":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mProductKey((String) yVarH3.read(aVar));
                                    break;
                                case "validity":
                                    y yVarH4 = this.term_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Term.class);
                                        this.term_adapter = yVarH4;
                                    }
                                    builderSBuilder.mValidityTerm((Term) yVarH4.read(aVar));
                                    break;
                                case "expiry":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mExpiry((String) yVarH5.read(aVar));
                                    break;
                                case "loan_provider_logo":
                                    y yVarH6 = this.imageUrl_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(ImageUrl.class);
                                        this.imageUrl_adapter = yVarH6;
                                    }
                                    builderSBuilder.mLoanProviderLogo((ImageUrl) yVarH6.read(aVar));
                                    break;
                                case "loan_term":
                                    y yVarH7 = this.term_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(Term.class);
                                        this.term_adapter = yVarH7;
                                    }
                                    builderSBuilder.mLoanTerm((Term) yVarH7.read(aVar));
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
                public void write(b bVar, WhitelistedLoan whitelistedLoan) throws IOException {
                    if (whitelistedLoan == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("product_key");
                    if (whitelistedLoan.mProductKey() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, whitelistedLoan.mProductKey());
                    }
                    bVar.m("expiry");
                    if (whitelistedLoan.mExpiry() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, whitelistedLoan.mExpiry());
                    }
                    bVar.m("validity");
                    if (whitelistedLoan.mValidityTerm() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.term_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Term.class);
                            this.term_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, whitelistedLoan.mValidityTerm());
                    }
                    bVar.m("principal");
                    if (whitelistedLoan.mPrincipal() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.amount_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, whitelistedLoan.mPrincipal());
                    }
                    bVar.m("loan_term");
                    if (whitelistedLoan.mLoanTerm() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.term_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Term.class);
                            this.term_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, whitelistedLoan.mLoanTerm());
                    }
                    bVar.m("interest_rate");
                    if (whitelistedLoan.mInterestRate() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, whitelistedLoan.mInterestRate());
                    }
                    bVar.m("loan_provider_logo");
                    if (whitelistedLoan.mLoanProviderLogo() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.imageUrl_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(ImageUrl.class);
                            this.imageUrl_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, whitelistedLoan.mLoanProviderLogo());
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
        parcel.writeString(mProductKey());
        parcel.writeString(mExpiry());
        parcel.writeParcelable(mValidityTerm(), i);
        parcel.writeParcelable(mPrincipal(), i);
        parcel.writeParcelable(mLoanTerm(), i);
        parcel.writeString(mInterestRate());
        parcel.writeParcelable(mLoanProviderLogo(), i);
    }
}
