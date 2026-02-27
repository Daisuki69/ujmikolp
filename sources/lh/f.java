package Lh;

import Ah.p;
import Ah.q;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f2996b;
    public final Ch.f c;

    public /* synthetic */ f(p pVar, Ch.f fVar, int i) {
        this.f2995a = i;
        this.c = fVar;
        this.f2996b = pVar;
    }

    @Override // Ah.p
    public final void g(q qVar) {
        switch (this.f2995a) {
            case 0:
                this.f2996b.f(new e(0, qVar, this.c));
                break;
            case 1:
                this.f2996b.f(new c(3, qVar, this.c, false));
                break;
            default:
                this.f2996b.f(new e(1, qVar, this.c));
                break;
        }
    }
}
