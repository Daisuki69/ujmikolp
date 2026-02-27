package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.api.UnifiedGatewayApi;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11347b;
    public final UnifiedGatewayApi c;

    public F(PayMayaClientApi mPayMayaClientApi, UnifiedGatewayApi mUnifiedGatewayApi) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mUnifiedGatewayApi, "mUnifiedGatewayApi");
        this.f11347b = mPayMayaClientApi;
        this.c = mUnifiedGatewayApi;
    }
}
