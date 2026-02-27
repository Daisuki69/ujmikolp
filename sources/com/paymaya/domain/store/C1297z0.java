package com.paymaya.domain.store;

import android.content.Context;
import com.paymaya.data.api.PayMayaClientApi;

/* JADX INFO: renamed from: com.paymaya.domain.store.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1297z0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11506b;
    public final PayMayaClientApi c;

    public C1297z0(Context mContext, PayMayaClientApi mPayMayaClientApi, com.paymaya.data.preference.a mPreference, L5.a mPayMayaDatabase) {
        kotlin.jvm.internal.j.g(mContext, "mContext");
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mPayMayaDatabase, "mPayMayaDatabase");
        this.f11506b = mContext;
        this.c = mPayMayaClientApi;
    }
}
