package Lh;

import Ah.p;
import Ah.q;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ch.f f3003b;
    public final Object c;

    public i(p pVar, Ch.f fVar, Object obj) {
        this.f3002a = pVar;
        this.f3003b = fVar;
        this.c = obj;
    }

    @Override // Ah.p
    public final void g(q qVar) {
        this.f3002a.f(new c(4, this, qVar));
    }
}
