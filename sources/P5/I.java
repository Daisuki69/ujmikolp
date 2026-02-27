package P5;

import cg.InterfaceC1101b;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6.v f5015b;

    public /* synthetic */ I(G6.v vVar, int i) {
        this.f5014a = i;
        this.f5015b = vVar;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5014a) {
            case 0:
                this.f5015b.getClass();
                return new J5.b();
            default:
                this.f5015b.getClass();
                return new Uh.d();
        }
    }
}
