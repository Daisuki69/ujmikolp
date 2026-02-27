package io.ktor.network.tls;

import Bj.InterfaceC0164w;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class NoPrivateKeyException extends IllegalStateException implements InterfaceC0164w {
    @Override // Bj.InterfaceC0164w
    public final Throwable a() {
        j.g(null, "alias");
        j.g(null, "store");
        NoPrivateKeyException noPrivateKeyException = new NoPrivateKeyException("Failed to find private key for alias null. Please check your key store: null");
        noPrivateKeyException.initCause(this);
        return noPrivateKeyException;
    }
}
