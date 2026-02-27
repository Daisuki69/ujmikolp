package io.ktor.utils.io;

import Bj.H;
import Bj.InterfaceC0164w;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f17514a;

    /* JADX WARN: Multi-variable type inference failed */
    public A(Throwable th2) {
        Throwable iOException;
        if (th2 == 0) {
            iOException = null;
        } else if (th2 instanceof CancellationException) {
            if (th2 instanceof InterfaceC0164w) {
                iOException = ((InterfaceC0164w) th2).a();
            } else {
                String message = ((CancellationException) th2).getMessage();
                iOException = H.a(message == null ? "Channel was cancelled" : message, th2);
            }
        } else if ((th2 instanceof IOException) && (th2 instanceof InterfaceC0164w)) {
            iOException = ((InterfaceC0164w) th2).a();
        } else {
            String message2 = th2.getMessage();
            iOException = new IOException(message2 == null ? "Channel was closed" : message2, th2);
        }
        this.f17514a = iOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable a() {
        Throwable th2 = this.f17514a;
        if (th2 == 0) {
            return null;
        }
        if (th2 instanceof IOException) {
            return th2 instanceof InterfaceC0164w ? ((InterfaceC0164w) th2).a() : new IOException(((IOException) th2).getMessage(), th2);
        }
        if (!(th2 instanceof InterfaceC0164w)) {
            return H.a(th2.getMessage(), th2);
        }
        Throwable thA = ((InterfaceC0164w) th2).a();
        return thA == null ? H.a(th2.getMessage(), th2) : thA;
    }
}
