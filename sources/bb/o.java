package Bb;

import Kh.T;
import android.os.Bundle;
import android.text.Html;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.DisplayName;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.V0;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyOTPFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d4.AbstractC1331a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.nio.charset.Charset;
import java.util.HashMap;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import w.C2361c;
import y5.AbstractC2509a;
import y5.s;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC2509a implements Ab.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V0 f417d;
    public final com.paymaya.data.preference.a e;
    public final C1278p0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(V0 v02, com.paymaya.data.preference.a mPreference, C1278p0 c1278p0, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f417d = v02;
        this.e = mPreference;
        this.f = c1278p0;
    }

    @Override // y5.e
    public final void b() {
        ((MayaBaseFragment) ((Fb.d) this.c.get())).E1();
        C1278p0 c1278p0 = this.f;
        Bundle arguments = ((MayaSendMoneyOTPFragment) ((Fb.d) this.c.get())).getArguments();
        String string = arguments != null ? arguments.getString("otp_id") : null;
        c1278p0.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otp_id", string);
        } catch (JSONException unused) {
            yk.a.e();
        }
        Ah.p<OTP> pVarResendOTPByTransactionType = c1278p0.f11471b.resendOTPByTransactionType("p2p", RequestBody.create(y5.f.f21063a, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
        new T(5, new Lh.d(AbstractC1331a.l(pVarResendOTPByTransactionType, pVarResendOTPByTransactionType, zh.b.a()), new V2.c(this, 8), 0), new A7.c(this, 5)).e();
    }

    @Override // y5.e
    public final void c() {
        int i = 9;
        int i4 = 2;
        int i6 = 0;
        Bundle arguments = ((MayaSendMoneyOTPFragment) ((Fb.d) this.c.get())).getArguments();
        Transfer transfer = arguments != null ? (Transfer) arguments.getParcelable("send_money") : null;
        String strMAuthChallengeId = transfer != null ? transfer.mAuthChallengeId() : null;
        String strL1 = ((MayaAbstractBaseOTPFragmentImpl) ((Fb.d) this.c.get())).L1();
        if (strL1.length() == 0) {
            MayaSendMoneyOTPFragment mayaSendMoneyOTPFragment = (MayaSendMoneyOTPFragment) ((Fb.d) this.c.get());
            String string = mayaSendMoneyOTPFragment.getString(R.string.pma_label_otp_missing);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            Gb.l lVar = mayaSendMoneyOTPFragment.f13814k0;
            if (lVar != null) {
                ((MayaSendMoneyActivity) lVar).o(mayaSendMoneyOTPFragment.getString(R.string.pma_toast_error_title_otp_error), string);
                return;
            }
            return;
        }
        if (strL1.length() < 6) {
            MayaSendMoneyOTPFragment mayaSendMoneyOTPFragment2 = (MayaSendMoneyOTPFragment) ((Fb.d) this.c.get());
            String string2 = mayaSendMoneyOTPFragment2.getString(R.string.pma_label_otp_invalid);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            Gb.l lVar2 = mayaSendMoneyOTPFragment2.f13814k0;
            if (lVar2 != null) {
                ((MayaSendMoneyActivity) lVar2).o(mayaSendMoneyOTPFragment2.getString(R.string.pma_toast_error_title_otp_error), string2);
                return;
            }
            return;
        }
        ((MayaBaseFragment) ((Fb.d) this.c.get())).E1();
        if (strMAuthChallengeId != null && !C2576A.H(strMAuthChallengeId)) {
            kotlin.jvm.internal.j.g(transfer, "transfer");
            Ah.p pVarB = this.f.b("p2p", strMAuthChallengeId, ((MayaAbstractBaseOTPFragmentImpl) ((Fb.d) this.c.get())).L1());
            e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarB, pVarB, zh.b.a()), new A7.f(3, this, transfer), i4), new C2361c(this, i), i6).e());
            return;
        }
        V0 v02 = this.f417d;
        Bundle arguments2 = ((MayaSendMoneyOTPFragment) ((Fb.d) this.c.get())).getArguments();
        String string3 = arguments2 != null ? arguments2.getString("otp_id") : null;
        String strL12 = ((MayaAbstractBaseOTPFragmentImpl) ((Fb.d) this.c.get())).L1();
        String strB = i0.b();
        String strH = this.e.h();
        v02.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otp_id", string3);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("otp", strL12);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        Ah.p<Transfer> pVarExecuteP2PTransferV3 = v02.f11400b.executeP2PTransferV3(Je.d.a(jSONObject.toString().getBytes(Charset.forName("UTF-8"))), strB, strH, "2.153.0", "android");
        e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarExecuteP2PTransferV3, pVarExecuteP2PTransferV3, zh.b.a()), new J5.a(this, 10), i4), new J5.c(this, i), i6).e());
    }

    @Override // y5.e
    public final long d() {
        return this.e.e().mResendCodeCountdown();
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        Fb.d dVar = (Fb.d) this.c.get();
        MayaSendMoneyOTPFragment mayaSendMoneyOTPFragment = (MayaSendMoneyOTPFragment) dVar;
        mayaSendMoneyOTPFragment.J1().setText(Html.fromHtml(mayaSendMoneyOTPFragment.getString(R.string.maya_format_enter_otp_sent_to_mobile_number, C.p(this.e.r()))));
    }

    public final void k(PayMayaError payMayaError) {
        ((MayaBaseFragment) ((Fb.d) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        if (this.e.e().isAppEventV2SendMoneyEnabled()) {
            MayaSendMoneyOTPFragment mayaSendMoneyOTPFragment = (MayaSendMoneyOTPFragment) ((Fb.d) this.c.get());
            mayaSendMoneyOTPFragment.getClass();
            C1220i c1220iO1 = mayaSendMoneyOTPFragment.o1();
            C1219h c1219hE = C1219h.e("SEND_MONEY_CONFIRMATION_".concat(AbstractC1173g.G(27)));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            Gb.l lVar = mayaSendMoneyOTPFragment.f13814k0;
            String str = lVar != null ? ((MayaSendMoneyActivity) lVar).f13744u : null;
            HashMap map = c1219hE.j;
            map.put("source_page", str);
            map.put("error_reason", payMayaError.mSpiel());
            map.put(StateEvent.Name.ERROR_CODE, String.valueOf(payMayaError.mErrorCode()));
            c1220iO1.b(c1219hE);
        } else {
            s sVar = (Fb.d) this.c.get();
            C1219h c1219h = new C1219h();
            c1219h.n(12);
            c1219h.i();
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put(Constants.REASON, payMayaError.mSpiel());
            ((MayaBaseFragment) sVar).A1(c1219h);
        }
        if (payMayaError.mErrorCode() == -135 || payMayaError.mErrorCode() == -137) {
            ((MayaSendMoneyOTPFragment) ((Fb.d) this.c.get())).X1(payMayaError);
        } else {
            ((MayaSendMoneyOTPFragment) ((Fb.d) this.c.get())).Y1(payMayaError);
        }
    }

    public final void l(Transfer transfer) {
        TransferRecipient transferRecipientMTransferRecipient;
        kotlin.jvm.internal.j.g(transfer, "transfer");
        s sVar = (Fb.d) this.c.get();
        C1219h c1219h = new C1219h();
        c1219h.n(14);
        c1219h.i();
        ((MayaBaseFragment) sVar).A1(c1219h);
        ((MayaBaseFragment) ((Fb.d) this.c.get())).w1();
        com.paymaya.data.preference.a aVar = this.e;
        Bundle arguments = ((MayaSendMoneyOTPFragment) ((Fb.d) this.c.get())).getArguments();
        Transfer transfer2 = arguments != null ? (Transfer) arguments.getParcelable("send_money") : null;
        androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_recent_recipient_number", (transfer2 == null || (transferRecipientMTransferRecipient = transfer2.mTransferRecipient()) == null) ? null : transferRecipientMTransferRecipient.mUnformattedValue());
        Bundle arguments2 = ((MayaSendMoneyOTPFragment) ((Fb.d) this.c.get())).getArguments();
        Transfer transfer3 = arguments2 != null ? (Transfer) arguments2.getParcelable("send_money") : null;
        DisplayName displayNameMDisplayName = transfer3 != null ? transfer3.mDisplayName() : null;
        if (displayNameMDisplayName != null) {
            transfer = transfer.toBuilder().mDisplayName(displayNameMDisplayName).build();
            kotlin.jvm.internal.j.d(transfer);
        }
        MayaSendMoneyOTPFragment mayaSendMoneyOTPFragment = (MayaSendMoneyOTPFragment) ((Fb.d) this.c.get());
        mayaSendMoneyOTPFragment.getClass();
        Gb.l lVar = mayaSendMoneyOTPFragment.f13814k0;
        if (lVar != null) {
            MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) lVar;
            AbstractC1236z.e(mayaSendMoneyActivity, MayaSendMoneyConfirmationFragment.class, false);
            MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment = (MayaSendMoneyConfirmationFragment) mayaSendMoneyActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaSendMoneyActivity, MayaSendMoneyConfirmationFragment.class));
            if (mayaSendMoneyConfirmationFragment != null) {
                mayaSendMoneyConfirmationFragment.f13762h0 = new Ag.d(transfer, 15);
            }
        }
    }
}
