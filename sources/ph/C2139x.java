package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2139x extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19679b;
    public final hh.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19680d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2139x(ch.l lVar, ch.p pVar, hh.n nVar, Object obj, int i) {
        super(lVar);
        this.f19679b = i;
        this.e = pVar;
        this.c = nVar;
        this.f19680d = obj;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        int length;
        switch (this.f19679b) {
            case 0:
                C2131v c2131v = new C2131v(rVar, (ch.p) this.e, this.c, (Callable) this.f19680d);
                rVar.onSubscribe(c2131v);
                this.f19404a.subscribe(c2131v);
                break;
            case 1:
                this.f19404a.subscribe(new C2110p1(rVar, this.c, (hh.n) this.e, (Callable) this.f19680d));
                break;
            case 2:
                ch.p pVar = this.f19404a;
                ch.p pVar2 = (ch.p) this.e;
                hh.n nVar = this.c;
                ch.p pVar3 = (ch.p) this.f19680d;
                if (pVar3 == null) {
                    N2 n22 = new N2(rVar, nVar);
                    rVar.onSubscribe(n22);
                    if (pVar2 != null) {
                        C2135w c2135w = new C2135w(0L, n22);
                        C1487c c1487c = n22.c;
                        c1487c.getClass();
                        if (EnumC1604b.c(c1487c, c2135w)) {
                            pVar2.subscribe(c2135w);
                        }
                    }
                    pVar.subscribe(n22);
                } else {
                    M2 m2 = new M2(pVar3, rVar, nVar);
                    rVar.onSubscribe(m2);
                    if (pVar2 != null) {
                        C2135w c2135w2 = new C2135w(0L, m2);
                        C1487c c1487c2 = m2.c;
                        c1487c2.getClass();
                        if (EnumC1604b.c(c1487c2, c2135w2)) {
                            pVar2.subscribe(c2135w2);
                        }
                    }
                    pVar.subscribe(m2);
                }
                break;
            default:
                ch.p[] pVarArr = (ch.p[]) this.f19680d;
                if (pVarArr == null) {
                    pVarArr = new ch.p[8];
                    try {
                        length = 0;
                        for (ch.p pVar4 : (Iterable) this.e) {
                            if (length == pVarArr.length) {
                                pVarArr = (ch.p[]) Arrays.copyOf(pVarArr, (length >> 1) + length);
                            }
                            int i = length + 1;
                            pVarArr[length] = pVar4;
                            length = i;
                        }
                    } catch (Throwable th2) {
                        of.p.F(th2);
                        EnumC1605c.c(th2, rVar);
                        return;
                    }
                } else {
                    length = pVarArr.length;
                }
                if (length == 0) {
                    this.f19404a.subscribe(new C2116r0(rVar, new com.paymaya.domain.store.M(this, 29), 2));
                } else {
                    o3 o3Var = new o3(rVar, this.c, length);
                    rVar.onSubscribe(o3Var);
                    p3[] p3VarArr = o3Var.c;
                    AtomicReference atomicReference = o3Var.e;
                    for (int i4 = 0; i4 < length && !EnumC1604b.b((InterfaceC1486b) atomicReference.get()) && !o3Var.f19585g; i4++) {
                        pVarArr[i4].subscribe(p3VarArr[i4]);
                    }
                    this.f19404a.subscribe(o3Var);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139x(ch.l lVar, hh.n nVar, hh.n nVar2, Callable callable) {
        super(lVar);
        this.f19679b = 1;
        this.c = nVar;
        this.e = nVar2;
        this.f19680d = callable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139x(ch.l lVar, ch.p[] pVarArr, hh.n nVar) {
        super(lVar);
        this.f19679b = 3;
        this.f19680d = pVarArr;
        this.e = null;
        this.c = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139x(ch.l lVar, Iterable iterable, hh.n nVar) {
        super(lVar);
        this.f19679b = 3;
        this.f19680d = null;
        this.e = iterable;
        this.c = nVar;
    }
}
