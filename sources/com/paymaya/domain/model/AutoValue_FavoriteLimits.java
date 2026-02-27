package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.FavoriteLimits;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_FavoriteLimits extends C$AutoValue_FavoriteLimits {
    public static final Parcelable.Creator<AutoValue_FavoriteLimits> CREATOR = new Parcelable.Creator<AutoValue_FavoriteLimits>() { // from class: com.paymaya.domain.model.AutoValue_FavoriteLimits.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FavoriteLimits createFromParcel(Parcel parcel) {
            return new AutoValue_FavoriteLimits((FavoriteCount) parcel.readParcelable(FavoriteLimits.class.getClassLoader()), (FavoriteCount) parcel.readParcelable(FavoriteLimits.class.getClassLoader()), (FavoriteCount) parcel.readParcelable(FavoriteLimits.class.getClassLoader()), (FavoriteCount) parcel.readParcelable(FavoriteLimits.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FavoriteLimits[] newArray(int i) {
            return new AutoValue_FavoriteLimits[i];
        }
    };

    public AutoValue_FavoriteLimits(@Nullable final FavoriteCount favoriteCount, @Nullable final FavoriteCount favoriteCount2, @Nullable final FavoriteCount favoriteCount3, @Nullable final FavoriteCount favoriteCount4) {
        new C$$AutoValue_FavoriteLimits(favoriteCount, favoriteCount2, favoriteCount3, favoriteCount4) { // from class: com.paymaya.domain.model.$AutoValue_FavoriteLimits

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_FavoriteLimits$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y favoriteCount_adapter;
                private final j gson;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(FavoriteLimits)";
                }

                @Override // com.google.gson.y
                public FavoriteLimits read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    FavoriteLimits.Builder builderSBuilder = FavoriteLimits.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "moneysend":
                                    y yVarH = this.favoriteCount_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(FavoriteCount.class);
                                        this.favoriteCount_adapter = yVarH;
                                    }
                                    builderSBuilder.mSendMoneyFavoriteCount((FavoriteCount) yVarH.read(aVar));
                                    break;
                                case "bank":
                                    y yVarH2 = this.favoriteCount_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(FavoriteCount.class);
                                        this.favoriteCount_adapter = yVarH2;
                                    }
                                    builderSBuilder.mBankFavoriteCount((FavoriteCount) yVarH2.read(aVar));
                                    break;
                                case "shop":
                                    y yVarH3 = this.favoriteCount_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(FavoriteCount.class);
                                        this.favoriteCount_adapter = yVarH3;
                                    }
                                    builderSBuilder.mShopFavoriteCount((FavoriteCount) yVarH3.read(aVar));
                                    break;
                                case "billspay":
                                    y yVarH4 = this.favoriteCount_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(FavoriteCount.class);
                                        this.favoriteCount_adapter = yVarH4;
                                    }
                                    builderSBuilder.mPayBillsFavoriteCount((FavoriteCount) yVarH4.read(aVar));
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
                public void write(b bVar, FavoriteLimits favoriteLimits) throws IOException {
                    if (favoriteLimits == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("bank");
                    if (favoriteLimits.mBankFavoriteCount() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.favoriteCount_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(FavoriteCount.class);
                            this.favoriteCount_adapter = yVarH;
                        }
                        yVarH.write(bVar, favoriteLimits.mBankFavoriteCount());
                    }
                    bVar.m("shop");
                    if (favoriteLimits.mShopFavoriteCount() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.favoriteCount_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(FavoriteCount.class);
                            this.favoriteCount_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, favoriteLimits.mShopFavoriteCount());
                    }
                    bVar.m("billspay");
                    if (favoriteLimits.mPayBillsFavoriteCount() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.favoriteCount_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(FavoriteCount.class);
                            this.favoriteCount_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, favoriteLimits.mPayBillsFavoriteCount());
                    }
                    bVar.m("moneysend");
                    if (favoriteLimits.mSendMoneyFavoriteCount() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.favoriteCount_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(FavoriteCount.class);
                            this.favoriteCount_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, favoriteLimits.mSendMoneyFavoriteCount());
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
        parcel.writeParcelable(mBankFavoriteCount(), i);
        parcel.writeParcelable(mShopFavoriteCount(), i);
        parcel.writeParcelable(mPayBillsFavoriteCount(), i);
        parcel.writeParcelable(mSendMoneyFavoriteCount(), i);
    }
}
