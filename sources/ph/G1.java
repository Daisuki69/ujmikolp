package ph;

/* JADX INFO: loaded from: classes4.dex */
public final class G1 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19197b;

    public G1(long j, long j6) {
        this.f19196a = j;
        this.f19197b = j6;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        ch.r rVar2;
        long j = this.f19196a;
        E1 e12 = new E1(rVar, j, this.f19197b + j, 1);
        rVar.onSubscribe(e12);
        if (e12.e) {
            return;
        }
        long j6 = e12.f19174d;
        while (true) {
            long j7 = e12.c;
            rVar2 = e12.f19173b;
            if (j6 == j7 || e12.get() != 0) {
                break;
            }
            rVar2.onNext(Long.valueOf(j6));
            j6++;
        }
        if (e12.get() == 0) {
            e12.lazySet(1);
            rVar2.onComplete();
        }
    }
}
