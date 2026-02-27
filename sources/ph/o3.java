package ph;

import a.AbstractC0617a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19583b;
    public final p3[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f19584d;
    public final AtomicReference e;
    public final Qh.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19585g;

    public o3(ch.r rVar, hh.n nVar, int i) {
        this.f19582a = rVar;
        this.f19583b = nVar;
        p3[] p3VarArr = new p3[i];
        for (int i4 = 0; i4 < i; i4++) {
            p3VarArr[i4] = new p3(this, i4);
        }
        this.c = p3VarArr;
        this.f19584d = new AtomicReferenceArray(i);
        this.e = new AtomicReference();
        this.f = new Qh.c();
    }

    public final void a(int i) {
        int i4 = 0;
        while (true) {
            p3[] p3VarArr = this.c;
            if (i4 >= p3VarArr.length) {
                return;
            }
            if (i4 != i) {
                p3 p3Var = p3VarArr[i4];
                p3Var.getClass();
                EnumC1604b.a(p3Var);
            }
            i4++;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.e);
        for (p3 p3Var : this.c) {
            p3Var.getClass();
            EnumC1604b.a(p3Var);
        }
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19585g) {
            return;
        }
        this.f19585g = true;
        a(-1);
        AbstractC0617a.H(this.f19582a, this, this.f);
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f19585g) {
            S1.s.r(th2);
            return;
        }
        this.f19585g = true;
        a(-1);
        AbstractC0617a.I(this.f19582a, th2, this, this.f);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19585g) {
            return;
        }
        AtomicReferenceArray atomicReferenceArray = this.f19584d;
        int length = atomicReferenceArray.length();
        Object[] objArr = new Object[length + 1];
        int i = 0;
        objArr[0] = obj;
        while (i < length) {
            Object obj2 = atomicReferenceArray.get(i);
            if (obj2 == null) {
                return;
            }
            i++;
            objArr[i] = obj2;
        }
        try {
            Object objApply = this.f19583b.apply(objArr);
            jh.e.b(objApply, "combiner returned a null value");
            AbstractC0617a.J(this.f19582a, objApply, this, this.f);
        } catch (Throwable th2) {
            of.p.F(th2);
            dispose();
            onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.e, interfaceC1486b);
    }
}
