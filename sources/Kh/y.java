package Kh;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Ah.h implements Fh.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2772a;

    public y(Object obj) {
        this.f2772a = obj;
    }

    @Override // Ch.h
    public final Object get() {
        return this.f2772a;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        F f = new F(jVar, this.f2772a);
        jVar.a(f);
        f.run();
    }
}
