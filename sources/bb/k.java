package Bb;

import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import java.util.List;
import yb.C2518b;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f409b;

    public /* synthetic */ k(n nVar, int i) {
        this.f408a = i;
        this.f409b = nVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        String strMValue;
        switch (this.f408a) {
            case 0:
                Transfer transfer = (Transfer) obj;
                kotlin.jvm.internal.j.g(transfer, "transfer");
                this.f409b.y(transfer);
                return;
            case 1:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                n nVar = this.f409b;
                nVar.f(it, true);
                MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
                TextView textView = mayaSendMoneyFragment.y0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTextViewMyFavoritesLabel");
                    throw null;
                }
                textView.setText(mayaSendMoneyFragment.getString(R.string.maya_label_my_favorites));
                TextView textView2 = ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).y0;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewMyFavoritesLabel");
                    throw null;
                }
            case 2:
                FavoriteDetails it2 = (FavoriteDetails) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                n nVar2 = this.f409b;
                ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13799a1 = it2;
                Transfer transferFromFavoriteDetails = Transfer.fromFavoriteDetails(it2);
                TransferRecipient transferRecipientMTransferRecipient = transferFromFavoriteDetails.mTransferRecipient();
                if (transferRecipientMTransferRecipient == null || (strMValue = transferRecipientMTransferRecipient.mValue()) == null) {
                    strMValue = "";
                }
                nVar2.u(strMValue);
                Amount amountMTransferAmount = transferFromFavoriteDetails.mTransferAmount();
                nVar2.s(amountMTransferAmount != null ? amountMTransferAmount.mValue() : null);
                nVar2.t(transferFromFavoriteDetails.mMessage());
                ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).L1();
                return;
            default:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                n nVar3 = this.f409b;
                nVar3.getClass();
                MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) nVar3.c.get());
                mayaSendMoneyFragment2.getClass();
                C2518b c2518b = mayaSendMoneyFragment2.f13806p0;
                if (c2518b == null) {
                    kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                    throw null;
                }
                c2518b.c = p02;
                c2518b.notifyDataSetChanged();
                MayaSendMoneyFragment mayaSendMoneyFragment3 = (MayaSendMoneyFragment) ((Fb.c) nVar3.c.get());
                LottieAnimationView lottieAnimationView = mayaSendMoneyFragment3.f13792T0;
                if (lottieAnimationView == null) {
                    kotlin.jvm.internal.j.n("mLottieAnimationViewThemeLoading");
                    throw null;
                }
                lottieAnimationView.setVisibility(8);
                Group group = mayaSendMoneyFragment3.f13790Q0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mConstraintGroupThemeDesignSelection");
                    throw null;
                }
                group.setVisibility(0);
                Group group2 = mayaSendMoneyFragment3.R0;
                if (group2 == null) {
                    kotlin.jvm.internal.j.n("mConstraintGroupThemePreviewFailed");
                    throw null;
                }
                group2.setVisibility(8);
                Decoration decorationR1 = ((MayaSendMoneyFragment) ((Fb.c) nVar3.c.get())).R1();
                if (decorationR1 != null) {
                    C2518b c2518b2 = ((MayaSendMoneyFragment) ((Fb.c) nVar3.c.get())).f13806p0;
                    if (c2518b2 == null) {
                        kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                        throw null;
                    }
                    c2518b2.e(decorationR1);
                    nVar3.w();
                    return;
                }
                return;
        }
    }
}
