package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.BillsPayRequest;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BillsPayRequest extends C$AutoValue_BillsPayRequest {
    public static final Parcelable.Creator<AutoValue_BillsPayRequest> CREATOR = new Parcelable.Creator<AutoValue_BillsPayRequest>() { // from class: com.paymaya.domain.model.AutoValue_BillsPayRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillsPayRequest createFromParcel(Parcel parcel) {
            return new AutoValue_BillsPayRequest((BillsPayRequestDetails) parcel.readParcelable(BillsPayRequest.class.getClassLoader()), (Amount) parcel.readParcelable(BillsPayRequest.class.getClassLoader()), parcel.readHashMap(BillsPayRequest.class.getClassLoader()), (ImageUrlUnfiltered) parcel.readParcelable(BillsPayRequest.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillsPayRequest[] newArray(int i) {
            return new AutoValue_BillsPayRequest[i];
        }
    };

    public AutoValue_BillsPayRequest(@Nullable final BillsPayRequestDetails billsPayRequestDetails, @Nullable final Amount amount, @Nullable final Map<String, String> map, @Nullable final ImageUrlUnfiltered imageUrlUnfiltered) {
        new C$$AutoValue_BillsPayRequest(billsPayRequestDetails, amount, map, imageUrlUnfiltered) { // from class: com.paymaya.domain.model.$AutoValue_BillsPayRequest

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BillsPayRequest$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private volatile y billsPayRequestDetails_adapter;
                private final j gson;
                private volatile y imageUrlUnfiltered_adapter;
                private volatile y map__string_string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BillsPayRequest)";
                }

                @Override // com.google.gson.y
                public BillsPayRequest read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BillsPayRequest.Builder builderSBuilder = BillsPayRequest.sBuilder();
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
                                case "biller":
                                    y yVarH2 = this.billsPayRequestDetails_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(BillsPayRequestDetails.class);
                                        this.billsPayRequestDetails_adapter = yVarH2;
                                    }
                                    builderSBuilder.mBiller((BillsPayRequestDetails) yVarH2.read(aVar));
                                    break;
                                case "icon_url":
                                    y yVarH3 = this.imageUrlUnfiltered_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(ImageUrlUnfiltered.class);
                                        this.imageUrlUnfiltered_adapter = yVarH3;
                                    }
                                    builderSBuilder.mImageUrl((ImageUrlUnfiltered) yVarH3.read(aVar));
                                    break;
                                case "other_fields":
                                    y yVarG = this.map__string_string_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(Map.class, String.class, String.class));
                                        this.map__string_string_adapter = yVarG;
                                    }
                                    builderSBuilder.mOtherFields((Map) yVarG.read(aVar));
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
                public void write(b bVar, BillsPayRequest billsPayRequest) throws IOException {
                    if (billsPayRequest == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("biller");
                    if (billsPayRequest.mBiller() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.billsPayRequestDetails_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(BillsPayRequestDetails.class);
                            this.billsPayRequestDetails_adapter = yVarH;
                        }
                        yVarH.write(bVar, billsPayRequest.mBiller());
                    }
                    bVar.m("amount");
                    if (billsPayRequest.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.amount_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, billsPayRequest.mAmount());
                    }
                    bVar.m("other_fields");
                    if (billsPayRequest.mOtherFields() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.map__string_string_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(Map.class, String.class, String.class));
                            this.map__string_string_adapter = yVarG;
                        }
                        yVarG.write(bVar, billsPayRequest.mOtherFields());
                    }
                    bVar.m("icon_url");
                    if (billsPayRequest.mImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.imageUrlUnfiltered_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(ImageUrlUnfiltered.class);
                            this.imageUrlUnfiltered_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, billsPayRequest.mImageUrl());
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
        parcel.writeParcelable(mBiller(), i);
        parcel.writeParcelable(mAmount(), i);
        parcel.writeMap(mOtherFields());
        parcel.writeParcelable(mImageUrl(), i);
    }
}
