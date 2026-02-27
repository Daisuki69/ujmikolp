package Lh;

import Ah.p;
import Ah.q;
import D8.C0193a;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f2992b;
    public final Ch.c c;

    public /* synthetic */ d(p pVar, Ch.c cVar, int i) {
        this.f2991a = i;
        this.f2992b = pVar;
        this.c = cVar;
    }

    @Override // Ah.p
    public final void g(q qVar) {
        switch (this.f2991a) {
            case 0:
                this.f2992b.f(new c(0, this, qVar));
                break;
            case 1:
                this.f2992b.f(new C0193a(qVar, this.c));
                break;
            default:
                this.f2992b.f(new c(1, this, qVar));
                break;
        }
    }
}
