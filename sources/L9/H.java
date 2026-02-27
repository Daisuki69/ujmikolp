package L9;

import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.CreditApplication;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1264i0;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2874b;

    public /* synthetic */ H(I i, int i4) {
        this.f2873a = i4;
        this.f2874b = i;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f2873a) {
            case 0:
                CreditApplication it = (CreditApplication) obj;
                kotlin.jvm.internal.j.g(it, "it");
                String loanAccountId = it.getLoanAccountId();
                if (loanAccountId == null) {
                    ((MayaBaseFragment) ((P9.o) this.f2874b.c.get())).w1();
                } else {
                    I i = this.f2874b;
                    i.e(new Lh.d(new Lh.d(new Lh.h(((C1264i0) i.f2876g).b(loanAccountId), zh.b.a(), 0), new F(i, 0), 2), new G(i, 0), 0).e());
                }
                break;
            default:
                Throwable error = (Throwable) obj;
                kotlin.jvm.internal.j.g(error, "error");
                I i4 = this.f2874b;
                PayMayaError payMayaErrorF = i4.f(error, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                i4.w(payMayaErrorF);
                i4.t(payMayaErrorF, error);
                break;
        }
    }
}
