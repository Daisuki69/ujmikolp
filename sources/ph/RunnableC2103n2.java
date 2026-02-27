package ph;

import java.util.concurrent.atomic.AtomicInteger;
import kh.InterfaceC1775b;

/* JADX INFO: renamed from: ph.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2103n2 extends AtomicInteger implements InterfaceC1775b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19569b;

    public RunnableC2103n2(ch.r rVar, Object obj) {
        this.f19568a = rVar;
        this.f19569b = obj;
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        lazySet(1);
        return 1;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        lazySet(3);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        set(3);
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // kh.InterfaceC1779f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f19569b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.f19569b;
            ch.r rVar = this.f19568a;
            rVar.onNext(obj);
            if (get() == 2) {
                lazySet(3);
                rVar.onComplete();
            }
        }
    }
}
