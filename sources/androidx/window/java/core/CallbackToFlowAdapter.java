package androidx.window.java.core;

import Bj.H;
import Bj.InterfaceC0156n0;
import Ej.InterfaceC0230h;
import androidx.core.util.Consumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CallbackToFlowAdapter {
    private final ReentrantLock lock = new ReentrantLock();
    private final Map<Consumer<?>, InterfaceC0156n0> consumerToJobMap = new LinkedHashMap();

    public final <T> void connect(Executor executor, Consumer<T> consumer, InterfaceC0230h flow) {
        j.g(executor, "executor");
        j.g(consumer, "consumer");
        j.g(flow, "flow");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(consumer) == null) {
                this.consumerToJobMap.put(consumer, H.w(H.c(H.n(executor)), null, null, new CallbackToFlowAdapter$connect$1$1(flow, consumer, null), 3));
            }
            Unit unit = Unit.f18162a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void disconnect(Consumer<?> consumer) {
        j.g(consumer, "consumer");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            InterfaceC0156n0 interfaceC0156n0 = this.consumerToJobMap.get(consumer);
            if (interfaceC0156n0 != null) {
                interfaceC0156n0.b(null);
            }
            this.consumerToJobMap.remove(consumer);
        } finally {
            reentrantLock.unlock();
        }
    }
}
