package ph;

import hh.InterfaceC1573f;
import wh.AbstractC2439a;

/* JADX INFO: loaded from: classes4.dex */
public final class V1 extends AbstractC2439a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2439a f19361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.l f19362b;

    public V1(AbstractC2439a abstractC2439a, ch.l lVar) {
        this.f19361a = abstractC2439a;
        this.f19362b = lVar;
    }

    @Override // wh.AbstractC2439a
    public final void d(InterfaceC1573f interfaceC1573f) {
        this.f19361a.d(interfaceC1573f);
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.f19362b.subscribe(rVar);
    }
}
