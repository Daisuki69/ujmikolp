package cj;

import java.util.Iterator;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J implements Iterator, InterfaceC2210a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
