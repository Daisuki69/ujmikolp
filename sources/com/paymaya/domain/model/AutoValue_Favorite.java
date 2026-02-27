package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Favorite;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Favorite extends C$AutoValue_Favorite {
    public static final Parcelable.Creator<AutoValue_Favorite> CREATOR = new Parcelable.Creator<AutoValue_Favorite>() { // from class: com.paymaya.domain.model.AutoValue_Favorite.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Favorite createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            FavoriteContentPreview favoriteContentPreview = (FavoriteContentPreview) parcel.readParcelable(Favorite.class.getClassLoader());
            FavoriteReminder favoriteReminder = (FavoriteReminder) parcel.readParcelable(Favorite.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                boolValueOf = null;
            }
            return new AutoValue_Favorite(string, string2, string3, favoriteContentPreview, favoriteReminder, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Favorite[] newArray(int i) {
            return new AutoValue_Favorite[i];
        }
    };

    public AutoValue_Favorite(String str, String str2, String str3, FavoriteContentPreview favoriteContentPreview, @Nullable FavoriteReminder favoriteReminder, @Nullable Boolean bool) {
        new C$$AutoValue_Favorite(str, str2, str3, favoriteContentPreview, favoriteReminder, bool) { // from class: com.paymaya.domain.model.$AutoValue_Favorite

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Favorite$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private volatile y favoriteContentPreview_adapter;
                private volatile y favoriteReminder_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Favorite)";
                }

                @Override // com.google.gson.y
                public Favorite read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Favorite.Builder builderSBuilder = Favorite.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "is_maintenance":
                                    y yVarH = this.boolean__adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH;
                                    }
                                    builderSBuilder.mIsMaintenance((Boolean) yVarH.read(aVar));
                                    break;
                                case "reminder":
                                    y yVarH2 = this.favoriteReminder_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(FavoriteReminder.class);
                                        this.favoriteReminder_adapter = yVarH2;
                                    }
                                    builderSBuilder.mFavoriteReminder((FavoriteReminder) yVarH2.read(aVar));
                                    break;
                                case "id":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mId((String) yVarH3.read(aVar));
                                    break;
                                case "type":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mType((String) yVarH4.read(aVar));
                                    break;
                                case "alias":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mAlias((String) yVarH5.read(aVar));
                                    break;
                                case "content_preview":
                                    y yVarH6 = this.favoriteContentPreview_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(FavoriteContentPreview.class);
                                        this.favoriteContentPreview_adapter = yVarH6;
                                    }
                                    builderSBuilder.mContentPreview((FavoriteContentPreview) yVarH6.read(aVar));
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
                public void write(b bVar, Favorite favorite) throws IOException {
                    if (favorite == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (favorite.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, favorite.mId());
                    }
                    bVar.m("alias");
                    if (favorite.mAlias() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, favorite.mAlias());
                    }
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (favorite.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, favorite.mType());
                    }
                    bVar.m("content_preview");
                    if (favorite.mContentPreview() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.favoriteContentPreview_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(FavoriteContentPreview.class);
                            this.favoriteContentPreview_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, favorite.mContentPreview());
                    }
                    bVar.m(NotificationCompat.CATEGORY_REMINDER);
                    if (favorite.mFavoriteReminder() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.favoriteReminder_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(FavoriteReminder.class);
                            this.favoriteReminder_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, favorite.mFavoriteReminder());
                    }
                    bVar.m("is_maintenance");
                    if (favorite.mIsMaintenance() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.boolean__adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH6;
                        }
                        yVarH6.write(bVar, favorite.mIsMaintenance());
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
        parcel.writeString(mId());
        parcel.writeString(mAlias());
        parcel.writeString(mType());
        parcel.writeParcelable(mContentPreview(), i);
        parcel.writeParcelable(mFavoriteReminder(), i);
        if (mIsMaintenance() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mIsMaintenance().booleanValue() ? 1 : 0);
        }
    }
}
