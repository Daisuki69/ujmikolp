package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import xh.C2479c;

/* JADX INFO: renamed from: ph.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2099m2 extends AtomicReference implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2479c f19553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.p f19554b;
    public final AtomicReference c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1486b f19555d;

    public AbstractC2099m2(C2479c c2479c, ch.p pVar) {
        this.f19553a = c2479c;
        this.f19554b = pVar;
    }

    public abstract void a();

    public abstract void b();

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.c);
        this.f19555d.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        EnumC1604b.a(this.c);
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        EnumC1604b.a(this.c);
        this.f19553a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        lazySet(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f19555d, interfaceC1486b)) {
            this.f19555d = interfaceC1486b;
            this.f19553a.onSubscribe(this);
            if (this.c.get() == null) {
                this.f19554b.subscribe(new C2093l0(this, 1));
            }
        }
    }
}
