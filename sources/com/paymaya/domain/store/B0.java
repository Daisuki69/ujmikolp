package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.C1239c;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 extends y5.f {
    public static final MediaType e = MediaType.Companion.get("application/json; charset=utf-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11338b;
    public final C1239c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f11339d;

    public B0(PayMayaClientApi payMayaClientApi, C1239c actionCardRecommendationRepository, com.paymaya.data.preference.a preference) {
        kotlin.jvm.internal.j.g(payMayaClientApi, "payMayaClientApi");
        kotlin.jvm.internal.j.g(actionCardRecommendationRepository, "actionCardRecommendationRepository");
        kotlin.jvm.internal.j.g(preference, "preference");
        this.f11338b = payMayaClientApi;
        this.c = actionCardRecommendationRepository;
        this.f11339d = preference;
    }
}
