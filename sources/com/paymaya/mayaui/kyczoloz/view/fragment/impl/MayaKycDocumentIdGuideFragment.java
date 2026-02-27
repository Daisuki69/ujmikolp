package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.C0215x;
import E8.v;
import G5.u;
import H8.b;
import J8.i;
import K8.InterfaceC0289n;
import M8.C0376l;
import M8.C0389o0;
import M8.C0400r0;
import M8.C0404s0;
import M8.C0408t0;
import M8.RunnableC0397q0;
import M8.T2;
import N5.C0439b0;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.L;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.KycDocumentSample;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycDocumentIdGuideFragment extends MayaKycBaseFragment<C0439b0> implements InterfaceC0289n, u {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0215x f12515W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final NavArgsLazy f12516X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final InterfaceC1033d f12517Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final N f12518Z;

    public MayaKycDocumentIdGuideFragment() {
        super(C0400r0.f3360a);
        this.f12516X = new NavArgsLazy(z.a(C0408t0.class), new C0376l(this, 5));
        this.f12517Y = C1034e.b(new C0389o0(this, 0));
        this.f12518Z = new N(this, 10);
    }

    @Override // G5.u
    public final void H(String str, String str2) {
        String str3;
        if (str2 == null) {
            str2 = "";
        }
        T2.Q(this, str2, null, null, 14);
        if (j.b(str, "DigitalID")) {
            str3 = "Digital National ID (Website)";
        } else if (!j.b(str, "eGovPH")) {
            return;
        } else {
            str3 = "Digital National ID (eGov PH app)";
        }
        i iVar = (i) this.f12517Y.getValue();
        iVar.getClass();
        Iterator it = iVar.f2469a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if ((next instanceof KycDocumentSample) && zj.z.o(((KycDocumentSample) next).getVariant(), str3, true)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            ((C0439b0) G1()).f.post(new RunnableC0397q0(this, i, 0));
        }
    }

    public final C0215x K1() {
        C0215x c0215x = this.f12515W;
        if (c0215x != null) {
            return c0215x;
        }
        j.n("mDocumentIdGuideFragmentPresenter");
        throw null;
    }

    public final MayaEKYCSelectedDocument L1() {
        return ((C0408t0) this.f12516X.getValue()).b();
    }

    public final void M1(int i, String str, float f) {
        ((C0439b0) G1()).f4059b.setWeightSum(f);
        ((C0439b0) G1()).f4060d.setVisibility(i);
        ((C0439b0) G1()).c.setText(str);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.ID_TYPE_GUIDE;
    }

    @Override // L8.e
    public final void h1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        final b bVar = (b) componentRequireActivity;
        ConstraintLayout constraintLayout = ((C0439b0) G1()).f4058a;
        j.f(constraintLayout, "getRoot(...)");
        C0404s0 c0404s0 = C0404s0.f3365a;
        String screenName = ((MayaKycActivity) bVar).s().toString();
        j.g(screenName, "screenName");
        final int i = 0;
        Function0 function0 = new Function0() { // from class: M8.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ((MayaKycActivity) bVar).j2(Integer.valueOf(R.id.maya_kyc_complete_your_maya_experience_fragment));
                        break;
                    default:
                        ((MayaKycActivity) bVar).j2(Integer.valueOf(R.id.maya_kyc_complete_your_maya_experience_fragment));
                        break;
                }
                return Unit.f18162a;
            }
        };
        final int i4 = 1;
        Function0 function02 = new Function0() { // from class: M8.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ((MayaKycActivity) bVar).j2(Integer.valueOf(R.id.maya_kyc_complete_your_maya_experience_fragment));
                        break;
                    default:
                        ((MayaKycActivity) bVar).j2(Integer.valueOf(R.id.maya_kyc_complete_your_maya_experience_fragment));
                        break;
                }
                return Unit.f18162a;
            }
        };
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.f12446n = new E8.u(function0, 0);
        mayaKycActivity.f12447o = new v(function02, 0);
        Navigation.findNavController(constraintLayout).navigate((NavDirections) c0404s0.invoke(2131231241, Integer.valueOf(R.string.maya_label_that_didnt_load_right), Integer.valueOf(R.string.maya_label_something_went_wrong), Integer.valueOf(R.string.maya_label_got_it), screenName, -1));
    }

    @Override // G5.t
    public final void m(String str, View view) {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        a aVar = (a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        e0 resourceManager = (e0) aVar.f4685S.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(resourceManager, "resourceManager");
        this.f12515W = new C0215x(preference, flagConfigurationService, resourceManager, 0);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12518Z);
        K1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        K1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String key;
        String key2;
        super.onResume();
        C0215x c0215xK1 = K1();
        String str = "";
        if (c0215xK1.e.e().isPartnerOnboardingEnabled()) {
            String strP = c0215xK1.e.p();
            j.f(strP, "getMayaOnboardingPartner(...)");
            if (strP.length() > 0) {
                MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment = (MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) c0215xK1.c.get());
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentL1 = mayaKycDocumentIdGuideFragment.L1();
                if (mayaEKYCSelectedDocumentL1 != null && (key2 = mayaEKYCSelectedDocumentL1.getKey()) != null) {
                    str = key2;
                }
                T2.H(mayaKycDocumentIdGuideFragment, M.h(new Pair(EnumC1212a.ONBOARDING_KYC_LEVEL, mayaKycDocumentIdGuideFragment.t1().k().toString()), new Pair(EnumC1212a.ID_TYPE_GUIDE, str)), 2);
                return;
            }
        }
        MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment2 = (MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) c0215xK1.c.get());
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentL12 = mayaKycDocumentIdGuideFragment2.L1();
        if (mayaEKYCSelectedDocumentL12 != null && (key = mayaEKYCSelectedDocumentL12.getKey()) != null) {
            str = key;
        }
        T2.H(mayaKycDocumentIdGuideFragment2, L.c(new Pair(EnumC1212a.ID_TYPE_GUIDE, str)), 2);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.t2();
        H8.a aVar = H8.a.f2141b;
        mayaKycActivity.R1();
        mayaKycActivity.E1(33);
        mayaKycActivity.n2(aVar);
        mayaKycActivity.t1();
        mayaKycActivity.p2(new M8.L(this, 2));
        C0439b0 c0439b0 = (C0439b0) G1();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = c0439b0.f;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter((i) this.f12517Y.getValue());
        C.r0(((C0439b0) G1()).c, new C0389o0(this, 1));
        C.r0(((C0439b0) G1()).f4060d, new C0389o0(this, 2));
        K1().j();
    }
}
