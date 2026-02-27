package w;

import A5.l;
import A7.o;
import Ch.f;
import D.C0190x;
import D.U;
import D.V;
import D8.C0194b;
import D8.C0196d;
import D8.C0200h;
import D8.C0217z;
import D8.E;
import E.h;
import E9.i;
import F9.g;
import Fb.d;
import G6.k;
import G6.x;
import K6.p;
import K8.InterfaceC0279d;
import K8.v;
import L6.H;
import L6.InterfaceC0319e;
import L6.ViewOnClickListenerC0321g;
import W6.e;
import We.InterfaceC0604h;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.KycCmsAddressApi;
import com.paymaya.domain.model.AccountLimitAmount;
import com.paymaya.domain.model.AccountLimitType;
import com.paymaya.domain.model.AccountLimits;
import com.paymaya.domain.model.AutoCashInCustomerSetup;
import com.paymaya.domain.model.AutoCashInCustomerSetupTimeBased;
import com.paymaya.domain.model.DateHeader;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentDataKt;
import com.paymaya.domain.model.KycPreSubmissionId;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Action;
import com.paymaya.domain.model.MissionV2Base;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ReKycCriteriaBase;
import com.paymaya.domain.model.ReKycCriteriaPromptGuide;
import com.paymaya.domain.model.WesternUnionTransaction;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaAutoCashinWalletSettingsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionFragment;
import com.paymaya.mayaui.cashin.view.widget.MayaCashInAccountLimitSection;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUpdateNameFlutterScreen;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycInitialLoadingFragment;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsDetailsFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeBottomSheetFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeSuccessBottomSheetFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsInProgressFragment;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycNudgeActivity;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycSubmittedActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyOTPFragment;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipInputStream;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import n.AbstractC1883j;
import n.w;
import v.AbstractC2329d;
import v5.C2342a;
import y5.s;
import z.AbstractC2540b;

