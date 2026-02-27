package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.database.repository.q f11394b;
    public final PayMayaClientApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f11395d;

    public U(com.paymaya.data.database.repository.q mFinancialDocumentRepository, PayMayaClientApi mPayMayaClientApi, com.paymaya.data.preference.a mPreference) {
        kotlin.jvm.internal.j.g(mFinancialDocumentRepository, "mFinancialDocumentRepository");
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f11394b = mFinancialDocumentRepository;
        this.c = mPayMayaClientApi;
        this.f11395d = mPreference;
    }
}
