package Bb;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Transfer;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f403b;

    public /* synthetic */ h(n nVar, int i) {
        this.f402a = i;
        this.f403b = nVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f402a) {
            case 0:
                Transfer it = (Transfer) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f403b.y(it);
                return;
            case 1:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                n nVar = this.f403b;
                kotlin.jvm.internal.j.f(nVar.f(it2, true), "mayaErrorHandling(...)");
                MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
                LottieAnimationView lottieAnimationView = mayaSendMoneyFragment.f13792T0;
                if (lottieAnimationView == null) {
                    kotlin.jvm.internal.j.n("mLottieAnimationViewThemeLoading");
                    throw null;
                }
                lottieAnimationView.setVisibility(8);
                Group group = mayaSendMoneyFragment.f13790Q0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mConstraintGroupThemeDesignSelection");
                    throw null;
                }
                group.setVisibility(8);
                Group group2 = mayaSendMoneyFragment.R0;
                if (group2 != null) {
                    group2.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mConstraintGroupThemePreviewFailed");
                    throw null;
                }
            case 2:
                List it3 = (List) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                n nVar2 = this.f403b;
                nVar2.getClass();
                if (it3.isEmpty()) {
                    RecyclerView recyclerView = ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13812z0;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.j.n("mRecyclerViewFavorites");
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                    AppCompatTextView appCompatTextView = ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13777B0;
                    if (appCompatTextView == null) {
                        kotlin.jvm.internal.j.n("mTextViewEmptyFavoritesMessage");
                        throw null;
                    }
                    appCompatTextView.setVisibility(0);
                    TextView textView = ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13776A0;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n("mTextViewFavoritesSeeAll");
                        throw null;
                    }
                    textView.setVisibility(8);
                    ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).W1(0);
                } else {
                    MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) nVar2.c.get());
                    mayaSendMoneyFragment2.getClass();
                    Eb.a aVar = mayaSendMoneyFragment2.u0;
                    if (aVar == null) {
                        kotlin.jvm.internal.j.n("mMayaSendMoneyFavoriteAdapter");
                        throw null;
                    }
                    aVar.submitList(it3);
                    RecyclerView recyclerView2 = ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13812z0;
                    if (recyclerView2 == null) {
                        kotlin.jvm.internal.j.n("mRecyclerViewFavorites");
                        throw null;
                    }
                    recyclerView2.setVisibility(0);
                    TextView textView2 = ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13776A0;
                    if (textView2 == null) {
                        kotlin.jvm.internal.j.n("mTextViewFavoritesSeeAll");
                        throw null;
                    }
                    textView2.setVisibility(0);
                    ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).W1(it3.size());
                }
                ConstraintLayout constraintLayout = ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13778C0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mConstraintLayoutFavoritesLoading");
                    throw null;
                }
            case 3:
                n nVar3 = this.f403b;
                PayMayaError payMayaErrorF = nVar3.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                Fb.c cVar = (Fb.c) nVar3.c.get();
                String strMSpiel = payMayaErrorF.mSpiel();
                MayaSendMoneyFragment mayaSendMoneyFragment3 = (MayaSendMoneyFragment) cVar;
                mayaSendMoneyFragment3.getClass();
                MayaBaseLoadingFragment.N1(mayaSendMoneyFragment3, 200, strMSpiel, null, new Gb.h(0), 28);
                return;
            default:
                Ze.a p02 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                n nVar4 = this.f403b;
                if (!p02.f6934b) {
                    Gb.k kVar = ((MayaSendMoneyFragment) ((Fb.c) nVar4.c.get())).f13810v0;
                    if (kVar != null) {
                        AbstractC1236z.h((MayaSendMoneyActivity) kVar, R.id.fragment_container_frame_layout, new MayaAllowContactsPermissionFragment());
                        return;
                    }
                    return;
                }
                MayaSendMoneyFragment mayaSendMoneyFragment4 = (MayaSendMoneyFragment) ((Fb.c) nVar4.c.get());
                if (mayaSendMoneyFragment4.t1().e().isAppEventV2SendMoneyEnabled()) {
                    mayaSendMoneyFragment4.U1("Contact List", "Contact List Screen");
                }
                Gb.k kVar2 = mayaSendMoneyFragment4.f13810v0;
                if (kVar2 != null) {
                    AbstractC1236z.h((MayaSendMoneyActivity) kVar2, R.id.fragment_container_frame_layout, new MayaContactsSelectionFragment());
                    return;
                }
                return;
        }
    }
}
