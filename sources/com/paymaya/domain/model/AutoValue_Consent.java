package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Consent;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Consent extends C$AutoValue_Consent {
    public static final Parcelable.Creator<AutoValue_Consent> CREATOR = new Parcelable.Creator<AutoValue_Consent>() { // from class: com.paymaya.domain.model.AutoValue_Consent.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Consent createFromParcel(Parcel parcel) {
            return new AutoValue_Consent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Consent[] newArray(int i) {
            return new AutoValue_Consent[i];
        }
    };

    public AutoValue_Consent(final String str, final String str2, final String str3, final boolean z4) {
        new C$$AutoValue_Consent(str, str2, str3, z4) { // from class: com.paymaya.domain.model.$AutoValue_Consent

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Consent$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Consent)";
                }

                @Override // com.google.gson.y
                public Consent read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Consent.Builder builderSBuilder = Consent.sBuilder();
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
                                case "enabled":
                                    y yVarH2 = this.boolean__adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH2;
                                    }
                                    builderSBuilder.isEnabled(((Boolean) yVarH2.read(aVar)).booleanValue());
                                    break;
                                case "id":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mID((String) yVarH3.read(aVar));
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
                public void write(b bVar, Consent consent) throws IOException {
                    if (consent == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (consent.mID() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, consent.mID());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (consent.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, consent.mName());
                    }
                    bVar.m("description");
                    if (consent.mDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, consent.mDescription());
                    }
                    bVar.m(Constants.ENABLED);
                    y yVarH4 = this.boolean__adapter;
                    if (yVarH4 == null) {
                        yVarH4 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH4;
                    }
                    yVarH4.write(bVar, Boolean.valueOf(consent.isEnabled()));
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
        parcel.writeString(mID());
        parcel.writeString(mName());
        parcel.writeString(mDescription());
        parcel.writeInt(isEnabled() ? 1 : 0);
    }
}
