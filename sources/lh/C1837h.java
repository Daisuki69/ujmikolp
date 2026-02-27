package lh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import hh.InterfaceC1568a;
import hh.InterfaceC1573f;
import hh.o;
import ih.EnumC1604b;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import of.p;

/* JADX INFO: renamed from: lh.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1837h extends AtomicReference implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f18309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1573f f18310b;
    public final InterfaceC1568a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18311d;

    public C1837h(o oVar, InterfaceC1573f interfaceC1573f, InterfaceC1568a interfaceC1568a) {
        this.f18309a = oVar;
        this.f18310b = interfaceC1573f;
        this.c = interfaceC1568a;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f18311d) {
            return;
        }
        this.f18311d = true;
        try {
            this.c.run();
        } catch (Throwable th2) {
            p.F(th2);
            s.r(th2);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f18311d) {
            s.r(th2);
            return;
        }
        this.f18311d = true;
        try {
            this.f18310b.accept(th2);
        } catch (Throwable th3) {
            p.F(th3);
            s.r(new CompositeException(th2, th3));
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f18311d) {
            return;
        }
        try {
            if (this.f18309a.test(obj)) {
                return;
            }
            EnumC1604b.a(this);
            onComplete();
        } catch (Throwable th2) {
            p.F(th2);
            EnumC1604b.a(this);
            onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }
}
