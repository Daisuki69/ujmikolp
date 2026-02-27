package ph;

import a.AbstractC0617a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class p3 extends AtomicReference implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3 f19597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19598b;
    public boolean c;

    public p3(o3 o3Var, int i) {
        this.f19597a = o3Var;
        this.f19598b = i;
    }

    @Override // ch.r
    public final void onComplete() {
        o3 o3Var = this.f19597a;
        int i = this.f19598b;
        if (this.c) {
            o3Var.getClass();
            return;
        }
        o3Var.f19585g = true;
        o3Var.a(i);
        AbstractC0617a.H(o3Var.f19582a, o3Var, o3Var.f);
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        o3 o3Var = this.f19597a;
        int i = this.f19598b;
        o3Var.f19585g = true;
        EnumC1604b.a(o3Var.e);
        o3Var.a(i);
        AbstractC0617a.I(o3Var.f19582a, th2, o3Var, o3Var.f);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (!this.c) {
            this.c = true;
        }
        this.f19597a.f19584d.set(this.f19598b, obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }
}
