package ph;

import java.util.Iterator;
import java.util.NoSuchElementException;
import vh.AbstractC2353d;
import vh.C2356g;

/* JADX INFO: renamed from: ph.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2068f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f19457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2072g f19458b;

    public C2068f(C2072g c2072g) {
        this.f19458b = c2072g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object obj = this.f19458b.f19470b;
        this.f19457a = obj;
        return !(obj == vh.h.f20506a);
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            if (this.f19457a == null) {
                this.f19457a = this.f19458b.f19470b;
            }
            Object obj = this.f19457a;
            if (obj == vh.h.f20506a) {
                throw new NoSuchElementException();
            }
            if (obj instanceof C2356g) {
                throw AbstractC2353d.d(((C2356g) obj).f20505a);
            }
            this.f19457a = null;
            return obj;
        } catch (Throwable th2) {
            this.f19457a = null;
            throw th2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}
