package oh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import hh.n;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: oh.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1982d extends AtomicInteger implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f18861b;
    public final n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f18862d;
    public final rh.c e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1486b f18863g;
    public volatile boolean h;
    public volatile boolean i;
    public Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile int f18864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f18865l;

    public C1982d(r rVar, n nVar, int i, int i4, int i6) {
        this.f18860a = i6;
        switch (i6) {
            case 1:
                this.f18861b = rVar;
                this.c = nVar;
                this.f = i4;
                this.f18862d = new Qh.c();
                this.f18865l = new C1979a(this, 2);
                this.e = new rh.c(i);
                break;
            default:
                this.f18861b = rVar;
                this.c = nVar;
                this.f = i4;
                this.f18862d = new Qh.c();
                this.f18865l = new C1979a(this, 1);
                this.e = new rh.c(i);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r2.clear();
        r10.j = null;
        r0.onError(vh.AbstractC2353d.b(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        r2.clear();
        r10.j = null;
        r0.onError(vh.AbstractC2353d.b(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oh.C1982d.a():void");
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f18860a) {
            case 0:
                this.i = true;
                this.f18863g.dispose();
                C1979a c1979a = (C1979a) this.f18865l;
                c1979a.getClass();
                EnumC1604b.a(c1979a);
                if (getAndIncrement() == 0) {
                    this.e.clear();
                    this.j = null;
                }
                break;
            default:
                this.i = true;
                this.f18863g.dispose();
                C1979a c1979a2 = (C1979a) this.f18865l;
                c1979a2.getClass();
                EnumC1604b.a(c1979a2);
                if (getAndIncrement() == 0) {
                    this.e.clear();
                    this.j = null;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f18860a) {
            case 0:
                this.h = true;
                a();
                break;
            default:
                this.h = true;
                a();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f18860a) {
            case 0:
                Qh.c cVar = this.f18862d;
                cVar.getClass();
                if (!AbstractC2353d.a(cVar, th2)) {
                    s.r(th2);
                } else {
                    if (this.f == 1) {
                        C1979a c1979a = (C1979a) this.f18865l;
                        c1979a.getClass();
                        EnumC1604b.a(c1979a);
                    }
                    this.h = true;
                    a();
                }
                break;
            default:
                Qh.c cVar2 = this.f18862d;
                cVar2.getClass();
                if (!AbstractC2353d.a(cVar2, th2)) {
                    s.r(th2);
                } else {
                    if (this.f == 1) {
                        C1979a c1979a2 = (C1979a) this.f18865l;
                        c1979a2.getClass();
                        EnumC1604b.a(c1979a2);
                    }
                    this.h = true;
                    a();
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f18860a) {
            case 0:
                this.e.offer(obj);
                a();
                break;
            default:
                this.e.offer(obj);
                a();
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f18860a) {
            case 0:
                if (EnumC1604b.f(this.f18863g, interfaceC1486b)) {
                    this.f18863g = interfaceC1486b;
                    this.f18861b.onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.f18863g, interfaceC1486b)) {
                    this.f18863g = interfaceC1486b;
                    this.f18861b.onSubscribe(this);
                }
                break;
        }
    }
}
