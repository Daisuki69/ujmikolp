package A5;

import A7.o;
import D.C0190x;
import D8.C0194b;
import D8.C0196d;
import D8.C0198f;
import D8.C0214w;
import D8.E;
import D8.F;
import E8.A;
import G6.p;
import K8.InterfaceC0278c;
import K8.v;
import K8.w;
import Kh.T;
import L6.G;
import L6.t;
import M8.C0332a;
import M8.T2;
import N5.C0450f;
import N5.k1;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.ImageProxy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import cj.C1112C;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.KycCmsAddressContentData;
import com.paymaya.domain.model.KycCmsAddressProvince;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Base;
import com.paymaya.domain.model.MissionsV2ListItem;
import com.paymaya.domain.model.MoneyInTopUpCode;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PushNotification;
import com.paymaya.domain.model.SevenElevenPushNotification;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.model.VoucherBase;
import com.paymaya.domain.model.WesternUnionTransaction;
import com.paymaya.domain.store.C1262h0;
import com.paymaya.domain.store.C1272m0;
import com.paymaya.domain.store.T0;
import com.paymaya.domain.store.U0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInWebFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionConfirmationFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycInitialLoadingFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsDetailsFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsHomeFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyDecorationPreviewFragment;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import defpackage.AbstractC1414e;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import v.AbstractC2329d;
import w.C2360b;
import y5.s;
import ya.C2516a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Ch.c, Ch.f, C.l, t4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f175b;

    public /* synthetic */ l(Object obj, int i) {
        this.f174a = i;
        this.f175b = obj;
    }

    public static Bitmap a(ImageProxy imageProxy, Rect rect) {
        Bitmap bitmap = imageProxy.toBitmap();
        kotlin.jvm.internal.j.f(bitmap, "toBitmap(...)");
        Rect cropRect = imageProxy.getCropRect();
        kotlin.jvm.internal.j.f(cropRect, "getCropRect(...)");
        int i = cropRect.left;
        int i4 = rect.left + i;
        int i6 = cropRect.top;
        Rect rect2 = new Rect(i4, rect.top + i6, i + rect.right, i6 + rect.bottom);
        if (!cropRect.contains(rect2)) {
            bitmap.recycle();
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect2.left, rect2.top, rect2.width(), rect2.height());
        kotlin.jvm.internal.j.f(bitmapCreateBitmap, "createBitmap(...)");
        bitmap.recycle();
        int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
        if (rotationDegrees == 0) {
            return bitmapCreateBitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(rotationDegrees);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
        kotlin.jvm.internal.j.f(bitmapCreateBitmap2, "createBitmap(...)");
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }

    public static boolean c(String str, List feedbackList) {
        kotlin.jvm.internal.j.g(feedbackList, "feedbackList");
        A[] aArr = A.f1264a;
        Float f = (Float) C1110A.C(0, feedbackList);
        if (f != null) {
            float fFloatValue = f.floatValue();
            Float f3 = (Float) C1110A.C(1, feedbackList);
            if (f3 != null) {
                float fFloatValue2 = f3.floatValue();
                Float f7 = (Float) C1110A.C(2, feedbackList);
                if (f7 != null) {
                    float fFloatValue3 = f7.floatValue();
                    float f10 = kotlin.jvm.internal.j.b(str, "PH_NATIONAL_ID") ? 0.7f : 0.4371f;
                    if (fFloatValue > 0.8035f && fFloatValue2 < f10 && fFloatValue3 < 0.5451f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override // Ch.c
    public void accept(Object obj) {
        MayaCashInViaCardConfirmationFragment mayaCashInViaCardConfirmationFragment;
        t tVar;
        int i = 6;
        int i4 = 3;
        int i6 = 0;
        int i10 = 1;
        switch (this.f174a) {
            case 0:
                ((C0332a) this.f175b).invoke();
                return;
            case 1:
                kotlin.jvm.internal.j.g((List) obj, "it");
                o oVar = (o) this.f175b;
                D7.h hVar = ((MayaTransactionsFragment) ((F7.c) oVar.c.get())).t0;
                if (hVar != null) {
                    hVar.notifyDataSetChanged();
                }
                ((MayaTransactionsFragment) ((F7.c) oVar.c.get())).Q1(false);
                return;
            case 2:
            case 3:
            case 9:
            case 14:
            case 17:
            case 19:
            case 21:
            default:
                WesternUnionTransaction westernUnionTransaction = (WesternUnionTransaction) obj;
                kotlin.jvm.internal.j.g(westernUnionTransaction, "westernUnionTransaction");
                Bb.f fVar = (Bb.f) this.f175b;
                s sVar = (K6.o) fVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.CONFIRMATION);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("attribution", ((MayaBaseFragment) ((K6.o) fVar.c.get())).n1().f10371a);
                ((MayaBaseFragment) sVar).A1(c1219hH);
                MayaWesternUnionConfirmationFragment mayaWesternUnionConfirmationFragment = (MayaWesternUnionConfirmationFragment) ((K6.o) fVar.c.get());
                mayaWesternUnionConfirmationFragment.getClass();
                G g8 = mayaWesternUnionConfirmationFragment.f11774b0;
                if (g8 != null) {
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) g8;
                    String string = mayaCashInActivity.getString(R.string.maya_format_wu_success_title, AbstractC1414e.h("₱", westernUnionTransaction.mAmount().getFormattedValue()));
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    z2.d.n(R.drawable.maya_ic_success, string, mayaCashInActivity.getString(R.string.maya_label_via_western_union), new Pair(mayaCashInActivity.getString(R.string.maya_label_done), new I6.c(mayaCashInActivity, 4)), new Pair(mayaCashInActivity.getString(R.string.maya_label_view_receipt), new C7.f(i4, mayaCashInActivity, westernUnionTransaction)), null, 96).show(mayaCashInActivity.getSupportFragmentManager(), "success_dialog");
                    return;
                }
                return;
            case 4:
                MissionV2 updatedMission = (MissionV2) obj;
                kotlin.jvm.internal.j.g(updatedMission, "updatedMission");
                B9.c cVar = (B9.c) this.f175b;
                MayaMissionsDetailsFragment mayaMissionsDetailsFragment = (MayaMissionsDetailsFragment) ((F9.b) cVar.c.get());
                mayaMissionsDetailsFragment.getClass();
                mayaMissionsDetailsFragment.f12984l0 = updatedMission;
                cVar.j();
                return;
            case 5:
                MissionV2Base missions = (MissionV2Base) obj;
                kotlin.jvm.internal.j.g(missions, "missions");
                B9.d dVar = (B9.d) this.f175b;
                dVar.getClass();
                List<MissionV2> missions2 = missions.getMissions();
                SpringView springView = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).t0;
                if (springView == null) {
                    kotlin.jvm.internal.j.n("mSpringView");
                    throw null;
                }
                springView.i();
                TextView textView = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).f13028s0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("viewAllInProgressMissionsTextView");
                    throw null;
                }
                textView.setVisibility(8);
                Group group = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).f13029v0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("inProgressMissionsConstraintGroup");
                    throw null;
                }
                group.setVisibility(8);
                List<MissionV2> list = missions2;
                if (list == null || list.isEmpty()) {
                    RecyclerView recyclerView = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).f13026q0;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.j.n("homeMissionsRecyclerView");
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                    Group group2 = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).u0;
                    if (group2 == null) {
                        kotlin.jvm.internal.j.n("emptyMissionsConstraintGroup");
                        throw null;
                    }
                    group2.setVisibility(0);
                    ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).L1();
                    return;
                }
                Group group3 = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).u0;
                if (group3 == null) {
                    kotlin.jvm.internal.j.n("emptyMissionsConstraintGroup");
                    throw null;
                }
                group3.setVisibility(8);
                kotlin.jvm.internal.j.g(missions2, "missions");
                List<MissionV2> list2 = missions2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((MissionV2) obj2).getViewTypeMissionV2() != MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_IN_PROGRESS) {
                        arrayList.add(obj2);
                    }
                }
                List missionListItems = C1110A.Q(new B9.a(3), C1110A.Q(new B9.a(1), arrayList));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((MissionV2) obj3).getViewTypeMissionV2() == MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_IN_PROGRESS) {
                        arrayList2.add(obj3);
                    }
                }
                List listQ = C1110A.Q(new B9.a(2), arrayList2);
                if (!missionListItems.isEmpty()) {
                    MayaMissionsHomeFragment mayaMissionsHomeFragment = (MayaMissionsHomeFragment) ((F9.f) dVar.c.get());
                    mayaMissionsHomeFragment.getClass();
                    kotlin.jvm.internal.j.g(missionListItems, "missionListItems");
                    E9.i iVar = mayaMissionsHomeFragment.y0;
                    if (iVar != null) {
                        iVar.e(missionListItems);
                    }
                    RecyclerView recyclerView2 = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).f13026q0;
                    if (recyclerView2 == null) {
                        kotlin.jvm.internal.j.n("homeMissionsRecyclerView");
                        throw null;
                    }
                    recyclerView2.setVisibility(0);
                }
                if (!listQ.isEmpty()) {
                    Group group4 = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).f13029v0;
                    if (group4 == null) {
                        kotlin.jvm.internal.j.n("inProgressMissionsConstraintGroup");
                        throw null;
                    }
                    group4.setVisibility(0);
                    if (listQ.size() > 5) {
                        ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).R1(listQ.subList(0, 5));
                        TextView textView2 = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).f13028s0;
                        if (textView2 == null) {
                            kotlin.jvm.internal.j.n("viewAllInProgressMissionsTextView");
                            throw null;
                        }
                        textView2.setVisibility(0);
                    } else {
                        ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).R1(listQ);
                    }
                }
                ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).L1();
                return;
            case 6:
                kotlin.jvm.internal.j.g((Throwable) obj, "p0");
                ((Bb.a) this.f175b).getClass();
                return;
            case 7:
                Decoration decoration = (Decoration) obj;
                kotlin.jvm.internal.j.g(decoration, "decoration");
                String mImageUrl = decoration.getMImageUrl();
                if (mImageUrl == null || C2576A.H(mImageUrl)) {
                    ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) ((Bb.f) this.f175b).c.get())).H1();
                } else {
                    ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) ((Bb.f) this.f175b).c.get())).G1(mImageUrl);
                }
                ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) ((Bb.f) this.f175b).c.get())).I1(decoration.getMId());
                return;
            case 8:
                Transfer transfer = (Transfer) obj;
                kotlin.jvm.internal.j.g(transfer, "transfer");
                ((Bb.o) this.f175b).l(transfer);
                return;
            case 10:
                Throwable p02 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                C0196d c0196d = (C0196d) this.f175b;
                c0196d.getClass();
                C8.a.m(c0196d, p02, null, new C0194b(c0196d, i10), 6);
                return;
            case 11:
                Throwable p03 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                C0198f c0198f = (C0198f) this.f175b;
                ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).R1();
                c0198f.l(p03, new C0190x(0, c0198f.c.get(), InterfaceC0278c.class, "showPreSubmissionIdInvalidError", "showPreSubmissionIdInvalidError()V", 0, 4), null, new Ag.d(c0198f, i));
                return;
            case 12:
                KycCmsAddressContentData it = (KycCmsAddressContentData) obj;
                kotlin.jvm.internal.j.g(it, "it");
                v vVar = (v) ((E) this.f175b).c.get();
                List<KycCmsAddressProvince> kycCmsAddressProvinces = it.getData();
                if (kycCmsAddressProvinces == null) {
                    kycCmsAddressProvinces = C1112C.f9377a;
                }
                MayaKycInitialLoadingFragment mayaKycInitialLoadingFragment = (MayaKycInitialLoadingFragment) vVar;
                mayaKycInitialLoadingFragment.getClass();
                kotlin.jvm.internal.j.g(kycCmsAddressProvinces, "kycCmsAddressProvinces");
                KeyEventDispatcher.Component componentRequireActivity = mayaKycInitialLoadingFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f1042g = kycCmsAddressProvinces;
                ((E) this.f175b).o();
                return;
            case 13:
                Throwable error = (Throwable) obj;
                kotlin.jvm.internal.j.g(error, "error");
                ((D8.G) this.f175b).l(error, new C0190x(0, ((D8.G) this.f175b).c.get(), w.class, "showPreSubmissionIdInvalidError", "showPreSubmissionIdInvalidError()V", 0, 10), null, new F((D8.G) this.f175b, i10));
                return;
            case 15:
                VoucherBase voucherBase = (VoucherBase) obj;
                kotlin.jvm.internal.j.g(voucherBase, "voucherBase");
                ((Dc.d) this.f175b).m(voucherBase);
                return;
            case 16:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                C0214w c0214w = (C0214w) this.f175b;
                PayMayaError payMayaErrorF = c0214w.f(it2, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                k1 k1Var = ((InvestPreviewFragment) ((Gd.a) c0214w.c.get())).f14613a0;
                kotlin.jvm.internal.j.d(k1Var);
                ((LinearLayout) ((C0450f) k1Var.f4139d).f4088d).setVisibility(8);
                k1 k1Var2 = ((InvestPreviewFragment) ((Gd.a) c0214w.c.get())).f14613a0;
                kotlin.jvm.internal.j.d(k1Var2);
                ((ConstraintLayout) ((C0450f) k1Var2.f4139d).c).setVisibility(8);
                c0214w.v(payMayaErrorF);
                return;
            case 18:
                Throwable th2 = (Throwable) obj;
                Objects.requireNonNull(th2, "error is null");
                ((Ch.c) this.f175b).accept(new Ah.g(new Qh.f(th2)));
                return;
            case 20:
                Pair paymentOptions = (Pair) obj;
                kotlin.jvm.internal.j.g(paymentOptions, "paymentOptions");
                G6.c cVar2 = (G6.c) this.f175b;
                cVar2.e = paymentOptions;
                cVar2.k(paymentOptions);
                ((MayaBaseLoadingFragment) ((K6.c) ((G6.c) this.f175b).c.get())).f10359n0 = true;
                return;
            case 22:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                G6.k kVar = (G6.k) this.f175b;
                PayMayaError payMayaErrorF2 = kVar.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                kVar.x(payMayaErrorF2);
                return;
            case 23:
                PushNotification pushNotification = (PushNotification) obj;
                kotlin.jvm.internal.j.g(pushNotification, "pushNotification");
                G6.m mVar = (G6.m) this.f175b;
                SevenElevenPushNotification sevenElevenPushNotification = (SevenElevenPushNotification) pushNotification;
                String strMPayId = sevenElevenPushNotification.mPayId();
                Bundle arguments = ((MayaCashInCodeFragment) ((K6.g) mVar.c.get())).getArguments();
                MoneyInTopUpCode moneyInTopUpCode = arguments != null ? (MoneyInTopUpCode) arguments.getParcelable("moneyIn") : null;
                if (z.o(strMPayId, moneyInTopUpCode != null ? moneyInTopUpCode.mCode() : null, true)) {
                    if (((K6.g) mVar.c.get()).isResumed()) {
                        mVar.m(sevenElevenPushNotification);
                        return;
                    } else {
                        mVar.f1802k = sevenElevenPushNotification;
                        return;
                    }
                }
                return;
            case 24:
                p pVar = (p) this.f175b;
                PayMayaError payMayaErrorF3 = pVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                if (payMayaErrorF3.isSessionTimeout() || !com.paymaya.data.database.repository.v.a(((C1262h0) pVar.f1808g).f11446d.f11324a.f2811a.query(String.format("SELECT * FROM %1$s ", "load_up_partner"))).isEmpty()) {
                    return;
                }
                ((MayaCashInFragment) ((K6.h) pVar.c.get())).L1();
                RecyclerView recyclerView3 = ((MayaCashInFragment) ((K6.h) pVar.c.get())).f11699v0;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.j.n("mRecyclerViewPartners");
                    throw null;
                }
                recyclerView3.setVisibility(8);
                ((MayaCashInFragment) ((K6.h) pVar.c.get())).R1();
                pVar.r();
                if (payMayaErrorF3.isNetworkError()) {
                    ((MayaCashInFragment) ((K6.h) pVar.c.get())).W1(payMayaErrorF3.mSpiel());
                    return;
                } else {
                    ((MayaCashInFragment) ((K6.h) pVar.c.get())).W1(payMayaErrorF3.mSpiel());
                    return;
                }
            case 25:
                C0214w c0214w2 = (C0214w) this.f175b;
                PayMayaError payMayaErrorF4 = c0214w2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                s sVar2 = (K6.k) c0214w2.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                c1219hH2.t(EnumC1217f.VIA_CARD_EXECUTE);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF4.mSpiel());
                ((MayaBaseFragment) sVar2).A1(c1219hH2);
                if (payMayaErrorF4.isSessionTimeout() || (tVar = (mayaCashInViaCardConfirmationFragment = (MayaCashInViaCardConfirmationFragment) ((K6.k) c0214w2.c.get())).f11730h0) == null) {
                    return;
                }
                ((MayaCashInActivity) tVar).a(payMayaErrorF4, mayaCashInViaCardConfirmationFragment.getString(R.string.pma_toast_error_title_add_money_options_error));
                return;
            case 26:
                G6.t tVar2 = (G6.t) this.f175b;
                PayMayaError payMayaErrorF5 = tVar2.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "paymayaErrorHandling(...)");
                if (payMayaErrorF5.isSessionTimeout()) {
                    tVar2.i = true;
                    return;
                } else if (payMayaErrorF5.isNetworkError()) {
                    MayaCashInWebFragment mayaCashInWebFragment = (MayaCashInWebFragment) ((K6.m) tVar2.c.get());
                    MayaBaseLoadingFragment.N1(mayaCashInWebFragment, 100, mayaCashInWebFragment.getString(R.string.maya_label_that_didnt_load_right), null, new L6.A(mayaCashInWebFragment, i10), 28);
                    return;
                } else {
                    MayaCashInWebFragment mayaCashInWebFragment2 = (MayaCashInWebFragment) ((K6.m) tVar2.c.get());
                    MayaBaseLoadingFragment.N1(mayaCashInWebFragment2, 200, mayaCashInWebFragment2.getString(R.string.maya_label_that_didnt_load_right), null, new L6.A(mayaCashInWebFragment2, i6), 28);
                    return;
                }
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Long num = (Long) obj;
        kotlin.jvm.internal.j.g(num, "num");
        long jLongValue = num.longValue();
        B5.m mVar = (B5.m) this.f175b;
        if (jLongValue < mVar.f380g - 1) {
            return mVar.c.f11388d.refreshToken().e();
        }
        U0 u0 = mVar.f379d;
        u0.f11397b.suspendSession().a(new T0(u0, 1)).a(new A7.c(mVar, 3)).c();
        return Unit.f18162a;
    }

    public String b(List qualityResultArray) {
        kotlin.jvm.internal.j.g(qualityResultArray, "qualityResultArray");
        A[] aArr = A.f1264a;
        float fFloatValue = ((Number) qualityResultArray.get(0)).floatValue();
        e0 e0Var = (e0) this.f175b;
        if (fFloatValue < 0.8035f) {
            return e0Var.a(R.string.maya_kyc_image_feedback_label_make_sure_id_visible);
        }
        A[] aArr2 = A.f1264a;
        if (((Number) qualityResultArray.get(1)).floatValue() > 0.4371f) {
            return e0Var.a(R.string.maya_kyc_image_feedback_label_remove_glare_hologram);
        }
        A[] aArr3 = A.f1264a;
        return ((Number) qualityResultArray.get(2)).floatValue() > 0.5451f ? e0Var.a(R.string.maya_kyc_image_feedback_label_image_is_blurry) : "";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [H7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    public void f(UserActivity userActivity, boolean z4) {
        ActivityDescription activityDescriptionMDescription = userActivity.mDescription();
        if (activityDescriptionMDescription != null) {
            String strMAction = activityDescriptionMDescription.mAction();
            ?? r22 = (RecyclerView.ViewHolder) this.f175b;
            r22.d(strMAction);
            r22.f(activityDescriptionMDescription.mTarget());
            if (z4) {
                r22.b(userActivity.getLocalDateTimeForDashboardDisplaySimpleDate3());
            } else {
                r22.b(userActivity.getLocalDateTimeForDisplay(r22.a()));
            }
            if (z4) {
                r22.c();
            } else {
                r22.e();
            }
        }
    }

    @Override // t4.j
    public void i() {
        switch (this.f174a) {
            case 19:
                return;
            case 28:
                MayaTransactionsFragment mayaTransactionsFragment = (MayaTransactionsFragment) this.f175b;
                ((o) mayaTransactionsFragment.P1()).l();
                LottieAnimationView lottieAnimationView = mayaTransactionsFragment.f12207x0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingFooter");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // t4.j
    public void onRefresh() {
        int i = 5;
        int i4 = 4;
        int i6 = 0;
        switch (this.f174a) {
            case 19:
                ((MayaPushApprovalListFragment) this.f175b).M1();
                C2516a c2516aK1 = ((MayaPushApprovalListFragment) this.f175b).K1();
                MayaPushApprovalListFragment mayaPushApprovalListFragment = (MayaPushApprovalListFragment) ((Da.b) c2516aK1.c.get());
                mayaPushApprovalListFragment.G1().setEnabled(false);
                mayaPushApprovalListFragment.L1().c();
                c2516aK1.o();
                LottieAnimationView lottieAnimationView = ((MayaPushApprovalListFragment) this.f175b).f13550V;
                if (lottieAnimationView != null) {
                    lottieAnimationView.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTopLottieView");
                    throw null;
                }
            case 28:
                MayaTransactionsFragment mayaTransactionsFragment = (MayaTransactionsFragment) this.f175b;
                o oVar = (o) mayaTransactionsFragment.P1();
                oVar.j = 1;
                oVar.f229k = false;
                oVar.k(false);
                LottieAnimationView lottieAnimationView2 = mayaTransactionsFragment.w0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingHeader");
                    throw null;
                }
            default:
                B9.c cVarR1 = ((MayaMissionsDetailsFragment) this.f175b).r1();
                MissionV2 missionV2 = ((MayaMissionsDetailsFragment) ((F9.b) cVarR1.c.get())).f12984l0;
                if (!((MayaMissionsDetailsFragment) ((F9.b) cVarR1.c.get())).f12986o0 && missionV2 != null) {
                    ((MayaMissionsDetailsFragment) ((F9.b) cVarR1.c.get())).f12986o0 = true;
                    C1272m0 c1272m0 = cVarR1.e;
                    String id = missionV2.getId();
                    c1272m0.getClass();
                    Ah.p<MissionV2> missionDetails = c1272m0.f11462b.getMissionDetails(id, T2.t());
                    kotlin.jvm.internal.j.f(missionDetails, "getMissionDetails(...)");
                    cVarR1.e(new T(i, new Lh.d(new Lh.d(new Lh.h(missionDetails, zh.b.a(), 0), new l(cVarR1, i4), 2), new C2360b(cVarR1, i), i6), new A7.c(cVarR1, i4)).e());
                }
                LottieAnimationView lottieAnimationView3 = ((MayaMissionsDetailsFragment) this.f175b).f12983k0;
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(H7.c cVar) {
        this.f174a = 2;
        this.f175b = (RecyclerView.ViewHolder) cVar;
    }
}
