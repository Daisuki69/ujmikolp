package Bg;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ok.b f517a = Xh.i.a("io.ktor.client.plugins.HttpTimeout");

    static {
        jk.b.f("HttpTimeout", Z.h, new Ag.a(8));
    }

    public static final ConnectTimeoutException a(Jg.d request, Throwable th2) {
        Object obj;
        kotlin.jvm.internal.j.g(request, "request");
        StringBuilder sb2 = new StringBuilder("Connect timeout has expired [url=");
        sb2.append(request.f2523a);
        sb2.append(", connect_timeout=");
        Y y7 = (Y) request.a();
        if (y7 == null || (obj = y7.f508b) == null) {
            obj = "unknown";
        }
        return new ConnectTimeoutException(androidx.camera.core.impl.a.m(sb2, obj, " ms]"), th2);
    }

    public static final SocketTimeoutException b(Jg.d request, Throwable th2) {
        Object obj;
        kotlin.jvm.internal.j.g(request, "request");
        StringBuilder sb2 = new StringBuilder("Socket timeout has expired [url=");
        sb2.append(request.f2523a);
        sb2.append(", socket_timeout=");
        Y y7 = (Y) request.a();
        if (y7 == null || (obj = y7.c) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append("] ms");
        String message = sb2.toString();
        kotlin.jvm.internal.j.g(message, "message");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(message);
        socketTimeoutException.initCause(th2);
        return socketTimeoutException;
    }
}
