package io.ktor.websocket;

import Bj.InterfaceC0164w;

/* JADX INFO: loaded from: classes4.dex */
public final class FrameTooBigException extends Exception implements InterfaceC0164w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17561a;

    public FrameTooBigException(long j) {
        this.f17561a = j;
    }

    @Override // Bj.InterfaceC0164w
    public final Throwable a() {
        FrameTooBigException frameTooBigException = new FrameTooBigException(this.f17561a);
        frameTooBigException.initCause(this);
        return frameTooBigException;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Frame is too big: " + this.f17561a;
    }
}
