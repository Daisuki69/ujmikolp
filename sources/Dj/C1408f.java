package dj;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import rj.InterfaceC2210a;

/* JADX INFO: renamed from: dj.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1408f implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1407e f16528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16529b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16530d;
    public final /* synthetic */ int e;

    public C1408f(C1407e map, int i) {
        this.e = i;
        kotlin.jvm.internal.j.g(map, "map");
        this.f16528a = map;
        this.c = -1;
        this.f16530d = map.h;
        b();
    }

    public final void a() {
        if (this.f16528a.h != this.f16530d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.f16529b;
            C1407e c1407e = this.f16528a;
            if (i >= c1407e.f || c1407e.c[i] >= 0) {
                return;
            } else {
                this.f16529b = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16529b < this.f16528a.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                a();
                int i = this.f16529b;
                C1407e c1407e = this.f16528a;
                if (i >= c1407e.f) {
                    throw new NoSuchElementException();
                }
                this.f16529b = i + 1;
                this.c = i;
                C1409g c1409g = new C1409g(c1407e, i);
                b();
                return c1409g;
            case 1:
                a();
                int i4 = this.f16529b;
                C1407e c1407e2 = this.f16528a;
                if (i4 >= c1407e2.f) {
                    throw new NoSuchElementException();
                }
                this.f16529b = i4 + 1;
                this.c = i4;
                Object obj = c1407e2.f16522a[i4];
                b();
                return obj;
            default:
                a();
                int i6 = this.f16529b;
                C1407e c1407e3 = this.f16528a;
                if (i6 >= c1407e3.f) {
                    throw new NoSuchElementException();
                }
                this.f16529b = i6 + 1;
                this.c = i6;
                Object[] objArr = c1407e3.f16523b;
                kotlin.jvm.internal.j.d(objArr);
                Object obj2 = objArr[this.c];
                b();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C1407e c1407e = this.f16528a;
        c1407e.c();
        c1407e.l(this.c);
        this.c = -1;
        this.f16530d = c1407e.h;
    }
}
