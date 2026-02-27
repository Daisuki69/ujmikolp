package lh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import hh.InterfaceC1568a;
import hh.InterfaceC1570c;
import hh.InterfaceC1573f;
import ih.EnumC1604b;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import of.p;
import xh.C2479c;

/* JADX INFO: renamed from: lh.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1840k extends AtomicReference implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18318b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18319d;
    public final Object e;

    public C1840k(InterfaceC1573f interfaceC1573f, InterfaceC1573f interfaceC1573f2, InterfaceC1568a interfaceC1568a, InterfaceC1573f interfaceC1573f3) {
        this.f18317a = 0;
        this.f18318b = interfaceC1573f;
        this.c = interfaceC1573f2;
        this.e = interfaceC1568a;
        this.f18319d = interfaceC1573f3;
    }

    public boolean a() {
        return get() == EnumC1604b.f17147a;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f18317a) {
            case 0:
                EnumC1604b.a(this);
                break;
            default:
                EnumC1604b.a((AtomicReference) this.f18319d);
                EnumC1604b.a((AtomicReference) this.e);
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f18317a) {
            case 0:
                if (!a()) {
                    lazySet(EnumC1604b.f17147a);
                    try {
                        ((InterfaceC1568a) this.e).run();
                    } catch (Throwable th2) {
                        p.F(th2);
                        s.r(th2);
                        return;
                    }
                }
                break;
            default:
                EnumC1604b.a((AtomicReference) this.e);
                ((C2479c) this.f18318b).onComplete();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f18317a) {
            case 0:
                if (a()) {
                    s.r(th2);
                } else {
                    lazySet(EnumC1604b.f17147a);
                    try {
                        ((InterfaceC1573f) this.c).accept(th2);
                    } catch (Throwable th3) {
                        p.F(th3);
                        s.r(new CompositeException(th2, th3));
                        return;
                    }
                }
                break;
            default:
                EnumC1604b.a((AtomicReference) this.e);
                ((C2479c) this.f18318b).onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f18317a) {
            case 0:
                if (!a()) {
                    try {
                        ((InterfaceC1573f) this.f18318b).accept(obj);
                    } catch (Throwable th2) {
                        p.F(th2);
                        ((InterfaceC1486b) get()).dispose();
                        onError(th2);
                        return;
                    }
                }
                break;
            default:
                C2479c c2479c = (C2479c) this.f18318b;
                Object obj2 = get();
                if (obj2 != null) {
                    try {
                        Object objA = ((InterfaceC1570c) this.c).a(obj, obj2);
                        jh.e.b(objA, "The combiner returned a null value");
                        c2479c.onNext(objA);
                    } catch (Throwable th3) {
                        p.F(th3);
                        dispose();
                        c2479c.onError(th3);
                    }
                }
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f18317a) {
            case 0:
                if (EnumC1604b.e(this, interfaceC1486b)) {
                    try {
                        ((InterfaceC1573f) this.f18319d).accept(this);
                    } catch (Throwable th2) {
                        p.F(th2);
                        interfaceC1486b.dispose();
                        onError(th2);
                        return;
                    }
                }
                break;
            default:
                EnumC1604b.e((AtomicReference) this.f18319d, interfaceC1486b);
                break;
        }
    }

    public C1840k(C2479c c2479c, InterfaceC1570c interfaceC1570c) {
        this.f18317a = 1;
        this.f18319d = new AtomicReference();
        this.e = new AtomicReference();
        this.f18318b = c2479c;
        this.c = interfaceC1570c;
    }
}
