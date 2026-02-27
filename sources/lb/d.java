package Lb;

import Ah.p;
import G6.r;
import G6.u;
import G6.w;
import Kh.T;
import Lh.h;
import Sb.m;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.C1279q;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinOTPFragment;
import d4.AbstractC1331a;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC2329d;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC2509a implements y5.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2946d;
    public final C1279q e;
    public final C1278p0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S0 f2947g;
    public String h;
    public boolean i;
    public String j;

    public d(com.paymaya.data.preference.a aVar, C1279q c1279q, C1278p0 c1278p0, S0 s02, Uh.d dVar) {
        super(dVar);
        this.f2946d = aVar;
        this.e = c1279q;
        this.f = c1278p0;
        this.f2947g = s02;
    }

    @Override // y5.e
    public final void b() {
        ((MayaBaseFragment) ((Rb.e) this.c.get())).E1();
        String str = this.i ? "update_identity" : "update_identity_auth";
        C1278p0 c1278p0 = this.f;
        String str2 = this.h;
        c1278p0.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otp_id", str2);
        } catch (JSONException unused) {
            yk.a.e();
        }
        p<OTP> pVarResendOTPByTransactionType = c1278p0.f11471b.resendOTPByTransactionType(str, RequestBody.create(y5.f.f21063a, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
        new T(5, new Lh.d(AbstractC1331a.l(pVarResendOTPByTransactionType, pVarResendOTPByTransactionType, zh.b.a()), new w(this, 14), 0), new c(this, 1)).e();
    }

    @Override // y5.e
    public final void c() {
        int i = 0;
        String strL1 = ((MayaAbstractBaseOTPFragmentImpl) ((Rb.e) this.c.get())).L1();
        if (strL1.length() == 0) {
            MayaChangeMinOTPFragment mayaChangeMinOTPFragment = (MayaChangeMinOTPFragment) ((Rb.e) this.c.get());
            String string = mayaChangeMinOTPFragment.getString(R.string.maya_error_otp_missing);
            m mVar = mayaChangeMinOTPFragment.f13945k0;
            if (mVar != null) {
                ((MayaSettingsActivity) mVar).c2(mayaChangeMinOTPFragment.getString(R.string.maya_label_thats_not_it), string);
                return;
            }
            return;
        }
        if (strL1.length() < 6) {
            MayaChangeMinOTPFragment mayaChangeMinOTPFragment2 = (MayaChangeMinOTPFragment) ((Rb.e) this.c.get());
            String string2 = mayaChangeMinOTPFragment2.getString(R.string.maya_error_otp_invalid);
            m mVar2 = mayaChangeMinOTPFragment2.f13945k0;
            if (mVar2 != null) {
                ((MayaSettingsActivity) mVar2).c2(mayaChangeMinOTPFragment2.getString(R.string.maya_label_thats_not_it), string2);
                return;
            }
            return;
        }
        ((MayaBaseFragment) ((Rb.e) this.c.get())).E1();
        if (this.i) {
            C1279q c1279q = this.e;
            String str = this.h;
            String strL12 = ((MayaAbstractBaseOTPFragmentImpl) ((Rb.e) this.c.get())).L1();
            c1279q.getClass();
            byte[] bArrD = I5.a.d(str, strL12);
            RequestBody.Companion companion = RequestBody.Companion;
            j.d(bArrD);
            e(new Hh.f(c1279q.f11472b.updateNewIdentityVerify(RequestBody.Companion.create$default(companion, y5.f.f21063a, bArrD, 0, 0, 12, (Object) null)).f(Th.e.c), zh.b.a(), 0).a(new c(this, i)).b(new r(this, 16)).c());
            return;
        }
        C1279q c1279q2 = this.e;
        String str2 = this.h;
        String strL13 = ((MayaAbstractBaseOTPFragmentImpl) ((Rb.e) this.c.get())).L1();
        c1279q2.getClass();
        byte[] bArrD2 = I5.a.d(str2, strL13);
        RequestBody.Companion companion2 = RequestBody.Companion;
        j.d(bArrD2);
        e(new Lh.d(new Lh.d(new h(c1279q2.f11472b.requestChangeIdentityVerify(RequestBody.Companion.create$default(companion2, y5.f.f21063a, bArrD2, 0, 0, 12, (Object) null)).h(Th.e.c), zh.b.a(), 0), new u(this, 16), 2), new Gb.d(this, 15), 0).e());
    }

    @Override // y5.e
    public final long d() {
        return this.f2946d.e().mResendCodeCountdown();
    }

    public final void k(PayMayaError payMayaError) {
        if (this.i) {
            ((MayaBaseFragment) ((Rb.e) this.c.get())).A1(AbstractC2329d.h(12));
        }
        ((MayaBaseFragment) ((Rb.e) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        int iMErrorCode = payMayaError.mErrorCode();
        if (iMErrorCode == -135) {
            MayaChangeMinOTPFragment mayaChangeMinOTPFragment = (MayaChangeMinOTPFragment) ((Rb.e) this.c.get());
            m mVar = mayaChangeMinOTPFragment.f13945k0;
            if (mVar != null) {
                MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) mVar;
                MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231347, mayaChangeMinOTPFragment.getString(R.string.maya_label_thats_not_it), null, null, null, false, payMayaError, null, false, 444);
                mayaErrorDialogFragmentZ.f11850c0 = new r(mayaSettingsActivity, 23);
                mayaErrorDialogFragmentZ.show(mayaSettingsActivity.getSupportFragmentManager(), "error_dialog");
                return;
            }
            return;
        }
        if (iMErrorCode == -137) {
            MayaChangeMinOTPFragment mayaChangeMinOTPFragment2 = (MayaChangeMinOTPFragment) ((Rb.e) this.c.get());
            m mVar2 = mayaChangeMinOTPFragment2.f13945k0;
            if (mVar2 != null) {
                ((MayaSettingsActivity) mVar2).d2(2131231347, payMayaError, mayaChangeMinOTPFragment2.getString(R.string.maya_label_thats_not_it));
                return;
            }
            return;
        }
        MayaChangeMinOTPFragment mayaChangeMinOTPFragment3 = (MayaChangeMinOTPFragment) ((Rb.e) this.c.get());
        m mVar3 = mayaChangeMinOTPFragment3.f13945k0;
        if (mVar3 != null) {
            ((MayaSettingsActivity) mVar3).b2(payMayaError, mayaChangeMinOTPFragment3.getString(R.string.maya_label_thats_not_it));
        }
    }
}
