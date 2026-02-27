package Kh;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends Ah.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2684a;

    public E(int i) {
        this.f2684a = ((long) 0) + ((long) i);
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        Ah.j jVar2;
        D d10 = new D(jVar, 0, this.f2684a);
        jVar.a(d10);
        if (d10.f2683d) {
            return;
        }
        long j = d10.c;
        while (true) {
            long j6 = d10.f2682b;
            jVar2 = d10.f2681a;
            if (j == j6 || d10.get() != 0) {
                break;
            }
            jVar2.onNext(Integer.valueOf((int) j));
            j++;
        }
        if (d10.get() == 0) {
            d10.lazySet(1);
            jVar2.onComplete();
        }
    }
}
