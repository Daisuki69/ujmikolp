package A7;

import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f221b;

    public /* synthetic */ k(o oVar, int i) {
        this.f220a = i;
        this.f221b = oVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f220a) {
            case 0:
                MayaTransactionsFragment mayaTransactionsFragment = (MayaTransactionsFragment) ((F7.c) this.f221b.c.get());
                SpringView springView = mayaTransactionsFragment.f12202p0;
                if (springView == null) {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
                springView.i();
                LottieAnimationView lottieAnimationView = mayaTransactionsFragment.w0;
                if (lottieAnimationView == null) {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingHeader");
                    throw null;
                }
                lottieAnimationView.a();
                LottieAnimationView lottieAnimationView2 = mayaTransactionsFragment.w0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setProgress(0.0f);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingHeader");
                    throw null;
                }
            case 1:
                o oVar = this.f221b;
                MayaTransactionsFragment mayaTransactionsFragment2 = (MayaTransactionsFragment) ((F7.c) oVar.c.get());
                SpringView springView2 = mayaTransactionsFragment2.f12202p0;
                if (springView2 == null) {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
                springView2.i();
                LottieAnimationView lottieAnimationView3 = mayaTransactionsFragment2.f12207x0;
                if (lottieAnimationView3 == null) {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingFooter");
                    throw null;
                }
                lottieAnimationView3.a();
                LottieAnimationView lottieAnimationView4 = mayaTransactionsFragment2.f12207x0;
                if (lottieAnimationView4 == null) {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingFooter");
                    throw null;
                }
                lottieAnimationView4.setProgress(0.0f);
                D7.h hVar = mayaTransactionsFragment2.t0;
                if (hVar != null && hVar.f1003d) {
                    hVar.f(false);
                }
                oVar.h = false;
                return;
            default:
                o oVar2 = this.f221b;
                ((MayaBaseFragment) ((F7.c) oVar2.c.get())).w1();
                jk.b.w((F7.c) oVar2.c.get(), oVar2.i);
                return;
        }
    }
}
