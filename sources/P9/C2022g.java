package p9;

import G5.InterfaceC0254d;
import android.widget.Button;
import androidx.camera.video.AudioStats;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;

/* JADX INFO: renamed from: p9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2022g implements InterfaceC0254d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f19080b;
    public final /* synthetic */ MayaBaseLoadingFragment c;

    public /* synthetic */ C2022g(MayaBaseLoadingFragment mayaBaseLoadingFragment, double d10, int i) {
        this.f19079a = i;
        this.c = mayaBaseLoadingFragment;
        this.f19080b = d10;
    }

    @Override // G5.InterfaceC0254d
    public final void T() {
        double d10 = this.f19080b;
        MayaBaseLoadingFragment mayaBaseLoadingFragment = this.c;
        switch (this.f19079a) {
            case 0:
                MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) mayaBaseLoadingFragment;
                if (Double.parseDouble(mayaMerchantPaymentFragment.P1()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    MayaInputLayout mayaInputLayout = mayaMerchantPaymentFragment.f12879r0;
                    if (mayaInputLayout == null) {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                    mayaInputLayout.getHelperInfoSpielTextView().setVisibility(0);
                    MayaInputLayout mayaInputLayout2 = mayaMerchantPaymentFragment.f12879r0;
                    if (mayaInputLayout2 == null) {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                    mayaInputLayout2.getHelperInfoSpielTextView().setText(mayaMerchantPaymentFragment.getString(R.string.maya_error_insufficient_funds, Double.valueOf(d10)));
                }
                Button button = mayaMerchantPaymentFragment.f12878q0;
                if (button != null) {
                    button.setEnabled(false);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mContinueButton");
                    throw null;
                }
            default:
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) mayaBaseLoadingFragment;
                if (Double.parseDouble(mayaQRPHMerchantPaymentFragment.P1()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    MayaInputLayout mayaInputLayout3 = mayaQRPHMerchantPaymentFragment.f12912r0;
                    if (mayaInputLayout3 == null) {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                    mayaInputLayout3.getHelperInfoSpielTextView().setVisibility(0);
                    MayaInputLayout mayaInputLayout4 = mayaQRPHMerchantPaymentFragment.f12912r0;
                    if (mayaInputLayout4 == null) {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                    mayaInputLayout4.getHelperInfoSpielTextView().setText(mayaQRPHMerchantPaymentFragment.getString(R.string.maya_error_insufficient_funds, Double.valueOf(d10)));
                }
                Button button2 = mayaQRPHMerchantPaymentFragment.f12913s0;
                if (button2 != null) {
                    button2.setEnabled(false);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mContinueButton");
                    throw null;
                }
        }
    }

    @Override // G5.InterfaceC0254d
    public final void u() {
        switch (this.f19079a) {
            case 0:
                MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) this.c;
                MayaInputLayout mayaInputLayout = mayaMerchantPaymentFragment.f12879r0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mAmountMayaInput");
                    throw null;
                }
                mayaInputLayout.getHelperInfoSpielTextView().setVisibility(8);
                Button button = mayaMerchantPaymentFragment.f12878q0;
                if (button != null) {
                    button.setEnabled(true);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mContinueButton");
                    throw null;
                }
            default:
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) this.c;
                MayaInputLayout mayaInputLayout2 = mayaQRPHMerchantPaymentFragment.f12912r0;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mAmountMayaInput");
                    throw null;
                }
                mayaInputLayout2.getHelperInfoSpielTextView().setVisibility(8);
                Button button2 = mayaQRPHMerchantPaymentFragment.f12913s0;
                if (button2 != null) {
                    button2.setEnabled(true);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mContinueButton");
                    throw null;
                }
        }
    }
}
