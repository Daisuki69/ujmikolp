package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D8.E;
import H8.b;
import K8.v;
import M8.C0344d;
import M8.C0348e;
import M8.C0398q1;
import N5.G0;
import O5.a;
import R4.i;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import com.google.firebase.messaging.r;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycInitialLoadingFragment extends MayaBaseFragment implements v {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public E f12556U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public G0 f12557V;

    public final void b0(int i) {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.f12446n = new C0344d(7, bVar);
        mayaKycActivity.f12447o = new C0348e(7, bVar);
        G0 g02 = this.f12557V;
        j.d(g02);
        ConstraintLayout constraintLayout = g02.f3627b;
        j.f(constraintLayout, "getRoot(...)");
        Navigation.findNavController(constraintLayout).navigate(new C0398q1(mayaKycActivity.s().toString(), i));
    }

    @Override // L8.d
    public final void j1() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = (a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        r rVarX = aVar.x();
        L lZ = aVar.z();
        i iVarW = aVar.w();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        E e = new E(rVarX, lZ, iVarW, preference, flagConfigurationService);
        this.f12556U = e;
        e.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        G0 g0A = G0.a(inflater.inflate(R.layout.maya_fragment_kyc_initial_loading, viewGroup, false));
        this.f12557V = g0A;
        ConstraintLayout constraintLayout = g0A.f3627b;
        j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        E e = this.f12556U;
        if (e == null) {
            j.n("mInitialLoadingFragmentPresenter");
            throw null;
        }
        e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12557V = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        E e = this.f12556U;
        if (e == null) {
            j.n("mInitialLoadingFragmentPresenter");
            throw null;
        }
        e.j();
        super.onResume();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).b2();
    }

    @Override // L8.d
    public final void q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).q();
    }
}
