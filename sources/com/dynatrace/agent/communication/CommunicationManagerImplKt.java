package com.dynatrace.agent.communication;

import kotlin.time.a;
import kotlin.time.b;

/* JADX INFO: loaded from: classes2.dex */
public final class CommunicationManagerImplKt {
    public static final int DATA_VERSION = 1;
    private static final long DEFAULT_SCHEDULING_TIME;
    private static final long KIB_TO_BYTES = 1024;

    static {
        a.C0097a c0097a = a.f18208b;
        DEFAULT_SCHEDULING_TIME = b.f(120L, Aj.b.f331d);
    }

    public static final long getDEFAULT_SCHEDULING_TIME() {
        return DEFAULT_SCHEDULING_TIME;
    }
}
