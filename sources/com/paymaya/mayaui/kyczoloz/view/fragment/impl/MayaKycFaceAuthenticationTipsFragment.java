package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.A;
import E1.c;
import H8.b;
import K8.InterfaceC0293s;
import M8.C0419w;
import M8.L;
import M8.T2;
import M8.W0;
import M8.X0;
import N5.C0451f0;
import O5.a;
import Xh.i;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.ViewKt;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFaceAuthenticationTipsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycFaceAuthenticationTipsFragment extends MayaKycBaseFragment<C0451f0> implements InterfaceC0293s {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public A f12537W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e0 f12538X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final N f12539Y;

    public MayaKycFaceAuthenticationTipsFragment() {
        super(W0.f3241a);
        this.f12539Y = new N(this, 14);
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).e2();
    }

    public final A K1() {
        A a8 = this.f12537W;
        if (a8 != null) {
            return a8;
        }
        j.n("mFaceAuthenticationTipsFragmentPresenter");
        throw null;
    }

    public final void L1() {
        X0 x02 = new X0(T2.j(this));
        T2.Q(this, ((TextView) ((C0451f0) G1()).c.f4088d).getText().toString(), T2.l(this, x02).toString(), null, 12);
        ConstraintLayout constraintLayout = ((C0451f0) G1()).f4089a;
        j.f(constraintLayout, "getRoot(...)");
        c.m(ViewKt.findNavController(constraintLayout), x02);
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
        this.f10336P = (S5.c) aVar.f4724k.get();
        e0 resourceManager = (e0) aVar.f4685S.get();
        j.g(resourceManager, "resourceManager");
        this.f12537W = new A(resourceManager);
        this.f12538X = (e0) aVar.f4685S.get();
        K1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        K1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12539Y.remove();
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
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12539Y);
        Object objRequireActivity = requireActivity();
        j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        Object obj = (b) objRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) obj;
        mayaKycActivity.t2();
        e0 e0Var = this.f12538X;
        if (e0Var == null) {
            j.n("resourceManager");
            throw null;
        }
        mayaKycActivity.r2(ContextCompat.getColor(e0Var.f10905a, R.color.ghost_white));
        e0 e0Var2 = this.f12538X;
        if (e0Var2 == null) {
            j.n("resourceManager");
            throw null;
        }
        ((q) obj).N1(ContextCompat.getColor(e0Var2.f10905a, R.color.ghost_white));
        mayaKycActivity.p2(new L(this, 5));
        mayaKycActivity.t1();
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        final int i = 0;
        Ke.b.b((Button) ((C0451f0) G1()).c.f4087b, new Function0(this) { // from class: M8.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycFaceAuthenticationTipsFragment f3236b;

            {
                this.f3236b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaKycFaceAuthenticationTipsFragment mayaKycFaceAuthenticationTipsFragment = (MayaKycFaceAuthenticationTipsFragment) ((InterfaceC0293s) this.f3236b.K1().c.get());
                        mayaKycFaceAuthenticationTipsFragment.getClass();
                        Y0 y0 = new Y0();
                        T2.Q(mayaKycFaceAuthenticationTipsFragment, ((Button) ((C0451f0) mayaKycFaceAuthenticationTipsFragment.G1()).c.f4087b).getText().toString(), T2.l(mayaKycFaceAuthenticationTipsFragment, y0).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((C0451f0) mayaKycFaceAuthenticationTipsFragment.G1()).f4089a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), y0);
                        break;
                    default:
                        ((MayaKycFaceAuthenticationTipsFragment) ((InterfaceC0293s) this.f3236b.K1().c.get())).L1();
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i4 = 1;
        Ke.b.b((TextView) ((C0451f0) G1()).c.f4088d, new Function0(this) { // from class: M8.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycFaceAuthenticationTipsFragment f3236b;

            {
                this.f3236b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaKycFaceAuthenticationTipsFragment mayaKycFaceAuthenticationTipsFragment = (MayaKycFaceAuthenticationTipsFragment) ((InterfaceC0293s) this.f3236b.K1().c.get());
                        mayaKycFaceAuthenticationTipsFragment.getClass();
                        Y0 y0 = new Y0();
                        T2.Q(mayaKycFaceAuthenticationTipsFragment, ((Button) ((C0451f0) mayaKycFaceAuthenticationTipsFragment.G1()).c.f4087b).getText().toString(), T2.l(mayaKycFaceAuthenticationTipsFragment, y0).toString(), null, 12);
                        ConstraintLayout constraintLayout = ((C0451f0) mayaKycFaceAuthenticationTipsFragment.G1()).f4089a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), y0);
                        break;
                    default:
                        ((MayaKycFaceAuthenticationTipsFragment) ((InterfaceC0293s) this.f3236b.K1().c.get())).L1();
                        break;
                }
                return Unit.f18162a;
            }
        });
        i.D(this, z.a(MayaKycConfirmExitBottomSheetDialogFragment.class), new C0419w(1, K1(), A.class, "handleConfirmationResult", "handleConfirmationResult(Z)V", 0, 24));
        K1().j();
    }
}
