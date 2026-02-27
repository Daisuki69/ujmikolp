package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.TicketPurchaseConfirmation;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TicketPurchaseConfirmation extends C$AutoValue_TicketPurchaseConfirmation {
    public static final Parcelable.Creator<AutoValue_TicketPurchaseConfirmation> CREATOR = new Parcelable.Creator<AutoValue_TicketPurchaseConfirmation>() { // from class: com.paymaya.domain.model.AutoValue_TicketPurchaseConfirmation.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TicketPurchaseConfirmation createFromParcel(Parcel parcel) {
            return new AutoValue_TicketPurchaseConfirmation(parcel.readString(), (TicketPurchaseIssuer) parcel.readParcelable(TicketPurchaseConfirmation.class.getClassLoader()), (Operator) parcel.readParcelable(TicketPurchaseConfirmation.class.getClassLoader()), (Route) parcel.readParcelable(TicketPurchaseConfirmation.class.getClassLoader()), (TicketPurchaseAmount) parcel.readParcelable(TicketPurchaseConfirmation.class.getClassLoader()), parcel.readHashMap(TicketPurchaseConfirmation.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TicketPurchaseConfirmation[] newArray(int i) {
            return new AutoValue_TicketPurchaseConfirmation[i];
        }
    };

    public AutoValue_TicketPurchaseConfirmation(final String str, final TicketPurchaseIssuer ticketPurchaseIssuer, final Operator operator, final Route route, final TicketPurchaseAmount ticketPurchaseAmount, final Map<String, String> map) {
        new C$$AutoValue_TicketPurchaseConfirmation(str, ticketPurchaseIssuer, operator, route, ticketPurchaseAmount, map) { // from class: com.paymaya.domain.model.$AutoValue_TicketPurchaseConfirmation

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_TicketPurchaseConfirmation$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
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
                    return "TypeAdapter(TicketPurchaseConfirmation)";
                }

                @Override // com.google.gson.y
                public TicketPurchaseConfirmation read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    TicketPurchaseConfirmation.Builder builderSBuilder = TicketPurchaseConfirmation.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "issuer":
                                    y yVarH = this.ticketPurchaseIssuer_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(TicketPurchaseIssuer.class);
                                        this.ticketPurchaseIssuer_adapter = yVarH;
                                    }
                                    builderSBuilder.mIssuer((TicketPurchaseIssuer) yVarH.read(aVar));
                                    break;
                                case "operator":
                                    y yVarH2 = this.operator_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Operator.class);
                                        this.operator_adapter = yVarH2;
                                    }
                                    builderSBuilder.mOperator((Operator) yVarH2.read(aVar));
                                    break;
                                case "id":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mId((String) yVarH3.read(aVar));
                                    break;
                                case "meta":
                                    y yVarG = this.map__string_string_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(Map.class, String.class, String.class));
                                        this.map__string_string_adapter = yVarG;
                                    }
                                    builderSBuilder.mMeta((Map) yVarG.read(aVar));
                                    break;
                                case "route":
                                    y yVarH4 = this.route_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Route.class);
                                        this.route_adapter = yVarH4;
                                    }
                                    builderSBuilder.mRoute((Route) yVarH4.read(aVar));
                                    break;
                                case "total_amount":
                                    y yVarH5 = this.ticketPurchaseAmount_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(TicketPurchaseAmount.class);
                                        this.ticketPurchaseAmount_adapter = yVarH5;
                                    }
                                    builderSBuilder.mAmount((TicketPurchaseAmount) yVarH5.read(aVar));
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
                public void write(b bVar, TicketPurchaseConfirmation ticketPurchaseConfirmation) throws IOException {
                    if (ticketPurchaseConfirmation == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (ticketPurchaseConfirmation.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, ticketPurchaseConfirmation.mId());
                    }
                    bVar.m("issuer");
                    if (ticketPurchaseConfirmation.mIssuer() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.ticketPurchaseIssuer_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(TicketPurchaseIssuer.class);
                            this.ticketPurchaseIssuer_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, ticketPurchaseConfirmation.mIssuer());
                    }
                    bVar.m("operator");
                    if (ticketPurchaseConfirmation.mOperator() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.operator_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Operator.class);
                            this.operator_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, ticketPurchaseConfirmation.mOperator());
                    }
                    bVar.m("route");
                    if (ticketPurchaseConfirmation.mRoute() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.route_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Route.class);
                            this.route_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, ticketPurchaseConfirmation.mRoute());
                    }
                    bVar.m("total_amount");
                    if (ticketPurchaseConfirmation.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.ticketPurchaseAmount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(TicketPurchaseAmount.class);
                            this.ticketPurchaseAmount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, ticketPurchaseConfirmation.mAmount());
                    }
                    bVar.m("meta");
                    if (ticketPurchaseConfirmation.mMeta() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.map__string_string_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(Map.class, String.class, String.class));
                            this.map__string_string_adapter = yVarG;
                        }
                        yVarG.write(bVar, ticketPurchaseConfirmation.mMeta());
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
        parcel.writeParcelable(mIssuer(), i);
        parcel.writeParcelable(mOperator(), i);
        parcel.writeParcelable(mRoute(), i);
        parcel.writeParcelable(mAmount(), i);
        parcel.writeMap(mMeta());
    }
}
