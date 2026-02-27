package Z8;

import Ah.p;
import Kh.T;
import Q6.n;
import Q6.r;
import Q6.s;
import T3.l;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.P;
import com.paymaya.common.utility.i0;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.Registration;
import com.paymaya.domain.store.C1287u0;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.D0;
import com.paymaya.domain.store.E0;
import dOYHB6.yFtIp6.svM7M6;
import g9.InterfaceC1511f;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import y5.AbstractC2509a;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC2509a implements Y8.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6917d;
    public final C1293x0 e;
    public final E0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S5.c f6918g;
    public final P h;

    public i(com.paymaya.data.preference.a mPreference, C1293x0 c1293x0, E0 e02, S5.c flagConfigurationService, P partnerOnboardingUtils) {
        j.g(mPreference, "mPreference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(partnerOnboardingUtils, "partnerOnboardingUtils");
        this.f6917d = mPreference;
        this.e = c1293x0;
        this.f = e02;
        this.f6918g = flagConfigurationService;
        this.h = partnerOnboardingUtils;
    }

    @Override // y5.e
    public final void b() {
        ((MayaBaseFragment) ((InterfaceC1511f) this.c.get())).E1();
        E0 e02 = this.f;
        String string = svM7M6.getString(e02.c.f11330b, "key_registration_id", "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("registration_id", string);
        } catch (JSONException unused) {
            yk.a.e();
        }
        p<Registration> pVarResendVerification = e02.f11346b.resendVerification(RequestBody.create(y5.f.f21063a, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
        D0 d02 = new D0(e02, 1);
        pVarResendVerification.getClass();
        new Lh.d(new T(5, new Lh.d(new Lh.h(new Lh.d(pVarResendVerification, d02, 2), zh.b.a(), 0), new l(this, 17), 0), new h(this, 1)), new r(this, 19), 1).e();
    }

    @Override // y5.e
    public final void c() {
        p dVar;
        String strL1 = ((MayaAbstractBaseOTPFragmentImpl) ((InterfaceC1511f) this.c.get())).L1();
        if (strL1.length() == 0) {
            ((InterfaceC1511f) this.c.get()).c1();
            return;
        }
        if (strL1.length() < 6) {
            ((InterfaceC1511f) this.c.get()).E();
            return;
        }
        ((MayaBaseFragment) ((InterfaceC1511f) this.c.get())).E1();
        C1293x0 c1293x0 = this.e;
        String strL12 = ((MayaAbstractBaseOTPFragmentImpl) ((InterfaceC1511f) this.c.get())).L1();
        String strB = i0.b();
        String strH = this.f6917d.h();
        String strC = Ke.d.c();
        String strF1 = ((InterfaceC1511f) this.c.get()).f1();
        String str = i0.f11215b;
        String strB2 = Je.b.b();
        com.paymaya.data.preference.a aVar = c1293x0.f11496b;
        boolean zIsRegistrationRestrictionsEnabled = aVar.e().isRegistrationRestrictionsEnabled();
        PayMayaClientApi payMayaClientApi = c1293x0.c;
        MediaType mediaType = y5.f.f21063a;
        if (zIsRegistrationRestrictionsEnabled) {
            p<Profile> pVarShieldVerify = payMayaClientApi.shieldVerify(RequestBody.create(mediaType, I5.a.e(svM7M6.getString(aVar.f11330b, "key_registration_id", ""), strL12)), c1293x0.i(strB, strH, strC, strF1, str, strB2));
            C1287u0 c1287u0 = new C1287u0(c1293x0, 4);
            pVarShieldVerify.getClass();
            dVar = new Lh.f(pVarShieldVerify, c1287u0, 0);
        } else {
            p<Profile> pVarShieldVerify2 = payMayaClientApi.shieldVerify(RequestBody.create(mediaType, I5.a.e(svM7M6.getString(aVar.f11330b, "key_registration_id", ""), strL12)), c1293x0.i(strB, strH, strC, strF1, str, strB2));
            C1287u0 c1287u02 = new C1287u0(c1293x0, 3);
            pVarShieldVerify2.getClass();
            dVar = new Lh.d(pVarShieldVerify2, c1287u02, 2);
        }
        new Lh.d(new T(5, new Lh.d(new Lh.d(new Lh.h(dVar, zh.b.a(), 0), new Qd.a(this, 19), 2), new s(this, 19), 0), new h(this, 0)), new n(this, 19), 1).e();
    }

    @Override // y5.e
    public final long d() {
        return this.f6917d.e().mResendCodeCountdown();
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        InterfaceC1511f interfaceC1511f = (InterfaceC1511f) this.c.get();
        String string = svM7M6.getString(this.f6917d.f11330b, "key_registration_mobile_number", "");
        j.f(string, "getRegistrationMobileNumber(...)");
        interfaceC1511f.K(string);
    }

    public final void k() {
        if (this.f6917d.e().isPartnerOnboardingEnabled()) {
            String strP = this.f6917d.p();
            if (strP == null) {
                strP = "";
            }
            String strQ = this.f6917d.q();
            String str = strQ != null ? strQ : "";
            if (strP.length() > 0) {
                ((InterfaceC1511f) this.c.get()).F0(strP, str);
            }
        }
    }

    public final void l(String str) {
        if (g()) {
            Matcher matcher = Pattern.compile(".*OTP is ([0-9]{6}).*").matcher(z.t(str, Global.NEWLINE, ""));
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                ((MayaAbstractBaseOTPFragmentImpl) ((InterfaceC1511f) this.c.get())).S1(strGroup != null ? strGroup : "");
                ((MayaAbstractBaseOTPFragmentImpl) ((InterfaceC1511f) this.c.get())).f10272i0 = true;
            }
        }
    }
}
