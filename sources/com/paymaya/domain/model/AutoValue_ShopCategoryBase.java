package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.ShopCategoryBase;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ShopCategoryBase extends C$AutoValue_ShopCategoryBase {
    public static final Parcelable.Creator<AutoValue_ShopCategoryBase> CREATOR = new Parcelable.Creator<AutoValue_ShopCategoryBase>() { // from class: com.paymaya.domain.model.AutoValue_ShopCategoryBase.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ShopCategoryBase createFromParcel(Parcel parcel) {
            return new AutoValue_ShopCategoryBase(parcel.readArrayList(ShopCategoryBase.class.getClassLoader()), (Meta) parcel.readParcelable(ShopCategoryBase.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ShopCategoryBase[] newArray(int i) {
            return new AutoValue_ShopCategoryBase[i];
        }
    };

    public AutoValue_ShopCategoryBase(final List<ShopCategory> list, final Meta meta) {
        new C$$AutoValue_ShopCategoryBase(list, meta) { // from class: com.paymaya.domain.model.$AutoValue_ShopCategoryBase

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ShopCategoryBase$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y list__shopCategory_adapter;
                private volatile y meta_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ShopCategoryBase)";
                }

                @Override // com.google.gson.y
                public ShopCategoryBase read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ShopCategoryBase.Builder builderSBuilder = ShopCategoryBase.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("data")) {
                                y yVarG = this.list__shopCategory_adapter;
                                if (yVarG == null) {
                                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, ShopCategory.class));
                                    this.list__shopCategory_adapter = yVarG;
                                }
                                builderSBuilder.mData((List) yVarG.read(aVar));
                            } else if (strE.equals("meta")) {
                                y yVarH = this.meta_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(Meta.class);
                                    this.meta_adapter = yVarH;
                                }
                                builderSBuilder.mMeta((Meta) yVarH.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, ShopCategoryBase shopCategoryBase) throws IOException {
                    if (shopCategoryBase == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("data");
                    if (shopCategoryBase.mData() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__shopCategory_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, ShopCategory.class));
                            this.list__shopCategory_adapter = yVarG;
                        }
                        yVarG.write(bVar, shopCategoryBase.mData());
                    }
                    bVar.m("meta");
                    if (shopCategoryBase.mMeta() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.meta_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Meta.class);
                            this.meta_adapter = yVarH;
                        }
                        yVarH.write(bVar, shopCategoryBase.mMeta());
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
        parcel.writeList(mData());
        parcel.writeParcelable(mMeta(), i);
    }
}
