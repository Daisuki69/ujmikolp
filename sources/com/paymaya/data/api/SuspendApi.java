package com.paymaya.data.api;

import Ah.a;
import retrofit2.http.PUT;

/* JADX INFO: loaded from: classes3.dex */
public interface SuspendApi {
    @PUT("v1/sessions/resume")
    a resumeSession();

    @PUT("v1/sessions/suspend")
    a suspendSession();
}
