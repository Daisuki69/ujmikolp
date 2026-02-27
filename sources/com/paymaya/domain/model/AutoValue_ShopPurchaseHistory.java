package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.ShopPurchaseHistory;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ShopPurchaseHistory extends C$AutoValue_ShopPurchaseHistory {
    public static final Parcelable.Creator<AutoValue_ShopPurchaseHistory> CREATOR = new Parcelable.Creator<AutoValue_ShopPurchaseHistory>() { // from class: com.paymaya.domain.model.AutoValue_ShopPurchaseHistory.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ShopPurchaseHistory createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            double d10;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            boolean z4;
            boolean z5;
            String str10;
            String string = parcel.readString();
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string3 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string5 = parcel.readInt() == 0 ? parcel.readString() : null;
            double d11 = parcel.readDouble();
            String string6 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string7 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string8 = parcel.readString();
            String string9 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string10 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string11 = parcel.readString();
            if (parcel.readInt() == 1) {
                str = string3;
                str2 = string4;
                str3 = string5;
                d10 = d11;
                str4 = string6;
                str5 = string7;
                str6 = string8;
                str7 = string9;
                str8 = string10;
                str9 = string11;
                z4 = true;
            } else {
                str = string3;
                str2 = string4;
                str3 = string5;
                d10 = d11;
                str4 = string6;
                str5 = string7;
                str6 = string8;
                str7 = string9;
                str8 = string10;
                str9 = string11;
                z4 = false;
            }
            String string12 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string13 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 1) {
                str10 = string13;
                z5 = true;
            } else {
                String str11 = string13;
                z5 = false;
                str10 = str11;
            }
            return new AutoValue_ShopPurchaseHistory(string, string2, str, str2, str3, d10, str4, str5, str6, str7, str8, str9, z4, string12, str10, z5, parcel.readInt() == 1, parcel.readArrayList(ShopPurchaseHistory.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ShopPurchaseHistory[] newArray(int i) {
            return new AutoValue_ShopPurchaseHistory[i];
        }
    };

    public AutoValue_ShopPurchaseHistory(final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5, final double d10, @Nullable final String str6, @Nullable final String str7, final String str8, @Nullable final String str9, @Nullable final String str10, final String str11, final boolean z4, @Nullable final String str12, @Nullable final String str13, final boolean z5, final boolean z8, @Nullable final List<OrderProviderField> list, final int i) {
        new C$$AutoValue_ShopPurchaseHistory(str, str2, str3, str4, str5, d10, str6, str7, str8, str9, str10, str11, z4, str12, str13, z5, z8, list, i) { // from class: com.paymaya.domain.model.$AutoValue_ShopPurchaseHistory

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ShopPurchaseHistory$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private volatile y double__adapter;
                private final j gson;
                private volatile y int__adapter;
                private volatile y list__orderProviderField_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ShopPurchaseHistory)";
                }

                @Override // com.google.gson.y
                public ShopPurchaseHistory read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ShopPurchaseHistory.Builder builderSBuilder = ShopPurchaseHistory.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "product_description":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mProductDescription((String) yVarH.read(aVar));
                                    break;
                                case "payment_trn":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mPaymentTrn((String) yVarH2.read(aVar));
                                    break;
                                case "gifted":
                                    y yVarH3 = this.boolean__adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH3;
                                    }
                                    builderSBuilder.mIsGifted(((Boolean) yVarH3.read(aVar)).booleanValue());
                                    break;
                                case "status":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mStatus((String) yVarH4.read(aVar));
                                    break;
                                case "image_url":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mImageUrl((String) yVarH5.read(aVar));
                                    break;
                                case "icon_url":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mIconUrl((String) yVarH6.read(aVar));
                                    break;
                                case "order_reference_number":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mOrderReferenceNumber((String) yVarH7.read(aVar));
                                    break;
                                case "updated_at":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mUpdatedAt((String) yVarH8.read(aVar));
                                    break;
                                case "code":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mCode((String) yVarH9.read(aVar));
                                    break;
                                case "price":
                                    y yVarH10 = this.double__adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(Double.class);
                                        this.double__adapter = yVarH10;
                                    }
                                    builderSBuilder.mPrice(((Double) yVarH10.read(aVar)).doubleValue());
                                    break;
                                case "available_receipt":
                                    y yVarH11 = this.boolean__adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH11;
                                    }
                                    builderSBuilder.mAvailableReceipt(((Boolean) yVarH11.read(aVar)).booleanValue());
                                    break;
                                case "other_fields":
                                    y yVarG = this.list__orderProviderField_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, OrderProviderField.class));
                                        this.list__orderProviderField_adapter = yVarG;
                                    }
                                    builderSBuilder.mOtherFields((List) yVarG.read(aVar));
                                    break;
                                case "recipient":
                                    y yVarH12 = this.string_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(String.class);
                                        this.string_adapter = yVarH12;
                                    }
                                    builderSBuilder.mRecipient((String) yVarH12.read(aVar));
                                    break;
                                case "product_name":
                                    y yVarH13 = this.string_adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(String.class);
                                        this.string_adapter = yVarH13;
                                    }
                                    builderSBuilder.mProductName((String) yVarH13.read(aVar));
                                    break;
                                case "created_at":
                                    y yVarH14 = this.string_adapter;
                                    if (yVarH14 == null) {
                                        yVarH14 = this.gson.h(String.class);
                                        this.string_adapter = yVarH14;
                                    }
                                    builderSBuilder.mCreatedAt((String) yVarH14.read(aVar));
                                    break;
                                case "with_receipt":
                                    y yVarH15 = this.boolean__adapter;
                                    if (yVarH15 == null) {
                                        yVarH15 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH15;
                                    }
                                    builderSBuilder.mWithReceipt(((Boolean) yVarH15.read(aVar)).booleanValue());
                                    break;
                                case "product_id":
                                    y yVarH16 = this.string_adapter;
                                    if (yVarH16 == null) {
                                        yVarH16 = this.gson.h(String.class);
                                        this.string_adapter = yVarH16;
                                    }
                                    builderSBuilder.mProductId((String) yVarH16.read(aVar));
                                    break;
                                case "network":
                                    y yVarH17 = this.string_adapter;
                                    if (yVarH17 == null) {
                                        yVarH17 = this.gson.h(String.class);
                                        this.string_adapter = yVarH17;
                                    }
                                    builderSBuilder.mNetwork((String) yVarH17.read(aVar));
                                    break;
                                default:
                                    if (!"mPage".equals(strE)) {
                                        aVar.Q();
                                        break;
                                    } else {
                                        y yVarH18 = this.int__adapter;
                                        if (yVarH18 == null) {
                                            yVarH18 = this.gson.h(Integer.class);
                                            this.int__adapter = yVarH18;
                                        }
                                        builderSBuilder.mPage(((Integer) yVarH18.read(aVar)).intValue());
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
                public void write(b bVar, ShopPurchaseHistory shopPurchaseHistory) throws IOException {
                    if (shopPurchaseHistory == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("product_id");
                    if (shopPurchaseHistory.mProductId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, shopPurchaseHistory.mProductId());
                    }
                    bVar.m("product_name");
                    if (shopPurchaseHistory.mProductName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, shopPurchaseHistory.mProductName());
                    }
                    bVar.m("product_description");
                    if (shopPurchaseHistory.mProductDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, shopPurchaseHistory.mProductDescription());
                    }
                    bVar.m("image_url");
                    if (shopPurchaseHistory.mImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, shopPurchaseHistory.mImageUrl());
                    }
                    bVar.m("icon_url");
                    if (shopPurchaseHistory.mIconUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, shopPurchaseHistory.mIconUrl());
                    }
                    bVar.m("price");
                    y yVarH6 = this.double__adapter;
                    if (yVarH6 == null) {
                        yVarH6 = this.gson.h(Double.class);
                        this.double__adapter = yVarH6;
                    }
                    yVarH6.write(bVar, Double.valueOf(shopPurchaseHistory.mPrice()));
                    bVar.m("recipient");
                    if (shopPurchaseHistory.mRecipient() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, shopPurchaseHistory.mRecipient());
                    }
                    bVar.m("payment_trn");
                    if (shopPurchaseHistory.mPaymentTrn() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, shopPurchaseHistory.mPaymentTrn());
                    }
                    bVar.m("order_reference_number");
                    if (shopPurchaseHistory.mOrderReferenceNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.string_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(String.class);
                            this.string_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, shopPurchaseHistory.mOrderReferenceNumber());
                    }
                    bVar.m(MPDbAdapter.KEY_CREATED_AT);
                    if (shopPurchaseHistory.mCreatedAt() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, shopPurchaseHistory.mCreatedAt());
                    }
                    bVar.m("updated_at");
                    if (shopPurchaseHistory.mUpdatedAt() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.string_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(String.class);
                            this.string_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, shopPurchaseHistory.mUpdatedAt());
                    }
                    bVar.m("status");
                    if (shopPurchaseHistory.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH12 = this.string_adapter;
                        if (yVarH12 == null) {
                            yVarH12 = this.gson.h(String.class);
                            this.string_adapter = yVarH12;
                        }
                        yVarH12.write(bVar, shopPurchaseHistory.mStatus());
                    }
                    bVar.m("gifted");
                    y yVarH13 = this.boolean__adapter;
                    if (yVarH13 == null) {
                        yVarH13 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH13;
                    }
                    yVarH13.write(bVar, Boolean.valueOf(shopPurchaseHistory.mIsGifted()));
                    bVar.m("code");
                    if (shopPurchaseHistory.mCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH14 = this.string_adapter;
                        if (yVarH14 == null) {
                            yVarH14 = this.gson.h(String.class);
                            this.string_adapter = yVarH14;
                        }
                        yVarH14.write(bVar, shopPurchaseHistory.mCode());
                    }
                    bVar.m("network");
                    if (shopPurchaseHistory.mNetwork() == null) {
                        bVar.r();
                    } else {
                        y yVarH15 = this.string_adapter;
                        if (yVarH15 == null) {
                            yVarH15 = this.gson.h(String.class);
                            this.string_adapter = yVarH15;
                        }
                        yVarH15.write(bVar, shopPurchaseHistory.mNetwork());
                    }
                    bVar.m("with_receipt");
                    y yVarH16 = this.boolean__adapter;
                    if (yVarH16 == null) {
                        yVarH16 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH16;
                    }
                    yVarH16.write(bVar, Boolean.valueOf(shopPurchaseHistory.mWithReceipt()));
                    bVar.m("available_receipt");
                    y yVarH17 = this.boolean__adapter;
                    if (yVarH17 == null) {
                        yVarH17 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH17;
                    }
                    yVarH17.write(bVar, Boolean.valueOf(shopPurchaseHistory.mAvailableReceipt()));
                    bVar.m("other_fields");
                    if (shopPurchaseHistory.mOtherFields() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__orderProviderField_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, OrderProviderField.class));
                            this.list__orderProviderField_adapter = yVarG;
                        }
                        yVarG.write(bVar, shopPurchaseHistory.mOtherFields());
                    }
                    bVar.m("mPage");
                    y yVarH18 = this.int__adapter;
                    if (yVarH18 == null) {
                        yVarH18 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH18;
                    }
                    yVarH18.write(bVar, Integer.valueOf(shopPurchaseHistory.mPage()));
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
        parcel.writeString(mProductId());
        if (mProductName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mProductName());
        }
        if (mProductDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mProductDescription());
        }
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
        parcel.writeDouble(mPrice());
        if (mRecipient() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRecipient());
        }
        if (mPaymentTrn() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPaymentTrn());
        }
        parcel.writeString(mOrderReferenceNumber());
        if (mCreatedAt() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCreatedAt());
        }
        if (mUpdatedAt() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mUpdatedAt());
        }
        parcel.writeString(mStatus());
        parcel.writeInt(mIsGifted() ? 1 : 0);
        if (mCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCode());
        }
        if (mNetwork() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mNetwork());
        }
        parcel.writeInt(mWithReceipt() ? 1 : 0);
        parcel.writeInt(mAvailableReceipt() ? 1 : 0);
        parcel.writeList(mOtherFields());
        parcel.writeInt(mPage());
    }
}
