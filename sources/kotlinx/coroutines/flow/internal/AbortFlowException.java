package kotlinx.coroutines.flow.internal;

import Ej.InterfaceC0231i;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class AbortFlowException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0231i f18213a;

    public AbortFlowException(InterfaceC0231i interfaceC0231i) {
        super("Flow was aborted, no more elements needed");
        this.f18213a = interfaceC0231i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
