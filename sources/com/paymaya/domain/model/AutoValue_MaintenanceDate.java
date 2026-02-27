package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MaintenanceDate;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MaintenanceDate extends C$AutoValue_MaintenanceDate {
    public static final Parcelable.Creator<AutoValue_MaintenanceDate> CREATOR = new Parcelable.Creator<AutoValue_MaintenanceDate>() { // from class: com.paymaya.domain.model.AutoValue_MaintenanceDate.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MaintenanceDate createFromParcel(Parcel parcel) {
            return new AutoValue_MaintenanceDate(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_MaintenanceDate[] newArray(int i) {
            return new AutoValue_MaintenanceDate[i];
        }
    };

    public AutoValue_MaintenanceDate(final String str, final String str2, final String str3) {
        new C$$AutoValue_MaintenanceDate(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_MaintenanceDate

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MaintenanceDate$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(MaintenanceDate)";
                }

                @Override // com.google.gson.y
                public MaintenanceDate read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    MaintenanceDate.Builder builderSBuilder = MaintenanceDate.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "end":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mEnd((String) yVarH.read(aVar));
                                    break;
                                case "start":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mStart((String) yVarH2.read(aVar));
                                    break;
                                case "message":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mMessage((String) yVarH3.read(aVar));
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
                public void write(b bVar, MaintenanceDate maintenanceDate) throws IOException {
                    if (maintenanceDate == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.START);
                    if (maintenanceDate.mStart() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, maintenanceDate.mStart());
                    }
                    bVar.m(TtmlNode.END);
                    if (maintenanceDate.mEnd() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, maintenanceDate.mEnd());
                    }
                    bVar.m("message");
                    if (maintenanceDate.mMessage() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, maintenanceDate.mMessage());
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
        parcel.writeString(mStart());
        parcel.writeString(mEnd());
        parcel.writeString(mMessage());
    }
}