/* JADX INFO: renamed from: w.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2361c implements Ch.c, e, h, F1.c, f, InterfaceC0604h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20518b;

    public /* synthetic */ C2361c(Object obj, int i) {
        this.f20517a = i;
        this.f20518b = obj;
    }

    public static U c(Number number) {
        if (number.equals(Integer.valueOf(number.intValue()))) {
            return U.f883a;
        }
        if (number.equals(Double.valueOf(number.doubleValue()))) {
            return U.c;
        }
        if (number.equals(Float.valueOf(number.floatValue()))) {
            return U.f884b;
        }
        return null;
    }

    public static Number d(Number value, String str, Number number) {
        int i;
        j.g(value, "value");
        String strTnTj78 = numX49.tnTj78("bbmb");
        String strTnTj782 = numX49.tnTj78("bbm2");
        if (number == null) {
            U uC = c(value);
            i = uC != null ? V.f886a[uC.ordinal()] : -1;
            if (i == 1) {
                if (str.equals(strTnTj782)) {
                    return Double.valueOf(value.doubleValue());
                }
                if (str.equals(strTnTj78)) {
                    return Double.valueOf(-value.doubleValue());
                }
                return null;
            }
            if (i != 2) {
                if (str.equals(strTnTj782)) {
                    return Integer.valueOf(value.intValue());
                }
                if (str.equals(strTnTj78)) {
                    return Integer.valueOf(-value.intValue());
                }
                return null;
            }
            if (str.equals(strTnTj782)) {
                return Float.valueOf(value.floatValue());
            }
            if (str.equals(strTnTj78)) {
                return Float.valueOf(-value.floatValue());
            }
            return null;
        }
        U uC2 = c(number);
        i = uC2 != null ? V.f886a[uC2.ordinal()] : -1;
        if (i == 1) {
            if (str.equals(strTnTj782)) {
                return Double.valueOf(value.doubleValue() + number.doubleValue());
            }
            if (str.equals(strTnTj78)) {
                return Double.valueOf(number.doubleValue() - value.doubleValue());
            }
            return null;
        }
        if (i != 2) {
            if (str.equals(strTnTj782)) {
                return Integer.valueOf(value.intValue() + number.intValue());
            }
            if (str.equals(strTnTj78)) {
                return Integer.valueOf(number.intValue() - value.intValue());
            }
            return null;
        }
        if (str.equals(strTnTj782)) {
            return Float.valueOf(value.floatValue() + number.floatValue());
        }
        if (str.equals(strTnTj78)) {
            return Float.valueOf(number.floatValue() - value.floatValue());
        }
        return null;
    }

    public w a(String str, InputStream inputStream, String str2, String str3) {
        EnumC2359a enumC2359a;
        w wVarF;
        if (str2 == null) {
            str2 = numX49.tnTj78("bbmL");
        }
        boolean zContains = str2.contains(numX49.tnTj78("bbmr"));
        C2360b c2360b = (C2360b) this.f20518b;
        if (zContains || str.split(numX49.tnTj78("bbmZ"))[0].endsWith(numX49.tnTj78("bbmk"))) {
            AbstractC2540b.a();
            enumC2359a = EnumC2359a.c;
            wVarF = str3 == null ? AbstractC1883j.f(new ZipInputStream(inputStream), null) : AbstractC1883j.f(new ZipInputStream(new FileInputStream(c2360b.e(str, inputStream, enumC2359a))), str);
        } else {
            AbstractC2540b.a();
            enumC2359a = EnumC2359a.f20512b;
            wVarF = str3 == null ? AbstractC1883j.c(inputStream, null) : AbstractC1883j.c(new FileInputStream(new File(c2360b.e(str, inputStream, enumC2359a).getAbsolutePath())), str);
        }
        if (str3 != null && wVarF.f18531a != null) {
            File file = new File(c2360b.c(), C2360b.b(str, enumC2359a, true));
            File file2 = new File(file.getAbsolutePath().replace(numX49.tnTj78("bbmB"), numX49.tnTj78("bbmu")));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            AbstractC2540b.a();
            if (!zRenameTo) {
                AbstractC2540b.b(numX49.tnTj78("bbmV") + file.getAbsolutePath() + numX49.tnTj78("bbmS") + file2.getAbsolutePath() + numX49.tnTj78("bbmj"));
            }
        }
        return wVarF;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        MayaLoadingDialogFragment mayaLoadingDialogFragment;
        String preSubmissionId;
        Object next;
        int i = 12;
        int i4 = 2;
        String strTnTj78 = numX49.tnTj78("bbmd");
        String strTnTj782 = numX49.tnTj78("bbmi");
        int i6 = 14;
        String strTnTj783 = numX49.tnTj78("bbmE");
        String strTnTj784 = numX49.tnTj78("bbmF");
        DateHeader dateHeader = null;
        int i10 = 0;
        int i11 = 1;
        switch (this.f20517a) {
            case 1:
                ReKycCriteriaBase reKycCriteriaBase = (ReKycCriteriaBase) obj;
                j.g(reKycCriteriaBase, strTnTj782);
                A7.b bVar = (A7.b) this.f20518b;
                Iterator<ReKycCriteriaPromptGuide> it = reKycCriteriaBase.getPromptGuides().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ReKycCriteriaPromptGuide next2 = it.next();
                        String strW = bVar.f196d.w();
                        j.f(strW, numX49.tnTj78("bbmX"));
                        boolean zMatchesReason = next2.matchesReason(strW);
                        String strX = bVar.f196d.x();
                        j.f(strX, numX49.tnTj78("bbmG"));
                        boolean zMatchesStatus = next2.matchesStatus(strX);
                        if (zMatchesReason && zMatchesStatus) {
                            strTnTj78 = next2.getAction().getCode();
                        }
                    }
                }
                int iHashCode = strTnTj78.hashCode();
                if (iHashCode == -1052820213) {
                    if (strTnTj78.equals(numX49.tnTj78("bbm7"))) {
                        MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) ((B7.a) bVar.c.get());
                        mayaDashboardActivity.n1();
                        mayaDashboardActivity.startActivity(new Intent(mayaDashboardActivity, (Class<?>) ReKycSubmittedActivity.class));
                        return;
                    }
                    return;
                }
                if (iHashCode != -120426191) {
                    if (iHashCode == 1531406207 && strTnTj78.equals(numX49.tnTj78("bbm3"))) {
                        ((MayaDashboardActivity) ((B7.a) bVar.c.get())).q2();
                        return;
                    }
                    return;
                }
                if (strTnTj78.equals(numX49.tnTj78("bbmy"))) {
                    SharedPreferences sharedPreferences = bVar.f196d.f11330b;
                    String strTnTj785 = numX49.tnTj78("bbmv");
                    if (sharedPreferences.getBoolean(strTnTj785, false)) {
                        return;
                    }
                    androidx.camera.core.impl.a.A(bVar.f196d.f11330b, strTnTj785, true);
                    MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) ((B7.a) bVar.c.get());
                    mayaDashboardActivity2.n1();
                    mayaDashboardActivity2.startActivity(new Intent(mayaDashboardActivity2, (Class<?>) ReKycNudgeActivity.class));
                    return;
                }
                return;
            case 2:
            case 5:
            case 10:
            case 16:
            case 18:
            case 19:
            case 20:
            case 26:
            default:
                j.g((Throwable) obj, numX49.tnTj78("bbmH"));
                ((MayaUpdateNameFlutterScreen) this.f20518b).g1().p0(strTnTj78);
                yk.a.b();
                return;
            case 3:
                List<Dated> userActivityList = (List) obj;
                j.g(userActivityList, "userActivityList");
                o oVar = (o) this.f20518b;
                oVar.getClass();
                ((MayaTransactionsFragment) ((F7.c) oVar.c.get())).L1();
                ((MayaTransactionsFragment) ((F7.c) oVar.c.get())).Q1(false);
                ArrayList arrayList = new ArrayList();
                for (Dated dated : userActivityList) {
                    if (dateHeader == null || !dateHeader.getLocalDateTime().withTimeAtStartOfDay().isEqual(dated.getLocalDateTime().withTimeAtStartOfDay())) {
                        dateHeader = new DateHeader(dated.getLocalDateTime().withTime(23, 59, 59, 999));
                        arrayList.add(dateHeader);
                    }
                }
                arrayList.addAll(userActivityList);
                Collections.sort(arrayList, oVar.f230l);
                MayaTransactionsFragment mayaTransactionsFragment = (MayaTransactionsFragment) ((F7.c) oVar.c.get());
                mayaTransactionsFragment.getClass();
                D7.h hVar = mayaTransactionsFragment.t0;
                if (hVar != null) {
                    ArrayList arrayList2 = hVar.c;
                    j.g(arrayList2, numX49.tnTj78("bbm6"));
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new D7.e(arrayList, arrayList2));
                    j.f(diffResultCalculateDiff, numX49.tnTj78("bbma"));
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    diffResultCalculateDiff.dispatchUpdatesTo(hVar);
                }
                ((MayaBaseLoadingFragment) ((F7.c) oVar.c.get())).f10359n0 = true;
                return;
            case 4:
                MaintenanceDynamicConfig maintenanceDynamicConfig = (MaintenanceDynamicConfig) obj;
                j.g(maintenanceDynamicConfig, numX49.tnTj78("bbmN"));
                maintenanceDynamicConfig.toString();
                yk.a.h();
                ((B5.c) this.f20518b).f354b.Q(maintenanceDynamicConfig.isAppMaintenance());
                return;
            case 6:
                MissionV2 updatedMission = (MissionV2) obj;
                j.g(updatedMission, "updatedMission");
                B9.c cVar = (B9.c) this.f20518b;
                ((MayaBaseBottomSheetDialogFragment) ((F9.c) cVar.c.get())).r1(AbstractC2329d.h(14));
                G9.e eVar = ((MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) cVar.c.get())).f12991W;
                if (eVar != null && (mayaLoadingDialogFragment = ((MayaMissionsActivity) eVar).f12955o) != null) {
                    mayaLoadingDialogFragment.dismissAllowingStateLoss();
                }
                MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment = (MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) cVar.c.get());
                mayaMissionsEnterCodeBottomSheetFragment.getClass();
                G9.e eVar2 = mayaMissionsEnterCodeBottomSheetFragment.f12991W;
                if (eVar2 != null) {
                    MissionV2Action missionV2Action = mayaMissionsEnterCodeBottomSheetFragment.f12989U;
                    MayaMissionsActivity mayaMissionsActivity = (MayaMissionsActivity) eVar2;
                    MayaMissionsDetailsFragment mayaMissionsDetailsFragment = (MayaMissionsDetailsFragment) mayaMissionsActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaMissionsActivity, MayaMissionsDetailsFragment.class));
                    MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment = new MayaMissionsEnterCodeSuccessBottomSheetFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("updated_mission", updatedMission);
                    bundle.putParcelable(numX49.tnTj78("bbmM"), missionV2Action);
                    mayaMissionsEnterCodeSuccessBottomSheetFragment.setArguments(bundle);
                    mayaMissionsEnterCodeSuccessBottomSheetFragment.setTargetFragment(mayaMissionsDetailsFragment, 1190);
                    mayaMissionsEnterCodeSuccessBottomSheetFragment.show(mayaMissionsActivity.getSupportFragmentManager(), mayaMissionsEnterCodeSuccessBottomSheetFragment.getTag());
                }
                mayaMissionsEnterCodeBottomSheetFragment.dismiss();
                return;
            case 7:
                MissionV2Base missionV2Base = (MissionV2Base) obj;
                j.g(missionV2Base, numX49.tnTj78("bbmc"));
                B9.b bVar2 = (B9.b) this.f20518b;
                bVar2.getClass();
                SpringView springView = ((MayaMissionsInProgressFragment) ((g) bVar2.c.get())).f13035r0;
                if (springView == null) {
                    j.n(numX49.tnTj78("bbmh"));
                    throw null;
                }
                springView.i();
                List<MissionV2> missions = missionV2Base.getMissions();
                String strTnTj786 = numX49.tnTj78("bbmm");
                String strTnTj787 = numX49.tnTj78("bbmD");
                if (missions == null || missions.isEmpty()) {
                    RecyclerView recyclerView = ((MayaMissionsInProgressFragment) ((g) bVar2.c.get())).f13034q0;
                    if (recyclerView == null) {
                        j.n(strTnTj786);
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                    Group group = ((MayaMissionsInProgressFragment) ((g) bVar2.c.get())).f13036s0;
                    if (group == null) {
                        j.n(strTnTj787);
                        throw null;
                    }
                    group.setVisibility(0);
                    ((MayaMissionsInProgressFragment) ((g) bVar2.c.get())).L1();
                    return;
                }
                ((MayaMissionsInProgressFragment) ((g) bVar2.c.get())).L1();
                List listQ = C1110A.Q(new B9.a(4), missionV2Base.getMissions());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(listQ);
                MayaMissionsInProgressFragment mayaMissionsInProgressFragment = (MayaMissionsInProgressFragment) ((g) bVar2.c.get());
                mayaMissionsInProgressFragment.getClass();
                i iVar = mayaMissionsInProgressFragment.f13037v0;
                if (iVar != null) {
                    iVar.e(arrayList3);
                }
                Group group2 = ((MayaMissionsInProgressFragment) ((g) bVar2.c.get())).f13036s0;
                if (group2 == null) {
                    j.n(strTnTj787);
                    throw null;
                }
                group2.setVisibility(8);
                RecyclerView recyclerView2 = ((MayaMissionsInProgressFragment) ((g) bVar2.c.get())).f13034q0;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                    return;
                } else {
                    j.n(strTnTj786);
                    throw null;
                }
            case 8:
                Bb.e eVar3 = (Bb.e) this.f20518b;
                PayMayaError payMayaErrorF = eVar3.f((Throwable) obj, true);
                j.f(payMayaErrorF, strTnTj784);
                eVar3.q(payMayaErrorF);
                return;
            case 9:
                Bb.o oVar2 = (Bb.o) this.f20518b;
                PayMayaError payMayaErrorF2 = oVar2.f((Throwable) obj, true);
                j.f(payMayaErrorF2, strTnTj784);
                ((MayaBaseFragment) ((d) oVar2.c.get())).w1();
                boolean zIsNetworkError = payMayaErrorF2.isNetworkError();
                String strTnTj788 = numX49.tnTj78("bbmw");
                if (zIsNetworkError) {
                    s sVar = (d) oVar2.c.get();
                    C1219h c1219hH = AbstractC2329d.h(12);
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH.j.put(strTnTj788, payMayaErrorF2.mSpiel());
                    c1219hH.i();
                    ((MayaBaseFragment) sVar).A1(c1219hH);
                    ((MayaSendMoneyOTPFragment) ((d) oVar2.c.get())).Y1(payMayaErrorF2);
                    return;
                }
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                s sVar2 = (d) oVar2.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(strTnTj788, payMayaErrorF2.mSpiel());
                c1219hH2.i();
                ((MayaBaseFragment) sVar2).A1(c1219hH2);
                if (payMayaErrorF2.mErrorCode() == -340) {
                    ((MayaSendMoneyOTPFragment) ((d) oVar2.c.get())).X1(payMayaErrorF2);
                    return;
                } else {
                    ((MayaSendMoneyOTPFragment) ((d) oVar2.c.get())).Y1(payMayaErrorF2);
                    return;
                }
            case 11:
                Throwable th2 = (Throwable) obj;
                j.g(th2, strTnTj783);
                C0196d c0196d = (C0196d) this.f20518b;
                c0196d.getClass();
                C8.a.m(c0196d, th2, null, new C0194b(c0196d, i11), 6);
                return;
            case 12:
                Throwable th3 = (Throwable) obj;
                j.g(th3, strTnTj783);
                C0200h c0200h = (C0200h) this.f20518b;
                c0200h.getClass();
                c0200h.l(th3, new C0190x(0, c0200h.c.get(), InterfaceC0279d.class, "showPreSubmissionIdInvalidError", "showPreSubmissionIdInvalidError()V", 0, 5), null, new Ag.d(c0200h, 7));
                return;
            case 13:
                Throwable th4 = (Throwable) obj;
                j.g(th4, strTnTj783);
                C0217z c0217z = (C0217z) this.f20518b;
                c0217z.getClass();
                c0217z.l(th4, null, null, new Ag.d(c0217z, 9));
                return;
            case 14:
                Pair pair = (Pair) obj;
                j.g(pair, strTnTj783);
                E e = (E) this.f20518b;
                e.getClass();
                if (KycCmsContentDataKt.getDocuments(((KycCmsContent) pair.f18160a).getData(), e.h.I()).isEmpty() || (preSubmissionId = ((KycPreSubmissionId) pair.f18161b).getPreSubmissionId()) == null || preSubmissionId.length() == 0) {
                    ((MayaKycInitialLoadingFragment) ((v) e.c.get())).b0(-1);
                    return;
                }
                e.h.a0(((KycPreSubmissionId) pair.f18161b).getPreSubmissionId());
                v vVar = (v) e.c.get();
                KycCmsContent kycCmsContent = (KycCmsContent) pair.f18160a;
                MayaKycInitialLoadingFragment mayaKycInitialLoadingFragment = (MayaKycInitialLoadingFragment) vVar;
                mayaKycInitialLoadingFragment.getClass();
                j.g(kycCmsContent, numX49.tnTj78("bbm4"));
                KeyEventDispatcher.Component componentRequireActivity = mayaKycInitialLoadingFragment.requireActivity();
                j.e(componentRequireActivity, numX49.tnTj78("bbmo"));
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f = kycCmsContent;
                if (e.h.e().isShortenedFlowAddressDropdownEnabled()) {
                    new Lh.d(new Lh.d(new Lh.h(((KycCmsAddressApi) ((R4.i) e.i).f5470b).getProvinces(-1, numX49.tnTj78("bbmK")).h(Th.e.c), zh.b.a(), i10), new l(e, i), i4), new C2360b(e, i6), i10).e();
                    return;
                } else {
                    e.o();
                    return;
                }
            case 15:
                ((Ag.f) this.f20518b).invoke(((C2342a) obj).f20476a);
                return;
            case 17:
                io.reactivex.rxjava3.disposables.b bVar3 = (io.reactivex.rxjava3.disposables.b) obj;
                j.g(bVar3, strTnTj782);
                ((Dc.d) this.f20518b).e(bVar3);
                return;
            case 21:
                AutoCashInCustomerSetup autoCashInCustomerSetup = (AutoCashInCustomerSetup) obj;
                j.g(autoCashInCustomerSetup, numX49.tnTj78("bbm8"));
                List<AutoCashInCustomerSetupTimeBased> timeBased = autoCashInCustomerSetup.getTimeBased();
                String strTnTj789 = numX49.tnTj78("bbmC");
                if ((timeBased == null || !(!timeBased.isEmpty())) && (autoCashInCustomerSetup.getAmountBased() == null || !j.b(autoCashInCustomerSetup.getAmountBased().getEnabled(), Boolean.TRUE))) {
                    AppCompatTextView appCompatTextView = ((MayaAutoCashinWalletSettingsFragment) ((K6.a) ((A7.j) this.f20518b).c.get())).f11616W;
                    if (appCompatTextView == null) {
                        j.n(strTnTj789);
                        throw null;
                    }
                    appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maya_ic_auto_cashin, 0, R.drawable.maya_ic_auto_cashin_off, 0);
                } else {
                    AppCompatTextView appCompatTextView2 = ((MayaAutoCashinWalletSettingsFragment) ((K6.a) ((A7.j) this.f20518b).c.get())).f11616W;
                    if (appCompatTextView2 == null) {
                        j.n(strTnTj789);
                        throw null;
                    }
                    appCompatTextView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maya_ic_auto_cashin, 0, R.drawable.maya_ic_auto_cashin_on, 0);
                }
                ((MayaAutoCashinWalletSettingsFragment) ((K6.a) ((A7.j) this.f20518b).c.get())).w1();
                return;
            case 22:
                G6.c cVar2 = (G6.c) this.f20518b;
                PayMayaError payMayaErrorF3 = cVar2.f((Throwable) obj, true);
                j.f(payMayaErrorF3, strTnTj784);
                if (payMayaErrorF3.isSessionTimeout()) {
                    return;
                }
                MayaBankPullFragment mayaBankPullFragment = (MayaBankPullFragment) ((K6.c) cVar2.c.get());
                mayaBankPullFragment.getClass();
                InterfaceC0319e interfaceC0319e = mayaBankPullFragment.f11631r0;
                if (interfaceC0319e != null) {
                    ((MayaCashInActivity) interfaceC0319e).a(payMayaErrorF3, mayaBankPullFragment.getString(R.string.pma_toast_error_title_add_money_error));
                    return;
                }
                return;
            case 23:
                Throwable th5 = (Throwable) obj;
                j.g(th5, strTnTj782);
                G6.g gVar = (G6.g) this.f20518b;
                PayMayaError payMayaErrorF4 = gVar.f(th5, true);
                j.f(payMayaErrorF4, strTnTj784);
                if (payMayaErrorF4.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF4.isNetworkError()) {
                    MayaBankPullV2Fragment mayaBankPullV2Fragment = (MayaBankPullV2Fragment) ((K6.e) gVar.c.get());
                    mayaBankPullV2Fragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaBankPullV2Fragment, 100, null, null, new ViewOnClickListenerC0321g(mayaBankPullV2Fragment, 2), 30);
                    return;
                } else {
                    K6.e eVar4 = (K6.e) gVar.c.get();
                    j.f(payMayaErrorF4.mSpiel(), numX49.tnTj78("bbme"));
                    MayaBankPullV2Fragment mayaBankPullV2Fragment2 = (MayaBankPullV2Fragment) eVar4;
                    mayaBankPullV2Fragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaBankPullV2Fragment2, 200, null, null, new ViewOnClickListenerC0321g(mayaBankPullV2Fragment2, 1), 30);
                    return;
                }
            case 24:
                AccountLimits accountLimits = (AccountLimits) obj;
                j.g(accountLimits, strTnTj783);
                k kVar = (k) this.f20518b;
                List<AccountLimitType> listMAccountLimitTypesMonthly = accountLimits.mAccountLimitTypesMonthly();
                j.f(listMAccountLimitTypesMonthly, numX49.tnTj78("bbmO"));
                Iterator<T> it2 = listMAccountLimitTypesMonthly.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (numX49.tnTj78("bbmQ").equals(((AccountLimitType) next).mType())) {
                        }
                    } else {
                        next = null;
                    }
                }
                AccountLimitType accountLimitType = (AccountLimitType) next;
                AccountLimitAmount accountLimitAmountMAmount = accountLimitType != null ? accountLimitType.mAmount() : null;
                String strTnTj7810 = numX49.tnTj78("bbmt");
                if (accountLimitAmountMAmount != null) {
                    kVar.m = accountLimitAmountMAmount;
                    MayaCashInAccountLimitSection mayaCashInAccountLimitSection = ((MayaCashInCodeFormFragment) ((K6.f) kVar.c.get())).t0;
                    if (mayaCashInAccountLimitSection == null) {
                        j.n(strTnTj7810);
                        throw null;
                    }
                    mayaCashInAccountLimitSection.setVisibility(0);
                    String strI = We.s.i(((MayaCashInCodeFormFragment) ((K6.f) kVar.c.get())).T1(), C.u(Double.valueOf(accountLimitAmountMAmount.mRemaining())));
                    MayaCashInAccountLimitSection mayaCashInAccountLimitSection2 = ((MayaCashInCodeFormFragment) ((K6.f) kVar.c.get())).t0;
                    if (mayaCashInAccountLimitSection2 == null) {
                        j.n(strTnTj7810);
                        throw null;
                    }
                    mayaCashInAccountLimitSection2.setRemainingValue(strI);
                    MayaCashInAccountLimitSection mayaCashInAccountLimitSection3 = ((MayaCashInCodeFormFragment) ((K6.f) kVar.c.get())).t0;
                    if (mayaCashInAccountLimitSection3 == null) {
                        j.n(strTnTj7810);
                        throw null;
                    }
                    mayaCashInAccountLimitSection3.a();
                    MayaCashInCodeFormFragment mayaCashInCodeFormFragment = (MayaCashInCodeFormFragment) ((K6.f) kVar.c.get());
                    MayaInputLayout mayaInputLayout = mayaCashInCodeFormFragment.f11655r0;
                    if (mayaInputLayout == null) {
                        j.n(numX49.tnTj78("bbmU"));
                        throw null;
                    }
                    mayaInputLayout.getInputEditText().addTextChangedListener(new L6.l(mayaCashInCodeFormFragment, i10));
                } else {
                    kVar.m = null;
                    MayaCashInAccountLimitSection mayaCashInAccountLimitSection4 = ((MayaCashInCodeFormFragment) ((K6.f) kVar.c.get())).t0;
                    if (mayaCashInAccountLimitSection4 == null) {
                        j.n(strTnTj7810);
                        throw null;
                    }
                    mayaCashInAccountLimitSection4.setVisibility(8);
                }
                ((MayaCashInCodeFormFragment) ((K6.f) kVar.c.get())).W1();
                return;
            case 25:
                G6.s sVar3 = (G6.s) this.f20518b;
                PayMayaError payMayaErrorF5 = sVar3.f((Throwable) obj, true);
                j.f(payMayaErrorF5, strTnTj784);
                sVar3.l(payMayaErrorF5);
                return;
            case 27:
                WesternUnionTransaction westernUnionTransaction = (WesternUnionTransaction) obj;
                j.g(westernUnionTransaction, "westernUnionTransaction");
                x xVar = (x) this.f20518b;
                xVar.getClass();
                s sVar4 = (p) xVar.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(14);
                c1219hH3.t(EnumC1217f.CREATE);
                ((MayaBaseFragment) sVar4).A1(c1219hH3);
                MayaWesternUnionFragment mayaWesternUnionFragment = (MayaWesternUnionFragment) ((p) xVar.c.get());
                mayaWesternUnionFragment.getClass();
                H h = mayaWesternUnionFragment.f11780Z;
                if (h != null) {
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) h;
                    MayaWesternUnionConfirmationFragment mayaWesternUnionConfirmationFragment = new MayaWesternUnionConfirmationFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("western_union", westernUnionTransaction);
                    mayaWesternUnionConfirmationFragment.setArguments(bundle2);
                    AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, mayaWesternUnionConfirmationFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                    return;
                }
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 3) {
            throw new IllegalArgumentException(numX49.tnTj78("bbmA") + objArr.length);
        }
        return ((Ch.d) this.f20518b).b(objArr[0], objArr[1], objArr[2]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r13.isConnected() != false) goto L22;
     */
    @Override // E.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0.f b(E.a r13) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2361c.b(E.a):c0.f");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:(1:(10:9|31|(6:34|110|35|122|39|32)|120|40|114|41|(8:44|(1:46)|49|(1:51)(1:52)|53|(2:123|55)(1:57)|56|42)|124|(1:134)(15:63|(1:65)(1:66)|67|(1:69)(1:70)|71|(1:75)|76|(2:(3:112|79|(2:81|128)(1:127))(2:82|(2:84|126)(1:129))|85)|125|(3:89|(5:91|118|92|(2:94|131)(1:132)|95)|130)|(1:98)|99|(1:101)|102|(2:104|133)(2:105|106)))(1:10))(2:11|(1:13)(5:(1:15)(1:16)|116|17|(4:21|(1:23)|24|(1:26)(1:27))|(1:29)(1:30))))(1:5)|6|31|(1:32)|120|40|114|41|(1:42)|124|(1:134)(1:62)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
    
        D.S.o(dOYHB6.tiZVw8.numX49.tnTj78("bbmPP").concat(r19), r0);
        r0 = o0.b.a(new java.lang.String[]{r19}, 512, 1);
        r7.b(r0);
        D.S.l(r0.f18752b);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:41:0x009f, B:42:0x00ad, B:44:0x00b3, B:46:0x00c6, B:49:0x00cc, B:51:0x00d0, B:53:0x00d6, B:55:0x00dc, B:57:0x00ee), top: B:114:0x009f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONArray e(java.lang.String r19, org.json.JSONArray r20, java.lang.String r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2361c.e(java.lang.String, org.json.JSONArray, java.lang.String, java.lang.Object):org.json.JSONArray");
    }

    @Override // W6.e
    public void onDismiss() {
        MayaMissionsActivity mayaMissionsActivity = (MayaMissionsActivity) this.f20518b;
        mayaMissionsActivity.Y1(mayaMissionsActivity.f12956p, mayaMissionsActivity.f12957q);
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception exc) {
        ((Group) this.f20518b).setVisibility(8);
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        ((Group) this.f20518b).setVisibility(0);
    }

    @Override // F1.c
    public Object zza() {
        return ((E1.e) this.f20518b).f1229a;
    }

    public C2361c(I7.e eVar, com.paymaya.data.preference.a aVar) {
        this.f20517a = 2;
        j.g(aVar, numX49.tnTj78("bbmP"));
        this.f20518b = eVar;
    }

    public C2361c(o0.d dVar, o0.c cVar) {
        this.f20517a = 10;
        this.f20518b = cVar;
    }

    public C2361c(C2360b c2360b, p3.s sVar) {
        this.f20517a = 0;
        this.f20518b = c2360b;
    }
}
