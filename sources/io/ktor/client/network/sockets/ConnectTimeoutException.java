package io.ktor.client.network.sockets;

import java.net.ConnectException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ConnectTimeoutException extends ConnectException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f17504a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectTimeoutException(String message, Throwable th2) {
        super(message);
        j.g(message, "message");
        this.f17504a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f17504a;
    }
}
