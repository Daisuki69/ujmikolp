package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.VerifyLoans;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_VerifyLoans extends C$AutoValue_VerifyLoans {
    public static final Parcelable.Creator<AutoValue_VerifyLoans> CREATOR = new Parcelable.Creator<AutoValue_VerifyLoans>() { // from class: com.paymaya.domain.model.AutoValue_VerifyLoans.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VerifyLoans createFromParcel(Parcel parcel) {
            return new AutoValue_VerifyLoans(parcel.readString(), parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(VerifyLoans.class.getClassLoader()), (Amount) parcel.readParcelable(VerifyLoans.class.getClassLoader()), (Amount) parcel.readParcelable(VerifyLoans.class.getClassLoader()), (Term) parcel.readParcelable(VerifyLoans.class.getClassLoader()), parcel.readString(), (Amount) parcel.readParcelable(VerifyLoans.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VerifyLoans[] newArray(int i) {
            return new AutoValue_VerifyLoans[i];
        }
    };

    public AutoValue_VerifyLoans(final String str, final String str2, final String str3, final Amount amount, final Amount amount2, final Amount amount3, final Term term, final String str4, final Amount amount4) {
        new C$$AutoValue_VerifyLoans(str, str2, str3, amount, amount2, amount3, term, str4, amount4) { // from class: com.paymaya.domain.model.$AutoValue_VerifyLoans

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_VerifyLoans$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y string_adapter;
                private volatile y term_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(VerifyLoans)";
                }

                @Override // com.google.gson.y
                public VerifyLoans read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    VerifyLoans.Builder builderSBuilder = VerifyLoans.sBuilder();
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
                                case "repayment_amount":
                                    y yVarH3 = this.amount_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH3;
                                    }
                                    builderSBuilder.mRepaymentAmount((Amount) yVarH3.read(aVar));
                                    break;
                                case "product_key":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mProduct((String) yVarH4.read(aVar));
                                    break;
                                case "status":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mStatus((String) yVarH5.read(aVar));
                                    break;
                                case "net_disbursement_amount":
                                    y yVarH6 = this.amount_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH6;
                                    }
                                    builderSBuilder.mNetDisbursementAmount((Amount) yVarH6.read(aVar));
                                    break;
                                case "id":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mId((String) yVarH7.read(aVar));
                                    break;
                                case "processing_fee":
                                    y yVarH8 = this.amount_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH8;
                                    }
                                    builderSBuilder.mProcessingFee((Amount) yVarH8.read(aVar));
                                    break;
                                case "loan_term":
                                    y yVarH9 = this.term_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(Term.class);
                                        this.term_adapter = yVarH9;
                                    }
                                    builderSBuilder.mLoanTerm((Term) yVarH9.read(aVar));
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
                public void write(b bVar, VerifyLoans verifyLoans) throws IOException {
                    if (verifyLoans == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (verifyLoans.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, verifyLoans.mId());
                    }
                    bVar.m("status");
                    if (verifyLoans.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, verifyLoans.mStatus());
                    }
                    bVar.m("product_key");
                    if (verifyLoans.mProduct() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, verifyLoans.mProduct());
                    }
                    bVar.m("processing_fee");
                    if (verifyLoans.mProcessingFee() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.amount_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, verifyLoans.mProcessingFee());
                    }
                    bVar.m("principal");
                    if (verifyLoans.mPrincipal() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.amount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, verifyLoans.mPrincipal());
                    }
                    bVar.m("net_disbursement_amount");
                    if (verifyLoans.mNetDisbursementAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.amount_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, verifyLoans.mNetDisbursementAmount());
                    }
                    bVar.m("loan_term");
                    if (verifyLoans.mLoanTerm() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.term_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(Term.class);
                            this.term_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, verifyLoans.mLoanTerm());
                    }
                    bVar.m("interest_rate");
                    if (verifyLoans.mInterestRate() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, verifyLoans.mInterestRate());
                    }
                    bVar.m("repayment_amount");
                    if (verifyLoans.mRepaymentAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.amount_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, verifyLoans.mRepaymentAmount());
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
        parcel.writeString(mId());
        parcel.writeString(mStatus());
        parcel.writeString(mProduct());
        parcel.writeParcelable(mProcessingFee(), i);
        parcel.writeParcelable(mPrincipal(), i);
        parcel.writeParcelable(mNetDisbursementAmount(), i);
        parcel.writeParcelable(mLoanTerm(), i);
        parcel.writeString(mInterestRate());
        parcel.writeParcelable(mRepaymentAmount(), i);
    }
}
