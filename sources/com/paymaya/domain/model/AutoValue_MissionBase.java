package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.MissionBase;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MissionBase extends C$AutoValue_MissionBase {
    public static final Parcelable.Creator<AutoValue_MissionBase> CREATOR = new Parcelable.Creator<AutoValue_MissionBase>() { // from class: com.paymaya.domain.model.AutoValue_MissionBase.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionBase createFromParcel(Parcel parcel) {
            return new AutoValue_MissionBase(parcel.readArrayList(MissionBase.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionBase[] newArray(int i) {
            return new AutoValue_MissionBase[i];
        }
    };

    public AutoValue_MissionBase(final List<Mission> list) {
        new C$$AutoValue_MissionBase(list) { // from class: com.paymaya.domain.model.$AutoValue_MissionBase

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MissionBase$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y list__mission_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MissionBase)";
                }

                @Override // com.google.gson.y
                public MissionBase read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MissionBase.Builder builderSBuilder = MissionBase.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("missions")) {
                                y yVarG = this.list__mission_adapter;
                                if (yVarG == null) {
                                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, Mission.class));
                                    this.list__mission_adapter = yVarG;
                                }
                                builderSBuilder.mMissions((List) yVarG.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, MissionBase missionBase) throws IOException {
                    if (missionBase == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("missions");
                    if (missionBase.mMissions() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__mission_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, Mission.class));
                            this.list__mission_adapter = yVarG;
                        }
                        yVarG.write(bVar, missionBase.mMissions());
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
        parcel.writeList(mMissions());
    }
}
