package cj;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rj.InterfaceC2210a;

/* JADX INFO: renamed from: cj.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1116b implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9385b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f9384a;
        if (i == 0) {
            this.f9384a = 3;
            a();
            return this.f9384a == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9384a;
        if (i == 1) {
            this.f9384a = 0;
            return this.f9385b;
        }
        if (i != 2) {
            this.f9384a = 3;
            a();
            if (this.f9384a == 1) {
                this.f9384a = 0;
                return this.f9385b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
