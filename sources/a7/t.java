package A7;

import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.J;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.CreditWalletBanner;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import java.util.List;
import s.AbstractC2217b;
import v5.C2342a;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements Ch.f, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f238b;

    public /* synthetic */ t(A a8, int i) {
        this.f237a = i;
        this.f238b = a8;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    @Override // Ch.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.t.accept(java.lang.Object):void");
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        int iV;
        switch (this.f237a) {
            case 0:
                AccountBalance information = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(information, "information");
                this.f238b.getClass();
                return Ah.p.c(new C2342a(information));
            case 1:
                CreditWalletBanner creditWalletBanner = (CreditWalletBanner) obj;
                kotlin.jvm.internal.j.g(creditWalletBanner, "creditWalletBanner");
                A a8 = this.f238b;
                a8.f192s = creditWalletBanner;
                String status = creditWalletBanner.getStatus();
                kotlin.jvm.internal.j.g(status, "status");
                try {
                    iV = AbstractC1213b.V(status);
                    break;
                } catch (IllegalArgumentException unused) {
                    iV = 0;
                }
                int i = iV == 0 ? -1 : s.f236a[AbstractC2217b.c(iV)];
                if (i == 1 || i == 2) {
                    F7.s sVar = (F7.s) a8.c.get();
                    double availableCredit = creditWalletBanner.getCreditWalletBannerDetails().getAvailableCredit();
                    MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) sVar;
                    ConstraintLayout constraintLayout = mayaWalletFragment.f12236a1;
                    if (constraintLayout == null) {
                        kotlin.jvm.internal.j.n("mConstraintLayoutCreditBanner");
                        throw null;
                    }
                    constraintLayout.setVisibility(0);
                    Button button = mayaWalletFragment.f12237b1;
                    if (button == null) {
                        kotlin.jvm.internal.j.n("mButtonCreditBanner");
                        throw null;
                    }
                    button.setVisibility(8);
                    AppCompatTextView appCompatTextView = mayaWalletFragment.f12239d1;
                    if (appCompatTextView == null) {
                        kotlin.jvm.internal.j.n("mTextViewCreditHeaderMain");
                        throw null;
                    }
                    appCompatTextView.setVisibility(0);
                    AppCompatTextView appCompatTextView2 = mayaWalletFragment.f12240e1;
                    if (appCompatTextView2 == null) {
                        kotlin.jvm.internal.j.n("mTextViewCreditHeaderSub");
                        throw null;
                    }
                    appCompatTextView2.setVisibility(0);
                    ImageView imageView = mayaWalletFragment.f12241f1;
                    if (imageView == null) {
                        kotlin.jvm.internal.j.n("mImageViewCreditChevron");
                        throw null;
                    }
                    imageView.setVisibility(0);
                    AppCompatTextView appCompatTextView3 = mayaWalletFragment.f12239d1;
                    if (appCompatTextView3 == null) {
                        kotlin.jvm.internal.j.n("mTextViewCreditHeaderMain");
                        throw null;
                    }
                    appCompatTextView3.setText(mayaWalletFragment.getString(R.string.maya_currency_symbol_with_amount_value, J.f10420a.format(availableCredit)));
                    AppCompatTextView appCompatTextView4 = mayaWalletFragment.f12238c1;
                    if (appCompatTextView4 == null) {
                        kotlin.jvm.internal.j.n("mTextViewCreditBannerSub");
                        throw null;
                    }
                    appCompatTextView4.setText(mayaWalletFragment.getString(R.string.maya_label_dashboard_credit_banner_sub_active));
                } else if (i != 3) {
                    ((MayaWalletFragment) ((F7.s) a8.c.get())).T1();
                } else {
                    MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((F7.s) a8.c.get());
                    ConstraintLayout constraintLayout2 = mayaWalletFragment2.f12236a1;
                    if (constraintLayout2 == null) {
                        kotlin.jvm.internal.j.n("mConstraintLayoutCreditBanner");
                        throw null;
                    }
                    constraintLayout2.setVisibility(0);
                    Button button2 = mayaWalletFragment2.f12237b1;
                    if (button2 == null) {
                        kotlin.jvm.internal.j.n("mButtonCreditBanner");
                        throw null;
                    }
                    button2.setVisibility(0);
                    AppCompatTextView appCompatTextView5 = mayaWalletFragment2.f12239d1;
                    if (appCompatTextView5 == null) {
                        kotlin.jvm.internal.j.n("mTextViewCreditHeaderMain");
                        throw null;
                    }
                    appCompatTextView5.setVisibility(8);
                    AppCompatTextView appCompatTextView6 = mayaWalletFragment2.f12240e1;
                    if (appCompatTextView6 == null) {
                        kotlin.jvm.internal.j.n("mTextViewCreditHeaderSub");
                        throw null;
                    }
                    appCompatTextView6.setVisibility(8);
                    ImageView imageView2 = mayaWalletFragment2.f12241f1;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.j.n("mImageViewCreditChevron");
                        throw null;
                    }
                    imageView2.setVisibility(8);
                    AppCompatTextView appCompatTextView7 = mayaWalletFragment2.f12238c1;
                    if (appCompatTextView7 == null) {
                        kotlin.jvm.internal.j.n("mTextViewCreditBannerSub");
                        throw null;
                    }
                    appCompatTextView7.setText(mayaWalletFragment2.getString(R.string.maya_label_dashboard_credit_banner_sub_apply));
                }
                return Ah.p.c(new C2342a(new CreditResponse(creditWalletBanner.getCreditApplication(), null, creditWalletBanner.getCreditAccount())));
            default:
                List information2 = (List) obj;
                kotlin.jvm.internal.j.g(information2, "information");
                this.f238b.getClass();
                return Ah.p.c(new C2342a(information2));
        }
    }
}
