package xh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;
import io.reactivex.exceptions.CompositeException;
import of.p;

/* JADX INFO: renamed from: xh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2478b implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f20996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1486b f20997b;
    public boolean c;

    public C2478b(r rVar) {
        this.f20996a = rVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f20997b.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.c) {
            return;
        }
        this.c = true;
        InterfaceC1486b interfaceC1486b = this.f20997b;
        r rVar = this.f20996a;
        if (interfaceC1486b != null) {
            try {
                rVar.onComplete();
                return;
            } catch (Throwable th2) {
                p.F(th2);
                s.r(th2);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            rVar.onSubscribe(EnumC1605c.f17149a);
            try {
                rVar.onError(nullPointerException);
            } catch (Throwable th3) {
                p.F(th3);
                s.r(new CompositeException(nullPointerException, th3));
            }
        } catch (Throwable th4) {
            p.F(th4);
            s.r(new CompositeException(nullPointerException, th4));
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.c) {
            s.r(th2);
            return;
        }
        this.c = true;
        InterfaceC1486b interfaceC1486b = this.f20997b;
        r rVar = this.f20996a;
        if (interfaceC1486b != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                rVar.onError(th2);
                return;
            } catch (Throwable th3) {
                p.F(th3);
                s.r(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            rVar.onSubscribe(EnumC1605c.f17149a);
            try {
                rVar.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                p.F(th4);
                s.r(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            p.F(th5);
            s.r(new CompositeException(th2, nullPointerException, th5));
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.c) {
            return;
        }
        InterfaceC1486b interfaceC1486b = this.f20997b;
        r rVar = this.f20996a;
        if (interfaceC1486b == null) {
            this.c = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                rVar.onSubscribe(EnumC1605c.f17149a);
                try {
                    rVar.onError(nullPointerException);
                    return;
                } catch (Throwable th2) {
                    p.F(th2);
                    s.r(new CompositeException(nullPointerException, th2));
                    return;
                }
            } catch (Throwable th3) {
                p.F(th3);
                s.r(new CompositeException(nullPointerException, th3));
                return;
            }
        }
        if (obj == null) {
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f20997b.dispose();
                onError(nullPointerException2);
                return;
            } catch (Throwable th4) {
                p.F(th4);
                onError(new CompositeException(nullPointerException2, th4));
                return;
            }
        }
        try {
            rVar.onNext(obj);
        } catch (Throwable th5) {
            p.F(th5);
            try {
                this.f20997b.dispose();
                onError(th5);
            } catch (Throwable th6) {
                p.F(th6);
                onError(new CompositeException(th5, th6));
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f20997b, interfaceC1486b)) {
            this.f20997b = interfaceC1486b;
            try {
                this.f20996a.onSubscribe(this);
            } catch (Throwable th2) {
                p.F(th2);
                this.c = true;
                try {
                    interfaceC1486b.dispose();
                    s.r(th2);
                } catch (Throwable th3) {
                    p.F(th3);
                    s.r(new CompositeException(th2, th3));
                }
            }
        }
    }
}
