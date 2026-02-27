package Gb;

import D8.C0214w;
import G6.w;
import L9.C0323a;
import L9.C0325c;
import L9.C0331i;
import L9.I;
import N5.C0437a1;
import N5.C0453g;
import P5.V;
import P5.Y;
import Q9.InterfaceC0574d;
import Q9.InterfaceC0578h;
import Q9.InterfaceC0583m;
import We.InterfaceC0604h;
import android.app.Dialog;
import android.content.Intent;
import android.webkit.PermissionRequest;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC1033d;
import cg.InterfaceC1101b;
import cj.C1110A;
import cj.C1132s;
import cj.L;
import cj.M;
import com.google.firebase.messaging.r;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.domain.model.CreditAgreements;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.CreditTransaction;
import com.paymaya.domain.model.DeviceInformationResponse;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PersonalDetailsPatchResponse;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.ShareSaveAppInfo;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.mayaui.common.view.activity.impl.MayaMaintenanceActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAppMaintenanceFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditConfirmTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditActivationConfirmDetailFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyDecorationPreviewFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryEmailFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFormFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDisplayNameFragment;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthResult;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o1.AbstractC1955a;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC2329d;
import y5.s;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements InterfaceC0604h, Ch.c, InterfaceC1101b, HuiYanOsAuthCallBack, W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1942b;

    public /* synthetic */ d(Object obj, int i) {
        this.f1941a = i;
        this.f1942b = obj;
    }

    public void a(String str, String str2) {
        try {
            ((JSONObject) this.f1942b).put(str, str2);
        } catch (JSONException unused) {
            yk.a.e();
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        MayaCreditConfirmTransferFragment mayaCreditConfirmTransferFragment;
        InterfaceC0574d interfaceC0574d;
        Object next;
        MayaChangeMinFormFragment mayaChangeMinFormFragment;
        Sb.j jVar;
        PermissionRequest permissionRequest;
        Y6.c cVar;
        int i = 3;
        int i4 = 2;
        int i6 = 0;
        int i10 = 1;
        switch (this.f1941a) {
            case 2:
                Ja.b bVar = (Ja.b) this.f1942b;
                PayMayaError payMayaErrorF = bVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                s sVar = (Ma.a) bVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.CREATE);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                ((MayaBaseFragment) sVar).A1(c1219hH);
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) ((Ma.a) bVar.c.get());
                mayaMLKitQRScannerFragment.getClass();
                Na.e eVar = mayaMLKitQRScannerFragment.f13591j0;
                if (eVar != null) {
                    M2.b.Z(0, mayaMLKitQRScannerFragment.getString(R.string.pma_toast_error_title_merchant_payment_error), null, null, null, false, payMayaErrorF, null, false, 445).show(((MayaQRActivity) eVar).getSupportFragmentManager(), "error_dialog");
                    return;
                }
                return;
            case 3:
                ((A7.j) this.f1942b).e0((MerchantPaymentV2) obj);
                return;
            case 4:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                Q6.o oVar = (Q6.o) this.f1942b;
                PayMayaError payMayaErrorF2 = oVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                oVar.p(payMayaErrorF2);
                return;
            case 5:
                kotlin.jvm.internal.j.g((PersonalDetailsPatchResponse) obj, "it");
                C0323a c0323a = (C0323a) this.f1942b;
                CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) c0323a.f2878g;
                if (creditReviewUiModel == null) {
                    kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                    throw null;
                }
                CreditTerm creditTerm = creditReviewUiModel.m;
                if (creditTerm != null) {
                    c0323a.e(new Lh.d(new Lh.d(new Lh.h(((C1264i0) c0323a.e).h(creditTerm.getId(), creditReviewUiModel.f13059k, creditTerm.getLoanAmount(), C1132s.d("termsAndConditions", "truthAndTransparency", "disclosureStatement")), zh.b.a(), 0), new Gc.h(c0323a, i), i4), new w(c0323a, 7), i6).e());
                    return;
                }
                return;
            case 6:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                PayMayaError payMayaErrorF3 = ((C0325c) this.f1942b).f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                C0325c c0325c = (C0325c) this.f1942b;
                c0325c.getClass();
                if (!payMayaErrorF3.isSessionTimeout() && (interfaceC0574d = (mayaCreditConfirmTransferFragment = (MayaCreditConfirmTransferFragment) ((P9.b) c0325c.c.get())).f13110f0) != null) {
                    ((NewMayaCreditActivity) interfaceC0574d).a(payMayaErrorF3, mayaCreditConfirmTransferFragment.getString(R.string.maya_label_that_didnt_load_right));
                }
                ((C0325c) this.f1942b).l(payMayaErrorF3, it);
                return;
            case 7:
                kotlin.jvm.internal.j.g((CreditTransaction) obj, "it");
                ((MayaCreditTransactionListFragment) ((P9.c) ((C0331i) this.f1942b).c.get())).Q1(false);
                return;
            case 8:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                PayMayaError payMayaErrorF4 = ((L9.l) this.f1942b).f(it2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                MayaCreditTransferFragment mayaCreditTransferFragment = (MayaCreditTransferFragment) ((P9.d) ((L9.l) this.f1942b).c.get());
                InterfaceC0578h interfaceC0578h = mayaCreditTransferFragment.f13125v0;
                if (interfaceC0578h != null) {
                    ((NewMayaCreditActivity) interfaceC0578h).a(payMayaErrorF4, mayaCreditTransferFragment.getString(R.string.maya_label_something_went_wrong_title));
                }
                L9.l lVar = (L9.l) this.f1942b;
                lVar.getClass();
                if (!payMayaErrorF4.isSessionTimeout() && !payMayaErrorF4.isNetworkError()) {
                    P9.d dVar = (P9.d) lVar.c.get();
                    Map mapC = L.c(new Pair("product", "mec"));
                    ((MayaCreditTransferFragment) dVar).getClass();
                    E.b(it2, mapC);
                }
                yk.a.e();
                return;
            case 9:
                Ze.a it3 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                if (it3.f6934b) {
                    P9.g gVar = (P9.g) ((L9.o) this.f1942b).c.get();
                    String strA = C.a(1, AbstractC1213b.z(2));
                    kotlin.jvm.internal.j.f(strA, "allowed(...)");
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    ((NewMayaCreditActivationConfirmDetailFragment) gVar).H1(strA, M.h(new Pair("source_page", "LOCATION_PERMISSION_PROMPT"), new Pair("source_button", RtspHeaders.ALLOW)));
                    ((L9.o) this.f1942b).n();
                    return;
                }
                P9.g gVar2 = (P9.g) ((L9.o) this.f1942b).c.get();
                String strA2 = C.a(6, AbstractC1213b.z(2));
                kotlin.jvm.internal.j.f(strA2, "denied(...)");
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                ((NewMayaCreditActivationConfirmDetailFragment) gVar2).H1(strA2, M.h(new Pair("source_page", "LOCATION_PERMISSION_PROMPT"), new Pair("source_button", "Deny")));
                InterfaceC0583m interfaceC0583m = ((NewMayaCreditActivationConfirmDetailFragment) ((P9.g) ((L9.o) this.f1942b).c.get())).f13160i0;
                if (interfaceC0583m != null) {
                    NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) interfaceC0583m;
                    E.a("NewMayaCreditActivity", "showLocationPermissionNeeded");
                    Map mapH = M.h(new Pair("source_page", "LOCATION_PERMISSION_PROMPT"), new Pair("source_button", "Deny"), new Pair("error_message", newMayaCreditActivity.getString(R.string.maya_label_location_permissions_needed)));
                    String strB = C.b("MEC_APPLICATION", EnumC1217f.ACCESS, 42);
                    kotlin.jvm.internal.j.f(strB, "accessRequested(...)");
                    newMayaCreditActivity.Y1(strB, mapH);
                    MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231241, newMayaCreditActivity.getString(R.string.maya_label_location_permissions_needed), newMayaCreditActivity.getString(R.string.maya_label_location_permission_from_settings_description), newMayaCreditActivity.getString(R.string.maya_label_got_it), null, false, null, null, false, 464);
                    mayaErrorDialogFragmentZ.f11852e0 = new Ad.a(20, mayaErrorDialogFragmentZ, newMayaCreditActivity);
                    mayaErrorDialogFragmentZ.show(newMayaCreditActivity.getSupportFragmentManager(), "error_dialog");
                    return;
                }
                return;
            case 10:
                Throwable it4 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                ((MayaBaseFragment) ((P9.j) ((L9.s) this.f1942b).c.get())).w1();
                PayMayaError payMayaErrorF5 = ((L9.s) this.f1942b).f(it4, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                ((L9.s) this.f1942b).q(payMayaErrorF5, it4);
                return;
            case 11:
                CreditAgreements it5 = (CreditAgreements) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                G6.k kVar = (G6.k) this.f1942b;
                List<CreditAgreement> agreements = it5.getAgreements();
                NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = (NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get());
                RecyclerView recyclerView = newMayaCreditSummaryFragment.f13307q0;
                if (recyclerView == null) {
                    kotlin.jvm.internal.j.n("mMayaAgreementsRecyclerView");
                    throw null;
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(newMayaCreditSummaryFragment.getContext(), 1, false));
                RecyclerView recyclerView2 = newMayaCreditSummaryFragment.f13307q0;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.j.n("mMayaAgreementsRecyclerView");
                    throw null;
                }
                O9.c cVar2 = newMayaCreditSummaryFragment.f13302B0;
                if (cVar2 == null) {
                    kotlin.jvm.internal.j.n("mMayaAgreementsAdapter");
                    throw null;
                }
                recyclerView2.setAdapter(cVar2);
                ArrayList arrayList = new ArrayList();
                if (agreements != null) {
                    List<CreditAgreement> list = agreements;
                    for (CreditAgreement creditAgreement : list) {
                        String str = (String) ((Map) ((InterfaceC1033d) kVar.f1796l).getValue()).get(creditAgreement.getKey());
                        if (str == null) {
                            str = "";
                        }
                        creditAgreement.setTitle(str);
                    }
                    for (String str2 : ((Map) ((InterfaceC1033d) kVar.f1796l).getValue()).keySet()) {
                        Iterator<T> it6 = list.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next = it6.next();
                                if (kotlin.jvm.internal.j.b(((CreditAgreement) next).getKey(), str2)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        CreditAgreement creditAgreement2 = (CreditAgreement) next;
                        if (creditAgreement2 != null) {
                            arrayList.add(creditAgreement2);
                        }
                    }
                } else {
                    Map map = (Map) ((InterfaceC1033d) kVar.f1796l).getValue();
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it7 = map.entrySet().iterator();
                    while (it7.hasNext()) {
                        arrayList2.add(new CreditAgreement("", "", "", false, "", (String) ((Map.Entry) it7.next()).getValue(), null, null, PsExtractor.AUDIO_STREAM, null));
                    }
                    arrayList.addAll(arrayList2);
                }
                String string = ((NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get())).getString(R.string.maya_label_credit_management_data_privacy_policy);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                String string2 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get())).getString(R.string.maya_label_credit_management_data_privacy);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                String string3 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get())).getString(R.string.maya_label_credit_management_data_privacy_policy_content);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                CreditAgreement creditAgreement3 = new CreditAgreement(string2, "", string3, false, "privacyPolicy", string, null, null, PsExtractor.AUDIO_STREAM, null);
                String string4 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get())).getString(R.string.maya_label_credit_management_automated_payments);
                kotlin.jvm.internal.j.f(string4, "getString(...)");
                String string5 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get())).getString(R.string.maya_label_credit_management_automated_payments_content);
                kotlin.jvm.internal.j.f(string5, "getString(...)");
                arrayList.addAll(C1132s.g(creditAgreement3, new CreditAgreement(string4, "", string5, false, "automatedPayments", string4, null, null, PsExtractor.AUDIO_STREAM, null)));
                NewMayaCreditSummaryFragment newMayaCreditSummaryFragment2 = (NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get());
                newMayaCreditSummaryFragment2.getClass();
                O9.c cVar3 = newMayaCreditSummaryFragment2.f13302B0;
                if (cVar3 == null) {
                    kotlin.jvm.internal.j.n("mMayaAgreementsAdapter");
                    throw null;
                }
                ArrayList oldList = cVar3.f4771b;
                kotlin.jvm.internal.j.g(oldList, "oldList");
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new T9.a(oldList, arrayList));
                kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                oldList.clear();
                oldList.addAll(arrayList);
                diffResultCalculateDiff.dispatchUpdatesTo(cVar3);
                return;
            case 12:
                kotlin.jvm.internal.j.g((Throwable) obj, "it");
                ((MayaBaseFragment) ((P9.o) ((I) this.f1942b).c.get())).w1();
                return;
            case 13:
                kotlin.jvm.internal.j.g((Profile) obj, "it");
                Lb.a aVar = (Lb.a) this.f1942b;
                s sVar2 = (Rb.a) aVar.c.get();
                C1219h c1219h = new C1219h();
                c1219h.n(14);
                c1219h.i();
                ((MayaBaseFragment) sVar2).A1(c1219h);
                ((MayaBaseFragment) ((Rb.a) aVar.c.get())).w1();
                Rb.a aVar2 = (Rb.a) aVar.c.get();
                String strH1 = ((MayaAccountRecoveryEmailFragment) ((Rb.a) aVar.c.get())).H1();
                Sb.e eVar2 = ((MayaAccountRecoveryEmailFragment) aVar2).f13914a0;
                if (eVar2 != null) {
                    ((MayaSettingsActivity) eVar2).f2(strH1, true);
                    return;
                }
                return;
            case 14:
                Lb.b bVar2 = (Lb.b) this.f1942b;
                PayMayaError payMayaErrorF6 = bVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                ((MayaBaseFragment) ((Rb.c) bVar2.c.get())).w1();
                if (payMayaErrorF6.isSessionTimeout() || (jVar = (mayaChangeMinFormFragment = (MayaChangeMinFormFragment) ((Rb.c) bVar2.c.get())).f13936Z) == null) {
                    return;
                }
                ((MayaSettingsActivity) jVar).b2(payMayaErrorF6, mayaChangeMinFormFragment.getString(R.string.maya_label_thats_not_it));
                return;
            case 15:
                Lb.d dVar2 = (Lb.d) this.f1942b;
                PayMayaError payMayaErrorF7 = dVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                dVar2.k(payMayaErrorF7);
                return;
            case 16:
                DeviceInformationResponse p02 = (DeviceInformationResponse) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                ((A7.j) this.f1942b).c0(p02);
                return;
            case 17:
                C0323a c0323a2 = (C0323a) this.f1942b;
                PayMayaError payMayaErrorF8 = c0323a2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF8, "mayaErrorHandling(...)");
                c0323a2.y(payMayaErrorF8);
                return;
            case 18:
                Throwable it8 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it8, "it");
                C0214w c0214w = (C0214w) this.f1942b;
                PayMayaError payMayaErrorF9 = c0214w.f(it8, false);
                kotlin.jvm.internal.j.f(payMayaErrorF9, "paymayaErrorHandling(...)");
                s sVar3 = (R7.b) c0214w.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF9.mSpiel());
                c1219hH2.i();
                ((MayaBaseFragment) sVar3).z1(c1219hH2);
                if (payMayaErrorF9.mErrorCode() == -12) {
                    MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214w.c.get());
                    mayaDataPrivacyDataPersonalizationFragment.getClass();
                    String strMSpiel = payMayaErrorF9.mSpiel();
                    C1229s c1229sG1 = mayaDataPrivacyDataPersonalizationFragment.G1();
                    FragmentActivity fragmentActivityRequireActivity = mayaDataPrivacyDataPersonalizationFragment.requireActivity();
                    kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                    String strD = AbstractC1213b.d(8);
                    kotlin.jvm.internal.j.f(strD, "errorViewed(...)");
                    C1229s.d(c1229sG1, fragmentActivityRequireActivity, strD, "Reg Verification Page (OTP)", null, null, strMSpiel, null, 88);
                    S7.f fVar = mayaDataPrivacyDataPersonalizationFragment.f12287c0;
                    if (fVar != null) {
                        fVar.l0(payMayaErrorF9, new S7.e(mayaDataPrivacyDataPersonalizationFragment, strMSpiel, i6), new S7.e(mayaDataPrivacyDataPersonalizationFragment, strMSpiel, i10));
                        return;
                    }
                    return;
                }
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214w.c.get());
                mayaDataPrivacyDataPersonalizationFragment2.getClass();
                String strMSpiel2 = payMayaErrorF9.mSpiel();
                C1229s c1229sG12 = mayaDataPrivacyDataPersonalizationFragment2.G1();
                FragmentActivity fragmentActivityRequireActivity2 = mayaDataPrivacyDataPersonalizationFragment2.requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
                String strD2 = AbstractC1213b.d(8);
                kotlin.jvm.internal.j.f(strD2, "errorViewed(...)");
                C1229s.d(c1229sG12, fragmentActivityRequireActivity2, strD2, "Reg Verification Page (OTP)", null, null, strMSpiel2, null, 88);
                S7.f fVar2 = mayaDataPrivacyDataPersonalizationFragment2.f12287c0;
                if (fVar2 != null) {
                    mayaDataPrivacyDataPersonalizationFragment2.getString(R.string.maya_label_that_didnt_load_right);
                    fVar2.v(payMayaErrorF9, new S7.e(mayaDataPrivacyDataPersonalizationFragment2, strMSpiel2, i4));
                    return;
                }
                return;
            case 23:
                List p03 = (List) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                Pc.d dVar3 = (Pc.d) this.f1942b;
                dVar3.getClass();
                String strO1 = ((ShareSaveDialogFragment) ((Tc.c) dVar3.c.get())).o1();
                Intent intent = ((ShareSaveDialogFragment) ((Tc.c) dVar3.c.get())).f14393U;
                if (intent == null) {
                    kotlin.jvm.internal.j.n("intent");
                    throw null;
                }
                String type = intent.getType();
                if (strO1 == null || type == null || !z.w(type, 2, "image", false)) {
                    ((ShareSaveDialogFragment) ((Tc.c) dVar3.c.get())).r1(p03);
                } else {
                    ArrayList arrayListW = C1110A.W(p03);
                    arrayListW.add(0, ShareSaveAppInfo.Companion.getSAVE_IMAGE());
                    ((ShareSaveDialogFragment) ((Tc.c) dVar3.c.get())).r1(arrayListW);
                }
                Dialog dialog = ((ShareSaveDialogFragment) ((Tc.c) dVar3.c.get())).getDialog();
                if (dialog != null) {
                    dialog.show();
                    return;
                }
                return;
            case 24:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                Pc.g gVar3 = (Pc.g) this.f1942b;
                if (!permission.f6934b || (permissionRequest = ((WebFragment) ((Vc.c) gVar3.c.get())).f14433o0) == null) {
                    return;
                }
                permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                return;
            case 25:
                io.reactivex.rxjava3.disposables.b it9 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it9, "it");
                ((C0323a) this.f1942b).e(it9);
                return;
            case 26:
                MaintenanceDynamicConfig it10 = (MaintenanceDynamicConfig) obj;
                kotlin.jvm.internal.j.g(it10, "it");
                Q6.i iVar = (Q6.i) this.f1942b;
                iVar.getClass();
                X6.b bVar3 = (X6.b) iVar.c.get();
                String description = it10.getMessage();
                MayaAppMaintenanceFragment mayaAppMaintenanceFragment = (MayaAppMaintenanceFragment) bVar3;
                mayaAppMaintenanceFragment.getClass();
                kotlin.jvm.internal.j.g(description, "description");
                HtmlTextView htmlTextView = mayaAppMaintenanceFragment.f11905X;
                if (htmlTextView == null) {
                    kotlin.jvm.internal.j.n("mTextViewDescription");
                    throw null;
                }
                htmlTextView.setTextHTML(description.toString());
                if (it10.isAppMaintenance() || (cVar = ((MayaAppMaintenanceFragment) ((X6.b) iVar.c.get())).f11904W) == null) {
                    return;
                }
                ((MayaMaintenanceActivity) cVar).V1().k();
                return;
            case 27:
                kotlin.jvm.internal.j.g((Throwable) obj, "it");
                Y6.d dVar4 = ((MayaContactsSelectionFragment) ((X6.c) ((Bb.f) this.f1942b).c.get())).f11913v0;
                if (dVar4 != null) {
                    dVar4.U();
                    return;
                }
                return;
        }
    }

    public void b(String str, JSONObject jSONObject) {
        try {
            ((JSONObject) this.f1942b).put(str, jSONObject);
        } catch (JSONException unused) {
            yk.a.e();
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f1941a) {
            case 4:
                U1.g gVar = (U1.g) ((r) this.f1942b).f9803b;
                AbstractC1955a.d(gVar);
                return gVar;
            default:
                ((Y) this.f1942b).getClass();
                return new V(1);
        }
    }

    @Override // W6.e
    public void onDismiss() {
        Object obj = this.f1942b;
        switch (this.f1941a) {
            case 20:
                MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) obj;
                mayaMLKitQRScannerFragment.Q1();
                ((Ja.b) mayaMLKitQRScannerFragment.H1()).f = false;
                ((Ja.b) mayaMLKitQRScannerFragment.H1()).f2499g = false;
                return;
            default:
                int i = MayaSettingsActivity.f13839r;
                MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) obj;
                MayaDisplayNameFragment mayaDisplayNameFragment = (MayaDisplayNameFragment) mayaSettingsActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaSettingsActivity, MayaDisplayNameFragment.class));
                if (mayaDisplayNameFragment != null) {
                    Ee.a aVarG1 = mayaDisplayNameFragment.G1();
                    SwitchCompat switchCompat = mayaDisplayNameFragment.f13978W;
                    if (switchCompat != null) {
                        aVarG1.k(switchCompat.isChecked());
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mShowMyNameSwitch");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception e) {
        kotlin.jvm.internal.j.g(e, "e");
        C0453g c0453g = ((MayaSendMoneyDecorationPreviewFragment) this.f1942b).f13763U;
        if (c0453g != null) {
            kotlin.jvm.internal.j.d(c0453g);
            ((C0437a1) c0453g.f4095d).c.setVisibility(0);
        }
    }

    @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
    public void onFail(int i, String str, String str2) {
        if (str == null) {
            str = "";
        }
        String version = HuiYanOsApi.getVersion();
        kotlin.jvm.internal.j.f(version, "getVersion(...)");
        ((MayaKycLivenessCaptureFragment) this.f1942b).J1(str, version, false);
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        C0453g c0453g = ((MayaSendMoneyDecorationPreviewFragment) this.f1942b).f13763U;
        if (c0453g != null) {
            kotlin.jvm.internal.j.d(c0453g);
            ((C0437a1) c0453g.f4095d).c.setVisibility(0);
        }
    }

    public d() {
        this.f1941a = 1;
        this.f1942b = new JSONObject();
    }

    @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
    public void onSuccess(HuiYanOsAuthResult authResult) {
        kotlin.jvm.internal.j.g(authResult, "authResult");
        String version = HuiYanOsApi.getVersion();
        kotlin.jvm.internal.j.f(version, "getVersion(...)");
        ((MayaKycLivenessCaptureFragment) this.f1942b).J1("", version, true);
    }
}
