package o6;

import Kh.C0310o;
import Kh.T;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.AudioStats;
import com.paymaya.R;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Bank;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.QRBankTransferRecipient;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.Q;
import com.paymaya.domain.store.V0;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import n6.InterfaceC1931b;
import s6.InterfaceC2241b;
import t6.InterfaceC2275f;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.x;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC2509a implements InterfaceC1931b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f18794d;
    public final C1247a e;
    public final C1269l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V0 f18795g;
    public final Q h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bank f18796k;

    public g(com.paymaya.data.preference.a aVar, C1247a c1247a, C1269l c1269l, V0 v02, Q q9, Uh.d dVar) {
        super(dVar);
        this.f18794d = aVar;
        this.e = c1247a;
        this.f = c1269l;
        this.f18795g = v02;
        this.h = q9;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        byte b8 = 0;
        super.j();
        e(new C0310o(this.e.c().e(zh.b.a()), new C1258f0(this, 28), Eh.d.c, Eh.d.f1365b).f());
        MayaBankTransferFormFragment mayaBankTransferFormFragment = (MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get());
        InterfaceC2275f interfaceC2275f = mayaBankTransferFormFragment.f11550B0;
        if (interfaceC2275f != null) {
            MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) interfaceC2275f;
            mayaBankTransferActivity.R1();
            mayaBankTransferActivity.S1();
        }
        mayaBankTransferFormFragment.L1();
        this.i = true;
        e(new T(5, new Lh.i(new Lh.d(new Lh.f(new Lh.h(this.e.a(), zh.b.a(), 0), e.f18790b, b8), new f(this, b8), b8), new df.o(17, b8), null), new d(this, 0)).e());
        Bundle arguments = ((MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get())).getArguments();
        if ((arguments != null ? (Bank) arguments.getParcelable("bank") : null) != null) {
            Bundle arguments2 = ((MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get())).getArguments();
            this.f18796k = arguments2 != null ? (Bank) arguments2.getParcelable("bank") : null;
            InterfaceC2241b interfaceC2241b = (InterfaceC2241b) this.c.get();
            Bank bank = this.f18796k;
            String strMBankName = bank != null ? bank.mBankName() : null;
            TextView textView = ((MayaBankTransferFormFragment) interfaceC2241b).f11553p0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewBankName");
                throw null;
            }
            textView.setText(strMBankName);
        }
        m();
        Bundle arguments3 = ((MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get())).getArguments();
        QRBankTransferRecipient qRBankTransferRecipient = arguments3 != null ? (QRBankTransferRecipient) arguments3.getParcelable("bank_recipient") : null;
        if (qRBankTransferRecipient != null) {
            String strMBankBic = qRBankTransferRecipient.mBankBic();
            String strMAccountNumber = qRBankTransferRecipient.mAccountNumber();
            String strMAccountName = qRBankTransferRecipient.mAccountName();
            AppCompatEditText appCompatEditText = ((MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get())).u0;
            if (appCompatEditText == null) {
                kotlin.jvm.internal.j.n("mEditTextAccountNumber");
                throw null;
            }
            appCompatEditText.setText(strMAccountNumber);
            if (strMAccountName != null && !C2576A.H(strMAccountName)) {
                AppCompatEditText appCompatEditText2 = ((MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get())).y0;
                if (appCompatEditText2 == null) {
                    kotlin.jvm.internal.j.n("mEditTextAccountName");
                    throw null;
                }
                appCompatEditText2.setText(strMAccountName);
            }
            if (qRBankTransferRecipient.mAmount() != null) {
                Double dMAmount = qRBankTransferRecipient.mAmount();
                BigDecimal scale = new BigDecimal(dMAmount != null ? dMAmount.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE).setScale(2, RoundingMode.HALF_UP);
                AppCompatEditText appCompatEditText3 = ((MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get())).f11555r0;
                if (appCompatEditText3 == null) {
                    kotlin.jvm.internal.j.n("mEditTextAmount");
                    throw null;
                }
                appCompatEditText3.requestFocus();
                InterfaceC2241b interfaceC2241b2 = (InterfaceC2241b) this.c.get();
                String string = scale.toString();
                AppCompatEditText appCompatEditText4 = ((MayaBankTransferFormFragment) interfaceC2241b2).f11555r0;
                if (appCompatEditText4 == null) {
                    kotlin.jvm.internal.j.n("mEditTextAmount");
                    throw null;
                }
                appCompatEditText4.setText(string);
            }
            C1269l c1269l = this.f;
            c1269l.getClass();
            F1.k kVar = new F1.k(2);
            kVar.f1526b = strMBankBic;
            Bank bankC = c1269l.f11457b.c(kVar);
            if (bankC != null) {
                this.f18796k = bankC;
                InterfaceC2241b interfaceC2241b3 = (InterfaceC2241b) this.c.get();
                Bank bank2 = this.f18796k;
                String strMBankName2 = bank2 != null ? bank2.mBankName() : null;
                TextView textView2 = ((MayaBankTransferFormFragment) interfaceC2241b3).f11553p0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mTextViewBankName");
                    throw null;
                }
                textView2.setText(strMBankName2);
            }
            if (this.f18796k == null) {
                MayaBankTransferFormFragment mayaBankTransferFormFragment2 = (MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get());
                InterfaceC2275f interfaceC2275f2 = mayaBankTransferFormFragment2.f11550B0;
                if (interfaceC2275f2 != null) {
                    MayaBankTransferActivity mayaBankTransferActivity2 = (MayaBankTransferActivity) interfaceC2275f2;
                    mayaBankTransferActivity2.R1();
                    mayaBankTransferActivity2.S1();
                }
                mayaBankTransferFormFragment2.O1();
                new Handler(Looper.getMainLooper()).postDelayed(new androidx.window.layout.adapter.extensions.a(mayaBankTransferFormFragment2, 26), 100L);
            }
        }
        BigDecimal bigDecimalBankTransferFee = this.f18794d.e().bankTransferFee();
        if ((bigDecimalBankTransferFee.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalBankTransferFee.stripTrailingZeros()).compareTo(BigDecimal.ZERO) == 0) {
            MayaBankTransferFormFragment mayaBankTransferFormFragment3 = (MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get());
            String string2 = mayaBankTransferFormFragment3.getString(R.string.maya_label_transaction_fee_may_apply);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            TextView textView3 = mayaBankTransferFormFragment3.f11559z0;
            if (textView3 == null) {
                kotlin.jvm.internal.j.n("mTextViewTransferFee");
                throw null;
            }
            textView3.setText(string2);
            TextView textView4 = mayaBankTransferFormFragment3.f11559z0;
            if (textView4 != null) {
                textView4.setText(string2);
                return;
            } else {
                kotlin.jvm.internal.j.n("mTextViewTransferFee");
                throw null;
            }
        }
        MayaBankTransferFormFragment mayaBankTransferFormFragment4 = (MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get());
        mayaBankTransferFormFragment4.getClass();
        String string3 = mayaBankTransferFormFragment4.getString(R.string.maya_label_transaction_fee_apply, bigDecimalBankTransferFee.setScale(2));
        kotlin.jvm.internal.j.f(string3, "getString(...)");
        TextView textView5 = mayaBankTransferFormFragment4.f11559z0;
        if (textView5 == null) {
            kotlin.jvm.internal.j.n("mTextViewTransferFee");
            throw null;
        }
        textView5.setText(string3);
        TextView textView6 = mayaBankTransferFormFragment4.f11559z0;
        if (textView6 != null) {
            textView6.setText(string3);
        } else {
            kotlin.jvm.internal.j.n("mTextViewTransferFee");
            throw null;
        }
    }

    public final BigDecimal k() {
        String strP1 = ((MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get())).P1();
        if (strP1 != null) {
            BigDecimal bigDecimal = null;
            try {
                if (x.d(strP1)) {
                    bigDecimal = new BigDecimal(strP1);
                }
            } catch (NumberFormatException unused) {
            }
            if (bigDecimal != null) {
                return bigDecimal;
            }
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        kotlin.jvm.internal.j.f(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    public final boolean l() {
        BigDecimal valueAsBigDecimal;
        Amount amountMAvailableBalance;
        BigDecimal bigDecimalK = k();
        BigDecimal bigDecimalBankTransferFee = this.f18794d.e().bankTransferFee();
        if (bigDecimalBankTransferFee == null) {
            bigDecimalBankTransferFee = BigDecimal.ZERO;
        }
        AccountBalance accountBalanceB = this.e.b();
        if (accountBalanceB == null || (amountMAvailableBalance = accountBalanceB.mAvailableBalance()) == null || (valueAsBigDecimal = amountMAvailableBalance.getValueAsBigDecimal()) == null) {
            valueAsBigDecimal = BigDecimal.ZERO;
        }
        if (bigDecimalK.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }
        kotlin.jvm.internal.j.d(bigDecimalBankTransferFee);
        BigDecimal bigDecimalAdd = bigDecimalK.add(bigDecimalBankTransferFee);
        kotlin.jvm.internal.j.f(bigDecimalAdd, "add(...)");
        return bigDecimalAdd.compareTo(valueAsBigDecimal) <= 0;
    }

    public final void m() {
        int i = 0;
        int i4 = 1;
        Bundle arguments = ((MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get())).getArguments();
        Favorite favorite = arguments != null ? (Favorite) arguments.getParcelable("favorite") : null;
        InterfaceC2275f interfaceC2275f = ((MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get())).f11550B0;
        if (interfaceC2275f != null) {
            ((MayaBankTransferActivity) interfaceC2275f).Y1().h = null;
        }
        if (favorite == null || this.j) {
            return;
        }
        this.j = true;
        MayaBankTransferFormFragment mayaBankTransferFormFragment = (MayaBankTransferFormFragment) ((InterfaceC2241b) this.c.get());
        InterfaceC2275f interfaceC2275f2 = mayaBankTransferFormFragment.f11550B0;
        if (interfaceC2275f2 != null) {
            MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) interfaceC2275f2;
            mayaBankTransferActivity.R1();
            mayaBankTransferActivity.S1();
        }
        mayaBankTransferFormFragment.O1();
        e(new Lh.d(new Lh.d(new Lh.h(this.h.b(favorite.mId()), zh.b.a(), 0), new C1967a(this, i4), 2), new M(this, 23), i).e());
    }
}
