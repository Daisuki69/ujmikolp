package ph;

import java.util.Iterator;

/* JADX INFO: renamed from: ph.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2076h implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19482b;

    public C2076h(ch.l lVar, Object obj) {
        this.f19481a = lVar;
        this.f19482b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Object obj = this.f19482b;
        C2072g c2072g = new C2072g();
        c2072g.f19470b = obj;
        this.f19481a.subscribe(c2072g);
        return new C2068f(c2072g);
    }
}
