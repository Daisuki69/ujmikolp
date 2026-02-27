package ph;

import fh.InterfaceC1486b;
import hh.InterfaceC1573f;
import ih.EnumC1604b;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class W2 extends AtomicBoolean implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19369b;
    public final InterfaceC1573f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19370d;
    public InterfaceC1486b e;

    public W2(ch.r rVar, Object obj, InterfaceC1573f interfaceC1573f, boolean z4) {
        this.f19368a = rVar;
        this.f19369b = obj;
        this.c = interfaceC1573f;
        this.f19370d = z4;
    }

    public final void a() {
        if (compareAndSet(false, true)) {
            try {
                this.c.accept(this.f19369b);
            } catch (Throwable th2) {
                of.p.F(th2);
                S1.s.r(th2);
            }
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        a();
        this.e.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        boolean z4 = this.f19370d;
        ch.r rVar = this.f19368a;
        if (!z4) {
            rVar.onComplete();
            this.e.dispose();
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.c.accept(this.f19369b);
            } catch (Throwable th2) {
                of.p.F(th2);
                rVar.onError(th2);
                return;
            }
        }
        this.e.dispose();
        rVar.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        boolean z4 = this.f19370d;
        ch.r rVar = this.f19368a;
        if (!z4) {
            rVar.onError(th2);
            this.e.dispose();
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.c.accept(this.f19369b);
            } catch (Throwable th3) {
                of.p.F(th3);
                th2 = new CompositeException(th2, th3);
            }
        }
        this.e.dispose();
        rVar.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19368a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.e, interfaceC1486b)) {
            this.e = interfaceC1486b;
            this.f19368a.onSubscribe(this);
        }
    }
}
