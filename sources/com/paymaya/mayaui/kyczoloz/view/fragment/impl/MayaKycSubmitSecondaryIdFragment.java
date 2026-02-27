package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.P;
import H8.b;
import J8.c;
import K8.L;
import M8.C0332a;
import M8.C0430y2;
import M8.M1;
import M8.T2;
import N5.C0484v0;
import O5.a;
import Xh.i;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycSubmitSecondaryIdFragment extends MayaKycBaseFragment<C0484v0> implements L {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public P f12635W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public c f12636X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f12637Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final N f12638Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public MayaEKYCSelectedDocument f12639a0;

    public MayaKycSubmitSecondaryIdFragment() {
        super(C0430y2.f3392a);
        this.f12637Y = -1;
        this.f12638Z = new N(this, 29);
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        return K1().p();
    }

    public final P K1() {
        P p10 = this.f12635W;
        if (p10 != null) {
            return p10;
        }
        j.n("mPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SELECT_ID_SECONDARY;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = (a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        e0 resourceManager = (e0) aVar.f4685S.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(resourceManager, "resourceManager");
        this.f12635W = new P(preference, flagConfigurationService, resourceManager);
        K1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        K1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12636X = null;
        this.f12637Y = -1;
        this.f12638Z.remove();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T2.H(this, null, 3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (K1().p()) {
            KeyEventDispatcher.Component componentRequireActivity = requireActivity();
            j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
            mayaKycActivity.m2();
            mayaKycActivity.l2();
        }
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12638Z);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.t2();
        mayaKycActivity.t1();
        H8.a aVar = H8.a.c;
        mayaKycActivity.R1();
        mayaKycActivity.E1(66);
        mayaKycActivity.n2(aVar);
        mayaKycActivity.p2(new M8.L(this, 15));
        i.D(this, z.a(MayaKycChangeYourMindBottomSheetDialogFragment.class), new M1(1, K1(), P.class, "handleConfirmationResult", "handleConfirmationResult(Z)V", 0, 8));
        C.r0(((C0484v0) G1()).f4234b, new C0332a(this, 11));
        P pK1 = K1();
        pK1.j();
        if (this.f12637Y != -1) {
            ((C0484v0) ((MayaKycSubmitSecondaryIdFragment) ((L) pK1.c.get())).G1()).f4234b.setEnabled(true);
        }
    }
}
