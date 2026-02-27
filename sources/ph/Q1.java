package ph;

import a.AbstractC0617a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class Q1 extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19315b;
    public final AtomicInteger c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f19316d;
    public final Wh.c e;
    public final AtomicReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ch.p f19317g;
    public volatile boolean h;
    public final AtomicReference i;

    public Q1(ch.r rVar, Wh.c cVar, ch.p pVar, int i) {
        this.f19314a = i;
        switch (i) {
            case 1:
                this.f19315b = rVar;
                this.e = cVar;
                this.f19317g = pVar;
                this.c = new AtomicInteger();
                this.f19316d = new Qh.c();
                this.i = new P1(this, 1);
                this.f = new AtomicReference();
                break;
            default:
                this.f19315b = rVar;
                this.e = cVar;
                this.f19317g = pVar;
                this.c = new AtomicInteger();
                this.f19316d = new Qh.c();
                this.i = new P1(this, 0);
                this.f = new AtomicReference();
                break;
        }
    }

    public final boolean a() {
        switch (this.f19314a) {
        }
        return EnumC1604b.b((InterfaceC1486b) this.f.get());
    }

    public final void b() {
        switch (this.f19314a) {
            case 0:
                if (this.c.getAndIncrement() == 0) {
                    while (!a()) {
                        if (!this.h) {
                            this.h = true;
                            this.f19317g.subscribe(this);
                        }
                        if (this.c.decrementAndGet() == 0) {
                            break;
                        }
                    }
                }
                break;
            default:
                if (this.c.getAndIncrement() == 0) {
                    while (!a()) {
                        if (!this.h) {
                            this.h = true;
                            this.f19317g.subscribe(this);
                        }
                        if (this.c.decrementAndGet() == 0) {
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19314a) {
            case 0:
                EnumC1604b.a(this.f);
                EnumC1604b.a((P1) this.i);
                break;
            default:
                EnumC1604b.a(this.f);
                EnumC1604b.a((P1) this.i);
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19314a) {
            case 0:
                EnumC1604b.c(this.f, null);
                this.h = false;
                this.e.onNext(0);
                break;
            default:
                EnumC1604b.a((P1) this.i);
                AbstractC0617a.H(this.f19315b, this, this.f19316d);
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19314a) {
            case 0:
                EnumC1604b.a((P1) this.i);
                AbstractC0617a.I(this.f19315b, th2, this, this.f19316d);
                break;
            default:
                EnumC1604b.c(this.f, null);
                this.h = false;
                this.e.onNext(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19314a) {
            case 0:
                AbstractC0617a.J(this.f19315b, obj, this, this.f19316d);
                break;
            default:
                AbstractC0617a.J(this.f19315b, obj, this, this.f19316d);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19314a) {
            case 0:
                EnumC1604b.e(this.f, interfaceC1486b);
                break;
            default:
                EnumC1604b.c(this.f, interfaceC1486b);
                break;
        }
    }
}
