package ph;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;
import vh.C2356g;
import xh.AbstractC2477a;

/* JADX INFO: renamed from: ph.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2060d extends AbstractC2477a implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ch.k f19430b;
    public final Semaphore c = new Semaphore(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f19431d = new AtomicReference();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ch.k kVar = this.f19430b;
        if (kVar != null && (kVar.f9369a instanceof C2356g)) {
            throw AbstractC2353d.d(kVar.a());
        }
        if (kVar == null) {
            try {
                this.c.acquire();
                ch.k kVar2 = (ch.k) this.f19431d.getAndSet(null);
                this.f19430b = kVar2;
                if (kVar2.f9369a instanceof C2356g) {
                    throw AbstractC2353d.d(kVar2.a());
                }
            } catch (InterruptedException e) {
                dispose();
                this.f19430b = new ch.k(new C2356g(e));
                throw AbstractC2353d.d(e);
            }
        }
        Object obj = this.f19430b.f9369a;
        return (obj == null || (obj instanceof C2356g)) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f19430b.f9369a;
        if (obj == null || (obj instanceof C2356g)) {
            obj = null;
        }
        this.f19430b = null;
        return obj;
    }

    @Override // ch.r
    public final void onComplete() {
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        S1.s.r(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19431d.getAndSet((ch.k) obj) == null) {
            this.c.release();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Read-only iterator.");
    }
}
