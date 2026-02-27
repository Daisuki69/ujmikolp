package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: ph.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2126t2 extends ArrayDeque implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19646b;
    public InterfaceC1486b c;

    public C2126t2(ch.r rVar, int i) {
        super(i);
        this.f19645a = rVar;
        this.f19646b = i;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.c.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        this.f19645a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19645a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19646b == size()) {
            this.f19645a.onNext(poll());
        }
        offer(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.c, interfaceC1486b)) {
            this.c = interfaceC1486b;
            this.f19645a.onSubscribe(this);
        }
    }
}
