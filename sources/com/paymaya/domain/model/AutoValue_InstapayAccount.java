package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.InstapayAccount;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_InstapayAccount extends C$AutoValue_InstapayAccount {
    public static final Parcelable.Creator<AutoValue_InstapayAccount> CREATOR = new Parcelable.Creator<AutoValue_InstapayAccount>() { // from class: com.paymaya.domain.model.AutoValue_InstapayAccount.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InstapayAccount createFromParcel(Parcel parcel) {
            return new AutoValue_InstapayAccount(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InstapayAccount[] newArray(int i) {
            return new AutoValue_InstapayAccount[i];
        }
    };

    public AutoValue_InstapayAccount(final String str, final String str2, final String str3) {
        new C$$AutoValue_InstapayAccount(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_InstapayAccount

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_InstapayAccount$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(InstapayAccount)";
                }

                @Override // com.google.gson.y
                public InstapayAccount read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    InstapayAccount.Builder builderSBuilder = InstapayAccount.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "number":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mNumber((String) yVarH.read(aVar));
                                    break;
                                case "name":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mName((String) yVarH2.read(aVar));
                                    break;
                                case "type":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mType((String) yVarH3.read(aVar));
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
                public void write(b bVar, InstapayAccount instapayAccount) throws IOException {
                    if (instapayAccount == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (instapayAccount.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, instapayAccount.mType());
                    }
                    bVar.m("number");
                    if (instapayAccount.mNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, instapayAccount.mNumber());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (instapayAccount.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, instapayAccount.mName());
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
        parcel.writeString(mType());
        parcel.writeString(mNumber());
        parcel.writeString(mName());
    }
}
