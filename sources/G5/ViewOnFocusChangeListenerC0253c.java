package G5;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.AudioStats;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l9.C1809g;
import l9.C1819q;
import p9.C2022g;
import zj.C2576A;

/* JADX INFO: renamed from: G5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0253c implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1730b;

    public /* synthetic */ ViewOnFocusChangeListenerC0253c(Object obj, int i) {
        this.f1729a = i;
        this.f1730b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        Amount amountMAvailableBalance;
        String strMValue;
        Amount amountMAvailableBalance2;
        String strMValue2;
        String str = "0";
        Object[] objArr = 0;
        char c = 1;
        char c10 = 1;
        switch (this.f1729a) {
            case 0:
                if (z4) {
                    return;
                }
                ((C0256f) this.f1730b).a();
                return;
            case 1:
                if (z4) {
                    int i = KycMayaInputLayout.f12692y;
                    return;
                } else {
                    boolean z5 = ((KycMayaInputLayout) this.f1730b).m;
                    return;
                }
            case 2:
                Function1 function1 = (Function1) this.f1730b;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z4));
                    return;
                }
                return;
            case 3:
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) this.f1730b;
                if (mayaProfileInputLayout.f12082h0 && !z4) {
                    mayaProfileInputLayout.getInputEditText().setText(AbstractC1213b.M("\\s+", C2576A.b0(String.valueOf(mayaProfileInputLayout.getInputEditText().getText())).toString(), Global.BLANK));
                }
                Function2 function2 = mayaProfileInputLayout.f12076b0;
                if (function2 != null) {
                    kotlin.jvm.internal.j.d(view);
                    function2.invoke(view, Boolean.valueOf(z4));
                    return;
                }
                return;
            case 4:
                if (z4) {
                    com.paymaya.common.utility.C.R(((MayaShopPaymentFragment) this.f1730b).getActivity());
                    return;
                }
                return;
            case 5:
                if (z4) {
                    return;
                }
                MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) this.f1730b;
                AppCompatEditText appCompatEditText = mayaPayBillsFormFragment.f13436s0;
                if (appCompatEditText == null) {
                    kotlin.jvm.internal.j.n("mEditTextAccountNumber");
                    throw null;
                }
                appCompatEditText.setText(appCompatEditText.getText());
                AppCompatEditText appCompatEditText2 = mayaPayBillsFormFragment.f13436s0;
                if (appCompatEditText2 != null) {
                    appCompatEditText2.setOnFocusChangeListener(null);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mEditTextAccountNumber");
                    throw null;
                }
            case 6:
                if (z4) {
                    return;
                }
                MayaInputLayout mayaInputLayout = (MayaInputLayout) this.f1730b;
                mayaInputLayout.getInputEditText().setText(mayaInputLayout.getInputEditText().getText());
                mayaInputLayout.getInputEditText().setOnFocusChangeListener(null);
                return;
            case 7:
                C1809g c1809g = (C1809g) ((MayaMerchantPaymentFragment) this.f1730b).Q1();
                if (!z4) {
                    MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) ((o9.d) c1809g.c.get());
                    MayaInputLayout mayaInputLayout2 = mayaMerchantPaymentFragment.f12879r0;
                    if (mayaInputLayout2 == null) {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                    mayaInputLayout2.getInputEditText().removeTextChangedListener(mayaMerchantPaymentFragment.u0);
                    String strP1 = ((MayaMerchantPaymentFragment) ((o9.d) c1809g.c.get())).P1();
                    ((o9.d) c1809g.c.get()).getClass();
                    String strT = zj.z.t(zj.z.t(strP1, "₱ ", ""), ",", "");
                    if (C2576A.H(strT) || Double.compare(c1809g.l(strT), AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
                        return;
                    }
                    MayaMerchantPaymentFragment mayaMerchantPaymentFragment2 = (MayaMerchantPaymentFragment) ((o9.d) c1809g.c.get());
                    mayaMerchantPaymentFragment2.getClass();
                    MayaInputLayout mayaInputLayout3 = mayaMerchantPaymentFragment2.f12879r0;
                    if (mayaInputLayout3 != null) {
                        mayaInputLayout3.getInputEditText().setText("");
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                }
                if (c1809g.f18264d.e().isQrWithCheckoutFlowEnabled()) {
                    MayaMerchantPaymentFragment mayaMerchantPaymentFragment3 = (MayaMerchantPaymentFragment) ((o9.d) c1809g.c.get());
                    ((C1809g) mayaMerchantPaymentFragment3.Q1()).n(mayaMerchantPaymentFragment3.P1());
                    MayaInputLayout mayaInputLayout4 = mayaMerchantPaymentFragment3.f12879r0;
                    if (mayaInputLayout4 == null) {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                    C0256f c0256f = new C0256f(mayaInputLayout4.getInputEditText());
                    String string = mayaMerchantPaymentFragment3.getString(R.string.maya_php_currency);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    c0256f.f1741o = string;
                    c0256f.m = new com.google.firebase.messaging.p(mayaMerchantPaymentFragment3, 29);
                    mayaMerchantPaymentFragment3.u0 = c0256f;
                    MayaInputLayout mayaInputLayout5 = mayaMerchantPaymentFragment3.f12879r0;
                    if (mayaInputLayout5 != null) {
                        mayaInputLayout5.getInputEditText().addTextChangedListener(c0256f);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                }
                o9.d dVar = (o9.d) c1809g.c.get();
                AccountBalance accountBalanceB = c1809g.f.b();
                if (accountBalanceB != null && (amountMAvailableBalance = accountBalanceB.mAvailableBalance()) != null && (strMValue = amountMAvailableBalance.mValue()) != null) {
                    str = strMValue;
                }
                double dL = c1809g.l(str);
                MayaMerchantPaymentFragment mayaMerchantPaymentFragment4 = (MayaMerchantPaymentFragment) dVar;
                mayaMerchantPaymentFragment4.getClass();
                if (!C2576A.H(mayaMerchantPaymentFragment4.P1())) {
                    Button button = mayaMerchantPaymentFragment4.f12878q0;
                    if (button == null) {
                        kotlin.jvm.internal.j.n("mContinueButton");
                        throw null;
                    }
                    button.setEnabled(Double.parseDouble(mayaMerchantPaymentFragment4.P1()) > AudioStats.AUDIO_AMPLITUDE_NONE);
                }
                MayaInputLayout mayaInputLayout6 = mayaMerchantPaymentFragment4.f12879r0;
                if (mayaInputLayout6 == null) {
                    kotlin.jvm.internal.j.n("mAmountMayaInput");
                    throw null;
                }
                C0256f c0256f2 = new C0256f(mayaInputLayout6.getInputEditText(), 0.1d, dL);
                String string2 = mayaMerchantPaymentFragment4.getString(R.string.maya_php_currency);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                c0256f2.f1741o = string2;
                c0256f2.m = new C2022g(mayaMerchantPaymentFragment4, dL, objArr == true ? 1 : 0);
                mayaMerchantPaymentFragment4.u0 = c0256f2;
                MayaInputLayout mayaInputLayout7 = mayaMerchantPaymentFragment4.f12879r0;
                if (mayaInputLayout7 != null) {
                    mayaInputLayout7.getInputEditText().addTextChangedListener(c0256f2);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mAmountMayaInput");
                    throw null;
                }
            case 8:
                C1819q c1819q = (C1819q) ((MayaQRPHMerchantPaymentFragment) this.f1730b).Q1();
                if (!z4) {
                    MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) ((o9.j) c1819q.c.get());
                    MayaInputLayout mayaInputLayout8 = mayaQRPHMerchantPaymentFragment.f12912r0;
                    if (mayaInputLayout8 == null) {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                    mayaInputLayout8.getInputEditText().removeTextChangedListener(mayaQRPHMerchantPaymentFragment.u0);
                    if (c1819q.k() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                        MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment2 = (MayaQRPHMerchantPaymentFragment) ((o9.j) c1819q.c.get());
                        mayaQRPHMerchantPaymentFragment2.getClass();
                        MayaInputLayout mayaInputLayout9 = mayaQRPHMerchantPaymentFragment2.f12912r0;
                        if (mayaInputLayout9 != null) {
                            mayaInputLayout9.getInputEditText().setText("");
                            return;
                        } else {
                            kotlin.jvm.internal.j.n("mAmountMayaInput");
                            throw null;
                        }
                    }
                    return;
                }
                if (c1819q.f18283d.e().isQrWithCheckoutFlowEnabled()) {
                    MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment3 = (MayaQRPHMerchantPaymentFragment) ((o9.j) c1819q.c.get());
                    ((C1819q) mayaQRPHMerchantPaymentFragment3.Q1()).m(mayaQRPHMerchantPaymentFragment3.P1());
                    MayaInputLayout mayaInputLayout10 = mayaQRPHMerchantPaymentFragment3.f12912r0;
                    if (mayaInputLayout10 == null) {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                    C0256f c0256f3 = new C0256f(mayaInputLayout10.getInputEditText());
                    String string3 = mayaQRPHMerchantPaymentFragment3.getString(R.string.maya_php_currency);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    c0256f3.f1741o = string3;
                    c0256f3.m = new p8.a(mayaQRPHMerchantPaymentFragment3, c10 == true ? 1 : 0);
                    mayaQRPHMerchantPaymentFragment3.u0 = c0256f3;
                    MayaInputLayout mayaInputLayout11 = mayaQRPHMerchantPaymentFragment3.f12912r0;
                    if (mayaInputLayout11 != null) {
                        mayaInputLayout11.getInputEditText().addTextChangedListener(c0256f3);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mAmountMayaInput");
                        throw null;
                    }
                }
                o9.j jVar = (o9.j) c1819q.c.get();
                AccountBalance accountBalanceB2 = c1819q.f.b();
                if (accountBalanceB2 != null && (amountMAvailableBalance2 = accountBalanceB2.mAvailableBalance()) != null && (strMValue2 = amountMAvailableBalance2.mValue()) != null) {
                    str = strMValue2;
                }
                double dDoubleValue = com.paymaya.common.utility.C.q0(str).doubleValue();
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment4 = (MayaQRPHMerchantPaymentFragment) jVar;
                if (!C2576A.H(mayaQRPHMerchantPaymentFragment4.P1())) {
                    Button button2 = mayaQRPHMerchantPaymentFragment4.f12913s0;
                    if (button2 == null) {
                        kotlin.jvm.internal.j.n("mContinueButton");
                        throw null;
                    }
                    button2.setEnabled(Double.parseDouble(mayaQRPHMerchantPaymentFragment4.P1()) > AudioStats.AUDIO_AMPLITUDE_NONE);
                }
                MayaInputLayout mayaInputLayout12 = mayaQRPHMerchantPaymentFragment4.f12912r0;
                if (mayaInputLayout12 == null) {
                    kotlin.jvm.internal.j.n("mAmountMayaInput");
                    throw null;
                }
                C0256f c0256f4 = new C0256f(mayaInputLayout12.getInputEditText(), 0.1d, dDoubleValue);
                String string4 = mayaQRPHMerchantPaymentFragment4.getString(R.string.maya_php_currency);
                kotlin.jvm.internal.j.f(string4, "getString(...)");
                c0256f4.f1741o = string4;
                c0256f4.m = new C2022g(mayaQRPHMerchantPaymentFragment4, dDoubleValue, c == true ? 1 : 0);
                mayaQRPHMerchantPaymentFragment4.u0 = c0256f4;
                MayaInputLayout mayaInputLayout13 = mayaQRPHMerchantPaymentFragment4.f12912r0;
                if (mayaInputLayout13 != null) {
                    mayaInputLayout13.getInputEditText().addTextChangedListener(c0256f4);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mAmountMayaInput");
                    throw null;
                }
            case 9:
                if (z4) {
                    ((ShopV3PaymentFragment) this.f1730b).Q1();
                    return;
                }
                return;
            default:
                if (z4) {
                    ((ForcedAutoCompleteTextView) this.f1730b).setText("");
                    return;
                }
                return;
        }
    }
}
