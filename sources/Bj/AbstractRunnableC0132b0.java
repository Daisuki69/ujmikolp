package Bj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: Bj.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC0132b0 implements Runnable, Comparable, W {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f610b = -1;

    public AbstractRunnableC0132b0(long j) {
        this.f609a = j;
    }

    public final Gj.y b() {
        Object obj = this._heap;
        if (obj instanceof Gj.y) {
            return (Gj.y) obj;
        }
        return null;
    }

    public final int c(long j, C0134c0 c0134c0, AbstractC0136d0 abstractC0136d0) {
        synchronized (this) {
            if (this._heap == H.f590b) {
                return 2;
            }
            synchronized (c0134c0) {
                try {
                    AbstractRunnableC0132b0[] abstractRunnableC0132b0Arr = c0134c0.f2041a;
                    AbstractRunnableC0132b0 abstractRunnableC0132b0 = abstractRunnableC0132b0Arr != null ? abstractRunnableC0132b0Arr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0136d0.e;
                    abstractC0136d0.getClass();
                    if (AbstractC0136d0.f613g.get(abstractC0136d0) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC0132b0 == null) {
                        c0134c0.c = j;
                    } else {
                        long j6 = abstractRunnableC0132b0.f609a;
                        if (j6 - j < 0) {
                            j = j6;
                        }
                        if (j - c0134c0.c > 0) {
                            c0134c0.c = j;
                        }
                    }
                    long j7 = this.f609a;
                    long j9 = c0134c0.c;
                    if (j7 - j9 < 0) {
                        this.f609a = j9;
                    }
                    c0134c0.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f609a - ((AbstractRunnableC0132b0) obj).f609a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(C0134c0 c0134c0) {
        if (this._heap == H.f590b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c0134c0;
    }

    @Override // Bj.W
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                Gj.t tVar = H.f590b;
                if (obj == tVar) {
                    return;
                }
                C0134c0 c0134c0 = obj instanceof C0134c0 ? (C0134c0) obj : null;
                if (c0134c0 != null) {
                    c0134c0.b(this);
                }
                this._heap = tVar;
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f609a + ']';
    }
}
