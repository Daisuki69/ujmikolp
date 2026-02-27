package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_FavoriteCount;
import com.paymaya.domain.model.C$AutoValue_FavoriteCount;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FavoriteCount implements Parcelable {

    public static abstract class Builder {
        public abstract FavoriteCount build();

        public abstract Builder mLimit(int i);

        public abstract Builder mUsed(int i);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_FavoriteCount.Builder().mLimit(0).mUsed(0);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_FavoriteCount.GsonTypeAdapter(jVar);
    }

    public boolean hasReachedLimit() {
        return mUsed() >= mLimit();
    }

    @InterfaceC1498b("limit")
    public abstract int mLimit();

    @InterfaceC1498b("total")
    public abstract int mUsed();

    public abstract Builder toBuilder();
}
