package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.EkycAccountType;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_EkycAccountType extends C$AutoValue_EkycAccountType {
    public static final Parcelable.Creator<AutoValue_EkycAccountType> CREATOR = new Parcelable.Creator<AutoValue_EkycAccountType>() { // from class: com.paymaya.domain.model.AutoValue_EkycAccountType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EkycAccountType createFromParcel(Parcel parcel) {
            return new AutoValue_EkycAccountType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EkycAccountType[] newArray(int i) {
            return new AutoValue_EkycAccountType[i];
        }
    };

    public AutoValue_EkycAccountType(final String str, final String str2, final String str3, final String str4) {
        new C$$AutoValue_EkycAccountType(str, str2, str3, str4) { // from class: com.paymaya.domain.model.$AutoValue_EkycAccountType

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_EkycAccountType$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(EkycAccountType)";
                }

                @Override // com.google.gson.y
                public EkycAccountType read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    EkycAccountType.Builder builderSBuilder = EkycAccountType.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "name":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mName((String) yVarH.read(aVar));
                                    break;
                                case "type":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mType((String) yVarH2.read(aVar));
                                    break;
                                case "classification":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mClassification((String) yVarH3.read(aVar));
                                    break;
                                case "account_type":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mAccountType((String) yVarH4.read(aVar));
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
                public void write(b bVar, EkycAccountType ekycAccountType) throws IOException {
                    if (ekycAccountType == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("account_type");
                    if (ekycAccountType.mAccountType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, ekycAccountType.mAccountType());
                    }
                    bVar.m("classification");
                    if (ekycAccountType.mClassification() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, ekycAccountType.mClassification());
                    }
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (ekycAccountType.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, ekycAccountType.mType());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (ekycAccountType.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, ekycAccountType.mName());
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
        parcel.writeString(mAccountType());
        parcel.writeString(mClassification());
        parcel.writeString(mType());
        parcel.writeString(mName());
    }
}
