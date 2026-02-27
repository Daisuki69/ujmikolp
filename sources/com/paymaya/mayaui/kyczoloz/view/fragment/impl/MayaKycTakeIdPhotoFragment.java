package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import B8.e;
import D8.Q;
import H8.b;
import K8.M;
import M8.C0332a;
import M8.C0344d;
import M8.C0348e;
import M8.C2;
import M8.D2;
import M8.E2;
import M8.T2;
import N5.C0486w0;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import cj.L;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycTakeIdPhotoFragment extends MayaKycBaseFragment<C0486w0> implements M {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Q f12640W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final D2 f12641X;

    public MayaKycTakeIdPhotoFragment() {
        super(C2.f3146a);
        this.f12641X = new D2(this, 0);
    }

    public final e K1() {
        Q q9 = this.f12640W;
        if (q9 != null) {
            return q9;
        }
        j.n("mTakeIdPhotoFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.ID_TIPS;
    }

    @Override // L8.e
    public final void h1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.f12446n = new C0344d(13, bVar);
        mayaKycActivity.f12447o = new C0348e(13, bVar);
        ConstraintLayout constraintLayout = ((C0486w0) G1()).f4252a;
        j.f(constraintLayout, "getRoot(...)");
        Navigation.findNavController(constraintLayout).navigate(new E2(mayaKycActivity.s().toString()));
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
        j.g(preference, "preference");
        this.f12640W = new Q(preference);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12641X);
        ((AbstractC2509a) K1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) K1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Q q9 = (Q) K1();
        if (q9.f1020d.e().isPartnerOnboardingEnabled()) {
            String strP = q9.f1020d.p();
            j.f(strP, "getMayaOnboardingPartner(...)");
            if (strP.length() > 0) {
                MayaKycTakeIdPhotoFragment mayaKycTakeIdPhotoFragment = (MayaKycTakeIdPhotoFragment) ((M) q9.c.get());
                mayaKycTakeIdPhotoFragment.getClass();
                T2.H(mayaKycTakeIdPhotoFragment, L.c(new Pair(EnumC1212a.ONBOARDING_KYC_LEVEL, mayaKycTakeIdPhotoFragment.t1().k().toString())), 2);
                return;
            }
        }
        MayaKycTakeIdPhotoFragment mayaKycTakeIdPhotoFragment2 = (MayaKycTakeIdPhotoFragment) ((M) q9.c.get());
        mayaKycTakeIdPhotoFragment2.getClass();
        T2.H(mayaKycTakeIdPhotoFragment2, null, 3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.t2();
        H8.a aVar = H8.a.c;
        mayaKycActivity.R1();
        mayaKycActivity.E1(66);
        mayaKycActivity.n2(aVar);
        mayaKycActivity.t1();
        mayaKycActivity.p2(new M8.L(this, 16));
        C.r0(((C0486w0) G1()).f4253b, new C0332a(this, 12));
        ((Q) K1()).j();
    }
}
