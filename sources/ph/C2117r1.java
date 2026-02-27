package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import oh.C1979a;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: ph.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2117r1 extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19616b;
    public final AtomicReference c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f19617d;
    public volatile rh.c e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19618g;
    public volatile boolean h;
    public volatile int i;
    public final AtomicReference j;

    public C2117r1(ch.r rVar, int i) {
        this.f19615a = i;
        switch (i) {
            case 1:
                this.f19616b = rVar;
                this.c = new AtomicReference();
                this.j = new C1979a(this, 5);
                this.f19617d = new Qh.c();
                break;
            default:
                this.f19616b = rVar;
                this.c = new AtomicReference();
                this.j = new C1979a(this, 4);
                this.f19617d = new Qh.c();
                break;
        }
    }

    public final void a() {
        switch (this.f19615a) {
            case 0:
                ch.r rVar = this.f19616b;
                int iAddAndGet = 1;
                while (!this.f19618g) {
                    if (this.f19617d.get() == null) {
                        int i = this.i;
                        if (i == 1) {
                            Object obj = this.f;
                            this.f = null;
                            this.i = 2;
                            rVar.onNext(obj);
                            i = 2;
                        }
                        boolean z4 = this.h;
                        rh.c cVar = this.e;
                        Object objPoll = cVar != null ? cVar.poll() : null;
                        boolean z5 = objPoll == null;
                        if (z4 && z5 && i == 2) {
                            this.e = null;
                            rVar.onComplete();
                            break;
                        } else if (z5) {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                break;
                            }
                        } else {
                            rVar.onNext(objPoll);
                        }
                    } else {
                        this.f = null;
                        this.e = null;
                        Qh.c cVar2 = this.f19617d;
                        cVar2.getClass();
                        rVar.onError(AbstractC2353d.b(cVar2));
                        break;
                    }
                }
                this.f = null;
                this.e = null;
                break;
            default:
                ch.r rVar2 = this.f19616b;
                int iAddAndGet2 = 1;
                while (!this.f19618g) {
                    if (this.f19617d.get() == null) {
                        int i4 = this.i;
                        if (i4 == 1) {
                            Object obj2 = this.f;
                            this.f = null;
                            this.i = 2;
                            rVar2.onNext(obj2);
                            i4 = 2;
                        }
                        boolean z8 = this.h;
                        rh.c cVar3 = this.e;
                        Object objPoll2 = cVar3 != null ? cVar3.poll() : null;
                        boolean z9 = objPoll2 == null;
                        if (z8 && z9 && i4 == 2) {
                            this.e = null;
                            rVar2.onComplete();
                            break;
                        } else if (z9) {
                            iAddAndGet2 = addAndGet(-iAddAndGet2);
                            if (iAddAndGet2 == 0) {
                                break;
                            }
                        } else {
                            rVar2.onNext(objPoll2);
                        }
                    } else {
                        this.f = null;
                        this.e = null;
                        Qh.c cVar4 = this.f19617d;
                        cVar4.getClass();
                        rVar2.onError(AbstractC2353d.b(cVar4));
                        break;
                    }
                }
                this.f = null;
                this.e = null;
                break;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19615a) {
            case 0:
                this.f19618g = true;
                EnumC1604b.a(this.c);
                EnumC1604b.a((C1979a) this.j);
                if (getAndIncrement() == 0) {
                    this.e = null;
                    this.f = null;
                }
                break;
            default:
                this.f19618g = true;
                EnumC1604b.a(this.c);
                EnumC1604b.a((C1979a) this.j);
                if (getAndIncrement() == 0) {
                    this.e = null;
                    this.f = null;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19615a) {
            case 0:
                this.h = true;
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
            default:
                this.h = true;
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19615a) {
            case 0:
                Qh.c cVar = this.f19617d;
                cVar.getClass();
                if (!AbstractC2353d.a(cVar, th2)) {
                    S1.s.r(th2);
                } else {
                    EnumC1604b.a((C1979a) this.j);
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
            default:
                Qh.c cVar2 = this.f19617d;
                cVar2.getClass();
                if (!AbstractC2353d.a(cVar2, th2)) {
                    S1.s.r(th2);
                } else {
                    EnumC1604b.a((C1979a) this.j);
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19615a) {
            case 0:
                if (compareAndSet(0, 1)) {
                    this.f19616b.onNext(obj);
                    if (decrementAndGet() == 0) {
                    }
                } else {
                    rh.c cVar = this.e;
                    if (cVar == null) {
                        cVar = new rh.c(ch.l.bufferSize());
                        this.e = cVar;
                    }
                    cVar.offer(obj);
                    if (getAndIncrement() != 0) {
                    }
                }
                a();
                break;
            default:
                if (compareAndSet(0, 1)) {
                    this.f19616b.onNext(obj);
                    if (decrementAndGet() == 0) {
                    }
                } else {
                    rh.c cVar2 = this.e;
                    if (cVar2 == null) {
                        cVar2 = new rh.c(ch.l.bufferSize());
                        this.e = cVar2;
                    }
                    cVar2.offer(obj);
                    if (getAndIncrement() != 0) {
                    }
                }
                a();
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19615a) {
            case 0:
                EnumC1604b.e(this.c, interfaceC1486b);
                break;
            default:
                EnumC1604b.e(this.c, interfaceC1486b);
                break;
        }
    }
}
