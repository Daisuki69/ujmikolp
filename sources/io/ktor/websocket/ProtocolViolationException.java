package io.ktor.websocket;

import Bj.InterfaceC0164w;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtocolViolationException extends Exception implements InterfaceC0164w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17562a;

    public ProtocolViolationException(String violation) {
        j.g(violation, "violation");
        this.f17562a = violation;
    }

    @Override // Bj.InterfaceC0164w
    public final Throwable a() {
        ProtocolViolationException protocolViolationException = new ProtocolViolationException(this.f17562a);
        protocolViolationException.initCause(this);
        return protocolViolationException;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Received illegal frame: " + this.f17562a;
    }
}
