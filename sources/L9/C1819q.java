package l9;

import android.text.Editable;
import android.widget.Button;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1268k0;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.T;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import d4.AbstractC1331a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p9.InterfaceC2029n;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import y5.s;
import zj.C2576A;

/* JADX INFO: renamed from: l9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1819q extends AbstractC2509a implements k9.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f18283d;
    public final C1268k0 e;
    public final C1247a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819q(com.paymaya.data.preference.a mPreference, C1268k0 c1268k0, C1247a c1247a, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f18283d = mPreference;
        this.e = c1268k0;
        this.f = c1247a;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = ((MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get())).f12914v0;
        if (qRPHMerchantPaymentRequest == null) {
            kotlin.jvm.internal.j.n("mQRPHMerchantPaymentRequest");
            throw null;
        }
        o9.j jVar = (o9.j) this.c.get();
        String name = qRPHMerchantPaymentRequest.getMerchantDetails().getName();
        MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) jVar;
        mayaQRPHMerchantPaymentFragment.getClass();
        kotlin.jvm.internal.j.g(name, "name");
        TextView textView = mayaQRPHMerchantPaymentFragment.f12911q0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mMerchantInfoTextView");
            throw null;
        }
        textView.setText(name);
        if (this.f18283d.e().isQrWithCheckoutFlowEnabled()) {
            MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment2 = (MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get());
            Button button = mayaQRPHMerchantPaymentFragment2.f12913s0;
            if (button != null) {
                button.setText(mayaQRPHMerchantPaymentFragment2.getString(R.string.maya_label_pay));
                return;
            } else {
                kotlin.jvm.internal.j.n("mContinueButton");
                throw null;
            }
        }
        MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment3 = (MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get());
        Button button2 = mayaQRPHMerchantPaymentFragment3.f12913s0;
        if (button2 != null) {
            button2.setText(mayaQRPHMerchantPaymentFragment3.getString(R.string.maya_label_continue));
        } else {
            kotlin.jvm.internal.j.n("mContinueButton");
            throw null;
        }
    }

    public final double k() {
        MayaInputLayout mayaInputLayout = ((MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get())).f12912r0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mAmountMayaInput");
            throw null;
        }
        Editable text = mayaInputLayout.getInputEditText().getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "0";
        }
        return C.q0(new zj.o("[^0-9,.]\\s*").f("", string)).doubleValue();
    }

    public final void l() {
        ((MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get())).O1();
        e(new Lh.d(new Lh.d(new Lh.h(this.f.a(), zh.b.a(), 0), new T(this, 25), 2), new L(this, 26), 0).e());
    }

    public final void m(String str) {
        if (C2576A.H(str) || Double.parseDouble(str) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            Button button = ((MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get())).f12913s0;
            if (button != null) {
                button.setEnabled(false);
                return;
            } else {
                kotlin.jvm.internal.j.n("mContinueButton");
                throw null;
            }
        }
        Button button2 = ((MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get())).f12913s0;
        if (button2 != null) {
            button2.setEnabled(true);
        } else {
            kotlin.jvm.internal.j.n("mContinueButton");
            throw null;
        }
    }

    public final void n(PayMayaError payMayaError) {
        s sVar = (o9.j) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(12);
        c1219hH.t(EnumC1217f.CREATE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(Constants.REASON, payMayaError.mSpiel());
        c1219hH.i();
        ((MayaBaseFragment) sVar).A1(c1219hH);
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        if (payMayaError.mErrorCode() == -337) {
            InterfaceC2029n interfaceC2029n = ((MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get())).t0;
            if (interfaceC2029n != null) {
                ((MayaQRPHMerchantActivity) interfaceC2029n).f2();
                return;
            }
            return;
        }
        MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get());
        mayaQRPHMerchantPaymentFragment.getClass();
        InterfaceC2029n interfaceC2029n2 = mayaQRPHMerchantPaymentFragment.t0;
        if (interfaceC2029n2 != null) {
            ((MayaQRPHMerchantActivity) interfaceC2029n2).a(payMayaError, mayaQRPHMerchantPaymentFragment.getString(R.string.pma_toast_error_title_merchant_payment_error));
        }
    }

    public final void o() {
        int i = 5;
        int i4 = 2;
        int i6 = 0;
        Amount amountBuild = Amount.sBuilder().mCurrency("PHP").mValue(String.valueOf(k())).build();
        QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = ((MayaQRPHMerchantPaymentFragment) ((o9.j) this.c.get())).f12914v0;
        if (qRPHMerchantPaymentRequest == null) {
            kotlin.jvm.internal.j.n("mQRPHMerchantPaymentRequest");
            throw null;
        }
        qRPHMerchantPaymentRequest.setAmount(amountBuild);
        ((MayaBaseFragment) ((o9.j) this.c.get())).D1();
        if (this.f18283d.e().isQrWithCheckoutFlowEnabled()) {
            Ah.p pVarB = this.e.b(qRPHMerchantPaymentRequest);
            e(new Kh.T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarB, pVarB, zh.b.a()), new C1817o(this, i6), i4), new C1818p(this, 0), i6), new C1816n(this, 0)).e());
        } else {
            Ah.p pVarA = this.e.a(qRPHMerchantPaymentRequest);
            e(new Kh.T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new A0(this, 22), i4), new C1258f0(this, 23), i6), new C1816n(this, 1)).e());
        }
    }
}
