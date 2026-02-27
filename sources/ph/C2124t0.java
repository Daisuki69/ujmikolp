package ph;

import fh.InterfaceC1486b;
import hh.InterfaceC1568a;
import ih.EnumC1604b;
import kh.InterfaceC1775b;
import lh.AbstractC1831b;

/* JADX INFO: renamed from: ph.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2124t0 extends AbstractC1831b implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1568a f19638b;
    public InterfaceC1486b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1775b f19639d;
    public boolean e;

    public C2124t0(ch.r rVar, InterfaceC1568a interfaceC1568a) {
        this.f19637a = rVar;
        this.f19638b = interfaceC1568a;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f19638b.run();
            } catch (Throwable th2) {
                of.p.F(th2);
                S1.s.r(th2);
            }
        }
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        InterfaceC1775b interfaceC1775b = this.f19639d;
        if (interfaceC1775b == null || (i & 4) != 0) {
            return 0;
        }
        int iB = interfaceC1775b.b(i);
        if (iB != 0) {
            this.e = iB == 1;
        }
        return iB;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        this.f19639d.clear();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.c.dispose();
        a();
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return this.f19639d.isEmpty();
    }

    @Override // ch.r
    public final void onComplete() {
        this.f19637a.onComplete();
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19637a.onError(th2);
        a();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19637a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.c, interfaceC1486b)) {
            this.c = interfaceC1486b;
            if (interfaceC1486b instanceof InterfaceC1775b) {
                this.f19639d = (InterfaceC1775b) interfaceC1486b;
            }
            this.f19637a.onSubscribe(this);
        }
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        Object objPoll = this.f19639d.poll();
        if (objPoll == null && this.e) {
            a();
        }
        return objPoll;
    }
}
