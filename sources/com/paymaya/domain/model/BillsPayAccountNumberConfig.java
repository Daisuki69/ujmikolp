package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_BillsPayAccountNumberConfig;
import com.paymaya.domain.model.C$AutoValue_BillsPayAccountNumberConfig;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BillsPayAccountNumberConfig {

    public static abstract class Builder {
        public abstract BillsPayAccountNumberConfig build();

        public abstract Builder mIsShareEnabled(boolean z4);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_BillsPayAccountNumberConfig.Builder().mIsShareEnabled(true);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_BillsPayAccountNumberConfig.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("share_account_number")
    public abstract boolean mIsShareEnabled();

    public abstract Builder toBuilder();
}
