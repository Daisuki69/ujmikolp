package L9;

import N5.C0466m;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f2938b;

    public /* synthetic */ z(B b8, int i) {
        this.f2937a = i;
        this.f2938b = b8;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f2937a) {
            case 0:
                CreditResponse creditResponse = (CreditResponse) obj;
                kotlin.jvm.internal.j.g(creditResponse, "creditResponse");
                B b8 = this.f2938b;
                b8.f2859k = creditResponse;
                CreditAccount creditAccount = creditResponse.getCreditAccount();
                if (creditAccount != null && (kotlin.jvm.internal.j.b(creditAccount.getStatus(), "SUSPENDED") || creditAccount.getDaysInArrears() >= 30)) {
                    ImageView imageView = ((NewMayaCreditFragment) ((P9.k) b8.c.get())).u0;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mImageViewLockedCredit");
                        throw null;
                    }
                }
                ImageView imageView2 = ((NewMayaCreditFragment) ((P9.k) b8.c.get())).u0;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mImageViewLockedCredit");
                    throw null;
                }
            default:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                C0466m c0466m = ((NewMayaCreditFragment) ((P9.k) this.f2938b.c.get())).f13256Z0;
                if (c0466m == null) {
                    kotlin.jvm.internal.j.n("mTransactionListCard");
                    throw null;
                }
                ((ConstraintLayout) c0466m.f4150b).setVisibility(8);
                PayMayaError payMayaErrorF = this.f2938b.f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                B b10 = this.f2938b;
                b10.getClass();
                if (!payMayaErrorF.isSessionTimeout()) {
                    NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) b10.c.get());
                    newMayaCreditFragment.getClass();
                    Q9.G g8 = newMayaCreditFragment.D1;
                    if (g8 != null) {
                        ((MayaDashboardActivity) g8).l2(payMayaErrorF);
                    }
                }
                this.f2938b.q(payMayaErrorF, it);
                return;
        }
    }
}
