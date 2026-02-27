package A7;

import D.C;
import D.C0187u;
import D.CallableC0186t;
import D.H;
import D.K;
import D.P;
import D.Q;
import D.S;
import D.c0;
import D8.B;
import D8.C0214w;
import D8.T;
import E8.D;
import E8.E;
import G7.C0258a;
import G7.C0265h;
import G7.InterfaceC0263f;
import K8.InterfaceC0279d;
import K8.InterfaceC0294t;
import K8.O;
import M8.C0413u1;
import M8.G;
import M8.InterfaceC0338b1;
import M8.S2;
import M8.T2;
import N5.C0438b;
import N5.C0459i0;
import N5.C0490y0;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.ViewKt;
import cj.L;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.Dosri;
import com.paymaya.domain.model.KycRegulatoryProfileStatusResponse;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFatcaFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneSwornStatementFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsDetailsFragment;
import com.paymaya.ui.ekyc.view.widget.EDDInput;
import com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Ch.a, Ch.c, G5.j, ActivityResultCallback, OnApplyWindowInsetsListener, l0.f, FragmentResultListener, pg.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f205b;

    public /* synthetic */ c(Object obj, int i) {
        this.f204a = i;
        this.f205b = obj;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f204a) {
            case 1:
                Throwable throwable = (Throwable) obj;
                B5.d dVar = (B5.d) this.f205b;
                dVar.getClass();
                kotlin.jvm.internal.j.g(throwable, "throwable");
                yk.a.d();
                com.paymaya.data.preference.a aVar = dVar.f356a;
                aVar.y().fetchAndActivate(dVar);
                if (!dVar.e) {
                    aVar.y().fetchLiveAndActivate(dVar);
                    dVar.e = true;
                }
                break;
            default:
                ((B5.h) this.f205b).f366d.f370g = (io.reactivex.rxjava3.disposables.b) obj;
                break;
        }
    }

    @Override // G5.j
    public void c() {
        EDDInput eDDInput;
        EDDInputFinancialDocument eDDInputFinancialDocument;
        switch (this.f204a) {
            case 6:
                EDDInput eDDInput2 = (EDDInput) this.f205b;
                EDDInput eDDInput3 = eDDInput2.e;
                if (((eDDInput3 != null && eDDInput3.b()) || eDDInput2.b()) && (eDDInput = eDDInput2.e) != null) {
                    eDDInput.c();
                    break;
                }
                break;
            default:
                EDDInputFinancialDocument eDDInputFinancialDocument2 = (EDDInputFinancialDocument) this.f205b;
                EDDInputFinancialDocument eDDInputFinancialDocument3 = eDDInputFinancialDocument2.j;
                if (eDDInputFinancialDocument3 != null && eDDInputFinancialDocument3.b() && eDDInputFinancialDocument2.b() && (eDDInputFinancialDocument = eDDInputFinancialDocument2.j) != null) {
                    eDDInputFinancialDocument.c();
                }
                String str = eDDInputFinancialDocument2.f14600g;
                if (str == null || C2576A.H(str)) {
                    eDDInputFinancialDocument2.getMBackgroundDocument().setBackground(ResourcesCompat.getDrawable(eDDInputFinancialDocument2.getResources(), R.drawable.pma_background_dark_white_red_thin_border, null));
                    eDDInputFinancialDocument2.getMTextViewError().setVisibility(0);
                }
                break;
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        int i = 0;
        switch (this.f204a) {
            case 8:
                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) this.f205b;
                ActivityResult it = (ActivityResult) obj;
                int i4 = MayaDashboardActivity.f12133U;
                kotlin.jvm.internal.j.g(it, "it");
                b bVarY1 = mayaDashboardActivity.Y1();
                int resultCode = it.getResultCode();
                Intent data = it.getData();
                Serializable serializableExtra = data != null ? data.getSerializableExtra("module_name") : null;
                EnumC1215d enumC1215d = serializableExtra instanceof EnumC1215d ? (EnumC1215d) serializableExtra : null;
                if (enumC1215d == null) {
                    enumC1215d = EnumC1215d.DEFAULT;
                }
                if (resultCode == 10) {
                    ((MayaDashboardActivity) ((B7.a) bVarY1.c.get())).t2(enumC1215d, null);
                }
                break;
            default:
                Boolean isGranted = (Boolean) obj;
                kotlin.jvm.internal.j.g(isGranted, "isGranted");
                if (!isGranted.booleanValue()) {
                    FragmentActivity fragmentActivityRequireActivity = ((MayaKycBaseFragment) this.f205b).requireActivity();
                    kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                    new AlertDialog.Builder(fragmentActivityRequireActivity).setTitle("Permission Denied").setMessage("You have permanently denied this permission. Please enable it in settings.").setPositiveButton("Go to Settings", new D(fragmentActivityRequireActivity, i)).setNegativeButton("Cancel", new E(i)).show();
                }
                break;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v7, WindowInsetsCompat insets) {
        Function2 marginAdjuster = (Function2) this.f205b;
        kotlin.jvm.internal.j.g(marginAdjuster, "$marginAdjuster");
        kotlin.jvm.internal.j.g(v7, "v");
        kotlin.jvm.internal.j.g(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        kotlin.jvm.internal.j.f(insets2, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v7.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginAdjuster.invoke(insets2, marginLayoutParams);
        v7.setLayoutParams(marginLayoutParams);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        kotlin.jvm.internal.j.g(str, "<unused var>");
        kotlin.jvm.internal.j.g(bundle, "bundle");
        ((Ag.f) this.f205b).invoke(Boolean.valueOf(bundle.getBoolean("confirmation_result_boolean")));
    }

    @Override // pg.s
    public void onMethodCall(pg.r rVar, pg.t tVar) {
        switch (this.f204a) {
            case 26:
                ((C0258a) this.f205b).g(rVar, tVar);
                break;
            case 27:
                ((C0265h) this.f205b).g(rVar, tVar);
                break;
            case 28:
                ((G7.j) this.f205b).g(rVar, tVar);
                break;
            default:
                ((G7.n) this.f205b).g(rVar, tVar);
                break;
        }
    }

    @Override // l0.f
    public void onSuccess(Object obj) {
        H h = (H) this.f205b;
        String str = (String) obj;
        S sC = h.f844d.c();
        String strP = We.s.p(new StringBuilder(), h.f844d.f9439a, ":async_deviceID");
        String str2 = "DeviceID initialized successfully!" + Thread.currentThread();
        sC.getClass();
        S.s(strP, str2);
        C0187u c0187uJ = C0187u.j(h.e, h.f844d);
        C c = c0187uJ.f949b;
        String str3 = ((CleverTapInstanceConfig) c.f814a).f9439a;
        Y.f fVar = (Y.f) c.f824r;
        Cg.c cVar = (Cg.c) c.f823q;
        c0 c0VarB = c0.f900a.b();
        C c10 = c0187uJ.f949b;
        R.c cVar2 = (R.c) c10.f819l;
        Q q9 = (Q) c10.f816d;
        q9.g("LocalDataStore#inflateLocalProfileAsync", new P(0, q9, c0187uJ.f948a, q9.f862b.f9439a));
        ((l0.c) c0187uJ.f949b.f825s).a().k("initStores", new CallableC0186t(c0187uJ, fVar, c0VarB, cVar, str, str3, cVar2));
        if (((K) ((D.A) c0187uJ.f949b.j).f791a) == null) {
            S sE = c0187uJ.e();
            sE.getClass();
            S.s(We.s.i(str3, ":async_deviceID"), "Initializing InAppFC after Device ID Created = " + str);
            C c11 = c0187uJ.f949b;
            ((D.A) c11.j).f791a = new K(c0187uJ.f948a, (CleverTapInstanceConfig) c11.f814a, str, (Y.f) c11.f824r, (N.e) c11.m, (l0.c) c11.f825s, C0187u.f947g);
        }
        L.b bVar = (L.b) ((D.A) c0187uJ.f949b.j).f793d;
        if (bVar != null && TextUtils.isEmpty(bVar.f2793b)) {
            S sE2 = c0187uJ.e();
            sE2.getClass();
            S.s(We.s.i(str3, ":async_deviceID"), "Initializing Feature Flags after Device ID Created = " + str);
            if (!bVar.c) {
                bVar.f2793b = str;
                bVar.c();
            }
        }
        b1.t tVar = (b1.t) ((D.A) c0187uJ.f949b.j).f794g;
        if (tVar != null && TextUtils.isEmpty((String) ((com.google.firebase.messaging.r) tVar.h).f9803b)) {
            S sE3 = c0187uJ.e();
            sE3.getClass();
            S.s(We.s.i(str3, ":async_deviceID"), "Initializing Product Config after Device ID Created = " + str);
            if (!((AtomicBoolean) tVar.c).get() && !TextUtils.isEmpty(str)) {
                ((com.google.firebase.messaging.r) tVar.h).f9803b = str;
                tVar.i();
            }
        }
        c0187uJ.e().getClass();
        S.s(str3 + ":async_deviceID", "Got device id from DeviceInfo, notifying user profile initialized to SyncListener");
        D.r rVar = (D.r) c0187uJ.f949b.i;
        if (str == null) {
            rVar.h.f();
        }
        D.r rVar2 = (D.r) c0187uJ.f949b.i;
        synchronized (rVar2.j) {
            try {
                Iterator it = rVar2.j.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Ch.a
    public void run() {
        G g8;
        Dosri dosri;
        MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment;
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentM1;
        switch (this.f204a) {
            case 0:
                InterfaceC0263f interfaceC0263f = ((MayaDashboardFragment) ((F7.a) ((h) this.f205b).c.get())).f12175p0;
                if (interfaceC0263f != null) {
                    MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) interfaceC0263f;
                    mayaDashboardActivity.n1().z(mayaDashboardActivity);
                    return;
                }
                return;
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 17:
            case 18:
            default:
                ((MayaBaseFragment) ((K6.p) ((G6.x) this.f205b).c.get())).w1();
                return;
            case 3:
                yk.a.a();
                B5.l lVar = ((B5.m) this.f205b).f377a;
                lVar.f = true;
                B5.k kVar = lVar.e;
                if (kVar != null) {
                    kVar.cancel();
                    return;
                }
                return;
            case 4:
                B9.c cVar = (B9.c) this.f205b;
                SpringView springView = ((MayaMissionsDetailsFragment) ((F9.b) cVar.c.get())).f12968V;
                if (springView == null) {
                    kotlin.jvm.internal.j.n("mSpringView");
                    throw null;
                }
                springView.i();
                ((MayaMissionsDetailsFragment) ((F9.b) cVar.c.get())).f12986o0 = false;
                return;
            case 5:
                ((MayaBaseFragment) ((Fb.d) ((Bb.o) this.f205b).c.get())).w1();
                return;
            case 11:
                ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) this.f205b)).w1();
                return;
            case 12:
                B b8 = (B) this.f205b;
                ((MayaBaseFragment) ((InterfaceC0294t) b8.c.get())).w1();
                if (b8.f.e().isDosriEnabled()) {
                    KycRegulatoryProfileStatusResponse kycRegulatoryProfileStatusResponse = b8.h;
                    if ((kycRegulatoryProfileStatusResponse == null || (dosri = kycRegulatoryProfileStatusResponse.getDosri()) == null) ? false : kotlin.jvm.internal.j.b(dosri.isRequired(), Boolean.TRUE)) {
                        String str = b8.i;
                        if (str != null) {
                            MayaKycFatcaFragment mayaKycFatcaFragment = (MayaKycFatcaFragment) ((InterfaceC0294t) b8.c.get());
                            mayaKycFatcaFragment.getClass();
                            ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_to_maya_kyc_dosri_fragment);
                            T2.P(mayaKycFatcaFragment, str, T2.l(mayaKycFatcaFragment, actionOnlyNavDirections).toString(), L.c(new Pair(EnumC1212a.CALLER, "mobile-app-kyc")), true);
                            ConstraintLayout constraintLayout = ((C0438b) mayaKycFatcaFragment.G1()).f4055a;
                            kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                            E1.c.m(Navigation.findNavController(constraintLayout), actionOnlyNavDirections);
                            return;
                        }
                        return;
                    }
                }
                String str2 = b8.i;
                if (str2 != null) {
                    MayaKycFatcaFragment mayaKycFatcaFragment2 = (MayaKycFatcaFragment) ((InterfaceC0294t) b8.c.get());
                    mayaKycFatcaFragment2.getClass();
                    KeyEventDispatcher.Component componentRequireActivity = mayaKycFatcaFragment2.requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f1046o = true;
                    String string = mayaKycFatcaFragment2.getString(R.string.maya_fragment_kyc_complete_personal_information_screen_label);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    T2.P(mayaKycFatcaFragment2, str2, string, L.c(new Pair(EnumC1212a.CALLER, "mobile-app-kyc")), true);
                    mayaKycFatcaFragment2.getParentFragmentManager().popBackStackImmediate();
                    InterfaceC0338b1 interfaceC0338b1 = mayaKycFatcaFragment2.f12541X;
                    if (interfaceC0338b1 == null || (g8 = ((MayaKycActivity) interfaceC0338b1).f12452t) == null) {
                        return;
                    }
                    g8.invoke();
                    return;
                }
                return;
            case 13:
                D8.G g10 = (D8.G) this.f205b;
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentM12 = ((MayaKycLivenessCaptureFragment) ((K8.w) g10.c.get())).M1();
                MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment2 = (MayaKycLivenessCaptureFragment) ((K8.w) g10.c.get());
                mayaKycLivenessCaptureFragment2.getClass();
                Bundle bundle = ((F8.a) mayaKycLivenessCaptureFragment2.f12560Y.getValue(mayaKycLivenessCaptureFragment2, MayaKycLivenessCaptureFragment.f12558d0[0])).f1551a;
                if (bundle != null ? bundle.getBoolean("isOnIdLessFlow") : false) {
                    MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment3 = (MayaKycLivenessCaptureFragment) ((K8.w) g10.c.get());
                    mayaKycLivenessCaptureFragment3.getClass();
                    ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_liveness_capture_fragment_to_maya_kyc_work_details_flow);
                    ConstraintLayout constraintLayout2 = ((C0459i0) mayaKycLivenessCaptureFragment3.G1()).f4117a;
                    kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                    E1.c.m(ViewKt.findNavController(constraintLayout2), actionOnlyNavDirections2);
                    return;
                }
                if (!g10.f.e().isSupportSecondaryIdFlowEnabled()) {
                    g10.o();
                    return;
                }
                String idLevel = mayaEKYCSelectedDocumentM12 != null ? mayaEKYCSelectedDocumentM12.getIdLevel() : null;
                if (idLevel != null) {
                    int iHashCode = idLevel.hashCode();
                    if (iHashCode == -817598092) {
                        if (idLevel.equals("secondary") && (mayaEKYCSelectedDocumentM1 = (mayaKycLivenessCaptureFragment = (MayaKycLivenessCaptureFragment) ((K8.w) g10.c.get())).M1()) != null) {
                            C0413u1 c0413u1 = new C0413u1(mayaEKYCSelectedDocumentM1);
                            ConstraintLayout constraintLayout3 = ((C0459i0) mayaKycLivenessCaptureFragment.G1()).f4117a;
                            kotlin.jvm.internal.j.f(constraintLayout3, "getRoot(...)");
                            E1.c.m(ViewKt.findNavController(constraintLayout3), c0413u1);
                            return;
                        }
                        return;
                    }
                    if (iHashCode != -314765822) {
                        if (iHashCode != 1437916763 || !idLevel.equals("recommended")) {
                            return;
                        }
                    } else if (!idLevel.equals("primary")) {
                        return;
                    }
                    KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycLivenessCaptureFragment) ((K8.w) g10.c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    if (!((MayaKycActivity) ((H8.b) componentRequireActivity2)).f2()) {
                        g10.o();
                        return;
                    }
                    MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment4 = (MayaKycLivenessCaptureFragment) ((K8.w) g10.c.get());
                    mayaKycLivenessCaptureFragment4.getClass();
                    ActionOnlyNavDirections actionOnlyNavDirections3 = new ActionOnlyNavDirections(R.id.action_maya_kyc_liveness_capture_fragment_to_maya_kyc_work_details_flow);
                    ConstraintLayout constraintLayout4 = ((C0459i0) mayaKycLivenessCaptureFragment4.G1()).f4117a;
                    kotlin.jvm.internal.j.f(constraintLayout4, "getRoot(...)");
                    E1.c.m(ViewKt.findNavController(constraintLayout4), actionOnlyNavDirections3);
                    return;
                }
                return;
            case 14:
                ((MayaKycSsneSwornStatementFragment) ((K8.G) this.f205b)).w1();
                return;
            case 15:
                T t5 = (T) this.f205b;
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentP = t5.p();
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment = (MayaKycUploadPhilsysIdFragment) ((O) t5.c.get());
                if (mayaEKYCSelectedDocumentP == null) {
                    mayaKycUploadPhilsysIdFragment.getClass();
                    return;
                }
                ConstraintLayout constraintLayout5 = ((C0490y0) mayaKycUploadPhilsysIdFragment.G1()).f4297a;
                kotlin.jvm.internal.j.f(constraintLayout5, "getRoot(...)");
                E1.c.m(Navigation.findNavController(constraintLayout5), new S2(mayaEKYCSelectedDocumentP));
                return;
            case 16:
                ((MayaBaseFragment) ((Fc.b) ((C0214w) this.f205b).c.get())).w1();
                return;
            case 19:
                ((MayaBaseFragment) ((K6.b) ((C0214w) this.f205b).c.get())).w1();
                return;
            case 20:
                ((MayaBaseFragment) ((K6.d) ((G6.d) this.f205b).c.get())).w1();
                return;
            case 21:
                ((MayaBaseFragment) ((K6.e) ((G6.g) this.f205b).c.get())).w1();
                return;
            case 22:
                ((MayaBaseFragment) ((K6.g) ((G6.m) this.f205b).c.get())).w1();
                return;
            case 23:
                ((MayaBaseFragment) ((K6.k) ((C0214w) this.f205b).c.get())).w1();
                return;
            case 24:
                ((MayaBaseFragment) ((K6.o) ((Bb.f) this.f205b).c.get())).w1();
                return;
        }
    }
}
