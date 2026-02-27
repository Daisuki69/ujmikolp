package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xh.C2479c;

/* JADX INFO: renamed from: ph.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC2087j2 extends AtomicReference implements ch.r, InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2479c f19511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19512b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.v f19513d;
    public final AtomicReference e = new AtomicReference();
    public InterfaceC1486b f;

    public AbstractRunnableC2087j2(C2479c c2479c, long j, TimeUnit timeUnit, ch.v vVar) {
        this.f19511a = c2479c;
        this.f19512b = j;
        this.c = timeUnit;
        this.f19513d = vVar;
    }

    public abstract void a();

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.e);
        this.f.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        EnumC1604b.a(this.e);
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        EnumC1604b.a(this.e);
        this.f19511a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        lazySet(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f, interfaceC1486b)) {
            this.f = interfaceC1486b;
            this.f19511a.onSubscribe(this);
            TimeUnit timeUnit = this.c;
            ch.v vVar = this.f19513d;
            long j = this.f19512b;
            EnumC1604b.c(this.e, vVar.f(this, j, j, timeUnit));
        }
    }
}
