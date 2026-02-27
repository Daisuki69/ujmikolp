package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ProductType;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ProductType extends C$AutoValue_ProductType {
    public static final Parcelable.Creator<AutoValue_ProductType> CREATOR = new Parcelable.Creator<AutoValue_ProductType>() { // from class: com.paymaya.domain.model.AutoValue_ProductType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ProductType createFromParcel(Parcel parcel) {
            return new AutoValue_ProductType(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ProductType[] newArray(int i) {
            return new AutoValue_ProductType[i];
        }
    };

    public AutoValue_ProductType(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4) {
        new C$$AutoValue_ProductType(str, str2, str3, str4) { // from class: com.paymaya.domain.model.$AutoValue_ProductType

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ProductType$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ProductType)";
                }

                @Override // com.google.gson.y
                public ProductType read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ProductType.Builder builderSBuilder = ProductType.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
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
                                    if (!"mCategoryId".equals(strE)) {
                                        aVar.Q();
                                        break;
                                    } else {
                                        y yVarH4 = this.string_adapter;
                                        if (yVarH4 == null) {
                                            yVarH4 = this.gson.h(String.class);
                                            this.string_adapter = yVarH4;
                                        }
                                        builderSBuilder.mCategoryId((String) yVarH4.read(aVar));
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
                public void write(b bVar, ProductType productType) throws IOException {
                    if (productType == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (productType.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, productType.mName());
                    }
                    bVar.m(TtmlNode.ATTR_ID);
                    if (productType.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, productType.mId());
                    }
                    bVar.m("code");
                    if (productType.mCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, productType.mCode());
                    }
                    bVar.m("mCategoryId");
                    if (productType.mCategoryId() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, productType.mCategoryId());
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
        if (mName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mName());
        }
        if (mId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mId());
        }
        if (mCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCode());
        }
        if (mCategoryId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCategoryId());
        }
    }
}
