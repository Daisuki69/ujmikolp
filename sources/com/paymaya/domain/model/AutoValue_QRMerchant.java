package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.QRMerchant;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_QRMerchant extends C$AutoValue_QRMerchant {
    public static final Parcelable.Creator<AutoValue_QRMerchant> CREATOR = new Parcelable.Creator<AutoValue_QRMerchant>() { // from class: com.paymaya.domain.model.AutoValue_QRMerchant.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_QRMerchant createFromParcel(Parcel parcel) {
            return new AutoValue_QRMerchant(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Amount) parcel.readParcelable(QRMerchant.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_QRMerchant[] newArray(int i) {
            return new AutoValue_QRMerchant[i];
        }
    };

    public AutoValue_QRMerchant(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final Amount amount, @Nullable final String str4, @Nullable final String str5) {
        new C$$AutoValue_QRMerchant(str, str2, str3, amount, str4, str5) { // from class: com.paymaya.domain.model.$AutoValue_QRMerchant

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_QRMerchant$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(QRMerchant)";
                }

                @Override // com.google.gson.y
                public QRMerchant read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    QRMerchant.Builder builderSBuilder = QRMerchant.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if ("mMerchantId".equals(strE)) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mMerchantId((String) yVarH.read(aVar));
                            } else if ("mName".equals(strE)) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mName((String) yVarH2.read(aVar));
                            } else if ("mType".equals(strE)) {
                                y yVarH3 = this.string_adapter;
                                if (yVarH3 == null) {
                                    yVarH3 = this.gson.h(String.class);
                                    this.string_adapter = yVarH3;
                                }
                                builderSBuilder.mType((String) yVarH3.read(aVar));
                            } else if ("mAmount".equals(strE)) {
                                y yVarH4 = this.amount_adapter;
                                if (yVarH4 == null) {
                                    yVarH4 = this.gson.h(Amount.class);
                                    this.amount_adapter = yVarH4;
                                }
                                builderSBuilder.mAmount((Amount) yVarH4.read(aVar));
                            } else if ("mPaymentId".equals(strE)) {
                                y yVarH5 = this.string_adapter;
                                if (yVarH5 == null) {
                                    yVarH5 = this.gson.h(String.class);
                                    this.string_adapter = yVarH5;
                                }
                                builderSBuilder.mPaymentId((String) yVarH5.read(aVar));
                            } else if ("mQrPayload".equals(strE)) {
                                y yVarH6 = this.string_adapter;
                                if (yVarH6 == null) {
                                    yVarH6 = this.gson.h(String.class);
                                    this.string_adapter = yVarH6;
                                }
                                builderSBuilder.mQrPayload((String) yVarH6.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, QRMerchant qRMerchant) throws IOException {
                    if (qRMerchant == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("mMerchantId");
                    if (qRMerchant.mMerchantId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, qRMerchant.mMerchantId());
                    }
                    bVar.m("mName");
                    if (qRMerchant.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, qRMerchant.mName());
                    }
                    bVar.m("mType");
                    if (qRMerchant.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, qRMerchant.mType());
                    }
                    bVar.m("mAmount");
                    if (qRMerchant.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.amount_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, qRMerchant.mAmount());
                    }
                    bVar.m("mPaymentId");
                    if (qRMerchant.mPaymentId() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, qRMerchant.mPaymentId());
                    }
                    bVar.m("mQrPayload");
                    if (qRMerchant.mQrPayload() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, qRMerchant.mQrPayload());
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
        if (mMerchantId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMerchantId());
        }
        if (mName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mName());
        }
        if (mType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mType());
        }
        parcel.writeParcelable(mAmount(), i);
        if (mPaymentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPaymentId());
        }
        if (mQrPayload() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mQrPayload());
        }
    }
}
