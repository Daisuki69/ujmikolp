package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BirthPlace;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BirthPlace extends C$AutoValue_BirthPlace {
    public static final Parcelable.Creator<AutoValue_BirthPlace> CREATOR = new Parcelable.Creator<AutoValue_BirthPlace>() { // from class: com.paymaya.domain.model.AutoValue_BirthPlace.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BirthPlace createFromParcel(Parcel parcel) {
            return new AutoValue_BirthPlace(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BirthPlace[] newArray(int i) {
            return new AutoValue_BirthPlace[i];
        }
    };

    public AutoValue_BirthPlace(final String str, final String str2) {
        new C$$AutoValue_BirthPlace(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_BirthPlace

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BirthPlace$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BirthPlace)";
                }

                @Override // com.google.gson.y
                public BirthPlace read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BirthPlace.Builder builderSBuilder = BirthPlace.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("city")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mCity((String) yVarH.read(aVar));
                            } else if (strE.equals("country")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mCountryCode((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, BirthPlace birthPlace) throws IOException {
                    if (birthPlace == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("city");
                    if (birthPlace.mCity() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, birthPlace.mCity());
                    }
                    bVar.m("country");
                    if (birthPlace.mCountryCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, birthPlace.mCountryCode());
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
        parcel.writeString(mCity());
        parcel.writeString(mCountryCode());
    }
}
