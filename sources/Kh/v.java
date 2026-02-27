package Kh;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Fh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f2765b;
    public volatile boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2766d;
    public boolean e;
    public boolean f;

    public v(Ah.j jVar, Iterator it) {
        this.f2764a = jVar;
        this.f2765b = it;
    }

    @Override // Fh.c
    public final int b(int i) {
        this.f2766d = true;
        return 1;
    }

    @Override // Fh.g
    public final void clear() {
        this.e = true;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.c = true;
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return this.e;
    }

    @Override // Fh.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // Fh.g
    public final Object poll() {
        if (this.e) {
            return null;
        }
        boolean z4 = this.f;
        Iterator it = this.f2765b;
        if (!z4) {
            this.f = true;
        } else if (!it.hasNext()) {
            this.e = true;
            return null;
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        return next;
    }
}
