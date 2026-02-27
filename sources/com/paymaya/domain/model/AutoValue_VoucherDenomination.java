package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.VoucherDenomination;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_VoucherDenomination extends C$AutoValue_VoucherDenomination {
    public static final Parcelable.Creator<AutoValue_VoucherDenomination> CREATOR = new Parcelable.Creator<AutoValue_VoucherDenomination>() { // from class: com.paymaya.domain.model.AutoValue_VoucherDenomination.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoucherDenomination createFromParcel(Parcel parcel) {
            return new AutoValue_VoucherDenomination(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoucherDenomination[] newArray(int i) {
            return new AutoValue_VoucherDenomination[i];
        }
    };

    public AutoValue_VoucherDenomination(final String str, @Nullable final String str2, final double d10) {
        new C$$AutoValue_VoucherDenomination(str, str2, d10) { // from class: com.paymaya.domain.model.$AutoValue_VoucherDenomination

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_VoucherDenomination$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y double__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(VoucherDenomination)";
                }

                @Override // com.google.gson.y
                public VoucherDenomination read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    VoucherDenomination.Builder builderSBuilder = VoucherDenomination.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "stringValue":
                                case "string_value":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mStringValue((String) yVarH.read(aVar));
                                    break;
                                case "type":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mType((String) yVarH2.read(aVar));
                                    break;
                                case "value":
                                    y yVarH3 = this.double__adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Double.class);
                                        this.double__adapter = yVarH3;
                                    }
                                    builderSBuilder.mValue(((Double) yVarH3.read(aVar)).doubleValue());
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
                public void write(b bVar, VoucherDenomination voucherDenomination) throws IOException {
                    if (voucherDenomination == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (voucherDenomination.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, voucherDenomination.mType());
                    }
                    bVar.m("string_value");
                    if (voucherDenomination.mStringValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, voucherDenomination.mStringValue());
                    }
                    bVar.m("value");
                    y yVarH3 = this.double__adapter;
                    if (yVarH3 == null) {
                        yVarH3 = this.gson.h(Double.class);
                        this.double__adapter = yVarH3;
                    }
                    yVarH3.write(bVar, Double.valueOf(voucherDenomination.mValue()));
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
        if (mStringValue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mStringValue());
        }
        parcel.writeDouble(mValue());
    }
}
