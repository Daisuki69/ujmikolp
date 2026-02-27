package A;

import n.C1872C;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1872C f15b;

    public c() {
        this.f14a = new b();
        this.f15b = null;
    }

    public Object a(b bVar) {
        return this.f15b;
    }

    public final Object b(Object obj, Object obj2) {
        b bVar = this.f14a;
        bVar.f12a = obj;
        bVar.f13b = obj2;
        return a(bVar);
    }

    public c(C1872C c1872c) {
        this.f14a = new b();
        this.f15b = c1872c;
    }
}
