package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import B8.f;
import D8.S;
import H8.b;
import K8.N;
import M8.C0332a;
import M8.D2;
import M8.I2;
import M8.L;
import M8.M1;
import M8.T2;
import N5.C0488x0;
import O5.a;
import S5.c;
import Xh.i;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycTakeVideoSelfieFragment extends MayaKycBaseFragment<C0488x0> implements N {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public S f12642W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final D2 f12643X;

    public MayaKycTakeVideoSelfieFragment() {
        super(I2.f3178a);
        this.f12643X = new D2(this, 1);
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        return ((S) K1()).f1021d.e().isKycUxTofuRedesignEnabled();
    }

    public final f K1() {
        S s9 = this.f12642W;
        if (s9 != null) {
            return s9;
        }
        j.n("mTakeVideoSelfieFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.LIVENESS_TIPS;
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
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f12642W = new S(preference, flagConfigurationService);
        ((AbstractC2509a) K1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) K1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12643X.remove();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T2.H(this, null, 3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12643X);
        i.D(this, z.a(MayaKycChangeYourMindBottomSheetDialogFragment.class), new M1(1, K1(), f.class, "handleConfirmationResult", "handleConfirmationResult(Z)V", 0, 10));
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.t2();
        H8.a aVar = H8.a.c;
        mayaKycActivity.R1();
        mayaKycActivity.E1(66);
        mayaKycActivity.n2(aVar);
        mayaKycActivity.t1();
        mayaKycActivity.p2(new L(this, 17));
        ((S) K1()).j();
        C.r0(((C0488x0) G1()).f4262b, new C0332a(this, 13));
    }
}
