package Gg;

import Ng.m;
import Ng.u;
import Ng.v;
import io.ktor.utils.io.n;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Kg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f1975b;
    public final Kg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f1976d;
    public final CoroutineContext e;

    public e(c cVar, Function0 function0, Kg.c cVar2, m headers) {
        kotlin.jvm.internal.j.g(headers, "headers");
        this.f1974a = cVar;
        this.f1975b = function0;
        this.c = cVar2;
        this.f1976d = headers;
        this.e = cVar2.getCoroutineContext();
    }

    @Override // Ng.r
    public final m a() {
        return this.f1976d;
    }

    @Override // Kg.c
    public final xg.b b() {
        return this.f1974a;
    }

    @Override // Kg.c
    public final n c() {
        return (n) this.f1975b.invoke();
    }

    @Override // Kg.c
    public final Tg.d d() {
        return this.c.d();
    }

    @Override // Kg.c
    public final Tg.d e() {
        return this.c.e();
    }

    @Override // Kg.c
    public final v f() {
        return this.c.f();
    }

    @Override // Kg.c
    public final u g() {
        return this.c.g();
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.e;
    }
}
