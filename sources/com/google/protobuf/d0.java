package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10087a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10088b;
    public Iterator c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f10089d;

    public d0(Y y7) {
        this.f10089d = y7;
    }

    public final Iterator a() {
        if (this.c == null) {
            this.c = this.f10089d.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f10087a + 1;
        Y y7 = this.f10089d;
        return i < y7.f10076b.size() || (!y7.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f10088b = true;
        int i = this.f10087a + 1;
        this.f10087a = i;
        Y y7 = this.f10089d;
        return i < y7.f10076b.size() ? (Map.Entry) y7.f10076b.get(this.f10087a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10088b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f10088b = false;
        int i = Y.f10074g;
        Y y7 = this.f10089d;
        y7.b();
        if (this.f10087a >= y7.f10076b.size()) {
            a().remove();
            return;
        }
        int i4 = this.f10087a;
        this.f10087a = i4 - 1;
        y7.g(i4);
    }
}
