package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ag.l;
import D.N;
import D8.C0196d;
import H8.b;
import K8.InterfaceC0277b;
import Lh.c;
import M8.C0344d;
import M8.C0348e;
import M8.C0352f;
import M8.ViewOnClickListenerC0336b;
import N5.S;
import W4.a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigation;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAccountUnderReviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycAccountUnderReviewFragment extends MayaBaseFragment implements InterfaceC0277b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0196d f12464U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public S f12465V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final N f12466W = new N(this, 2);

    @Override // K8.InterfaceC0277b
    public final void C(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3903q.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void C0(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3892F.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void F() {
        String string = getString(R.string.maya_kyc_label_validation_code_resent);
        j.f(string, "getString(...)");
        G1(string);
    }

    @Override // K8.InterfaceC0277b
    public final void G(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3910x.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void G0(int i) {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.f12446n = new C0344d(0, bVar);
        mayaKycActivity.f12447o = new C0348e(0, bVar);
        S s9 = this.f12465V;
        j.d(s9);
        FrameLayout frameLayout = s9.f3894a;
        j.f(frameLayout, "getRoot(...)");
        Navigation.findNavController(frameLayout).navigate(new C0352f(mayaKycActivity.s().toString(), i));
    }

    public final void G1(String str) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        S s9 = this.f12465V;
        j.d(s9);
        FrameLayout frameLayout = s9.f3894a;
        j.f(frameLayout, "getRoot(...)");
        b0.e(fragmentActivityRequireActivity, frameLayout, str, 0, R.drawable.maya_bg_snackbar_with_border_success, R.style.JekoBoldSmallText_Accent, 1, 0, 600);
    }

    @Override // K8.InterfaceC0277b
    public final void H0(String birthPlace) {
        j.g(birthPlace, "birthPlace");
        S s9 = this.f12465V;
        j.d(s9);
        TextView textViewBirthplace = s9.f3904r;
        j.f(textViewBirthplace, "textViewBirthplace");
        textViewBirthplace.setText(birthPlace);
    }

    @Override // K8.InterfaceC0277b
    public final void I(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3905s.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void L(KycCmsContent kycCmsContent) {
        j.g(kycCmsContent, "kycCmsContent");
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).Z1().f = kycCmsContent;
    }

    @Override // K8.InterfaceC0277b
    public final void N0(String address) {
        j.g(address, "address");
        S s9 = this.f12465V;
        j.d(s9);
        TextView textViewPresentAddress = s9.f3891E;
        j.f(textViewPresentAddress, "textViewPresentAddress");
        textViewPresentAddress.setText(address);
    }

    @Override // K8.InterfaceC0277b
    public final void P(Bitmap bitmap) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3898k.setImageBitmap(bitmap);
    }

    @Override // K8.InterfaceC0277b
    public final void P0(Bitmap bitmap) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.e.setImageBitmap(bitmap);
    }

    @Override // K8.InterfaceC0277b
    public final void R() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).b2();
        S s9 = this.f12465V;
        j.d(s9);
        ConstraintLayout constraintLayout = s9.m.f3627b;
        j.f(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(0);
        S s10 = this.f12465V;
        j.d(s10);
        s10.f3901o.setVisibility(8);
    }

    @Override // K8.InterfaceC0277b
    public final void T0(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3911y.setText(str);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.UNDER_REVIEW;
    }

    @Override // K8.InterfaceC0277b
    public final void U0(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3893G.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void V(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3887A.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void X() {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3907u.setVisibility(8);
        S s10 = this.f12465V;
        j.d(s10);
        s10.f3908v.setVisibility(8);
        S s11 = this.f12465V;
        j.d(s11);
        s11.i.setVisibility(8);
    }

    @Override // K8.InterfaceC0277b
    public final void X0() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).t2();
        S s9 = this.f12465V;
        j.d(s9);
        ((Toolbar) s9.f3900n.e).setVisibility(8);
        S s10 = this.f12465V;
        j.d(s10);
        ConstraintLayout constraintLayout = s10.m.f3627b;
        j.f(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(8);
        S s11 = this.f12465V;
        j.d(s11);
        s11.f3901o.setVisibility(0);
    }

    @Override // K8.InterfaceC0277b
    public final void Y(Bitmap bitmap) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f.setImageBitmap(bitmap);
    }

    @Override // K8.InterfaceC0277b
    public final void Z(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        C.r0(s9.f3896d, new l(7, this, str));
    }

    @Override // K8.InterfaceC0277b
    public final void a0(String fullName) {
        j.g(fullName, "fullName");
        S s9 = this.f12465V;
        j.d(s9);
        TextView textViewFullName = s9.f3909w;
        j.f(textViewFullName, "textViewFullName");
        textViewFullName.setText(fullName);
    }

    @Override // K8.InterfaceC0277b
    public final void b0(int i) {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.f12446n = new C0344d(1, bVar);
        mayaKycActivity.f12447o = new C0348e(1, bVar);
        S s9 = this.f12465V;
        j.d(s9);
        FrameLayout frameLayout = s9.f3894a;
        j.f(frameLayout, "getRoot(...)");
        Navigation.findNavController(frameLayout).navigate(new C0352f(mayaKycActivity.s().toString(), i));
    }

    @Override // K8.InterfaceC0277b
    public final void b1(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3889C.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void c0(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3907u.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final KycCmsContent getCmsContent() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).Z1().f;
    }

    @Override // K8.InterfaceC0277b
    public final void h0(String str) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3912z.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void i1() {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3888B.setVisibility(8);
        S s10 = this.f12465V;
        j.d(s10);
        s10.f3887A.setVisibility(8);
        S s11 = this.f12465V;
        j.d(s11);
        s11.f3897g.setVisibility(8);
    }

    @Override // L8.d
    public final void j1() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12466W);
        c cVarF = a.e().f();
        O5.a aVar = (O5.a) cVarF.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        C0196d c0196dJ = cVarF.j();
        this.f12464U = c0196dJ;
        c0196dJ.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        S sA = S.a(inflater, viewGroup);
        this.f12465V = sA;
        FrameLayout frameLayout = sA.f3894a;
        j.f(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0196d c0196d = this.f12464U;
        if (c0196d == null) {
            j.n("mAccountUnderReviewPresenter");
            throw null;
        }
        c0196d.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12465V = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0196d c0196d = this.f12464U;
        if (c0196d == null) {
            j.n("mAccountUnderReviewPresenter");
            throw null;
        }
        c0196d.j();
        c0196d.p();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        ViewOnClickListenerC0336b viewOnClickListenerC0336b = new ViewOnClickListenerC0336b(0, bVar);
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.p2(viewOnClickListenerC0336b);
        mayaKycActivity.r1();
        mayaKycActivity.s1();
        S s9 = this.f12465V;
        j.d(s9);
        final int i = 0;
        C.r0(s9.f3895b.c, new Function0(this) { // from class: M8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAccountUnderReviewFragment f3276b;

            {
                this.f3276b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaKycAccountUnderReviewFragment mayaKycAccountUnderReviewFragment = this.f3276b;
                        Object systemService = mayaKycAccountUnderReviewFragment.requireActivity().getSystemService("clipboard");
                        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        String string = mayaKycAccountUnderReviewFragment.getString(R.string.maya_kyc_label_validation_code);
                        N5.S s10 = mayaKycAccountUnderReviewFragment.f12465V;
                        kotlin.jvm.internal.j.d(s10);
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(string, s10.f3892F.getText()));
                        String string2 = mayaKycAccountUnderReviewFragment.getString(R.string.maya_kyc_label_validation_code_copied);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        mayaKycAccountUnderReviewFragment.G1(string2);
                        return Unit.f18162a;
                    default:
                        C0196d c0196d = this.f3276b.f12464U;
                        if (c0196d != null) {
                            c0196d.r();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAccountUnderReviewPresenter");
                        throw null;
                }
            }
        });
        S s10 = this.f12465V;
        j.d(s10);
        final int i4 = 1;
        C.r0(s10.c, new Function0(this) { // from class: M8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAccountUnderReviewFragment f3276b;

            {
                this.f3276b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaKycAccountUnderReviewFragment mayaKycAccountUnderReviewFragment = this.f3276b;
                        Object systemService = mayaKycAccountUnderReviewFragment.requireActivity().getSystemService("clipboard");
                        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        String string = mayaKycAccountUnderReviewFragment.getString(R.string.maya_kyc_label_validation_code);
                        N5.S s102 = mayaKycAccountUnderReviewFragment.f12465V;
                        kotlin.jvm.internal.j.d(s102);
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(string, s102.f3892F.getText()));
                        String string2 = mayaKycAccountUnderReviewFragment.getString(R.string.maya_kyc_label_validation_code_copied);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        mayaKycAccountUnderReviewFragment.G1(string2);
                        return Unit.f18162a;
                    default:
                        C0196d c0196d = this.f3276b.f12464U;
                        if (c0196d != null) {
                            c0196d.r();
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mAccountUnderReviewPresenter");
                        throw null;
                }
            }
        });
    }

    @Override // L8.d
    public final void q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).q();
    }

    @Override // K8.InterfaceC0277b
    public final void q0(Bitmap bitmap) {
        S s9 = this.f12465V;
        j.d(s9);
        s9.j.setImageBitmap(bitmap);
    }

    @Override // K8.InterfaceC0277b
    public final boolean s0() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).Z1().f != null;
    }

    @Override // K8.InterfaceC0277b
    public final void v0(String address) {
        j.g(address, "address");
        S s9 = this.f12465V;
        j.d(s9);
        TextView textViewPermanentAddress = s9.f3890D;
        j.f(textViewPermanentAddress, "textViewPermanentAddress");
        textViewPermanentAddress.setText(address);
    }

    @Override // K8.InterfaceC0277b
    public final void w0() {
        S s9 = this.f12465V;
        j.d(s9);
        s9.f3906t.setVisibility(8);
        S s10 = this.f12465V;
        j.d(s10);
        s10.f3905s.setVisibility(8);
        S s11 = this.f12465V;
        j.d(s11);
        s11.h.setVisibility(8);
    }

    @Override // K8.InterfaceC0277b
    public final void x0() {
        S s9 = this.f12465V;
        j.d(s9);
        ConstraintLayout linearLayoutAdditionalDocuments = s9.f3899l;
        j.f(linearLayoutAdditionalDocuments, "linearLayoutAdditionalDocuments");
        linearLayoutAdditionalDocuments.setVisibility(8);
        S s10 = this.f12465V;
        j.d(s10);
        TextView textViewAdditionalDocuments = s10.f3902p;
        j.f(textViewAdditionalDocuments, "textViewAdditionalDocuments");
        textViewAdditionalDocuments.setVisibility(8);
    }
}
