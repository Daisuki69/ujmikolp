package androidx.lifecycle;

import Bj.C0154m0;
import Bj.E;
import Bj.InterfaceC0156n0;
import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class CloseableCoroutineScope implements Closeable, E, AutoCloseable {
    private final CoroutineContext coroutineContext;

    public CloseableCoroutineScope(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) getCoroutineContext().get(C0154m0.f630a);
        if (interfaceC0156n0 != null) {
            interfaceC0156n0.b(null);
        }
    }

    @Override // Bj.E
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
