package A7;

import G7.E;
import N5.C0443c1;
import android.os.Handler;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.C;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.Profile;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import v5.C2342a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Ch.c, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f242b;

    public /* synthetic */ v(A a8, int i) {
        this.f241a = i;
        this.f242b = a8;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f241a) {
            case 0:
                String message = (String) obj;
                kotlin.jvm.internal.j.g(message, "message");
                A a8 = this.f242b;
                if (a8.f183d.b() == null) {
                    MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) a8.c.get());
                    mayaWalletFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaWalletFragment, 200, null, null, new E(mayaWalletFragment, 8), 30);
                } else {
                    ((MayaWalletFragment) ((F7.s) a8.c.get())).L1();
                }
                if (C2576A.H(message)) {
                    MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((F7.s) a8.c.get());
                    mayaWalletFragment2.f12250o1.removeCallbacksAndMessages(null);
                    C0443c1 c0443c1 = mayaWalletFragment2.f12223L0;
                    if (c0443c1 != null) {
                        c0443c1.f4070b.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mViewError");
                        throw null;
                    }
                }
                MayaWalletFragment mayaWalletFragment3 = (MayaWalletFragment) ((F7.s) a8.c.get());
                mayaWalletFragment3.getClass();
                TextView textView = mayaWalletFragment3.f12224M0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTextViewError");
                    throw null;
                }
                textView.setText(mayaWalletFragment3.getString(R.string.pma_label_dashboard_error, message));
                AutoTransition autoTransition = new AutoTransition();
                ConstraintLayout constraintLayout = mayaWalletFragment3.f12252q0;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.j.n("mContainer");
                    throw null;
                }
                TransitionManager.beginDelayedTransition(constraintLayout, autoTransition);
                C0443c1 c0443c12 = mayaWalletFragment3.f12223L0;
                if (c0443c12 == null) {
                    kotlin.jvm.internal.j.n("mViewError");
                    throw null;
                }
                c0443c12.f4070b.setVisibility(0);
                Handler handler = mayaWalletFragment3.f12250o1;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new B5.g(4, mayaWalletFragment3, autoTransition), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                return;
            default:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((MayaWalletFragment) ((F7.s) this.f242b.c.get())).T1();
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Profile information = (Profile) obj;
        kotlin.jvm.internal.j.g(information, "information");
        this.f242b.o();
        return Ah.p.c(new C2342a(information));
    }
}
