package ph;

import hh.InterfaceC1571d;

/* JADX INFO: renamed from: ph.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2118r2 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.p f19619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.p f19620b;
    public final InterfaceC1571d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19621d;

    public C2118r2(ch.p pVar, ch.p pVar2, InterfaceC1571d interfaceC1571d, int i) {
        this.f19619a = pVar;
        this.f19620b = pVar2;
        this.c = interfaceC1571d;
        this.f19621d = i;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        ch.p pVar = this.f19620b;
        InterfaceC1571d interfaceC1571d = this.c;
        C2111p2 c2111p2 = new C2111p2(rVar, this.f19621d, this.f19619a, pVar, interfaceC1571d);
        rVar.onSubscribe(c2111p2);
        C2115q2[] c2115q2Arr = (C2115q2[]) c2111p2.j;
        c2111p2.f19595d.subscribe(c2115q2Arr[0]);
        c2111p2.e.subscribe(c2115q2Arr[1]);
    }
}
