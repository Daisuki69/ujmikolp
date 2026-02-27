package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.CardProfile;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CardProfile extends C$AutoValue_CardProfile {
    public static final Parcelable.Creator<AutoValue_CardProfile> CREATOR = new Parcelable.Creator<AutoValue_CardProfile>() { // from class: com.paymaya.domain.model.AutoValue_CardProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CardProfile createFromParcel(Parcel parcel) {
            return new AutoValue_CardProfile(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CardProfile[] newArray(int i) {
            return new AutoValue_CardProfile[i];
        }
    };

    public AutoValue_CardProfile(final String str, final String str2) {
        new C$$AutoValue_CardProfile(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_CardProfile

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_CardProfile$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(CardProfile)";
                }

                @Override // com.google.gson.y
                public CardProfile read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    CardProfile.Builder builderSBuilder = CardProfile.sBuilder();
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
                            } else if (strE.equals("brand")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mBrand((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, CardProfile cardProfile) throws IOException {
                    if (cardProfile == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("scheme");
                    if (cardProfile.mScheme() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, cardProfile.mScheme());
                    }
                    bVar.m("brand");
                    if (cardProfile.mBrand() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, cardProfile.mBrand());
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
        parcel.writeString(mScheme());
        parcel.writeString(mBrand());
    }
}
