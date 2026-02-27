package cj;

import java.util.Iterator;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class I implements Iterator, InterfaceC2210a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }
}
