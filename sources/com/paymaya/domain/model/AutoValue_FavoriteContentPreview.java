package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.FavoriteContentPreview;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_FavoriteContentPreview extends C$AutoValue_FavoriteContentPreview {
    public static final Parcelable.Creator<AutoValue_FavoriteContentPreview> CREATOR = new Parcelable.Creator<AutoValue_FavoriteContentPreview>() { // from class: com.paymaya.domain.model.AutoValue_FavoriteContentPreview.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FavoriteContentPreview createFromParcel(Parcel parcel) {
            return new AutoValue_FavoriteContentPreview(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (ImageUrlUnfiltered) parcel.readParcelable(FavoriteContentPreview.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FavoriteContentPreview[] newArray(int i) {
            return new AutoValue_FavoriteContentPreview[i];
        }
    };

    public AutoValue_FavoriteContentPreview(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final ImageUrlUnfiltered imageUrlUnfiltered, @Nullable final String str5) {
        new C$$AutoValue_FavoriteContentPreview(str, str2, str3, str4, imageUrlUnfiltered, str5) { // from class: com.paymaya.domain.model.$AutoValue_FavoriteContentPreview

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_FavoriteContentPreview$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y imageUrlUnfiltered_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(FavoriteContentPreview)";
                }

                @Override // com.google.gson.y
                public FavoriteContentPreview read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    FavoriteContentPreview.Builder builderSBuilder = FavoriteContentPreview.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "meta":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mMeta((String) yVarH.read(aVar));
                                    break;
                                case "media":
                                    y yVarH2 = this.imageUrlUnfiltered_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(ImageUrlUnfiltered.class);
                                        this.imageUrlUnfiltered_adapter = yVarH2;
                                    }
                                    builderSBuilder.mMedia((ImageUrlUnfiltered) yVarH2.read(aVar));
                                    break;
                                case "text1":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mText1((String) yVarH3.read(aVar));
                                    break;
                                case "text2":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mText2((String) yVarH4.read(aVar));
                                    break;
                                case "text3":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mText3((String) yVarH5.read(aVar));
                                    break;
                                default:
                                    if (!"mPhotoUri".equals(strE)) {
                                        aVar.Q();
                                        break;
                                    } else {
                                        y yVarH6 = this.string_adapter;
                                        if (yVarH6 == null) {
                                            yVarH6 = this.gson.h(String.class);
                                            this.string_adapter = yVarH6;
                                        }
                                        builderSBuilder.mPhotoUri((String) yVarH6.read(aVar));
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
                public void write(b bVar, FavoriteContentPreview favoriteContentPreview) throws IOException {
                    if (favoriteContentPreview == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("text1");
                    if (favoriteContentPreview.mText1() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, favoriteContentPreview.mText1());
                    }
                    bVar.m("text2");
                    if (favoriteContentPreview.mText2() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, favoriteContentPreview.mText2());
                    }
                    bVar.m("text3");
                    if (favoriteContentPreview.mText3() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, favoriteContentPreview.mText3());
                    }
                    bVar.m("meta");
                    if (favoriteContentPreview.mMeta() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, favoriteContentPreview.mMeta());
                    }
                    bVar.m("media");
                    if (favoriteContentPreview.mMedia() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.imageUrlUnfiltered_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(ImageUrlUnfiltered.class);
                            this.imageUrlUnfiltered_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, favoriteContentPreview.mMedia());
                    }
                    bVar.m("mPhotoUri");
                    if (favoriteContentPreview.mPhotoUri() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, favoriteContentPreview.mPhotoUri());
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
        if (mText1() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mText1());
        }
        if (mText2() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mText2());
        }
        if (mText3() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mText3());
        }
        if (mMeta() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMeta());
        }
        parcel.writeParcelable(mMedia(), i);
        if (mPhotoUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPhotoUri());
        }
    }
}
