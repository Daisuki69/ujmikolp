package com.paymaya.mayaui.compliance.view.fragment.impl;

import N5.C0441c;
import N5.C0491z;
import N5.G0;
import O5.c;
import Q6.l;
import W4.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.compliance.view.activity.impl.MayaComplianceActivity;
import g7.InterfaceC1505a;
import i7.InterfaceC1592a;
import kotlin.jvm.internal.j;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaComplianceInitialLoadingFragment extends MayaBaseFragment implements InterfaceC1592a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public l f12103U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public G0 f12104V;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVarE = a.e();
        if (aVarE.f6257Q == null) {
            O5.a aVar = aVarE.f6267a;
            C1916a c1916a = new C1916a(21);
            aVar.getClass();
            aVarE.f6257Q = new c(aVar.f4704b, c1916a);
        }
        O5.a aVar2 = aVarE.f6257Q.f4752a;
        this.f10334B = (C1220i) aVar2.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f10336P = (S5.c) aVar2.f4724k.get();
        aVar2.x();
        aVar2.z();
        aVar2.w();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar2.e.get();
        j.g(preference, "preference");
        l lVar = new l(26);
        this.f12103U = lVar;
        lVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_compliance_initial_loading, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.maya_compliance_lottie_view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.maya_compliance_lottie_view)));
        }
        this.f12104V = new G0(constraintLayout, 5);
        j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        l lVar = this.f12103U;
        if (lVar == null) {
            j.n("mInitialLoadingFragmentPresenter");
            throw null;
        }
        lVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12104V = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.compliance.view.activity.IMayaComplianceActivityView");
        String str = ((MayaComplianceActivity) ((InterfaceC1505a) componentRequireActivity)).f12102o;
        if (str == null) {
            str = "";
        }
        l lVar = this.f12103U;
        if (lVar == null) {
            j.n("mInitialLoadingFragmentPresenter");
            throw null;
        }
        if (str.equals("FATCA")) {
            G0 g02 = ((MayaComplianceInitialLoadingFragment) ((InterfaceC1592a) lVar.c.get())).f12104V;
            j.d(g02);
            ConstraintLayout constraintLayout = g02.f3627b;
            j.f(constraintLayout, "getRoot(...)");
            Navigation.findNavController(constraintLayout).navigate(new ActionOnlyNavDirections(R.id.action_to_mayaFatcaFragment));
        } else if (str.equals("DOSRI")) {
            G0 g03 = ((MayaComplianceInitialLoadingFragment) ((InterfaceC1592a) lVar.c.get())).f12104V;
            j.d(g03);
            ConstraintLayout constraintLayout2 = g03.f3627b;
            j.f(constraintLayout2, "getRoot(...)");
            Navigation.findNavController(constraintLayout2).navigate(new ActionOnlyNavDirections(R.id.action_to_mayaDosriFragment));
        }
        super.onResume();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.compliance.view.activity.IMayaComplianceActivityView");
        C0441c c0441c = ((MayaComplianceActivity) ((InterfaceC1505a) componentRequireActivity)).f12101n;
        j.d(c0441c);
        ((Toolbar) ((C0491z) c0441c.c).e).setVisibility(8);
    }
}
