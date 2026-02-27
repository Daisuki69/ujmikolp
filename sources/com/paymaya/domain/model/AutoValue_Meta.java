package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Meta;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Meta extends C$AutoValue_Meta {
    public static final Parcelable.Creator<AutoValue_Meta> CREATOR = new Parcelable.Creator<AutoValue_Meta>() { // from class: com.paymaya.domain.model.AutoValue_Meta.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Meta createFromParcel(Parcel parcel) {
            return new AutoValue_Meta(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Meta[] newArray(int i) {
            return new AutoValue_Meta[i];
        }
    };

    public AutoValue_Meta(final int i, final int i4) {
        new C$$AutoValue_Meta(i, i4) { // from class: com.paymaya.domain.model.$AutoValue_Meta

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Meta$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y int__adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Meta)";
                }

                @Override // com.google.gson.y
                public Meta read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Meta.Builder builderSBuilder = Meta.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "total_page":
                                case "totalPage":
                                    y yVarH = this.int__adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Integer.class);
                                        this.int__adapter = yVarH;
                                    }
                                    builderSBuilder.mTotalPage(((Integer) yVarH.read(aVar)).intValue());
                                    break;
                                case "currentPage":
                                case "current_page":
                                    y yVarH2 = this.int__adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Integer.class);
                                        this.int__adapter = yVarH2;
                                    }
                                    builderSBuilder.mCurrentPage(((Integer) yVarH2.read(aVar)).intValue());
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
                public void write(b bVar, Meta meta) throws IOException {
                    if (meta == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("current_page");
                    y yVarH = this.int__adapter;
                    if (yVarH == null) {
                        yVarH = this.gson.h(Integer.class);
                        this.int__adapter = yVarH;
                    }
                    yVarH.write(bVar, Integer.valueOf(meta.mCurrentPage()));
                    bVar.m("total_page");
                    y yVarH2 = this.int__adapter;
                    if (yVarH2 == null) {
                        yVarH2 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH2;
                    }
                    yVarH2.write(bVar, Integer.valueOf(meta.mTotalPage()));
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
        parcel.writeInt(mCurrentPage());
        parcel.writeInt(mTotalPage());
    }
}
