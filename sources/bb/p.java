package Bb;

import android.content.Intent;
import android.widget.TextView;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.store.C1286u;
import com.paymaya.domain.store.E;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyReceiptFragment;
import sd.AbstractC2252a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends AbstractC2252a implements Ab.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f418d;
    public final C1286u e;
    public final E f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.paymaya.data.preference.a mPreference, C1286u c1286u, E e, S5.c flagConfigurationService, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f418d = mPreference;
        this.e = c1286u;
        this.f = e;
    }

    public final Amount A() {
        Amount amountMTransferAmount = ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).n2().mTransferAmount();
        if (amountMTransferAmount != null) {
            return amountMTransferAmount;
        }
        Amount amountBuild = Amount.sBuilder().mCurrency("PHP").mValue("0.00").build();
        kotlin.jvm.internal.j.f(amountBuild, "build(...)");
        return amountBuild;
    }

    public final void B(String str) {
        if (AbstractC1213b.U("@[a-z0-9_](?!.*\\.\\.)[a-z0-9_.]{1,22}[a-z0-9_]", str)) {
            ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).o2();
            return;
        }
        TextView textView = ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).f13829z0;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mTextViewRecipientAddToContacts");
            throw null;
        }
    }

    public final void C(Transfer transfer) {
        TransferRecipient transferRecipientMTransferRecipient = transfer.mTransferRecipient();
        if (transferRecipientMTransferRecipient == null) {
            transferRecipientMTransferRecipient = TransferRecipient.sBuilder().build();
        }
        String strMRecipientName = transferRecipientMTransferRecipient != null ? transferRecipientMTransferRecipient.mRecipientName() : null;
        String strMValue = transferRecipientMTransferRecipient.mValue();
        if (transferRecipientMTransferRecipient.isAccountValueSmartMoney()) {
            kotlin.jvm.internal.j.d(strMValue);
            D(strMValue);
            E(null);
            ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).o2();
            return;
        }
        if (transfer.mDisplayName() == null) {
            if (strMRecipientName != null && !C2576A.H(strMRecipientName)) {
                D(strMRecipientName);
                E(strMValue);
                ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).o2();
                return;
            } else {
                kotlin.jvm.internal.j.d(strMValue);
                D(strMValue);
                E(null);
                B(strMValue);
                return;
            }
        }
        String displayFullName = transfer.getDisplayFullName();
        kotlin.jvm.internal.j.f(displayFullName, "getDisplayFullName(...)");
        D(displayFullName);
        if (strMRecipientName != null && !C2576A.H(strMRecipientName)) {
            E(transferRecipientMTransferRecipient.getRecipientNameAndMobileNumber());
            ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).o2();
        } else {
            E(strMValue);
            kotlin.jvm.internal.j.d(strMValue);
            B(strMValue);
        }
    }

    public final void D(String primaryDestination) {
        kotlin.jvm.internal.j.g(primaryDestination, "primaryDestination");
        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = (MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get());
        mayaSendMoneyReceiptFragment.getClass();
        TextView textView = mayaSendMoneyReceiptFragment.f13828x0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewRecipientPrimaryDestination");
            throw null;
        }
        textView.setText(primaryDestination);
        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment2 = (MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get());
        mayaSendMoneyReceiptFragment2.getClass();
        mayaSendMoneyReceiptFragment2.d2(primaryDestination);
    }

    public final void E(String str) {
        if (str == null) {
            ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).P1().setVisibility(8);
            TextView textView = ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).y0;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mTextViewRecipientSecondaryDestination");
                throw null;
            }
        }
        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = (MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get());
        mayaSendMoneyReceiptFragment.getClass();
        mayaSendMoneyReceiptFragment.c2(str);
        ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).P1().setVisibility(0);
        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment2 = (MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get());
        mayaSendMoneyReceiptFragment2.getClass();
        TextView textView2 = mayaSendMoneyReceiptFragment2.y0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewRecipientSecondaryDestination");
            throw null;
        }
        textView2.setText(str);
        TextView textView3 = ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).y0;
        if (textView3 != null) {
            textView3.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mTextViewRecipientSecondaryDestination");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x029b  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bb.p.j():void");
    }

    public final void z() {
        String strMValue;
        TransferRecipient transferRecipientMTransferRecipient = ((MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get())).n2().mTransferRecipient();
        if (transferRecipientMTransferRecipient == null || (strMValue = transferRecipientMTransferRecipient.mValue()) == null) {
            return;
        }
        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = (MayaSendMoneyReceiptFragment) ((Fb.e) this.c.get());
        mayaSendMoneyReceiptFragment.getClass();
        Gb.o oVar = mayaSendMoneyReceiptFragment.f13824K0;
        if (oVar != null) {
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/raw_contact");
            intent.putExtra("phone", strMValue);
            intent.putExtra("finishActivityOnSaveCompleted", true);
            ((MayaSendMoneyActivity) oVar).f13748y.launch(intent);
        }
    }
}
