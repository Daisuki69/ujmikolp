package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ShopPurchaseHistoryBase extends C$AutoValue_ShopPurchaseHistoryBase {
    public static final Parcelable.Creator<AutoValue_ShopPurchaseHistoryBase> CREATOR = new Parcelable.Creator<AutoValue_ShopPurchaseHistoryBase>() { // from class: com.paymaya.domain.model.AutoValue_ShopPurchaseHistoryBase.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ShopPurchaseHistoryBase createFromParcel(Parcel parcel) {
            return new AutoValue_ShopPurchaseHistoryBase(parcel.readArrayList(ShopPurchaseHistoryBase.class.getClassLoader()), (Meta) parcel.readParcelable(ShopPurchaseHistoryBase.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ShopPurchaseHistoryBase[] newArray(int i) {
            return new AutoValue_ShopPurchaseHistoryBase[i];
        }
    };

    public AutoValue_ShopPurchaseHistoryBase(final List<ShopPurchaseHistory> list, final Meta meta) {
        new C$$AutoValue_ShopPurchaseHistoryBase(list, meta) { // from class: com.paymaya.domain.model.$AutoValue_ShopPurchaseHistoryBase

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ShopPurchaseHistoryBase$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y list__shopPurchaseHistory_adapter;
                private volatile y meta_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ShopPurchaseHistoryBase)";
                }

                @Override // com.google.gson.y
                public ShopPurchaseHistoryBase read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ShopPurchaseHistoryBase.Builder builderSBuilder = ShopPurchaseHistoryBase.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("data")) {
                                y yVarG = this.list__shopPurchaseHistory_adapter;
                                if (yVarG == null) {
                                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, ShopPurchaseHistory.class));
                                    this.list__shopPurchaseHistory_adapter = yVarG;
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
                public void write(b bVar, ShopPurchaseHistoryBase shopPurchaseHistoryBase) throws IOException {
                    if (shopPurchaseHistoryBase == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("data");
                    if (shopPurchaseHistoryBase.mData() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__shopPurchaseHistory_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, ShopPurchaseHistory.class));
                            this.list__shopPurchaseHistory_adapter = yVarG;
                        }
                        yVarG.write(bVar, shopPurchaseHistoryBase.mData());
                    }
                    bVar.m("meta");
                    if (shopPurchaseHistoryBase.mMeta() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.meta_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Meta.class);
                            this.meta_adapter = yVarH;
                        }
                        yVarH.write(bVar, shopPurchaseHistoryBase.mMeta());
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
