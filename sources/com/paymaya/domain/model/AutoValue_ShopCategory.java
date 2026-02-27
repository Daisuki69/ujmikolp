package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.ShopCategory;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ShopCategory extends C$AutoValue_ShopCategory {
    public static final Parcelable.Creator<AutoValue_ShopCategory> CREATOR = new Parcelable.Creator<AutoValue_ShopCategory>() { // from class: com.paymaya.domain.model.AutoValue_ShopCategory.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ShopCategory createFromParcel(Parcel parcel) {
            return new AutoValue_ShopCategory(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(ShopCategory.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ShopCategory[] newArray(int i) {
            return new AutoValue_ShopCategory[i];
        }
    };

    public AutoValue_ShopCategory(String str, String str2, @Nullable String str3, @Nullable List<ProductType> list) {
        new C$$AutoValue_ShopCategory(str, str2, str3, list) { // from class: com.paymaya.domain.model.$AutoValue_ShopCategory

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ShopCategory$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y list__productType_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ShopCategory)";
                }

                @Override // com.google.gson.y
                public ShopCategory read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ShopCategory.Builder builderSBuilder = ShopCategory.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "subcategories":
                                case "product_types":
                                    y yVarG = this.list__productType_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, ProductType.class));
                                        this.list__productType_adapter = yVarG;
                                    }
                                    builderSBuilder.mProductTypes((List) yVarG.read(aVar));
                                    break;
                                case "id":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mId((String) yVarH.read(aVar));
                                    break;
                                case "code":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mCode((String) yVarH2.read(aVar));
                                    break;
                                case "name":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mName((String) yVarH3.read(aVar));
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
                public void write(b bVar, ShopCategory shopCategory) throws IOException {
                    if (shopCategory == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (shopCategory.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, shopCategory.mName());
                    }
                    bVar.m(TtmlNode.ATTR_ID);
                    if (shopCategory.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, shopCategory.mId());
                    }
                    bVar.m("code");
                    if (shopCategory.mCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, shopCategory.mCode());
                    }
                    bVar.m("product_types");
                    if (shopCategory.mProductTypes() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__productType_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, ProductType.class));
                            this.list__productType_adapter = yVarG;
                        }
                        yVarG.write(bVar, shopCategory.mProductTypes());
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
        parcel.writeString(mName());
        parcel.writeString(mId());
        if (mCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCode());
        }
        parcel.writeList(mProductTypes());
    }
}
