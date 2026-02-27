package ph;

import bg.AbstractC0983W;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import pg.C2038a;
import xh.C2479c;

/* JADX INFO: renamed from: ph.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2147z extends lh.l implements InterfaceC1486b {
    public final /* synthetic */ int i = 1;
    public final Callable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC1486b f19698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Collection f19699l;
    public final Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f19700n;

    public C2147z(C2479c c2479c, Callable callable, ch.p pVar) {
        super(c2479c, new C2038a(9));
        this.j = callable;
        this.m = pVar;
    }

    private final void G() {
        synchronized (this) {
            try {
                Collection collection = this.f19699l;
                if (collection == null) {
                    return;
                }
                this.f19699l = null;
                this.e.offer(collection);
                this.f18321g = true;
                if (B()) {
                    AbstractC0983W.i(this.e, this.f18320d, this, this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void H(Object obj) {
        synchronized (this) {
            try {
                Collection collection = this.f19699l;
                if (collection == null) {
                    return;
                }
                collection.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lh.l
    public final void A(C2479c c2479c, Object obj) {
        switch (this.i) {
            case 0:
                this.f18320d.onNext((Collection) obj);
                break;
            default:
                this.f18320d.onNext((Collection) obj);
                break;
        }
    }

    public void F() {
        try {
            Object objCall = this.j.call();
            jh.e.b(objCall, "The buffer supplied is null");
            Collection collection = (Collection) objCall;
            try {
                Object objCall2 = ((Callable) this.m).call();
                jh.e.b(objCall2, "The boundary ObservableSource supplied is null");
                ch.p pVar = (ch.p) objCall2;
                C2143y c2143y = new C2143y(this, 0);
                if (EnumC1604b.c((AtomicReference) this.f19700n, c2143y)) {
                    synchronized (this) {
                        try {
                            Collection collection2 = this.f19699l;
                            if (collection2 == null) {
                                return;
                            }
                            this.f19699l = collection;
                            pVar.subscribe(c2143y);
                            D(collection2, this);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                of.p.F(th3);
                this.f = true;
                this.f19698k.dispose();
                this.f18320d.onError(th3);
            }
        } catch (Throwable th4) {
            of.p.F(th4);
            dispose();
            this.f18320d.onError(th4);
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.i) {
            case 0:
                if (!this.f) {
                    this.f = true;
                    this.f19698k.dispose();
                    EnumC1604b.a((AtomicReference) this.f19700n);
                    if (B()) {
                        this.e.clear();
                    }
                }
                break;
            default:
                if (!this.f) {
                    this.f = true;
                    ((C2045B) this.f19700n).dispose();
                    this.f19698k.dispose();
                    if (B()) {
                        this.e.clear();
                    }
                }
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.i) {
            case 0:
                G();
                return;
            default:
                synchronized (this) {
                    try {
                        Collection collection = this.f19699l;
                        if (collection == null) {
                            return;
                        }
                        this.f19699l = null;
                        this.e.offer(collection);
                        this.f18321g = true;
                        if (B()) {
                            AbstractC0983W.i(this.e, this.f18320d, this, this);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.i) {
            case 0:
                dispose();
                this.f18320d.onError(th2);
                break;
            default:
                dispose();
                this.f18320d.onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.i) {
            case 0:
                H(obj);
                return;
            default:
                synchronized (this) {
                    try {
                        Collection collection = this.f19699l;
                        if (collection == null) {
                            return;
                        }
                        collection.add(obj);
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.i) {
            case 0:
                if (EnumC1604b.f(this.f19698k, interfaceC1486b)) {
                    this.f19698k = interfaceC1486b;
                    C2479c c2479c = this.f18320d;
                    try {
                        Object objCall = this.j.call();
                        jh.e.b(objCall, "The buffer supplied is null");
                        this.f19699l = (Collection) objCall;
                        try {
                            Object objCall2 = ((Callable) this.m).call();
                            jh.e.b(objCall2, "The boundary ObservableSource supplied is null");
                            ch.p pVar = (ch.p) objCall2;
                            C2143y c2143y = new C2143y(this, 0);
                            ((AtomicReference) this.f19700n).set(c2143y);
                            c2479c.onSubscribe(this);
                            if (!this.f) {
                                pVar.subscribe(c2143y);
                            }
                        } catch (Throwable th2) {
                            of.p.F(th2);
                            this.f = true;
                            interfaceC1486b.dispose();
                            EnumC1605c.c(th2, c2479c);
                            return;
                        }
                    } catch (Throwable th3) {
                        of.p.F(th3);
                        this.f = true;
                        interfaceC1486b.dispose();
                        EnumC1605c.c(th3, c2479c);
                        return;
                    }
                }
                break;
            default:
                if (EnumC1604b.f(this.f19698k, interfaceC1486b)) {
                    this.f19698k = interfaceC1486b;
                    try {
                        Object objCall3 = this.j.call();
                        jh.e.b(objCall3, "The buffer supplied is null");
                        this.f19699l = (Collection) objCall3;
                        C2045B c2045b = new C2045B(this, 0);
                        this.f19700n = c2045b;
                        this.f18320d.onSubscribe(this);
                        if (!this.f) {
                            ((ch.p) this.m).subscribe(c2045b);
                        }
                    } catch (Throwable th4) {
                        of.p.F(th4);
                        this.f = true;
                        interfaceC1486b.dispose();
                        EnumC1605c.c(th4, this.f18320d);
                    }
                }
                break;
        }
    }

    public C2147z(C2479c c2479c, Callable callable, Callable callable2) {
        super(c2479c, new C2038a(9));
        this.f19700n = new AtomicReference();
        this.j = callable;
        this.m = callable2;
    }
}
