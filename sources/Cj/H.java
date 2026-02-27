package cj;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import rj.InterfaceC2210a;
import yj.C2537b;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9380a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f9381b;
    public int c;

    public H(Iterator iterator) {
        kotlin.jvm.internal.j.g(iterator, "iterator");
        this.f9381b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f9380a) {
            case 0:
                return this.f9381b.hasNext();
        }
        while (true) {
            int i = this.c;
            it = this.f9381b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f9380a) {
            case 0:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new IndexedValue(i, this.f9381b.next());
                }
                C1132s.k();
                throw null;
        }
        while (true) {
            int i4 = this.c;
            it = this.f9381b;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9380a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public H(C2537b c2537b) {
        this.f9381b = c2537b.f21310a.iterator();
        this.c = c2537b.f21311b;
    }
}
