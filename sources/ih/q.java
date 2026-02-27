package Ih;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends Ah.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2323b;
    public final Object c;

    public /* synthetic */ q(Object obj, int i) {
        this.f2323b = i;
        this.c = obj;
    }

    @Override // Ah.d
    public final void e(nk.b bVar) {
        switch (this.f2323b) {
            case 0:
                ((Ah.h) this.c).g(new p((Ah.e) bVar));
                break;
            default:
                ((Ah.p) this.c).f(new Lh.j((Ah.e) bVar));
                break;
        }
    }
}
