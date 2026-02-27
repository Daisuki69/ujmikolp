package Jg;

import Bj.D0;
import Bj.H;
import Ng.A;
import Ng.n;
import Ng.s;
import Ng.t;
import Rg.j;
import a.AbstractC0617a;
import bg.AbstractC0983W;
import cj.C1110A;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f2520a = new A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f2521b = t.f4437b;
    public final n c = new n(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2522d = Lg.b.f2985a;
    public D0 e = H.e(1);
    public final j f = new j();

    @Override // Ng.s
    public final n a() {
        return this.c;
    }

    public final void b(Wg.a aVar) {
        j jVar = this.f;
        if (aVar != null) {
            jVar.f(h.f2538a, aVar);
            return;
        }
        Rg.a key = h.f2538a;
        jVar.getClass();
        kotlin.jvm.internal.j.g(key, "key");
        jVar.d().remove(key);
    }

    public final void c(c builder) {
        kotlin.jvm.internal.j.g(builder, "builder");
        this.e = builder.e;
        this.f2521b = builder.f2521b;
        this.f2522d = builder.f2522d;
        Rg.a aVar = h.f2538a;
        j other = builder.f;
        b((Wg.a) other.e(aVar));
        A a8 = builder.f2520a;
        A a10 = this.f2520a;
        AbstractC0983W.F(a10, a8);
        a10.d(a10.h);
        AbstractC0617a.m(this.c, builder.c);
        j jVar = this.f;
        kotlin.jvm.internal.j.g(jVar, "<this>");
        kotlin.jvm.internal.j.g(other, "other");
        for (Rg.a aVar2 : C1110A.V(other.d().keySet())) {
            kotlin.jvm.internal.j.e(aVar2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            jVar.f(aVar2, other.c(aVar2));
        }
    }
}
