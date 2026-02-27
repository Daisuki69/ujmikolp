package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.G;
import G7.t;
import J5.a;
import J5.c;
import K8.w;
import Lh.d;
import Lh.h;
import M8.C0332a;
import M8.C0344d;
import M8.C0348e;
import M8.C0401r1;
import M8.C0409t1;
import M8.ViewOnClickListenerC0336b;
import N5.C0459i0;
import Th.e;
import a.AbstractC0617a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ViewKt;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.D;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.api.KycTencentApi;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.tencent.view.fragment.impl.MayaTencentBaseFragment;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycLivenessCaptureFragment extends MayaTencentBaseFragment<C0459i0> implements w {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f12558d0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public G f12559X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final a f12560Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f12561Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ActivityResultLauncher f12562a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final N f12563b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f12564c0;

    static {
        r rVar = new r(MayaKycLivenessCaptureFragment.class, "args", "getArgs()Lcom/paymaya/mayaui/kyczoloz/utils/extension/DynamicArgs;", 0);
        z.f18196a.getClass();
        f12558d0 = new KProperty[]{rVar};
    }

    public MayaKycLivenessCaptureFragment() {
        super(C0401r1.f3361a);
        this.f12560Y = new a(25);
        this.f12563b0 = new N(this, 16);
    }

    public final G L1() {
        G g8 = this.f12559X;
        if (g8 != null) {
            return g8;
        }
        j.n("mLivenessCapturePresenter");
        throw null;
    }

    public final MayaEKYCSelectedDocument M1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (MayaEKYCSelectedDocument) AbstractC0617a.D(arguments, "selectedDocument", MayaEKYCSelectedDocument.class);
        }
        return null;
    }

    public final void N1() {
        G gL1 = L1();
        gL1.e(new d(new d(new h(((KycTencentApi) gL1.e.f11371b).journeyInitiateV2().h(e.c), b.a(), 0), new c(gL1, 14), 2), new V2.c(gL1, 13), 0).e());
    }

    public final void O1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity)).g2();
        ConstraintLayout constraintLayout = ((C0459i0) G1()).f4117a;
        j.f(constraintLayout, "getRoot(...)");
        NavController navControllerFindNavController = Navigation.findNavController(constraintLayout);
        Bundle bundle = ((F8.a) this.f12560Y.getValue(this, f12558d0[0])).f1551a;
        navControllerFindNavController.popBackStack(bundle != null ? bundle.getBoolean("isOnIdLessFlow") : false ? R.id.maya_kyc_face_authentication_tips_fragment : R.id.maya_kyc_take_video_selfie_fragment, false);
    }

    public final void P1() {
        C.r0(((C0459i0) G1()).c.c, new C0332a(this, 6));
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity);
        mayaKycActivity.v2(R.string.maya_kyc_zoloz_toolbar_text);
        mayaKycActivity.s2(R.color.maya_shades_of_grey_11, R.color.maya_primary_white);
        mayaKycActivity.q2();
        mayaKycActivity.o2(R.drawable.maya_ic_navigation_white);
        ((C0459i0) G1()).c.f3538b.setVisibility(0);
        ((C0459i0) G1()).f4118b.f4041b.setVisibility(8);
    }

    public final void Q1() {
        String strD = D.d(40200);
        String version = HuiYanOsApi.getVersion();
        j.f(version, "getVersion(...)");
        J1(strD, version, false);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        H8.b bVar = (H8.b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.f12446n = new C0344d(11, bVar);
        mayaKycActivity.f12447o = new C0348e(8, bVar);
        ConstraintLayout constraintLayout = ((C0459i0) G1()).f4117a;
        j.f(constraintLayout, "getRoot(...)");
        E1.c.m(ViewKt.findNavController(constraintLayout), new C0409t1(2131231472, mayaKycActivity.s().toString(), R.string.maya_label_that_didnt_load_right, R.string.maya_label_connection_issue_split, R.string.maya_label_got_it, 40200));
    }

    public final void R() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity);
        mayaKycActivity.m2();
        mayaKycActivity.l2();
        mayaKycActivity.k2();
        mayaKycActivity.t1();
        mayaKycActivity.b2();
        ((C0459i0) G1()).c.f3538b.setVisibility(8);
        ((C0459i0) G1()).f4118b.f4041b.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R1(int r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment.R1(int):void");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.LIVENESS;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        this.f12562a0 = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new t(this, 24));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        M m = new M((KycTencentApi) aVar.f4713e1.get());
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12559X = new G(m, preference);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12563b0);
        L1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        L1().i();
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment.onResume():void");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity);
        mayaKycActivity.m2();
        mayaKycActivity.l2();
        mayaKycActivity.k2();
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        H8.b bVar = (H8.b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.r1();
        mayaKycActivity.s1();
        mayaKycActivity.p2(new ViewOnClickListenerC0336b(4, bVar));
        L1().j();
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.d
    public final void q() {
        this.f12561Z = true;
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity)).q();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.EKYC_V6;
    }
}
