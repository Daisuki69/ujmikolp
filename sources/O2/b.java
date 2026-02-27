package O2;

import U2.o;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f4625b;

    public b(o oVar) {
        this.f4625b = oVar;
    }

    @Override // O2.e
    public final boolean a() {
        o oVar = this.f4625b;
        if (!oVar.B()) {
            return false;
        }
        if (oVar.x() > 0 || oVar.w() > 0) {
            return true;
        }
        return oVar.A() && oVar.z().w();
    }
}
