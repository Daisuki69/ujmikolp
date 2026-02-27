package yj;

import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1615i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends k implements Iterator, InterfaceC1526a, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21325b;
    public Iterator c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1526a f21326d;

    @Override // yj.k
    public final void b(InterfaceC1526a frame, Object obj) {
        this.f21325b = obj;
        this.f21324a = 3;
        this.f21326d = frame;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        kotlin.jvm.internal.j.g(frame, "frame");
    }

    @Override // yj.k
    public final Object c(Iterator it, AbstractC1615i abstractC1615i) {
        if (!it.hasNext()) {
            return Unit.f18162a;
        }
        this.c = it;
        this.f21324a = 2;
        this.f21326d = abstractC1615i;
        return EnumC1578a.f17050a;
    }

    public final RuntimeException d() {
        int i = this.f21324a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f21324a);
    }

    @Override // gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f18170a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f21324a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator it = this.c;
                kotlin.jvm.internal.j.d(it);
                if (it.hasNext()) {
                    this.f21324a = 2;
                    return true;
                }
                this.c = null;
            }
            this.f21324a = 5;
            InterfaceC1526a interfaceC1526a = this.f21326d;
            kotlin.jvm.internal.j.d(interfaceC1526a);
            this.f21326d = null;
            C1037h.a aVar = C1037h.f9166b;
            interfaceC1526a.resumeWith(Unit.f18162a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f21324a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f21324a = 1;
            Iterator it = this.c;
            kotlin.jvm.internal.j.d(it);
            return it.next();
        }
        if (i != 3) {
            throw d();
        }
        this.f21324a = 0;
        Object obj = this.f21325b;
        this.f21325b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        AbstractC1039j.b(obj);
        this.f21324a = 4;
    }
}
