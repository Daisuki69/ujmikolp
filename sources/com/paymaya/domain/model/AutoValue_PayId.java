package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.PayId;
import j3.a;
import j3.b;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PayId extends C$AutoValue_PayId {
    public static final Parcelable.Creator<AutoValue_PayId> CREATOR = new Parcelable.Creator<AutoValue_PayId>() { // from class: com.paymaya.domain.model.AutoValue_PayId.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PayId createFromParcel(Parcel parcel) {
            return new AutoValue_PayId(parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PayId[] newArray(int i) {
            return new AutoValue_PayId[i];
        }
    };

    public AutoValue_PayId(final String str, final String str2, final String str3, final BigDecimal bigDecimal, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6) {
        new C$$AutoValue_PayId(str, str2, str3, bigDecimal, str4, str5, str6) { // from class: com.paymaya.domain.model.$AutoValue_PayId

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PayId$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y bigDecimal_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(PayId)";
                }

                @Override // com.google.gson.y
                public PayId read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    PayId.Builder builderSBuilder = PayId.sBuilder();
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
                                case "original_amount":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mOriginalAmount((String) yVarH2.read(aVar));
                                    break;
                                case "fee":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mFee((String) yVarH3.read(aVar));
                                    break;
                                case "total_amount":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mTotalAmount((String) yVarH4.read(aVar));
                                    break;
                                case "expiry_date":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mExpiryDate((String) yVarH5.read(aVar));
                                    break;
                                case "merchant_ref":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mMerchantRef((String) yVarH6.read(aVar));
                                    break;
                                case "seven_connect_id":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mSevenConnectId((String) yVarH7.read(aVar));
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
                public void write(b bVar, PayId payId) throws IOException {
                    if (payId == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("expiry_date");
                    if (payId.mExpiryDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, payId.mExpiryDate());
                    }
                    bVar.m("seven_connect_id");
                    if (payId.mSevenConnectId() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, payId.mSevenConnectId());
                    }
                    bVar.m("merchant_ref");
                    if (payId.mMerchantRef() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, payId.mMerchantRef());
                    }
                    bVar.m("amount");
                    if (payId.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.bigDecimal_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(BigDecimal.class);
                            this.bigDecimal_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, payId.mAmount());
                    }
                    bVar.m("total_amount");
                    if (payId.mTotalAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, payId.mTotalAmount());
                    }
                    bVar.m("fee");
                    if (payId.mFee() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, payId.mFee());
                    }
                    bVar.m("original_amount");
                    if (payId.mOriginalAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, payId.mOriginalAmount());
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
        parcel.writeString(mSevenConnectId());
        parcel.writeString(mMerchantRef());
        parcel.writeSerializable(mAmount());
        if (mTotalAmount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mTotalAmount());
        }
        if (mFee() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mFee());
        }
        if (mOriginalAmount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mOriginalAmount());
        }
    }
}
