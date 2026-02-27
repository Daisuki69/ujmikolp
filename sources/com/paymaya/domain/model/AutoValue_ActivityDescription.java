package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ActivityDescription;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ActivityDescription extends C$AutoValue_ActivityDescription {
    public static final Parcelable.Creator<AutoValue_ActivityDescription> CREATOR = new Parcelable.Creator<AutoValue_ActivityDescription>() { // from class: com.paymaya.domain.model.AutoValue_ActivityDescription.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ActivityDescription createFromParcel(Parcel parcel) {
            return new AutoValue_ActivityDescription(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ActivityDescription[] newArray(int i) {
            return new AutoValue_ActivityDescription[i];
        }
    };

    public AutoValue_ActivityDescription(final String str, final String str2) {
        new C$$AutoValue_ActivityDescription(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_ActivityDescription

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ActivityDescription$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ActivityDescription)";
                }

                @Override // com.google.gson.y
                public ActivityDescription read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ActivityDescription.Builder builderSBuilder = ActivityDescription.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("action")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mAction((String) yVarH.read(aVar));
                            } else if (strE.equals(TypedValues.AttributesType.S_TARGET)) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mTarget((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, ActivityDescription activityDescription) throws IOException {
                    if (activityDescription == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("action");
                    if (activityDescription.mAction() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, activityDescription.mAction());
                    }
                    bVar.m(TypedValues.AttributesType.S_TARGET);
                    if (activityDescription.mTarget() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, activityDescription.mTarget());
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
        parcel.writeString(mAction());
        parcel.writeString(mTarget());
    }
}
