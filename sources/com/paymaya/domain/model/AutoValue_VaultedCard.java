package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.VaultedCard;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_VaultedCard extends C$AutoValue_VaultedCard {
    public static final Parcelable.Creator<AutoValue_VaultedCard> CREATOR = new Parcelable.Creator<AutoValue_VaultedCard>() { // from class: com.paymaya.domain.model.AutoValue_VaultedCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VaultedCard createFromParcel(Parcel parcel) {
            return new AutoValue_VaultedCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VaultedCard[] newArray(int i) {
            return new AutoValue_VaultedCard[i];
        }
    };

    public AutoValue_VaultedCard(final String str, final String str2, final String str3, final String str4) {
        new C$$AutoValue_VaultedCard(str, str2, str3, str4) { // from class: com.paymaya.domain.model.$AutoValue_VaultedCard

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_VaultedCard$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(VaultedCard)";
                }

                @Override // com.google.gson.y
                public VaultedCard read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    VaultedCard.Builder builderSBuilder = VaultedCard.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "card_token_id":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mCardTokenId((String) yVarH.read(aVar));
                                    break;
                                case "scheme":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mCardScheme((String) yVarH2.read(aVar));
                                    break;
                                case "state":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mState((String) yVarH3.read(aVar));
                                    break;
                                case "last_four":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mLastFourDigits((String) yVarH4.read(aVar));
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
                public void write(b bVar, VaultedCard vaultedCard) throws IOException {
                    if (vaultedCard == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("state");
                    if (vaultedCard.mState() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, vaultedCard.mState());
                    }
                    bVar.m("last_four");
                    if (vaultedCard.mLastFourDigits() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, vaultedCard.mLastFourDigits());
                    }
                    bVar.m("scheme");
                    if (vaultedCard.mCardScheme() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, vaultedCard.mCardScheme());
                    }
                    bVar.m("card_token_id");
                    if (vaultedCard.mCardTokenId() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, vaultedCard.mCardTokenId());
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
        parcel.writeString(mState());
        parcel.writeString(mLastFourDigits());
        parcel.writeString(mCardScheme());
        parcel.writeString(mCardTokenId());
    }
}
