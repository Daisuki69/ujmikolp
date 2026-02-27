package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.TicketPurchaseIssuer;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TicketPurchaseIssuer extends C$AutoValue_TicketPurchaseIssuer {
    public static final Parcelable.Creator<AutoValue_TicketPurchaseIssuer> CREATOR = new Parcelable.Creator<AutoValue_TicketPurchaseIssuer>() { // from class: com.paymaya.domain.model.AutoValue_TicketPurchaseIssuer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TicketPurchaseIssuer createFromParcel(Parcel parcel) {
            return new AutoValue_TicketPurchaseIssuer(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), (ImageUrlUnfiltered) parcel.readParcelable(TicketPurchaseIssuer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TicketPurchaseIssuer[] newArray(int i) {
            return new AutoValue_TicketPurchaseIssuer[i];
        }
    };

    public AutoValue_TicketPurchaseIssuer(@Nullable final String str, final String str2, @Nullable final ImageUrlUnfiltered imageUrlUnfiltered) {
        new C$$AutoValue_TicketPurchaseIssuer(str, str2, imageUrlUnfiltered) { // from class: com.paymaya.domain.model.$AutoValue_TicketPurchaseIssuer

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_TicketPurchaseIssuer$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y imageUrlUnfiltered_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(TicketPurchaseIssuer)";
                }

                @Override // com.google.gson.y
                public TicketPurchaseIssuer read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    TicketPurchaseIssuer.Builder builderSBuilder = TicketPurchaseIssuer.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "id":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mId((String) yVarH.read(aVar));
                                    break;
                                case "name":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mName((String) yVarH2.read(aVar));
                                    break;
                                case "confirmation_url":
                                    y yVarH3 = this.imageUrlUnfiltered_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(ImageUrlUnfiltered.class);
                                        this.imageUrlUnfiltered_adapter = yVarH3;
                                    }
                                    builderSBuilder.mImageUrl((ImageUrlUnfiltered) yVarH3.read(aVar));
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
                public void write(b bVar, TicketPurchaseIssuer ticketPurchaseIssuer) throws IOException {
                    if (ticketPurchaseIssuer == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (ticketPurchaseIssuer.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, ticketPurchaseIssuer.mId());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (ticketPurchaseIssuer.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, ticketPurchaseIssuer.mName());
                    }
                    bVar.m("confirmation_url");
                    if (ticketPurchaseIssuer.mImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.imageUrlUnfiltered_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(ImageUrlUnfiltered.class);
                            this.imageUrlUnfiltered_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, ticketPurchaseIssuer.mImageUrl());
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
        if (mId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mId());
        }
        parcel.writeString(mName());
        parcel.writeParcelable(mImageUrl(), i);
    }
}
