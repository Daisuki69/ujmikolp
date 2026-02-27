package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.TicketPurchaseAmount;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TicketPurchaseAmount extends C$AutoValue_TicketPurchaseAmount {
    public static final Parcelable.Creator<AutoValue_TicketPurchaseAmount> CREATOR = new Parcelable.Creator<AutoValue_TicketPurchaseAmount>() { // from class: com.paymaya.domain.model.AutoValue_TicketPurchaseAmount.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TicketPurchaseAmount createFromParcel(Parcel parcel) {
            return new AutoValue_TicketPurchaseAmount(parcel.readString(), parcel.readString(), (TicketPurchaseAmountDetails) parcel.readParcelable(TicketPurchaseAmount.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TicketPurchaseAmount[] newArray(int i) {
            return new AutoValue_TicketPurchaseAmount[i];
        }
    };

    public AutoValue_TicketPurchaseAmount(final String str, final String str2, @Nullable final TicketPurchaseAmountDetails ticketPurchaseAmountDetails) {
        new C$$AutoValue_TicketPurchaseAmount(str, str2, ticketPurchaseAmountDetails) { // from class: com.paymaya.domain.model.$AutoValue_TicketPurchaseAmount

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_TicketPurchaseAmount$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;
                private volatile y ticketPurchaseAmountDetails_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(TicketPurchaseAmount)";
                }

                @Override // com.google.gson.y
                public TicketPurchaseAmount read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    TicketPurchaseAmount.Builder builderSBuilder = TicketPurchaseAmount.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "value":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mValue((String) yVarH.read(aVar));
                                    break;
                                case "currency":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mCurrency((String) yVarH2.read(aVar));
                                    break;
                                case "details":
                                    y yVarH3 = this.ticketPurchaseAmountDetails_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(TicketPurchaseAmountDetails.class);
                                        this.ticketPurchaseAmountDetails_adapter = yVarH3;
                                    }
                                    builderSBuilder.mDetails((TicketPurchaseAmountDetails) yVarH3.read(aVar));
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
                public void write(b bVar, TicketPurchaseAmount ticketPurchaseAmount) throws IOException {
                    if (ticketPurchaseAmount == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("value");
                    if (ticketPurchaseAmount.mValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, ticketPurchaseAmount.mValue());
                    }
                    bVar.m("currency");
                    if (ticketPurchaseAmount.mCurrency() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, ticketPurchaseAmount.mCurrency());
                    }
                    bVar.m("details");
                    if (ticketPurchaseAmount.mDetails() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.ticketPurchaseAmountDetails_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(TicketPurchaseAmountDetails.class);
                            this.ticketPurchaseAmountDetails_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, ticketPurchaseAmount.mDetails());
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
        parcel.writeString(mValue());
        parcel.writeString(mCurrency());
        parcel.writeParcelable(mDetails(), i);
    }
}
