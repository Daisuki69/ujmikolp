package Eh;

import Ch.f;
import Ch.h;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Callable, h, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f1363a;

    public c(Throwable th2) {
        this.f1363a = th2;
    }

    @Override // Ch.f
    public final Object apply(Object obj) {
        return this.f1363a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f1363a;
    }

    @Override // Ch.h
    public final Object get() {
        return this.f1363a;
    }
}
