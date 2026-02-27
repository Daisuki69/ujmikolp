package io.ktor.client.call;

import kotlin.jvm.internal.j;
import xg.b;

/* JADX INFO: loaded from: classes4.dex */
public final class DoubleReceiveException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17502a;

    public DoubleReceiveException(b call) {
        j.g(call, "call");
        this.f17502a = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f17502a;
    }
}
