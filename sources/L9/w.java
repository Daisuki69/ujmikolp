package L9;

import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.PayMayaError;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f2932b;

    public /* synthetic */ w(B b8, int i) {
        this.f2931a = i;
        this.f2932b = b8;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f2931a) {
            case 0:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                B b8 = this.f2932b;
                b8.getClass();
                if (b8.f(throwable, true).mStatusCode() == 404) {
                    b8.x();
                } else {
                    b8.z();
                }
                ((MayaBaseFragment) ((P9.k) b8.c.get())).w1();
                break;
            default:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                PayMayaError payMayaErrorF = this.f2932b.f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                B b10 = this.f2932b;
                b10.getClass();
                ((MayaBaseFragment) ((P9.k) b10.c.get())).w1();
                if (!payMayaErrorF.isSessionTimeout()) {
                    b10.z();
                }
                this.f2932b.q(payMayaErrorF, it);
                break;
        }
    }
}
