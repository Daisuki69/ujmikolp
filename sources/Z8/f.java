package Z8;

import Ah.o;
import Ah.p;
import Kh.T;
import Q6.n;
import android.widget.Button;
import android.widget.TextView;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.store.C1284t;
import com.paymaya.domain.store.E0;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import g9.InterfaceC1509d;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import y5.s;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC2509a implements Y8.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E0 f6913d;
    public final C1284t e;
    public final com.paymaya.data.preference.a f;

    public f(E0 e02, C1284t c1284t, com.paymaya.data.preference.a mPreference) {
        j.g(mPreference, "mPreference");
        this.f6913d = e02;
        this.e = c1284t;
        this.f = mPreference;
    }

    public final void k() {
        boolean z4;
        boolean z5 = false;
        if (C2576A.H(((MayaRegistrationIdentityFragment) ((InterfaceC1509d) this.c.get())).K1())) {
            MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment = (MayaRegistrationIdentityFragment) ((InterfaceC1509d) this.c.get());
            TextView textView = mayaRegistrationIdentityFragment.f12797b0;
            if (textView == null) {
                j.n("mMobileNumberHelperErrorTextView");
                throw null;
            }
            textView.setVisibility(0);
            MayaInputLayout mayaInputLayout = mayaRegistrationIdentityFragment.f12796a0;
            if (mayaInputLayout == null) {
                j.n("mMayaInputLayoutMobileNumber");
                throw null;
            }
            mayaInputLayout.p();
            z4 = false;
        } else {
            z4 = true;
        }
        if (((MayaRegistrationIdentityFragment) ((InterfaceC1509d) this.c.get())).L1().length() == 0) {
            MayaInputLayout mayaInputLayout2 = ((MayaRegistrationIdentityFragment) ((InterfaceC1509d) this.c.get())).f12798c0;
            if (mayaInputLayout2 == null) {
                j.n("mMayaInputLayoutPassword");
                throw null;
            }
            mayaInputLayout2.p();
        } else {
            z5 = z4;
        }
        if (z5) {
            ((MayaBaseFragment) ((InterfaceC1509d) this.c.get())).E1();
            String strL1 = ((MayaRegistrationIdentityFragment) ((InterfaceC1509d) this.c.get())).L1();
            E0 e02 = this.f6913d;
            e02.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("password", strL1);
            } catch (JSONException unused) {
                yk.a.e();
            }
            Ah.a aVarValidatePassword = e02.f11346b.validatePassword(Je.d.a(jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
            o oVarA = zh.b.a();
            aVarValidatePassword.getClass();
            Hh.f fVar = new Hh.f(aVarValidatePassword, oVarA, 0);
            final int i = 0;
            Hh.g gVarB = fVar.a(new Ch.a(this) { // from class: Z8.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f6912b;

                {
                    this.f6912b = this;
                }

                @Override // Ch.a
                public final void run() {
                    switch (i) {
                        case 0:
                            s sVar = (InterfaceC1509d) this.f6912b.c.get();
                            C1219h c1219hH = AbstractC2329d.h(14);
                            c1219hH.t(EnumC1217f.VALIDATE_PASSWORD);
                            c1219hH.i();
                            ((MayaBaseFragment) sVar).A1(c1219hH);
                            break;
                        default:
                            ((MayaBaseFragment) ((InterfaceC1509d) this.f6912b.c.get())).w1();
                            break;
                    }
                }
            }).b(new Q6.s(this, 18));
            p<List<Consent>> consent = this.e.f11481b.getConsent();
            Y.e eVar = new Y.e(6, this, strL1);
            consent.getClass();
            T t5 = new T(2, new Lh.d(new Lh.d(consent, eVar, 2), new n(this, 18), 0), gVarB);
            final int i4 = 1;
            new Lh.d(new T(5, t5, new Ch.a(this) { // from class: Z8.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f6912b;

                {
                    this.f6912b = this;
                }

                @Override // Ch.a
                public final void run() {
                    switch (i4) {
                        case 0:
                            s sVar = (InterfaceC1509d) this.f6912b.c.get();
                            C1219h c1219hH = AbstractC2329d.h(14);
                            c1219hH.t(EnumC1217f.VALIDATE_PASSWORD);
                            c1219hH.i();
                            ((MayaBaseFragment) sVar).A1(c1219hH);
                            break;
                        default:
                            ((MayaBaseFragment) ((InterfaceC1509d) this.f6912b.c.get())).w1();
                            break;
                    }
                }
            }), new R4.i(this, 16), 1).e();
        }
    }

    public final void l() {
        InterfaceC1509d interfaceC1509d = (InterfaceC1509d) this.c.get();
        boolean z4 = !C2576A.H(((MayaRegistrationIdentityFragment) ((InterfaceC1509d) this.c.get())).K1()) && ((MayaRegistrationIdentityFragment) ((InterfaceC1509d) this.c.get())).K1().matches("^((\\+?63)|0)?[0-9]{10}$") && ((MayaRegistrationIdentityFragment) ((InterfaceC1509d) this.c.get())).L1().length() > 0;
        Button button = ((MayaRegistrationIdentityFragment) interfaceC1509d).f12799d0;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            j.n("mContinueButton");
            throw null;
        }
    }
}
