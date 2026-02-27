package M8;

import N5.C0447e;
import N5.C0469n0;
import N5.C0471o0;
import N5.C0473p0;
import N5.C0484v0;
import N5.C0488x0;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.Base64;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.ViewKt;
import cj.C1110A;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.KycCaptureGuide;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycDnfbpGuide;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.KycDocumentTypeGuide;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycIncomeSource;
import com.paymaya.domain.model.KycJobTitle;
import com.paymaya.domain.model.KycJobTitles;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.KycSelectionModel;
import com.paymaya.domain.model.KycWorkNature;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV2Fragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV3Fragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSingleSelectionBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneUploadDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitIdFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitSecondaryIdFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycTakeVideoSelfieFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycVerifyWithPhilsysFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import com.paymaya.mayaui.referral.view.activity.impl.MayaReferralV2Activity;
import com.paymaya.mayaui.regv2.view.bottomsheet.impl.MayaProminentDisclosureBottomSheetDialogFragment;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ph.C2070f1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class M1 extends kotlin.jvm.internal.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3198a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M1(int i, Object obj, Class cls, String str, String str2, int i4, int i6) {
        super(obj, str, i, str2, i4, cls);
        this.f3198a = i6;
    }

    private final Object a(Object obj) {
        T.b bVar = (T.b) this.receiver;
        bVar.getClass();
        return (byte[]) bVar.b(new Pair((String) obj, Q.a.c), V.g.f6023d);
    }

    private final Object b(Object obj) {
        c0.f p02 = (c0.f) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        ((T.b) this.receiver).getClass();
        if (T.a.f5741a[p02.f9192b.ordinal()] != 1) {
            return null;
        }
        byte[] bArr = p02.f9193d;
        kotlin.jvm.internal.j.d(bArr);
        return new Pair(bArr, bArr);
    }

    private final Object d(Object obj) {
        T.b bVar = (T.b) this.receiver;
        bVar.getClass();
        return (byte[]) bVar.b(new Pair((String) obj, Q.a.f5195b), V.g.f6023d);
    }

    private final Object e(Object obj) {
        c0.f p02 = (c0.f) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        ((T.b) this.receiver).getClass();
        if (T.a.f5741a[p02.f9192b.ordinal()] != 1) {
            return null;
        }
        byte[] bArr = p02.f9193d;
        kotlin.jvm.internal.j.d(bArr);
        return new Pair(bArr, bArr);
    }

    private final Object f(Object obj) {
        pg.t p02 = (pg.t) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        Ra.a aVar = (Ra.a) this.receiver;
        aVar.getClass();
        AbstractC1331a.t("access_token", aVar.f5472d.b(), p02);
        return Unit.f18162a;
    }

    private final Object g(Object obj) {
        pg.t p02 = (pg.t) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        Ra.a aVar = (Ra.a) this.receiver;
        aVar.getClass();
        AbstractC1331a.t("session_token", aVar.f5472d.s(), p02);
        return Unit.f18162a;
    }

    private final Object h(Object obj) {
        String p02 = (String) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        Ra.a aVar = (Ra.a) this.receiver;
        aVar.getClass();
        try {
            com.google.gson.q qVarG = T2.x(p02).g();
            String strJ = qVarG.m("event_name").j();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            com.google.gson.o oVarM = qVarG.m("attributes");
            if (oVarM != null && !(oVarM instanceof com.google.gson.p)) {
                Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                while (((com.google.gson.internal.h) it).hasNext()) {
                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                    linkedHashMap.put(jVarB.getKey(), ((com.google.gson.o) jVarB.getValue()).j());
                }
            }
            linkedHashMap.toString();
            yk.a.a();
            Sa.a aVar2 = (Sa.a) aVar.c.get();
            kotlin.jvm.internal.j.d(strJ);
            ((MayaReferralV2Activity) aVar2).W1(strJ, linkedHashMap);
        } catch (Exception e) {
            ">>>> Unable to parse passed analytics event arguments: ".concat(p02);
            yk.a.d();
            e.printStackTrace();
        }
        return Unit.f18162a;
    }

    private final Object i(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MayaReferralV2Activity mayaReferralV2Activity = (MayaReferralV2Activity) this.receiver;
        int i = MayaReferralV2Activity.f13660p;
        if (zBooleanValue) {
            mayaReferralV2Activity.setResult(-1);
        }
        mayaReferralV2Activity.finish();
        return Unit.f18162a;
    }

    private final Object j(Object obj) {
        pg.t p02 = (pg.t) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        MayaReferralV2Activity mayaReferralV2Activity = (MayaReferralV2Activity) this.receiver;
        int i = MayaReferralV2Activity.f13660p;
        mayaReferralV2Activity.getClass();
        p02.success(Boolean.TRUE);
        mayaReferralV2Activity.n1().a();
        return Unit.f18162a;
    }

    private final Object k(Object obj) {
        pg.t p02 = (pg.t) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        Ra.a aVar = (Ra.a) this.receiver;
        aVar.getClass();
        AbstractC1331a.t("min", aVar.f5472d.r(), p02);
        return Unit.f18162a;
    }

    private final Object l(Object obj) {
        ActivityResult p02 = (ActivityResult) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) this.receiver;
        mayaSessionExpiredFragment.getClass();
        if (p02.getResultCode() == 1001) {
            C1220i c1220iO1 = mayaSessionExpiredFragment.o1();
            C1219h c1219hE = C1219h.e("SESSION_TIMEOUT_HELP_CENTER_EXITED");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("page_name", "Help center");
            map.put("destination_page", "Session Timeout");
            c1219hE.i();
            c1220iO1.b(c1219hE);
        }
        return Unit.f18162a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap bitmapDecodeByteArray;
        KycDocument kycDocument;
        KycCaptureGuide kycCaptureGuide;
        List<KycCaptureGuide> captureGuides;
        Object next;
        Object next2;
        Object next3;
        int iIntValue;
        Object next4;
        Object next5;
        List<KycJobTitles> jobTitles;
        Integer id;
        int iIntValue2;
        Object next6;
        int iIntValue3;
        byte[] byteArray = null;
        Object obj2 = null;
        byteArray = null;
        switch (this.f3198a) {
            case 0:
                byte[] p02 = (byte[]) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                D8.J j = (D8.J) this.receiver;
                j.getClass();
                if (j.g()) {
                    boolean zIsShortenedFlowIdCaptureV2Enabled = j.e.e().isShortenedFlowIdCaptureV2Enabled();
                    E8.k kVar = E8.k.f1285a;
                    if (zIsShortenedFlowIdCaptureV2Enabled) {
                        E8.k.f1286b = j.e.e().isShortenedFlowIdCaptureV21080pEnabled();
                        MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment = (MayaKycSimpleCaptureFragment) ((K8.C) j.c.get());
                        mayaKycSimpleCaptureFragment.getClass();
                        int width = ((SurfaceView) ((C0469n0) mayaKycSimpleCaptureFragment.G1()).f4163b.j).getWidth();
                        int height = ((View) ((C0469n0) mayaKycSimpleCaptureFragment.G1()).f4163b.f4134k).getHeight();
                        int top = ((View) ((C0469n0) mayaKycSimpleCaptureFragment.G1()).f4163b.f4134k).getTop();
                        if (p02.length != 0 && (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(p02, 0, p02.length)) != null) {
                            Matrix matrix = new Matrix();
                            matrix.postRotate(90.0f);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                            kotlin.jvm.internal.j.f(bitmapCreateBitmap, "createBitmap(...)");
                            if (!E8.k.f1286b) {
                                bitmapCreateBitmap = E8.k.j(kVar, bitmapCreateBitmap);
                            }
                            float width2 = bitmapCreateBitmap.getWidth() / width;
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, sj.b.b((top - 40) * width2), bitmapCreateBitmap.getWidth(), sj.b.b((80 + height) * width2));
                            kotlin.jvm.internal.j.f(bitmapCreateBitmap2, "createBitmap(...)");
                            bitmapCreateBitmap.recycle();
                            byteArray = new byte[0];
                            Iterator it = C1110A.V(kotlin.ranges.d.e(kotlin.ranges.d.d(100, 10), 10)).iterator();
                            while (it.hasNext()) {
                                int iIntValue4 = ((Number) it.next()).intValue();
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, iIntValue4, byteArrayOutputStream);
                                byteArray = byteArrayOutputStream.toByteArray();
                                kotlin.jvm.internal.j.f(byteArray, "toByteArray(...)");
                                String strEncodeToString = Base64.encodeToString(byteArray, 0);
                                kotlin.jvm.internal.j.f(strEncodeToString, "encodeToString(...)");
                                if (zj.z.l(strEncodeToString).length < 1048576) {
                                }
                            }
                        }
                        if (mayaKycSimpleCaptureFragment.N1() != null && byteArray != null) {
                            File cacheDir = mayaKycSimpleCaptureFragment.requireContext().getCacheDir();
                            kotlin.jvm.internal.j.f(cacheDir, "getCacheDir(...)");
                            E8.k.e(cacheDir, mayaKycSimpleCaptureFragment.N1(), byteArray);
                        }
                    } else {
                        MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment2 = (MayaKycSimpleCaptureFragment) ((K8.C) j.c.get());
                        mayaKycSimpleCaptureFragment2.getClass();
                        byte[] bArrB = E8.k.b(p02, 1048576, true);
                        if (mayaKycSimpleCaptureFragment2.N1() != null && bArrB != null) {
                            File cacheDir2 = mayaKycSimpleCaptureFragment2.requireContext().getCacheDir();
                            kotlin.jvm.internal.j.f(cacheDir2, "getCacheDir(...)");
                            E8.k.e(cacheDir2, mayaKycSimpleCaptureFragment2.N1(), bArrB);
                        }
                    }
                    MayaKycSimpleCaptureFragment mayaKycSimpleCaptureFragment3 = (MayaKycSimpleCaptureFragment) ((K8.C) j.c.get());
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocumentN1 = mayaKycSimpleCaptureFragment3.N1();
                    if (mayaEKYCSelectedDocumentN1 != null) {
                        String strK1 = mayaKycSimpleCaptureFragment3.K1();
                        Bundle arguments = mayaKycSimpleCaptureFragment3.getArguments();
                        P1 p1 = new P1(strK1, mayaEKYCSelectedDocumentN1, arguments != null ? arguments.getBoolean("isSelectedFromSecondaryIdScreen", false) : false);
                        FrameLayout frameLayout = ((C0469n0) mayaKycSimpleCaptureFragment3.G1()).f4162a;
                        kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
                        Navigation.findNavController(frameLayout).navigate(p1);
                    }
                }
                return Unit.f18162a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                D8.K k8 = (D8.K) this.receiver;
                if (zBooleanValue) {
                    Bundle arguments2 = ((MayaKycSimpleCaptureV2Fragment) ((K8.D) k8.c.get())).getArguments();
                    if (arguments2 != null ? arguments2.getBoolean("isSelectedFromSecondaryIdScreen", false) : false) {
                        FrameLayout frameLayout2 = ((C0471o0) ((MayaKycSimpleCaptureV2Fragment) ((K8.D) k8.c.get())).G1()).f4168a;
                        kotlin.jvm.internal.j.f(frameLayout2, "getRoot(...)");
                        Navigation.findNavController(frameLayout2).popBackStack(R.id.maya_kyc_submit_secondary_id_fragment, false);
                    } else {
                        FrameLayout frameLayout3 = ((C0471o0) ((MayaKycSimpleCaptureV2Fragment) ((K8.D) k8.c.get())).G1()).f4168a;
                        kotlin.jvm.internal.j.f(frameLayout3, "getRoot(...)");
                        Navigation.findNavController(frameLayout3).popBackStack(R.id.maya_kyc_submit_id_fragment, false);
                    }
                } else {
                    k8.getClass();
                }
                return Unit.f18162a;
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                D8.L l6 = (D8.L) this.receiver;
                if (zBooleanValue2) {
                    Bundle arguments3 = ((MayaKycSimpleCaptureV3Fragment) ((K8.E) l6.c.get())).getArguments();
                    if (arguments3 != null ? arguments3.getBoolean("isSelectedFromSecondaryIdScreen", false) : false) {
                        FrameLayout frameLayout4 = ((C0473p0) ((MayaKycSimpleCaptureV3Fragment) ((K8.E) l6.c.get())).G1()).f4176a;
                        kotlin.jvm.internal.j.f(frameLayout4, "getRoot(...)");
                        Navigation.findNavController(frameLayout4).popBackStack(R.id.maya_kyc_submit_secondary_id_fragment, false);
                    } else {
                        MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = (MayaKycSimpleCaptureV3Fragment) ((K8.E) l6.c.get());
                        FragmentActivity fragmentActivityRequireActivity = mayaKycSimpleCaptureV3Fragment.requireActivity();
                        kotlin.jvm.internal.j.e(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        String string = mayaKycSimpleCaptureV3Fragment.getString(R.string.maya_fragment_kyc_simple_capture_screen_label);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        String string2 = mayaKycSimpleCaptureV3Fragment.getString(R.string.maya_fragment_kyc_submit_id_screen_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity)).h2(string, string2);
                        FrameLayout frameLayout5 = ((C0473p0) mayaKycSimpleCaptureV3Fragment.G1()).f4176a;
                        kotlin.jvm.internal.j.f(frameLayout5, "getRoot(...)");
                        Navigation.findNavController(frameLayout5).popBackStack(R.id.maya_kyc_submit_id_fragment, false);
                    }
                } else {
                    l6.getClass();
                }
                return Unit.f18162a;
            case 3:
                KycSelectionItem p03 = (KycSelectionItem) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                D8.M m = (D8.M) this.receiver;
                m.getClass();
                MayaKycSingleSelectionBottomSheetDialogFragment mayaKycSingleSelectionBottomSheetDialogFragment = (MayaKycSingleSelectionBottomSheetDialogFragment) ((K8.F) m.c.get());
                mayaKycSingleSelectionBottomSheetDialogFragment.getClass();
                Xh.i.G(mayaKycSingleSelectionBottomSheetDialogFragment, p03);
                FragmentActivity fragmentActivityRequireActivity2 = ((MayaKycSingleSelectionBottomSheetDialogFragment) ((K8.F) m.c.get())).requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
                Navigation.findNavController(fragmentActivityRequireActivity2, R.id.maya_kyc_nav_host_fragment).popBackStack();
                return Unit.f18162a;
            case 4:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                D8.O o8 = (D8.O) this.receiver;
                if (zBooleanValue3) {
                    MayaKycSsneUploadDocumentsFragment mayaKycSsneUploadDocumentsFragment = (MayaKycSsneUploadDocumentsFragment) ((K8.H) o8.c.get());
                    String string3 = mayaKycSsneUploadDocumentsFragment.getString(R.string.maya_kyc_restart_label_confirm);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    String string4 = mayaKycSsneUploadDocumentsFragment.getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
                    kotlin.jvm.internal.j.f(string4, "getString(...)");
                    mayaKycSsneUploadDocumentsFragment.M1(string3, string4);
                    FragmentActivity fragmentActivityRequireActivity3 = mayaKycSsneUploadDocumentsFragment.requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) fragmentActivityRequireActivity3);
                    mayaKycActivity.n1().s(mayaKycActivity, false);
                    mayaKycActivity.finish();
                } else {
                    o8.getClass();
                }
                return Unit.f18162a;
            case 5:
                String p04 = (String) obj;
                kotlin.jvm.internal.j.g(p04, "p0");
                MayaKycSubmitIdFragment.K1((MayaKycSubmitIdFragment) this.receiver, p04);
                return Unit.f18162a;
            case 6:
                String p05 = (String) obj;
                kotlin.jvm.internal.j.g(p05, "p0");
                MayaKycSubmitIdFragment.K1((MayaKycSubmitIdFragment) this.receiver, p05);
                return Unit.f18162a;
            case 7:
                String p06 = (String) obj;
                kotlin.jvm.internal.j.g(p06, "p0");
                MayaKycSubmitIdFragment.K1((MayaKycSubmitIdFragment) this.receiver, p06);
                return Unit.f18162a;
            case 8:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                D8.P p10 = (D8.P) this.receiver;
                if (zBooleanValue4) {
                    if (p10.e.e().isSupportSecondaryIdFlowEnabled()) {
                        FragmentActivity fragmentActivityRequireActivity4 = ((MayaKycSubmitSecondaryIdFragment) ((K8.L) p10.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(fragmentActivityRequireActivity4, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity4)).Z1().f1044l.clear();
                    }
                    MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment = (MayaKycSubmitSecondaryIdFragment) ((K8.L) p10.c.get());
                    mayaKycSubmitSecondaryIdFragment.getClass();
                    ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_kyc_submit_secondary_id_fragment_to_maya_kyc_submit_id_fragment);
                    ConstraintLayout constraintLayout = ((C0484v0) mayaKycSubmitSecondaryIdFragment.G1()).f4233a;
                    kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                    Navigation.findNavController(constraintLayout).navigate(actionOnlyNavDirections);
                } else {
                    p10.getClass();
                }
                return Unit.f18162a;
            case 9:
                kotlin.jvm.internal.j.g((String) obj, "p0");
                MayaKycSubmitSecondaryIdFragment mayaKycSubmitSecondaryIdFragment2 = (MayaKycSubmitSecondaryIdFragment) this.receiver;
                mayaKycSubmitSecondaryIdFragment2.getClass();
                FragmentActivity activity = mayaKycSubmitSecondaryIdFragment2.getActivity();
                H8.b bVar = activity instanceof H8.b ? (H8.b) activity : null;
                if (bVar != null) {
                    ((MayaKycActivity) bVar).f12450r = 0;
                }
                J8.c cVar = mayaKycSubmitSecondaryIdFragment2.f12636X;
                if (cVar != null && (kycDocument = (KycDocument) cVar.f2456a.get(cVar.c)) != null) {
                    D8.P pK1 = mayaKycSubmitSecondaryIdFragment2.K1();
                    String key = kycDocument.getKey();
                    String str = key != null ? key : "";
                    FragmentActivity fragmentActivityRequireActivity5 = ((MayaKycSubmitSecondaryIdFragment) ((K8.L) pK1.c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity5, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity5)).Z1().f;
                    if (kycCmsContent == null || (captureGuides = kycCmsContent.getData().getCaptureGuides()) == null) {
                        kycCaptureGuide = null;
                    } else {
                        Iterator<T> it2 = captureGuides.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                KycDocumentTypeGuide document = ((KycCaptureGuide) next).getDocument();
                                if (kotlin.jvm.internal.j.b(document != null ? document.getKey() : null, str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        kycCaptureGuide = (KycCaptureGuide) next;
                    }
                    mayaKycSubmitSecondaryIdFragment2.f12639a0 = new MayaEKYCSelectedDocument(kycDocument, kycCaptureGuide, "secondary", 1);
                }
                if (mayaKycSubmitSecondaryIdFragment2.f12639a0 == null) {
                    kotlin.jvm.internal.j.n("mSelectedDocument");
                    throw null;
                }
                if (mayaKycSubmitSecondaryIdFragment2.K1().p()) {
                    D8.P pK12 = mayaKycSubmitSecondaryIdFragment2.K1();
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocument = mayaKycSubmitSecondaryIdFragment2.f12639a0;
                    if (mayaEKYCSelectedDocument == null) {
                        kotlin.jvm.internal.j.n("mSelectedDocument");
                        throw null;
                    }
                    pK12.q(mayaEKYCSelectedDocument);
                } else {
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocument2 = mayaKycSubmitSecondaryIdFragment2.f12639a0;
                    if (mayaEKYCSelectedDocument2 == null) {
                        kotlin.jvm.internal.j.n("mSelectedDocument");
                        throw null;
                    }
                    T2.Q(mayaKycSubmitSecondaryIdFragment2, mayaEKYCSelectedDocument2.getDescription(), null, null, 14);
                }
                return Unit.f18162a;
            case 10:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                D8.S s9 = (D8.S) ((B8.f) this.receiver);
                if (zBooleanValue5) {
                    if (s9.f1021d.e().isSupportSecondaryIdFlowEnabled()) {
                        FragmentActivity fragmentActivityRequireActivity6 = ((MayaKycTakeVideoSelfieFragment) ((K8.N) s9.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(fragmentActivityRequireActivity6, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity6)).Z1().f1044l.clear();
                    }
                    MayaKycTakeVideoSelfieFragment mayaKycTakeVideoSelfieFragment = (MayaKycTakeVideoSelfieFragment) ((K8.N) s9.c.get());
                    FragmentActivity fragmentActivityRequireActivity7 = mayaKycTakeVideoSelfieFragment.requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity7, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    String string5 = mayaKycTakeVideoSelfieFragment.getString(R.string.maya_kyc_submit_an_id_header);
                    kotlin.jvm.internal.j.f(string5, "getString(...)");
                    ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity7)).h2(numX49.tnTj78("bQus"), string5);
                    ConstraintLayout constraintLayout2 = ((C0488x0) mayaKycTakeVideoSelfieFragment.G1()).f4261a;
                    kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                    Navigation.findNavController(constraintLayout2).popBackStack(R.id.maya_kyc_submit_id_fragment, false);
                } else {
                    s9.getClass();
                }
                return Unit.f18162a;
            case 11:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                D8.T tM1 = ((MayaKycUploadPhilsysIdFragment) this.receiver).M1();
                String str2 = zBooleanValue6 ? "FRONT" : "BACK";
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment = (MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get());
                File cacheDir3 = mayaKycUploadPhilsysIdFragment.requireContext().getCacheDir();
                kotlin.jvm.internal.j.f(cacheDir3, "getCacheDir(...)");
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentN12 = mayaKycUploadPhilsysIdFragment.N1();
                String path = cacheDir3.getPath();
                String str3 = File.separator;
                new File(path + str3 + "kycpictures" + str3 + (mayaEKYCSelectedDocumentN12 != null ? mayaEKYCSelectedDocumentN12.getKey() : null) + ".jpg");
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment2 = (MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get());
                mayaKycUploadPhilsysIdFragment2.getClass();
                File cacheDir4 = mayaKycUploadPhilsysIdFragment2.requireContext().getCacheDir();
                kotlin.jvm.internal.j.f(cacheDir4, "getCacheDir(...)");
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentN13 = mayaKycUploadPhilsysIdFragment2.N1();
                if (mayaEKYCSelectedDocumentN13 != null) {
                    File file = new File(cacheDir4, "kycpictures");
                    if (file.exists() || file.mkdirs()) {
                        File file2 = new File(file, androidx.media3.datasource.cache.c.l(mayaEKYCSelectedDocumentN13.getKey(), Global.UNDERSCORE, str2, ".jpg"));
                        if (!file2.exists() || file2.delete()) {
                            File file3 = new File(file, We.s.i(mayaEKYCSelectedDocumentN13.getKey(), ".jpg"));
                            if (file3.exists()) {
                                try {
                                    nj.l.e(file3, file2);
                                    C2070f1 c2070f1G = yk.a.g("DEBUG");
                                    file2.toString();
                                    c2070f1G.getClass();
                                    C2070f1.e();
                                } catch (Exception unused) {
                                    yk.a.b();
                                }
                            } else {
                                yk.a.c();
                            }
                        } else {
                            yk.a.c();
                        }
                    } else {
                        yk.a.c();
                    }
                    break;
                }
                File fileK1 = ((MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get())).K1(str2);
                if (fileK1 != null) {
                    if (zBooleanValue6) {
                        ((MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get())).V1(true);
                        ((MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get())).R1(fileK1);
                    } else {
                        ((MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get())).U1(true);
                        ((MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get())).Q1(fileK1);
                    }
                }
                tM1.q();
                return Unit.f18162a;
            case 12:
                KycFieldType p07 = (KycFieldType) obj;
                kotlin.jvm.internal.j.g(p07, "p0");
                MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = (MayaKycVerifyWithPhilsysFragment) this.receiver;
                mayaKycVerifyWithPhilsysFragment.getClass();
                int i = Z2.f3260a[p07.ordinal()];
                String strName = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? p07.name() : ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).m.getLabelText() : ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).h.getLabelText() : ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).j.getLabelText() : ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.getLabelText() : ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).i.getLabelText();
                if (strName == null) {
                    strName = p07.name();
                }
                T2.Q(mayaKycVerifyWithPhilsysFragment, strName, null, null, 14);
                return Unit.f18162a;
            case 13:
                KycSelectionItem p08 = (KycSelectionItem) obj;
                kotlin.jvm.internal.j.g(p08, "p0");
                B8.g gVarK1 = ((MayaKycVerifyWithPhilsysFragment) this.receiver).K1();
                int id2 = p08.getId();
                D8.W w6 = (D8.W) gVarK1;
                Iterator it3 = w6.f1025d.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next7 = it3.next();
                        if (((KycSelectionItem) next7).getId() == id2) {
                            obj2 = next7;
                        }
                    }
                }
                KycSelectionItem kycSelectionItem = (KycSelectionItem) obj2;
                if (kycSelectionItem != null) {
                    w6.e = kycSelectionItem;
                    ((MayaKycVerifyWithPhilsysFragment) ((K8.Q) w6.c.get())).L1(kycSelectionItem);
                }
                return Unit.f18162a;
            case 14:
                D8.W w8 = (D8.W) ((B8.g) this.receiver);
                K8.Q q9 = (K8.Q) w8.c.get();
                int id3 = w8.e.getId();
                ArrayList suffixOptions = w8.f1025d;
                MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment2 = (MayaKycVerifyWithPhilsysFragment) q9;
                mayaKycVerifyWithPhilsysFragment2.getClass();
                kotlin.jvm.internal.j.g(suffixOptions, "suffixOptions");
                KycSelectionModel kycSelectionModel = new KycSelectionModel(R.string.maya_kyc_verify_with_philsys_suffix_hint, id3, suffixOptions, KycFieldType.SUFFIX, false, 16, null);
                Bundle bundle = new Bundle();
                bundle.putParcelable("uiModel", kycSelectionModel);
                ConstraintLayout constraintLayout3 = ((N5.A0) mayaKycVerifyWithPhilsysFragment2.G1()).f3539a;
                kotlin.jvm.internal.j.f(constraintLayout3, "getRoot(...)");
                E1.c.l(ViewKt.findNavController(constraintLayout3), R.id.maya_kyc_verify_with_philsys_fragment, R.id.action_maya_kyc_verify_with_philsys_fragment_to_maya_kyc_single_selection_bottom_sheet_dialog_fragment, bundle);
                return Unit.f18162a;
            case 15:
                KycSelectionItem p09 = (KycSelectionItem) obj;
                kotlin.jvm.internal.j.g(p09, "p0");
                MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment = (MayaKycWorkDetailsFragment) this.receiver;
                KycFieldType kycFieldType = mayaKycWorkDetailsFragment.f12659a0;
                int i4 = kycFieldType == null ? -1 : h3.f3312a[kycFieldType.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        B8.h hVarN1 = mayaKycWorkDetailsFragment.N1();
                        int id4 = p09.getId();
                        D8.Z z4 = (D8.Z) hVarN1;
                        KycWorkNature kycWorkNature = z4.f1030d;
                        if ((kycWorkNature != null ? kycWorkNature.getId() : null) != null) {
                            KycWorkNature kycWorkNature2 = z4.f1030d;
                            kotlin.jvm.internal.j.d(kycWorkNature2);
                            Integer id5 = kycWorkNature2.getId();
                            kotlin.jvm.internal.j.d(id5);
                            Iterator it4 = z4.x(id5.intValue()).iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next4 = it4.next();
                                    Integer id6 = ((KycJobTitle) next4).getId();
                                    if (id6 != null && id6.intValue() == id4) {
                                    }
                                } else {
                                    next4 = null;
                                }
                            }
                            KycJobTitle kycJobTitle = (KycJobTitle) next4;
                            if (kycJobTitle != null) {
                                z4.e = kycJobTitle;
                                ((MayaKycWorkDetailsFragment) ((K8.T) z4.c.get())).S1(kycJobTitle);
                                Integer id7 = kycJobTitle.getId();
                                if (id7 != null && (iIntValue2 = id7.intValue()) > 0) {
                                    LinkedHashMap linkedHashMap = E8.C.f1266a;
                                    E8.C.b(Integer.valueOf(iIntValue2), "job_title_id");
                                    E8.C.b(kycJobTitle, "job_title_object");
                                }
                                z4.f = null;
                                ((MayaKycWorkDetailsFragment) ((K8.T) z4.c.get())).L1();
                                try {
                                    E8.C.f1266a.remove("income_source_id");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                LinkedHashMap linkedHashMap2 = z4.i;
                                try {
                                    Set setKeySet = linkedHashMap2.keySet();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj3 : setKeySet) {
                                        if (zj.z.w((String) obj3, 2, "job_title_", false)) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    Iterator it5 = arrayList.iterator();
                                    while (it5.hasNext()) {
                                        linkedHashMap2.remove((String) it5.next());
                                    }
                                    if (linkedHashMap2.isEmpty()) {
                                        E8.C.f1266a.remove("dnfbp_questions");
                                    } else {
                                        LinkedHashMap linkedHashMap3 = E8.C.f1266a;
                                        E8.C.b(cj.M.m(z4.i), "dnfbp_questions");
                                    }
                                } catch (Exception e7) {
                                    e7.printStackTrace();
                                }
                                z4.n();
                                ((N5.C0) ((MayaKycWorkDetailsFragment) ((K8.T) z4.c.get())).G1()).f3567b.setVisibility(8);
                                LinkedHashMap linkedHashMap4 = E8.C.f1266a;
                                linkedHashMap4.remove("warning_visible");
                                linkedHashMap4.remove("warning_text");
                                Iterator it6 = z4.r().iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        next5 = it6.next();
                                        KycDnfbpGuide kycDnfbpGuide = (KycDnfbpGuide) next5;
                                        KycWorkNature workNature = kycDnfbpGuide.getWorkNature();
                                        Integer id8 = workNature != null ? workNature.getId() : null;
                                        KycWorkNature kycWorkNature3 = z4.f1030d;
                                        kotlin.jvm.internal.j.d(kycWorkNature3);
                                        if (kotlin.jvm.internal.j.b(id8, kycWorkNature3.getId()) && (jobTitles = kycDnfbpGuide.getJobTitles()) != null) {
                                            List<KycJobTitles> list = jobTitles;
                                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                                Iterator<T> it7 = list.iterator();
                                                while (it7.hasNext()) {
                                                    KycJobTitle jobTitle = ((KycJobTitles) it7.next()).getJobTitle();
                                                    if (jobTitle == null || (id = jobTitle.getId()) == null || id.intValue() != id4) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                }
                                z4.f1031g = (KycDnfbpGuide) next5;
                                ((MayaKycWorkDetailsFragment) ((K8.T) z4.c.get())).P1(KycFieldType.INCOME_SOURCE);
                                KycWorkNature kycWorkNature4 = z4.f1030d;
                                kotlin.jvm.internal.j.d(kycWorkNature4);
                                Integer id9 = kycWorkNature4.getId();
                                kotlin.jvm.internal.j.d(id9);
                                String strA = z4.A(id9.intValue(), id4);
                                if (strA == null || strA.length() == 0) {
                                    ((MayaKycWorkDetailsFragment) ((K8.T) z4.c.get())).P1(KycFieldType.JOB_TITLE);
                                } else {
                                    ((MayaKycWorkDetailsFragment) ((K8.T) z4.c.get())).V1(KycFieldType.JOB_TITLE, strA);
                                }
                                z4.I();
                                z4.m();
                                ((MayaKycWorkDetailsFragment) ((K8.T) z4.c.get())).W1();
                                z4.l();
                            }
                        }
                    } else if (i4 == 3) {
                        B8.h hVarN12 = mayaKycWorkDetailsFragment.N1();
                        int id10 = p09.getId();
                        D8.Z z5 = (D8.Z) hVarN12;
                        KycWorkNature kycWorkNature5 = z5.f1030d;
                        if ((kycWorkNature5 != null ? kycWorkNature5.getId() : null) != null) {
                            KycWorkNature kycWorkNature6 = z5.f1030d;
                            kotlin.jvm.internal.j.d(kycWorkNature6);
                            Integer id11 = kycWorkNature6.getId();
                            kotlin.jvm.internal.j.d(id11);
                            Iterator it8 = z5.w(id11.intValue()).iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next6 = it8.next();
                                    Integer id12 = ((KycIncomeSource) next6).getId();
                                    if (id12 != null && id12.intValue() == id10) {
                                    }
                                } else {
                                    next6 = null;
                                }
                            }
                            KycIncomeSource kycIncomeSource = (KycIncomeSource) next6;
                            if (kycIncomeSource != null) {
                                z5.f = kycIncomeSource;
                                ((MayaKycWorkDetailsFragment) ((K8.T) z5.c.get())).U1(kycIncomeSource);
                                Integer id13 = kycIncomeSource.getId();
                                if (id13 != null && (iIntValue3 = id13.intValue()) > 0) {
                                    LinkedHashMap linkedHashMap5 = E8.C.f1266a;
                                    E8.C.b(Integer.valueOf(iIntValue3), "income_source_id");
                                }
                                z5.n();
                                z5.I();
                                KycWorkNature kycWorkNature7 = z5.f1030d;
                                kotlin.jvm.internal.j.d(kycWorkNature7);
                                Integer id14 = kycWorkNature7.getId();
                                kotlin.jvm.internal.j.d(id14);
                                String strZ = z5.z(id14.intValue(), id10);
                                if (strZ == null || strZ.length() == 0) {
                                    ((MayaKycWorkDetailsFragment) ((K8.T) z5.c.get())).P1(KycFieldType.INCOME_SOURCE);
                                } else {
                                    ((MayaKycWorkDetailsFragment) ((K8.T) z5.c.get())).V1(KycFieldType.INCOME_SOURCE, strZ);
                                }
                                z5.m();
                                ((MayaKycWorkDetailsFragment) ((K8.T) z5.c.get())).W1();
                                z5.l();
                            }
                        }
                    }
                    break;
                } else {
                    B8.h hVarN13 = mayaKycWorkDetailsFragment.N1();
                    int id15 = p09.getId();
                    D8.Z z8 = (D8.Z) hVarN13;
                    Iterator it9 = z8.D().iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            Integer id16 = ((KycWorkNature) next2).getId();
                            if (id16 != null && id16.intValue() == id15) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    KycWorkNature kycWorkNature8 = (KycWorkNature) next2;
                    if (kycWorkNature8 != null) {
                        z8.f1030d = kycWorkNature8;
                        ((MayaKycWorkDetailsFragment) ((K8.T) z8.c.get())).T1(kycWorkNature8);
                        Integer id17 = kycWorkNature8.getId();
                        if (id17 != null && (iIntValue = id17.intValue()) > 0) {
                            LinkedHashMap linkedHashMap6 = E8.C.f1266a;
                            E8.C.b(Integer.valueOf(iIntValue), "work_nature_id");
                        }
                        z8.e = null;
                        MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment2 = (MayaKycWorkDetailsFragment) ((K8.T) z8.c.get());
                        ((N5.C0) mayaKycWorkDetailsFragment2.G1()).f3569g.setSelectedData(null);
                        ((N5.C0) mayaKycWorkDetailsFragment2.G1()).f3569g.setDisplayText("");
                        ((N5.C0) mayaKycWorkDetailsFragment2.G1()).f3569g.b();
                        try {
                            LinkedHashMap linkedHashMap7 = E8.C.f1266a;
                            linkedHashMap7.remove("job_title_id");
                            linkedHashMap7.remove("job_title_object");
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        z8.f = null;
                        ((MayaKycWorkDetailsFragment) ((K8.T) z8.c.get())).L1();
                        try {
                            E8.C.f1266a.remove("income_source_id");
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        try {
                            z8.i.clear();
                            E8.C.f1266a.remove("dnfbp_questions");
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        try {
                            E8.C.f1266a.remove("formatted_questionnaire_for_submission");
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                        ((N5.C0) ((MayaKycWorkDetailsFragment) ((K8.T) z8.c.get())).G1()).f3567b.setVisibility(8);
                        LinkedHashMap linkedHashMap8 = E8.C.f1266a;
                        linkedHashMap8.remove("summary_tooltip");
                        linkedHashMap8.remove("warning_visible");
                        linkedHashMap8.remove("warning_text");
                        z8.f1031g = null;
                        Iterator it10 = z8.r().iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next3 = it10.next();
                                KycWorkNature workNature2 = ((KycDnfbpGuide) next3).getWorkNature();
                                if (kotlin.jvm.internal.j.b(workNature2 != null ? workNature2.getId() : null, kycWorkNature8.getId())) {
                                }
                            } else {
                                next3 = null;
                            }
                        }
                        z8.f1031g = (KycDnfbpGuide) next3;
                        z8.h = kotlin.jvm.internal.j.b(kycWorkNature8.getRequiresEmploymentDetails(), Boolean.TRUE);
                        ((N5.C0) ((MayaKycWorkDetailsFragment) ((K8.T) z8.c.get())).G1()).h.setVisibility(z8.h ? 0 : 8);
                        if (!z8.h) {
                            MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment3 = (MayaKycWorkDetailsFragment) ((K8.T) z8.c.get());
                            ((N5.C0) mayaKycWorkDetailsFragment3.G1()).h.e.setText("");
                            KycMayaInputLayout kycMayaInputLayout = ((N5.C0) mayaKycWorkDetailsFragment3.G1()).h;
                            kycMayaInputLayout.f12696l = false;
                            kycMayaInputLayout.d();
                            try {
                                E8.C.f1266a.remove("company_name");
                            } catch (Exception e14) {
                                e14.printStackTrace();
                            }
                        }
                        ((MayaKycWorkDetailsFragment) ((K8.T) z8.c.get())).P1(KycFieldType.JOB_TITLE);
                        ((MayaKycWorkDetailsFragment) ((K8.T) z8.c.get())).P1(KycFieldType.INCOME_SOURCE);
                        Integer id18 = kycWorkNature8.getId();
                        kotlin.jvm.internal.j.d(id18);
                        String strB = z8.B(id18.intValue());
                        if (strB == null || strB.length() == 0) {
                            ((MayaKycWorkDetailsFragment) ((K8.T) z8.c.get())).P1(KycFieldType.WORK_NATION);
                        } else {
                            ((MayaKycWorkDetailsFragment) ((K8.T) z8.c.get())).V1(KycFieldType.WORK_NATION, strB);
                        }
                        z8.I();
                        z8.m();
                        ((MayaKycWorkDetailsFragment) ((K8.T) z8.c.get())).W1();
                        z8.l();
                    }
                    break;
                }
                mayaKycWorkDetailsFragment.f12659a0 = null;
                return Unit.f18162a;
            case 16:
                return a(obj);
            case 17:
                return b(obj);
            case 18:
                return d(obj);
            case 19:
                return e(obj);
            case 20:
                return ((T.b) this.receiver).a((String) obj);
            case 21:
                ((MayaReferralV2Activity) this.receiver).startActivity((Intent) obj);
                return Unit.f18162a;
            case 22:
                return f(obj);
            case 23:
                return g(obj);
            case 24:
                return h(obj);
            case 25:
                return i(obj);
            case 26:
                return j(obj);
            case 27:
                return k(obj);
            case 28:
                return l(obj);
            default:
                String p010 = (String) obj;
                kotlin.jvm.internal.j.g(p010, "p0");
                MayaProminentDisclosureBottomSheetDialogFragment mayaProminentDisclosureBottomSheetDialogFragment = (MayaProminentDisclosureBottomSheetDialogFragment) this.receiver;
                C1229s c1229s = mayaProminentDisclosureBottomSheetDialogFragment.f13673T;
                if (c1229s == null) {
                    kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
                    throw null;
                }
                FragmentActivity fragmentActivityRequireActivity8 = mayaProminentDisclosureBottomSheetDialogFragment.requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity8, "requireActivity(...)");
                String strP = AbstractC1213b.p(10);
                kotlin.jvm.internal.j.f(strP, "tapped(...)");
                C0447e c0447e = mayaProminentDisclosureBottomSheetDialogFragment.f13672S;
                kotlin.jvm.internal.j.d(c0447e);
                C1229s.c(c1229s, fragmentActivityRequireActivity8, strP, "Initialize", p010, ((Button) c0447e.c).getText().toString(), null, null, null, 224);
                return Unit.f18162a;
        }
    }
}
