package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MissionProgress;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MissionProgress extends C$AutoValue_MissionProgress {
    public static final Parcelable.Creator<AutoValue_MissionProgress> CREATOR = new Parcelable.Creator<AutoValue_MissionProgress>() { // from class: com.paymaya.domain.model.AutoValue_MissionProgress.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionProgress createFromParcel(Parcel parcel) {
            return new AutoValue_MissionProgress(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionProgress[] newArray(int i) {
            return new AutoValue_MissionProgress[i];
        }
    };

    public AutoValue_MissionProgress(final int i, final int i4, final int i6) {
        new C$$AutoValue_MissionProgress(i, i4, i6) { // from class: com.paymaya.domain.model.$AutoValue_MissionProgress

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MissionProgress$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y int__adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MissionProgress)";
                }

                @Override // com.google.gson.y
                public MissionProgress read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MissionProgress.Builder builderSBuilder = MissionProgress.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "actions_ongoing":
                                    y yVarH = this.int__adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Integer.class);
                                        this.int__adapter = yVarH;
                                    }
                                    builderSBuilder.mActionsOngoing(((Integer) yVarH.read(aVar)).intValue());
                                    break;
                                case "actions_completed":
                                    y yVarH2 = this.int__adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Integer.class);
                                        this.int__adapter = yVarH2;
                                    }
                                    builderSBuilder.mActionsCompleted(((Integer) yVarH2.read(aVar)).intValue());
                                    break;
                                case "actions_total":
                                    y yVarH3 = this.int__adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Integer.class);
                                        this.int__adapter = yVarH3;
                                    }
                                    builderSBuilder.mActionsTotal(((Integer) yVarH3.read(aVar)).intValue());
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
                public void write(b bVar, MissionProgress missionProgress) throws IOException {
                    if (missionProgress == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("actions_completed");
                    y yVarH = this.int__adapter;
                    if (yVarH == null) {
                        yVarH = this.gson.h(Integer.class);
                        this.int__adapter = yVarH;
                    }
                    yVarH.write(bVar, Integer.valueOf(missionProgress.mActionsCompleted()));
                    bVar.m("actions_total");
                    y yVarH2 = this.int__adapter;
                    if (yVarH2 == null) {
                        yVarH2 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH2;
                    }
                    yVarH2.write(bVar, Integer.valueOf(missionProgress.mActionsTotal()));
                    bVar.m("actions_ongoing");
                    y yVarH3 = this.int__adapter;
                    if (yVarH3 == null) {
                        yVarH3 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH3;
                    }
                    yVarH3.write(bVar, Integer.valueOf(missionProgress.mActionsOngoing()));
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
        parcel.writeInt(mActionsCompleted());
        parcel.writeInt(mActionsTotal());
        parcel.writeInt(mActionsOngoing());
    }
}
