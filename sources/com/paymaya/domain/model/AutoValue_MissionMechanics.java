package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MissionMechanics;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MissionMechanics extends C$AutoValue_MissionMechanics {
    public static final Parcelable.Creator<AutoValue_MissionMechanics> CREATOR = new Parcelable.Creator<AutoValue_MissionMechanics>() { // from class: com.paymaya.domain.model.AutoValue_MissionMechanics.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionMechanics createFromParcel(Parcel parcel) {
            return new AutoValue_MissionMechanics(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionMechanics[] newArray(int i) {
            return new AutoValue_MissionMechanics[i];
        }
    };

    public AutoValue_MissionMechanics(@Nullable final String str, @Nullable final String str2, @Nullable final String str3) {
        new C$$AutoValue_MissionMechanics(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_MissionMechanics

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MissionMechanics$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MissionMechanics)";
                }

                @Override // com.google.gson.y
                public MissionMechanics read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MissionMechanics.Builder builderSBuilder = MissionMechanics.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "button_link":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mButtonLink((String) yVarH.read(aVar));
                                    break;
                                case "description":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mDescription((String) yVarH2.read(aVar));
                                    break;
                                case "button_title":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mButtonTitle((String) yVarH3.read(aVar));
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
                public void write(b bVar, MissionMechanics missionMechanics) throws IOException {
                    if (missionMechanics == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("description");
                    if (missionMechanics.mDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, missionMechanics.mDescription());
                    }
                    bVar.m("button_title");
                    if (missionMechanics.mButtonTitle() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, missionMechanics.mButtonTitle());
                    }
                    bVar.m("button_link");
                    if (missionMechanics.mButtonLink() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, missionMechanics.mButtonLink());
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
        if (mDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mDescription());
        }
        if (mButtonTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mButtonTitle());
        }
        if (mButtonLink() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mButtonLink());
        }
    }
}
