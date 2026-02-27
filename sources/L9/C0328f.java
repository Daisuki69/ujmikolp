package L9;

import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;

/* JADX INFO: renamed from: L9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0328f implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0331i f2887b;

    public /* synthetic */ C0328f(C0331i c0331i, int i) {
        this.f2886a = i;
        this.f2887b = c0331i;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f2886a) {
            case 0:
                C0331i c0331i = this.f2887b;
                MayaCreditTransactionListFragment mayaCreditTransactionListFragment = (MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get());
                SpringView springView = mayaCreditTransactionListFragment.f13113p0;
                if (springView == null) {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
                springView.i();
                LottieAnimationView lottieAnimationView = mayaCreditTransactionListFragment.w0;
                if (lottieAnimationView == null) {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingHeader");
                    throw null;
                }
                lottieAnimationView.a();
                LottieAnimationView lottieAnimationView2 = mayaCreditTransactionListFragment.w0;
                if (lottieAnimationView2 == null) {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingHeader");
                    throw null;
                }
                lottieAnimationView2.setProgress(0.0f);
                ((MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get())).s1().g();
                return;
            default:
                C0331i c0331i2 = this.f2887b;
                MayaCreditTransactionListFragment mayaCreditTransactionListFragment2 = (MayaCreditTransactionListFragment) ((P9.c) c0331i2.c.get());
                SpringView springView2 = mayaCreditTransactionListFragment2.f13113p0;
                if (springView2 == null) {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
                springView2.i();
                LottieAnimationView lottieAnimationView3 = mayaCreditTransactionListFragment2.f13118x0;
                if (lottieAnimationView3 == null) {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingFooter");
                    throw null;
                }
                lottieAnimationView3.a();
                LottieAnimationView lottieAnimationView4 = mayaCreditTransactionListFragment2.f13118x0;
                if (lottieAnimationView4 == null) {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingFooter");
                    throw null;
                }
                lottieAnimationView4.setProgress(0.0f);
                O9.b bVar = mayaCreditTransactionListFragment2.t0;
                if (bVar != null && bVar.f4769d) {
                    bVar.e(false);
                }
                c0331i2.e = false;
                return;
        }
    }
}
