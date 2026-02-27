package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.UIValue;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_UIValue extends C$AutoValue_UIValue {
    public static final Parcelable.Creator<AutoValue_UIValue> CREATOR = new Parcelable.Creator<AutoValue_UIValue>() { // from class: com.paymaya.domain.model.AutoValue_UIValue.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UIValue createFromParcel(Parcel parcel) {
            return new AutoValue_UIValue(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UIValue[] newArray(int i) {
            return new AutoValue_UIValue[i];
        }
    };

    public AutoValue_UIValue(final String str, final String str2) {
        new C$$AutoValue_UIValue(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_UIValue

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_UIValue$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(UIValue)";
                }

                @Override // com.google.gson.y
                public UIValue read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    UIValue.Builder builderSBuilder = UIValue.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("value")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.value((String) yVarH.read(aVar));
                            } else if (strE.equals("display")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.display((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, UIValue uIValue) throws IOException {
                    if (uIValue == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("value");
                    if (uIValue.value() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, uIValue.value());
                    }
                    bVar.m("display");
                    if (uIValue.display() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, uIValue.display());
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
        parcel.writeString(value());
        parcel.writeString(display());
    }
}
