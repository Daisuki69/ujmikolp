package com.dynatrace.agent.communication;

import Aj.b;
import com.dynatrace.agent.communication.network.model.RetryInfo;
import kotlin.jvm.internal.j;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class RetryManagerKt {
    private static final long DISABLE_AGENT_TIME;
    private static final long FIRST_RETRY_SCHEDULING_TIME;
    private static final int MAX_RETRY_ATTEMPT = 3;
    private static final long SECOND_RETRY_SCHEDULING_TIME;

    static {
        a.C0097a c0097a = a.f18208b;
        b bVar = b.f331d;
        FIRST_RETRY_SCHEDULING_TIME = kotlin.time.b.f(30L, bVar);
        SECOND_RETRY_SCHEDULING_TIME = kotlin.time.b.f(60L, bVar);
        DISABLE_AGENT_TIME = kotlin.time.b.e(2, b.f);
    }

    public static final long getAssociatedRetryTime(RetryInfo retryInfo) {
        j.g(retryInfo, "<this>");
        int count = retryInfo.getCount();
        return count != 1 ? count != 2 ? DISABLE_AGENT_TIME : SECOND_RETRY_SCHEDULING_TIME : FIRST_RETRY_SCHEDULING_TIME;
    }

    public static final long getDISABLE_AGENT_TIME() {
        return DISABLE_AGENT_TIME;
    }

    public static final long getFIRST_RETRY_SCHEDULING_TIME() {
        return FIRST_RETRY_SCHEDULING_TIME;
    }

    public static final long getSECOND_RETRY_SCHEDULING_TIME() {
        return SECOND_RETRY_SCHEDULING_TIME;
    }

    public static final boolean isMaxRetryAttempt(RetryInfo retryInfo) {
        j.g(retryInfo, "<this>");
        return retryInfo.getCount() == 3;
    }
}
