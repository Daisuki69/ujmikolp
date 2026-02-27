package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ae.a;
import D.N;
import H8.b;
import K8.r;
import M8.C0376l;
import M8.R0;
import M8.S0;
import M8.T2;
import M8.ViewOnClickListenerC0336b;
import N5.C0448e0;
import S5.c;
import We.s;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.Navigation;
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
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycEverythingClearFragment;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycEverythingClearFragment extends MayaKycBaseFragment<C0448e0> implements r {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public a f12533W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final NavArgsLazy f12534X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final N f12535Y;

    public MayaKycEverythingClearFragment() {
        super(R0.f3218a);
        this.f12534X = new NavArgsLazy(z.a(S0.class), new C0376l(this, 6));
        this.f12535Y = new N(this, 13);
    }

    public final KycMinorDocument K1() {
        KycMinorDocument kycMinorDocumentA = ((S0) this.f12534X.getValue()).a();
        return kycMinorDocumentA == null ? KycMinorDocument.BirthCertificateKycDocument.f12432b : kycMinorDocumentA;
    }

    public final a L1() {
        a aVar = this.f12533W;
        if (aVar != null) {
            return aVar;
        }
        j.n("mEverythingClearFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.MINORS_ADD_DOC_CAPTURE_RESULTS;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12535Y);
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12533W = new a(13);
        L1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        L1().i();
        super.onDestroy();
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
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.b2();
        mayaKycActivity.p2(new ViewOnClickListenerC0336b(3, bVar));
        L1().j();
        final int i = 0;
        C.r0(((C0448e0) G1()).f4082b, new Function0(this) { // from class: M8.Q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycEverythingClearFragment f3214b;

            {
                this.f3214b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdditionalDocType additionalDocType;
                AdditionalDocType additionalDocType2;
                switch (i) {
                    case 0:
                        MayaKycEverythingClearFragment mayaKycEverythingClearFragment = (MayaKycEverythingClearFragment) ((K8.r) this.f3214b.L1().c.get());
                        mayaKycEverythingClearFragment.getClass();
                        T0 t0 = new T0();
                        String string = mayaKycEverythingClearFragment.getString(R.string.maya_kyc_everything_clear_label_use_photo);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        String string2 = T2.l(mayaKycEverythingClearFragment, t0).toString();
                        EnumC1212a enumC1212a = EnumC1212a.DOCUMENT;
                        KycMinorDocument kycMinorDocumentK1 = mayaKycEverythingClearFragment.K1();
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
                        T2.Q(mayaKycEverythingClearFragment, string, string2, cj.L.c(new Pair(enumC1212a, additionalDocType.getType())), 8);
                        ConstraintLayout constraintLayout = ((C0448e0) mayaKycEverythingClearFragment.G1()).f4081a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(Navigation.findNavController(constraintLayout), t0);
                        return Unit.f18162a;
                    default:
                        MayaKycEverythingClearFragment mayaKycEverythingClearFragment2 = (MayaKycEverythingClearFragment) ((K8.r) this.f3214b.L1().c.get());
                        String string3 = mayaKycEverythingClearFragment2.getString(R.string.maya_kyc_everything_clear_label_retake);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        String string4 = mayaKycEverythingClearFragment2.getString(R.string.maya_fragment_kyc_minor_take_a_photo_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        EnumC1212a enumC1212a2 = EnumC1212a.DOCUMENT;
                        KycMinorDocument kycMinorDocumentK12 = mayaKycEverythingClearFragment2.K1();
                        if (kycMinorDocumentK12.equals(KycMinorDocument.BirthCertificateKycDocument.f12432b)) {
                            additionalDocType2 = AdditionalDocType.BIRTH_CERTIFICATE;
                        } else if (kycMinorDocumentK12.equals(KycMinorDocument.ParentIdKycDocument.f12434b)) {
                            additionalDocType2 = AdditionalDocType.PARENT_GUARDIAN_ID;
                        } else {
                            if (!kycMinorDocumentK12.equals(KycMinorDocument.ConsentFormKycDocument.f12433b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            additionalDocType2 = AdditionalDocType.PARENTAL_CONSENT;
                        }
                        T2.Q(mayaKycEverythingClearFragment2, string3, string4, cj.L.c(new Pair(enumC1212a2, additionalDocType2.getType())), 8);
                        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycEverythingClearFragment2.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).i2(false);
                        return Unit.f18162a;
                }
            }
        });
        final int i4 = 1;
        C.r0(((C0448e0) G1()).f4083d, new Function0(this) { // from class: M8.Q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycEverythingClearFragment f3214b;

            {
                this.f3214b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdditionalDocType additionalDocType;
                AdditionalDocType additionalDocType2;
                switch (i4) {
                    case 0:
                        MayaKycEverythingClearFragment mayaKycEverythingClearFragment = (MayaKycEverythingClearFragment) ((K8.r) this.f3214b.L1().c.get());
                        mayaKycEverythingClearFragment.getClass();
                        T0 t0 = new T0();
                        String string = mayaKycEverythingClearFragment.getString(R.string.maya_kyc_everything_clear_label_use_photo);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        String string2 = T2.l(mayaKycEverythingClearFragment, t0).toString();
                        EnumC1212a enumC1212a = EnumC1212a.DOCUMENT;
                        KycMinorDocument kycMinorDocumentK1 = mayaKycEverythingClearFragment.K1();
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
                        T2.Q(mayaKycEverythingClearFragment, string, string2, cj.L.c(new Pair(enumC1212a, additionalDocType.getType())), 8);
                        ConstraintLayout constraintLayout = ((C0448e0) mayaKycEverythingClearFragment.G1()).f4081a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        E1.c.m(Navigation.findNavController(constraintLayout), t0);
                        return Unit.f18162a;
                    default:
                        MayaKycEverythingClearFragment mayaKycEverythingClearFragment2 = (MayaKycEverythingClearFragment) ((K8.r) this.f3214b.L1().c.get());
                        String string3 = mayaKycEverythingClearFragment2.getString(R.string.maya_kyc_everything_clear_label_retake);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        String string4 = mayaKycEverythingClearFragment2.getString(R.string.maya_fragment_kyc_minor_take_a_photo_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        EnumC1212a enumC1212a2 = EnumC1212a.DOCUMENT;
                        KycMinorDocument kycMinorDocumentK12 = mayaKycEverythingClearFragment2.K1();
                        if (kycMinorDocumentK12.equals(KycMinorDocument.BirthCertificateKycDocument.f12432b)) {
                            additionalDocType2 = AdditionalDocType.BIRTH_CERTIFICATE;
                        } else if (kycMinorDocumentK12.equals(KycMinorDocument.ParentIdKycDocument.f12434b)) {
                            additionalDocType2 = AdditionalDocType.PARENT_GUARDIAN_ID;
                        } else {
                            if (!kycMinorDocumentK12.equals(KycMinorDocument.ConsentFormKycDocument.f12433b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            additionalDocType2 = AdditionalDocType.PARENTAL_CONSENT;
                        }
                        T2.Q(mayaKycEverythingClearFragment2, string3, string4, cj.L.c(new Pair(enumC1212a2, additionalDocType2.getType())), 8);
                        KeyEventDispatcher.Component componentRequireActivity2 = mayaKycEverythingClearFragment2.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).i2(false);
                        return Unit.f18162a;
                }
            }
        });
        File cacheDir = requireContext().getCacheDir();
        j.f(cacheDir, "getCacheDir(...)");
        KycMinorDocument kycMinorDocumentK1 = K1();
        String path = cacheDir.getPath();
        String str = File.separator;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(path);
        sb2.append(str);
        sb2.append("zolozkyc");
        sb2.append(str);
        File file = new File(s.p(sb2, kycMinorDocumentK1.f12431a, ".jpg"));
        if (file.exists()) {
            ((C0448e0) G1()).c.setImageBitmap(BitmapFactory.decodeFile(file.getPath()));
        }
    }
}
