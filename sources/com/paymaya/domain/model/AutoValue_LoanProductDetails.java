package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.LoanProductDetails;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LoanProductDetails extends C$AutoValue_LoanProductDetails {
    public static final Parcelable.Creator<AutoValue_LoanProductDetails> CREATOR = new Parcelable.Creator<AutoValue_LoanProductDetails>() { // from class: com.paymaya.domain.model.AutoValue_LoanProductDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LoanProductDetails createFromParcel(Parcel parcel) {
            return new AutoValue_LoanProductDetails(parcel.readString(), (Amount) parcel.readParcelable(LoanProductDetails.class.getClassLoader()), parcel.readString(), (Term) parcel.readParcelable(LoanProductDetails.class.getClassLoader()), (Amount) parcel.readParcelable(LoanProductDetails.class.getClassLoader()), (Amount) parcel.readParcelable(LoanProductDetails.class.getClassLoader()), (Amount) parcel.readParcelable(LoanProductDetails.class.getClassLoader()), parcel.readString(), (ImageUrl) parcel.readParcelable(LoanProductDetails.class.getClassLoader()), parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(LoanProductDetails.class.getClassLoader()), (Amount) parcel.readParcelable(LoanProductDetails.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LoanProductDetails[] newArray(int i) {
            return new AutoValue_LoanProductDetails[i];
        }
    };

    public AutoValue_LoanProductDetails(final String str, final Amount amount, final String str2, final Term term, final Amount amount2, final Amount amount3, final Amount amount4, final String str3, final ImageUrl imageUrl, final String str4, final String str5, final Amount amount5, final Amount amount6, final String str6, final String str7) {
        new C$$AutoValue_LoanProductDetails(str, amount, str2, term, amount2, amount3, amount4, str3, imageUrl, str4, str5, amount5, amount6, str6, str7) { // from class: com.paymaya.domain.model.$AutoValue_LoanProductDetails

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_LoanProductDetails$GsonTypeAdapter */
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
                    return "TypeAdapter(LoanProductDetails)";
                }

                @Override // com.google.gson.y
                public LoanProductDetails read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    LoanProductDetails.Builder builderSBuilder = LoanProductDetails.sBuilder();
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
                                case "description":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mDescription((String) yVarH4.read(aVar));
                                    break;
                                case "product_key":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mProductKey((String) yVarH5.read(aVar));
                                    break;
                                case "terms_and_conditions":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mTermsAndConditions((String) yVarH6.read(aVar));
                                    break;
                                case "loan_provider_logo":
                                    y yVarH7 = this.imageUrl_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(ImageUrl.class);
                                        this.imageUrl_adapter = yVarH7;
                                    }
                                    builderSBuilder.mLoanProviderLogo((ImageUrl) yVarH7.read(aVar));
                                    break;
                                case "net_disbursement_amount":
                                    y yVarH8 = this.amount_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH8;
                                    }
                                    builderSBuilder.mNetDisbursementAmount((Amount) yVarH8.read(aVar));
                                    break;
                                case "name":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mName((String) yVarH9.read(aVar));
                                    break;
                                case "processing_fee":
                                    y yVarH10 = this.amount_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH10;
                                    }
                                    builderSBuilder.mProcessingFee((Amount) yVarH10.read(aVar));
                                    break;
                                case "min_loan_amount":
                                    y yVarH11 = this.amount_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH11;
                                    }
                                    builderSBuilder.mMinLoanAmount((Amount) yVarH11.read(aVar));
                                    break;
                                case "amortization_frequency":
                                    y yVarH12 = this.string_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(String.class);
                                        this.string_adapter = yVarH12;
                                    }
                                    builderSBuilder.mAmortizationFrequency((String) yVarH12.read(aVar));
                                    break;
                                case "organization":
                                    y yVarH13 = this.string_adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(String.class);
                                        this.string_adapter = yVarH13;
                                    }
                                    builderSBuilder.mOrganization((String) yVarH13.read(aVar));
                                    break;
                                case "max_loan_amount":
                                    y yVarH14 = this.amount_adapter;
                                    if (yVarH14 == null) {
                                        yVarH14 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH14;
                                    }
                                    builderSBuilder.mMaxLoanAmount((Amount) yVarH14.read(aVar));
                                    break;
                                case "loan_term":
                                    y yVarH15 = this.term_adapter;
                                    if (yVarH15 == null) {
                                        yVarH15 = this.gson.h(Term.class);
                                        this.term_adapter = yVarH15;
                                    }
                                    builderSBuilder.mLoanTerm((Term) yVarH15.read(aVar));
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
                public void write(b bVar, LoanProductDetails loanProductDetails) throws IOException {
                    if (loanProductDetails == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("product_key");
                    if (loanProductDetails.mProductKey() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, loanProductDetails.mProductKey());
                    }
                    bVar.m("principal");
                    if (loanProductDetails.mPrincipal() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.amount_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, loanProductDetails.mPrincipal());
                    }
                    bVar.m("interest_rate");
                    if (loanProductDetails.mInterestRate() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, loanProductDetails.mInterestRate());
                    }
                    bVar.m("loan_term");
                    if (loanProductDetails.mLoanTerm() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.term_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Term.class);
                            this.term_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, loanProductDetails.mLoanTerm());
                    }
                    bVar.m("net_disbursement_amount");
                    if (loanProductDetails.mNetDisbursementAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.amount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, loanProductDetails.mNetDisbursementAmount());
                    }
                    bVar.m("processing_fee");
                    if (loanProductDetails.mProcessingFee() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.amount_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, loanProductDetails.mProcessingFee());
                    }
                    bVar.m("repayment_amount");
                    if (loanProductDetails.mRepaymentAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.amount_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, loanProductDetails.mRepaymentAmount());
                    }
                    bVar.m("organization");
                    if (loanProductDetails.mOrganization() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, loanProductDetails.mOrganization());
                    }
                    bVar.m("loan_provider_logo");
                    if (loanProductDetails.mLoanProviderLogo() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.imageUrl_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(ImageUrl.class);
                            this.imageUrl_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, loanProductDetails.mLoanProviderLogo());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (loanProductDetails.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, loanProductDetails.mName());
                    }
                    bVar.m("description");
                    if (loanProductDetails.mDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.string_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(String.class);
                            this.string_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, loanProductDetails.mDescription());
                    }
                    bVar.m("min_loan_amount");
                    if (loanProductDetails.mMinLoanAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH12 = this.amount_adapter;
                        if (yVarH12 == null) {
                            yVarH12 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH12;
                        }
                        yVarH12.write(bVar, loanProductDetails.mMinLoanAmount());
                    }
                    bVar.m("max_loan_amount");
                    if (loanProductDetails.mMaxLoanAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH13 = this.amount_adapter;
                        if (yVarH13 == null) {
                            yVarH13 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH13;
                        }
                        yVarH13.write(bVar, loanProductDetails.mMaxLoanAmount());
                    }
                    bVar.m("amortization_frequency");
                    if (loanProductDetails.mAmortizationFrequency() == null) {
                        bVar.r();
                    } else {
                        y yVarH14 = this.string_adapter;
                        if (yVarH14 == null) {
                            yVarH14 = this.gson.h(String.class);
                            this.string_adapter = yVarH14;
                        }
                        yVarH14.write(bVar, loanProductDetails.mAmortizationFrequency());
                    }
                    bVar.m("terms_and_conditions");
                    if (loanProductDetails.mTermsAndConditions() == null) {
                        bVar.r();
                    } else {
                        y yVarH15 = this.string_adapter;
                        if (yVarH15 == null) {
                            yVarH15 = this.gson.h(String.class);
                            this.string_adapter = yVarH15;
                        }
                        yVarH15.write(bVar, loanProductDetails.mTermsAndConditions());
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
        parcel.writeParcelable(mPrincipal(), i);
        parcel.writeString(mInterestRate());
        parcel.writeParcelable(mLoanTerm(), i);
        parcel.writeParcelable(mNetDisbursementAmount(), i);
        parcel.writeParcelable(mProcessingFee(), i);
        parcel.writeParcelable(mRepaymentAmount(), i);
        parcel.writeString(mOrganization());
        parcel.writeParcelable(mLoanProviderLogo(), i);
        parcel.writeString(mName());
        parcel.writeString(mDescription());
        parcel.writeParcelable(mMinLoanAmount(), i);
        parcel.writeParcelable(mMaxLoanAmount(), i);
        parcel.writeString(mAmortizationFrequency());
        parcel.writeString(mTermsAndConditions());
    }
}
