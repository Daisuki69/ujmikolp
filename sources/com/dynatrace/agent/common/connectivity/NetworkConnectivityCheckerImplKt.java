package com.dynatrace.agent.common.connectivity;

import java.util.Iterator;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkConnectivityCheckerImplKt {
    public static final NetworkType toNetworkTypeOrNull(String str) {
        Object next;
        j.g(str, "<this>");
        Iterator<E> it = NetworkType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (j.b(((NetworkType) next).toString(), str)) {
                break;
            }
        }
        return (NetworkType) next;
    }
}
