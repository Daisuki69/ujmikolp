package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ag.d;
import D8.N;
import E1.c;
import E8.f;
import H8.b;
import K8.G;
import M8.C0375k2;
import M8.C0379l2;
import M8.L;
import N5.C0475q0;
import O5.a;
import Y.e;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.navigation.ViewKt;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.AdditionalDocType;
import com.paymaya.domain.model.KycAdditionalDocsUploadRequest;
import com.paymaya.domain.model.KycCaptureGuide;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneSwornStatementFragment;
import java.util.HashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycSsneSwornStatementFragment extends MayaKycBaseFragment<C0475q0> implements G {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public N f12613W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e0 f12614X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Uri f12615Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final D.N f12616Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final MayaEKYCSelectedDocument f12617a0;

    public MayaKycSsneSwornStatementFragment() {
        super(C0375k2.f3328a);
        this.f12616Z = new D.N(this, 24);
        this.f12617a0 = new MayaEKYCSelectedDocument(new KycDocument(0, "SSNE", null, null, null, null, false, false, null, C1112C.f9377a, TypedValues.AttributesType.TYPE_PATH_ROTATE, null), new KycCaptureGuide(null, null, null, null, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null), null, 0, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String L1() {
        /*
            java.lang.String r0 = "job_title_object"
            r1 = 0
            java.lang.Object r0 = E8.C.a(r1, r0)
            com.paymaya.domain.model.KycJobTitle r0 = (com.paymaya.domain.model.KycJobTitle) r0
            if (r0 == 0) goto L10
            java.lang.String r2 = r0.getCode()
            goto L11
        L10:
            r2 = r1
        L11:
            java.lang.String r3 = "BUSINESS_OWNER"
            boolean r2 = kotlin.jvm.internal.j.b(r2, r3)
            r3 = 1
            if (r2 != 0) goto L2b
            if (r0 == 0) goto L20
            java.lang.String r1 = r0.getCode()
        L20:
            java.lang.String r0 = "DIRECTOR"
            boolean r0 = kotlin.jvm.internal.j.b(r1, r0)
            if (r0 == 0) goto L29
            goto L2b
        L29:
            r0 = 0
            goto L2c
        L2b:
            r0 = r3
        L2c:
            if (r0 != r3) goto L31
            java.lang.String r0 = "Business Owner / Director"
            return r0
        L31:
            if (r0 != 0) goto L36
            java.lang.String r0 = "Individual"
            return r0
        L36:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneSwornStatementFragment.L1():java.lang.String");
    }

    public final N K1() {
        N n7 = this.f12613W;
        if (n7 != null) {
            return n7;
        }
        j.n("mSsneSwornStatementFragmentPresenter");
        throw null;
    }

    public final void M1(boolean z4) {
        ((C0475q0) G1()).e.setVisibility(!z4 ? 0 : 8);
        ((C0475q0) G1()).f4185d.setVisibility(z4 ? 0 : 8);
    }

    public final void N1() {
        String string = getString(R.string.maya_kyc_ssne_page_name_label);
        j.f(string, "getString(...)");
        Q1("Back", string);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).i2(true);
    }

    public final void O1(int i, b bVar) {
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.SSNE_SUBMIT);
        c1219hD.n(37);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_kyc_ssne_upload_documents_screen_label);
        HashMap map = c1219hD.j;
        map.put("page_name", string);
        map.put("ssne_type", L1());
        map.put("modal", "SSNE Submit Error");
        map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Network Error");
        map.put("kyc_status", t1().l());
        map.put("path", "TOFU 1.0");
        o1().c(getActivity(), c1219hD);
        ConstraintLayout constraintLayout = ((C0475q0) G1()).f4183a;
        j.f(constraintLayout, "getRoot(...)");
        c.m(ViewKt.findNavController(constraintLayout), new C0379l2(((MayaKycActivity) bVar).s().toString(), i));
    }

    public final void P1(String str) {
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.SSNE_UPLOAD);
        c1219hD.n(37);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_kyc_ssne_upload_documents_screen_label);
        HashMap map = c1219hD.j;
        map.put("page_name", string);
        map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, str);
        map.put("modal", "SSNE Upload Error");
        map.put("ssne_type", L1());
        map.put("kyc_status", t1().l());
        map.put("path", "TOFU 1.0");
        c1219hD.i();
        o1().c(getActivity(), c1219hD);
    }

    public final void Q1(String str, String str2) {
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.SSNE_UPLOAD);
        c1219hD.n(18);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hD.j;
        map.put("button", str);
        map.put("page_name", getString(R.string.maya_kyc_ssne_upload_documents_screen_label));
        map.put("ssne_type", L1());
        map.put("kyc_status", t1().l());
        map.put("path", "TOFU 1.0");
        c1219hD.i();
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        if (str2.length() > 0) {
            c1219hD.j.put("destination_page", str2);
        }
        o1().c(getActivity(), c1219hD);
    }

    public final void R1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        String string = getString(R.string.maya_kyc_ssne_sworn_statement_error_file_too_large);
        j.f(string, "getString(...)");
        ((MayaKycActivity) ((b) componentRequireActivity)).u2(string);
        P1(string);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SSNE_UPLOAD;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        a aVar = (a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        e eVarY = aVar.y();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12613W = new N(eVarY, preference);
        this.f12614X = (e0) aVar.f4685S.get();
        K1().h(this);
        f.f1283b = new d(this, 28);
        registerForActivityResult(new ActivityResultContracts.RequestPermission(), new A7.c(this, 17));
        f.f1282a = registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new C2.f(2));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        K1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12616Z.remove();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.SSNE_UPLOAD);
        c1219hD.n(4);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_kyc_ssne_page_name_label);
        HashMap map = c1219hD.j;
        map.put("source_page", string);
        map.put("page_name", getString(R.string.maya_kyc_ssne_upload_documents_screen_label));
        map.put("path", "TOFU 1.0");
        map.put("kyc_status", t1().l());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12616Z);
        Object objRequireActivity = requireActivity();
        j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        Object obj = (b) objRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) obj;
        mayaKycActivity.t2();
        e0 e0Var = this.f12614X;
        if (e0Var == null) {
            j.n("resourceManager");
            throw null;
        }
        mayaKycActivity.r2(ContextCompat.getColor(e0Var.f10905a, R.color.ghost_white));
        e0 e0Var2 = this.f12614X;
        if (e0Var2 == null) {
            j.n("resourceManager");
            throw null;
        }
        ((q) obj).N1(ContextCompat.getColor(e0Var2.f10905a, R.color.ghost_white));
        mayaKycActivity.p2(new L(this, 10));
        mayaKycActivity.t1();
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        final int i = 0;
        Ke.b.b(((C0475q0) G1()).f4184b, new Function0(this) { // from class: M8.j2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSsneSwornStatementFragment f3323b;

            {
                this.f3323b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strG = null;
                switch (i) {
                    case 0:
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment = this.f3323b;
                        String string = ((C0475q0) mayaKycSsneSwornStatementFragment.G1()).f4184b.getText().toString();
                        String string2 = mayaKycSsneSwornStatementFragment.getString(R.string.maya_kyc_ssne_upload_documents_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        mayaKycSsneSwornStatementFragment.Q1(string, string2);
                        Set supportedMimeTypes = E8.j.f1284a;
                        kotlin.jvm.internal.j.g(supportedMimeTypes, "supportedMimeTypes");
                        ActivityResultLauncher activityResultLauncher = E8.f.f1282a;
                        if (activityResultLauncher != null) {
                            activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("filePickerLauncher");
                        throw null;
                    case 1:
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment2 = this.f3323b;
                        String string3 = mayaKycSsneSwornStatementFragment2.getString(R.string.maya_kyc_ssne_upload_documents_screen_label);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        mayaKycSsneSwornStatementFragment2.Q1("Delete", string3);
                        ((MayaKycSsneSwornStatementFragment) ((K8.G) mayaKycSsneSwornStatementFragment2.K1().c.get())).M1(false);
                        mayaKycSsneSwornStatementFragment2.f12615Y = null;
                        mayaKycSsneSwornStatementFragment2.K1().o();
                        return Unit.f18162a;
                    default:
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment3 = this.f3323b;
                        String string4 = ((C0475q0) mayaKycSsneSwornStatementFragment3.G1()).f4184b.getText().toString();
                        String string5 = mayaKycSsneSwornStatementFragment3.getString(R.string.maya_fragment_kyc_complete_personal_information_screen_label);
                        kotlin.jvm.internal.j.f(string5, "getString(...)");
                        mayaKycSsneSwornStatementFragment3.Q1(string4, string5);
                        D8.N nK1 = mayaKycSsneSwornStatementFragment3.K1();
                        ((MayaKycSsneSwornStatementFragment) ((K8.G) nK1.c.get())).E1();
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment4 = (MayaKycSsneSwornStatementFragment) ((K8.G) nK1.c.get());
                        mayaKycSsneSwornStatementFragment4.getClass();
                        try {
                            Uri uri = mayaKycSsneSwornStatementFragment4.f12615Y;
                            if (uri != null) {
                                Context contextRequireContext = mayaKycSsneSwornStatementFragment4.requireContext();
                                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                                strG = E8.k.g(contextRequireContext, uri);
                            }
                            break;
                        } catch (Exception unused) {
                            strG = "";
                        }
                        nK1.e(new Kh.T(5, new Lh.d(new Lh.d(new Lh.h(nK1.e.v(new KycAdditionalDocsUploadRequest(AdditionalDocType.SSNE, strG == null ? "" : strG, null, 4, null)), zh.b.a(), 0), new J5.c(nK1, 15), 2), new V2.c(nK1, 14), 0), new A7.c((K8.G) nK1.c.get(), 14)).e());
                        return Unit.f18162a;
                }
            }
        });
        final int i4 = 1;
        Ke.b.b(((C0475q0) G1()).f, new Function0(this) { // from class: M8.j2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSsneSwornStatementFragment f3323b;

            {
                this.f3323b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strG = null;
                switch (i4) {
                    case 0:
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment = this.f3323b;
                        String string = ((C0475q0) mayaKycSsneSwornStatementFragment.G1()).f4184b.getText().toString();
                        String string2 = mayaKycSsneSwornStatementFragment.getString(R.string.maya_kyc_ssne_upload_documents_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        mayaKycSsneSwornStatementFragment.Q1(string, string2);
                        Set supportedMimeTypes = E8.j.f1284a;
                        kotlin.jvm.internal.j.g(supportedMimeTypes, "supportedMimeTypes");
                        ActivityResultLauncher activityResultLauncher = E8.f.f1282a;
                        if (activityResultLauncher != null) {
                            activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("filePickerLauncher");
                        throw null;
                    case 1:
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment2 = this.f3323b;
                        String string3 = mayaKycSsneSwornStatementFragment2.getString(R.string.maya_kyc_ssne_upload_documents_screen_label);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        mayaKycSsneSwornStatementFragment2.Q1("Delete", string3);
                        ((MayaKycSsneSwornStatementFragment) ((K8.G) mayaKycSsneSwornStatementFragment2.K1().c.get())).M1(false);
                        mayaKycSsneSwornStatementFragment2.f12615Y = null;
                        mayaKycSsneSwornStatementFragment2.K1().o();
                        return Unit.f18162a;
                    default:
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment3 = this.f3323b;
                        String string4 = ((C0475q0) mayaKycSsneSwornStatementFragment3.G1()).f4184b.getText().toString();
                        String string5 = mayaKycSsneSwornStatementFragment3.getString(R.string.maya_fragment_kyc_complete_personal_information_screen_label);
                        kotlin.jvm.internal.j.f(string5, "getString(...)");
                        mayaKycSsneSwornStatementFragment3.Q1(string4, string5);
                        D8.N nK1 = mayaKycSsneSwornStatementFragment3.K1();
                        ((MayaKycSsneSwornStatementFragment) ((K8.G) nK1.c.get())).E1();
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment4 = (MayaKycSsneSwornStatementFragment) ((K8.G) nK1.c.get());
                        mayaKycSsneSwornStatementFragment4.getClass();
                        try {
                            Uri uri = mayaKycSsneSwornStatementFragment4.f12615Y;
                            if (uri != null) {
                                Context contextRequireContext = mayaKycSsneSwornStatementFragment4.requireContext();
                                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                                strG = E8.k.g(contextRequireContext, uri);
                            }
                            break;
                        } catch (Exception unused) {
                            strG = "";
                        }
                        nK1.e(new Kh.T(5, new Lh.d(new Lh.d(new Lh.h(nK1.e.v(new KycAdditionalDocsUploadRequest(AdditionalDocType.SSNE, strG == null ? "" : strG, null, 4, null)), zh.b.a(), 0), new J5.c(nK1, 15), 2), new V2.c(nK1, 14), 0), new A7.c((K8.G) nK1.c.get(), 14)).e());
                        return Unit.f18162a;
                }
            }
        });
        final int i6 = 2;
        Ke.b.b(((C0475q0) G1()).c, new Function0(this) { // from class: M8.j2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSsneSwornStatementFragment f3323b;

            {
                this.f3323b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strG = null;
                switch (i6) {
                    case 0:
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment = this.f3323b;
                        String string = ((C0475q0) mayaKycSsneSwornStatementFragment.G1()).f4184b.getText().toString();
                        String string2 = mayaKycSsneSwornStatementFragment.getString(R.string.maya_kyc_ssne_upload_documents_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        mayaKycSsneSwornStatementFragment.Q1(string, string2);
                        Set supportedMimeTypes = E8.j.f1284a;
                        kotlin.jvm.internal.j.g(supportedMimeTypes, "supportedMimeTypes");
                        ActivityResultLauncher activityResultLauncher = E8.f.f1282a;
                        if (activityResultLauncher != null) {
                            activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("filePickerLauncher");
                        throw null;
                    case 1:
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment2 = this.f3323b;
                        String string3 = mayaKycSsneSwornStatementFragment2.getString(R.string.maya_kyc_ssne_upload_documents_screen_label);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        mayaKycSsneSwornStatementFragment2.Q1("Delete", string3);
                        ((MayaKycSsneSwornStatementFragment) ((K8.G) mayaKycSsneSwornStatementFragment2.K1().c.get())).M1(false);
                        mayaKycSsneSwornStatementFragment2.f12615Y = null;
                        mayaKycSsneSwornStatementFragment2.K1().o();
                        return Unit.f18162a;
                    default:
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment3 = this.f3323b;
                        String string4 = ((C0475q0) mayaKycSsneSwornStatementFragment3.G1()).f4184b.getText().toString();
                        String string5 = mayaKycSsneSwornStatementFragment3.getString(R.string.maya_fragment_kyc_complete_personal_information_screen_label);
                        kotlin.jvm.internal.j.f(string5, "getString(...)");
                        mayaKycSsneSwornStatementFragment3.Q1(string4, string5);
                        D8.N nK1 = mayaKycSsneSwornStatementFragment3.K1();
                        ((MayaKycSsneSwornStatementFragment) ((K8.G) nK1.c.get())).E1();
                        MayaKycSsneSwornStatementFragment mayaKycSsneSwornStatementFragment4 = (MayaKycSsneSwornStatementFragment) ((K8.G) nK1.c.get());
                        mayaKycSsneSwornStatementFragment4.getClass();
                        try {
                            Uri uri = mayaKycSsneSwornStatementFragment4.f12615Y;
                            if (uri != null) {
                                Context contextRequireContext = mayaKycSsneSwornStatementFragment4.requireContext();
                                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                                strG = E8.k.g(contextRequireContext, uri);
                            }
                            break;
                        } catch (Exception unused) {
                            strG = "";
                        }
                        nK1.e(new Kh.T(5, new Lh.d(new Lh.d(new Lh.h(nK1.e.v(new KycAdditionalDocsUploadRequest(AdditionalDocType.SSNE, strG == null ? "" : strG, null, 4, null)), zh.b.a(), 0), new J5.c(nK1, 15), 2), new V2.c(nK1, 14), 0), new A7.c((K8.G) nK1.c.get(), 14)).e());
                        return Unit.f18162a;
                }
            }
        });
        K1().j();
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.d
    public final void q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).q();
    }
}
