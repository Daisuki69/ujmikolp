package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.FavoriteCount;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_FavoriteCount extends C$AutoValue_FavoriteCount {
    public static final Parcelable.Creator<AutoValue_FavoriteCount> CREATOR = new Parcelable.Creator<AutoValue_FavoriteCount>() { // from class: com.paymaya.domain.model.AutoValue_FavoriteCount.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FavoriteCount createFromParcel(Parcel parcel) {
            return new AutoValue_FavoriteCount(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FavoriteCount[] newArray(int i) {
            return new AutoValue_FavoriteCount[i];
        }
    };

    public AutoValue_FavoriteCount(final int i, final int i4) {
        new C$$AutoValue_FavoriteCount(i, i4) { // from class: com.paymaya.domain.model.$AutoValue_FavoriteCount

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_FavoriteCount$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y int__adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(FavoriteCount)";
                }

                @Override // com.google.gson.y
                public FavoriteCount read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    FavoriteCount.Builder builderSBuilder = FavoriteCount.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("limit")) {
                                y yVarH = this.int__adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(Integer.class);
                                    this.int__adapter = yVarH;
                                }
                                builderSBuilder.mLimit(((Integer) yVarH.read(aVar)).intValue());
                            } else if (strE.equals("total")) {
                                y yVarH2 = this.int__adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(Integer.class);
                                    this.int__adapter = yVarH2;
                                }
                                builderSBuilder.mUsed(((Integer) yVarH2.read(aVar)).intValue());
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, FavoriteCount favoriteCount) throws IOException {
                    if (favoriteCount == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("limit");
                    y yVarH = this.int__adapter;
                    if (yVarH == null) {
                        yVarH = this.gson.h(Integer.class);
                        this.int__adapter = yVarH;
                    }
                    yVarH.write(bVar, Integer.valueOf(favoriteCount.mLimit()));
                    bVar.m("total");
                    y yVarH2 = this.int__adapter;
                    if (yVarH2 == null) {
                        yVarH2 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH2;
                    }
                    yVarH2.write(bVar, Integer.valueOf(favoriteCount.mUsed()));
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
        parcel.writeInt(mLimit());
        parcel.writeInt(mUsed());
    }
}
