package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.C0201i;
import E1.c;
import H8.b;
import K8.InterfaceC0280e;
import Kh.I;
import M8.A;
import M8.C;
import M8.C0376l;
import M8.C0419w;
import M8.C0431z;
import N5.V;
import W4.a;
import Xh.i;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.ViewKt;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcUploadDocumentsFragment;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import y5.q;
import yc.B;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycAmlcUploadDocumentsFragment extends MayaKycBaseFragment<V> implements InterfaceC0280e {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0201i f12478W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e0 f12479X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final NavArgsLazy f12480Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final N f12481Z;

    public MayaKycAmlcUploadDocumentsFragment() {
        super(C0431z.f3393a);
        this.f12480Y = new NavArgsLazy(z.a(A.class), new C0376l(this, 1));
        this.f12481Z = new N(this, 5);
    }

    public final C0201i K1() {
        C0201i c0201i = this.f12478W;
        if (c0201i != null) {
            return c0201i;
        }
        j.n("mAmlcUploadDocumentsFragmentPresenter");
        throw null;
    }

    public final void L1(String buttonText, String str) {
        j.g(buttonText, "buttonText");
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.AMLC_CHECKPOINT);
        c1219hD.n(18);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hD.j;
        map.put("button", buttonText);
        map.put("page_name", getString(R.string.maya_kyc_amlc_page_name_label));
        map.put("destination_page", str);
        map.put("kyc_status", t1().l());
        map.put("path", "TOFU 1.0");
        c1219hD.i();
        o1().c(getActivity(), c1219hD);
    }

    public final void M1(String str) {
        C c = new C();
        ConstraintLayout constraintLayout = ((V) G1()).f3946a;
        j.f(constraintLayout, "getRoot(...)");
        c.m(ViewKt.findNavController(constraintLayout), c);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.AMLC_CHECKPOINT;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        Lh.c cVarF = a.e().f();
        O5.a aVar = (O5.a) cVarF.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        ((I) cVarF.f2990b).getClass();
        this.f12478W = new C0201i();
        this.f12479X = (e0) aVar.f4685S.get();
        K1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        K1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12481Z.remove();
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).o2(R.drawable.maya_ic_navigation_back);
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.AMLC_CHECKPOINT);
        c1219hD.n(4);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_kyc_amlc_page_name_label);
        HashMap map = c1219hD.j;
        map.put("page_name", string);
        map.put("source_page", getString(R.string.maya_kyc_work_details_screen_label));
        map.put("kyc_status", t1().l());
        map.put("path", "TOFU 1.0");
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12481Z);
        Object objRequireActivity = requireActivity();
        j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        Object obj = (b) objRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) obj;
        mayaKycActivity.t2();
        mayaKycActivity.o2(R.drawable.maya_ic_navigation_back);
        e0 e0Var = this.f12479X;
        if (e0Var == null) {
            j.n("resourceManager");
            throw null;
        }
        mayaKycActivity.r2(ContextCompat.getColor(e0Var.f10905a, R.color.ghost_white));
        e0 e0Var2 = this.f12479X;
        if (e0Var2 == null) {
            j.n("resourceManager");
            throw null;
        }
        ((q) obj).N1(ContextCompat.getColor(e0Var2.f10905a, R.color.ghost_white));
        mayaKycActivity.p2(new B(this, 1));
        mayaKycActivity.t1();
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        K1().j();
        final int i = 0;
        Ke.b.b(((V) G1()).c, new Function0(this) { // from class: M8.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAmlcUploadDocumentsFragment f3389b;

            {
                this.f3389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) this.f3389b.K1().c.get());
                        String string = ((N5.V) mayaKycAmlcUploadDocumentsFragment.G1()).c.getText().toString();
                        String string2 = mayaKycAmlcUploadDocumentsFragment.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment.L1(string, string2);
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_amlc_upload_documents_fragment_to_maya_kyc_amlc_certificate_fragment);
                        ConstraintLayout constraintLayout = ((N5.V) mayaKycAmlcUploadDocumentsFragment.G1()).f3946a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 1:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment2 = this.f3389b;
                        C0201i c0201iK1 = mayaKycAmlcUploadDocumentsFragment2.K1();
                        String label = ((N5.V) mayaKycAmlcUploadDocumentsFragment2.G1()).f3947b.getText().toString();
                        kotlin.jvm.internal.j.g(label, "label");
                        ((MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) c0201iK1.c.get())).M1(label);
                        String string3 = ((N5.V) mayaKycAmlcUploadDocumentsFragment2.G1()).f3947b.getText().toString();
                        String string4 = mayaKycAmlcUploadDocumentsFragment2.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment2.L1(string3, string4);
                        break;
                    case 2:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment3 = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) this.f3389b.K1().c.get());
                        mayaKycAmlcUploadDocumentsFragment3.getClass();
                        B b8 = new B();
                        String string5 = ((N5.V) mayaKycAmlcUploadDocumentsFragment3.G1()).f3949g.getText().toString();
                        String string6 = mayaKycAmlcUploadDocumentsFragment3.getString(R.string.maya_kyc_amlc_page_name_label);
                        kotlin.jvm.internal.j.f(string6, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment3.L1(string5, string6);
                        ConstraintLayout constraintLayout2 = ((N5.V) mayaKycAmlcUploadDocumentsFragment3.G1()).f3946a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout2), b8);
                        break;
                    default:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment4 = this.f3389b;
                        C0201i c0201iK12 = mayaKycAmlcUploadDocumentsFragment4.K1();
                        String label2 = ((N5.V) mayaKycAmlcUploadDocumentsFragment4.G1()).f3948d.getDescriptionTextView().getText().toString();
                        kotlin.jvm.internal.j.g(label2, "label");
                        ((MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) c0201iK12.c.get())).M1(label2);
                        String string7 = ((N5.V) mayaKycAmlcUploadDocumentsFragment4.G1()).f3948d.getDescriptionTextView().getText().toString();
                        String string8 = mayaKycAmlcUploadDocumentsFragment4.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                        kotlin.jvm.internal.j.f(string8, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment4.L1(string7, string8);
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i4 = 1;
        Ke.b.b(((V) G1()).f3947b, new Function0(this) { // from class: M8.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAmlcUploadDocumentsFragment f3389b;

            {
                this.f3389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) this.f3389b.K1().c.get());
                        String string = ((N5.V) mayaKycAmlcUploadDocumentsFragment.G1()).c.getText().toString();
                        String string2 = mayaKycAmlcUploadDocumentsFragment.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment.L1(string, string2);
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_amlc_upload_documents_fragment_to_maya_kyc_amlc_certificate_fragment);
                        ConstraintLayout constraintLayout = ((N5.V) mayaKycAmlcUploadDocumentsFragment.G1()).f3946a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 1:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment2 = this.f3389b;
                        C0201i c0201iK1 = mayaKycAmlcUploadDocumentsFragment2.K1();
                        String label = ((N5.V) mayaKycAmlcUploadDocumentsFragment2.G1()).f3947b.getText().toString();
                        kotlin.jvm.internal.j.g(label, "label");
                        ((MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) c0201iK1.c.get())).M1(label);
                        String string3 = ((N5.V) mayaKycAmlcUploadDocumentsFragment2.G1()).f3947b.getText().toString();
                        String string4 = mayaKycAmlcUploadDocumentsFragment2.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment2.L1(string3, string4);
                        break;
                    case 2:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment3 = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) this.f3389b.K1().c.get());
                        mayaKycAmlcUploadDocumentsFragment3.getClass();
                        B b8 = new B();
                        String string5 = ((N5.V) mayaKycAmlcUploadDocumentsFragment3.G1()).f3949g.getText().toString();
                        String string6 = mayaKycAmlcUploadDocumentsFragment3.getString(R.string.maya_kyc_amlc_page_name_label);
                        kotlin.jvm.internal.j.f(string6, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment3.L1(string5, string6);
                        ConstraintLayout constraintLayout2 = ((N5.V) mayaKycAmlcUploadDocumentsFragment3.G1()).f3946a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout2), b8);
                        break;
                    default:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment4 = this.f3389b;
                        C0201i c0201iK12 = mayaKycAmlcUploadDocumentsFragment4.K1();
                        String label2 = ((N5.V) mayaKycAmlcUploadDocumentsFragment4.G1()).f3948d.getDescriptionTextView().getText().toString();
                        kotlin.jvm.internal.j.g(label2, "label");
                        ((MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) c0201iK12.c.get())).M1(label2);
                        String string7 = ((N5.V) mayaKycAmlcUploadDocumentsFragment4.G1()).f3948d.getDescriptionTextView().getText().toString();
                        String string8 = mayaKycAmlcUploadDocumentsFragment4.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                        kotlin.jvm.internal.j.f(string8, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment4.L1(string7, string8);
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i6 = 2;
        Ke.b.b(((V) G1()).f3949g, new Function0(this) { // from class: M8.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAmlcUploadDocumentsFragment f3389b;

            {
                this.f3389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) this.f3389b.K1().c.get());
                        String string = ((N5.V) mayaKycAmlcUploadDocumentsFragment.G1()).c.getText().toString();
                        String string2 = mayaKycAmlcUploadDocumentsFragment.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment.L1(string, string2);
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_amlc_upload_documents_fragment_to_maya_kyc_amlc_certificate_fragment);
                        ConstraintLayout constraintLayout = ((N5.V) mayaKycAmlcUploadDocumentsFragment.G1()).f3946a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 1:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment2 = this.f3389b;
                        C0201i c0201iK1 = mayaKycAmlcUploadDocumentsFragment2.K1();
                        String label = ((N5.V) mayaKycAmlcUploadDocumentsFragment2.G1()).f3947b.getText().toString();
                        kotlin.jvm.internal.j.g(label, "label");
                        ((MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) c0201iK1.c.get())).M1(label);
                        String string3 = ((N5.V) mayaKycAmlcUploadDocumentsFragment2.G1()).f3947b.getText().toString();
                        String string4 = mayaKycAmlcUploadDocumentsFragment2.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment2.L1(string3, string4);
                        break;
                    case 2:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment3 = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) this.f3389b.K1().c.get());
                        mayaKycAmlcUploadDocumentsFragment3.getClass();
                        B b8 = new B();
                        String string5 = ((N5.V) mayaKycAmlcUploadDocumentsFragment3.G1()).f3949g.getText().toString();
                        String string6 = mayaKycAmlcUploadDocumentsFragment3.getString(R.string.maya_kyc_amlc_page_name_label);
                        kotlin.jvm.internal.j.f(string6, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment3.L1(string5, string6);
                        ConstraintLayout constraintLayout2 = ((N5.V) mayaKycAmlcUploadDocumentsFragment3.G1()).f3946a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout2), b8);
                        break;
                    default:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment4 = this.f3389b;
                        C0201i c0201iK12 = mayaKycAmlcUploadDocumentsFragment4.K1();
                        String label2 = ((N5.V) mayaKycAmlcUploadDocumentsFragment4.G1()).f3948d.getDescriptionTextView().getText().toString();
                        kotlin.jvm.internal.j.g(label2, "label");
                        ((MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) c0201iK12.c.get())).M1(label2);
                        String string7 = ((N5.V) mayaKycAmlcUploadDocumentsFragment4.G1()).f3948d.getDescriptionTextView().getText().toString();
                        String string8 = mayaKycAmlcUploadDocumentsFragment4.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                        kotlin.jvm.internal.j.f(string8, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment4.L1(string7, string8);
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i10 = 3;
        Ke.b.b(((V) G1()).f3948d, new Function0(this) { // from class: M8.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAmlcUploadDocumentsFragment f3389b;

            {
                this.f3389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) this.f3389b.K1().c.get());
                        String string = ((N5.V) mayaKycAmlcUploadDocumentsFragment.G1()).c.getText().toString();
                        String string2 = mayaKycAmlcUploadDocumentsFragment.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment.L1(string, string2);
                        ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_amlc_upload_documents_fragment_to_maya_kyc_amlc_certificate_fragment);
                        ConstraintLayout constraintLayout = ((N5.V) mayaKycAmlcUploadDocumentsFragment.G1()).f3946a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout), actionOnlyNavDirections);
                        break;
                    case 1:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment2 = this.f3389b;
                        C0201i c0201iK1 = mayaKycAmlcUploadDocumentsFragment2.K1();
                        String label = ((N5.V) mayaKycAmlcUploadDocumentsFragment2.G1()).f3947b.getText().toString();
                        kotlin.jvm.internal.j.g(label, "label");
                        ((MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) c0201iK1.c.get())).M1(label);
                        String string3 = ((N5.V) mayaKycAmlcUploadDocumentsFragment2.G1()).f3947b.getText().toString();
                        String string4 = mayaKycAmlcUploadDocumentsFragment2.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment2.L1(string3, string4);
                        break;
                    case 2:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment3 = (MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) this.f3389b.K1().c.get());
                        mayaKycAmlcUploadDocumentsFragment3.getClass();
                        B b8 = new B();
                        String string5 = ((N5.V) mayaKycAmlcUploadDocumentsFragment3.G1()).f3949g.getText().toString();
                        String string6 = mayaKycAmlcUploadDocumentsFragment3.getString(R.string.maya_kyc_amlc_page_name_label);
                        kotlin.jvm.internal.j.f(string6, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment3.L1(string5, string6);
                        ConstraintLayout constraintLayout2 = ((N5.V) mayaKycAmlcUploadDocumentsFragment3.G1()).f3946a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        E1.c.m(ViewKt.findNavController(constraintLayout2), b8);
                        break;
                    default:
                        MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment4 = this.f3389b;
                        C0201i c0201iK12 = mayaKycAmlcUploadDocumentsFragment4.K1();
                        String label2 = ((N5.V) mayaKycAmlcUploadDocumentsFragment4.G1()).f3948d.getDescriptionTextView().getText().toString();
                        kotlin.jvm.internal.j.g(label2, "label");
                        ((MayaKycAmlcUploadDocumentsFragment) ((InterfaceC0280e) c0201iK12.c.get())).M1(label2);
                        String string7 = ((N5.V) mayaKycAmlcUploadDocumentsFragment4.G1()).f3948d.getDescriptionTextView().getText().toString();
                        String string8 = mayaKycAmlcUploadDocumentsFragment4.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                        kotlin.jvm.internal.j.f(string8, "getString(...)");
                        mayaKycAmlcUploadDocumentsFragment4.L1(string7, string8);
                        break;
                }
                return Unit.f18162a;
            }
        });
        i.D(this, z.a(MayaKycRestartBottomSheetDialogFragment.class), new C0419w(1, K1(), C0201i.class, "handleConfirmationResult", "handleConfirmationResult(Z)V", 0, 1));
    }
}
