package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.FavoriteDetails;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_FavoriteDetails extends C$AutoValue_FavoriteDetails {
    public static final Parcelable.Creator<AutoValue_FavoriteDetails> CREATOR = new Parcelable.Creator<AutoValue_FavoriteDetails>() { // from class: com.paymaya.domain.model.AutoValue_FavoriteDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FavoriteDetails createFromParcel(Parcel parcel) {
            return new AutoValue_FavoriteDetails(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (FavoriteContentPreview) parcel.readParcelable(FavoriteDetails.class.getClassLoader()), (FavoriteReminder) parcel.readParcelable(FavoriteDetails.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FavoriteDetails[] newArray(int i) {
            return new AutoValue_FavoriteDetails[i];
        }
    };

    public AutoValue_FavoriteDetails(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final FavoriteContentPreview favoriteContentPreview, @Nullable final FavoriteReminder favoriteReminder) {
        new C$$AutoValue_FavoriteDetails(str, str2, str3, str4, favoriteContentPreview, favoriteReminder) { // from class: com.paymaya.domain.model.$AutoValue_FavoriteDetails

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_FavoriteDetails$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y favoriteContentPreview_adapter;
                private volatile y favoriteReminder_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(FavoriteDetails)";
                }

                @Override // com.google.gson.y
                public FavoriteDetails read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    FavoriteDetails.Builder builderSBuilder = FavoriteDetails.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "template":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mTemplateJson((String) yVarH.read(aVar));
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
                public void write(b bVar, FavoriteDetails favoriteDetails) throws IOException {
                    if (favoriteDetails == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (favoriteDetails.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, favoriteDetails.mId());
                    }
                    bVar.m("alias");
                    if (favoriteDetails.mAlias() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, favoriteDetails.mAlias());
                    }
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (favoriteDetails.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, favoriteDetails.mType());
                    }
                    bVar.m("template");
                    if (favoriteDetails.mTemplateJson() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, favoriteDetails.mTemplateJson());
                    }
                    bVar.m("content_preview");
                    if (favoriteDetails.mContentPreview() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.favoriteContentPreview_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(FavoriteContentPreview.class);
                            this.favoriteContentPreview_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, favoriteDetails.mContentPreview());
                    }
                    bVar.m(NotificationCompat.CATEGORY_REMINDER);
                    if (favoriteDetails.mFavoriteReminder() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.favoriteReminder_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(FavoriteReminder.class);
                            this.favoriteReminder_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, favoriteDetails.mFavoriteReminder());
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
        if (mId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mId());
        }
        if (mAlias() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAlias());
        }
        if (mType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mType());
        }
        if (mTemplateJson() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mTemplateJson());
        }
        parcel.writeParcelable(mContentPreview(), i);
        parcel.writeParcelable(mFavoriteReminder(), i);
    }
}
