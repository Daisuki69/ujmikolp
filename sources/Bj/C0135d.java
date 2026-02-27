package Bj;

/* JADX INFO: renamed from: Bj.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0135d implements InterfaceC0145i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0133c[] f612a;

    public C0135d(C0133c[] c0133cArr) {
        this.f612a = c0133cArr;
    }

    @Override // Bj.InterfaceC0145i
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (C0133c c0133c : this.f612a) {
            W w6 = c0133c.f;
            if (w6 == null) {
                kotlin.jvm.internal.j.n("handle");
                throw null;
            }
            w6.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f612a + ']';
    }
}
