package ph;

import fh.C1487c;
import ih.EnumC1605c;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import o6.C1967a;
import wh.AbstractC2439a;

/* JADX INFO: renamed from: ph.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2112q extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19600b;
    public final Object c;

    public /* synthetic */ C2112q(int i, Object obj, Object obj2) {
        this.f19599a = i;
        this.f19600b = obj;
        this.c = obj2;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        int length;
        switch (this.f19599a) {
            case 0:
                ch.p[] pVarArr = (ch.p[]) this.f19600b;
                if (pVarArr == null) {
                    pVarArr = new ch.p[8];
                    try {
                        length = 0;
                        for (ch.p pVar : (Iterable) this.c) {
                            if (pVar == null) {
                                EnumC1605c.c(new NullPointerException("One of the sources is null"), rVar);
                            } else {
                                if (length == pVarArr.length) {
                                    ch.p[] pVarArr2 = new ch.p[(length >> 2) + length];
                                    System.arraycopy(pVarArr, 0, pVarArr2, 0, length);
                                    pVarArr = pVarArr2;
                                }
                                int i = length + 1;
                                pVarArr[length] = pVar;
                                length = i;
                            }
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
                    EnumC1605c.a(rVar);
                    break;
                } else if (length == 1) {
                    pVarArr[0].subscribe(rVar);
                    break;
                } else {
                    C2104o c2104o = new C2104o(rVar, length);
                    C2108p[] c2108pArr = c2104o.f19574b;
                    int length2 = c2108pArr.length;
                    int i4 = 0;
                    while (true) {
                        ch.r rVar2 = c2104o.f19573a;
                        if (i4 < length2) {
                            int i6 = i4 + 1;
                            c2108pArr[i4] = new C2108p(c2104o, i6, rVar2);
                            i4 = i6;
                        } else {
                            AtomicInteger atomicInteger = c2104o.c;
                            atomicInteger.lazySet(0);
                            rVar2.onSubscribe(c2104o);
                            for (int i10 = 0; i10 < length2 && atomicInteger.get() == 0; i10++) {
                                pVarArr[i10].subscribe(c2108pArr[i10]);
                            }
                        }
                    }
                }
                break;
            case 1:
                C1487c c1487c = new C1487c();
                rVar.onSubscribe(c1487c);
                ((ch.p) this.c).subscribe(new C2097m0(this, c1487c, rVar));
                break;
            case 2:
                try {
                    Object objCall = ((Callable) this.f19600b).call();
                    jh.e.b(objCall, "The connectableFactory returned a null ConnectableObservable");
                    AbstractC2439a abstractC2439a = (AbstractC2439a) objCall;
                    Object objApply = ((hh.n) this.c).apply(abstractC2439a);
                    jh.e.b(objApply, "The selector returned a null ObservableSource");
                    ch.p pVar2 = (ch.p) objApply;
                    A2 a22 = new A2(rVar, 1);
                    pVar2.subscribe(a22);
                    abstractC2439a.d(new C1967a(a22, 6));
                } catch (Throwable th3) {
                    of.p.F(th3);
                    EnumC1605c.c(th3, rVar);
                    return;
                }
                break;
            default:
                try {
                    Object objApply2 = ((hh.n) this.c).apply(this.f19600b);
                    jh.e.b(objApply2, "The mapper returned a null ObservableSource");
                    ch.p pVar3 = (ch.p) objApply2;
                    if (!(pVar3 instanceof Callable)) {
                        pVar3.subscribe(rVar);
                    } else {
                        try {
                            Object objCall2 = ((Callable) pVar3).call();
                            if (objCall2 == null) {
                                EnumC1605c.a(rVar);
                            } else {
                                RunnableC2103n2 runnableC2103n2 = new RunnableC2103n2(rVar, objCall2);
                                rVar.onSubscribe(runnableC2103n2);
                                runnableC2103n2.run();
                            }
                        } catch (Throwable th4) {
                            of.p.F(th4);
                            EnumC1605c.c(th4, rVar);
                            return;
                        }
                    }
                } catch (Throwable th5) {
                    EnumC1605c.c(th5, rVar);
                    return;
                }
                break;
        }
    }
}
