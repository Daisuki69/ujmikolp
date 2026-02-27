package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BillerDynamicField;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BillerDynamicField extends C$AutoValue_BillerDynamicField {
    public static final Parcelable.Creator<AutoValue_BillerDynamicField> CREATOR = new Parcelable.Creator<AutoValue_BillerDynamicField>() { // from class: com.paymaya.domain.model.AutoValue_BillerDynamicField.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerDynamicField createFromParcel(Parcel parcel) {
            return new AutoValue_BillerDynamicField(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerDynamicField[] newArray(int i) {
            return new AutoValue_BillerDynamicField[i];
        }
    };

    public AutoValue_BillerDynamicField(@Nullable final String str, @Nullable final String str2, @Nullable final String str3) {
        new C$$AutoValue_BillerDynamicField(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_BillerDynamicField

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BillerDynamicField$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BillerDynamicField)";
                }

                @Override // com.google.gson.y
                public BillerDynamicField read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BillerDynamicField.Builder builderSBuilder = BillerDynamicField.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "value":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mValue((String) yVarH.read(aVar));
                                    break;
                                case "placeholder":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mLabel((String) yVarH2.read(aVar));
                                    break;
                                case "parameter":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mParameter((String) yVarH3.read(aVar));
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
                public void write(b bVar, BillerDynamicField billerDynamicField) throws IOException {
                    if (billerDynamicField == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                    if (billerDynamicField.mParameter() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, billerDynamicField.mParameter());
                    }
                    bVar.m("value");
                    if (billerDynamicField.mValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, billerDynamicField.mValue());
                    }
                    bVar.m("placeholder");
                    if (billerDynamicField.mLabel() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, billerDynamicField.mLabel());
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
        if (mParameter() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mParameter());
        }
        if (mValue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mValue());
        }
        if (mLabel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mLabel());
        }
    }
}
