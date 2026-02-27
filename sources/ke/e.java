package Ke;

import G5.C0256f;
import Z8.g;
import android.view.KeyEvent;
import android.widget.TextView;
import ba.s;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationUserFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment;
import com.shield.android.view.CaptchaDialog;
import g9.InterfaceC1509d;
import kotlin.jvm.functions.Function1;
import l9.C1809g;
import l9.C1819q;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2651b;

    public /* synthetic */ e(Object obj, int i) {
        this.f2650a = i;
        this.f2651b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f2650a) {
            case 0:
                ((Function1) this.f2651b).invoke(Integer.valueOf(i));
                return i == 2 || i == 5 || i == 6;
            case 1:
                if (i != 6) {
                    return false;
                }
                ((MayaWesternUnionFragment) this.f2651b).G1().k();
                return true;
            case 2:
                return ((CaptchaDialog) this.f2651b).a(textView, i, keyEvent);
            case 3:
                if (i != 6) {
                    return false;
                }
                ((MayaSessionExpiredFragment) this.f2651b).I1().l();
                return true;
            case 4:
                if (i != 6) {
                    return false;
                }
                ((MayaAccountCreationFragment) this.f2651b).L1();
                return true;
            case 5:
                if (i != 6) {
                    return false;
                }
                ((MayaLoginFragment) this.f2651b).J1().o();
                return true;
            case 6:
                MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment = (MayaRegistrationIdentityFragment) this.f2651b;
                if (i != 6) {
                    return false;
                }
                Z8.f fVar = (Z8.f) mayaRegistrationIdentityFragment.J1();
                if (!C2576A.H(((MayaRegistrationIdentityFragment) ((InterfaceC1509d) fVar.c.get())).K1()) && ((MayaRegistrationIdentityFragment) ((InterfaceC1509d) fVar.c.get())).K1().matches("^((\\+?63)|0)?[0-9]{10}$") && ((MayaRegistrationIdentityFragment) ((InterfaceC1509d) fVar.c.get())).L1().length() > 0) {
                    fVar.k();
                }
                return true;
            case 7:
                if (i != 6) {
                    return false;
                }
                g gVar = (g) ((MayaRegistrationUserFragment) this.f2651b).L1();
                if (gVar.k()) {
                    gVar.l();
                }
                return true;
            case 8:
                if (i != 6) {
                    return false;
                }
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) this.f2651b;
                C.R(mayaPayBillsBIRFragment.getActivity());
                ((s) mayaPayBillsBIRFragment.V1()).y();
                return true;
            case 9:
                if (i != 6) {
                    return false;
                }
                MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) this.f2651b;
                C0256f c0256f = mayaMerchantPaymentFragment.u0;
                if (c0256f != null) {
                    c0256f.a();
                }
                ((C1809g) mayaMerchantPaymentFragment.Q1()).k(mayaMerchantPaymentFragment.getString(R.string.pma_label_php));
                return true;
            default:
                if (i != 6) {
                    return false;
                }
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) this.f2651b;
                C0256f c0256f2 = mayaQRPHMerchantPaymentFragment.u0;
                if (c0256f2 != null) {
                    c0256f2.a();
                }
                ((C1819q) mayaQRPHMerchantPaymentFragment.Q1()).o();
                return true;
        }
    }
}
