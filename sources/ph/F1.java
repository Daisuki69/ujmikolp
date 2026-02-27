package ph;

/* JADX INFO: loaded from: classes4.dex */
public final class F1 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19185b;

    public F1(int i, int i4) {
        this.f19184a = i;
        this.f19185b = ((long) i) + ((long) i4);
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        ch.r rVar2;
        E1 e12 = new E1(rVar, this.f19184a, this.f19185b, 0);
        rVar.onSubscribe(e12);
        if (e12.e) {
            return;
        }
        long j = e12.f19174d;
        while (true) {
            long j6 = e12.c;
            rVar2 = e12.f19173b;
            if (j == j6 || e12.get() != 0) {
                break;
            }
            rVar2.onNext(Integer.valueOf((int) j));
            j++;
        }
        if (e12.get() == 0) {
            e12.lazySet(1);
            rVar2.onComplete();
        }
    }
}
