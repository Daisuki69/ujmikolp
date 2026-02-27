package ph;

import kh.InterfaceCallableC1777d;

/* JADX INFO: renamed from: ph.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2094l1 extends ch.l implements InterfaceCallableC1777d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19541a;

    public C2094l1(Object obj) {
        this.f19541a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f19541a;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        RunnableC2103n2 runnableC2103n2 = new RunnableC2103n2(rVar, this.f19541a);
        rVar.onSubscribe(runnableC2103n2);
        runnableC2103n2.run();
    }
}
