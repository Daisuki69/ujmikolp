package ph;

import java.util.concurrent.TimeUnit;
import xh.C2479c;

/* JADX INFO: renamed from: ph.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2077h0 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19483b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f19484d;
    public final ch.v e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2077h0(int i, long j, ch.l lVar, ch.v vVar, TimeUnit timeUnit) {
        super(lVar);
        this.f19483b = i;
        this.c = j;
        this.f19484d = timeUnit;
        this.e = vVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19483b) {
            case 0:
                C2479c c2479c = new C2479c(rVar);
                ch.u uVarB = this.e.b();
                this.f19404a.subscribe(new C2073g0(c2479c, this.c, this.f19484d, uVarB));
                break;
            default:
                C2479c c2479c2 = new C2479c(rVar);
                ch.u uVarB2 = this.e.b();
                this.f19404a.subscribe(new J2(c2479c2, this.c, this.f19484d, uVarB2));
                break;
        }
    }
}
