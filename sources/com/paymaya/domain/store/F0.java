package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.Restriction;
import dOYHB6.yFtIp6.svM7M6;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11348b;
    public com.paymaya.data.preference.a c;

    public final Kh.T a() {
        com.paymaya.data.preference.a aVar = this.c;
        boolean zIsCustomerRestrictionsEnabled = aVar.e().isCustomerRestrictionsEnabled();
        PayMayaClientApi payMayaClientApi = this.f11348b;
        if (!zIsCustomerRestrictionsEnabled) {
            Ah.p<List<Restriction>> accountRestrictions = payMayaClientApi.getAccountRestrictions();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            accountRestrictions.getClass();
            Nh.e eVar = Th.e.f5841b;
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(eVar, "scheduler is null");
            return new Kh.T(accountRestrictions, eVar);
        }
        HashMap map = new HashMap();
        map.put("account_status", svM7M6.getString(aVar.f11330b, "key_account_status", ""));
        Lh.f fVarD = payMayaClientApi.getCustomerRestrictions(map).d(new com.google.firebase.messaging.n(25));
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        Nh.e eVar2 = Th.e.f5841b;
        Objects.requireNonNull(timeUnit2, "unit is null");
        Objects.requireNonNull(eVar2, "scheduler is null");
        return new Kh.T(fVarD, eVar2);
    }
}
