package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.Product;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Product extends C$AutoValue_Product {
    public static final Parcelable.Creator<AutoValue_Product> CREATOR = new Parcelable.Creator<AutoValue_Product>() { // from class: com.paymaya.domain.model.AutoValue_Product.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Product createFromParcel(Parcel parcel) {
            Class cls;
            String str;
            String str2;
            boolean z4;
            Class cls2;
            boolean z5;
            String string = parcel.readString();
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            ArrayList arrayList = parcel.readArrayList(Product.class.getClassLoader());
            ArrayList arrayList2 = parcel.readArrayList(Product.class.getClassLoader());
            String string3 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string5 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string6 = parcel.readInt() == 0 ? parcel.readString() : null;
            Amount amount = (Amount) parcel.readParcelable(Product.class.getClassLoader());
            Amount amount2 = (Amount) parcel.readParcelable(Product.class.getClassLoader());
            if (parcel.readInt() == 1) {
                cls = Product.class;
                str = string3;
                str2 = string6;
                z4 = true;
            } else {
                cls = Product.class;
                str = string3;
                str2 = string6;
                z4 = false;
            }
            String str3 = string2;
            String str4 = string4;
            String string7 = parcel.readString();
            String string8 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 1) {
                cls2 = cls;
                z5 = true;
            } else {
                cls2 = cls;
                z5 = false;
            }
            return new AutoValue_Product(string, str3, arrayList, arrayList2, str, str4, string5, str2, amount, amount2, z4, string7, string8, z5, (Details) parcel.readParcelable(cls2.getClassLoader()), parcel.readInt(), (ProductProviderDetails) parcel.readParcelable(cls2.getClassLoader()), parcel.readInt(), parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Product[] newArray(int i) {
            return new AutoValue_Product[i];
        }
    };

    public AutoValue_Product(final String str, @Nullable final String str2, @Nullable final List<ProductType> list, @Nullable final List<ShopCategory> list2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6, final Amount amount, @Nullable final Amount amount2, final boolean z4, final String str7, @Nullable final String str8, final boolean z5, @Nullable final Details details, final int i, @Nullable final ProductProviderDetails productProviderDetails, final int i4, final boolean z8) {
        new C$$AutoValue_Product(str, str2, list, list2, str3, str4, str5, str6, amount, amount2, z4, str7, str8, z5, details, i, productProviderDetails, i4, z8) { // from class: com.paymaya.domain.model.$AutoValue_Product

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Product$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private volatile y boolean__adapter;
                private volatile y details_adapter;
                private final j gson;
                private volatile y int__adapter;
                private volatile y list__productType_adapter;
                private volatile y list__shopCategory_adapter;
                private volatile y productProviderDetails_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Product)";
                }

                @Override // com.google.gson.y
                public Product read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Product.Builder builderSBuilder = Product.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "description":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mDescription((String) yVarH.read(aVar));
                                    break;
                                case "discounted_amount":
                                    y yVarH2 = this.amount_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH2;
                                    }
                                    builderSBuilder.mAmountDiscounted((Amount) yVarH2.read(aVar));
                                    break;
                                case "priority":
                                    y yVarH3 = this.int__adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Integer.class);
                                        this.int__adapter = yVarH3;
                                    }
                                    builderSBuilder.mPriority(((Integer) yVarH3.read(aVar)).intValue());
                                    break;
                                case "image_url":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mImageUrl((String) yVarH4.read(aVar));
                                    break;
                                case "original_amount":
                                    y yVarH5 = this.amount_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH5;
                                    }
                                    builderSBuilder.mAmountOriginal((Amount) yVarH5.read(aVar));
                                    break;
                                case "icon_url":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mIconUrl((String) yVarH6.read(aVar));
                                    break;
                                case "id":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mId((String) yVarH7.read(aVar));
                                    break;
                                case "name":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mName((String) yVarH8.read(aVar));
                                    break;
                                case "category":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mCategory((String) yVarH9.read(aVar));
                                    break;
                                case "promo":
                                    y yVarH10 = this.boolean__adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH10;
                                    }
                                    builderSBuilder.isPromo(((Boolean) yVarH10.read(aVar)).booleanValue());
                                    break;
                                case "disabled":
                                    y yVarH11 = this.boolean__adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH11;
                                    }
                                    builderSBuilder.mDisabled(((Boolean) yVarH11.read(aVar)).booleanValue());
                                    break;
                                case "provider_details":
                                    y yVarH12 = this.productProviderDetails_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(ProductProviderDetails.class);
                                        this.productProviderDetails_adapter = yVarH12;
                                    }
                                    builderSBuilder.mProductProviderDetails((ProductProviderDetails) yVarH12.read(aVar));
                                    break;
                                case "product_code":
                                    y yVarH13 = this.string_adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(String.class);
                                        this.string_adapter = yVarH13;
                                    }
                                    builderSBuilder.mProductCode((String) yVarH13.read(aVar));
                                    break;
                                case "product_type":
                                    y yVarH14 = this.string_adapter;
                                    if (yVarH14 == null) {
                                        yVarH14 = this.gson.h(String.class);
                                        this.string_adapter = yVarH14;
                                    }
                                    builderSBuilder.mProductType((String) yVarH14.read(aVar));
                                    break;
                                case "categories":
                                    y yVarG = this.list__shopCategory_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, ShopCategory.class));
                                        this.list__shopCategory_adapter = yVarG;
                                    }
                                    builderSBuilder.mShopCategories((List) yVarG.read(aVar));
                                    break;
                                case "product_types":
                                    y yVarG2 = this.list__productType_adapter;
                                    if (yVarG2 == null) {
                                        yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, ProductType.class));
                                        this.list__productType_adapter = yVarG2;
                                    }
                                    builderSBuilder.mProductTypes((List) yVarG2.read(aVar));
                                    break;
                                case "details":
                                    y yVarH15 = this.details_adapter;
                                    if (yVarH15 == null) {
                                        yVarH15 = this.gson.h(Details.class);
                                        this.details_adapter = yVarH15;
                                    }
                                    builderSBuilder.mDetails((Details) yVarH15.read(aVar));
                                    break;
                                default:
                                    if ("mPage".equals(strE)) {
                                        y yVarH16 = this.int__adapter;
                                        if (yVarH16 == null) {
                                            yVarH16 = this.gson.h(Integer.class);
                                            this.int__adapter = yVarH16;
                                        }
                                        builderSBuilder.mPage(((Integer) yVarH16.read(aVar)).intValue());
                                        break;
                                    } else {
                                        if (!"mIsRecentlyPurchased".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH17 = this.boolean__adapter;
                                            if (yVarH17 == null) {
                                                yVarH17 = this.gson.h(Boolean.class);
                                                this.boolean__adapter = yVarH17;
                                            }
                                            builderSBuilder.mIsRecentlyPurchased(((Boolean) yVarH17.read(aVar)).booleanValue());
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
                public void write(b bVar, Product product) throws IOException {
                    if (product == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (product.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, product.mName());
                    }
                    bVar.m("product_type");
                    if (product.mProductType() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, product.mProductType());
                    }
                    bVar.m("product_types");
                    if (product.mProductTypes() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__productType_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, ProductType.class));
                            this.list__productType_adapter = yVarG;
                        }
                        yVarG.write(bVar, product.mProductTypes());
                    }
                    bVar.m("categories");
                    if (product.mShopCategories() == null) {
                        bVar.r();
                    } else {
                        y yVarG2 = this.list__shopCategory_adapter;
                        if (yVarG2 == null) {
                            yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, ShopCategory.class));
                            this.list__shopCategory_adapter = yVarG2;
                        }
                        yVarG2.write(bVar, product.mShopCategories());
                    }
                    bVar.m("image_url");
                    if (product.mImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, product.mImageUrl());
                    }
                    bVar.m("icon_url");
                    if (product.mIconUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, product.mIconUrl());
                    }
                    bVar.m("description");
                    if (product.mDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, product.mDescription());
                    }
                    bVar.m("product_code");
                    if (product.mProductCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, product.mProductCode());
                    }
                    bVar.m("original_amount");
                    if (product.mAmountOriginal() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.amount_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, product.mAmountOriginal());
                    }
                    bVar.m("discounted_amount");
                    if (product.mAmountDiscounted() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.amount_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, product.mAmountDiscounted());
                    }
                    bVar.m("promo");
                    y yVarH9 = this.boolean__adapter;
                    if (yVarH9 == null) {
                        yVarH9 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH9;
                    }
                    yVarH9.write(bVar, Boolean.valueOf(product.isPromo()));
                    bVar.m(TtmlNode.ATTR_ID);
                    if (product.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, product.mId());
                    }
                    bVar.m("category");
                    if (product.mCategory() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.string_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(String.class);
                            this.string_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, product.mCategory());
                    }
                    bVar.m("disabled");
                    y yVarH12 = this.boolean__adapter;
                    if (yVarH12 == null) {
                        yVarH12 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH12;
                    }
                    yVarH12.write(bVar, Boolean.valueOf(product.mDisabled()));
                    bVar.m("details");
                    if (product.mDetails() == null) {
                        bVar.r();
                    } else {
                        y yVarH13 = this.details_adapter;
                        if (yVarH13 == null) {
                            yVarH13 = this.gson.h(Details.class);
                            this.details_adapter = yVarH13;
                        }
                        yVarH13.write(bVar, product.mDetails());
                    }
                    bVar.m("priority");
                    y yVarH14 = this.int__adapter;
                    if (yVarH14 == null) {
                        yVarH14 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH14;
                    }
                    yVarH14.write(bVar, Integer.valueOf(product.mPriority()));
                    bVar.m("provider_details");
                    if (product.mProductProviderDetails() == null) {
                        bVar.r();
                    } else {
                        y yVarH15 = this.productProviderDetails_adapter;
                        if (yVarH15 == null) {
                            yVarH15 = this.gson.h(ProductProviderDetails.class);
                            this.productProviderDetails_adapter = yVarH15;
                        }
                        yVarH15.write(bVar, product.mProductProviderDetails());
                    }
                    bVar.m("mPage");
                    y yVarH16 = this.int__adapter;
                    if (yVarH16 == null) {
                        yVarH16 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH16;
                    }
                    yVarH16.write(bVar, Integer.valueOf(product.mPage()));
                    bVar.m("mIsRecentlyPurchased");
                    y yVarH17 = this.boolean__adapter;
                    if (yVarH17 == null) {
                        yVarH17 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH17;
                    }
                    yVarH17.write(bVar, Boolean.valueOf(product.mIsRecentlyPurchased()));
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
        if (mProductType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mProductType());
        }
        parcel.writeList(mProductTypes());
        parcel.writeList(mShopCategories());
        if (mImageUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mImageUrl());
        }
        if (mIconUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mIconUrl());
        }
        if (mDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mDescription());
        }
        if (mProductCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mProductCode());
        }
        parcel.writeParcelable(mAmountOriginal(), i);
        parcel.writeParcelable(mAmountDiscounted(), i);
        parcel.writeInt(isPromo() ? 1 : 0);
        parcel.writeString(mId());
        if (mCategory() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCategory());
        }
        parcel.writeInt(mDisabled() ? 1 : 0);
        parcel.writeParcelable(mDetails(), i);
        parcel.writeInt(mPriority());
        parcel.writeParcelable(mProductProviderDetails(), i);
        parcel.writeInt(mPage());
        parcel.writeInt(mIsRecentlyPurchased() ? 1 : 0);
    }
}
