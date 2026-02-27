package l9;

import com.paymaya.domain.model.PayMayaError;

/* JADX INFO: renamed from: l9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1808f implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1809g f18263b;

    public /* synthetic */ C1808f(C1809g c1809g, int i) {
        this.f18262a = i;
        this.f18263b = c1809g;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f18262a) {
            case 0:
                C1809g c1809g = this.f18263b;
                PayMayaError payMayaErrorF = c1809g.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                c1809g.o(payMayaErrorF);
                break;
            default:
                C1809g c1809g2 = this.f18263b;
                PayMayaError payMayaErrorF2 = c1809g2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                c1809g2.o(payMayaErrorF2);
                break;
        }
    }
}
