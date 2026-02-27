package ph;

import fh.InterfaceC1486b;
import hh.InterfaceC1571d;
import ih.C1603a;
import java.util.concurrent.atomic.AtomicInteger;
import n3.C1916a;

/* JADX INFO: renamed from: ph.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2111p2 extends AtomicInteger implements InterfaceC1486b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1571d f19594b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.p f19595d;
    public final ch.p e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f19596g;
    public Object h;
    public final Object i;
    public final ch.r[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19593a = 0;
    public final C1603a c = new C1603a(2);

    public C2111p2(ch.r rVar, int i, ch.p pVar, ch.p pVar2, InterfaceC1571d interfaceC1571d) {
        this.i = rVar;
        this.f19595d = pVar;
        this.e = pVar2;
        this.f19594b = interfaceC1571d;
        this.j = new C2115q2[]{new C2115q2(this, 0, i), new C2115q2(this, 1, i)};
    }

    public final void a() {
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        switch (this.f19593a) {
            case 0:
                if (getAndIncrement() == 0) {
                    C2115q2[] c2115q2Arr = (C2115q2[]) this.j;
                    C2115q2 c2115q2 = c2115q2Arr[0];
                    rh.c cVar = c2115q2.f19606b;
                    C2115q2 c2115q22 = c2115q2Arr[1];
                    rh.c cVar2 = c2115q22.f19606b;
                    int iAddAndGet = 1;
                    while (!this.f) {
                        boolean z4 = c2115q2.f19607d;
                        if (z4 && (th3 = c2115q2.e) != null) {
                            this.f = true;
                            cVar.clear();
                            cVar2.clear();
                            ((ch.r) this.i).onError(th3);
                        } else {
                            boolean z5 = c2115q22.f19607d;
                            if (z5 && (th2 = c2115q22.e) != null) {
                                this.f = true;
                                cVar.clear();
                                cVar2.clear();
                                ((ch.r) this.i).onError(th2);
                            } else {
                                if (this.f19596g == null) {
                                    this.f19596g = cVar.poll();
                                }
                                boolean z8 = this.f19596g == null;
                                if (this.h == null) {
                                    this.h = cVar2.poll();
                                }
                                Object obj = this.h;
                                boolean z9 = obj == null;
                                if (z4 && z5 && z8 && z9) {
                                    ((ch.r) this.i).onNext(Boolean.TRUE);
                                    ((ch.r) this.i).onComplete();
                                } else if (z4 && z5 && z8 != z9) {
                                    this.f = true;
                                    cVar.clear();
                                    cVar2.clear();
                                    ((ch.r) this.i).onNext(Boolean.FALSE);
                                    ((ch.r) this.i).onComplete();
                                } else {
                                    if (!z8 && !z9) {
                                        try {
                                            InterfaceC1571d interfaceC1571d = this.f19594b;
                                            Object obj2 = this.f19596g;
                                            ((C1916a) interfaceC1571d).getClass();
                                            if (!jh.e.a(obj2, obj)) {
                                                this.f = true;
                                                cVar.clear();
                                                cVar2.clear();
                                                ((ch.r) this.i).onNext(Boolean.FALSE);
                                                ((ch.r) this.i).onComplete();
                                            } else {
                                                this.f19596g = null;
                                                this.h = null;
                                            }
                                        } catch (Throwable th6) {
                                            of.p.F(th6);
                                            this.f = true;
                                            cVar.clear();
                                            cVar2.clear();
                                            ((ch.r) this.i).onError(th6);
                                            return;
                                        }
                                    }
                                    if (z8 || z9) {
                                        iAddAndGet = addAndGet(-iAddAndGet);
                                        if (iAddAndGet == 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    cVar.clear();
                    cVar2.clear();
                    break;
                }
                break;
            default:
                if (getAndIncrement() == 0) {
                    C2115q2[] c2115q2Arr2 = (C2115q2[]) this.j;
                    C2115q2 c2115q23 = c2115q2Arr2[0];
                    rh.c cVar3 = c2115q23.f19606b;
                    C2115q2 c2115q24 = c2115q2Arr2[1];
                    rh.c cVar4 = c2115q24.f19606b;
                    int iAddAndGet2 = 1;
                    while (!this.f) {
                        boolean z10 = c2115q23.f19607d;
                        if (z10 && (th5 = c2115q23.e) != null) {
                            this.f = true;
                            cVar3.clear();
                            cVar4.clear();
                            ((ch.x) this.i).onError(th5);
                        } else {
                            boolean z11 = c2115q24.f19607d;
                            if (z11 && (th4 = c2115q24.e) != null) {
                                this.f = true;
                                cVar3.clear();
                                cVar4.clear();
                                ((ch.x) this.i).onError(th4);
                            } else {
                                if (this.f19596g == null) {
                                    this.f19596g = cVar3.poll();
                                }
                                boolean z12 = this.f19596g == null;
                                if (this.h == null) {
                                    this.h = cVar4.poll();
                                }
                                Object obj3 = this.h;
                                boolean z13 = obj3 == null;
                                if (z10 && z11 && z12 && z13) {
                                    ((ch.x) this.i).onSuccess(Boolean.TRUE);
                                } else if (z10 && z11 && z12 != z13) {
                                    this.f = true;
                                    cVar3.clear();
                                    cVar4.clear();
                                    ((ch.x) this.i).onSuccess(Boolean.FALSE);
                                } else {
                                    if (!z12 && !z13) {
                                        try {
                                            InterfaceC1571d interfaceC1571d2 = this.f19594b;
                                            Object obj4 = this.f19596g;
                                            ((C1916a) interfaceC1571d2).getClass();
                                            if (!jh.e.a(obj4, obj3)) {
                                                this.f = true;
                                                cVar3.clear();
                                                cVar4.clear();
                                                ((ch.x) this.i).onSuccess(Boolean.FALSE);
                                            } else {
                                                this.f19596g = null;
                                                this.h = null;
                                            }
                                        } catch (Throwable th7) {
                                            of.p.F(th7);
                                            this.f = true;
                                            cVar3.clear();
                                            cVar4.clear();
                                            ((ch.x) this.i).onError(th7);
                                            return;
                                        }
                                    }
                                    if (z12 || z13) {
                                        iAddAndGet2 = addAndGet(-iAddAndGet2);
                                        if (iAddAndGet2 == 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    cVar3.clear();
                    cVar4.clear();
                    break;
                }
                break;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19593a) {
            case 0:
                if (!this.f) {
                    this.f = true;
                    this.c.dispose();
                    if (getAndIncrement() == 0) {
                        C2115q2[] c2115q2Arr = (C2115q2[]) this.j;
                        c2115q2Arr[0].f19606b.clear();
                        c2115q2Arr[1].f19606b.clear();
                    }
                }
                break;
            default:
                if (!this.f) {
                    this.f = true;
                    this.c.dispose();
                    if (getAndIncrement() == 0) {
                        C2115q2[] c2115q2Arr2 = (C2115q2[]) this.j;
                        c2115q2Arr2[0].f19606b.clear();
                        c2115q2Arr2[1].f19606b.clear();
                    }
                }
                break;
        }
    }

    public C2111p2(ch.x xVar, int i, ch.p pVar, ch.p pVar2, InterfaceC1571d interfaceC1571d) {
        this.i = xVar;
        this.f19595d = pVar;
        this.e = pVar2;
        this.f19594b = interfaceC1571d;
        this.j = new C2115q2[]{new C2115q2(this, 0, i, (byte) 0), new C2115q2(this, 1, i, (byte) 0)};
    }
}
