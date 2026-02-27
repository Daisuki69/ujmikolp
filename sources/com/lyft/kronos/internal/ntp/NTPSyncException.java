package com.lyft.kronos.internal.ntp;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class NTPSyncException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTPSyncException(String message) {
        super(message);
        j.g(message, "message");
    }
}
