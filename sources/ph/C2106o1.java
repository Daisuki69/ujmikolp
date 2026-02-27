package ph;

import lh.C1836g;
import pg.C2038a;

/* JADX INFO: renamed from: ph.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2106o1 extends ch.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19578b;
    public final Object c;

    public /* synthetic */ C2106o1(int i, Object obj, Object obj2) {
        this.f19577a = i;
        this.f19578b = obj;
        this.c = obj2;
    }

    @Override // ch.w
    public final void d(ch.x xVar) {
        switch (this.f19577a) {
            case 0:
                ((ch.l) this.f19578b).subscribe(new C1836g(xVar, this.c));
                break;
            case 1:
                ((ch.l) this.f19578b).subscribe(new J(xVar, this.c));
                break;
            default:
                ((ch.w) this.f19578b).c(new C2038a(7, xVar, (com.paymaya.domain.store.L) this.c, false));
                break;
        }
    }
}
