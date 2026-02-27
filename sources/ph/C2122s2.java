package ph;

import hh.InterfaceC1571d;
import kh.InterfaceC1774a;

/* JADX INFO: renamed from: ph.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2122s2 extends ch.w implements InterfaceC1774a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.p f19632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.p f19633b;
    public final InterfaceC1571d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19634d;

    public C2122s2(ch.p pVar, ch.p pVar2, InterfaceC1571d interfaceC1571d, int i) {
        this.f19632a = pVar;
        this.f19633b = pVar2;
        this.c = interfaceC1571d;
        this.f19634d = i;
    }

    @Override // kh.InterfaceC1774a
    public final ch.l a() {
        return new C2118r2(this.f19632a, this.f19633b, this.c, this.f19634d);
    }

    @Override // ch.w
    public final void d(ch.x xVar) {
        ch.p pVar = this.f19633b;
        InterfaceC1571d interfaceC1571d = this.c;
        C2111p2 c2111p2 = new C2111p2(xVar, this.f19634d, this.f19632a, pVar, interfaceC1571d);
        xVar.onSubscribe(c2111p2);
        C2115q2[] c2115q2Arr = (C2115q2[]) c2111p2.j;
        c2111p2.f19595d.subscribe(c2115q2Arr[0]);
        c2111p2.e.subscribe(c2115q2Arr[1]);
    }
}
