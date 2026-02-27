package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.PurchasedTicket;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PurchasedTicket extends C$AutoValue_PurchasedTicket {
    public static final Parcelable.Creator<AutoValue_PurchasedTicket> CREATOR = new Parcelable.Creator<AutoValue_PurchasedTicket>() { // from class: com.paymaya.domain.model.AutoValue_PurchasedTicket.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PurchasedTicket createFromParcel(Parcel parcel) {
            return new AutoValue_PurchasedTicket(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (TicketPurchaseIssuer) parcel.readParcelable(PurchasedTicket.class.getClassLoader()), (Operator) parcel.readParcelable(PurchasedTicket.class.getClassLoader()), (Route) parcel.readParcelable(PurchasedTicket.class.getClassLoader()), (TicketPurchaseAmount) parcel.readParcelable(PurchasedTicket.class.getClassLoader()), parcel.readHashMap(PurchasedTicket.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PurchasedTicket[] newArray(int i) {
            return new AutoValue_PurchasedTicket[i];
        }
    };

    public AutoValue_PurchasedTicket(final String str, final String str2, final String str3, final String str4, final int i, final String str5, final TicketPurchaseIssuer ticketPurchaseIssuer, final Operator operator, final Route route, final TicketPurchaseAmount ticketPurchaseAmount, final Map<String, String> map) {
        new C$$AutoValue_PurchasedTicket(str, str2, str3, str4, i, str5, ticketPurchaseIssuer, operator, route, ticketPurchaseAmount, map) { // from class: com.paymaya.domain.model.$AutoValue_PurchasedTicket

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PurchasedTicket$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y int__adapter;
                private volatile y map__string_string_adapter;
                private volatile y operator_adapter;
                private volatile y route_adapter;
                private volatile y string_adapter;
                private volatile y ticketPurchaseAmount_adapter;
                private volatile y ticketPurchaseIssuer_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(PurchasedTicket)";
                }

                @Override // com.google.gson.y
                public PurchasedTicket read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    PurchasedTicket.Builder builderSBuilder = PurchasedTicket.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "validity":
                                    y yVarH = this.int__adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Integer.class);
                                        this.int__adapter = yVarH;
                                    }
                                    builderSBuilder.mValidity(((Integer) yVarH.read(aVar)).intValue());
                                    break;
                                case "issuer":
                                    y yVarH2 = this.ticketPurchaseIssuer_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(TicketPurchaseIssuer.class);
                                        this.ticketPurchaseIssuer_adapter = yVarH2;
                                    }
                                    builderSBuilder.mIssuer((TicketPurchaseIssuer) yVarH2.read(aVar));
                                    break;
                                case "number":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mNumber((String) yVarH3.read(aVar));
                                    break;
                                case "operator":
                                    y yVarH4 = this.operator_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Operator.class);
                                        this.operator_adapter = yVarH4;
                                    }
                                    builderSBuilder.mOperator((Operator) yVarH4.read(aVar));
                                    break;
                                case "id":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mId((String) yVarH5.read(aVar));
                                    break;
                                case "data":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mData((String) yVarH6.read(aVar));
                                    break;
                                case "meta":
                                    y yVarG = this.map__string_string_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(Map.class, String.class, String.class));
                                        this.map__string_string_adapter = yVarG;
                                    }
                                    builderSBuilder.mMeta((Map) yVarG.read(aVar));
                                    break;
                                case "request_reference_no":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mRequestReferenceNo((String) yVarH7.read(aVar));
                                    break;
                                case "route":
                                    y yVarH8 = this.route_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(Route.class);
                                        this.route_adapter = yVarH8;
                                    }
                                    builderSBuilder.mRoute((Route) yVarH8.read(aVar));
                                    break;
                                case "total_amount":
                                    y yVarH9 = this.ticketPurchaseAmount_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(TicketPurchaseAmount.class);
                                        this.ticketPurchaseAmount_adapter = yVarH9;
                                    }
                                    builderSBuilder.mAmount((TicketPurchaseAmount) yVarH9.read(aVar));
                                    break;
                                case "date_issued":
                                    y yVarH10 = this.string_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(String.class);
                                        this.string_adapter = yVarH10;
                                    }
                                    builderSBuilder.mDateIssued((String) yVarH10.read(aVar));
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
                public void write(b bVar, PurchasedTicket purchasedTicket) throws IOException {
                    if (purchasedTicket == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (purchasedTicket.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, purchasedTicket.mId());
                    }
                    bVar.m("request_reference_no");
                    if (purchasedTicket.mRequestReferenceNo() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, purchasedTicket.mRequestReferenceNo());
                    }
                    bVar.m("number");
                    if (purchasedTicket.mNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, purchasedTicket.mNumber());
                    }
                    bVar.m("date_issued");
                    if (purchasedTicket.mDateIssued() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, purchasedTicket.mDateIssued());
                    }
                    bVar.m("validity");
                    y yVarH5 = this.int__adapter;
                    if (yVarH5 == null) {
                        yVarH5 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH5;
                    }
                    yVarH5.write(bVar, Integer.valueOf(purchasedTicket.mValidity()));
                    bVar.m("data");
                    if (purchasedTicket.mData() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, purchasedTicket.mData());
                    }
                    bVar.m("issuer");
                    if (purchasedTicket.mIssuer() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.ticketPurchaseIssuer_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(TicketPurchaseIssuer.class);
                            this.ticketPurchaseIssuer_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, purchasedTicket.mIssuer());
                    }
                    bVar.m("operator");
                    if (purchasedTicket.mOperator() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.operator_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(Operator.class);
                            this.operator_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, purchasedTicket.mOperator());
                    }
                    bVar.m("route");
                    if (purchasedTicket.mRoute() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.route_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(Route.class);
                            this.route_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, purchasedTicket.mRoute());
                    }
                    bVar.m("total_amount");
                    if (purchasedTicket.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.ticketPurchaseAmount_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(TicketPurchaseAmount.class);
                            this.ticketPurchaseAmount_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, purchasedTicket.mAmount());
                    }
                    bVar.m("meta");
                    if (purchasedTicket.mMeta() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.map__string_string_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(Map.class, String.class, String.class));
                            this.map__string_string_adapter = yVarG;
                        }
                        yVarG.write(bVar, purchasedTicket.mMeta());
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
        parcel.writeString(mRequestReferenceNo());
        parcel.writeString(mNumber());
        parcel.writeString(mDateIssued());
        parcel.writeInt(mValidity());
        parcel.writeString(mData());
        parcel.writeParcelable(mIssuer(), i);
        parcel.writeParcelable(mOperator(), i);
        parcel.writeParcelable(mRoute(), i);
        parcel.writeParcelable(mAmount(), i);
        parcel.writeMap(mMeta());
    }
}
