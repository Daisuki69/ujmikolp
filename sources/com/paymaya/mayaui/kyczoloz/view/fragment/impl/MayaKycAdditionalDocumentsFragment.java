package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ag.f;
import B8.a;
import D.N;
import D8.C0198f;
import E1.c;
import E8.C;
import H8.b;
import K8.InterfaceC0278c;
import M8.C0360h;
import M8.C0376l;
import M8.C0380m;
import M8.C0396q;
import M8.InterfaceC0364i;
import M8.T2;
import N5.T;
import We.s;
import Xh.i;
import Y.e;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ViewKt;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.KycAdditionalDocument;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycPersonalInfoSnapshot;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.kyczoloz.utils.KycMinorDocument;
import com.paymaya.mayaui.kyczoloz.utils.d;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment;
import java.io.File;
import java.io.FileInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycAdditionalDocumentsFragment extends MayaKycBaseFragment<T> implements InterfaceC0278c {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0198f f12467W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final NavArgsLazy f12468X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final N f12469Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC0364i f12470Z;

    public MayaKycAdditionalDocumentsFragment() {
        super(C0360h.f3308a);
        this.f12468X = new NavArgsLazy(z.a(C0380m.class), new C0376l(this, 0));
        this.f12469Y = new N(this, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K1(com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment.K1(com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment, boolean):void");
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        return ((C0198f) L1()).f.e().isKycUxTofuRedesignEnabled();
    }

    public final a L1() {
        C0198f c0198f = this.f12467W;
        if (c0198f != null) {
            return c0198f;
        }
        j.n("mAdditionalDocumentsFragmentPresenter");
        throw null;
    }

    public final Button M1() {
        Button buttonNext = (Button) ((T) G1()).f3921b.e;
        j.f(buttonNext, "buttonNext");
        return buttonNext;
    }

    public final String N1(KycMinorDocument kycMinorDocument) {
        File cacheDir = requireContext().getCacheDir();
        j.f(cacheDir, "getCacheDir(...)");
        String path = cacheDir.getPath();
        String str = File.separator;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(path);
        sb2.append(str);
        sb2.append("zolozkyc");
        sb2.append(str);
        File file = new File(s.p(sb2, kycMinorDocument.f12431a, ".jpg"));
        return file.exists() ? file.getPath() : "";
    }

    public final String O1(KycMinorDocument kycMinorDocument) {
        File cacheDir = requireContext().getCacheDir();
        j.f(cacheDir, "getCacheDir(...)");
        String path = cacheDir.getPath();
        String str = File.separator;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(path);
        sb2.append(str);
        sb2.append("zolozkyc");
        sb2.append(str);
        File file = new File(s.p(sb2, kycMinorDocument.f12431a, ".jpg"));
        byte[] bArr = null;
        if (file.exists()) {
            byte[] bArr2 = new byte[(int) file.length()];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr2);
                    fileInputStream.close();
                    bArr = bArr2;
                } finally {
                }
            } catch (Exception unused) {
                yk.a.b();
            }
        }
        if (bArr == null) {
            return "";
        }
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        j.d(strEncodeToString);
        return strEncodeToString;
    }

    public final void P1() {
        ConstraintLayout constraintLayout = ((T) G1()).f3920a;
        j.f(constraintLayout, "getRoot(...)");
        Navigation.findNavController(constraintLayout).popBackStack();
    }

    public final void Q1(KycMinorDocument kycMinorDocument) {
        C0396q c0396q = new C0396q(kycMinorDocument);
        if (kycMinorDocument.equals(KycMinorDocument.BirthCertificateKycDocument.f12432b)) {
            String string = getString(R.string.maya_kyc_additional_documents_birth_certificate_action);
            j.f(string, "getString(...)");
            T2.Q(this, string, T2.l(this, c0396q).toString(), null, 12);
        } else if (kycMinorDocument.equals(KycMinorDocument.ConsentFormKycDocument.f12433b)) {
            String string2 = getString(R.string.maya_kyc_additional_documents_consent_form_action);
            j.f(string2, "getString(...)");
            T2.Q(this, string2, T2.l(this, c0396q).toString(), null, 12);
        } else {
            if (!kycMinorDocument.equals(KycMinorDocument.ParentIdKycDocument.f12434b)) {
                throw new NoWhenBranchMatchedException();
            }
            String string3 = getString(R.string.maya_kyc_additional_documents_parent_id_action);
            j.f(string3, "getString(...)");
            T2.Q(this, string3, T2.l(this, c0396q).toString(), null, 12);
        }
        ConstraintLayout constraintLayout = ((T) G1()).f3920a;
        j.f(constraintLayout, "getRoot(...)");
        c.m(Navigation.findNavController(constraintLayout), c0396q);
    }

    public final void R1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).t2();
        ((ScrollView) ((T) G1()).f3921b.f3587d).setVisibility(0);
        ((T) G1()).c.f4041b.setVisibility(8);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.MINOR_ADDITIONAL_DOCUMENTS;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12470Z = (InterfaceC0364i) getActivity();
        this.f10338R = true;
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12469Y);
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        e eVarY = aVar.y();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f12467W = new C0198f(eVarY, preference, flagConfigurationService);
        ((AbstractC2509a) L1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) L1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        File cacheDir = requireContext().getCacheDir();
        j.f(cacheDir, "getCacheDir(...)");
        File file = new File(d.a(cacheDir, KycMinorDocument.BirthCertificateKycDocument.f12432b));
        if (file.exists()) {
            ((MultiColorTextView) ((T) G1()).f3921b.f3589k).setVisibility(8);
            ((ImageView) ((T) G1()).f3921b.f).setVisibility(0);
            ((ImageView) ((T) G1()).f3921b.f).setImageBitmap(BitmapFactory.decodeFile(file.getPath()));
        } else {
            ((MultiColorTextView) ((T) G1()).f3921b.f3589k).setVisibility(0);
            ((ImageView) ((T) G1()).f3921b.f).setVisibility(8);
        }
        File cacheDir2 = requireContext().getCacheDir();
        j.f(cacheDir2, "getCacheDir(...)");
        File file2 = new File(d.a(cacheDir2, KycMinorDocument.ParentIdKycDocument.f12434b));
        if (file2.exists()) {
            ((MultiColorTextView) ((T) G1()).f3921b.m).setVisibility(8);
            ((ImageView) ((T) G1()).f3921b.h).setVisibility(0);
            ((ImageView) ((T) G1()).f3921b.h).setImageBitmap(BitmapFactory.decodeFile(file2.getPath()));
        } else {
            ((MultiColorTextView) ((T) G1()).f3921b.m).setVisibility(0);
            ((ImageView) ((T) G1()).f3921b.h).setVisibility(8);
        }
        File cacheDir3 = requireContext().getCacheDir();
        j.f(cacheDir3, "getCacheDir(...)");
        File file3 = new File(d.a(cacheDir3, KycMinorDocument.ConsentFormKycDocument.f12433b));
        if (file3.exists()) {
            ((MultiColorTextView) ((T) G1()).f3921b.f3590l).setVisibility(8);
            ((ImageView) ((T) G1()).f3921b.f3588g).setVisibility(0);
            ((ImageView) ((T) G1()).f3921b.f3588g).setImageBitmap(BitmapFactory.decodeFile(file3.getPath()));
        } else {
            ((MultiColorTextView) ((T) G1()).f3921b.f3590l).setVisibility(0);
            ((ImageView) ((T) G1()).f3921b.f3588g).setVisibility(8);
        }
        a aVarL1 = L1();
        boolean zExists = file.exists();
        boolean zExists2 = file2.exists();
        boolean zExists3 = file3.exists();
        C0198f c0198f = (C0198f) aVarL1;
        if (zExists && zExists2 && zExists3) {
            ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).M1().setEnabled(true);
        } else {
            ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).M1().setEnabled(false);
        }
        T2.H(this, null, 3);
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
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        mayaKycActivity.v2(R.string.maya_kyc_additional_documents_toolbar_text);
        mayaKycActivity.p2(new Ad.a(17, this, bVar));
        ((C0198f) L1()).j();
        KycPersonalInfoSnapshot kycPersonalInfoSnapshotA = ((C0380m) this.f12468X.getValue()).a();
        if (kycPersonalInfoSnapshotA != null) {
            L1();
            C.b(kycPersonalInfoSnapshotA, "personal_info_snapshot");
        }
        i.D(this, z.a(MayaKycConfirmationBottomSheetDialogFragment.class), new f(1, this, MayaKycAdditionalDocumentsFragment.class, "handleConfirmationResult", "handleConfirmationResult(Z)V", 0, 25));
        f fVar = new f(1, this, MayaKycAdditionalDocumentsFragment.class, "handleConfirmationResult", "handleConfirmationResult(Z)V", 0, 26);
        C1790e c1790eA = z.a(MayaKycPersonalInfoConfirmSubmissionFragment.class);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        String strC = c1790eA.c();
        if (strC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        parentFragmentManager.setFragmentResultListener(((Object) strC) + "confirmation_result_boolean", getViewLifecycleOwner(), new A7.c(fVar, 18));
        i.F(this, z.a(MayaKycPersonalInfoConfirmSubmissionFragment.class), new f(1, this, MayaKycAdditionalDocumentsFragment.class, "handleBackPressedFromSummary", "handleBackPressedFromSummary(Lcom/paymaya/domain/model/PersonalInfoConfirmAction;)V", 0, 27), "confirmation_result_parcelable");
        final int i = 0;
        com.paymaya.common.utility.C.r0((LinearLayout) ((T) G1()).f3921b.c, new Function0(this) { // from class: M8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAdditionalDocumentsFragment f3302b;

            {
                this.f3302b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KycCmsContentData data;
                KycAdditionalDocument additionalDocument;
                switch (i) {
                    case 0:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.BirthCertificateKycDocument.f12432b);
                        break;
                    case 1:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ParentIdKycDocument.f12434b);
                        break;
                    case 2:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ConsentFormKycDocument.f12433b);
                        break;
                    case 3:
                        C0198f c0198f = (C0198f) this.f3302b.L1();
                        InterfaceC0278c interfaceC0278c = (InterfaceC0278c) c0198f.c.get();
                        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity2)).Z1().f;
                        String consentUrl = (kycCmsContent == null || (data = kycCmsContent.getData()) == null || (additionalDocument = data.getAdditionalDocument()) == null) ? null : additionalDocument.getConsentUrl();
                        if (consentUrl == null) {
                            consentUrl = "";
                        }
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) interfaceC0278c;
                        mayaKycAdditionalDocumentsFragment.getClass();
                        String string = mayaKycAdditionalDocumentsFragment.getString(R.string.maya_kyc_additional_documents_label_download);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycAdditionalDocumentsFragment, string, consentUrl, null, 12);
                        KeyEventDispatcher.Component componentRequireActivity3 = mayaKycAdditionalDocumentsFragment.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        MayaKycActivity mayaKycActivity2 = (MayaKycActivity) ((H8.b) componentRequireActivity3);
                        mayaKycActivity2.n1();
                        B5.i.f(mayaKycActivity2, consentUrl);
                        break;
                    default:
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment2 = this.f3302b;
                        C0198f c0198f2 = (C0198f) mayaKycAdditionalDocumentsFragment2.L1();
                        if (mayaKycAdditionalDocumentsFragment2.M1().isEnabled()) {
                            if (c0198f2.f.e().isKycUxTofuRedesignEnabled()) {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment3 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment3.getClass();
                                KycPersonalInfoSnapshot defaultSnapshot = KycPersonalInfoSnapshot.Companion.emptySnapshot();
                                mayaKycAdditionalDocumentsFragment3.L1();
                                kotlin.jvm.internal.j.g(defaultSnapshot, "defaultSnapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) E8.C.a(defaultSnapshot, "personal_info_snapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshotA2 = ((C0380m) mayaKycAdditionalDocumentsFragment3.f12468X.getValue()).a();
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot2 = kycPersonalInfoSnapshotA2 == null ? kycPersonalInfoSnapshot : kycPersonalInfoSnapshotA2;
                                ConstraintLayout constraintLayout = ((N5.T) mayaKycAdditionalDocumentsFragment3.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout);
                                C0388o c0388o = new C0388o(KycPersonalInfoSnapshot.copy$default(kycPersonalInfoSnapshot2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.BirthCertificateKycDocument.f12432b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ParentIdKycDocument.f12434b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ConsentFormKycDocument.f12433b), -1, 0, null));
                                T2.Q(mayaKycAdditionalDocumentsFragment3, mayaKycAdditionalDocumentsFragment3.M1().getText().toString(), T2.l(mayaKycAdditionalDocumentsFragment3, c0388o).toString(), null, 12);
                                E1.c.m(navControllerFindNavController, c0388o);
                            } else {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment4 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment4.getClass();
                                C0384n c0384n = new C0384n(T2.j(mayaKycAdditionalDocumentsFragment4));
                                String string2 = mayaKycAdditionalDocumentsFragment4.getString(R.string.maya_label_button_next);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                T2.Q(mayaKycAdditionalDocumentsFragment4, string2, T2.l(mayaKycAdditionalDocumentsFragment4, c0384n).toString(), null, 12);
                                ConstraintLayout constraintLayout2 = ((N5.T) mayaKycAdditionalDocumentsFragment4.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                                E1.c.m(Navigation.findNavController(constraintLayout2), c0384n);
                            }
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i4 = 1;
        com.paymaya.common.utility.C.r0((LinearLayout) ((T) G1()).f3921b.j, new Function0(this) { // from class: M8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAdditionalDocumentsFragment f3302b;

            {
                this.f3302b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KycCmsContentData data;
                KycAdditionalDocument additionalDocument;
                switch (i4) {
                    case 0:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.BirthCertificateKycDocument.f12432b);
                        break;
                    case 1:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ParentIdKycDocument.f12434b);
                        break;
                    case 2:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ConsentFormKycDocument.f12433b);
                        break;
                    case 3:
                        C0198f c0198f = (C0198f) this.f3302b.L1();
                        InterfaceC0278c interfaceC0278c = (InterfaceC0278c) c0198f.c.get();
                        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity2)).Z1().f;
                        String consentUrl = (kycCmsContent == null || (data = kycCmsContent.getData()) == null || (additionalDocument = data.getAdditionalDocument()) == null) ? null : additionalDocument.getConsentUrl();
                        if (consentUrl == null) {
                            consentUrl = "";
                        }
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) interfaceC0278c;
                        mayaKycAdditionalDocumentsFragment.getClass();
                        String string = mayaKycAdditionalDocumentsFragment.getString(R.string.maya_kyc_additional_documents_label_download);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycAdditionalDocumentsFragment, string, consentUrl, null, 12);
                        KeyEventDispatcher.Component componentRequireActivity3 = mayaKycAdditionalDocumentsFragment.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        MayaKycActivity mayaKycActivity2 = (MayaKycActivity) ((H8.b) componentRequireActivity3);
                        mayaKycActivity2.n1();
                        B5.i.f(mayaKycActivity2, consentUrl);
                        break;
                    default:
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment2 = this.f3302b;
                        C0198f c0198f2 = (C0198f) mayaKycAdditionalDocumentsFragment2.L1();
                        if (mayaKycAdditionalDocumentsFragment2.M1().isEnabled()) {
                            if (c0198f2.f.e().isKycUxTofuRedesignEnabled()) {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment3 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment3.getClass();
                                KycPersonalInfoSnapshot defaultSnapshot = KycPersonalInfoSnapshot.Companion.emptySnapshot();
                                mayaKycAdditionalDocumentsFragment3.L1();
                                kotlin.jvm.internal.j.g(defaultSnapshot, "defaultSnapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) E8.C.a(defaultSnapshot, "personal_info_snapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshotA2 = ((C0380m) mayaKycAdditionalDocumentsFragment3.f12468X.getValue()).a();
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot2 = kycPersonalInfoSnapshotA2 == null ? kycPersonalInfoSnapshot : kycPersonalInfoSnapshotA2;
                                ConstraintLayout constraintLayout = ((N5.T) mayaKycAdditionalDocumentsFragment3.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout);
                                C0388o c0388o = new C0388o(KycPersonalInfoSnapshot.copy$default(kycPersonalInfoSnapshot2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.BirthCertificateKycDocument.f12432b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ParentIdKycDocument.f12434b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ConsentFormKycDocument.f12433b), -1, 0, null));
                                T2.Q(mayaKycAdditionalDocumentsFragment3, mayaKycAdditionalDocumentsFragment3.M1().getText().toString(), T2.l(mayaKycAdditionalDocumentsFragment3, c0388o).toString(), null, 12);
                                E1.c.m(navControllerFindNavController, c0388o);
                            } else {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment4 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment4.getClass();
                                C0384n c0384n = new C0384n(T2.j(mayaKycAdditionalDocumentsFragment4));
                                String string2 = mayaKycAdditionalDocumentsFragment4.getString(R.string.maya_label_button_next);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                T2.Q(mayaKycAdditionalDocumentsFragment4, string2, T2.l(mayaKycAdditionalDocumentsFragment4, c0384n).toString(), null, 12);
                                ConstraintLayout constraintLayout2 = ((N5.T) mayaKycAdditionalDocumentsFragment4.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                                E1.c.m(Navigation.findNavController(constraintLayout2), c0384n);
                            }
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i6 = 2;
        com.paymaya.common.utility.C.r0((LinearLayout) ((T) G1()).f3921b.i, new Function0(this) { // from class: M8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAdditionalDocumentsFragment f3302b;

            {
                this.f3302b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KycCmsContentData data;
                KycAdditionalDocument additionalDocument;
                switch (i6) {
                    case 0:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.BirthCertificateKycDocument.f12432b);
                        break;
                    case 1:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ParentIdKycDocument.f12434b);
                        break;
                    case 2:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ConsentFormKycDocument.f12433b);
                        break;
                    case 3:
                        C0198f c0198f = (C0198f) this.f3302b.L1();
                        InterfaceC0278c interfaceC0278c = (InterfaceC0278c) c0198f.c.get();
                        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity2)).Z1().f;
                        String consentUrl = (kycCmsContent == null || (data = kycCmsContent.getData()) == null || (additionalDocument = data.getAdditionalDocument()) == null) ? null : additionalDocument.getConsentUrl();
                        if (consentUrl == null) {
                            consentUrl = "";
                        }
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) interfaceC0278c;
                        mayaKycAdditionalDocumentsFragment.getClass();
                        String string = mayaKycAdditionalDocumentsFragment.getString(R.string.maya_kyc_additional_documents_label_download);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycAdditionalDocumentsFragment, string, consentUrl, null, 12);
                        KeyEventDispatcher.Component componentRequireActivity3 = mayaKycAdditionalDocumentsFragment.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        MayaKycActivity mayaKycActivity2 = (MayaKycActivity) ((H8.b) componentRequireActivity3);
                        mayaKycActivity2.n1();
                        B5.i.f(mayaKycActivity2, consentUrl);
                        break;
                    default:
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment2 = this.f3302b;
                        C0198f c0198f2 = (C0198f) mayaKycAdditionalDocumentsFragment2.L1();
                        if (mayaKycAdditionalDocumentsFragment2.M1().isEnabled()) {
                            if (c0198f2.f.e().isKycUxTofuRedesignEnabled()) {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment3 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment3.getClass();
                                KycPersonalInfoSnapshot defaultSnapshot = KycPersonalInfoSnapshot.Companion.emptySnapshot();
                                mayaKycAdditionalDocumentsFragment3.L1();
                                kotlin.jvm.internal.j.g(defaultSnapshot, "defaultSnapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) E8.C.a(defaultSnapshot, "personal_info_snapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshotA2 = ((C0380m) mayaKycAdditionalDocumentsFragment3.f12468X.getValue()).a();
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot2 = kycPersonalInfoSnapshotA2 == null ? kycPersonalInfoSnapshot : kycPersonalInfoSnapshotA2;
                                ConstraintLayout constraintLayout = ((N5.T) mayaKycAdditionalDocumentsFragment3.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout);
                                C0388o c0388o = new C0388o(KycPersonalInfoSnapshot.copy$default(kycPersonalInfoSnapshot2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.BirthCertificateKycDocument.f12432b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ParentIdKycDocument.f12434b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ConsentFormKycDocument.f12433b), -1, 0, null));
                                T2.Q(mayaKycAdditionalDocumentsFragment3, mayaKycAdditionalDocumentsFragment3.M1().getText().toString(), T2.l(mayaKycAdditionalDocumentsFragment3, c0388o).toString(), null, 12);
                                E1.c.m(navControllerFindNavController, c0388o);
                            } else {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment4 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment4.getClass();
                                C0384n c0384n = new C0384n(T2.j(mayaKycAdditionalDocumentsFragment4));
                                String string2 = mayaKycAdditionalDocumentsFragment4.getString(R.string.maya_label_button_next);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                T2.Q(mayaKycAdditionalDocumentsFragment4, string2, T2.l(mayaKycAdditionalDocumentsFragment4, c0384n).toString(), null, 12);
                                ConstraintLayout constraintLayout2 = ((N5.T) mayaKycAdditionalDocumentsFragment4.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                                E1.c.m(Navigation.findNavController(constraintLayout2), c0384n);
                            }
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i10 = 3;
        com.paymaya.common.utility.C.r0((Button) ((T) G1()).f3921b.f3586b, new Function0(this) { // from class: M8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAdditionalDocumentsFragment f3302b;

            {
                this.f3302b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KycCmsContentData data;
                KycAdditionalDocument additionalDocument;
                switch (i10) {
                    case 0:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.BirthCertificateKycDocument.f12432b);
                        break;
                    case 1:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ParentIdKycDocument.f12434b);
                        break;
                    case 2:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ConsentFormKycDocument.f12433b);
                        break;
                    case 3:
                        C0198f c0198f = (C0198f) this.f3302b.L1();
                        InterfaceC0278c interfaceC0278c = (InterfaceC0278c) c0198f.c.get();
                        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity2)).Z1().f;
                        String consentUrl = (kycCmsContent == null || (data = kycCmsContent.getData()) == null || (additionalDocument = data.getAdditionalDocument()) == null) ? null : additionalDocument.getConsentUrl();
                        if (consentUrl == null) {
                            consentUrl = "";
                        }
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) interfaceC0278c;
                        mayaKycAdditionalDocumentsFragment.getClass();
                        String string = mayaKycAdditionalDocumentsFragment.getString(R.string.maya_kyc_additional_documents_label_download);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycAdditionalDocumentsFragment, string, consentUrl, null, 12);
                        KeyEventDispatcher.Component componentRequireActivity3 = mayaKycAdditionalDocumentsFragment.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        MayaKycActivity mayaKycActivity2 = (MayaKycActivity) ((H8.b) componentRequireActivity3);
                        mayaKycActivity2.n1();
                        B5.i.f(mayaKycActivity2, consentUrl);
                        break;
                    default:
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment2 = this.f3302b;
                        C0198f c0198f2 = (C0198f) mayaKycAdditionalDocumentsFragment2.L1();
                        if (mayaKycAdditionalDocumentsFragment2.M1().isEnabled()) {
                            if (c0198f2.f.e().isKycUxTofuRedesignEnabled()) {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment3 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment3.getClass();
                                KycPersonalInfoSnapshot defaultSnapshot = KycPersonalInfoSnapshot.Companion.emptySnapshot();
                                mayaKycAdditionalDocumentsFragment3.L1();
                                kotlin.jvm.internal.j.g(defaultSnapshot, "defaultSnapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) E8.C.a(defaultSnapshot, "personal_info_snapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshotA2 = ((C0380m) mayaKycAdditionalDocumentsFragment3.f12468X.getValue()).a();
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot2 = kycPersonalInfoSnapshotA2 == null ? kycPersonalInfoSnapshot : kycPersonalInfoSnapshotA2;
                                ConstraintLayout constraintLayout = ((N5.T) mayaKycAdditionalDocumentsFragment3.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout);
                                C0388o c0388o = new C0388o(KycPersonalInfoSnapshot.copy$default(kycPersonalInfoSnapshot2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.BirthCertificateKycDocument.f12432b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ParentIdKycDocument.f12434b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ConsentFormKycDocument.f12433b), -1, 0, null));
                                T2.Q(mayaKycAdditionalDocumentsFragment3, mayaKycAdditionalDocumentsFragment3.M1().getText().toString(), T2.l(mayaKycAdditionalDocumentsFragment3, c0388o).toString(), null, 12);
                                E1.c.m(navControllerFindNavController, c0388o);
                            } else {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment4 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment4.getClass();
                                C0384n c0384n = new C0384n(T2.j(mayaKycAdditionalDocumentsFragment4));
                                String string2 = mayaKycAdditionalDocumentsFragment4.getString(R.string.maya_label_button_next);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                T2.Q(mayaKycAdditionalDocumentsFragment4, string2, T2.l(mayaKycAdditionalDocumentsFragment4, c0384n).toString(), null, 12);
                                ConstraintLayout constraintLayout2 = ((N5.T) mayaKycAdditionalDocumentsFragment4.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                                E1.c.m(Navigation.findNavController(constraintLayout2), c0384n);
                            }
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i11 = 4;
        com.paymaya.common.utility.C.r0(M1(), new Function0(this) { // from class: M8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAdditionalDocumentsFragment f3302b;

            {
                this.f3302b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KycCmsContentData data;
                KycAdditionalDocument additionalDocument;
                switch (i11) {
                    case 0:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.BirthCertificateKycDocument.f12432b);
                        break;
                    case 1:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ParentIdKycDocument.f12434b);
                        break;
                    case 2:
                        ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) this.f3302b.L1()).c.get())).Q1(KycMinorDocument.ConsentFormKycDocument.f12433b);
                        break;
                    case 3:
                        C0198f c0198f = (C0198f) this.f3302b.L1();
                        InterfaceC0278c interfaceC0278c = (InterfaceC0278c) c0198f.c.get();
                        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity2)).Z1().f;
                        String consentUrl = (kycCmsContent == null || (data = kycCmsContent.getData()) == null || (additionalDocument = data.getAdditionalDocument()) == null) ? null : additionalDocument.getConsentUrl();
                        if (consentUrl == null) {
                            consentUrl = "";
                        }
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) interfaceC0278c;
                        mayaKycAdditionalDocumentsFragment.getClass();
                        String string = mayaKycAdditionalDocumentsFragment.getString(R.string.maya_kyc_additional_documents_label_download);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycAdditionalDocumentsFragment, string, consentUrl, null, 12);
                        KeyEventDispatcher.Component componentRequireActivity3 = mayaKycAdditionalDocumentsFragment.requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        MayaKycActivity mayaKycActivity2 = (MayaKycActivity) ((H8.b) componentRequireActivity3);
                        mayaKycActivity2.n1();
                        B5.i.f(mayaKycActivity2, consentUrl);
                        break;
                    default:
                        MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment2 = this.f3302b;
                        C0198f c0198f2 = (C0198f) mayaKycAdditionalDocumentsFragment2.L1();
                        if (mayaKycAdditionalDocumentsFragment2.M1().isEnabled()) {
                            if (c0198f2.f.e().isKycUxTofuRedesignEnabled()) {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment3 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment3.getClass();
                                KycPersonalInfoSnapshot defaultSnapshot = KycPersonalInfoSnapshot.Companion.emptySnapshot();
                                mayaKycAdditionalDocumentsFragment3.L1();
                                kotlin.jvm.internal.j.g(defaultSnapshot, "defaultSnapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) E8.C.a(defaultSnapshot, "personal_info_snapshot");
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshotA2 = ((C0380m) mayaKycAdditionalDocumentsFragment3.f12468X.getValue()).a();
                                KycPersonalInfoSnapshot kycPersonalInfoSnapshot2 = kycPersonalInfoSnapshotA2 == null ? kycPersonalInfoSnapshot : kycPersonalInfoSnapshotA2;
                                ConstraintLayout constraintLayout = ((N5.T) mayaKycAdditionalDocumentsFragment3.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                NavController navControllerFindNavController = ViewKt.findNavController(constraintLayout);
                                C0388o c0388o = new C0388o(KycPersonalInfoSnapshot.copy$default(kycPersonalInfoSnapshot2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.BirthCertificateKycDocument.f12432b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ParentIdKycDocument.f12434b), mayaKycAdditionalDocumentsFragment3.N1(KycMinorDocument.ConsentFormKycDocument.f12433b), -1, 0, null));
                                T2.Q(mayaKycAdditionalDocumentsFragment3, mayaKycAdditionalDocumentsFragment3.M1().getText().toString(), T2.l(mayaKycAdditionalDocumentsFragment3, c0388o).toString(), null, 12);
                                E1.c.m(navControllerFindNavController, c0388o);
                            } else {
                                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment4 = (MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f2.c.get());
                                mayaKycAdditionalDocumentsFragment4.getClass();
                                C0384n c0384n = new C0384n(T2.j(mayaKycAdditionalDocumentsFragment4));
                                String string2 = mayaKycAdditionalDocumentsFragment4.getString(R.string.maya_label_button_next);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                T2.Q(mayaKycAdditionalDocumentsFragment4, string2, T2.l(mayaKycAdditionalDocumentsFragment4, c0384n).toString(), null, 12);
                                ConstraintLayout constraintLayout2 = ((N5.T) mayaKycAdditionalDocumentsFragment4.G1()).f3920a;
                                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                                E1.c.m(Navigation.findNavController(constraintLayout2), c0384n);
                            }
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.d
    public final void q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).q();
    }
}
