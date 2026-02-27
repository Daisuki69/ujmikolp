package Jg;

import Bg.X;
import Bj.D0;
import Ng.E;
import Ng.o;
import Ng.t;
import Rg.j;
import cj.C1114E;
import java.util.Map;
import java.util.Set;
import zg.AbstractC2572g;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f2523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f2524b;
    public final o c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Og.f f2525d;
    public final D0 e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f2526g;

    public d(E e, t method, o oVar, Og.f fVar, D0 executionContext, j attributes) {
        Set setKeySet;
        kotlin.jvm.internal.j.g(method, "method");
        kotlin.jvm.internal.j.g(executionContext, "executionContext");
        kotlin.jvm.internal.j.g(attributes, "attributes");
        this.f2523a = e;
        this.f2524b = method;
        this.c = oVar;
        this.f2525d = fVar;
        this.e = executionContext;
        this.f = attributes;
        Map map = (Map) attributes.e(AbstractC2572g.f21433a);
        this.f2526g = (map == null || (setKeySet = map.keySet()) == null) ? C1114E.f9379a : setKeySet;
    }

    public final Object a() {
        X x6 = X.f506a;
        Map map = (Map) this.f.e(AbstractC2572g.f21433a);
        if (map != null) {
            return map.get(x6);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f2523a + ", method=" + this.f2524b + ')';
    }
}
