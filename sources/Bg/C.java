package Bg;

import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements Jg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ng.t f469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ng.E f470b;
    public final Rg.j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ng.o f471d;

    public C(Jg.c cVar) {
        this.f469a = cVar.f2521b;
        this.f470b = cVar.f2520a.b();
        this.c = cVar.f;
        this.f471d = new Ng.o((Map) cVar.c.f5552b);
    }

    @Override // Ng.r
    public final Ng.m a() {
        return this.f471d;
    }

    @Override // Jg.b, Bj.E
    public final CoroutineContext getCoroutineContext() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // Jg.b
    public final Ng.E getUrl() {
        return this.f470b;
    }

    @Override // Jg.b
    public final Ng.t r() {
        return this.f469a;
    }

    @Override // Jg.b
    public final Rg.j t() {
        return this.c;
    }
}
