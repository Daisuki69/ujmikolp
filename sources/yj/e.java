package yj;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.sequences.Sequence;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f21314b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21315d;
    public final /* synthetic */ Sequence e;

    public e(f fVar) {
        this.f21313a = 0;
        this.e = fVar;
        this.f21314b = fVar.f21316a.iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        f fVar;
        do {
            Iterator it = this.f21314b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            } else {
                next = it.next();
                fVar = (f) this.e;
            }
        } while (((Boolean) fVar.c.invoke(next)).booleanValue() != fVar.f21317b);
        this.f21315d = next;
        this.c = 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.k] */
    public void b() {
        Iterator it = this.f21314b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((kotlin.jvm.internal.k) ((i) this.e).c).invoke(next)).booleanValue()) {
                this.c = 1;
                this.f21315d = next;
                return;
            }
        }
        this.c = 0;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.f21315d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f21314b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.f21315d = null;
                return false;
            }
            Object next = it3.next();
            g gVar = (g) this.e;
            it = (Iterator) gVar.c.invoke(gVar.f21319b.invoke(next));
        } while (!it.hasNext());
        this.f21315d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21313a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            case 1:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
            default:
                if (this.c == -1) {
                    b();
                }
                return this.c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f21313a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f21315d;
                this.f21315d = null;
                this.c = -1;
                return obj;
            case 1:
                int i = this.c;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !c()) {
                    throw new NoSuchElementException();
                }
                this.c = 0;
                Iterator it = (Iterator) this.f21315d;
                kotlin.jvm.internal.j.d(it);
                return it.next();
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f21315d;
                this.f21315d = null;
                this.c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f21313a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g gVar) {
        this.f21313a = 1;
        this.e = gVar;
        this.f21314b = gVar.f21318a.iterator();
    }

    public e(i iVar) {
        this.f21313a = 2;
        this.e = iVar;
        this.f21314b = ((Sequence) iVar.f21323b).iterator();
        this.c = -1;
    }
}
