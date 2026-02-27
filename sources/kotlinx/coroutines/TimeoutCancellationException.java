package kotlinx.coroutines;

import Bj.G0;
import Bj.InterfaceC0164w;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeoutCancellationException extends CancellationException implements InterfaceC0164w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient G0 f18212a;

    public TimeoutCancellationException(String str, G0 g02) {
        super(str);
        this.f18212a = g02;
    }

    @Override // Bj.InterfaceC0164w
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f18212a);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
