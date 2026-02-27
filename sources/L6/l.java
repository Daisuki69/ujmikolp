package L6;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import androidx.camera.video.AudioStats;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.AccountLimitAmount;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionFragment;
import com.paymaya.mayaui.cashin.view.widget.MayaCashInAccountLimitSection;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBaseFragment f2837b;

    public /* synthetic */ l(MayaBaseFragment mayaBaseFragment, int i) {
        this.f2836a = i;
        this.f2837b = mayaBaseFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        String string;
        String string2;
        String string3;
        switch (this.f2836a) {
            case 0:
                G6.k kVarR1 = ((MayaCashInCodeFormFragment) this.f2837b).R1();
                if (charSequence == null || (string = charSequence.toString()) == null) {
                    string = "";
                }
                AccountLimitAmount accountLimitAmount = (AccountLimitAmount) kVarR1.m;
                if (accountLimitAmount != null) {
                    double dMRemaining = accountLimitAmount.mRemaining() - com.paymaya.common.utility.C.q0(string).doubleValue();
                    if (dMRemaining >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                        K6.f fVar = (K6.f) kVarR1.c.get();
                        String strU = com.paymaya.common.utility.C.u(Double.valueOf(dMRemaining));
                        MayaCashInAccountLimitSection mayaCashInAccountLimitSection = ((MayaCashInCodeFormFragment) fVar).t0;
                        if (mayaCashInAccountLimitSection == null) {
                            kotlin.jvm.internal.j.n("mMayaCashInAccountLimitSection");
                            throw null;
                        }
                        mayaCashInAccountLimitSection.setRemainingValue(strU);
                        MayaCashInAccountLimitSection mayaCashInAccountLimitSection2 = ((MayaCashInCodeFormFragment) ((K6.f) kVarR1.c.get())).t0;
                        if (mayaCashInAccountLimitSection2 == null) {
                            kotlin.jvm.internal.j.n("mMayaCashInAccountLimitSection");
                            throw null;
                        }
                        mayaCashInAccountLimitSection2.a();
                        kVarR1.f = true;
                        kVarR1.r();
                        return;
                    }
                    K6.f fVar2 = (K6.f) kVarR1.c.get();
                    String strU2 = com.paymaya.common.utility.C.u(Double.valueOf(accountLimitAmount.mRemaining()));
                    MayaCashInAccountLimitSection mayaCashInAccountLimitSection3 = ((MayaCashInCodeFormFragment) fVar2).t0;
                    if (mayaCashInAccountLimitSection3 == null) {
                        kotlin.jvm.internal.j.n("mMayaCashInAccountLimitSection");
                        throw null;
                    }
                    mayaCashInAccountLimitSection3.setRemainingValue(strU2);
                    MayaCashInAccountLimitSection mayaCashInAccountLimitSection4 = ((MayaCashInCodeFormFragment) ((K6.f) kVarR1.c.get())).t0;
                    if (mayaCashInAccountLimitSection4 == null) {
                        kotlin.jvm.internal.j.n("mMayaCashInAccountLimitSection");
                        throw null;
                    }
                    mayaCashInAccountLimitSection4.b();
                    kVarR1.f = false;
                    kVarR1.r();
                    return;
                }
                return;
            case 1:
                G6.x xVarG1 = ((MayaWesternUnionFragment) this.f2837b).G1();
                if (charSequence == null || (string2 = charSequence.toString()) == null) {
                    string2 = "";
                }
                boolean z4 = !C2576A.H(string2) && string2.length() == 10;
                xVarG1.e = z4;
                if (z4) {
                    MayaWesternUnionFragment mayaWesternUnionFragment = (MayaWesternUnionFragment) ((K6.p) xVarG1.c.get());
                    MayaInputLayout mayaInputLayout = mayaWesternUnionFragment.f11776V;
                    if (mayaInputLayout == null) {
                        kotlin.jvm.internal.j.n("mMayaInputLayoutMTCN");
                        throw null;
                    }
                    mayaInputLayout.h();
                    MayaInputLayout mayaInputLayout2 = mayaWesternUnionFragment.f11776V;
                    if (mayaInputLayout2 == null) {
                        kotlin.jvm.internal.j.n("mMayaInputLayoutMTCN");
                        throw null;
                    }
                    mayaInputLayout2.f();
                } else {
                    MayaWesternUnionFragment mayaWesternUnionFragment2 = (MayaWesternUnionFragment) ((K6.p) xVarG1.c.get());
                    MayaInputLayout mayaInputLayout3 = mayaWesternUnionFragment2.f11776V;
                    if (mayaInputLayout3 == null) {
                        kotlin.jvm.internal.j.n("mMayaInputLayoutMTCN");
                        throw null;
                    }
                    mayaInputLayout3.r();
                    MayaInputLayout mayaInputLayout4 = mayaWesternUnionFragment2.f11776V;
                    if (mayaInputLayout4 == null) {
                        kotlin.jvm.internal.j.n("mMayaInputLayoutMTCN");
                        throw null;
                    }
                    mayaInputLayout4.p();
                }
                K6.p pVar = (K6.p) xVarG1.c.get();
                boolean z5 = xVarG1.e;
                Button button = ((MayaWesternUnionFragment) pVar).f11777W;
                if (button != null) {
                    button.setEnabled(z5);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mButtonContinue");
                    throw null;
                }
            default:
                L9.l lVarP1 = ((MayaCreditTransferFragment) this.f2837b).P1();
                if (charSequence == null || (string3 = charSequence.toString()) == null) {
                    string3 = "";
                }
                String string4 = ((MayaCreditTransferFragment) ((P9.d) lVarP1.c.get())).getString(R.string.maya_php_currency);
                kotlin.jvm.internal.j.f(string4, "getString(...)");
                if (C2576A.H(zj.z.t(zj.z.t(string3, string4, ""), Global.BLANK, ""))) {
                    lVarP1.f2899l = true;
                } else {
                    lVarP1.f2899l = !(com.paymaya.common.utility.C.q0(string3).doubleValue() == AudioStats.AUDIO_AMPLITUDE_NONE);
                }
                ((MayaCreditTransferFragment) this.f2837b).P1().n();
                return;
        }
    }
}
