package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class q3 extends AtomicInteger implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19609b;
    public final r3[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f19610d;
    public final boolean e;
    public volatile boolean f;

    public q3(int i, ch.r rVar, hh.n nVar, boolean z4) {
        this.f19608a = rVar;
        this.f19609b = nVar;
        this.c = new r3[i];
        this.f19610d = new Object[i];
        this.e = z4;
    }

    public final void a() {
        r3[] r3VarArr = this.c;
        for (r3 r3Var : r3VarArr) {
            r3Var.f19623b.clear();
        }
        for (r3 r3Var2 : r3VarArr) {
            EnumC1604b.a(r3Var2.e);
        }
    }

    public final void b() {
        Throwable th2;
        if (getAndIncrement() != 0) {
            return;
        }
        r3[] r3VarArr = this.c;
        ch.r rVar = this.f19608a;
        Object[] objArr = this.f19610d;
        boolean z4 = this.e;
        int iAddAndGet = 1;
        while (true) {
            int i = 0;
            int i4 = 0;
            for (r3 r3Var : r3VarArr) {
                if (objArr[i4] == null) {
                    boolean z5 = r3Var.c;
                    Object objPoll = r3Var.f19623b.poll();
                    boolean z8 = objPoll == null;
                    if (this.f) {
                        a();
                        return;
                    }
                    if (z5) {
                        if (!z4) {
                            Throwable th3 = r3Var.f19624d;
                            if (th3 != null) {
                                this.f = true;
                                a();
                                rVar.onError(th3);
                                return;
                            } else if (z8) {
                                this.f = true;
                                a();
                                rVar.onComplete();
                                return;
                            }
                        } else if (z8) {
                            Throwable th4 = r3Var.f19624d;
                            this.f = true;
                            a();
                            if (th4 != null) {
                                rVar.onError(th4);
                                return;
                            } else {
                                rVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (z8) {
                        i++;
                    } else {
                        objArr[i4] = objPoll;
                    }
                } else if (r3Var.c && !z4 && (th2 = r3Var.f19624d) != null) {
                    this.f = true;
                    a();
                    rVar.onError(th2);
                    return;
                }
                i4++;
            }
            if (i != 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    Object objApply = this.f19609b.apply(objArr.clone());
                    jh.e.b(objApply, "The zipper returned a null value");
                    rVar.onNext(objApply);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th5) {
                    of.p.F(th5);
                    a();
                    rVar.onError(th5);
                    return;
                }
            }
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f) {
            return;
        }
        this.f = true;
        for (r3 r3Var : this.c) {
            EnumC1604b.a(r3Var.e);
        }
        if (getAndIncrement() == 0) {
            for (r3 r3Var2 : this.c) {
                r3Var2.f19623b.clear();
            }
        }
    }
}
