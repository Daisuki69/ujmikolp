package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f10102a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10102a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f10102a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
