package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MissionAction;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MissionAction extends C$AutoValue_MissionAction {
    public static final Parcelable.Creator<AutoValue_MissionAction> CREATOR = new Parcelable.Creator<AutoValue_MissionAction>() { // from class: com.paymaya.domain.model.AutoValue_MissionAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            boolean z4 = parcel.readInt() == 1;
            Boolean boolValueOf = null;
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            }
            return new AutoValue_MissionAction(string, z4, string2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionAction[] newArray(int i) {
            return new AutoValue_MissionAction[i];
        }
    };

    public AutoValue_MissionAction(final String str, final boolean z4, @Nullable final String str2, @Nullable final Boolean bool) {
        new C$$AutoValue_MissionAction(str, z4, str2, bool) { // from class: com.paymaya.domain.model.$AutoValue_MissionAction

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MissionAction$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean___adapter;
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MissionAction)";
                }

                @Override // com.google.gson.y
                public MissionAction read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MissionAction.Builder builderSBuilder = MissionAction.sBuilder();
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
                                case "completed":
                                    y yVarH2 = this.boolean__adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH2;
                                    }
                                    builderSBuilder.mCompleted(((Boolean) yVarH2.read(aVar)).booleanValue());
                                    break;
                                case "ongoing":
                                    y yVarH3 = this.boolean___adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Boolean.class);
                                        this.boolean___adapter = yVarH3;
                                    }
                                    builderSBuilder.mOngoing((Boolean) yVarH3.read(aVar));
                                    break;
                                case "name":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mName((String) yVarH4.read(aVar));
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
                public void write(b bVar, MissionAction missionAction) throws IOException {
                    if (missionAction == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (missionAction.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, missionAction.mName());
                    }
                    bVar.m("completed");
                    y yVarH2 = this.boolean__adapter;
                    if (yVarH2 == null) {
                        yVarH2 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH2;
                    }
                    yVarH2.write(bVar, Boolean.valueOf(missionAction.mCompleted()));
                    bVar.m("description");
                    if (missionAction.mDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, missionAction.mDescription());
                    }
                    bVar.m("ongoing");
                    if (missionAction.mOngoing() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.boolean___adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Boolean.class);
                            this.boolean___adapter = yVarH4;
                        }
                        yVarH4.write(bVar, missionAction.mOngoing());
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
        parcel.writeString(mName());
        parcel.writeInt(mCompleted() ? 1 : 0);
        if (mDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mDescription());
        }
        if (mOngoing() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mOngoing().booleanValue() ? 1 : 0);
        }
    }
}
