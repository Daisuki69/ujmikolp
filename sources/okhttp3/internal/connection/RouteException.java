package okhttp3.internal.connection;

import bj.C1030a;
import java.io.IOException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        j.g(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(IOException e) {
        j.g(e, "e");
        C1030a.a(this.firstConnectException, e);
        this.lastConnectException = e;
    }

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
