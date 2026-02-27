package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MerchantPayment;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MerchantPayment extends C$AutoValue_MerchantPayment {
    public static final Parcelable.Creator<AutoValue_MerchantPayment> CREATOR = new Parcelable.Creator<AutoValue_MerchantPayment>() { // from class: com.paymaya.domain.model.AutoValue_MerchantPayment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MerchantPayment createFromParcel(Parcel parcel) {
            return new AutoValue_MerchantPayment(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Amount) parcel.readParcelable(MerchantPayment.class.getClassLoader()), (Amount) parcel.readParcelable(MerchantPayment.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Amount) parcel.readParcelable(MerchantPayment.class.getClassLoader()), (Amount) parcel.readParcelable(MerchantPayment.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MerchantPayment[] newArray(int i) {
            return new AutoValue_MerchantPayment[i];
        }
    };

    public AutoValue_MerchantPayment(final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final Amount amount, final Amount amount2, @Nullable final String str4, @Nullable final String str5, @Nullable final Amount amount3, @Nullable final Amount amount4) {
        new C$$AutoValue_MerchantPayment(str, str2, str3, amount, amount2, str4, str5, amount3, amount4) { // from class: com.paymaya.domain.model.$AutoValue_MerchantPayment

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MerchantPayment$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MerchantPayment)";
                }

                @Override // com.google.gson.y
                public MerchantPayment read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MerchantPayment.Builder builderSBuilder = MerchantPayment.sBuilder();
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
                                case "id":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mPaymentToken((String) yVarH2.read(aVar));
                                    break;
                                case "fees":
                                    y yVarH3 = this.amount_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH3;
                                    }
                                    builderSBuilder.mPaymentFees((Amount) yVarH3.read(aVar));
                                    break;
                                case "request_reference_no":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mRequestReferenceNo((String) yVarH4.read(aVar));
                                    break;
                                case "value":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mMerchant((String) yVarH5.read(aVar));
                                    break;
                                case "redirect_url":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mRedirectUrl((String) yVarH6.read(aVar));
                                    break;
                                case "mername":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mMerchantName((String) yVarH7.read(aVar));
                                    break;
                                default:
                                    if ("mCurrentBalance".equals(strE)) {
                                        y yVarH8 = this.amount_adapter;
                                        if (yVarH8 == null) {
                                            yVarH8 = this.gson.h(Amount.class);
                                            this.amount_adapter = yVarH8;
                                        }
                                        builderSBuilder.mCurrentBalance((Amount) yVarH8.read(aVar));
                                        break;
                                    } else {
                                        if (!"mAvailableBalance".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH9 = this.amount_adapter;
                                            if (yVarH9 == null) {
                                                yVarH9 = this.gson.h(Amount.class);
                                                this.amount_adapter = yVarH9;
                                            }
                                            builderSBuilder.mAvailableBalance((Amount) yVarH9.read(aVar));
                                        }
                                        break;
                                    }
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
                public void write(b bVar, MerchantPayment merchantPayment) throws IOException {
                    if (merchantPayment == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (merchantPayment.mPaymentToken() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, merchantPayment.mPaymentToken());
                    }
                    bVar.m("value");
                    if (merchantPayment.mMerchant() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, merchantPayment.mMerchant());
                    }
                    bVar.m("mername");
                    if (merchantPayment.mMerchantName() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, merchantPayment.mMerchantName());
                    }
                    bVar.m("amount");
                    if (merchantPayment.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.amount_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, merchantPayment.mAmount());
                    }
                    bVar.m("fees");
                    if (merchantPayment.mPaymentFees() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.amount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, merchantPayment.mPaymentFees());
                    }
                    bVar.m("request_reference_no");
                    if (merchantPayment.mRequestReferenceNo() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, merchantPayment.mRequestReferenceNo());
                    }
                    bVar.m("redirect_url");
                    if (merchantPayment.mRedirectUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, merchantPayment.mRedirectUrl());
                    }
                    bVar.m("mCurrentBalance");
                    if (merchantPayment.mCurrentBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.amount_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, merchantPayment.mCurrentBalance());
                    }
                    bVar.m("mAvailableBalance");
                    if (merchantPayment.mAvailableBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.amount_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, merchantPayment.mAvailableBalance());
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
        parcel.writeString(mPaymentToken());
        if (mMerchant() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMerchant());
        }
        if (mMerchantName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMerchantName());
        }
        parcel.writeParcelable(mAmount(), i);
        parcel.writeParcelable(mPaymentFees(), i);
        if (mRequestReferenceNo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRequestReferenceNo());
        }
        if (mRedirectUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRedirectUrl());
        }
        parcel.writeParcelable(mCurrentBalance(), i);
        parcel.writeParcelable(mAvailableBalance(), i);
    }
}
