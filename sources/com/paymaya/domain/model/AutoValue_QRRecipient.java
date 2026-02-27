package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.QRRecipient;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_QRRecipient extends C$AutoValue_QRRecipient {
    public static final Parcelable.Creator<AutoValue_QRRecipient> CREATOR = new Parcelable.Creator<AutoValue_QRRecipient>() { // from class: com.paymaya.domain.model.AutoValue_QRRecipient.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_QRRecipient createFromParcel(Parcel parcel) {
            return new AutoValue_QRRecipient(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_QRRecipient[] newArray(int i) {
            return new AutoValue_QRRecipient[i];
        }
    };

    public AutoValue_QRRecipient(final String str, final String str2, @Nullable final String str3, @Nullable final String str4) {
        new C$$AutoValue_QRRecipient(str, str2, str3, str4) { // from class: com.paymaya.domain.model.$AutoValue_QRRecipient

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_QRRecipient$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(QRRecipient)";
                }

                @Override // com.google.gson.y
                public QRRecipient read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    QRRecipient.Builder builderSBuilder = QRRecipient.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "a":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mAmount((String) yVarH.read(aVar));
                                    break;
                                case "m":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mMessage((String) yVarH2.read(aVar));
                                    break;
                                case "t":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mType((String) yVarH3.read(aVar));
                                    break;
                                case "v":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mValue((String) yVarH4.read(aVar));
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
                public void write(b bVar, QRRecipient qRRecipient) throws IOException {
                    if (qRRecipient == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("v");
                    if (qRRecipient.mValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, qRRecipient.mValue());
                    }
                    bVar.m("t");
                    if (qRRecipient.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, qRRecipient.mType());
                    }
                    bVar.m(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
                    if (qRRecipient.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, qRRecipient.mAmount());
                    }
                    bVar.m("m");
                    if (qRRecipient.mMessage() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, qRRecipient.mMessage());
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
        parcel.writeString(mValue());
        parcel.writeString(mType());
        if (mAmount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAmount());
        }
        if (mMessage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMessage());
        }
    }
}
