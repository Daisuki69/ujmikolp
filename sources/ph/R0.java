package ph;

import ch.InterfaceC1106e;
import fh.InterfaceC1486b;
import hh.InterfaceC1570c;
import hh.InterfaceC1573f;

/* JADX INFO: loaded from: classes4.dex */
public final class R0 implements InterfaceC1106e, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1573f f19322b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f19323d;
    public boolean e;

    public R0(ch.r rVar, InterfaceC1570c interfaceC1570c, InterfaceC1573f interfaceC1573f, Object obj) {
        this.f19321a = rVar;
        this.f19322b = interfaceC1573f;
        this.c = obj;
    }

    public final void a(Object obj) {
        try {
            this.f19322b.accept(obj);
        } catch (Throwable th2) {
            of.p.F(th2);
            S1.s.r(th2);
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f19323d = true;
    }
}
