package L9;

import Q9.InterfaceC0583m;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import cj.L;
import cj.M;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.ContactReference;
import com.paymaya.domain.model.ContactReferencePatchRequest;
import com.paymaya.domain.model.CreditEligibility;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.K;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditActivationConfirmDetailFragment;
import defpackage.AbstractC1414e;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1264i0 f2904d;
    public final K e;
    public final com.paymaya.data.preference.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S5.c f2905g;
    public CreditReviewUiModel h;
    public boolean i;

    public o(C1264i0 c1264i0, K k8, com.paymaya.data.preference.a aVar, S5.c cVar) {
        this.f2904d = c1264i0;
        this.e = k8;
        this.f = aVar;
        this.f2905g = cVar;
    }

    public static String l(String str) {
        if (str == null || !AbstractC1213b.U("^(63|0)[0-9]{10}$", zj.z.t(com.paymaya.common.utility.C.p0(C2576A.b0(str).toString()), "+", ""))) {
            return null;
        }
        return AbstractC1213b.M("^(0)", com.paymaya.common.utility.C.p0(C2576A.b0(str).toString()), "+63");
    }

    public final void k() {
        CreditReviewUiModel creditReviewUiModel = this.h;
        if (creditReviewUiModel == null) {
            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
            throw null;
        }
        if (creditReviewUiModel.f13061n) {
            NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment = (NewMayaCreditActivationConfirmDetailFragment) ((P9.g) this.c.get());
            C1220i c1220iO1 = newMayaCreditActivationConfirmDetailFragment.o1();
            FragmentActivity activity = newMayaCreditActivationConfirmDetailFragment.getActivity();
            C1219h c1219hD = C1219h.d(newMayaCreditActivationConfirmDetailFragment.u1());
            AbstractC1414e.m(c1219hD, EnumC1216e.ACTIVATION_CONFIRMATION_CONTACT_REFERENCE, 14);
            c1220iO1.c(activity, c1219hD);
            InterfaceC0583m interfaceC0583m = newMayaCreditActivationConfirmDetailFragment.f13160i0;
            if (interfaceC0583m != null) {
                interfaceC0583m.finish();
                return;
            }
            return;
        }
        if (!S5.c.b(this.f2905g, A5.b.f75R)) {
            m();
            return;
        }
        ((MayaBaseFragment) ((P9.g) this.c.get())).w1();
        CreditReviewUiModel creditReviewUiModel2 = this.h;
        if (creditReviewUiModel2 == null) {
            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
            throw null;
        }
        if (kotlin.jvm.internal.j.b(creditReviewUiModel2.f13062o, "LOW") ? creditReviewUiModel2.f13063p || !creditReviewUiModel2.f13064q : creditReviewUiModel2.f13064q && creditReviewUiModel2.f13063p) {
            m();
            return;
        }
        Object obj = this.c.get();
        NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment2 = (NewMayaCreditActivationConfirmDetailFragment) ((P9.g) obj);
        InterfaceC0583m interfaceC0583m2 = newMayaCreditActivationConfirmDetailFragment2.f13160i0;
        if (interfaceC0583m2 != null) {
            CreditReviewUiModel creditReviewUiModel3 = newMayaCreditActivationConfirmDetailFragment2.G1().h;
            if (creditReviewUiModel3 == null) {
                kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                throw null;
            }
            String str = creditReviewUiModel3.f13062o;
            if (str == null || str.length() == 0) {
                str = "HIGH";
            }
            String apiGatewayEnabled = String.valueOf(S5.c.b(newMayaCreditActivationConfirmDetailFragment2.G1().f2905g, A5.b.f71P));
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) interfaceC0583m2;
            kotlin.jvm.internal.j.g(apiGatewayEnabled, "apiGatewayEnabled");
            com.paymaya.common.utility.E.a("NewMayaCreditActivity", "initializeCreditScoringFullscreen");
            newMayaCreditActivity.f13087s = String.format("home?riskLevel=%s&enableDataReferenceId=true&mecApiGatewayEnabled=%s", Arrays.copyOf(new Object[]{str, apiGatewayEnabled}, 2));
            com.paymaya.common.utility.E.a("NewMayaCreditActivity", "initializeCreditScoringFlutterEngine");
            FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
            kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
            FlutterEngine flutterEngine = flutterEngineCache.get("creditScoringFullscreen");
            if (flutterEngine == null) {
                flutterEngine = new FlutterEngine(newMayaCreditActivity);
                flutterEngineCache.put("creditScoringFullscreen", flutterEngine);
            }
            newMayaCreditActivity.f13084p = flutterEngine;
            pg.u uVar = new pg.u(flutterEngine.getDartExecutor().getBinaryMessenger(), "packages/paymaya_credit_scoring");
            newMayaCreditActivity.f13085q = uVar;
            uVar.b(new N9.d(newMayaCreditActivity));
            FlutterEngine flutterEngine2 = newMayaCreditActivity.f13084p;
            if (flutterEngine2 == null) {
                kotlin.jvm.internal.j.n("creditScoringFullscreenFlutterEngine");
                throw null;
            }
            flutterEngine2.getNavigationChannel().setInitialRoute(newMayaCreditActivity.f13087s);
            FlutterEngine flutterEngine3 = newMayaCreditActivity.f13084p;
            if (flutterEngine3 == null) {
                kotlin.jvm.internal.j.n("creditScoringFullscreenFlutterEngine");
                throw null;
            }
            flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "package:paymaya_module/main.dart", "runCreditScoring"));
        }
        n nVar = new n(3, this, o.class, "setCreditScoringAndEligibilityData", "setCreditScoringAndEligibilityData(Ljava/lang/String;ZLcom/paymaya/domain/model/CreditEligibility;)V", 0, 0);
        InterfaceC0583m interfaceC0583m3 = newMayaCreditActivationConfirmDetailFragment2.f13160i0;
        if (interfaceC0583m3 != null) {
            NewMayaCreditActivity newMayaCreditActivity2 = (NewMayaCreditActivity) interfaceC0583m3;
            com.paymaya.common.utility.E.a("NewMayaCreditActivity", "startCreditScoringActivityIntent");
            newMayaCreditActivity2.f13086r = nVar;
            newMayaCreditActivity2.n1();
            B5.i.h(newMayaCreditActivity2);
        }
        kotlin.jvm.internal.j.d(obj);
    }

    public final void m() {
        Ah.p<CreditEligibility> eligibilityAndCreditScore;
        int i = 2;
        int i4 = 0;
        ((MayaBaseFragment) ((P9.g) this.c.get())).E1();
        boolean zB = S5.c.b(this.f2905g, A5.b.f75R);
        C1264i0 c1264i0 = this.f2904d;
        String strB = i0.b();
        kotlin.jvm.internal.j.f(strB, "getSessionId(...)");
        String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        ((NewMayaCreditActivationConfirmDetailFragment) ((P9.g) this.c.get())).getClass();
        int i6 = Build.VERSION.SDK_INT;
        CreditReviewUiModel creditReviewUiModel = this.h;
        if (creditReviewUiModel == null) {
            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
            throw null;
        }
        String str = creditReviewUiModel.f13066s;
        boolean z4 = creditReviewUiModel.f13067t;
        c1264i0.getClass();
        byte[] bArrA = I5.a.a(strB, lowerCase, string, String.valueOf(i6), str, Boolean.valueOf(z4), Boolean.valueOf(zB));
        if (c1264i0.i()) {
            HashMap mapA = C1264i0.a(c1264i0);
            kotlin.jvm.internal.j.d(bArrA);
            eligibilityAndCreditScore = c1264i0.c.getEligibilityAndCreditScore(mapA, C1264i0.g(bArrA));
            kotlin.jvm.internal.j.d(eligibilityAndCreditScore);
        } else {
            kotlin.jvm.internal.j.d(bArrA);
            eligibilityAndCreditScore = c1264i0.f11449b.getEligibilityAndCreditScore(C1264i0.g(bArrA));
            kotlin.jvm.internal.j.d(eligibilityAndCreditScore);
        }
        e(new Lh.d(new Lh.d(new Lh.h(eligibilityAndCreditScore, zh.b.a(), 0), new Gc.h(this, 6), i), new G6.w(this, 10), i4).e());
        CreditReviewUiModel creditReviewUiModel2 = this.h;
        if (creditReviewUiModel2 == null) {
            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
            throw null;
        }
        creditReviewUiModel2.f13064q = true;
        creditReviewUiModel2.f13063p = true;
        String str2 = creditReviewUiModel2.f13062o;
        if (str2 == null) {
            str2 = "";
        }
        ((NewMayaCreditActivationConfirmDetailFragment) ((P9.g) this.c.get())).H1("CREDIT_FULL_ELIGIBILITY", M.h(new Pair("riskLevel", str2), new Pair("isCreditScoringEnabled", String.valueOf(zB))));
    }

    public final void n() {
        ((MayaBaseFragment) ((P9.g) this.c.get())).E1();
        K.d(this.e, new Ag.j(this, 7));
    }

    public final void o() {
        String str;
        String str2;
        String str3;
        int i = 12;
        int i4 = 0;
        CreditReviewUiModel creditReviewUiModel = this.h;
        if (creditReviewUiModel == null) {
            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
            throw null;
        }
        if (!creditReviewUiModel.f13061n) {
            k();
            return;
        }
        ((MayaBaseFragment) ((P9.g) this.c.get())).E1();
        CreditReviewUiModel creditReviewUiModel2 = this.h;
        if (creditReviewUiModel2 == null) {
            kotlin.jvm.internal.j.n("mCreditReviewUiModel");
            throw null;
        }
        J9.a aVar = creditReviewUiModel2.f13060l;
        if (aVar == null || (str = aVar.f2487d) == null) {
            str = "";
        }
        String str4 = creditReviewUiModel2.j;
        if (str4 == null) {
            str4 = "";
        }
        if (aVar == null || (str2 = aVar.f2485a) == null) {
            str2 = "";
        }
        if (aVar == null || (str3 = aVar.f2486b) == null) {
            str3 = "";
        }
        String strQ = com.paymaya.common.utility.C.q(str);
        String str5 = strQ != null ? strQ : "";
        J9.a aVar2 = creditReviewUiModel2.f13060l;
        ContactReference contactReference = new ContactReference(str2, str3, com.paymaya.common.utility.C.M(aVar2 != null ? aVar2.c : null), str5);
        String strQ2 = com.paymaya.common.utility.C.q(str4);
        e(new Lh.d(new Lh.d(new Lh.h(this.f2904d.d(new ContactReferencePatchRequest(strQ2 != null ? strQ2 : null, com.paymaya.common.utility.C.H(creditReviewUiModel2.h), com.paymaya.common.utility.C.J(creditReviewUiModel2.i), contactReference)), zh.b.a(), 0), new G6.r(this, i), 2), new G6.u(this, i), i4).e());
    }

    public final void p(PayMayaError payMayaError, Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        if (!payMayaError.isSessionTimeout() && !payMayaError.isNetworkError()) {
            P9.g gVar = (P9.g) this.c.get();
            Map mapC = L.c(new Pair("product", "mec"));
            ((NewMayaCreditActivationConfirmDetailFragment) gVar).getClass();
            com.paymaya.common.utility.E.b(throwable, mapC);
        }
        yk.a.e();
    }
}
