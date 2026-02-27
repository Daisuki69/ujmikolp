package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Meta;
import com.paymaya.domain.model.C$AutoValue_Meta;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Meta implements Parcelable {

    public static abstract class Builder {
        public abstract Meta build();

        public abstract Builder mCurrentPage(int i);

        public abstract Builder mTotalPage(int i);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Meta.Builder().mCurrentPage(0).mTotalPage(0);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Meta.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(alternate = {"currentPage"}, value = "current_page")
    public abstract int mCurrentPage();

    @InterfaceC1498b(alternate = {"totalPage"}, value = "total_page")
    public abstract int mTotalPage();
}
