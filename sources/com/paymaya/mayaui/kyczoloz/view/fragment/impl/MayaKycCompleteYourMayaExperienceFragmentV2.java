package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ag.l;
import B5.i;
import Bb.a;
import D.N;
import G5.u;
import H8.b;
import J8.d;
import J8.p;
import K8.InterfaceC0284i;
import M8.C0349e0;
import M8.C0353f0;
import M8.InterfaceC0345d0;
import M8.T2;
import M8.ViewOnClickListenerC0336b;
import N5.C0457h0;
import S5.c;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycCompleteYourMayaExperienceFragmentV2 extends MayaKycBaseFragment<C0457h0> implements InterfaceC0284i, u {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public a f12498W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public InterfaceC0345d0 f12499X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final InterfaceC1033d f12500Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final N f12501Z;

    public MayaKycCompleteYourMayaExperienceFragmentV2() {
        super(C0353f0.f3296a);
        this.f12500Y = C1034e.b(new C0349e0(this, 0));
        this.f12501Z = new N(this, 8);
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // G5.u
    public final void H(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        T2.Q(this, str2, null, null, 14);
        if (str != null) {
            switch (str.hashCode()) {
                case -1822390875:
                    if (str.equals("SeeIDs")) {
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragmentV2_to_maya_kyc_accepted_ids_fragment);
                        String string = getString(R.string.maya_kyc_complete_your_maya_experience_first_step_available_ids);
                        j.f(string, "getString(...)");
                        T2.Q(this, string, T2.l(this, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((C0457h0) G1()).f4103a;
                        j.f(constraintLayout, "getRoot(...)");
                        Navigation.findNavController(constraintLayout).navigate(actionOnlyNavDirections);
                        break;
                    }
                    break;
                case -736142439:
                    if (str.equals("LearnMore")) {
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragmentV2_to_maya_kyc_example_upgrade_bottom_sheet_dialog_fragment);
                        String string2 = getString(R.string.maya_kyc_complete_your_maya_experience_get_identified_information_highlight);
                        j.f(string2, "getString(...)");
                        T2.Q(this, string2, T2.l(this, actionOnlyNavDirections2).toString(), null, 12);
                        ConstraintLayout constraintLayout2 = ((C0457h0) G1()).f4103a;
                        j.f(constraintLayout2, "getRoot(...)");
                        Navigation.findNavController(constraintLayout2).navigate(actionOnlyNavDirections2);
                        break;
                    }
                    break;
                case -127836066:
                    if (str.equals("DataPrivacy")) {
                        String string3 = getString(R.string.maya_kyc_complete_your_maya_experience_privacy_statement);
                        j.f(string3, "getString(...)");
                        T2.Q(this, string3, "https://www.paymaya.com/privacy/?in_app=true", null, 12);
                        InterfaceC0345d0 interfaceC0345d0 = this.f12499X;
                        if (interfaceC0345d0 != null) {
                            MayaKycActivity mayaKycActivity = (MayaKycActivity) interfaceC0345d0;
                            mayaKycActivity.n1().k0(mayaKycActivity, "https://www.paymaya.com/privacy/?in_app=true");
                        }
                        break;
                    }
                    break;
                case 1145445573:
                    if (str.equals("EnterCode")) {
                        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
                        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        String sourcePage = T2.j(this);
                        MayaKycActivity mayaKycActivity2 = (MayaKycActivity) ((b) componentRequireActivity);
                        j.g(sourcePage, "sourcePage");
                        mayaKycActivity2.n1();
                        i.Q(mayaKycActivity2, "submitInviteCodeScreen", sourcePage, null);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.INTRO;
    }

    @Override // G5.t
    public final void m(String str, View view) {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f12499X = (InterfaceC0345d0) getActivity();
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12498W = new a(preference, 2, false);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12501Z);
        a aVar2 = this.f12498W;
        if (aVar2 != null) {
            aVar2.h(this);
        } else {
            j.n("mPresenter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f12498W;
        if (aVar == null) {
            j.n("mPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T2.I(this, "INITIAL_LOADING");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.t2();
        mayaKycActivity.o2(R.drawable.maya_ic_close);
        Window window = requireActivity().getWindow();
        window.setStatusBarColor(ContextCompat.getColor(requireContext(), R.color.neon_green_10_opacity));
        window.setNavigationBarColor(ContextCompat.getColor(requireContext(), android.R.color.white));
        WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(window.getDecorView());
        if (windowInsetsController != null) {
            windowInsetsController.setAppearanceLightStatusBars(true);
            windowInsetsController.setAppearanceLightNavigationBars(true);
        }
        WindowInsetsControllerCompat windowInsetsController2 = ViewCompat.getWindowInsetsController(window.getDecorView());
        if (windowInsetsController2 != null) {
            windowInsetsController2.setAppearanceLightStatusBars(true);
            windowInsetsController2.setAppearanceLightNavigationBars(true);
        }
        mayaKycActivity.s2(R.color.neon_green_10_opacity, R.color.maya_primary_white);
        mayaKycActivity.p2(new ViewOnClickListenerC0336b(2, bVar));
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        mayaKycActivity.t1();
        C.r0(((C0457h0) G1()).c, new C0349e0(this, 1));
        C.r0(((C0457h0) G1()).f4109n, new l(10, this, bVar));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
        C0457h0 c0457h0 = (C0457h0) G1();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        RecyclerView recyclerView = c0457h0.f;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter((p) this.f12500Y.getValue());
        recyclerView.addItemDecoration(new d(dimensionPixelSize));
        super.onStart();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.m2();
        mayaKycActivity.l2();
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        a aVar = this.f12498W;
        if (aVar != null) {
            aVar.j();
        } else {
            j.n("mPresenter");
            throw null;
        }
    }
}
