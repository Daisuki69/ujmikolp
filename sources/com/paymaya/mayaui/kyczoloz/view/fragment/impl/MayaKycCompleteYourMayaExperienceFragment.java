package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ag.l;
import D.N;
import D8.C0214w;
import H8.b;
import K8.InterfaceC0283h;
import M8.C0341c0;
import M8.InterfaceC0345d0;
import M8.ViewOnClickListenerC0336b;
import N5.Y;
import O8.a;
import S5.c;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompleteYourMayaExperienceFragment;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycCompleteYourMayaExperienceFragment extends MayaKycBaseFragment<Y> implements InterfaceC0283h, a {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0214w f12495W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public InterfaceC0345d0 f12496X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final N f12497Y;

    public MayaKycCompleteYourMayaExperienceFragment() {
        super(C0341c0.f3277a);
        this.f12497Y = new N(this, 7);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.INTRO;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f12496X = (InterfaceC0345d0) getActivity();
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        e0 resourceManager = (e0) aVar.f4685S.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(resourceManager, "resourceManager");
        this.f12495W = new C0214w(preference, flagConfigurationService, resourceManager);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12497Y);
        C0214w c0214w = this.f12495W;
        if (c0214w != null) {
            c0214w.h(this);
        } else {
            j.n("mCompleteYourMayaExperienceFragmentPresenter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0214w c0214w = this.f12495W;
        if (c0214w == null) {
            j.n("mCompleteYourMayaExperienceFragmentPresenter");
            throw null;
        }
        c0214w.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.t2();
        mayaKycActivity.p2(new ViewOnClickListenerC0336b(1, bVar));
        ((Y) G1()).f.setListHideExpandListener(this);
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        mayaKycActivity.t1();
        final int i = 0;
        C.r0(((Y) G1()).c, new Function0(this) { // from class: M8.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycCompleteYourMayaExperienceFragment f3272b;

            {
                this.f3272b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment = this.f3272b;
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_complete_your_maya_experience_fragment_to_mayaKycExampleUpgradeBottomSheetDialogFragment);
                        String string = mayaKycCompleteYourMayaExperienceFragment.getString(R.string.maya_kyc_complete_your_maya_experience_get_identified_information_highlight);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment, string, T2.l(mayaKycCompleteYourMayaExperienceFragment, actionOnlyNavDirections).toString(), null, 12);
                        NestedScrollView nestedScrollView = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                        Navigation.findNavController(nestedScrollView).navigate(actionOnlyNavDirections);
                        return Unit.f18162a;
                    case 1:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment2 = this.f3272b;
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragment_to_mayaKycAcceptedIdsFragment);
                        String string2 = mayaKycCompleteYourMayaExperienceFragment2.getString(R.string.maya_kyc_complete_your_maya_experience_first_step_available_ids);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment2, string2, T2.l(mayaKycCompleteYourMayaExperienceFragment2, actionOnlyNavDirections2).toString(), null, 12);
                        NestedScrollView nestedScrollView2 = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment2.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView2, "getRoot(...)");
                        Navigation.findNavController(nestedScrollView2).navigate(actionOnlyNavDirections2);
                        return Unit.f18162a;
                    case 2:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment3 = this.f3272b;
                        C0214w c0214w = mayaKycCompleteYourMayaExperienceFragment3.f12495W;
                        if (c0214w == null) {
                            kotlin.jvm.internal.j.n("mCompleteYourMayaExperienceFragmentPresenter");
                            throw null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("os_platform", "android");
                        ((S5.c) c0214w.f).g("KYC_WELCOME_BUTTON_TAPPED", W5.e.c, linkedHashMap);
                        NestedScrollView nestedScrollView3 = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment3.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView3, "getRoot(...)");
                        NavController navControllerFindNavController = Navigation.findNavController(nestedScrollView3);
                        ActionOnlyNavDirections actionOnlyNavDirections3 = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragment_to_mayaKycSubmitIdFragment);
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment3, ((N5.Y) mayaKycCompleteYourMayaExperienceFragment3.G1()).e.getText().toString(), T2.l(mayaKycCompleteYourMayaExperienceFragment3, actionOnlyNavDirections3).toString(), null, 12);
                        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycCompleteYourMayaExperienceFragment3.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).k2();
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections3);
                        return Unit.f18162a;
                    default:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment4 = this.f3272b;
                        String string3 = mayaKycCompleteYourMayaExperienceFragment4.getString(R.string.maya_kyc_complete_your_maya_experience_privacy_statement);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment4, string3, "https://www.paymaya.com/privacy/?in_app=true", null, 12);
                        InterfaceC0345d0 interfaceC0345d0 = mayaKycCompleteYourMayaExperienceFragment4.f12496X;
                        if (interfaceC0345d0 != null) {
                            MayaKycActivity mayaKycActivity2 = (MayaKycActivity) interfaceC0345d0;
                            mayaKycActivity2.n1().k0(mayaKycActivity2, "https://www.paymaya.com/privacy/?in_app=true");
                        }
                        return Unit.f18162a;
                }
            }
        });
        final int i4 = 1;
        C.r0(((Y) G1()).f4034d, new Function0(this) { // from class: M8.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycCompleteYourMayaExperienceFragment f3272b;

            {
                this.f3272b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment = this.f3272b;
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_complete_your_maya_experience_fragment_to_mayaKycExampleUpgradeBottomSheetDialogFragment);
                        String string = mayaKycCompleteYourMayaExperienceFragment.getString(R.string.maya_kyc_complete_your_maya_experience_get_identified_information_highlight);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment, string, T2.l(mayaKycCompleteYourMayaExperienceFragment, actionOnlyNavDirections).toString(), null, 12);
                        NestedScrollView nestedScrollView = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                        Navigation.findNavController(nestedScrollView).navigate(actionOnlyNavDirections);
                        return Unit.f18162a;
                    case 1:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment2 = this.f3272b;
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragment_to_mayaKycAcceptedIdsFragment);
                        String string2 = mayaKycCompleteYourMayaExperienceFragment2.getString(R.string.maya_kyc_complete_your_maya_experience_first_step_available_ids);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment2, string2, T2.l(mayaKycCompleteYourMayaExperienceFragment2, actionOnlyNavDirections2).toString(), null, 12);
                        NestedScrollView nestedScrollView2 = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment2.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView2, "getRoot(...)");
                        Navigation.findNavController(nestedScrollView2).navigate(actionOnlyNavDirections2);
                        return Unit.f18162a;
                    case 2:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment3 = this.f3272b;
                        C0214w c0214w = mayaKycCompleteYourMayaExperienceFragment3.f12495W;
                        if (c0214w == null) {
                            kotlin.jvm.internal.j.n("mCompleteYourMayaExperienceFragmentPresenter");
                            throw null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("os_platform", "android");
                        ((S5.c) c0214w.f).g("KYC_WELCOME_BUTTON_TAPPED", W5.e.c, linkedHashMap);
                        NestedScrollView nestedScrollView3 = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment3.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView3, "getRoot(...)");
                        NavController navControllerFindNavController = Navigation.findNavController(nestedScrollView3);
                        ActionOnlyNavDirections actionOnlyNavDirections3 = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragment_to_mayaKycSubmitIdFragment);
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment3, ((N5.Y) mayaKycCompleteYourMayaExperienceFragment3.G1()).e.getText().toString(), T2.l(mayaKycCompleteYourMayaExperienceFragment3, actionOnlyNavDirections3).toString(), null, 12);
                        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycCompleteYourMayaExperienceFragment3.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).k2();
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections3);
                        return Unit.f18162a;
                    default:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment4 = this.f3272b;
                        String string3 = mayaKycCompleteYourMayaExperienceFragment4.getString(R.string.maya_kyc_complete_your_maya_experience_privacy_statement);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment4, string3, "https://www.paymaya.com/privacy/?in_app=true", null, 12);
                        InterfaceC0345d0 interfaceC0345d0 = mayaKycCompleteYourMayaExperienceFragment4.f12496X;
                        if (interfaceC0345d0 != null) {
                            MayaKycActivity mayaKycActivity2 = (MayaKycActivity) interfaceC0345d0;
                            mayaKycActivity2.n1().k0(mayaKycActivity2, "https://www.paymaya.com/privacy/?in_app=true");
                        }
                        return Unit.f18162a;
                }
            }
        });
        final int i6 = 2;
        C.r0(((Y) G1()).e, new Function0(this) { // from class: M8.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycCompleteYourMayaExperienceFragment f3272b;

            {
                this.f3272b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment = this.f3272b;
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_complete_your_maya_experience_fragment_to_mayaKycExampleUpgradeBottomSheetDialogFragment);
                        String string = mayaKycCompleteYourMayaExperienceFragment.getString(R.string.maya_kyc_complete_your_maya_experience_get_identified_information_highlight);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment, string, T2.l(mayaKycCompleteYourMayaExperienceFragment, actionOnlyNavDirections).toString(), null, 12);
                        NestedScrollView nestedScrollView = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                        Navigation.findNavController(nestedScrollView).navigate(actionOnlyNavDirections);
                        return Unit.f18162a;
                    case 1:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment2 = this.f3272b;
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragment_to_mayaKycAcceptedIdsFragment);
                        String string2 = mayaKycCompleteYourMayaExperienceFragment2.getString(R.string.maya_kyc_complete_your_maya_experience_first_step_available_ids);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment2, string2, T2.l(mayaKycCompleteYourMayaExperienceFragment2, actionOnlyNavDirections2).toString(), null, 12);
                        NestedScrollView nestedScrollView2 = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment2.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView2, "getRoot(...)");
                        Navigation.findNavController(nestedScrollView2).navigate(actionOnlyNavDirections2);
                        return Unit.f18162a;
                    case 2:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment3 = this.f3272b;
                        C0214w c0214w = mayaKycCompleteYourMayaExperienceFragment3.f12495W;
                        if (c0214w == null) {
                            kotlin.jvm.internal.j.n("mCompleteYourMayaExperienceFragmentPresenter");
                            throw null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("os_platform", "android");
                        ((S5.c) c0214w.f).g("KYC_WELCOME_BUTTON_TAPPED", W5.e.c, linkedHashMap);
                        NestedScrollView nestedScrollView3 = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment3.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView3, "getRoot(...)");
                        NavController navControllerFindNavController = Navigation.findNavController(nestedScrollView3);
                        ActionOnlyNavDirections actionOnlyNavDirections3 = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragment_to_mayaKycSubmitIdFragment);
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment3, ((N5.Y) mayaKycCompleteYourMayaExperienceFragment3.G1()).e.getText().toString(), T2.l(mayaKycCompleteYourMayaExperienceFragment3, actionOnlyNavDirections3).toString(), null, 12);
                        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycCompleteYourMayaExperienceFragment3.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).k2();
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections3);
                        return Unit.f18162a;
                    default:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment4 = this.f3272b;
                        String string3 = mayaKycCompleteYourMayaExperienceFragment4.getString(R.string.maya_kyc_complete_your_maya_experience_privacy_statement);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment4, string3, "https://www.paymaya.com/privacy/?in_app=true", null, 12);
                        InterfaceC0345d0 interfaceC0345d0 = mayaKycCompleteYourMayaExperienceFragment4.f12496X;
                        if (interfaceC0345d0 != null) {
                            MayaKycActivity mayaKycActivity2 = (MayaKycActivity) interfaceC0345d0;
                            mayaKycActivity2.n1().k0(mayaKycActivity2, "https://www.paymaya.com/privacy/?in_app=true");
                        }
                        return Unit.f18162a;
                }
            }
        });
        final int i10 = 3;
        C.r0(((Y) G1()).f4033b, new Function0(this) { // from class: M8.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycCompleteYourMayaExperienceFragment f3272b;

            {
                this.f3272b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment = this.f3272b;
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_complete_your_maya_experience_fragment_to_mayaKycExampleUpgradeBottomSheetDialogFragment);
                        String string = mayaKycCompleteYourMayaExperienceFragment.getString(R.string.maya_kyc_complete_your_maya_experience_get_identified_information_highlight);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment, string, T2.l(mayaKycCompleteYourMayaExperienceFragment, actionOnlyNavDirections).toString(), null, 12);
                        NestedScrollView nestedScrollView = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                        Navigation.findNavController(nestedScrollView).navigate(actionOnlyNavDirections);
                        return Unit.f18162a;
                    case 1:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment2 = this.f3272b;
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragment_to_mayaKycAcceptedIdsFragment);
                        String string2 = mayaKycCompleteYourMayaExperienceFragment2.getString(R.string.maya_kyc_complete_your_maya_experience_first_step_available_ids);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment2, string2, T2.l(mayaKycCompleteYourMayaExperienceFragment2, actionOnlyNavDirections2).toString(), null, 12);
                        NestedScrollView nestedScrollView2 = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment2.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView2, "getRoot(...)");
                        Navigation.findNavController(nestedScrollView2).navigate(actionOnlyNavDirections2);
                        return Unit.f18162a;
                    case 2:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment3 = this.f3272b;
                        C0214w c0214w = mayaKycCompleteYourMayaExperienceFragment3.f12495W;
                        if (c0214w == null) {
                            kotlin.jvm.internal.j.n("mCompleteYourMayaExperienceFragmentPresenter");
                            throw null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("os_platform", "android");
                        ((S5.c) c0214w.f).g("KYC_WELCOME_BUTTON_TAPPED", W5.e.c, linkedHashMap);
                        NestedScrollView nestedScrollView3 = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment3.G1()).f4032a;
                        kotlin.jvm.internal.j.f(nestedScrollView3, "getRoot(...)");
                        NavController navControllerFindNavController = Navigation.findNavController(nestedScrollView3);
                        ActionOnlyNavDirections actionOnlyNavDirections3 = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragment_to_mayaKycSubmitIdFragment);
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment3, ((N5.Y) mayaKycCompleteYourMayaExperienceFragment3.G1()).e.getText().toString(), T2.l(mayaKycCompleteYourMayaExperienceFragment3, actionOnlyNavDirections3).toString(), null, 12);
                        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycCompleteYourMayaExperienceFragment3.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).k2();
                        E1.c.m(navControllerFindNavController, actionOnlyNavDirections3);
                        return Unit.f18162a;
                    default:
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment4 = this.f3272b;
                        String string3 = mayaKycCompleteYourMayaExperienceFragment4.getString(R.string.maya_kyc_complete_your_maya_experience_privacy_statement);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        T2.Q(mayaKycCompleteYourMayaExperienceFragment4, string3, "https://www.paymaya.com/privacy/?in_app=true", null, 12);
                        InterfaceC0345d0 interfaceC0345d0 = mayaKycCompleteYourMayaExperienceFragment4.f12496X;
                        if (interfaceC0345d0 != null) {
                            MayaKycActivity mayaKycActivity2 = (MayaKycActivity) interfaceC0345d0;
                            mayaKycActivity2.n1().k0(mayaKycActivity2, "https://www.paymaya.com/privacy/?in_app=true");
                        }
                        return Unit.f18162a;
                }
            }
        });
        C.r0(((Y) G1()).h, new l(9, this, bVar));
        C0214w c0214w = this.f12495W;
        if (c0214w != null) {
            c0214w.j();
        } else {
            j.n("mCompleteYourMayaExperienceFragmentPresenter");
            throw null;
        }
    }
}
