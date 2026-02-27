package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.Mission;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Mission extends C$AutoValue_Mission {
    public static final Parcelable.Creator<AutoValue_Mission> CREATOR = new Parcelable.Creator<AutoValue_Mission>() { // from class: com.paymaya.domain.model.AutoValue_Mission.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Mission createFromParcel(Parcel parcel) {
            return new AutoValue_Mission(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (MissionValidity) parcel.readParcelable(Mission.class.getClassLoader()), (MissionReward) parcel.readParcelable(Mission.class.getClassLoader()), (MissionMechanics) parcel.readParcelable(Mission.class.getClassLoader()), parcel.readArrayList(Mission.class.getClassLoader()), (MissionProgress) parcel.readParcelable(Mission.class.getClassLoader()), parcel.readInt() == 1, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Mission[] newArray(int i) {
            return new AutoValue_Mission[i];
        }
    };

    public AutoValue_Mission(String str, String str2, String str3, String str4, @Nullable String str5, @Nullable MissionValidity missionValidity, @Nullable MissionReward missionReward, @Nullable MissionMechanics missionMechanics, @Nullable List<MissionAction> list, @Nullable MissionProgress missionProgress, boolean z4, @Nullable String str6) {
        new C$$AutoValue_Mission(str, str2, str3, str4, str5, missionValidity, missionReward, missionMechanics, list, missionProgress, z4, str6) { // from class: com.paymaya.domain.model.$AutoValue_Mission

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Mission$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y list__missionAction_adapter;
                private volatile y missionMechanics_adapter;
                private volatile y missionProgress_adapter;
                private volatile y missionReward_adapter;
                private volatile y missionValidity_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Mission)";
                }

                @Override // com.google.gson.y
                public Mission read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Mission.Builder builderSBuilder = Mission.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "description":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mDescription((String) yVarH.read(aVar));
                                    break;
                                case "start_date":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mStartDate((String) yVarH2.read(aVar));
                                    break;
                                case "validity":
                                    y yVarH3 = this.missionValidity_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(MissionValidity.class);
                                        this.missionValidity_adapter = yVarH3;
                                    }
                                    builderSBuilder.mMissionValidity((MissionValidity) yVarH3.read(aVar));
                                    break;
                                case "completed":
                                    y yVarH4 = this.boolean__adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH4;
                                    }
                                    builderSBuilder.mCompleted(((Boolean) yVarH4.read(aVar)).booleanValue());
                                    break;
                                case "actions":
                                    y yVarG = this.list__missionAction_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, MissionAction.class));
                                        this.list__missionAction_adapter = yVarG;
                                    }
                                    builderSBuilder.mMissionActionsList((List) yVarG.read(aVar));
                                    break;
                                case "progress":
                                    y yVarH5 = this.missionProgress_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(MissionProgress.class);
                                        this.missionProgress_adapter = yVarH5;
                                    }
                                    builderSBuilder.mMissionProgress((MissionProgress) yVarH5.read(aVar));
                                    break;
                                case "reward":
                                    y yVarH6 = this.missionReward_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(MissionReward.class);
                                        this.missionReward_adapter = yVarH6;
                                    }
                                    builderSBuilder.mMissionReward((MissionReward) yVarH6.read(aVar));
                                    break;
                                case "status":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mStatus((String) yVarH7.read(aVar));
                                    break;
                                case "image_url":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mImageUrl((String) yVarH8.read(aVar));
                                    break;
                                case "title":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mTitle((String) yVarH9.read(aVar));
                                    break;
                                case "mechanics":
                                    y yVarH10 = this.missionMechanics_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(MissionMechanics.class);
                                        this.missionMechanics_adapter = yVarH10;
                                    }
                                    builderSBuilder.mMissionMechanics((MissionMechanics) yVarH10.read(aVar));
                                    break;
                                case "end_date":
                                    y yVarH11 = this.string_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(String.class);
                                        this.string_adapter = yVarH11;
                                    }
                                    builderSBuilder.mEndDate((String) yVarH11.read(aVar));
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
                public void write(b bVar, Mission mission) throws IOException {
                    if (mission == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("title");
                    if (mission.mTitle() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, mission.mTitle());
                    }
                    bVar.m("description");
                    if (mission.mDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, mission.mDescription());
                    }
                    bVar.m("start_date");
                    if (mission.mStartDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, mission.mStartDate());
                    }
                    bVar.m("end_date");
                    if (mission.mEndDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, mission.mEndDate());
                    }
                    bVar.m("image_url");
                    if (mission.mImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, mission.mImageUrl());
                    }
                    bVar.m("validity");
                    if (mission.mMissionValidity() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.missionValidity_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(MissionValidity.class);
                            this.missionValidity_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, mission.mMissionValidity());
                    }
                    bVar.m("reward");
                    if (mission.mMissionReward() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.missionReward_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(MissionReward.class);
                            this.missionReward_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, mission.mMissionReward());
                    }
                    bVar.m("mechanics");
                    if (mission.mMissionMechanics() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.missionMechanics_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(MissionMechanics.class);
                            this.missionMechanics_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, mission.mMissionMechanics());
                    }
                    bVar.m("actions");
                    if (mission.mMissionActionsList() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__missionAction_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, MissionAction.class));
                            this.list__missionAction_adapter = yVarG;
                        }
                        yVarG.write(bVar, mission.mMissionActionsList());
                    }
                    bVar.m("progress");
                    if (mission.mMissionProgress() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.missionProgress_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(MissionProgress.class);
                            this.missionProgress_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, mission.mMissionProgress());
                    }
                    bVar.m("completed");
                    y yVarH10 = this.boolean__adapter;
                    if (yVarH10 == null) {
                        yVarH10 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH10;
                    }
                    yVarH10.write(bVar, Boolean.valueOf(mission.mCompleted()));
                    bVar.m("status");
                    if (mission.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.string_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(String.class);
                            this.string_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, mission.mStatus());
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
        parcel.writeString(mTitle());
        parcel.writeString(mDescription());
        parcel.writeString(mStartDate());
        parcel.writeString(mEndDate());
        if (mImageUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mImageUrl());
        }
        parcel.writeParcelable(mMissionValidity(), i);
        parcel.writeParcelable(mMissionReward(), i);
        parcel.writeParcelable(mMissionMechanics(), i);
        parcel.writeList(mMissionActionsList());
        parcel.writeParcelable(mMissionProgress(), i);
        parcel.writeInt(mCompleted() ? 1 : 0);
        if (mStatus() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mStatus());
        }
    }
}
