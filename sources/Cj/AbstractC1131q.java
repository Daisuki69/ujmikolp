package cj;

import java.util.Iterator;
import rj.InterfaceC2210a;

/* JADX INFO: renamed from: cj.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1131q implements Iterator, InterfaceC2210a {
    public abstract char a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
