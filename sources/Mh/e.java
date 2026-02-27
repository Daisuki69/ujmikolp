package mh;

import ch.InterfaceC1108g;
import p3.C2011b;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC1864a {
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18430d;
    public final C2011b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, int i) {
        super(cVar);
        C2011b c2011b = jh.e.c;
        this.c = i;
        this.f18430d = true;
        this.e = c2011b;
    }

    @Override // ch.AbstractC1107f
    public final void c(nk.b bVar) {
        this.f18422b.b(new d((InterfaceC1108g) bVar, this.c, this.f18430d, this.e));
    }
}
