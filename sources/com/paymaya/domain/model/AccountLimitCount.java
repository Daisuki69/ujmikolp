package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_AccountLimitCount;
import com.paymaya.domain.model.C$AutoValue_AccountLimitCount;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccountLimitCount {

    public static abstract class Builder {
        public abstract AccountLimitCount build();

        public abstract Builder mLimit(int i);

        public abstract Builder mRemaining(int i);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_AccountLimitCount.Builder().mLimit(0).mRemaining(0);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_AccountLimitCount.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("limit")
    public abstract int mLimit();

    @InterfaceC1498b("remaining")
    public abstract int mRemaining();
}
