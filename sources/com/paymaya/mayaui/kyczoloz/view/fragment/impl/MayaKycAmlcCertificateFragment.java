package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import B8.b;
import D.N;
import D8.C0200h;
import E1.c;
import E8.f;
import G8.a;
import K8.InterfaceC0279d;
import M8.C0407t;
import M8.C0415v;
import M8.C0419w;
import M8.C0423x;
import M8.r;
import N5.U;
import Xh.i;
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
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
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
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import java.util.HashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import of.p;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import w.C2360b;
import w.C2361c;
import y5.AbstractC2509a;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycAmlcCertificateFragment extends MayaKycBaseFragment<U> implements InterfaceC0279d {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0200h f12471W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e0 f12472X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public a f12473Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final MayaEKYCSelectedDocument f12474Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f12475a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Uri f12476b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final N f12477c0;

    public MayaKycAmlcCertificateFragment() {
        super(C0407t.f3369a);
        this.f12474Z = new MayaEKYCSelectedDocument(new KycDocument(0, "AMLC", null, null, null, null, false, false, null, C1112C.f9377a, TypedValues.AttributesType.TYPE_PATH_ROTATE, null), new KycCaptureGuide(null, null, null, null, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null), null, 0, 12, null);
        this.f12477c0 = new N(this, 4);
    }

    public static void P1(C1219h c1219h, EnumC1212a enumC1212a, String str) {
        if (str.length() > 0) {
            c1219h.j.put(enumC1212a.f10691a, str);
        }
    }

    public final b K1() {
        C0200h c0200h = this.f12471W;
        if (c0200h != null) {
            return c0200h;
        }
        j.n("mAmlcCertificateFragmentPresenter");
        throw null;
    }

    public final void L1(boolean z4) {
        ((U) G1()).e.setVisibility(!z4 ? 0 : 8);
        ((U) G1()).f3940d.setVisibility(z4 ? 0 : 8);
    }

    public final void M1(String field, String errorMessage, String str) {
        Object objA;
        j.g(field, "field");
        j.g(errorMessage, "errorMessage");
        Object selectedData = ((U) G1()).f3941g.getSelectedData();
        if (!(selectedData instanceof KycSelectionItem)) {
            selectedData = null;
        }
        KycSelectionItem kycSelectionItem = (KycSelectionItem) selectedData;
        String text = kycSelectionItem != null ? kycSelectionItem.getText() : null;
        if (text == null) {
            text = "";
        }
        String value = ((U) G1()).h.getText();
        j.g(value, "value");
        try {
            C1037h.a aVar = C1037h.f9166b;
            LocalDateTime localDateTime = DateTimeFormat.forPattern("MM/dd/yyyy").parseLocalDateTime(value);
            objA = localDateTime != null ? localDateTime.toString("yyyy-MM-dd") : null;
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        String str2 = (String) (objA instanceof C1038i ? null : objA);
        String str3 = str2 != null ? str2 : "";
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.AMLC_UPLOAD);
        c1219hD.n(37);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_kyc_amlc_certificate_screen_label);
        HashMap map = c1219hD.j;
        map.put("page_name", string);
        map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, errorMessage);
        map.put("path", "TOFU 1.0");
        map.put("kyc_status", t1().l());
        c1219hD.i();
        P1(c1219hD, EnumC1212a.CERTIFICATE_TYPE, text);
        P1(c1219hD, EnumC1212a.CERTIFICATE_EXPIRY_DATE, str3);
        P1(c1219hD, EnumC1212a.FIELD, field);
        P1(c1219hD, EnumC1212a.MODAL, str);
        o1().c(getActivity(), c1219hD);
    }

    public final void N1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
    }

    public final void O1(int i, H8.b bVar) {
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.AMLC_SUBMIT);
        c1219hD.n(37);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_kyc_amlc_certificate_screen_label);
        HashMap map = c1219hD.j;
        map.put("page_name", string);
        map.put("modal", "AMLC Certificate Submit Error");
        map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Network Error");
        map.put("path", "TOFU 1.0");
        map.put("kyc_status", t1().l());
        o1().c(getActivity(), c1219hD);
        ConstraintLayout constraintLayout = ((U) G1()).f3938a;
        j.f(constraintLayout, "getRoot(...)");
        c.m(ViewKt.findNavController(constraintLayout), new C0423x(((MayaKycActivity) bVar).s().toString(), i));
    }

    public final void Q1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        String string = getString(R.string.maya_kyc_amlc_checkpoint_certificate_error_file_too_large);
        j.f(string, "getString(...)");
        ((MayaKycActivity) ((H8.b) componentRequireActivity)).u2(string);
        M1(((U) G1()).f3939b.getText().toString(), string, "AMLC Certificate Upload Error");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.AMLC_UPLOAD;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        e eVarY = aVar.y();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12471W = new C0200h(eVarY, preference);
        this.f12472X = (e0) aVar.f4685S.get();
        ((AbstractC2509a) K1()).h(this);
        f.f1283b = new r(this, 1);
        registerForActivityResult(new ActivityResultContracts.RequestPermission(), new A7.c(this, 17));
        f.f1282a = registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new C2.f(2));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) K1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12477c0.remove();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.AMLC_UPLOAD);
        c1219hD.n(4);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_kyc_amlc_page_name_label);
        HashMap map = c1219hD.j;
        map.put("source_page", string);
        map.put("page_name", getString(R.string.maya_kyc_amlc_certificate_screen_label));
        map.put("path", "TOFU 1.0");
        map.put("kyc_status", t1().l());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12477c0);
        Object objRequireActivity = requireActivity();
        j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        Object obj = (H8.b) objRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) obj;
        mayaKycActivity.t2();
        e0 e0Var = this.f12472X;
        if (e0Var == null) {
            j.n("resourceManager");
            throw null;
        }
        mayaKycActivity.r2(ContextCompat.getColor(e0Var.f10905a, R.color.ghost_white));
        e0 e0Var2 = this.f12472X;
        if (e0Var2 == null) {
            j.n("resourceManager");
            throw null;
        }
        ((q) obj).N1(ContextCompat.getColor(e0Var2.f10905a, R.color.ghost_white));
        mayaKycActivity.p2(new Ba.a(this, 28));
        mayaKycActivity.t1();
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f12473Y = new a(contextRequireContext, new C0415v(2, this, MayaKycAmlcCertificateFragment.class, "logAmlcErrorAppearedEvent", "logAmlcErrorAppearedEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 0), new Ag.f(1, this, MayaKycAmlcCertificateFragment.class, "logEditTextTappedAnalyticsEvent", "logEditTextTappedAnalyticsEvent(Lcom/paymaya/domain/model/KycFieldType;)V", 0, 28));
        KycMayaDropDown kycMayaDropDown = ((U) G1()).f3941g;
        KycFieldType kycFieldType = KycFieldType.AMLC_CERT_TYPE;
        p.w(kycMayaDropDown, kycFieldType, new r(this, 0));
        KycMayaDropDown kycMayaDropDown2 = ((U) G1()).f3941g;
        a aVar = this.f12473Y;
        if (aVar == null) {
            j.n("errorLabelProvider");
            throw null;
        }
        p.D(kycMayaDropDown2, kycFieldType, aVar, new I6.e(2, K1(), b.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 2), new r(this, 2));
        KycMayaInputLayout kycMayaInputLayout = ((U) G1()).h;
        KycFieldType kycFieldType2 = KycFieldType.AMLC_CERT_EXPIRY_DATE;
        a aVar2 = this.f12473Y;
        if (aVar2 == null) {
            j.n("errorLabelProvider");
            throw null;
        }
        F8.f.b(aVar2, kycFieldType2, kycMayaInputLayout, new r(this, 3), new I6.e(2, K1(), b.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 3));
        F8.f.a(((U) G1()).h, kycFieldType2);
        final int i = 0;
        Ke.b.b(((U) G1()).c, new Function0(this) { // from class: M8.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAmlcCertificateFragment f3364b;

            {
                this.f3364b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strG;
                Object objA;
                Object objA2;
                switch (i) {
                    case 0:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = this.f3364b;
                        C0200h c0200h = (C0200h) mayaKycAmlcCertificateFragment.K1();
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).E1();
                        String str = ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).f12475a0;
                        if (str == null) {
                            str = "";
                        }
                        AdditionalDocType additionalDocType = AdditionalDocType.AMLC_COR;
                        if (!str.equals(additionalDocType.getType())) {
                            AdditionalDocType additionalDocType2 = AdditionalDocType.AMLC_PCOR;
                            if (str.equals(additionalDocType2.getType())) {
                                additionalDocType = additionalDocType2;
                            }
                        }
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment2 = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get());
                        mayaKycAmlcCertificateFragment2.getClass();
                        try {
                            Uri uri = mayaKycAmlcCertificateFragment2.f12476b0;
                            if (uri != null) {
                                Context contextRequireContext2 = mayaKycAmlcCertificateFragment2.requireContext();
                                kotlin.jvm.internal.j.f(contextRequireContext2, "requireContext(...)");
                                strG = E8.k.g(contextRequireContext2, uri);
                            } else {
                                strG = null;
                            }
                            break;
                        } catch (Exception unused) {
                            strG = "";
                        }
                        String str2 = strG == null ? "" : strG;
                        String value = ((N5.U) ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).G1()).h.getText();
                        kotlin.jvm.internal.j.g(value, "value");
                        try {
                            C1037h.a aVar3 = C1037h.f9166b;
                            LocalDateTime localDateTime = DateTimeFormat.forPattern("MM/dd/yyyy").parseLocalDateTime(value);
                            objA = localDateTime != null ? localDateTime.toString("yyyy-MM-dd") : null;
                            break;
                        } catch (Throwable th2) {
                            C1037h.a aVar4 = C1037h.f9166b;
                            objA = AbstractC1039j.a(th2);
                        }
                        String str3 = (String) (objA instanceof C1038i ? null : objA);
                        c0200h.e(new Kh.T(5, new Lh.d(new Lh.d(new Lh.h(c0200h.e.v(new KycAdditionalDocsUploadRequest(additionalDocType, str2, str3 != null ? str3 : "")), zh.b.a(), 0), new C2360b(c0200h, 12), 2), new C2361c(c0200h, 12), 0), new A7.c((InterfaceC0279d) c0200h.c.get(), 11)).e());
                        String string = ((N5.U) mayaKycAmlcCertificateFragment.G1()).c.getText().toString();
                        String string2 = mayaKycAmlcCertificateFragment.getString(R.string.maya_fragment_kyc_complete_personal_information_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment, string, string2, null, null, null, 28);
                        return Unit.f18162a;
                    case 1:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment3 = this.f3364b;
                        String string3 = ((N5.U) mayaKycAmlcCertificateFragment3.G1()).f3939b.getText().toString();
                        String string4 = mayaKycAmlcCertificateFragment3.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment3, string3, string4, "Add", null, null, 24);
                        Set supportedMimeTypes = E8.j.f1284a;
                        kotlin.jvm.internal.j.g(supportedMimeTypes, "supportedMimeTypes");
                        ActivityResultLauncher activityResultLauncher = E8.f.f1282a;
                        if (activityResultLauncher != null) {
                            activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("filePickerLauncher");
                        throw null;
                    case 2:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment4 = this.f3364b;
                        String string5 = mayaKycAmlcCertificateFragment4.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string5, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment4, "Delete", string5, "Delete", null, null, 24);
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) ((C0200h) mayaKycAmlcCertificateFragment4.K1()).c.get())).L1(false);
                        mayaKycAmlcCertificateFragment4.f12476b0 = null;
                        ((C0200h) mayaKycAmlcCertificateFragment4.K1()).o();
                        return Unit.f18162a;
                    default:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment5 = this.f3364b;
                        String labelText = ((N5.U) mayaKycAmlcCertificateFragment5.G1()).h.getLabelText();
                        if (labelText == null) {
                            labelText = "";
                        }
                        try {
                            C1037h.a aVar5 = C1037h.f9166b;
                            LocalDateTime localDateTime2 = DateTimeFormat.forPattern("MM/dd/yyyy").parseLocalDateTime(labelText);
                            objA2 = localDateTime2 != null ? localDateTime2.toString("yyyy-MM-dd") : null;
                            break;
                        } catch (Throwable th3) {
                            C1037h.a aVar6 = C1037h.f9166b;
                            objA2 = AbstractC1039j.a(th3);
                        }
                        String str4 = (String) (objA2 instanceof C1038i ? null : objA2);
                        S1.s.m(mayaKycAmlcCertificateFragment5, "", null, null, null, str4 == null ? "" : str4, 14);
                        return Unit.f18162a;
                }
            }
        });
        final int i4 = 1;
        Ke.b.b(((U) G1()).f3939b, new Function0(this) { // from class: M8.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAmlcCertificateFragment f3364b;

            {
                this.f3364b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strG;
                Object objA;
                Object objA2;
                switch (i4) {
                    case 0:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = this.f3364b;
                        C0200h c0200h = (C0200h) mayaKycAmlcCertificateFragment.K1();
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).E1();
                        String str = ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).f12475a0;
                        if (str == null) {
                            str = "";
                        }
                        AdditionalDocType additionalDocType = AdditionalDocType.AMLC_COR;
                        if (!str.equals(additionalDocType.getType())) {
                            AdditionalDocType additionalDocType2 = AdditionalDocType.AMLC_PCOR;
                            if (str.equals(additionalDocType2.getType())) {
                                additionalDocType = additionalDocType2;
                            }
                        }
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment2 = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get());
                        mayaKycAmlcCertificateFragment2.getClass();
                        try {
                            Uri uri = mayaKycAmlcCertificateFragment2.f12476b0;
                            if (uri != null) {
                                Context contextRequireContext2 = mayaKycAmlcCertificateFragment2.requireContext();
                                kotlin.jvm.internal.j.f(contextRequireContext2, "requireContext(...)");
                                strG = E8.k.g(contextRequireContext2, uri);
                            } else {
                                strG = null;
                            }
                            break;
                        } catch (Exception unused) {
                            strG = "";
                        }
                        String str2 = strG == null ? "" : strG;
                        String value = ((N5.U) ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).G1()).h.getText();
                        kotlin.jvm.internal.j.g(value, "value");
                        try {
                            C1037h.a aVar3 = C1037h.f9166b;
                            LocalDateTime localDateTime = DateTimeFormat.forPattern("MM/dd/yyyy").parseLocalDateTime(value);
                            objA = localDateTime != null ? localDateTime.toString("yyyy-MM-dd") : null;
                            break;
                        } catch (Throwable th2) {
                            C1037h.a aVar4 = C1037h.f9166b;
                            objA = AbstractC1039j.a(th2);
                        }
                        String str3 = (String) (objA instanceof C1038i ? null : objA);
                        c0200h.e(new Kh.T(5, new Lh.d(new Lh.d(new Lh.h(c0200h.e.v(new KycAdditionalDocsUploadRequest(additionalDocType, str2, str3 != null ? str3 : "")), zh.b.a(), 0), new C2360b(c0200h, 12), 2), new C2361c(c0200h, 12), 0), new A7.c((InterfaceC0279d) c0200h.c.get(), 11)).e());
                        String string = ((N5.U) mayaKycAmlcCertificateFragment.G1()).c.getText().toString();
                        String string2 = mayaKycAmlcCertificateFragment.getString(R.string.maya_fragment_kyc_complete_personal_information_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment, string, string2, null, null, null, 28);
                        return Unit.f18162a;
                    case 1:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment3 = this.f3364b;
                        String string3 = ((N5.U) mayaKycAmlcCertificateFragment3.G1()).f3939b.getText().toString();
                        String string4 = mayaKycAmlcCertificateFragment3.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment3, string3, string4, "Add", null, null, 24);
                        Set supportedMimeTypes = E8.j.f1284a;
                        kotlin.jvm.internal.j.g(supportedMimeTypes, "supportedMimeTypes");
                        ActivityResultLauncher activityResultLauncher = E8.f.f1282a;
                        if (activityResultLauncher != null) {
                            activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("filePickerLauncher");
                        throw null;
                    case 2:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment4 = this.f3364b;
                        String string5 = mayaKycAmlcCertificateFragment4.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string5, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment4, "Delete", string5, "Delete", null, null, 24);
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) ((C0200h) mayaKycAmlcCertificateFragment4.K1()).c.get())).L1(false);
                        mayaKycAmlcCertificateFragment4.f12476b0 = null;
                        ((C0200h) mayaKycAmlcCertificateFragment4.K1()).o();
                        return Unit.f18162a;
                    default:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment5 = this.f3364b;
                        String labelText = ((N5.U) mayaKycAmlcCertificateFragment5.G1()).h.getLabelText();
                        if (labelText == null) {
                            labelText = "";
                        }
                        try {
                            C1037h.a aVar5 = C1037h.f9166b;
                            LocalDateTime localDateTime2 = DateTimeFormat.forPattern("MM/dd/yyyy").parseLocalDateTime(labelText);
                            objA2 = localDateTime2 != null ? localDateTime2.toString("yyyy-MM-dd") : null;
                            break;
                        } catch (Throwable th3) {
                            C1037h.a aVar6 = C1037h.f9166b;
                            objA2 = AbstractC1039j.a(th3);
                        }
                        String str4 = (String) (objA2 instanceof C1038i ? null : objA2);
                        S1.s.m(mayaKycAmlcCertificateFragment5, "", null, null, null, str4 == null ? "" : str4, 14);
                        return Unit.f18162a;
                }
            }
        });
        final int i6 = 2;
        Ke.b.b(((U) G1()).f, new Function0(this) { // from class: M8.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAmlcCertificateFragment f3364b;

            {
                this.f3364b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strG;
                Object objA;
                Object objA2;
                switch (i6) {
                    case 0:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = this.f3364b;
                        C0200h c0200h = (C0200h) mayaKycAmlcCertificateFragment.K1();
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).E1();
                        String str = ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).f12475a0;
                        if (str == null) {
                            str = "";
                        }
                        AdditionalDocType additionalDocType = AdditionalDocType.AMLC_COR;
                        if (!str.equals(additionalDocType.getType())) {
                            AdditionalDocType additionalDocType2 = AdditionalDocType.AMLC_PCOR;
                            if (str.equals(additionalDocType2.getType())) {
                                additionalDocType = additionalDocType2;
                            }
                        }
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment2 = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get());
                        mayaKycAmlcCertificateFragment2.getClass();
                        try {
                            Uri uri = mayaKycAmlcCertificateFragment2.f12476b0;
                            if (uri != null) {
                                Context contextRequireContext2 = mayaKycAmlcCertificateFragment2.requireContext();
                                kotlin.jvm.internal.j.f(contextRequireContext2, "requireContext(...)");
                                strG = E8.k.g(contextRequireContext2, uri);
                            } else {
                                strG = null;
                            }
                            break;
                        } catch (Exception unused) {
                            strG = "";
                        }
                        String str2 = strG == null ? "" : strG;
                        String value = ((N5.U) ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).G1()).h.getText();
                        kotlin.jvm.internal.j.g(value, "value");
                        try {
                            C1037h.a aVar3 = C1037h.f9166b;
                            LocalDateTime localDateTime = DateTimeFormat.forPattern("MM/dd/yyyy").parseLocalDateTime(value);
                            objA = localDateTime != null ? localDateTime.toString("yyyy-MM-dd") : null;
                            break;
                        } catch (Throwable th2) {
                            C1037h.a aVar4 = C1037h.f9166b;
                            objA = AbstractC1039j.a(th2);
                        }
                        String str3 = (String) (objA instanceof C1038i ? null : objA);
                        c0200h.e(new Kh.T(5, new Lh.d(new Lh.d(new Lh.h(c0200h.e.v(new KycAdditionalDocsUploadRequest(additionalDocType, str2, str3 != null ? str3 : "")), zh.b.a(), 0), new C2360b(c0200h, 12), 2), new C2361c(c0200h, 12), 0), new A7.c((InterfaceC0279d) c0200h.c.get(), 11)).e());
                        String string = ((N5.U) mayaKycAmlcCertificateFragment.G1()).c.getText().toString();
                        String string2 = mayaKycAmlcCertificateFragment.getString(R.string.maya_fragment_kyc_complete_personal_information_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment, string, string2, null, null, null, 28);
                        return Unit.f18162a;
                    case 1:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment3 = this.f3364b;
                        String string3 = ((N5.U) mayaKycAmlcCertificateFragment3.G1()).f3939b.getText().toString();
                        String string4 = mayaKycAmlcCertificateFragment3.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment3, string3, string4, "Add", null, null, 24);
                        Set supportedMimeTypes = E8.j.f1284a;
                        kotlin.jvm.internal.j.g(supportedMimeTypes, "supportedMimeTypes");
                        ActivityResultLauncher activityResultLauncher = E8.f.f1282a;
                        if (activityResultLauncher != null) {
                            activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("filePickerLauncher");
                        throw null;
                    case 2:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment4 = this.f3364b;
                        String string5 = mayaKycAmlcCertificateFragment4.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string5, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment4, "Delete", string5, "Delete", null, null, 24);
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) ((C0200h) mayaKycAmlcCertificateFragment4.K1()).c.get())).L1(false);
                        mayaKycAmlcCertificateFragment4.f12476b0 = null;
                        ((C0200h) mayaKycAmlcCertificateFragment4.K1()).o();
                        return Unit.f18162a;
                    default:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment5 = this.f3364b;
                        String labelText = ((N5.U) mayaKycAmlcCertificateFragment5.G1()).h.getLabelText();
                        if (labelText == null) {
                            labelText = "";
                        }
                        try {
                            C1037h.a aVar5 = C1037h.f9166b;
                            LocalDateTime localDateTime2 = DateTimeFormat.forPattern("MM/dd/yyyy").parseLocalDateTime(labelText);
                            objA2 = localDateTime2 != null ? localDateTime2.toString("yyyy-MM-dd") : null;
                            break;
                        } catch (Throwable th3) {
                            C1037h.a aVar6 = C1037h.f9166b;
                            objA2 = AbstractC1039j.a(th3);
                        }
                        String str4 = (String) (objA2 instanceof C1038i ? null : objA2);
                        S1.s.m(mayaKycAmlcCertificateFragment5, "", null, null, null, str4 == null ? "" : str4, 14);
                        return Unit.f18162a;
                }
            }
        });
        final int i10 = 3;
        Ke.b.b(((U) G1()).h, new Function0(this) { // from class: M8.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAmlcCertificateFragment f3364b;

            {
                this.f3364b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strG;
                Object objA;
                Object objA2;
                switch (i10) {
                    case 0:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = this.f3364b;
                        C0200h c0200h = (C0200h) mayaKycAmlcCertificateFragment.K1();
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).E1();
                        String str = ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).f12475a0;
                        if (str == null) {
                            str = "";
                        }
                        AdditionalDocType additionalDocType = AdditionalDocType.AMLC_COR;
                        if (!str.equals(additionalDocType.getType())) {
                            AdditionalDocType additionalDocType2 = AdditionalDocType.AMLC_PCOR;
                            if (str.equals(additionalDocType2.getType())) {
                                additionalDocType = additionalDocType2;
                            }
                        }
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment2 = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get());
                        mayaKycAmlcCertificateFragment2.getClass();
                        try {
                            Uri uri = mayaKycAmlcCertificateFragment2.f12476b0;
                            if (uri != null) {
                                Context contextRequireContext2 = mayaKycAmlcCertificateFragment2.requireContext();
                                kotlin.jvm.internal.j.f(contextRequireContext2, "requireContext(...)");
                                strG = E8.k.g(contextRequireContext2, uri);
                            } else {
                                strG = null;
                            }
                            break;
                        } catch (Exception unused) {
                            strG = "";
                        }
                        String str2 = strG == null ? "" : strG;
                        String value = ((N5.U) ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).G1()).h.getText();
                        kotlin.jvm.internal.j.g(value, "value");
                        try {
                            C1037h.a aVar3 = C1037h.f9166b;
                            LocalDateTime localDateTime = DateTimeFormat.forPattern("MM/dd/yyyy").parseLocalDateTime(value);
                            objA = localDateTime != null ? localDateTime.toString("yyyy-MM-dd") : null;
                            break;
                        } catch (Throwable th2) {
                            C1037h.a aVar4 = C1037h.f9166b;
                            objA = AbstractC1039j.a(th2);
                        }
                        String str3 = (String) (objA instanceof C1038i ? null : objA);
                        c0200h.e(new Kh.T(5, new Lh.d(new Lh.d(new Lh.h(c0200h.e.v(new KycAdditionalDocsUploadRequest(additionalDocType, str2, str3 != null ? str3 : "")), zh.b.a(), 0), new C2360b(c0200h, 12), 2), new C2361c(c0200h, 12), 0), new A7.c((InterfaceC0279d) c0200h.c.get(), 11)).e());
                        String string = ((N5.U) mayaKycAmlcCertificateFragment.G1()).c.getText().toString();
                        String string2 = mayaKycAmlcCertificateFragment.getString(R.string.maya_fragment_kyc_complete_personal_information_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment, string, string2, null, null, null, 28);
                        return Unit.f18162a;
                    case 1:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment3 = this.f3364b;
                        String string3 = ((N5.U) mayaKycAmlcCertificateFragment3.G1()).f3939b.getText().toString();
                        String string4 = mayaKycAmlcCertificateFragment3.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment3, string3, string4, "Add", null, null, 24);
                        Set supportedMimeTypes = E8.j.f1284a;
                        kotlin.jvm.internal.j.g(supportedMimeTypes, "supportedMimeTypes");
                        ActivityResultLauncher activityResultLauncher = E8.f.f1282a;
                        if (activityResultLauncher != null) {
                            activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("filePickerLauncher");
                        throw null;
                    case 2:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment4 = this.f3364b;
                        String string5 = mayaKycAmlcCertificateFragment4.getString(R.string.maya_kyc_amlc_certificate_screen_label);
                        kotlin.jvm.internal.j.f(string5, "getString(...)");
                        S1.s.m(mayaKycAmlcCertificateFragment4, "Delete", string5, "Delete", null, null, 24);
                        ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) ((C0200h) mayaKycAmlcCertificateFragment4.K1()).c.get())).L1(false);
                        mayaKycAmlcCertificateFragment4.f12476b0 = null;
                        ((C0200h) mayaKycAmlcCertificateFragment4.K1()).o();
                        return Unit.f18162a;
                    default:
                        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment5 = this.f3364b;
                        String labelText = ((N5.U) mayaKycAmlcCertificateFragment5.G1()).h.getLabelText();
                        if (labelText == null) {
                            labelText = "";
                        }
                        try {
                            C1037h.a aVar5 = C1037h.f9166b;
                            LocalDateTime localDateTime2 = DateTimeFormat.forPattern("MM/dd/yyyy").parseLocalDateTime(labelText);
                            objA2 = localDateTime2 != null ? localDateTime2.toString("yyyy-MM-dd") : null;
                            break;
                        } catch (Throwable th3) {
                            C1037h.a aVar6 = C1037h.f9166b;
                            objA2 = AbstractC1039j.a(th3);
                        }
                        String str4 = (String) (objA2 instanceof C1038i ? null : objA2);
                        S1.s.m(mayaKycAmlcCertificateFragment5, "", null, null, null, str4 == null ? "" : str4, 14);
                        return Unit.f18162a;
                }
            }
        });
        i.E(this, z.a(MayaKycSingleSelectionBottomSheetDialogFragment.class), new C0419w(1, this, MayaKycAmlcCertificateFragment.class, "handleCertificateTypeSelectionResult", "handleCertificateTypeSelectionResult(Lcom/paymaya/domain/model/KycSelectionItem;)V", 0, 0));
        ((C0200h) K1()).j();
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.d
    public final void q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((H8.b) componentRequireActivity)).q();
    }
}
