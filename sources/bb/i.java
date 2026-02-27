package Bb;

import G5.C0256f;
import G5.ViewOnFocusChangeListenerC0257g;
import G6.v;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f405b;

    public /* synthetic */ i(n nVar, int i) {
        this.f404a = i;
        this.f405b = nVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        int i = 1;
        switch (this.f404a) {
            case 0:
                n nVar = this.f405b;
                PayMayaError payMayaErrorF = nVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                nVar.x(payMayaErrorF);
                return;
            case 1:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f405b.e(it);
                return;
            case 2:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                n nVar2 = this.f405b;
                nVar2.f(it2, true);
                ConstraintLayout constraintLayout = ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13780E0;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.j.n("mConstraintLayoutFavoritesError");
                    throw null;
                }
                constraintLayout.setVisibility(0);
                ConstraintLayout constraintLayout2 = ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13778C0;
                if (constraintLayout2 == null) {
                    kotlin.jvm.internal.j.n("mConstraintLayoutFavoritesLoading");
                    throw null;
                }
                constraintLayout2.setVisibility(8);
                ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).W1(0);
                return;
            default:
                AccountBalance accountBalance = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(accountBalance, "accountBalance");
                n nVar3 = this.f405b;
                nVar3.getClass();
                Double valueAsDouble = accountBalance.mAvailableBalance().getValueAsDouble();
                Fb.c cVar = (Fb.c) nVar3.c.get();
                kotlin.jvm.internal.j.d(valueAsDouble);
                ((MayaSendMoneyFragment) cVar).f13804f1 = valueAsDouble.doubleValue();
                MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) nVar3.c.get());
                MayaInputLayout mayaInputLayout = mayaSendMoneyFragment.f13784J0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                    throw null;
                }
                mayaInputLayout.setHelperInfoText(mayaSendMoneyFragment.getString(R.string.maya_format_amount_helper, C.u(Double.valueOf(mayaSendMoneyFragment.f13804f1))));
                Fb.c cVar2 = (Fb.c) nVar3.c.get();
                double dDoubleValue = valueAsDouble.doubleValue();
                MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) cVar2;
                MayaInputLayout mayaInputLayout2 = mayaSendMoneyFragment2.f13784J0;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                    throw null;
                }
                C0256f c0256f = mayaSendMoneyFragment2.f13785K0;
                if (c0256f != null) {
                    mayaInputLayout2.getInputEditText().removeTextChangedListener(c0256f);
                }
                AppCompatEditText inputEditText = mayaInputLayout2.getInputEditText();
                C0256f c0256f2 = new C0256f(inputEditText, AudioStats.AUDIO_AMPLITUDE_NONE, dDoubleValue);
                String str = (String) mayaSendMoneyFragment2.g1.getValue();
                kotlin.jvm.internal.j.g(str, "<set-?>");
                c0256f2.f1741o = str;
                c0256f2.f1742p = 0;
                c0256f2.m = new v(mayaSendMoneyFragment2, 3);
                mayaSendMoneyFragment2.f13785K0 = c0256f2;
                mayaInputLayout2.q();
                inputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0257g(c0256f2, new Gb.e(mayaSendMoneyFragment2, i), 0));
                mayaInputLayout2.getInputEditText().addTextChangedListener(c0256f2);
                return;
        }
    }
}
