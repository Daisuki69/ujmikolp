package A7;

import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.common.utility.C;
import com.paymaya.data.database.repository.G;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import v5.C2342a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Ch.a, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f233b;

    public /* synthetic */ q(A a8, int i) {
        this.f232a = i;
        this.f233b = a8;
    }

    @Override // Ch.f
    public Object apply(Object obj) throws Exception {
        Throwable th2 = (Throwable) obj;
        switch (this.f232a) {
            case 1:
                A a8 = this.f233b;
                PayMayaError payMayaErrorF = a8.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                if (payMayaErrorF.isSessionTimeout() || a8.f183d.b() == null) {
                    throw new Exception(th2);
                }
                return new C2342a(null);
            case 2:
                PayMayaError payMayaErrorF2 = this.f233b.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                return A.p(payMayaErrorF2, th2);
            case 3:
                PayMayaError payMayaErrorF3 = this.f233b.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                return A.p(payMayaErrorF3, th2);
            default:
                PayMayaError payMayaErrorF4 = this.f233b.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                return A.p(payMayaErrorF4, th2);
        }
    }

    @Override // Ch.a
    public void run() {
        switch (this.f232a) {
            case 0:
                A a8 = this.f233b;
                MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) a8.c.get());
                SpringView springView = mayaWalletFragment.f12251p0;
                if (springView == null) {
                    kotlin.jvm.internal.j.n("mDashboardSwipeRefreshLayout");
                    throw null;
                }
                springView.i();
                LottieAnimationView lottieAnimationView = mayaWalletFragment.N0;
                if (lottieAnimationView == null) {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
                lottieAnimationView.a();
                LottieAnimationView lottieAnimationView2 = mayaWalletFragment.N0;
                if (lottieAnimationView2 == null) {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
                lottieAnimationView2.setProgress(0.0f);
                a8.f189p = false;
                ((MayaWalletFragment) ((F7.s) a8.c.get())).s1().g();
                return;
            default:
                A a10 = this.f233b;
                G g8 = a10.e.c;
                if (C.e(G.a(g8.f11299a.f2811a.query(String.format("SELECT * FROM %1$s", "user_activity"))).isEmpty() ? null : (UserActivity) G.a(g8.f11299a.f2811a.query(String.format("SELECT * FROM %1$s", "user_activity"))).get(0))) {
                    ((MayaWalletFragment) ((F7.s) a10.c.get())).R1();
                    MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((F7.s) a10.c.get());
                    TextView textView = mayaWalletFragment2.f12214B0;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n("mTextViewTransactionLabel");
                        throw null;
                    }
                    textView.setVisibility(0);
                    Group group = mayaWalletFragment2.f12217E0;
                    if (group == null) {
                        kotlin.jvm.internal.j.n("mGroupNoActivityList");
                        throw null;
                    }
                    group.setVisibility(0);
                    ((MayaWalletFragment) ((F7.s) a10.c.get())).V1();
                    return;
                }
                return;
        }
    }
}
