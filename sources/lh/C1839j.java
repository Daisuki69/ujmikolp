package lh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import kh.InterfaceC1775b;
import kh.InterfaceC1779f;
import ph.S;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: lh.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1839j extends AtomicReference implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f18314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18315b;
    public InterfaceC1779f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f18316d;
    public int e;

    public C1839j(S s9, int i) {
        this.f18314a = s9;
        this.f18315b = i;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
    }

    @Override // ch.r
    public final void onComplete() {
        S s9 = this.f18314a;
        s9.getClass();
        this.f18316d = true;
        s9.b();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        S s9 = this.f18314a;
        Qh.c cVar = s9.f;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            s.r(th2);
            return;
        }
        if (s9.e == 1) {
            s9.i.dispose();
        }
        this.f18316d = true;
        s9.b();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        int i = this.e;
        S s9 = this.f18314a;
        if (i != 0) {
            s9.b();
            return;
        }
        s9.getClass();
        this.c.offer(obj);
        s9.b();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.e(this, interfaceC1486b)) {
            if (interfaceC1486b instanceof InterfaceC1775b) {
                InterfaceC1775b interfaceC1775b = (InterfaceC1775b) interfaceC1486b;
                int iB = interfaceC1775b.b(3);
                if (iB == 1) {
                    this.e = iB;
                    this.c = interfaceC1775b;
                    this.f18316d = true;
                    S s9 = this.f18314a;
                    s9.getClass();
                    this.f18316d = true;
                    s9.b();
                    return;
                }
                if (iB == 2) {
                    this.e = iB;
                    this.c = interfaceC1775b;
                    return;
                }
            }
            int i = -this.f18315b;
            this.c = i < 0 ? new rh.c(-i) : new rh.b(i);
        }
    }
}
