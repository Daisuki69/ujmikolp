package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.I;
import G7.t;
import H8.b;
import K8.y;
import M8.C0376l;
import M8.C0417v1;
import M8.C0421w1;
import M8.C0425x1;
import M8.T2;
import M8.ViewOnClickListenerC0336b;
import N5.C0461j0;
import O5.a;
import S5.c;
import Th.e;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavArgsLazy;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.L;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.AdditionalDocType;
import com.paymaya.mayaui.kyczoloz.utils.KycMinorDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycMinorTakeAPhotoFragment extends MayaKycBaseFragment<C0461j0> implements y {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public I f12567W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ActivityResultLauncher f12568X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final N f12569Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final NavArgsLazy f12570Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InterfaceC1033d f12571a0;

    public MayaKycMinorTakeAPhotoFragment() {
        super(C0421w1.f3382a);
        this.f12569Y = new N(this, 18);
        this.f12570Z = new NavArgsLazy(z.a(C0425x1.class), new C0376l(this, 8));
        this.f12571a0 = C1034e.b(new C0417v1(this, 2));
    }

    public final KycMinorDocument K1() {
        KycMinorDocument kycMinorDocumentA = ((C0425x1) this.f12570Z.getValue()).a();
        return kycMinorDocumentA == null ? KycMinorDocument.BirthCertificateKycDocument.f12432b : kycMinorDocumentA;
    }

    public final I L1() {
        I i = this.f12567W;
        if (i != null) {
            return i;
        }
        j.n("mMinorTakeAPhotoFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.MINORS_ADD_DOC_CAPTURE;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        this.f12568X = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new t(this, 25));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12569Y);
        a aVar = (a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        Nh.t tVar = e.f5840a;
        j.f(tVar, "single(...)");
        this.f12567W = new I(tVar);
        L1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        L1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.m2();
        mayaKycActivity.l2();
        mayaKycActivity.k2();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AdditionalDocType additionalDocType;
        super.onResume();
        EnumC1212a enumC1212a = EnumC1212a.DOCUMENT;
        KycMinorDocument kycMinorDocumentK1 = K1();
        if (kycMinorDocumentK1.equals(KycMinorDocument.BirthCertificateKycDocument.f12432b)) {
            additionalDocType = AdditionalDocType.BIRTH_CERTIFICATE;
        } else if (kycMinorDocumentK1.equals(KycMinorDocument.ParentIdKycDocument.f12434b)) {
            additionalDocType = AdditionalDocType.PARENT_GUARDIAN_ID;
        } else {
            if (!kycMinorDocumentK1.equals(KycMinorDocument.ConsentFormKycDocument.f12433b)) {
                throw new NoWhenBranchMatchedException();
            }
            additionalDocType = AdditionalDocType.PARENTAL_CONSENT;
        }
        T2.H(this, L.c(new Pair(enumC1212a, additionalDocType.getType())), 2);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        L1().k(new C0417v1(this, 1));
        super.onStop();
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
        mayaKycActivity.v2(R.string.maya_kyc_minor_take_a_photo_toolbar_text);
        mayaKycActivity.s2(R.color.maya_shades_of_grey_11, R.color.maya_primary_white);
        mayaKycActivity.q2();
        mayaKycActivity.o2(R.drawable.maya_ic_navigation_white);
        mayaKycActivity.p2(new ViewOnClickListenerC0336b(6, bVar));
        L1().j();
        C.r0((ImageView) ((C0461j0) G1()).f4126b.f4088d, new C0417v1(this, 0));
    }
}
