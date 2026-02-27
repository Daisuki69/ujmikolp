package ba;

import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bb.f f8585b;

    public /* synthetic */ h(Bb.f fVar, int i) {
        this.f8584a = i;
        this.f8585b = fVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f8584a) {
            case 0:
                Bb.f fVar = this.f8585b;
                MayaBillersFragment mayaBillersFragment = (MayaBillersFragment) ((ga.b) fVar.c.get());
                SpringView springView = mayaBillersFragment.f13374p0;
                if (springView == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLV"));
                    throw null;
                }
                springView.i();
                LottieAnimationView lottieAnimationView = mayaBillersFragment.f13376r0;
                String strTnTj78 = numX49.tnTj78("bucLB");
                if (lottieAnimationView == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                lottieAnimationView.a();
                LottieAnimationView lottieAnimationView2 = mayaBillersFragment.f13376r0;
                if (lottieAnimationView2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                lottieAnimationView2.setProgress(0.0f);
                ea.l lVar = mayaBillersFragment.u0;
                if (lVar == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLu"));
                    throw null;
                }
                if (lVar.f16622d) {
                    lVar.e(false);
                }
                ((MayaBillersFragment) ((ga.b) fVar.c.get())).y0 = false;
                return;
            case 1:
                ((MayaBillersFragment) ((ga.b) this.f8585b.c.get())).y0 = false;
                return;
            default:
                Bb.f fVar2 = this.f8585b;
                MayaBillersFragment mayaBillersFragment2 = (MayaBillersFragment) ((ga.b) fVar2.c.get());
                SpringView springView2 = mayaBillersFragment2.f13374p0;
                if (springView2 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLk"));
                    throw null;
                }
                springView2.i();
                LottieAnimationView lottieAnimationView3 = mayaBillersFragment2.f13375q0;
                String strTnTj782 = numX49.tnTj78("bucLZ");
                if (lottieAnimationView3 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                lottieAnimationView3.a();
                LottieAnimationView lottieAnimationView4 = mayaBillersFragment2.f13375q0;
                if (lottieAnimationView4 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                lottieAnimationView4.setProgress(0.0f);
                ((MayaBillersFragment) ((ga.b) fVar2.c.get())).y0 = false;
                return;
        }
    }
}
