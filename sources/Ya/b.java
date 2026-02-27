package ya;

import Da.f;
import Fa.g;
import N5.E;
import android.os.CountDownTimer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.Navigation;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalViewRequestFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2516a f21087b;

    public /* synthetic */ b(C2516a c2516a, int i) {
        this.f21086a = i;
        this.f21087b = c2516a;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f21086a) {
            case 0:
                MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment = (MayaPushApprovalViewRequestFragment) ((f) this.f21087b.c.get());
                CountDownTimer countDownTimer = mayaPushApprovalViewRequestFragment.f13568X;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                mayaPushApprovalViewRequestFragment.w1();
                E e = mayaPushApprovalViewRequestFragment.f13566V;
                j.d(e);
                ConstraintLayout constraintLayout = (ConstraintLayout) e.f3587d;
                j.f(constraintLayout, numX49.tnTj78("bQlb"));
                Navigation.findNavController(constraintLayout).navigate(new Fa.f(mayaPushApprovalViewRequestFragment.I1().getId()));
                break;
            default:
                MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment2 = (MayaPushApprovalViewRequestFragment) ((f) this.f21087b.c.get());
                E e7 = mayaPushApprovalViewRequestFragment2.f13566V;
                j.d(e7);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) e7.f3587d;
                j.f(constraintLayout2, numX49.tnTj78("bQlP"));
                Navigation.findNavController(constraintLayout2).navigate(new g(mayaPushApprovalViewRequestFragment2.I1()));
                break;
        }
    }
}
