package lh;

import S1.s;
import ch.r;
import ch.x;
import fh.InterfaceC1486b;
import hh.InterfaceC1568a;
import hh.InterfaceC1570c;
import hh.InterfaceC1573f;
import ih.EnumC1604b;
import ih.EnumC1605c;
import java.util.NoSuchElementException;
import of.p;

/* JADX INFO: renamed from: lh.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1836g implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1486b f18307b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18308d;
    public Object e;

    public /* synthetic */ C1836g(int i, Object obj, Object obj2, Object obj3) {
        this.f18306a = i;
        this.c = obj;
        this.f18308d = obj2;
        this.e = obj3;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f18306a) {
            case 0:
                InterfaceC1486b interfaceC1486b = this.f18307b;
                EnumC1604b enumC1604b = EnumC1604b.f17147a;
                if (interfaceC1486b != enumC1604b) {
                    this.f18307b = enumC1604b;
                    try {
                        ((InterfaceC1568a) this.e).run();
                    } catch (Throwable th2) {
                        p.F(th2);
                        s.r(th2);
                    }
                    interfaceC1486b.dispose();
                }
                break;
            case 1:
                this.f18307b.dispose();
                this.f18307b = EnumC1604b.f17147a;
                break;
            default:
                this.f18307b.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f18306a) {
            case 0:
                InterfaceC1486b interfaceC1486b = this.f18307b;
                EnumC1604b enumC1604b = EnumC1604b.f17147a;
                if (interfaceC1486b != enumC1604b) {
                    this.f18307b = enumC1604b;
                    ((r) this.c).onComplete();
                }
                break;
            case 1:
                this.f18307b = EnumC1604b.f17147a;
                Object obj = this.e;
                x xVar = (x) this.c;
                if (obj == null) {
                    Object obj2 = this.f18308d;
                    if (obj2 == null) {
                        xVar.onError(new NoSuchElementException());
                    } else {
                        xVar.onSuccess(obj2);
                    }
                } else {
                    this.e = null;
                    xVar.onSuccess(obj);
                }
                break;
            default:
                Object obj3 = this.e;
                if (obj3 != null) {
                    this.e = null;
                    ((x) this.c).onSuccess(obj3);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f18306a) {
            case 0:
                InterfaceC1486b interfaceC1486b = this.f18307b;
                EnumC1604b enumC1604b = EnumC1604b.f17147a;
                if (interfaceC1486b == enumC1604b) {
                    s.r(th2);
                } else {
                    this.f18307b = enumC1604b;
                    ((r) this.c).onError(th2);
                }
                break;
            case 1:
                this.f18307b = EnumC1604b.f17147a;
                this.e = null;
                ((x) this.c).onError(th2);
                break;
            default:
                if (this.e == null) {
                    s.r(th2);
                } else {
                    this.e = null;
                    ((x) this.c).onError(th2);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f18306a) {
            case 0:
                ((r) this.c).onNext(obj);
                break;
            case 1:
                this.e = obj;
                break;
            default:
                Object obj2 = this.e;
                if (obj2 != null) {
                    try {
                        Object objA = ((InterfaceC1570c) this.f18308d).a(obj2, obj);
                        jh.e.b(objA, "The reducer returned a null value");
                        this.e = objA;
                    } catch (Throwable th2) {
                        p.F(th2);
                        this.f18307b.dispose();
                        onError(th2);
                    }
                }
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f18306a) {
            case 0:
                r rVar = (r) this.c;
                try {
                    ((InterfaceC1573f) this.f18308d).accept(interfaceC1486b);
                    if (EnumC1604b.f(this.f18307b, interfaceC1486b)) {
                        this.f18307b = interfaceC1486b;
                        rVar.onSubscribe(this);
                    }
                } catch (Throwable th2) {
                    p.F(th2);
                    interfaceC1486b.dispose();
                    this.f18307b = EnumC1604b.f17147a;
                    EnumC1605c.c(th2, rVar);
                    return;
                }
                break;
            case 1:
                if (EnumC1604b.f(this.f18307b, interfaceC1486b)) {
                    this.f18307b = interfaceC1486b;
                    ((x) this.c).onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.f18307b, interfaceC1486b)) {
                    this.f18307b = interfaceC1486b;
                    ((x) this.c).onSubscribe(this);
                }
                break;
        }
    }

    public C1836g(x xVar, Object obj) {
        this.f18306a = 1;
        this.c = xVar;
        this.f18308d = obj;
    }
}
