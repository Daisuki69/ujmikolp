package o6;

import We.s;
import android.os.Bundle;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3Recipient;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferReceiptFragment;
import s6.InterfaceC2244e;
import sd.AbstractC2252a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC2252a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f18808d;

    public o(S5.c cVar, Uh.d dVar, com.paymaya.data.preference.a aVar) {
        super(dVar);
        this.f18808d = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Double valueAsDouble;
        Double valueAsDouble2;
        super.j();
        Bundle arguments = ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) this.c.get())).getArguments();
        BankTransferV3 bankTransferV3 = arguments != null ? (BankTransferV3) arguments.getParcelable("bank_transfer") : null;
        if (bankTransferV3 != null) {
            BankTransferV3Recipient recipient = bankTransferV3.getRecipient();
            InterfaceC2244e interfaceC2244e = (InterfaceC2244e) this.c.get();
            String accountName = recipient != null ? recipient.getAccountName() : null;
            MayaBankTransferReceiptFragment mayaBankTransferReceiptFragment = (MayaBankTransferReceiptFragment) interfaceC2244e;
            mayaBankTransferReceiptFragment.d2(accountName);
            TextView textView = mayaBankTransferReceiptFragment.y0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewRecipientName");
                throw null;
            }
            textView.setText(accountName);
            BankTransferV3Recipient recipient2 = bankTransferV3.getRecipient();
            InterfaceC2244e interfaceC2244e2 = (InterfaceC2244e) this.c.get();
            String account = recipient2 != null ? recipient2.getAccount() : null;
            MayaBankTransferReceiptFragment mayaBankTransferReceiptFragment2 = (MayaBankTransferReceiptFragment) interfaceC2244e2;
            mayaBankTransferReceiptFragment2.c2(account);
            TextView textView2 = mayaBankTransferReceiptFragment2.f11590z0;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewRecipientAccount");
                throw null;
            }
            textView2.setText(account);
            Amount amount = bankTransferV3.getAmount();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = (amount == null || (valueAsDouble2 = amount.getValueAsDouble()) == null) ? 0.0d : valueAsDouble2.doubleValue();
            Amount fees = bankTransferV3.getFees();
            if (fees != null && (valueAsDouble = fees.getValueAsDouble()) != null) {
                dDoubleValue = valueAsDouble.doubleValue();
            }
            String strU = C.u(Double.valueOf(dDoubleValue2 + dDoubleValue));
            InterfaceC2244e interfaceC2244e3 = (InterfaceC2244e) this.c.get();
            String string = ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) this.c.get())).getString(R.string.pma_label_peso);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            MayaBankTransferReceiptFragment mayaBankTransferReceiptFragment3 = (MayaBankTransferReceiptFragment) interfaceC2244e3;
            mayaBankTransferReceiptFragment3.e2(mayaBankTransferReceiptFragment3.getString(R.string.maya_format_negative_amount_value, string + strU));
            InterfaceC2244e interfaceC2244e4 = (InterfaceC2244e) this.c.get();
            String strP = C.p(this.f18808d.r());
            TextView textView3 = ((MayaBankTransferReceiptFragment) interfaceC2244e4).w0;
            if (textView3 == null) {
                kotlin.jvm.internal.j.n("mTextViewMobileNumber");
                throw null;
            }
            textView3.setText(strP);
            BankTransferV3Recipient recipient3 = bankTransferV3.getRecipient();
            InterfaceC2244e interfaceC2244e5 = (InterfaceC2244e) this.c.get();
            String bankName = recipient3 != null ? recipient3.getBankName() : null;
            TextView textView4 = ((MayaBankTransferReceiptFragment) interfaceC2244e5).f11589x0;
            if (textView4 == null) {
                kotlin.jvm.internal.j.n("mTextViewBankName");
                throw null;
            }
            textView4.setText(bankName);
            String purpose = bankTransferV3.getPurpose();
            TextView textView5 = ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) this.c.get())).f11580A0;
            if (textView5 == null) {
                kotlin.jvm.internal.j.n("mTextViewPurpose");
                throw null;
            }
            textView5.setText(purpose);
            Amount fees2 = bankTransferV3.getFees();
            InterfaceC2244e interfaceC2244e6 = (InterfaceC2244e) this.c.get();
            String string2 = ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) this.c.get())).getString(R.string.pma_label_peso);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            String strI = s.i(string2, fees2 != null ? fees2.getFormattedValue() : null);
            TextView textView6 = ((MayaBankTransferReceiptFragment) interfaceC2244e6).f11583D0;
            if (textView6 == null) {
                kotlin.jvm.internal.j.n("mTextViewTransferFee");
                throw null;
            }
            textView6.setText(strI);
            String parsedReferenceId = bankTransferV3.getParsedReferenceId();
            TextView textView7 = ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) this.c.get())).f11584E0;
            if (textView7 == null) {
                kotlin.jvm.internal.j.n("mTextViewReferenceId");
                throw null;
            }
            textView7.setText(parsedReferenceId);
            Bundle arguments2 = ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) this.c.get())).getArguments();
            FavoriteDetails favoriteDetails = arguments2 != null ? (FavoriteDetails) arguments2.getParcelable("favorite_details") : null;
            if (favoriteDetails == null || !this.f18808d.e().isFavoritesServiceAvailable()) {
                ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) this.c.get())).T1();
                return;
            }
            String strMId = favoriteDetails.mId();
            if (strMId == null || C2576A.H(strMId)) {
                ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) this.c.get())).k2();
            } else {
                ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) this.c.get())).T1();
            }
        }
    }
}
