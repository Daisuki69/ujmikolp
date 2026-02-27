package D8;

import M8.C0394p1;
import N5.C0447e;
import N5.G0;
import android.content.Intent;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.ViewKt;
import androidx.navigation.fragment.NavHostFragment;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.api.KycSubmissionApi;
import com.paymaya.domain.model.KycLatestSubmissionContentData;
import com.paymaya.domain.model.KycPreSubmissionApp;
import com.paymaya.domain.model.KycPreSubmissionDevice;
import com.paymaya.domain.model.KycPreSubmissionMetadata;
import com.paymaya.domain.model.KycPreSubmissionRequest;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycInitialLoadingFragment;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycSubmittedFragment;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import dOYHB6.yFtIp6.svM7M6;
import java.util.UUID;
import o1.AbstractC1955a;
import w.C2361c;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends C8.a {
    public final /* synthetic */ int e = 0;
    public final com.google.firebase.messaging.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.paymaya.domain.store.L f1010g;
    public final com.paymaya.data.preference.a h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(com.google.firebase.messaging.r rVar, com.paymaya.domain.store.L l6, S0 s02, com.paymaya.data.preference.a preference) {
        super(preference, 0);
        kotlin.jvm.internal.j.g(preference, "preference");
        this.f = rVar;
        this.f1010g = l6;
        this.i = s02;
        this.h = preference;
    }

    @Override // y5.AbstractC2509a
    public void j() {
        int i = 0;
        switch (this.e) {
            case 0:
                super.j();
                if (this.h.e().isShowDnfbpFromProfileEnabled()) {
                    KeyEventDispatcher.Component componentRequireActivity = ((MayaKycInitialLoadingFragment) ((K8.v) this.c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    if (((MayaKycActivity) ((H8.b) componentRequireActivity)).f2()) {
                        MayaKycInitialLoadingFragment mayaKycInitialLoadingFragment = (MayaKycInitialLoadingFragment) ((K8.v) this.c.get());
                        mayaKycInitialLoadingFragment.getClass();
                        C0394p1 c0394p1 = new C0394p1();
                        G0 g02 = mayaKycInitialLoadingFragment.f12557V;
                        kotlin.jvm.internal.j.d(g02);
                        ConstraintLayout constraintLayout = g02.f3627b;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), c0394p1);
                    }
                }
                if (this.h.e().isKycMaintenanceEnabled()) {
                    MayaKycInitialLoadingFragment mayaKycInitialLoadingFragment2 = (MayaKycInitialLoadingFragment) ((K8.v) this.c.get());
                    mayaKycInitialLoadingFragment2.getClass();
                    NavHostFragment.Companion.findNavController(mayaKycInitialLoadingFragment2).navigate(new ActionOnlyNavDirections(R.id.action_maya_kyc_initial_loading_fragment_to_maya_kyc_maintenance_fragment));
                } else if (kotlin.jvm.internal.j.b(this.h.l(), "submitted") || kotlin.jvm.internal.j.b(this.h.x(), "submitted")) {
                    MayaKycInitialLoadingFragment mayaKycInitialLoadingFragment3 = (MayaKycInitialLoadingFragment) ((K8.v) this.c.get());
                    mayaKycInitialLoadingFragment3.getClass();
                    NavHostFragment.Companion.findNavController(mayaKycInitialLoadingFragment3).navigate(new ActionOnlyNavDirections(R.id.action_maya_kyc_initial_loading_fragment_to_maya_kyc_account_under_review_fragment));
                } else if (kotlin.jvm.internal.j.b(this.h.l(), "for_edd") && kotlin.jvm.internal.j.b(svM7M6.getString(this.h.f11330b, "key_edd_status", ""), "for_approval")) {
                    KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycInitialLoadingFragment) ((K8.v) this.c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity2);
                    mayaKycActivity.n1();
                    Intent intent = new Intent(mayaKycActivity, (Class<?>) EDDActivity.class);
                    intent.addFlags(131072);
                    mayaKycActivity.startActivity(intent);
                    mayaKycActivity.finish();
                } else {
                    this.h.b0(UUID.randomUUID().toString());
                    Ah.p pVarU = this.f.u();
                    com.paymaya.domain.store.L l6 = this.f1010g;
                    String RELEASE = Build.VERSION.RELEASE;
                    kotlin.jvm.internal.j.f(RELEASE, "RELEASE");
                    KycPreSubmissionApp kycPreSubmissionApp = new KycPreSubmissionApp(RELEASE);
                    String name = Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
                    kotlin.jvm.internal.j.f(name, "getName(...)");
                    KycPreSubmissionRequest kycPreSubmissionRequest = new KycPreSubmissionRequest(new KycPreSubmissionMetadata(kycPreSubmissionApp, new KycPreSubmissionDevice(EventMetricsAggregator.OS_NAME, name, AbstractC1955a.o())));
                    l6.getClass();
                    e(new Lh.d(new Lh.d(new Lh.h(Ah.p.l(pVarU, ((KycSubmissionApi) l6.f11367b).createPreSubmissionId(kycPreSubmissionRequest).h(Th.e.c), C0195c.f1038d), zh.b.a(), 0), new C2361c(this, 14), 2), new J5.a(this, 16), i).e());
                }
                break;
            default:
                super.j();
                break;
        }
    }

    public void o() {
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycInitialLoadingFragment) ((K8.v) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        if (((MayaKycActivity) ((H8.b) componentRequireActivity)).e2()) {
            MayaKycInitialLoadingFragment mayaKycInitialLoadingFragment = (MayaKycInitialLoadingFragment) ((K8.v) this.c.get());
            mayaKycInitialLoadingFragment.getClass();
            ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_initial_loading_fragment_to_maya_kyc_id_less_entry_flow);
            G0 g02 = mayaKycInitialLoadingFragment.f12557V;
            kotlin.jvm.internal.j.d(g02);
            ConstraintLayout constraintLayout = g02.f3627b;
            kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
            E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
            return;
        }
        if (this.h.e().isKycUxTofuRedesignEnabled()) {
            G0 g03 = ((MayaKycInitialLoadingFragment) ((K8.v) this.c.get())).f12557V;
            kotlin.jvm.internal.j.d(g03);
            ConstraintLayout constraintLayout2 = g03.f3627b;
            kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
            Navigation.findNavController(constraintLayout2).navigate(new ActionOnlyNavDirections(R.id.action_maya_kyc_initial_loading_fragment_to_mayaKycCompleteYourMayaExperienceFragmentV2));
            return;
        }
        G0 g04 = ((MayaKycInitialLoadingFragment) ((K8.v) this.c.get())).f12557V;
        kotlin.jvm.internal.j.d(g04);
        ConstraintLayout constraintLayout3 = g04.f3627b;
        kotlin.jvm.internal.j.f(constraintLayout3, "getRoot(...)");
        Navigation.findNavController(constraintLayout3).navigate(new ActionOnlyNavDirections(R.id.action_to_mayaKycCompleteYourMayaExperienceFragment));
    }

    public void p(KycLatestSubmissionContentData kycLatestSubmissionContentData) {
        ReKycSubmittedFragment reKycSubmittedFragment = (ReKycSubmittedFragment) ((kb.c) this.c.get());
        if (reKycSubmittedFragment.t1().e().isPartnerOnboardingEnabled()) {
            String strP = reKycSubmittedFragment.t1().p();
            kotlin.jvm.internal.j.f(strP, "getMayaOnboardingPartner(...)");
            if (strP.length() > 0) {
                C1219h c1219h = new C1219h();
                c1219h.r(EnumC1216e.REKYC_SUBMITTED);
                c1219h.n(2);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("rekyc_status", reKycSubmittedFragment.t1().x());
                c1219h.j.put("rekyc_reason", reKycSubmittedFragment.t1().w());
                c1219h.j.put("partner", reKycSubmittedFragment.t1().p());
                c1219h.j.put("branch", reKycSubmittedFragment.t1().q());
                c1219h.j.put("kyc_level", reKycSubmittedFragment.t1().k().toString());
                c1219h.i();
                reKycSubmittedFragment.z1(c1219h);
            } else {
                reKycSubmittedFragment.G1();
            }
        } else {
            reKycSubmittedFragment.G1();
        }
        ReKycSubmittedFragment reKycSubmittedFragment2 = (ReKycSubmittedFragment) ((kb.c) this.c.get());
        C0447e c0447e = reKycSubmittedFragment2.f13713U;
        kotlin.jvm.internal.j.d(c0447e);
        ConstraintLayout constraintLayout = ((G0) c0447e.e).f3627b;
        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(8);
        C0447e c0447e2 = reKycSubmittedFragment2.f13713U;
        kotlin.jvm.internal.j.d(c0447e2);
        ((ConstraintLayout) c0447e2.f4080d).setVisibility(0);
        String referenceId = kycLatestSubmissionContentData.getReferenceId();
        if (referenceId == null) {
            referenceId = "";
        }
        ReKycSubmittedFragment reKycSubmittedFragment3 = (ReKycSubmittedFragment) ((kb.c) this.c.get());
        reKycSubmittedFragment3.getClass();
        String string = reKycSubmittedFragment3.getString(R.string.maya_kyc_block_submitted_account_status_subtext_line_reference_number);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        String strJ = androidx.camera.core.impl.a.j(string, Global.BLANK, referenceId);
        C0447e c0447e3 = reKycSubmittedFragment3.f13713U;
        kotlin.jvm.internal.j.d(c0447e3);
        ((MultiColorTextView) c0447e3.f).setText(strJ);
        C0447e c0447e4 = reKycSubmittedFragment3.f13713U;
        kotlin.jvm.internal.j.d(c0447e4);
        ((MultiColorTextView) c0447e4.f).a(ContextCompat.getColor(reKycSubmittedFragment3.requireContext(), R.color.black), strJ, referenceId);
    }

    public E(com.google.firebase.messaging.r rVar, com.paymaya.domain.store.L l6, R4.i iVar, com.paymaya.data.preference.a aVar, S5.c cVar) {
        super(aVar, 0);
        this.f = rVar;
        this.f1010g = l6;
        this.i = iVar;
        this.h = aVar;
    }
}
