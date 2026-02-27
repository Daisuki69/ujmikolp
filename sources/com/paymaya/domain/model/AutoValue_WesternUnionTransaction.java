package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.WesternUnionTransaction;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_WesternUnionTransaction extends C$AutoValue_WesternUnionTransaction {
    public static final Parcelable.Creator<AutoValue_WesternUnionTransaction> CREATOR = new Parcelable.Creator<AutoValue_WesternUnionTransaction>() { // from class: com.paymaya.domain.model.AutoValue_WesternUnionTransaction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_WesternUnionTransaction createFromParcel(Parcel parcel) {
            return new AutoValue_WesternUnionTransaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(WesternUnionTransaction.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (Amount) parcel.readParcelable(WesternUnionTransaction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_WesternUnionTransaction[] newArray(int i) {
            return new AutoValue_WesternUnionTransaction[i];
        }
    };

    public AutoValue_WesternUnionTransaction(final String str, final String str2, final String str3, final String str4, final Amount amount, @Nullable final String str5, @Nullable final Amount amount2) {
        new C$$AutoValue_WesternUnionTransaction(str, str2, str3, str4, amount, str5, amount2) { // from class: com.paymaya.domain.model.$AutoValue_WesternUnionTransaction

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_WesternUnionTransaction$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(WesternUnionTransaction)";
                }

                @Override // com.google.gson.y
                public WesternUnionTransaction read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    WesternUnionTransaction.Builder builderSBuilder = WesternUnionTransaction.sBuilder();
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
                                case "sender":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mSender((String) yVarH2.read(aVar));
                                    break;
                                case "reference_id":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mReferenceId((String) yVarH3.read(aVar));
                                    break;
                                case "balance":
                                    y yVarH4 = this.amount_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH4;
                                    }
                                    builderSBuilder.mBalance((Amount) yVarH4.read(aVar));
                                    break;
                                case "rrn":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mRrn((String) yVarH5.read(aVar));
                                    break;
                                case "trn":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mTrn((String) yVarH6.read(aVar));
                                    break;
                                case "mtcn":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mMtcn((String) yVarH7.read(aVar));
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
                public void write(b bVar, WesternUnionTransaction westernUnionTransaction) throws IOException {
                    if (westernUnionTransaction == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("rrn");
                    if (westernUnionTransaction.mRrn() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, westernUnionTransaction.mRrn());
                    }
                    bVar.m("trn");
                    if (westernUnionTransaction.mTrn() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, westernUnionTransaction.mTrn());
                    }
                    bVar.m("mtcn");
                    if (westernUnionTransaction.mMtcn() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, westernUnionTransaction.mMtcn());
                    }
                    bVar.m("sender");
                    if (westernUnionTransaction.mSender() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, westernUnionTransaction.mSender());
                    }
                    bVar.m("amount");
                    if (westernUnionTransaction.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.amount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, westernUnionTransaction.mAmount());
                    }
                    bVar.m("reference_id");
                    if (westernUnionTransaction.mReferenceId() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, westernUnionTransaction.mReferenceId());
                    }
                    bVar.m("balance");
                    if (westernUnionTransaction.mBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.amount_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, westernUnionTransaction.mBalance());
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
        parcel.writeString(mRrn());
        parcel.writeString(mTrn());
        parcel.writeString(mMtcn());
        parcel.writeString(mSender());
        parcel.writeParcelable(mAmount(), i);
        if (mReferenceId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mReferenceId());
        }
        parcel.writeParcelable(mBalance(), i);
    }
}
