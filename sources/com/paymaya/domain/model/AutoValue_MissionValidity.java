package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MissionValidity;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MissionValidity extends C$AutoValue_MissionValidity {
    public static final Parcelable.Creator<AutoValue_MissionValidity> CREATOR = new Parcelable.Creator<AutoValue_MissionValidity>() { // from class: com.paymaya.domain.model.AutoValue_MissionValidity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionValidity createFromParcel(Parcel parcel) {
            return new AutoValue_MissionValidity(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionValidity[] newArray(int i) {
            return new AutoValue_MissionValidity[i];
        }
    };

    public AutoValue_MissionValidity(final int i, final String str) {
        new C$$AutoValue_MissionValidity(i, str) { // from class: com.paymaya.domain.model.$AutoValue_MissionValidity

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MissionValidity$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y int__adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MissionValidity)";
                }

                @Override // com.google.gson.y
                public MissionValidity read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MissionValidity.Builder builderSBuilder = MissionValidity.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("unit")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mUnit((String) yVarH.read(aVar));
                            } else if (strE.equals("value")) {
                                y yVarH2 = this.int__adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(Integer.class);
                                    this.int__adapter = yVarH2;
                                }
                                builderSBuilder.mValue(((Integer) yVarH2.read(aVar)).intValue());
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, MissionValidity missionValidity) throws IOException {
                    if (missionValidity == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("value");
                    y yVarH = this.int__adapter;
                    if (yVarH == null) {
                        yVarH = this.gson.h(Integer.class);
                        this.int__adapter = yVarH;
                    }
                    yVarH.write(bVar, Integer.valueOf(missionValidity.mValue()));
                    bVar.m("unit");
                    if (missionValidity.mUnit() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, missionValidity.mUnit());
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
        parcel.writeInt(mValue());
        parcel.writeString(mUnit());
    }
}
