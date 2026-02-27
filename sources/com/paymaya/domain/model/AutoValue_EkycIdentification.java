package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.EkycIdentification;
import j3.a;
import j3.b;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_EkycIdentification extends C$AutoValue_EkycIdentification {
    public static final Parcelable.Creator<AutoValue_EkycIdentification> CREATOR = new Parcelable.Creator<AutoValue_EkycIdentification>() { // from class: com.paymaya.domain.model.AutoValue_EkycIdentification.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EkycIdentification createFromParcel(Parcel parcel) {
            return new AutoValue_EkycIdentification(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? (File) parcel.readSerializable() : null, parcel.readInt() == 0 ? (File) parcel.readSerializable() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EkycIdentification[] newArray(int i) {
            return new AutoValue_EkycIdentification[i];
        }
    };

    public AutoValue_EkycIdentification(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6, @Nullable final File file, @Nullable final File file2) {
        new C$$AutoValue_EkycIdentification(str, str2, str3, str4, str5, str6, file, file2) { // from class: com.paymaya.domain.model.$AutoValue_EkycIdentification

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_EkycIdentification$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y file_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(EkycIdentification)";
                }

                @Override // com.google.gson.y
                public EkycIdentification read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    EkycIdentification.Builder builderSBuilder = EkycIdentification.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "expiry":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mExpirationDate((String) yVarH.read(aVar));
                                    break;
                                case "number":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mIdNumber((String) yVarH2.read(aVar));
                                    break;
                                case "backside_url":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mBackSideImageUrl((String) yVarH3.read(aVar));
                                    break;
                                case "url":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mImageUrl((String) yVarH4.read(aVar));
                                    break;
                                case "name":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mIdName((String) yVarH5.read(aVar));
                                    break;
                                case "type":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mIdType((String) yVarH6.read(aVar));
                                    break;
                                default:
                                    if ("mImageFile".equals(strE)) {
                                        y yVarH7 = this.file_adapter;
                                        if (yVarH7 == null) {
                                            yVarH7 = this.gson.h(File.class);
                                            this.file_adapter = yVarH7;
                                        }
                                        builderSBuilder.mImageFile((File) yVarH7.read(aVar));
                                        break;
                                    } else {
                                        if (!"mBackSideImageFile".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH8 = this.file_adapter;
                                            if (yVarH8 == null) {
                                                yVarH8 = this.gson.h(File.class);
                                                this.file_adapter = yVarH8;
                                            }
                                            builderSBuilder.mBackSideImageFile((File) yVarH8.read(aVar));
                                        }
                                        break;
                                    }
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
                public void write(b bVar, EkycIdentification ekycIdentification) throws IOException {
                    if (ekycIdentification == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (ekycIdentification.mIdType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, ekycIdentification.mIdType());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (ekycIdentification.mIdName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, ekycIdentification.mIdName());
                    }
                    bVar.m("number");
                    if (ekycIdentification.mIdNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, ekycIdentification.mIdNumber());
                    }
                    bVar.m("expiry");
                    if (ekycIdentification.mExpirationDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, ekycIdentification.mExpirationDate());
                    }
                    bVar.m(ImagesContract.URL);
                    if (ekycIdentification.mImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, ekycIdentification.mImageUrl());
                    }
                    bVar.m("backside_url");
                    if (ekycIdentification.mBackSideImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, ekycIdentification.mBackSideImageUrl());
                    }
                    bVar.m("mImageFile");
                    if (ekycIdentification.mImageFile() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.file_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(File.class);
                            this.file_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, ekycIdentification.mImageFile());
                    }
                    bVar.m("mBackSideImageFile");
                    if (ekycIdentification.mBackSideImageFile() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.file_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(File.class);
                            this.file_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, ekycIdentification.mBackSideImageFile());
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
        if (mIdType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mIdType());
        }
        if (mIdName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mIdName());
        }
        if (mIdNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mIdNumber());
        }
        if (mExpirationDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mExpirationDate());
        }
        if (mImageUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mImageUrl());
        }
        if (mBackSideImageUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBackSideImageUrl());
        }
        if (mImageFile() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(mImageFile());
        }
        if (mBackSideImageFile() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(mBackSideImageFile());
        }
    }
}
