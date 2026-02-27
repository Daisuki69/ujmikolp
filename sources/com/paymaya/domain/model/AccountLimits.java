package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_AccountLimits;
import com.paymaya.domain.model.C$AutoValue_AccountLimits;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccountLimits {

    public static abstract class Builder {
        public abstract AccountLimits build();

        public abstract Builder mAccountLimitTypesDaily(List<AccountLimitType> list);

        public abstract Builder mAccountLimitTypesMonthly(List<AccountLimitType> list);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_AccountLimits.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_AccountLimits.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("daily")
    public abstract List<AccountLimitType> mAccountLimitTypesDaily();

    @InterfaceC1498b("monthly")
    public abstract List<AccountLimitType> mAccountLimitTypesMonthly();
}
