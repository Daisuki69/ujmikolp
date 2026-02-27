package O1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: O1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0530y implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4616b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f4617d;
    public final /* synthetic */ int e;
    public final /* synthetic */ C f;

    public C0530y(C c, int i) {
        this.e = i;
        this.f = c;
        this.f4617d = c;
        this.f4615a = c.e;
        this.f4616b = c.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4616b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object a8;
        C c = this.f4617d;
        if (c.e != this.f4615a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4616b;
        this.c = i;
        switch (this.e) {
            case 0:
                a8 = this.f.j()[i];
                break;
            case 1:
                a8 = new A(this.f, i);
                break;
            default:
                a8 = this.f.k()[i];
                break;
        }
        int i4 = this.f4616b + 1;
        if (i4 >= c.f) {
            i4 = -1;
        }
        this.f4616b = i4;
        return a8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C c = this.f4617d;
        if (c.e != this.f4615a) {
            throw new ConcurrentModificationException();
        }
        qk.i.p(this.c >= 0, "no calls to next() since the last call to remove()");
        this.f4615a += 32;
        c.remove(c.j()[this.c]);
        this.f4616b--;
        this.c = -1;
    }
}
