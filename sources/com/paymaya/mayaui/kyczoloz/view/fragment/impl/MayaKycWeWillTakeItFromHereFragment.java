package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ag.l;
import Bb.a;
import H8.b;
import I8.f;
import K8.S;
import M8.T2;
import M8.b3;
import M8.c3;
import M8.d3;
import N5.B0;
import S5.c;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycSubmit;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWeWillTakeItFromHereFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycWeWillTakeItFromHereFragment extends MayaKycBaseFragment<B0> implements S {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public a f12652W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public c3 f12653X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final d3 f12654Y;

    public MayaKycWeWillTakeItFromHereFragment() {
        super(b3.f3274a);
        this.f12654Y = new d3(true, 0);
    }

    public final void K1() {
        if (!t1().e().isKycCompletedCallbackEnabled() || this.f12653X == null || MayaKycActivity.f12445B == null) {
            return;
        }
        new Thread(new f(0)).start();
        Unit unit = Unit.f18162a;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SUBMITTED;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12652W = new a(preference, 5, false);
        this.f12653X = (c3) getActivity();
        a aVar2 = this.f12652W;
        if (aVar2 == null) {
            j.n("mWeWillTakeItFromHereFragmentPresenter");
            throw null;
        }
        aVar2.h(this);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12654Y);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f12652W;
        if (aVar == null) {
            j.n("mWeWillTakeItFromHereFragmentPresenter");
            throw null;
        }
        if (aVar.e.e().isPartnerOnboardingEnabled()) {
            com.paymaya.data.preference.a aVarT1 = ((MayaKycWeWillTakeItFromHereFragment) ((S) aVar.c.get())).t1();
            aVarT1.e0("");
            aVarT1.t0(false);
            aVarT1.f0("");
            aVarT1.g0("");
        }
        a aVar2 = this.f12652W;
        if (aVar2 == null) {
            j.n("mWeWillTakeItFromHereFragmentPresenter");
            throw null;
        }
        aVar2.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        String string = getString(R.string.maya_fragment_kyc_complete_personal_information_screen_label);
        j.f(string, "getString(...)");
        T2.I(this, string);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        KycCmsContentData data;
        KycSubmit submit;
        String info;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f10338R = true;
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.b2();
        C.r0(((B0) G1()).f3552b, new l(11, this, bVar));
        final int i = 0;
        C.r0(((B0) G1()).c, new Function0(this) { // from class: M8.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycWeWillTakeItFromHereFragment f3268b;

            {
                this.f3268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaKycWeWillTakeItFromHereFragment mayaKycWeWillTakeItFromHereFragment = this.f3268b;
                        mayaKycWeWillTakeItFromHereFragment.K1();
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_we_will_take_it_from_here_fragment_to_maya_kyc_account_under_review_fragment);
                        String string = mayaKycWeWillTakeItFromHereFragment.getString(R.string.maya_kyc_we_will_take_it_from_here_button_view_details);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycWeWillTakeItFromHereFragment, string, T2.l(mayaKycWeWillTakeItFromHereFragment, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((N5.B0) mayaKycWeWillTakeItFromHereFragment.G1()).f3551a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(Navigation.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    default:
                        MayaKycWeWillTakeItFromHereFragment mayaKycWeWillTakeItFromHereFragment2 = this.f3268b;
                        mayaKycWeWillTakeItFromHereFragment2.K1();
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_we_will_take_it_from_here_fragment_to_maya_kyc_account_under_review_fragment);
                        T2.Q(mayaKycWeWillTakeItFromHereFragment2, ((N5.B0) mayaKycWeWillTakeItFromHereFragment2.G1()).f.getText().toString(), T2.l(mayaKycWeWillTakeItFromHereFragment2, actionOnlyNavDirections2).toString(), null, 12);
                        ConstraintLayout constraintLayout2 = ((N5.B0) mayaKycWeWillTakeItFromHereFragment2.G1()).f3551a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        E1.c.m(Navigation.findNavController(constraintLayout2), actionOnlyNavDirections2);
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i4 = 1;
        C.r0(((B0) G1()).f3553d, new Function0(this) { // from class: M8.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycWeWillTakeItFromHereFragment f3268b;

            {
                this.f3268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaKycWeWillTakeItFromHereFragment mayaKycWeWillTakeItFromHereFragment = this.f3268b;
                        mayaKycWeWillTakeItFromHereFragment.K1();
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_we_will_take_it_from_here_fragment_to_maya_kyc_account_under_review_fragment);
                        String string = mayaKycWeWillTakeItFromHereFragment.getString(R.string.maya_kyc_we_will_take_it_from_here_button_view_details);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycWeWillTakeItFromHereFragment, string, T2.l(mayaKycWeWillTakeItFromHereFragment, actionOnlyNavDirections).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((N5.B0) mayaKycWeWillTakeItFromHereFragment.G1()).f3551a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(Navigation.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    default:
                        MayaKycWeWillTakeItFromHereFragment mayaKycWeWillTakeItFromHereFragment2 = this.f3268b;
                        mayaKycWeWillTakeItFromHereFragment2.K1();
                        ActionOnlyNavDirections actionOnlyNavDirections2 = new ActionOnlyNavDirections(R.id.action_maya_kyc_we_will_take_it_from_here_fragment_to_maya_kyc_account_under_review_fragment);
                        T2.Q(mayaKycWeWillTakeItFromHereFragment2, ((N5.B0) mayaKycWeWillTakeItFromHereFragment2.G1()).f.getText().toString(), T2.l(mayaKycWeWillTakeItFromHereFragment2, actionOnlyNavDirections2).toString(), null, 12);
                        ConstraintLayout constraintLayout2 = ((N5.B0) mayaKycWeWillTakeItFromHereFragment2.G1()).f3551a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        E1.c.m(Navigation.findNavController(constraintLayout2), actionOnlyNavDirections2);
                        break;
                }
                return Unit.f18162a;
            }
        });
        a aVar = this.f12652W;
        if (aVar == null) {
            j.n("mWeWillTakeItFromHereFragmentPresenter");
            throw null;
        }
        aVar.j();
        KycCmsContent kycCmsContent = mayaKycActivity.Z1().f;
        if (kycCmsContent == null || (data = kycCmsContent.getData()) == null || (submit = data.getSubmit()) == null) {
            return;
        }
        String header = submit.getHeader();
        if (header == null || header.length() == 0 || (info = submit.getInfo()) == null || info.length() == 0) {
            ((B0) ((MayaKycWeWillTakeItFromHereFragment) ((S) aVar.c.get())).G1()).f3553d.setVisibility(8);
            return;
        }
        MayaKycWeWillTakeItFromHereFragment mayaKycWeWillTakeItFromHereFragment = (MayaKycWeWillTakeItFromHereFragment) ((S) aVar.c.get());
        mayaKycWeWillTakeItFromHereFragment.getClass();
        ((B0) mayaKycWeWillTakeItFromHereFragment.G1()).f.setText(submit.getHeader());
        ((B0) mayaKycWeWillTakeItFromHereFragment.G1()).e.setText(submit.getInfo());
        TypedValue typedValue = new TypedValue();
        mayaKycWeWillTakeItFromHereFragment.requireContext().getTheme().resolveAttribute(R.attr.mayaColorAccent, typedValue, true);
        MultiColorTextView multiColorTextView = ((B0) mayaKycWeWillTakeItFromHereFragment.G1()).e;
        String info2 = submit.getInfo();
        if (info2 == null) {
            info2 = "";
        }
        String highlightedPhrase = submit.getHighlightedPhrase();
        multiColorTextView.a(typedValue.data, info2, highlightedPhrase != null ? highlightedPhrase : "");
    }
}
