package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1190d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10085a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10086b;
    public final /* synthetic */ C1192f c;

    public C1190d(C1192f c1192f) {
        this.c = c1192f;
        this.f10086b = c1192f.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10085a < this.f10086b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f10085a;
        if (i >= this.f10086b) {
            throw new NoSuchElementException();
        }
        this.f10085a = i + 1;
        return Byte.valueOf(this.c.e(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
