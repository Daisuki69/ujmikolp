package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.PullFundsCard;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PullFundsCard extends C$AutoValue_PullFundsCard {
    public static final Parcelable.Creator<AutoValue_PullFundsCard> CREATOR = new Parcelable.Creator<AutoValue_PullFundsCard>() { // from class: com.paymaya.domain.model.AutoValue_PullFundsCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PullFundsCard createFromParcel(Parcel parcel) {
            return new AutoValue_PullFundsCard(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PullFundsCard[] newArray(int i) {
            return new AutoValue_PullFundsCard[i];
        }
    };

    public AutoValue_PullFundsCard(final String str, final String str2) {
        new C$$AutoValue_PullFundsCard(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_PullFundsCard

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PullFundsCard$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(PullFundsCard)";
                }

                @Override // com.google.gson.y
                public PullFundsCard read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    PullFundsCard.Builder builderSBuilder = PullFundsCard.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("scheme")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mScheme((String) yVarH.read(aVar));
                            } else if (strE.equals("last_four")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mLastFour((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, PullFundsCard pullFundsCard) throws IOException {
                    if (pullFundsCard == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("last_four");
                    if (pullFundsCard.mLastFour() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, pullFundsCard.mLastFour());
                    }
                    bVar.m("scheme");
                    if (pullFundsCard.mScheme() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, pullFundsCard.mScheme());
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
        parcel.writeString(mLastFour());
        parcel.writeString(mScheme());
    }
}
