package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class MulticastConsumer implements Consumer<WindowLayoutInfo>, androidx.window.extensions.core.util.function.Consumer<WindowLayoutInfo> {
    private final Context context;

    @GuardedBy("lock")
    private androidx.window.layout.WindowLayoutInfo lastKnownValue;
    private final ReentrantLock multicastConsumerLock;

    @GuardedBy("lock")
    private final Set<Consumer<androidx.window.layout.WindowLayoutInfo>> registeredListeners;

    public MulticastConsumer(Context context) {
        j.g(context, "context");
        this.context = context;
        this.multicastConsumerLock = new ReentrantLock();
        this.registeredListeners = new LinkedHashSet();
    }

    public final void addListener(Consumer<androidx.window.layout.WindowLayoutInfo> listener) {
        j.g(listener, "listener");
        ReentrantLock reentrantLock = this.multicastConsumerLock;
        reentrantLock.lock();
        try {
            androidx.window.layout.WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
            if (windowLayoutInfo != null) {
                listener.accept(windowLayoutInfo);
            }
            this.registeredListeners.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean isEmpty() {
        return this.registeredListeners.isEmpty();
    }

    public final void removeListener(Consumer<androidx.window.layout.WindowLayoutInfo> listener) {
        j.g(listener, "listener");
        ReentrantLock reentrantLock = this.multicastConsumerLock;
        reentrantLock.lock();
        try {
            this.registeredListeners.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.core.util.Consumer
    public void accept(WindowLayoutInfo value) {
        j.g(value, "value");
        ReentrantLock reentrantLock = this.multicastConsumerLock;
        reentrantLock.lock();
        try {
            this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.context, value);
            Iterator<T> it = this.registeredListeners.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(this.lastKnownValue);
            }
            Unit unit = Unit.f18162a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
