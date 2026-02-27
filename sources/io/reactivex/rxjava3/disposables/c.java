package io.reactivex.rxjava3.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends AtomicReference implements b {
    public final boolean a() {
        return get() == null;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        ((Runnable) andSet).run();
    }
}
