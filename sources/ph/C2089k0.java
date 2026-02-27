package ph;

import java.util.concurrent.TimeUnit;
import xh.C2479c;

/* JADX INFO: renamed from: ph.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2089k0 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19527b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f19528d;
    public final ch.v e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2089k0(int i, long j, ch.l lVar, ch.v vVar, TimeUnit timeUnit, boolean z4) {
        super(lVar);
        this.f19527b = i;
        this.c = j;
        this.f19528d = timeUnit;
        this.e = vVar;
        this.f = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19527b) {
            case 0:
                ch.r c2479c = this.f ? rVar : new C2479c(rVar);
                this.f19404a.subscribe(new C2085j0(c2479c, this.c, this.f19528d, this.e.b(), this.f));
                break;
            case 1:
                C2479c c2479c2 = new C2479c(rVar);
                ch.v vVar = this.e;
                TimeUnit timeUnit = this.f19528d;
                boolean z4 = this.f;
                ch.p pVar = this.f19404a;
                if (!z4) {
                    pVar.subscribe(new C2083i2(c2479c2, this.c, timeUnit, vVar));
                } else {
                    pVar.subscribe(new C2079h2(c2479c2, this.c, timeUnit, vVar));
                }
                break;
            default:
                this.f19404a.subscribe(new K2(rVar, this.c, this.f19528d, this.e.b(), this.f));
                break;
        }
    }
}
