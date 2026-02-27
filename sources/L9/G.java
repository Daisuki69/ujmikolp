package L9;

import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PersonalDetailsPatchResponse;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2872b;

    public /* synthetic */ G(I i, int i4) {
        this.f2871a = i4;
        this.f2872b = i;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f2871a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((MayaBaseFragment) ((P9.o) this.f2872b.c.get())).w1();
                PayMayaError payMayaErrorF = this.f2872b.f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                this.f2872b.t(payMayaErrorF, it);
                break;
            default:
                kotlin.jvm.internal.j.g((PersonalDetailsPatchResponse) obj, "it");
                ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.f2872b.c.get())).requireActivity().onBackPressed();
                break;
        }
    }
}
