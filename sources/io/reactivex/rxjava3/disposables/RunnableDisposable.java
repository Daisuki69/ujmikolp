package io.reactivex.rxjava3.disposables;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class RunnableDisposable extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableDisposable(Runnable runnable) {
        super(runnable);
        Objects.requireNonNull(runnable, "value is null");
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + a() + ", " + get() + ")";
    }
}
