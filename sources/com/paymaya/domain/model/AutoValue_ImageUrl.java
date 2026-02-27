package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ImageUrl;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ImageUrl extends C$AutoValue_ImageUrl {
    public static final Parcelable.Creator<AutoValue_ImageUrl> CREATOR = new Parcelable.Creator<AutoValue_ImageUrl>() { // from class: com.paymaya.domain.model.AutoValue_ImageUrl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageUrl createFromParcel(Parcel parcel) {
            return new AutoValue_ImageUrl(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageUrl[] newArray(int i) {
            return new AutoValue_ImageUrl[i];
        }
    };

    public AutoValue_ImageUrl(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5) {
        new C$$AutoValue_ImageUrl(str, str2, str3, str4, str5) { // from class: com.paymaya.domain.model.$AutoValue_ImageUrl

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ImageUrl$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ImageUrl)";
                }

                @Override // com.google.gson.y
                public ImageUrl read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ImageUrl.Builder builderSBuilder = ImageUrl.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "xxxhdpi":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mXxxhdpi((String) yVarH.read(aVar));
                                    break;
                                case "xxhdpi":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mXxhdpi((String) yVarH2.read(aVar));
                                    break;
                                case "hdpi":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mHdpi((String) yVarH3.read(aVar));
                                    break;
                                case "mdpi":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mMdpi((String) yVarH4.read(aVar));
                                    break;
                                case "xhdpi":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mXhdpi((String) yVarH5.read(aVar));
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
                public void write(b bVar, ImageUrl imageUrl) throws IOException {
                    if (imageUrl == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("xhdpi");
                    if (imageUrl.mXhdpi() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, imageUrl.mXhdpi());
                    }
                    bVar.m("mdpi");
                    if (imageUrl.mMdpi() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, imageUrl.mMdpi());
                    }
                    bVar.m("hdpi");
                    if (imageUrl.mHdpi() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, imageUrl.mHdpi());
                    }
                    bVar.m("xxhdpi");
                    if (imageUrl.mXxhdpi() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, imageUrl.mXxhdpi());
                    }
                    bVar.m("xxxhdpi");
                    if (imageUrl.mXxxhdpi() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, imageUrl.mXxxhdpi());
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
        if (mXhdpi() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mXhdpi());
        }
        if (mMdpi() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMdpi());
        }
        if (mHdpi() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mHdpi());
        }
        if (mXxhdpi() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mXxhdpi());
        }
        if (mXxxhdpi() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mXxxhdpi());
        }
    }
}
