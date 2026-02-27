package ph;

import fh.C1487c;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class Z extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(ch.p pVar, int i) {
        super(pVar);
        this.f19394b = i;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19394b) {
            case 0:
                this.f19404a.subscribe(new Y((Object) rVar, 0));
                return;
            case 1:
                C2105o0 c2105o0 = new C2105o0();
                c2105o0.f19576b = rVar;
                this.f19404a.subscribe(c2105o0);
                return;
            case 2:
                this.f19404a.subscribe(new C2105o0(rVar, 1));
                return;
            case 3:
                this.f19404a.subscribe(new C2105o0(rVar, 2));
                return;
            case 4:
                try {
                    throw null;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th2) {
                    of.p.F(th2);
                    S1.s.r(th2);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                    nullPointerException.initCause(th2);
                    throw nullPointerException;
                }
            case 5:
                this.f19404a.subscribe(new C2105o0(rVar, 3));
                return;
            case 6:
                C1487c c1487c = new C1487c();
                rVar.onSubscribe(c1487c);
                O1 o12 = new O1(rVar, c1487c, this.f19404a);
                if (o12.getAndIncrement() == 0) {
                    int iAddAndGet = 1;
                    do {
                        o12.c.subscribe(o12);
                        iAddAndGet = o12.addAndGet(-iAddAndGet);
                    } while (iAddAndGet != 0);
                    return;
                }
                return;
            case 7:
                this.f19404a.subscribe(new C2479c(rVar));
                return;
            default:
                this.f19404a.subscribe(new C2098m1(rVar, 1));
                return;
        }
    }
}
