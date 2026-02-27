package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.InterfaceC1606d;
import java.util.concurrent.TimeUnit;
import wh.AbstractC2439a;

/* JADX INFO: loaded from: classes4.dex */
public final class L1 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2439a f19259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19260b;
    public J1 c;

    public L1(AbstractC2439a abstractC2439a) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f19259a = abstractC2439a;
        this.f19260b = 1;
    }

    public final void d(J1 j12) {
        synchronized (this) {
            try {
                if (this.f19259a instanceof C2149z1) {
                    J1 j13 = this.c;
                    if (j13 != null && j13 == j12) {
                        this.c = null;
                        j12.getClass();
                    }
                    long j = j12.f19233b - 1;
                    j12.f19233b = j;
                    if (j == 0) {
                        ch.p pVar = this.f19259a;
                        if (pVar instanceof InterfaceC1486b) {
                            ((InterfaceC1486b) pVar).dispose();
                        } else if (pVar instanceof InterfaceC1606d) {
                            ((InterfaceC1606d) pVar).a((InterfaceC1486b) j12.get());
                        }
                    }
                } else {
                    J1 j14 = this.c;
                    if (j14 != null && j14 == j12) {
                        j12.getClass();
                        long j6 = j12.f19233b - 1;
                        j12.f19233b = j6;
                        if (j6 == 0) {
                            this.c = null;
                            ch.p pVar2 = this.f19259a;
                            if (pVar2 instanceof InterfaceC1486b) {
                                ((InterfaceC1486b) pVar2).dispose();
                            } else if (pVar2 instanceof InterfaceC1606d) {
                                ((InterfaceC1606d) pVar2).a((InterfaceC1486b) j12.get());
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(J1 j12) {
        synchronized (this) {
            try {
                if (j12.f19233b == 0 && j12 == this.c) {
                    this.c = null;
                    InterfaceC1486b interfaceC1486b = (InterfaceC1486b) j12.get();
                    EnumC1604b.a(j12);
                    ch.p pVar = this.f19259a;
                    if (pVar instanceof InterfaceC1486b) {
                        ((InterfaceC1486b) pVar).dispose();
                    } else if (pVar instanceof InterfaceC1606d) {
                        if (interfaceC1486b == null) {
                            j12.f19234d = true;
                        } else {
                            ((InterfaceC1606d) pVar).a(interfaceC1486b);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        J1 j12;
        boolean z4;
        synchronized (this) {
            try {
                j12 = this.c;
                if (j12 == null) {
                    j12 = new J1(this);
                    this.c = j12;
                }
                long j = j12.f19233b + 1;
                j12.f19233b = j;
                if (j12.c || j != this.f19260b) {
                    z4 = false;
                } else {
                    z4 = true;
                    j12.c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f19259a.subscribe(new K1(rVar, this, j12));
        if (z4) {
            this.f19259a.d(j12);
        }
    }
}
