package ph;

import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;
import xh.AbstractC2477a;

/* JADX INFO: renamed from: ph.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2143y extends AbstractC2477a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19690b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19691d;

    public /* synthetic */ C2143y(Object obj, int i) {
        this.f19690b = i;
        this.f19691d = obj;
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19690b) {
            case 0:
                if (!this.c) {
                    this.c = true;
                    ((C2147z) this.f19691d).F();
                    break;
                }
                break;
            case 1:
                if (!this.c) {
                    this.c = true;
                    b3 b3Var = (b3) this.f19691d;
                    EnumC1604b.a(b3Var.f19420d);
                    b3Var.i = true;
                    b3Var.a();
                    break;
                }
                break;
            default:
                if (!this.c) {
                    this.c = true;
                    h3 h3Var = (h3) this.f19691d;
                    h3Var.i.dispose();
                    h3Var.j = true;
                    h3Var.b();
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19690b) {
            case 0:
                if (!this.c) {
                    this.c = true;
                    ((C2147z) this.f19691d).onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            case 1:
                if (!this.c) {
                    this.c = true;
                    b3 b3Var = (b3) this.f19691d;
                    EnumC1604b.a(b3Var.f19420d);
                    Qh.c cVar = b3Var.f19421g;
                    cVar.getClass();
                    if (!AbstractC2353d.a(cVar, th2)) {
                        S1.s.r(th2);
                    } else {
                        b3Var.i = true;
                        b3Var.a();
                    }
                } else {
                    S1.s.r(th2);
                }
                break;
            default:
                if (!this.c) {
                    this.c = true;
                    h3 h3Var = (h3) this.f19691d;
                    h3Var.i.dispose();
                    Qh.c cVar2 = h3Var.f;
                    cVar2.getClass();
                    if (!AbstractC2353d.a(cVar2, th2)) {
                        S1.s.r(th2);
                    } else {
                        h3Var.j = true;
                        h3Var.b();
                    }
                } else {
                    S1.s.r(th2);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19690b) {
            case 0:
                if (!this.c) {
                    this.c = true;
                    dispose();
                    ((C2147z) this.f19691d).F();
                    break;
                }
                break;
            case 1:
                if (!this.c) {
                    ((b3) this.f19691d).b();
                    break;
                }
                break;
            default:
                if (!this.c) {
                    this.c = true;
                    dispose();
                    h3 h3Var = (h3) this.f19691d;
                    AtomicReference atomicReference = h3Var.c;
                    while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                    }
                    h3Var.e.offer(h3.m);
                    h3Var.b();
                    break;
                }
                break;
        }
    }
}
