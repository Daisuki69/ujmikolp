package io.ktor.utils.io;

import ij.AbstractC1609c;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mj.a f17516b;
    private volatile A closed;

    public C(Mj.a aVar) {
        this.f17516b = aVar;
    }

    @Override // io.ktor.utils.io.n
    public final void a(Throwable th2) {
        String message;
        if (this.closed != null) {
            return;
        }
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new A(new IOException(message, th2));
    }

    @Override // io.ktor.utils.io.n
    public final Throwable b() {
        A a8 = this.closed;
        if (a8 != null) {
            return a8.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.n
    public final Mj.i f() throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return this.f17516b;
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.n
    public final Object h(int i, AbstractC1609c abstractC1609c) throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return Boolean.valueOf(Yg.a.b(this.f17516b) >= ((long) 1));
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.n
    public final boolean i() {
        return this.f17516b.exhausted();
    }
}
