package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.TicketPurchaseAmountDetails;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TicketPurchaseAmountDetails extends C$AutoValue_TicketPurchaseAmountDetails {
    public static final Parcelable.Creator<AutoValue_TicketPurchaseAmountDetails> CREATOR = new Parcelable.Creator<AutoValue_TicketPurchaseAmountDetails>() { // from class: com.paymaya.domain.model.AutoValue_TicketPurchaseAmountDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TicketPurchaseAmountDetails createFromParcel(Parcel parcel) {
            return new AutoValue_TicketPurchaseAmountDetails(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TicketPurchaseAmountDetails[] newArray(int i) {
            return new AutoValue_TicketPurchaseAmountDetails[i];
        }
    };

    public AutoValue_TicketPurchaseAmountDetails(@Nullable final String str, @Nullable final String str2) {
        new C$$AutoValue_TicketPurchaseAmountDetails(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_TicketPurchaseAmountDetails

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_TicketPurchaseAmountDetails$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(TicketPurchaseAmountDetails)";
                }

                @Override // com.google.gson.y
                public TicketPurchaseAmountDetails read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    TicketPurchaseAmountDetails.Builder builderSBuilder = TicketPurchaseAmountDetails.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("subtotal")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mSubtotal((String) yVarH.read(aVar));
                            } else if (strE.equals("fee")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mFee((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, TicketPurchaseAmountDetails ticketPurchaseAmountDetails) throws IOException {
                    if (ticketPurchaseAmountDetails == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("fee");
                    if (ticketPurchaseAmountDetails.mFee() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, ticketPurchaseAmountDetails.mFee());
                    }
                    bVar.m("subtotal");
                    if (ticketPurchaseAmountDetails.mSubtotal() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, ticketPurchaseAmountDetails.mSubtotal());
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
        if (mFee() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mFee());
        }
        if (mSubtotal() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mSubtotal());
        }
    }
}
