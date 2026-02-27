package ph;

import java.util.Iterator;

/* JADX INFO: renamed from: ph.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2064e implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.l f19444b;

    public /* synthetic */ C2064e(ch.l lVar, int i) {
        this.f19443a = i;
        this.f19444b = lVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f19443a) {
            case 0:
                C2060d c2060d = new C2060d();
                ch.l.wrap(this.f19444b).materialize().subscribe(c2060d);
                return c2060d;
            default:
                return new C2080i(this.f19444b, new C2084j());
        }
    }
}
