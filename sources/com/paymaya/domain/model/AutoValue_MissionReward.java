package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MissionReward;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MissionReward extends C$AutoValue_MissionReward {
    public static final Parcelable.Creator<AutoValue_MissionReward> CREATOR = new Parcelable.Creator<AutoValue_MissionReward>() { // from class: com.paymaya.domain.model.AutoValue_MissionReward.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionReward createFromParcel(Parcel parcel) {
            return new AutoValue_MissionReward(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MissionReward[] newArray(int i) {
            return new AutoValue_MissionReward[i];
        }
    };

    public AutoValue_MissionReward(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5, final double d10) {
        new C$$AutoValue_MissionReward(str, str2, str3, str4, str5, d10) { // from class: com.paymaya.domain.model.$AutoValue_MissionReward

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MissionReward$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y double__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MissionReward)";
                }

                @Override // com.google.gson.y
                public MissionReward read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MissionReward.Builder builderSBuilder = MissionReward.sBuilder();
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
                                case "preview_icon":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mPreviewIcon((String) yVarH2.read(aVar));
                                    break;
                                case "name":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mName((String) yVarH3.read(aVar));
                                    break;
                                case "type":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mType((String) yVarH4.read(aVar));
                                    break;
                                case "title":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mTitle((String) yVarH5.read(aVar));
                                    break;
                                case "value":
                                    y yVarH6 = this.double__adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(Double.class);
                                        this.double__adapter = yVarH6;
                                    }
                                    builderSBuilder.mValue(((Double) yVarH6.read(aVar)).doubleValue());
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
                public void write(b bVar, MissionReward missionReward) throws IOException {
                    if (missionReward == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("title");
                    if (missionReward.mTitle() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, missionReward.mTitle());
                    }
                    bVar.m("description");
                    if (missionReward.mDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, missionReward.mDescription());
                    }
                    bVar.m("preview_icon");
                    if (missionReward.mPreviewIcon() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, missionReward.mPreviewIcon());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (missionReward.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, missionReward.mName());
                    }
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (missionReward.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, missionReward.mType());
                    }
                    bVar.m("value");
                    y yVarH6 = this.double__adapter;
                    if (yVarH6 == null) {
                        yVarH6 = this.gson.h(Double.class);
                        this.double__adapter = yVarH6;
                    }
                    yVarH6.write(bVar, Double.valueOf(missionReward.mValue()));
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
        if (mTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mTitle());
        }
        if (mDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mDescription());
        }
        if (mPreviewIcon() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPreviewIcon());
        }
        if (mName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mName());
        }
        if (mType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mType());
        }
        parcel.writeDouble(mValue());
    }
}
