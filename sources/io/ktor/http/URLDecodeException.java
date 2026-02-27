package io.ktor.http;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class URLDecodeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLDecodeException(String message) {
        super(message);
        j.g(message, "message");
    }
}
