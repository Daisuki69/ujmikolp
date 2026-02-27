package L9;

import G5.C0256f;
import Kh.T;
import Q9.InterfaceC0578h;
import android.widget.Button;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.Y;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;
import defpackage.AbstractC1414e;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.Pair;
import o1.AbstractC1955a;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.domain.store.C f2896d;
    public final C1264i0 e;
    public final Y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K f2897g;
    public final com.paymaya.data.preference.a h;
    public final S5.c i;
    public CreditAccount j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2899l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2901o;

    public l(com.paymaya.domain.store.C c, C1264i0 c1264i0, Y y7, K k8, com.paymaya.data.preference.a aVar, S5.c cVar, Uh.d dVar) {
        super(dVar);
        this.f2896d = c;
        this.e = c1264i0;
        this.f = y7;
        this.f2897g = k8;
        this.h = aVar;
        this.i = cVar;
        this.f2898k = true;
        this.m = true;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        this.f2900n = string;
        this.f2901o = S5.c.b(cVar, A5.b.f80U);
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        CreditResponse creditResponse;
        super.j();
        MayaCreditTransferFragment mayaCreditTransferFragment = (MayaCreditTransferFragment) ((P9.d) this.c.get());
        mayaCreditTransferFragment.L1();
        MayaInputLayout mayaInputLayout = mayaCreditTransferFragment.f13124s0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
            throw null;
        }
        mayaInputLayout.c();
        InterfaceC0578h interfaceC0578h = ((MayaCreditTransferFragment) ((P9.d) this.c.get())).f13125v0;
        CreditAccount creditAccount = (interfaceC0578h == null || (creditResponse = (CreditResponse) ((NewMayaCreditActivity) interfaceC0578h).X1().j) == null) ? null : creditResponse.getCreditAccount();
        this.j = creditAccount;
        if (creditAccount != null) {
            P9.d dVar = (P9.d) this.c.get();
            String formattedAvailableBalanceValue = creditAccount.getFormattedAvailableBalanceValue();
            MayaCreditTransferFragment mayaCreditTransferFragment2 = (MayaCreditTransferFragment) dVar;
            TextView textView = mayaCreditTransferFragment2.f13122q0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewAvailableCreditInfo");
                throw null;
            }
            textView.setText(mayaCreditTransferFragment2.getString(R.string.maya_label_transfer_to_wallet_credit_limit, formattedAvailableBalanceValue));
            P9.d dVar2 = (P9.d) this.c.get();
            double availableValue = creditAccount.getAvailableValue();
            MayaCreditTransferFragment mayaCreditTransferFragment3 = (MayaCreditTransferFragment) dVar2;
            mayaCreditTransferFragment3.getClass();
            MayaInputLayout mayaInputLayout2 = mayaCreditTransferFragment3.f13124s0;
            if (mayaInputLayout2 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
                throw null;
            }
            C0256f c0256f = new C0256f(mayaInputLayout2.getInputEditText(), AudioStats.AUDIO_AMPLITUDE_NONE, availableValue);
            String string = mayaCreditTransferFragment3.getString(R.string.maya_php_currency);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            c0256f.f1741o = string;
            c0256f.f1740n = null;
            c0256f.m = mayaCreditTransferFragment3;
            mayaCreditTransferFragment3.t0 = c0256f;
            MayaInputLayout mayaInputLayout3 = mayaCreditTransferFragment3.f13124s0;
            if (mayaInputLayout3 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
                throw null;
            }
            mayaInputLayout3.getInputEditText().addTextChangedListener(c0256f);
            if (creditAccount.getAvailableValue() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                ((MayaCreditTransferFragment) ((P9.d) this.c.get())).R1();
                ((MayaCreditTransferFragment) ((P9.d) this.c.get())).T1();
                this.f2898k = false;
            }
            String str = "**** **** " + creditAccount.getPromissoryNoteNumber().substring(r0.length() - 4);
            TextView textView2 = ((MayaCreditTransferFragment) ((P9.d) this.c.get())).f13123r0;
            if (textView2 != null) {
                textView2.setText(str);
            } else {
                kotlin.jvm.internal.j.n("mTextViewPromissoryNoteNumber");
                throw null;
            }
        }
    }

    public final void k() {
        K.d(this.f2897g, new Ag.j(this, 6));
    }

    public final void l() {
        String id;
        String currencyCode;
        CreditAccount creditAccount = this.j;
        if (creditAccount == null || (id = creditAccount.getId()) == null) {
            return;
        }
        CreditAccount creditAccount2 = this.j;
        String formatNoteNumberValue = creditAccount2 != null ? creditAccount2.getFormatNoteNumberValue() : null;
        CreditAccount creditAccount3 = this.j;
        if (creditAccount3 == null || (currencyCode = creditAccount3.getCurrencyCode()) == null) {
            currencyCode = "";
        }
        MayaInputLayout mayaInputLayout = ((MayaCreditTransferFragment) ((P9.d) this.c.get())).f13124s0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
            throw null;
        }
        String strG = AbstractC1414e.g(mayaInputLayout);
        String string = ((MayaCreditTransferFragment) ((P9.d) this.c.get())).getString(R.string.maya_php_currency);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        new T(5, new Lh.d(new Lh.d(new Lh.f(new Lh.h(this.f2896d.a(), zh.b.a(), 0), new k(this, id, currencyCode, C2576A.b0(com.paymaya.common.utility.C.p0(zj.z.t(strG, string, ""))).toString()), 0), new k(this, id, formatNoteNumberValue, this.f.a()), 2), new Gb.d(this, 8), 0), new G7.t(this, 15)).e();
    }

    public final void m() {
        P9.d dVar = (P9.d) this.c.get();
        String strA = com.paymaya.common.utility.C.a(42, AbstractC1213b.z(3));
        kotlin.jvm.internal.j.f(strA, "requested(...)");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        ((MayaCreditTransferFragment) dVar).Q1(strA, M.h(new Pair("source_page", "TRANSFER_CREDIT"), new Pair("source_button", "Continue")));
        MayaCreditTransferFragment mayaCreditTransferFragment = (MayaCreditTransferFragment) ((P9.d) this.c.get());
        mayaCreditTransferFragment.getClass();
        LinkedHashSet linkedHashSet = com.paymaya.common.utility.E.f10412a;
        com.paymaya.common.utility.E.a(mayaCreditTransferFragment.getClass().getSimpleName(), "getLocationPermissionObservable");
        Kh.B bE = AbstractC1955a.q(mayaCreditTransferFragment).e(zh.b.a());
        Gh.f fVar = new Gh.f(new G6.v(this, 10), Eh.d.f1366d);
        bE.g(fVar);
        e(fVar);
    }

    public final void n() {
        if (!this.f2898k) {
            ((MayaCreditTransferFragment) ((P9.d) this.c.get())).R1();
            ((MayaCreditTransferFragment) ((P9.d) this.c.get())).T1();
            return;
        }
        if (!this.f2899l) {
            MayaCreditTransferFragment mayaCreditTransferFragment = (MayaCreditTransferFragment) ((P9.d) this.c.get());
            MayaInputLayout mayaInputLayout = mayaCreditTransferFragment.f13124s0;
            if (mayaInputLayout == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
                throw null;
            }
            mayaInputLayout.getHelperErrorSpielTextView().setVisibility(0);
            MayaInputLayout mayaInputLayout2 = mayaCreditTransferFragment.f13124s0;
            if (mayaInputLayout2 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
                throw null;
            }
            mayaInputLayout2.getHelperErrorSpielTextView().setText(mayaCreditTransferFragment.getString(R.string.maya_label_transfer_to_wallet_invalid_amount));
            ((MayaCreditTransferFragment) ((P9.d) this.c.get())).T1();
            return;
        }
        if (!this.m) {
            MayaCreditTransferFragment mayaCreditTransferFragment2 = (MayaCreditTransferFragment) ((P9.d) this.c.get());
            MayaInputLayout mayaInputLayout3 = mayaCreditTransferFragment2.f13124s0;
            if (mayaInputLayout3 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
                throw null;
            }
            mayaInputLayout3.getHelperErrorSpielTextView().setVisibility(0);
            MayaInputLayout mayaInputLayout4 = mayaCreditTransferFragment2.f13124s0;
            if (mayaInputLayout4 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
                throw null;
            }
            mayaInputLayout4.getHelperErrorSpielTextView().setText(mayaCreditTransferFragment2.getString(R.string.maya_label_transfer_to_wallet_exceed_limit));
            ((MayaCreditTransferFragment) ((P9.d) this.c.get())).T1();
            return;
        }
        MayaCreditTransferFragment mayaCreditTransferFragment3 = (MayaCreditTransferFragment) ((P9.d) this.c.get());
        MayaInputLayout mayaInputLayout5 = mayaCreditTransferFragment3.f13124s0;
        if (mayaInputLayout5 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
            throw null;
        }
        mayaInputLayout5.getHelperErrorSpielTextView().setVisibility(8);
        MayaInputLayout mayaInputLayout6 = mayaCreditTransferFragment3.f13124s0;
        if (mayaInputLayout6 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutTransferAmount");
            throw null;
        }
        mayaInputLayout6.f();
        Button button = mayaCreditTransferFragment3.f13121p0;
        if (button != null) {
            button.setEnabled(true);
        } else {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
    }
}
