package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.LoanInstance;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LoanInstance extends C$AutoValue_LoanInstance {
    public static final Parcelable.Creator<AutoValue_LoanInstance> CREATOR = new Parcelable.Creator<AutoValue_LoanInstance>() { // from class: com.paymaya.domain.model.AutoValue_LoanInstance.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LoanInstance createFromParcel(Parcel parcel) {
            return new AutoValue_LoanInstance(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(LoanInstance.class.getClassLoader()), (Amount) parcel.readParcelable(LoanInstance.class.getClassLoader()), (Term) parcel.readParcelable(LoanInstance.class.getClassLoader()), parcel.readString(), (Amount) parcel.readParcelable(LoanInstance.class.getClassLoader()), (Amount) parcel.readParcelable(LoanInstance.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Term) parcel.readParcelable(LoanInstance.class.getClassLoader()), (ImageUrl) parcel.readParcelable(LoanInstance.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LoanInstance[] newArray(int i) {
            return new AutoValue_LoanInstance[i];
        }
    };

    public AutoValue_LoanInstance(final String str, final String str2, final String str3, final String str4, final String str5, final Amount amount, final Amount amount2, final Term term, final String str6, final Amount amount3, final Amount amount4, final String str7, @Nullable final String str8, @Nullable final String str9, @Nullable final Term term2, final ImageUrl imageUrl, final String str10) {
        new C$$AutoValue_LoanInstance(str, str2, str3, str4, str5, amount, amount2, term, str6, amount3, amount4, str7, str8, str9, term2, imageUrl, str10) { // from class: com.paymaya.domain.model.$AutoValue_LoanInstance

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_LoanInstance$GsonTypeAdapter */
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
                    return "TypeAdapter(LoanInstance)";
                }

                @Override // com.google.gson.y
                public LoanInstance read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    LoanInstance.Builder builderSBuilder = LoanInstance.sBuilder();
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
                                case "loan_provider_logo":
                                    y yVarH6 = this.imageUrl_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(ImageUrl.class);
                                        this.imageUrl_adapter = yVarH6;
                                    }
                                    builderSBuilder.mLoanProviderLogo((ImageUrl) yVarH6.read(aVar));
                                    break;
                                case "status":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mStatus((String) yVarH7.read(aVar));
                                    break;
                                case "net_disbursement_amount":
                                    y yVarH8 = this.amount_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH8;
                                    }
                                    builderSBuilder.mNetDisbursementAmount((Amount) yVarH8.read(aVar));
                                    break;
                                case "submission_date":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mSubmissionDate((String) yVarH9.read(aVar));
                                    break;
                                case "id":
                                    y yVarH10 = this.string_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(String.class);
                                        this.string_adapter = yVarH10;
                                    }
                                    builderSBuilder.mId((String) yVarH10.read(aVar));
                                    break;
                                case "name":
                                    y yVarH11 = this.string_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(String.class);
                                        this.string_adapter = yVarH11;
                                    }
                                    builderSBuilder.mName((String) yVarH11.read(aVar));
                                    break;
                                case "processing_fee":
                                    y yVarH12 = this.amount_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH12;
                                    }
                                    builderSBuilder.mProcessingFee((Amount) yVarH12.read(aVar));
                                    break;
                                case "loan_id":
                                    y yVarH13 = this.string_adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(String.class);
                                        this.string_adapter = yVarH13;
                                    }
                                    builderSBuilder.mLoanId((String) yVarH13.read(aVar));
                                    break;
                                case "biller_slug":
                                    y yVarH14 = this.string_adapter;
                                    if (yVarH14 == null) {
                                        yVarH14 = this.gson.h(String.class);
                                        this.string_adapter = yVarH14;
                                    }
                                    builderSBuilder.mBillerSlug((String) yVarH14.read(aVar));
                                    break;
                                case "payment_due_date":
                                    y yVarH15 = this.string_adapter;
                                    if (yVarH15 == null) {
                                        yVarH15 = this.gson.h(String.class);
                                        this.string_adapter = yVarH15;
                                    }
                                    builderSBuilder.mPaymentDueDate((String) yVarH15.read(aVar));
                                    break;
                                case "remaining_days":
                                    y yVarH16 = this.term_adapter;
                                    if (yVarH16 == null) {
                                        yVarH16 = this.gson.h(Term.class);
                                        this.term_adapter = yVarH16;
                                    }
                                    builderSBuilder.mRemainingDays((Term) yVarH16.read(aVar));
                                    break;
                                case "loan_term":
                                    y yVarH17 = this.term_adapter;
                                    if (yVarH17 == null) {
                                        yVarH17 = this.gson.h(Term.class);
                                        this.term_adapter = yVarH17;
                                    }
                                    builderSBuilder.mLoanTerm((Term) yVarH17.read(aVar));
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
                public void write(b bVar, LoanInstance loanInstance) throws IOException {
                    if (loanInstance == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (loanInstance.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, loanInstance.mId());
                    }
                    bVar.m("product_key");
                    if (loanInstance.mProductKey() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, loanInstance.mProductKey());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (loanInstance.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, loanInstance.mName());
                    }
                    bVar.m("description");
                    if (loanInstance.mDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, loanInstance.mDescription());
                    }
                    bVar.m("status");
                    if (loanInstance.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, loanInstance.mStatus());
                    }
                    bVar.m("principal");
                    if (loanInstance.mPrincipal() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.amount_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, loanInstance.mPrincipal());
                    }
                    bVar.m("net_disbursement_amount");
                    if (loanInstance.mNetDisbursementAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.amount_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, loanInstance.mNetDisbursementAmount());
                    }
                    bVar.m("loan_term");
                    if (loanInstance.mLoanTerm() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.term_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(Term.class);
                            this.term_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, loanInstance.mLoanTerm());
                    }
                    bVar.m("interest_rate");
                    if (loanInstance.mInterestRate() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.string_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(String.class);
                            this.string_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, loanInstance.mInterestRate());
                    }
                    bVar.m("processing_fee");
                    if (loanInstance.mProcessingFee() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.amount_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, loanInstance.mProcessingFee());
                    }
                    bVar.m("repayment_amount");
                    if (loanInstance.mRepaymentAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.amount_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, loanInstance.mRepaymentAmount());
                    }
                    bVar.m("submission_date");
                    if (loanInstance.mSubmissionDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH12 = this.string_adapter;
                        if (yVarH12 == null) {
                            yVarH12 = this.gson.h(String.class);
                            this.string_adapter = yVarH12;
                        }
                        yVarH12.write(bVar, loanInstance.mSubmissionDate());
                    }
                    bVar.m("loan_id");
                    if (loanInstance.mLoanId() == null) {
                        bVar.r();
                    } else {
                        y yVarH13 = this.string_adapter;
                        if (yVarH13 == null) {
                            yVarH13 = this.gson.h(String.class);
                            this.string_adapter = yVarH13;
                        }
                        yVarH13.write(bVar, loanInstance.mLoanId());
                    }
                    bVar.m("payment_due_date");
                    if (loanInstance.mPaymentDueDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH14 = this.string_adapter;
                        if (yVarH14 == null) {
                            yVarH14 = this.gson.h(String.class);
                            this.string_adapter = yVarH14;
                        }
                        yVarH14.write(bVar, loanInstance.mPaymentDueDate());
                    }
                    bVar.m("remaining_days");
                    if (loanInstance.mRemainingDays() == null) {
                        bVar.r();
                    } else {
                        y yVarH15 = this.term_adapter;
                        if (yVarH15 == null) {
                            yVarH15 = this.gson.h(Term.class);
                            this.term_adapter = yVarH15;
                        }
                        yVarH15.write(bVar, loanInstance.mRemainingDays());
                    }
                    bVar.m("loan_provider_logo");
                    if (loanInstance.mLoanProviderLogo() == null) {
                        bVar.r();
                    } else {
                        y yVarH16 = this.imageUrl_adapter;
                        if (yVarH16 == null) {
                            yVarH16 = this.gson.h(ImageUrl.class);
                            this.imageUrl_adapter = yVarH16;
                        }
                        yVarH16.write(bVar, loanInstance.mLoanProviderLogo());
                    }
                    bVar.m("biller_slug");
                    if (loanInstance.mBillerSlug() == null) {
                        bVar.r();
                    } else {
                        y yVarH17 = this.string_adapter;
                        if (yVarH17 == null) {
                            yVarH17 = this.gson.h(String.class);
                            this.string_adapter = yVarH17;
                        }
                        yVarH17.write(bVar, loanInstance.mBillerSlug());
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
        parcel.writeString(mProductKey());
        parcel.writeString(mName());
        parcel.writeString(mDescription());
        parcel.writeString(mStatus());
        parcel.writeParcelable(mPrincipal(), i);
        parcel.writeParcelable(mNetDisbursementAmount(), i);
        parcel.writeParcelable(mLoanTerm(), i);
        parcel.writeString(mInterestRate());
        parcel.writeParcelable(mProcessingFee(), i);
        parcel.writeParcelable(mRepaymentAmount(), i);
        parcel.writeString(mSubmissionDate());
        if (mLoanId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mLoanId());
        }
        if (mPaymentDueDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPaymentDueDate());
        }
        parcel.writeParcelable(mRemainingDays(), i);
        parcel.writeParcelable(mLoanProviderLogo(), i);
        parcel.writeString(mBillerSlug());
    }
}
