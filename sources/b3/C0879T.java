package b3;

import d3.InterfaceC1330b;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: b3.T, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0879T implements InterfaceC1330b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.d f8410b;
    public final d3.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3.d f8411d;
    public final d3.d e;
    public final d3.d f;

    public /* synthetic */ C0879T(d3.d dVar, d3.d dVar2, d3.d dVar3, d3.d dVar4, d3.d dVar5, int i) {
        this.f8409a = i;
        this.f8410b = dVar;
        this.c = dVar2;
        this.f8411d = dVar3;
        this.e = dVar4;
        this.f = dVar5;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f8409a) {
            case 0:
                return new C0878S((U1.g) this.f8410b.get(), (C2.e) this.c.get(), (e3.m) this.f8411d.get(), (C0891l) this.e.get(), (CoroutineContext) this.f.get());
            default:
                return new e3.e((i0) this.f8410b.get(), (C2.e) this.c.get(), (C0881b) this.f8411d.get(), (e3.g) this.e.get(), (e3.s) this.f.get());
        }
    }
}
