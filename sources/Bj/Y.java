package Bj;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements InterfaceC0148j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f606a;

    public Y(boolean z4) {
        this.f606a = z4;
    }

    @Override // Bj.InterfaceC0148j0
    public final x0 b() {
        return null;
    }

    @Override // Bj.InterfaceC0148j0
    public final boolean isActive() {
        return this.f606a;
    }

    public final String toString() {
        return androidx.camera.core.impl.a.n(new StringBuilder("Empty{"), this.f606a ? "Active" : "New", '}');
    }
}
