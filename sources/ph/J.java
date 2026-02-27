package ph;

import fh.InterfaceC1486b;
import hh.InterfaceC1569b;
import hh.InterfaceC1570c;
import ih.EnumC1604b;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19228b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1486b f19229d;
    public boolean e;
    public final Object f;

    public /* synthetic */ J(Object obj, Object obj2, InterfaceC1569b interfaceC1569b, int i) {
        this.f19227a = i;
        this.f = obj;
        this.f19228b = interfaceC1569b;
        this.c = obj2;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19227a) {
            case 0:
                this.f19229d.dispose();
                break;
            case 1:
                this.f19229d.dispose();
                break;
            case 2:
                this.f19229d.dispose();
                break;
            case 3:
                this.f19229d.dispose();
                break;
            default:
                this.f19229d.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19227a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    Object obj = this.c;
                    ch.r rVar = (ch.r) this.f;
                    rVar.onNext(obj);
                    rVar.onComplete();
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    ((ch.x) this.f).onSuccess(this.c);
                    break;
                }
                break;
            case 2:
                if (!this.e) {
                    this.e = true;
                    Object obj2 = this.c;
                    this.c = null;
                    ch.i iVar = (ch.i) this.f;
                    if (obj2 == null) {
                        iVar.onComplete();
                    } else {
                        iVar.onSuccess(obj2);
                    }
                    break;
                }
                break;
            case 3:
                if (!this.e) {
                    this.e = true;
                    Object obj3 = this.f19228b;
                    this.f19228b = null;
                    if (obj3 == null) {
                        obj3 = this.c;
                    }
                    ch.x xVar = (ch.x) this.f;
                    if (obj3 == null) {
                        xVar.onError(new NoSuchElementException());
                    } else {
                        xVar.onSuccess(obj3);
                    }
                    break;
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    ((ch.r) this.f).onComplete();
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19227a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    ((ch.r) this.f).onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    ((ch.x) this.f).onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            case 2:
                if (!this.e) {
                    this.e = true;
                    this.c = null;
                    ((ch.i) this.f).onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            case 3:
                if (!this.e) {
                    this.e = true;
                    ((ch.x) this.f).onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    ((ch.r) this.f).onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19227a) {
            case 0:
                if (!this.e) {
                    try {
                        ((InterfaceC1569b) this.f19228b).accept(this.c, obj);
                    } catch (Throwable th2) {
                        this.f19229d.dispose();
                        onError(th2);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    try {
                        ((InterfaceC1569b) this.f19228b).accept(this.c, obj);
                    } catch (Throwable th3) {
                        this.f19229d.dispose();
                        onError(th3);
                        return;
                    }
                    break;
                }
                break;
            case 2:
                if (!this.e) {
                    Object obj2 = this.c;
                    if (obj2 == null) {
                        this.c = obj;
                    } else {
                        try {
                            Object objA = ((InterfaceC1570c) this.f19228b).a(obj2, obj);
                            jh.e.b(objA, "The reducer returned a null value");
                            this.c = objA;
                        } catch (Throwable th4) {
                            of.p.F(th4);
                            this.f19229d.dispose();
                            onError(th4);
                            return;
                        }
                    }
                }
                break;
            case 3:
                if (!this.e) {
                    if (this.f19228b == null) {
                        this.f19228b = obj;
                    } else {
                        this.e = true;
                        this.f19229d.dispose();
                        ((ch.x) this.f).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
            default:
                ch.r rVar = (ch.r) this.f;
                Iterator it = (Iterator) this.f19228b;
                if (!this.e) {
                    try {
                        Object next = it.next();
                        jh.e.b(next, "The iterator returned a null value");
                        try {
                            Object objA2 = ((InterfaceC1570c) this.c).a(obj, next);
                            jh.e.b(objA2, "The zipper function returned a null value");
                            rVar.onNext(objA2);
                            try {
                                if (!it.hasNext()) {
                                    this.e = true;
                                    this.f19229d.dispose();
                                    rVar.onComplete();
                                }
                            } catch (Throwable th5) {
                                of.p.F(th5);
                                this.e = true;
                                this.f19229d.dispose();
                                rVar.onError(th5);
                                return;
                            }
                        } catch (Throwable th6) {
                            of.p.F(th6);
                            this.e = true;
                            this.f19229d.dispose();
                            rVar.onError(th6);
                            return;
                        }
                    } catch (Throwable th7) {
                        of.p.F(th7);
                        this.e = true;
                        this.f19229d.dispose();
                        rVar.onError(th7);
                    }
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19227a) {
            case 0:
                if (EnumC1604b.f(this.f19229d, interfaceC1486b)) {
                    this.f19229d = interfaceC1486b;
                    ((ch.r) this.f).onSubscribe(this);
                }
                break;
            case 1:
                if (EnumC1604b.f(this.f19229d, interfaceC1486b)) {
                    this.f19229d = interfaceC1486b;
                    ((ch.x) this.f).onSubscribe(this);
                }
                break;
            case 2:
                if (EnumC1604b.f(this.f19229d, interfaceC1486b)) {
                    this.f19229d = interfaceC1486b;
                    ((ch.i) this.f).onSubscribe(this);
                }
                break;
            case 3:
                if (EnumC1604b.f(this.f19229d, interfaceC1486b)) {
                    this.f19229d = interfaceC1486b;
                    ((ch.x) this.f).onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.f19229d, interfaceC1486b)) {
                    this.f19229d = interfaceC1486b;
                    ((ch.r) this.f).onSubscribe(this);
                }
                break;
        }
    }

    public J(ch.x xVar, Object obj) {
        this.f19227a = 3;
        this.f = xVar;
        this.c = obj;
    }

    public J(ch.i iVar, InterfaceC1570c interfaceC1570c) {
        this.f19227a = 2;
        this.f = iVar;
        this.f19228b = interfaceC1570c;
    }

    public J(ch.r rVar, Iterator it, InterfaceC1570c interfaceC1570c) {
        this.f19227a = 4;
        this.f = rVar;
        this.f19228b = it;
        this.c = interfaceC1570c;
    }
}
