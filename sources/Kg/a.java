package Kg;

import Ng.m;
import Ng.u;
import Ng.v;
import io.ktor.utils.io.n;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2655a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f2656b;
    public final u c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Tg.d f2657d;
    public final Tg.d e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineContext f2658g;
    public final xg.b h;
    public final Object i;

    public a(xg.b bVar, Jg.g gVar) {
        this.h = bVar;
        this.f2658g = gVar.f;
        this.f2656b = gVar.f2534a;
        this.c = gVar.f2536d;
        this.f2657d = gVar.f2535b;
        this.e = gVar.f2537g;
        Object obj = gVar.e;
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar == null) {
            n.f17539a.getClass();
            nVar = io.ktor.utils.io.m.f17538b;
        }
        this.i = nVar;
        this.f = gVar.c;
    }

    @Override // Ng.r
    public final m a() {
        switch (this.f2655a) {
        }
        return this.f;
    }

    @Override // Kg.c
    public final xg.b b() {
        switch (this.f2655a) {
            case 0:
                return this.h;
            default:
                return (xg.d) this.h;
        }
    }

    @Override // Kg.c
    public final n c() {
        switch (this.f2655a) {
            case 0:
                return (n) this.i;
            default:
                return E1.c.a((byte[]) this.i);
        }
    }

    @Override // Kg.c
    public final Tg.d d() {
        switch (this.f2655a) {
        }
        return this.f2657d;
    }

    @Override // Kg.c
    public final Tg.d e() {
        switch (this.f2655a) {
        }
        return this.e;
    }

    @Override // Kg.c
    public final v f() {
        switch (this.f2655a) {
        }
        return this.f2656b;
    }

    @Override // Kg.c
    public final u g() {
        switch (this.f2655a) {
        }
        return this.c;
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        switch (this.f2655a) {
        }
        return this.f2658g;
    }

    public a(xg.d call, byte[] bArr, c cVar) {
        j.g(call, "call");
        this.h = call;
        this.i = bArr;
        this.f2656b = cVar.f();
        this.c = cVar.g();
        this.f2657d = cVar.d();
        this.e = cVar.e();
        this.f = cVar.a();
        this.f2658g = cVar.getCoroutineContext();
    }
}
