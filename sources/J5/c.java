package J5;

import A7.A;
import A7.o;
import A7.u;
import Ch.f;
import D.S;
import D.d0;
import D8.C0194b;
import D8.C0196d;
import D8.C0214w;
import D8.D;
import D8.G;
import D8.N;
import E.h;
import E8.C;
import E9.i;
import F9.e;
import G6.k;
import G6.m;
import G6.p;
import G6.v;
import Gc.d;
import K6.g;
import K8.w;
import L6.InterfaceC0316b;
import L6.InterfaceC0320f;
import L6.q;
import N5.C0475q0;
import N5.C1;
import N5.Q;
import N5.k1;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.navigation.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import cj.L;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.AdditionalDocType;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.Fee;
import com.paymaya.domain.model.KycAdditionalDocsUploadResponse;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Base;
import com.paymaya.domain.model.MoneyInTopUpCode;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.TencentInitiateV2Response;
import com.paymaya.domain.model.UpdaterConfigDetails;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullLinkedAccountsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInPartnerFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInWebFragment;
import com.paymaya.mayaui.common.view.activity.impl.MayaMaintenanceActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSupportWebActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneSwornStatementFragment;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsCompletedFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsFragment;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import pg.t;
import v.AbstractC2329d;
import v5.C2342a;
import w.C2360b;
import w.C2361c;
import y5.s;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Ch.c, Ch.b, h, f {
    public static c c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2418b;

    public /* synthetic */ c() {
        this.f2417a = 0;
    }

    public static synchronized c d() {
        try {
            if (c == null) {
                c cVar = new c();
                cVar.f2418b = new HashMap();
                c = cVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        MaintenanceDynamicConfig maintenanceConfig = (MaintenanceDynamicConfig) obj;
        UpdaterConfigDetails updaterConfig = (UpdaterConfigDetails) obj2;
        j.g(maintenanceConfig, "maintenanceConfig");
        j.g(updaterConfig, "updaterConfig");
        B5.c cVar = (B5.c) this.f2418b;
        cVar.getClass();
        WeakReference weakReference = X5.f.e;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if ((!cVar.f354b.J() || maintenanceConfig.isAppMaintenance()) && !(activity instanceof MayaMaintenanceActivity) && !(activity instanceof MayaSupportWebActivity)) {
            B5.c.b();
        }
        return Unit.f18162a;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        int i = 0;
        switch (this.f2417a) {
            case 1:
                ((Function0) this.f2418b).invoke();
                return;
            case 2:
                j.g((Throwable) obj, "it");
                ((t) this.f2418b).success(L.c(new Pair("refresh_access_token_response", "false")));
                return;
            case 3:
            case 5:
            case 11:
            case 16:
            case 20:
            case 21:
            case 22:
            default:
                LoadUpPartner loadUpPartner = (LoadUpPartner) obj;
                j.g(loadUpPartner, "loadUpPartner");
                p pVar = (p) this.f2418b;
                pVar.getClass();
                ((MayaBaseFragment) ((K6.h) pVar.c.get())).w1();
                MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) ((K6.h) pVar.c.get());
                mayaCashInFragment.getClass();
                q qVar = mayaCashInFragment.f11690G0;
                if (qVar != null) {
                    String strMName = loadUpPartner.mName();
                    j.f(strMName, "mName(...)");
                    String strMSteps = loadUpPartner.mSteps();
                    String strMXhdpi = loadUpPartner.mIconUrl().mXhdpi();
                    MayaCashInPartnerFragment mayaCashInPartnerFragment = new MayaCashInPartnerFragment();
                    Bundle bundleE = androidx.media3.datasource.cache.c.e("steps", strMSteps, "icon", strMXhdpi);
                    bundleE.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, strMName);
                    mayaCashInPartnerFragment.setArguments(bundleE);
                    AbstractC1236z.i((MayaCashInActivity) qVar, R.id.frame_layout_container, mayaCashInPartnerFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                    return;
                }
                return;
            case 4:
                o oVar = (o) this.f2418b;
                PayMayaError payMayaErrorF = oVar.f((Throwable) obj, true);
                j.f(payMayaErrorF, "mayaErrorHandling(...)");
                oVar.m(payMayaErrorF);
                return;
            case 6:
                MissionV2Base missions = (MissionV2Base) obj;
                j.g(missions, "missions");
                B9.b bVar = (B9.b) this.f2418b;
                bVar.getClass();
                SpringView springView = ((MayaMissionsCompletedFragment) ((F9.a) bVar.c.get())).f12962r0;
                if (springView == null) {
                    j.n("mSpringView");
                    throw null;
                }
                springView.i();
                List<MissionV2> missions2 = missions.getMissions();
                if (missions2 == null || missions2.isEmpty()) {
                    RecyclerView recyclerView = ((MayaMissionsCompletedFragment) ((F9.a) bVar.c.get())).f12961q0;
                    if (recyclerView == null) {
                        j.n("missionsRecyclerView");
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                    Group group = ((MayaMissionsCompletedFragment) ((F9.a) bVar.c.get())).f12963s0;
                    if (group == null) {
                        j.n("emptyMissionsConstraintGroup");
                        throw null;
                    }
                    group.setVisibility(0);
                    ((MayaMissionsCompletedFragment) ((F9.a) bVar.c.get())).L1();
                    return;
                }
                ((MayaMissionsCompletedFragment) ((F9.a) bVar.c.get())).L1();
                List listQ = C1110A.Q(new B9.a(0), missions.getMissions());
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(listQ);
                MayaMissionsCompletedFragment mayaMissionsCompletedFragment = (MayaMissionsCompletedFragment) ((F9.a) bVar.c.get());
                mayaMissionsCompletedFragment.getClass();
                i iVar = mayaMissionsCompletedFragment.f12964v0;
                if (iVar != null) {
                    iVar.e(arrayList);
                }
                Group group2 = ((MayaMissionsCompletedFragment) ((F9.a) bVar.c.get())).f12963s0;
                if (group2 == null) {
                    j.n("emptyMissionsConstraintGroup");
                    throw null;
                }
                group2.setVisibility(8);
                RecyclerView recyclerView2 = ((MayaMissionsCompletedFragment) ((F9.a) bVar.c.get())).f12961q0;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                    return;
                } else {
                    j.n("missionsRecyclerView");
                    throw null;
                }
            case 7:
                MissionV2 mission = (MissionV2) obj;
                j.g(mission, "mission");
                MayaMissionsFragment mayaMissionsFragment = (MayaMissionsFragment) ((e) ((B9.c) this.f2418b).c.get());
                mayaMissionsFragment.getClass();
                G9.f fVar = mayaMissionsFragment.f13023s0;
                if (fVar != null) {
                    ((MayaMissionsActivity) fVar).X1(mission);
                    return;
                }
                return;
            case 8:
                Bb.e eVar = (Bb.e) this.f2418b;
                PayMayaError payMayaErrorF2 = eVar.f((Throwable) obj, true);
                j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                eVar.q(payMayaErrorF2);
                return;
            case 9:
                Bb.o oVar2 = (Bb.o) this.f2418b;
                PayMayaError payMayaErrorF3 = oVar2.f((Throwable) obj, false);
                j.f(payMayaErrorF3, "paymayaErrorHandling(...)");
                oVar2.k(payMayaErrorF3);
                return;
            case 10:
                Ze.a p02 = (Ze.a) obj;
                j.g(p02, "p0");
                Bb.p pVar2 = (Bb.p) this.f2418b;
                pVar2.getClass();
                if (p02.f6934b) {
                    pVar2.z();
                    return;
                }
                return;
            case 12:
                Throwable p03 = (Throwable) obj;
                j.g(p03, "p0");
                C0196d c0196d = (C0196d) this.f2418b;
                c0196d.getClass();
                c0196d.l(p03, null, null, new C0194b(c0196d, i));
                return;
            case 13:
                Throwable p04 = (Throwable) obj;
                j.g(p04, "p0");
                ((D) this.f2418b).B(p04);
                return;
            case 14:
                TencentInitiateV2Response it = (TencentInitiateV2Response) obj;
                j.g(it, "it");
                w wVar = (w) ((G) this.f2418b).c.get();
                String sdkToken = it.getSdkToken();
                if (sdkToken == null) {
                    sdkToken = "";
                }
                MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment = (MayaKycLivenessCaptureFragment) wVar;
                mayaKycLivenessCaptureFragment.getClass();
                v vVar = new v(mayaKycLivenessCaptureFragment, 21);
                mayaKycLivenessCaptureFragment.K1();
                HuiYanOsApi.startHuiYanAuth(sdkToken, mayaKycLivenessCaptureFragment.f14176W, vVar);
                return;
            case 15:
                N n7 = (N) this.f2418b;
                n7.getClass();
                C.b((KycAdditionalDocsUploadResponse) obj, "dnfbp_upload_response");
                C.b(AdditionalDocType.SSNE.getType(), "dnfbp_document_type");
                ConstraintLayout constraintLayout = ((C0475q0) ((MayaKycSsneSwornStatementFragment) ((K8.G) n7.c.get())).G1()).f4183a;
                j.f(constraintLayout, "getRoot(...)");
                E1.c.l(ViewKt.findNavController(constraintLayout), R.id.maya_kyc_ssne_sworn_statement_fragment, R.id.action_maya_kyc_ssne_sworn_statement_fragment_to_maya_kyc_complete_personal_information_fragment, null);
                return;
            case 17:
                C0214w c0214w = (C0214w) this.f2418b;
                PayMayaError payMayaErrorF4 = c0214w.f((Throwable) obj, true);
                j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                if (payMayaErrorF4.isNetworkError()) {
                    MayaVoucherDetailsFragment mayaVoucherDetailsFragment = (MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get());
                    MayaBaseLoadingFragment.N1(mayaVoucherDetailsFragment, 100, mayaVoucherDetailsFragment.getString(R.string.maya_label_connection_issue), null, new Gc.c(mayaVoucherDetailsFragment, 5), 28);
                    d dVar = mayaVoucherDetailsFragment.f14298M0;
                    if (dVar != null) {
                        ((MayaVouchersActivity) dVar).Q(mayaVoucherDetailsFragment);
                        return;
                    }
                    return;
                }
                Fc.b bVar2 = (Fc.b) c0214w.c.get();
                payMayaErrorF4.mSpiel();
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment2 = (MayaVoucherDetailsFragment) bVar2;
                MayaBaseLoadingFragment.N1(mayaVoucherDetailsFragment2, 200, mayaVoucherDetailsFragment2.getString(R.string.maya_label_loading_please_wait), mayaVoucherDetailsFragment2.getString(R.string.maya_label_that_didnt_load_right), new Gc.c(mayaVoucherDetailsFragment2, 6), 24);
                d dVar2 = mayaVoucherDetailsFragment2.f14298M0;
                if (dVar2 != null) {
                    ((MayaVouchersActivity) dVar2).Q(mayaVoucherDetailsFragment2);
                    return;
                }
                return;
            case 18:
                Dc.d dVar3 = (Dc.d) this.f2418b;
                PayMayaError payMayaErrorF5 = dVar3.f((Throwable) obj, false);
                j.f(payMayaErrorF5, "paymayaErrorHandling(...)");
                dVar3.l(payMayaErrorF5);
                return;
            case 19:
                Throwable it2 = (Throwable) obj;
                j.g(it2, "it");
                C0214w c0214w2 = (C0214w) this.f2418b;
                PayMayaError payMayaErrorF6 = c0214w2.f(it2, false);
                j.f(payMayaErrorF6, "paymayaErrorHandling(...)");
                k1 k1Var = ((InvestPreviewFragment) ((Gd.a) c0214w2.c.get())).f14613a0;
                j.d(k1Var);
                ((Q) k1Var.f).f3874d.setVisibility(8);
                k1 k1Var2 = ((InvestPreviewFragment) ((Gd.a) c0214w2.c.get())).f14613a0;
                j.d(k1Var2);
                ((Q) k1Var2.f).f3873b.setVisibility(8);
                c0214w2.v(payMayaErrorF6);
                return;
            case 23:
                ((F8.b) this.f2418b).a((Bitmap) obj);
                return;
            case 24:
                ExecutePullFunds executePullFunds = (ExecutePullFunds) obj;
                j.g(executePullFunds, "executePullFunds");
                C0214w c0214w3 = (C0214w) this.f2418b;
                s sVar = (K6.b) c0214w3.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.EXECUTE);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) c0214w3.f1106g;
                c1219hH.j.put("bank", bankPullPaymentOption != null ? bankPullPaymentOption.getId() : null);
                c1219hH.i();
                ((MayaBaseFragment) sVar).z1(c1219hH);
                K6.b bVar3 = (K6.b) c0214w3.c.get();
                BankPullPaymentOption bankPullPaymentOption2 = (BankPullPaymentOption) c0214w3.f1106g;
                MayaBankPullConfirmationFragment mayaBankPullConfirmationFragment = (MayaBankPullConfirmationFragment) bVar3;
                mayaBankPullConfirmationFragment.getClass();
                InterfaceC0316b interfaceC0316b = mayaBankPullConfirmationFragment.f11626a0;
                if (interfaceC0316b != null) {
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) interfaceC0316b;
                    MayaCashInWebFragment mayaCashInWebFragment = new MayaCashInWebFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("pullFunds", executePullFunds);
                    bundle.putParcelable("paymentOption", bankPullPaymentOption2);
                    mayaCashInWebFragment.setArguments(bundle);
                    AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, mayaCashInWebFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                    return;
                }
                return;
            case 25:
                G6.d dVar4 = (G6.d) this.f2418b;
                PayMayaError payMayaErrorF7 = dVar4.f((Throwable) obj, true);
                j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                if (payMayaErrorF7.isSessionTimeout()) {
                    return;
                }
                MayaBankPullLinkedAccountsFragment mayaBankPullLinkedAccountsFragment = (MayaBankPullLinkedAccountsFragment) ((K6.d) dVar4.c.get());
                mayaBankPullLinkedAccountsFragment.getClass();
                InterfaceC0320f interfaceC0320f = mayaBankPullLinkedAccountsFragment.f11638X;
                if (interfaceC0320f != null) {
                    ((MayaCashInActivity) interfaceC0320f).a(payMayaErrorF7, mayaBankPullLinkedAccountsFragment.getString(R.string.pma_toast_error_title_add_money_error));
                    return;
                }
                return;
            case 26:
                Throwable throwable = (Throwable) obj;
                j.g(throwable, "throwable");
                k kVar = (k) this.f2418b;
                PayMayaError payMayaErrorF8 = kVar.f(throwable, true);
                j.f(payMayaErrorF8, "mayaErrorHandling(...)");
                kVar.x(payMayaErrorF8);
                return;
            case 27:
                MoneyInTopUpCode moneyInCode = (MoneyInTopUpCode) obj;
                j.g(moneyInCode, "moneyInCode");
                s sVar2 = (g) ((m) this.f2418b).c.get();
                C1219h c1219hH2 = AbstractC2329d.h(14);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put("attribution", ((MayaBaseFragment) ((g) ((m) this.f2418b).c.get())).n1().f10371a);
                ((MayaBaseFragment) sVar2).A1(c1219hH2);
                m mVar = (m) this.f2418b;
                mVar.p(moneyInCode, (LoadUpPartner) mVar.h);
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 5) {
            throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
        }
        u uVar = (u) this.f2418b;
        Object obj2 = objArr[0];
        C2342a accountBalance = (C2342a) obj2;
        C2342a userActivities = (C2342a) objArr[1];
        C2342a c2342a = (C2342a) objArr[4];
        j.g(accountBalance, "accountBalance");
        j.g(userActivities, "userActivities");
        j.g(c2342a, "<unused var>");
        A a8 = uVar.f240b;
        a8.getClass();
        Object obj3 = accountBalance.f20476a;
        if ((obj3 == null) && userActivities.f20476a == null) {
            String string = ((MayaWalletFragment) ((F7.s) a8.c.get())).getString(R.string.pma_label_balance_and_recent_activities);
            j.f(string, "getString(...)");
            return string;
        }
        if (obj3 == null) {
            String string2 = ((MayaWalletFragment) ((F7.s) a8.c.get())).getString(R.string.pma_label_available_balance_error);
            j.f(string2, "getString(...)");
            return string2;
        }
        if (userActivities.f20476a != null) {
            return "";
        }
        String string3 = ((MayaWalletFragment) ((F7.s) a8.c.get())).getString(R.string.pma_label_recent_activities);
        j.f(string3, "getString(...)");
        return string3;
    }

    @Override // E.h
    public c0.f b(E.a aVar) {
        S.l("handling bitmap download request in NotificationBitmapDownloadRequestHandler....");
        String str = aVar.f1203a;
        boolean z4 = aVar.f1204b;
        Context context = aVar.c;
        return (str == null || C2576A.H(str)) ? d0.f(z4, context, new c0.f(null, c0.e.f9187b, -1L, null)) : d0.f(z4, context, ((C2361c) this.f2418b).b(aVar));
    }

    public Contact c(String str) {
        return (Contact) ((HashMap) this.f2418b).get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Type inference failed for: r2v1, types: [H7.b, androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(com.paymaya.domain.model.UserActivity r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.c.e(com.paymaya.domain.model.UserActivity, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [H7.b, androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    public void f(UserActivity userActivity, boolean z4, boolean z5) {
        String strT;
        ?? r02 = (RecyclerView.ViewHolder) this.f2418b;
        String strJ = r02.j();
        if (z5) {
            Amount amountMAmount = userActivity.mAmount();
            strT = amountMAmount != null ? amountMAmount.getFormattedValue() : null;
        } else {
            strT = r02.t();
        }
        r02.x((z4 ? "" : "- ") + strJ + strT);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [H7.b, androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    public void g(UserActivity userActivity, boolean z4, boolean z5) {
        Fee feeMFee = userActivity.mFee();
        ?? r1 = (RecyclerView.ViewHolder) this.f2418b;
        r1.k();
        String strJ = androidx.camera.core.impl.a.j(z4 ? "" : "- ", r1.j(), z5 ? feeMFee != null ? feeMFee.getFormattedValue() : null : r1.t());
        if ("Pay Bills".equalsIgnoreCase(userActivity.mType())) {
            r1.C(strJ);
            return;
        }
        String strMLabel = feeMFee != null ? feeMFee.mLabel() : null;
        if (strMLabel == null || C2576A.H(strMLabel)) {
            r1.g(strJ);
        } else {
            r1.p(feeMFee != null ? feeMFee.mLabel() : null, strJ);
        }
    }

    public void h(String str, String str2) {
        C1 c12 = ((Ic.d) this.f2418b).f2284a;
        c12.f3572d.setText(str);
        c12.c.setText(str2);
        c12.f3573g.setVisibility(0);
        c12.i.setVisibility(8);
    }

    public /* synthetic */ c(Object obj, int i) {
        this.f2417a = i;
        this.f2418b = obj;
    }

    public /* synthetic */ c(E1.e eVar) {
        this.f2417a = 21;
        C2361c c2361c = new C2361c(eVar, 19);
        int i = 4;
        this.f2418b = F1.b.a(new C2360b(F1.b.a(new Cg.c(i, F1.b.a(new A7.f(11, c2361c, F1.b.a(new a(c2361c, 23)))), F1.b.a(new V2.c(c2361c, 19)), c2361c)), 19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(H7.b bVar) {
        this.f2417a = 3;
        this.f2418b = (RecyclerView.ViewHolder) bVar;
    }
}
