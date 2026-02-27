package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.DisplayName;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_DisplayName extends C$AutoValue_DisplayName {
    public static final Parcelable.Creator<AutoValue_DisplayName> CREATOR = new Parcelable.Creator<AutoValue_DisplayName>() { // from class: com.paymaya.domain.model.AutoValue_DisplayName.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_DisplayName createFromParcel(Parcel parcel) {
            return new AutoValue_DisplayName(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_DisplayName[] newArray(int i) {
            return new AutoValue_DisplayName[i];
        }
    };

    public AutoValue_DisplayName(final String str, final String str2) {
        new C$$AutoValue_DisplayName(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_DisplayName

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_DisplayName$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(DisplayName)";
                }

                @Override // com.google.gson.y
                public DisplayName read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    DisplayName.Builder builderSBuilder = DisplayName.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("first_name")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mFirstName((String) yVarH.read(aVar));
                            } else if (strE.equals("last_name")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mLastName((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, DisplayName displayName) throws IOException {
                    if (displayName == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("first_name");
                    if (displayName.mFirstName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, displayName.mFirstName());
                    }
                    bVar.m("last_name");
                    if (displayName.mLastName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, displayName.mLastName());
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
        parcel.writeString(mFirstName());
        parcel.writeString(mLastName());
    }
}
