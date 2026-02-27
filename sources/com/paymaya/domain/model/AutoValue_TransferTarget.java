package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.TransferTarget;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TransferTarget extends C$AutoValue_TransferTarget {
    public static final Parcelable.Creator<AutoValue_TransferTarget> CREATOR = new Parcelable.Creator<AutoValue_TransferTarget>() { // from class: com.paymaya.domain.model.AutoValue_TransferTarget.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransferTarget createFromParcel(Parcel parcel) {
            return new AutoValue_TransferTarget(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransferTarget[] newArray(int i) {
            return new AutoValue_TransferTarget[i];
        }
    };

    public AutoValue_TransferTarget(final String str, final String str2) {
        new C$$AutoValue_TransferTarget(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_TransferTarget

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_TransferTarget$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(TransferTarget)";
                }

                @Override // com.google.gson.y
                public TransferTarget read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    TransferTarget.Builder builderSBuilder = TransferTarget.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals(SessionDescription.ATTR_TYPE)) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mType((String) yVarH.read(aVar));
                            } else if (strE.equals("value")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mValue((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, TransferTarget transferTarget) throws IOException {
                    if (transferTarget == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (transferTarget.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, transferTarget.mType());
                    }
                    bVar.m("value");
                    if (transferTarget.mValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, transferTarget.mValue());
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
        parcel.writeString(mValue());
    }
}
