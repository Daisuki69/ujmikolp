package Jg;

import Ng.E;
import Ng.m;
import Ng.o;
import Ng.t;
import Rg.j;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg.b f2517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f2518b;
    public final E c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f2519d;
    public final j e;

    public a(xg.b bVar, d dVar) {
        this.f2517a = bVar;
        this.f2518b = dVar.f2524b;
        this.c = dVar.f2523a;
        this.f2519d = dVar.c;
        this.e = dVar.f;
    }

    @Override // Ng.r
    public final m a() {
        return this.f2519d;
    }

    @Override // Jg.b, Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.f2517a.getCoroutineContext();
    }

    @Override // Jg.b
    public final E getUrl() {
        return this.c;
    }

    @Override // Jg.b
    public final t r() {
        return this.f2518b;
    }

    @Override // Jg.b
    public final j t() {
        return this.e;
    }
}
