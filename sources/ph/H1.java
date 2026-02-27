package ph;

import ch.AbstractC1109h;
import hh.InterfaceC1570c;

/* JADX INFO: loaded from: classes4.dex */
public final class H1 extends AbstractC1109h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1570c f19208b;

    public H1(ch.l lVar, InterfaceC1570c interfaceC1570c) {
        this.f19207a = lVar;
        this.f19208b = interfaceC1570c;
    }

    @Override // ch.AbstractC1109h
    public final void c(ch.i iVar) {
        this.f19207a.subscribe(new J(iVar, this.f19208b));
    }
}
