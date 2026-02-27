package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.EkycAdditionalDocument;
import j3.a;
import j3.b;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_EkycAdditionalDocument extends C$AutoValue_EkycAdditionalDocument {
    public static final Parcelable.Creator<AutoValue_EkycAdditionalDocument> CREATOR = new Parcelable.Creator<AutoValue_EkycAdditionalDocument>() { // from class: com.paymaya.domain.model.AutoValue_EkycAdditionalDocument.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EkycAdditionalDocument createFromParcel(Parcel parcel) {
            return new AutoValue_EkycAdditionalDocument(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? (File) parcel.readSerializable() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EkycAdditionalDocument[] newArray(int i) {
            return new AutoValue_EkycAdditionalDocument[i];
        }
    };

    public AutoValue_EkycAdditionalDocument(@Nullable final String str, @Nullable final String str2, @Nullable final File file) {
        new C$$AutoValue_EkycAdditionalDocument(str, str2, file) { // from class: com.paymaya.domain.model.$AutoValue_EkycAdditionalDocument

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_EkycAdditionalDocument$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y file_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(EkycAdditionalDocument)";
                }

                @Override // com.google.gson.y
                public EkycAdditionalDocument read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    EkycAdditionalDocument.Builder builderSBuilder = EkycAdditionalDocument.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals(ImagesContract.URL)) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mImageUrl((String) yVarH.read(aVar));
                            } else if (strE.equals(SessionDescription.ATTR_TYPE)) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mType((String) yVarH2.read(aVar));
                            } else if ("mFile".equals(strE)) {
                                y yVarH3 = this.file_adapter;
                                if (yVarH3 == null) {
                                    yVarH3 = this.gson.h(File.class);
                                    this.file_adapter = yVarH3;
                                }
                                builderSBuilder.mFile((File) yVarH3.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, EkycAdditionalDocument ekycAdditionalDocument) throws IOException {
                    if (ekycAdditionalDocument == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (ekycAdditionalDocument.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, ekycAdditionalDocument.mType());
                    }
                    bVar.m(ImagesContract.URL);
                    if (ekycAdditionalDocument.mImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, ekycAdditionalDocument.mImageUrl());
                    }
                    bVar.m("mFile");
                    if (ekycAdditionalDocument.mFile() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.file_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(File.class);
                            this.file_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, ekycAdditionalDocument.mFile());
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
        if (mType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mType());
        }
        if (mImageUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mImageUrl());
        }
        if (mFile() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(mFile());
        }
    }
}
