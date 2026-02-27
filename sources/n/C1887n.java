package n;

import z.AbstractC2543e;

/* JADX INFO: renamed from: n.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1887n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f18481b;
    public final /* synthetic */ s c;

    public /* synthetic */ C1887n(s sVar, float f, int i) {
        this.f18480a = i;
        this.c = sVar;
        this.f18481b = f;
    }

    @Override // n.r
    public final void run() {
        switch (this.f18480a) {
            case 0:
                this.c.o(this.f18481b);
                break;
            case 1:
                s sVar = this.c;
                C1880g c1880g = sVar.f18489b;
                float f = this.f18481b;
                if (c1880g != null) {
                    sVar.m((int) AbstractC2543e.d(c1880g.f18463k, c1880g.f18464l, f));
                } else {
                    sVar.h.add(new C1887n(sVar, f, 1));
                }
                break;
            default:
                s sVar2 = this.c;
                C1880g c1880g2 = sVar2.f18489b;
                float f3 = this.f18481b;
                if (c1880g2 != null) {
                    sVar2.j((int) AbstractC2543e.d(c1880g2.f18463k, c1880g2.f18464l, f3));
                } else {
                    sVar2.h.add(new C1887n(sVar2, f3, 2));
                }
                break;
        }
    }
}
