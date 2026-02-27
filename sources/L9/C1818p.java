package l9;

import com.paymaya.domain.model.PayMayaError;

/* JADX INFO: renamed from: l9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1818p implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1819q f18282b;

    public /* synthetic */ C1818p(C1819q c1819q, int i) {
        this.f18281a = i;
        this.f18282b = c1819q;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f18281a) {
            case 0:
                C1819q c1819q = this.f18282b;
                PayMayaError payMayaErrorF = c1819q.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                c1819q.n(payMayaErrorF);
                break;
            default:
                C1819q c1819q2 = this.f18282b;
                PayMayaError payMayaErrorF2 = c1819q2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                c1819q2.n(payMayaErrorF2);
                break;
        }
    }
}
