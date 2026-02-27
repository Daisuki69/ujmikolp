package ph;

import java.util.Iterator;

/* JADX INFO: renamed from: ph.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2056c implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19423b;

    public C2056c(ch.l lVar, int i) {
        this.f19422a = lVar;
        this.f19423b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2052b c2052b = new C2052b(this.f19423b);
        this.f19422a.subscribe(c2052b);
        return c2052b;
    }
}
