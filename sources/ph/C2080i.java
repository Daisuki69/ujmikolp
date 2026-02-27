package ph;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import vh.AbstractC2353d;
import vh.C2356g;

/* JADX INFO: renamed from: ph.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2080i implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2084j f19494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.l f19495b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19496d = true;
    public boolean e = true;
    public Throwable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19497g;

    public C2080i(ch.l lVar, C2084j c2084j) {
        this.f19495b = lVar;
        this.f19494a = c2084j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Throwable th2 = this.f;
        if (th2 != null) {
            throw AbstractC2353d.d(th2);
        }
        if (!this.f19496d) {
            return false;
        }
        if (!this.e) {
            return true;
        }
        boolean z4 = this.f19497g;
        C2084j c2084j = this.f19494a;
        AtomicInteger atomicInteger = c2084j.c;
        if (!z4) {
            this.f19497g = true;
            atomicInteger.set(1);
            new Z(this.f19495b, 5).subscribe(c2084j);
        }
        try {
            atomicInteger.set(1);
            ch.k kVar = (ch.k) c2084j.f19505b.take();
            Object obj = kVar.f9369a;
            if (obj == null || (obj instanceof C2356g)) {
                this.f19496d = false;
                if (obj == null) {
                    return false;
                }
                Throwable thA = kVar.a();
                this.f = thA;
                throw AbstractC2353d.d(thA);
            }
            this.e = false;
            if (obj == null || (obj instanceof C2356g)) {
                obj = null;
            }
            this.c = obj;
            return true;
        } catch (InterruptedException e) {
            c2084j.dispose();
            this.f = e;
            throw AbstractC2353d.d(e);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Throwable th2 = this.f;
        if (th2 != null) {
            throw AbstractC2353d.d(th2);
        }
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        this.e = true;
        return this.c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}
