package G6;

import Bj.C0151l;
import D8.C0214w;
import G5.y;
import L6.H;
import L9.C0323a;
import L9.C0326d;
import L9.C0330h;
import L9.C0331i;
import Ng.AbstractC0493a;
import Q9.InterfaceC0583m;
import Q9.ViewOnClickListenerC0582l;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import bj.AbstractC1039j;
import bj.C1037h;
import cg.InterfaceC1101b;
import cj.C1110A;
import cj.C1132s;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.common.widget.MayaButtonWithIcon;
import com.paymaya.domain.model.CreditConsent;
import com.paymaya.domain.model.DateHeader;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.MayaXPScore;
import com.paymaya.domain.model.MayaXPTier;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityTransportFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsHomeFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditInterstitialActivity;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditActivationConfirmDetailFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.BaseMayaSettingsFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import com.paymaya.mayaui.xp.view.fragment.MayaXpEntryFragment;
import com.paymaya.mayaui.xp.view.widgets.MayaXpMeterView;
import com.paymaya.ui.common.view.fragment.impl.UpgradePayMayaPlusFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o1.AbstractC1955a;
import v.AbstractC2329d;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements Ch.c, t4.j, InterfaceC1101b, OnCompleteListener, y, W6.e, Ng.x, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1822b;

    public /* synthetic */ w(Object obj, int i) {
        this.f1821a = i;
        this.f1822b = obj;
    }

    private final void f() {
    }

    @Override // Rg.t
    public Set a() {
        return ((Rg.v) jk.b.g((Ng.y) this.f1822b)).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Integer] */
    @Override // Ch.c
    public void accept(Object obj) throws Throwable {
        Throwable th2;
        NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment;
        InterfaceC0583m interfaceC0583m;
        Throwable th3 = null;
        DateHeader dateHeader = null;
        int i = 0;
        int i4 = 1;
        switch (this.f1821a) {
            case 0:
                x xVar = (x) this.f1822b;
                PayMayaError payMayaErrorF = xVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                y5.s sVar = (K6.p) xVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.CREATE);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                ((MayaBaseFragment) sVar).A1(c1219hH);
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                MayaWesternUnionFragment mayaWesternUnionFragment = (MayaWesternUnionFragment) ((K6.p) xVar.c.get());
                mayaWesternUnionFragment.getClass();
                H h = mayaWesternUnionFragment.f11780Z;
                if (h != null) {
                    ((MayaCashInActivity) h).a(payMayaErrorF, mayaWesternUnionFragment.getString(R.string.pma_toast_error_title_western_union_error));
                    return;
                }
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                kotlin.jvm.internal.j.g(bitmap, "bitmap");
                MayaUserActivityTransportFragment mayaUserActivityTransportFragment = (MayaUserActivityTransportFragment) this.f1822b;
                ImageView imageView = mayaUserActivityTransportFragment.w0;
                if (imageView == null) {
                    kotlin.jvm.internal.j.n("mImageViewQRContent");
                    throw null;
                }
                imageView.setImageBitmap(bitmap);
                FrameLayout frameLayout = mayaUserActivityTransportFragment.f10318q0;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mFrameLayoutCustomView");
                    throw null;
                }
            case 2:
            case 6:
            case 15:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            default:
                Q6.t tVar = (Q6.t) this.f1822b;
                PayMayaError payMayaErrorF2 = tVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                if (payMayaErrorF2.isSessionTimeout()) {
                    tVar.h = true;
                    return;
                } else if (payMayaErrorF2.isNetworkError()) {
                    ((MayaWebFragment) ((X6.h) tVar.c.get())).T1();
                    return;
                } else {
                    ((MayaWebFragment) ((X6.h) tVar.c.get())).U1();
                    return;
                }
            case 3:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                Ja.b bVar = (Ja.b) this.f1822b;
                if (permission.f6934b) {
                    if (bVar.f2498d.e().isQRScreensUpdateEnabled()) {
                        ((MayaMLKitQRScannerFragment) ((Ma.a) bVar.c.get())).P1();
                        return;
                    } else {
                        ((MayaMLKitQRScannerFragment) ((Ma.a) bVar.c.get())).O1();
                        return;
                    }
                }
                MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) ((Ma.a) bVar.c.get());
                Group group = mayaMLKitQRScannerFragment.f13578W;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mConstraintGroupDeniedPermission");
                    throw null;
                }
                group.setVisibility(0);
                MayaButtonWithIcon mayaButtonWithIcon = mayaMLKitQRScannerFragment.f13588g0;
                if (mayaButtonWithIcon == null) {
                    kotlin.jvm.internal.j.n("mButtonShowMyQR");
                    throw null;
                }
                mayaButtonWithIcon.setVisibility(8);
                MayaButtonWithIcon mayaButtonWithIcon2 = mayaMLKitQRScannerFragment.f13587f0;
                if (mayaButtonWithIcon2 == null) {
                    kotlin.jvm.internal.j.n("mUploadQrButton");
                    throw null;
                }
                mayaButtonWithIcon2.setVisibility(8);
                TextView textView = mayaMLKitQRScannerFragment.f13582a0;
                if (textView != null) {
                    textView.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewToolbar");
                    throw null;
                }
            case 4:
                Ze.a permission2 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission2, "permission");
                A7.j jVar = (A7.j) this.f1822b;
                if (permission2.f6934b) {
                    ((MayaQRScannerFragment) ((Ma.b) jVar.c.get())).K1();
                    return;
                } else {
                    ((MayaQRScannerFragment) ((Ma.b) jVar.c.get())).J1(R.string.maya_label_allow_permission_storage_title, R.string.maya_label_allow_permission_storage_description);
                    return;
                }
            case 5:
                MayaXPScore it = (MayaXPScore) obj;
                kotlin.jvm.internal.j.g(it, "it");
                Bb.f fVar = (Bb.f) this.f1822b;
                fVar.getClass();
                if (it.getTiers().isEmpty()) {
                    ConstraintLayout constraintLayout = ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).f14336a0;
                    if (constraintLayout == null) {
                        kotlin.jvm.internal.j.n("mContentView");
                        throw null;
                    }
                    constraintLayout.setVisibility(8);
                    ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).G1();
                    ConstraintLayout constraintLayout2 = ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).f14339d0;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mMaintenanceView");
                        throw null;
                    }
                }
                MayaXpEntryFragment mayaXpEntryFragment = (MayaXpEntryFragment) ((Lc.a) fVar.c.get());
                mayaXpEntryFragment.getClass();
                mayaXpEntryFragment.f14343h0 = it;
                List<MayaXPTier> tiers = it.getTiers();
                Iterator<MayaXPTier> it2 = tiers.iterator();
                int i6 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        th2 = th3;
                        if (!z.o(it2.next().getName(), it.getTier(), true)) {
                            i6++;
                            th3 = th2;
                        }
                    } else {
                        th2 = th3;
                        i6 = -1;
                    }
                }
                ?? ValueOf = Integer.valueOf(i6);
                if (i6 < 0) {
                    ValueOf = th2;
                }
                int iIntValue = ValueOf != 0 ? ValueOf.intValue() : 0;
                MayaXPTier mayaXPTier = tiers.get(iIntValue);
                MayaXPTier mayaXPTier2 = (MayaXPTier) C1110A.C(iIntValue + 1, tiers);
                ArrayList arrayListH = C1132s.h(MayaXpEntryFragment.H1(mayaXPTier));
                if (mayaXPTier2 != null) {
                    arrayListH.add(MayaXpEntryFragment.H1(mayaXPTier2));
                }
                MayaXpMeterView mayaXpMeterView = mayaXpEntryFragment.f14342g0;
                if (mayaXpMeterView == null) {
                    kotlin.jvm.internal.j.n("mMeterView");
                    throw th2;
                }
                mayaXpMeterView.setTiers(arrayListH);
                MayaXpMeterView mayaXpMeterView2 = mayaXpEntryFragment.f14342g0;
                if (mayaXpMeterView2 == null) {
                    kotlin.jvm.internal.j.n("mMeterView");
                    throw th2;
                }
                int min = mayaXPTier.getMin();
                ?? ValueOf2 = mayaXPTier2 != null ? Integer.valueOf(mayaXPTier2.getMin()) : th2;
                int score = it.getScore();
                mayaXpMeterView2.f14359p = score;
                mayaXpMeterView2.f14361r = Integer.valueOf(ValueOf2 != 0 ? kotlin.ranges.d.b(score, min, ValueOf2.intValue()) : min);
                float fA = 0.0f;
                if (ValueOf2 != 0) {
                    int iIntValue2 = ValueOf2.intValue() - min;
                    ?? ValueOf3 = Integer.valueOf(iIntValue2);
                    if (iIntValue2 <= 0) {
                        ValueOf3 = th2;
                    }
                    if (ValueOf3 != 0) {
                        fA = kotlin.ranges.d.a(((r1 - min) / ValueOf3.intValue()) * 100.0f, 0.0f, 100.0f);
                    }
                }
                mayaXpMeterView2.f14360q = fA;
                mayaXpMeterView2.d();
                mayaXpMeterView2.invalidate();
                Bundle arguments = mayaXpEntryFragment.getArguments();
                Object objValueOf = arguments != null ? Integer.valueOf(arguments.getInt("target_score")) : th2;
                String string = mayaXpEntryFragment.getString(R.string.maya_xp_mec_description, objValueOf);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                String string2 = mayaXpEntryFragment.getString(R.string.maya_xp_value, objValueOf);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                SpannableString spannableString = new SpannableString(string);
                int iF = C2576A.F(string, string2, 0, false, 6);
                int length = string2.length() + iF;
                spannableString.setSpan(new StyleSpan(1), iF, length, 33);
                spannableString.setSpan(new ForegroundColorSpan(-1), iF, length, 33);
                TextView textView2 = mayaXpEntryFragment.f14341f0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mXPDescriptionTextView");
                    throw th2;
                }
                textView2.setText(spannableString);
                C1220i c1220iO1 = mayaXpEntryFragment.o1();
                C1219h c1219hE = C1219h.e("MAYA_XP_WIDGET_VIEWED");
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hE.g("source_page", "Credit");
                MayaXPScore mayaXPScore = mayaXpEntryFragment.f14343h0;
                if (mayaXPScore == null) {
                    kotlin.jvm.internal.j.n("mScoreData");
                    throw th2;
                }
                c1219hE.g("user_tier", mayaXPScore.getTier());
                MayaXPScore mayaXPScore2 = mayaXpEntryFragment.f14343h0;
                if (mayaXPScore2 == null) {
                    kotlin.jvm.internal.j.n("mScoreData");
                    throw th2;
                }
                c1219hE.g("user_score", String.valueOf(mayaXPScore2.getScore()));
                c1220iO1.b(c1219hE);
                ConstraintLayout constraintLayout3 = ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).f14336a0;
                if (constraintLayout3 == null) {
                    kotlin.jvm.internal.j.n("mContentView");
                    throw th2;
                }
                constraintLayout3.setVisibility(0);
                ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).G1();
                ConstraintLayout constraintLayout4 = ((MayaXpEntryFragment) ((Lc.a) fVar.c.get())).f14339d0;
                if (constraintLayout4 != null) {
                    constraintLayout4.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMaintenanceView");
                    throw th2;
                }
            case 7:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                C0323a c0323a = (C0323a) this.f1822b;
                PayMayaError payMayaErrorF3 = c0323a.f(it3, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                c0323a.z(payMayaErrorF3);
                c0323a.s(payMayaErrorF3, it3);
                return;
            case 8:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                A7.j jVar2 = (A7.j) this.f1822b;
                jVar2.getClass();
                CreditConsent creditConsent = (CreditConsent) C1110A.B(p02);
                if (creditConsent != null) {
                    jVar2.e(new Hh.f(((C1264i0) jVar2.f).f(creditConsent), zh.b.a(), 0).a(new C0326d(jVar2, i)).b(new u(jVar2, 10)).c());
                    return;
                }
                ((MayaCreditInterstitialActivity) ((M9.b) jVar2.c.get())).W1();
                MayaCreditInterstitialActivity mayaCreditInterstitialActivity = (MayaCreditInterstitialActivity) ((M9.b) jVar2.c.get());
                mayaCreditInterstitialActivity.getClass();
                E.a("MayaCreditInterstitialActivity", "showConsentErrorDialog");
                String string3 = mayaCreditInterstitialActivity.getString(R.string.maya_label_credit_interstitial_consent_error_message);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                mayaCreditInterstitialActivity.X1(string3, new N9.c(mayaCreditInterstitialActivity, i));
                return;
            case 9:
                List creditTransactions = (List) obj;
                kotlin.jvm.internal.j.g(creditTransactions, "creditTransactions");
                C0331i c0331i = (C0331i) this.f1822b;
                ((MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get())).L1();
                ((MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get())).Q1(false);
                List<Dated> datedList = C1110A.Q(new C0330h(), creditTransactions);
                kotlin.jvm.internal.j.g(datedList, "datedList");
                ArrayList arrayList = new ArrayList();
                for (Dated dated : datedList) {
                    if (dateHeader == null || !dateHeader.getLocalDateTime().withTimeAtStartOfDay().isEqual(dated.getLocalDateTime().withTimeAtStartOfDay())) {
                        dateHeader = new DateHeader(dated.getLocalDateTime().withTime(23, 59, 59, 999));
                        arrayList.add(dateHeader);
                    }
                }
                arrayList.addAll(datedList);
                Collections.sort(arrayList, c0331i.i);
                MayaCreditTransactionListFragment mayaCreditTransactionListFragment = (MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get());
                mayaCreditTransactionListFragment.getClass();
                O9.b bVar2 = mayaCreditTransactionListFragment.t0;
                if (bVar2 != null) {
                    ArrayList oldList = bVar2.c;
                    kotlin.jvm.internal.j.g(oldList, "oldList");
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new D7.e(arrayList, oldList));
                    kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                    oldList.clear();
                    oldList.addAll(arrayList);
                    diffResultCalculateDiff.dispatchUpdatesTo(bVar2);
                }
                ((MayaBaseLoadingFragment) ((P9.c) c0331i.c.get())).f10359n0 = true;
                return;
            case 10:
                Throwable it4 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                PayMayaError payMayaErrorF4 = ((L9.o) this.f1822b).f(it4, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                L9.o oVar = (L9.o) this.f1822b;
                oVar.getClass();
                if (!payMayaErrorF4.isSessionTimeout() && payMayaErrorF4.mStatusCode() == 422) {
                    InterfaceC0583m interfaceC0583m2 = ((NewMayaCreditActivationConfirmDetailFragment) ((P9.g) oVar.c.get())).f13160i0;
                    if (interfaceC0583m2 != null) {
                        NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) interfaceC0583m2;
                        E.a("NewMayaCreditActivity", "showIneligibleScreen");
                        newMayaCreditActivity.n1();
                        B5.i.r(newMayaCreditActivity, false, true, EnumC1216e.FULL_CHECKS_INELIGIBLE);
                    }
                } else if (!payMayaErrorF4.isSessionTimeout() && (interfaceC0583m = (newMayaCreditActivationConfirmDetailFragment = (NewMayaCreditActivationConfirmDetailFragment) ((P9.g) oVar.c.get())).f13160i0) != null) {
                    ViewOnClickListenerC0582l viewOnClickListenerC0582l = new ViewOnClickListenerC0582l(newMayaCreditActivationConfirmDetailFragment, i4);
                    NewMayaCreditActivity newMayaCreditActivity2 = (NewMayaCreditActivity) interfaceC0583m;
                    E.a("NewMayaCreditActivity", "showEligibilityErrorDialog");
                    M2.b.Z(0, null, newMayaCreditActivity2.getString(R.string.maya_label_credit_interstitial_eligibility_error_message), newMayaCreditActivity2.getString(R.string.maya_label_try_again), newMayaCreditActivity2.getString(R.string.maya_label_cancel), false, null, viewOnClickListenerC0582l, false, 355).show(newMayaCreditActivity2.getSupportFragmentManager(), "error_dialog");
                }
                ((MayaBaseFragment) ((P9.g) oVar.c.get())).w1();
                ((L9.o) this.f1822b).p(payMayaErrorF4, it4);
                return;
            case 11:
                kotlin.jvm.internal.j.g((io.reactivex.rxjava3.disposables.b) obj, "it");
                ((L9.q) this.f1822b).e(new io.reactivex.rxjava3.disposables.b[0]);
                return;
            case 12:
                Throwable it5 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                C0214w c0214w = (C0214w) this.f1822b;
                PayMayaError payMayaErrorF5 = c0214w.f(it5, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                c0214w.z(payMayaErrorF5);
                return;
            case 13:
                A7.j jVar3 = (A7.j) this.f1822b;
                PayMayaError payMayaErrorF6 = jVar3.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                ((MayaAccountRecoveryFragment) ((Rb.b) jVar3.c.get())).H1();
                if (payMayaErrorF6.isSessionTimeout()) {
                    return;
                }
                MayaAccountRecoveryFragment mayaAccountRecoveryFragment = (MayaAccountRecoveryFragment) ((Rb.b) jVar3.c.get());
                FragmentActivity fragmentActivityRequireActivity = mayaAccountRecoveryFragment.requireActivity();
                SpringView springView = mayaAccountRecoveryFragment.f13916V;
                if (springView != null) {
                    b0.e(fragmentActivityRequireActivity, springView, null, R.string.maya_error_pull_to_refresh_failed, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 852);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
            case 14:
                Lb.d dVar = (Lb.d) this.f1822b;
                PayMayaError payMayaErrorF7 = dVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                dVar.k(payMayaErrorF7);
                return;
            case 16:
                List list = (List) obj;
                Sb.d dVar2 = ((BaseMayaSettingsFragment) ((Rb.j) ((C0323a) this.f1822b).c.get())).f13906v0;
                if (dVar2 != null) {
                    MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) dVar2;
                    mayaSettingsActivity.n1();
                    B5.i.A(mayaSettingsActivity, list, "settings");
                    return;
                }
                return;
            case 19:
                C0214w c0214w2 = (C0214w) this.f1822b;
                PayMayaError payMayaErrorF8 = c0214w2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF8, "mayaErrorHandling(...)");
                y5.s sVar2 = (R7.b) c0214w2.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                c1219hH2.t(EnumC1217f.UPDATE_CONSENTS);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF8.mSpiel());
                c1219hH2.i();
                ((MayaBaseFragment) sVar2).A1(c1219hH2);
                if (payMayaErrorF8.isSessionTimeout()) {
                    return;
                }
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214w2.c.get());
                mayaDataPrivacyDataPersonalizationFragment.getClass();
                S7.f fVar2 = mayaDataPrivacyDataPersonalizationFragment.f12287c0;
                if (fVar2 != null) {
                    fVar2.a(payMayaErrorF8, mayaDataPrivacyDataPersonalizationFragment.getString(R.string.maya_label_thats_not_it));
                    return;
                }
                return;
            case 23:
                C0214w c0214w3 = (C0214w) this.f1822b;
                PayMayaError payMayaErrorF9 = c0214w3.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF9, "paymayaErrorHandling(...)");
                Group group2 = ((UpgradePayMayaPlusFragment) ((Vc.b) c0214w3.c.get())).f14416W;
                if (group2 == null) {
                    kotlin.jvm.internal.j.n("mGroupLoadingScreen");
                    throw null;
                }
                group2.setVisibility(8);
                if (payMayaErrorF9.isSessionTimeout()) {
                    return;
                }
                Wc.c cVar = ((UpgradePayMayaPlusFragment) ((Vc.b) c0214w3.c.get())).f14418Y;
                kotlin.jvm.internal.j.d(cVar);
                cVar.j();
                return;
            case 25:
                Ze.a p03 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                Bb.f fVar3 = (Bb.f) this.f1822b;
                fVar3.getClass();
                if (p03.f6934b) {
                    fVar3.m();
                    return;
                }
                Y6.d dVar3 = ((MayaContactsSelectionFragment) ((X6.c) fVar3.c.get())).f11913v0;
                if (dVar3 != null) {
                    dVar3.U();
                    return;
                }
                return;
            case 26:
                PayMayaError payMayaErrorF10 = ((Q6.o) this.f1822b).f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF10, "mayaErrorHandling(...)");
                ((MayaBaseFragment) ((X6.f) ((Q6.o) this.f1822b).c.get())).w1();
                X6.f fVar4 = (X6.f) ((Q6.o) this.f1822b).c.get();
                String strMSpiel = payMayaErrorF10.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) fVar4;
                mayaSessionExpiredFragment.getClass();
                C1220i c1220iO12 = mayaSessionExpiredFragment.o1();
                FragmentActivity fragmentActivityRequireActivity2 = mayaSessionExpiredFragment.requireActivity();
                C1219h c1219hH3 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put(Constants.REASON, strMSpiel);
                c1219hH3.i();
                c1220iO12.c(fragmentActivityRequireActivity2, c1219hH3);
                ((Q6.o) this.f1822b).p(payMayaErrorF10);
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Profile it = (Profile) obj;
        kotlin.jvm.internal.j.g(it, "it");
        return ((Ra.a) this.f1822b).k();
    }

    @Override // G5.y
    public void b() {
        M6.c cVar = (M6.c) this.f1822b;
        cVar.h.setVisibility(8);
        ConstraintLayout constraintLayout = cVar.f3095d;
        constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), R.drawable.maya_bg_color_grey_slide_highlight_rounded));
    }

    @Override // Rg.t
    public List c(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        List listC = ((Ng.y) this.f1822b).c(AbstractC0493a.e(name, false));
        if (listC == null) {
            return null;
        }
        List list = listC;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0493a.d(0, 0, 11, (String) it.next()));
        }
        return arrayList;
    }

    @Override // G5.y
    public void d() {
        M6.c cVar = (M6.c) this.f1822b;
        cVar.h.setVisibility(cVar.j ? 0 : 8);
        ConstraintLayout constraintLayout = cVar.f3095d;
        constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), R.drawable.maya_bg_solid_round_primary_content));
    }

    @Override // Rg.t
    public void e(Iterable values, String name) {
        kotlin.jvm.internal.j.g(name, "name");
        kotlin.jvm.internal.j.g(values, "values");
        String strE = AbstractC0493a.e(name, false);
        ArrayList arrayList = new ArrayList(cj.t.l(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            kotlin.jvm.internal.j.g(str, "<this>");
            arrayList.add(AbstractC0493a.e(str, true));
        }
        ((Ng.y) this.f1822b).e(arrayList, strE);
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        B2.b bVar = (B2.b) ((com.google.firebase.messaging.r) this.f1822b).e;
        AbstractC1955a.d(bVar);
        return bVar;
    }

    @Override // t4.j
    public void i() {
        switch (this.f1821a) {
            case 2:
                return;
            default:
                MayaCreditTransactionListFragment mayaCreditTransactionListFragment = (MayaCreditTransactionListFragment) this.f1822b;
                mayaCreditTransactionListFragment.P1().l();
                LottieAnimationView lottieAnimationView = mayaCreditTransactionListFragment.f13118x0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingFooter");
                    throw null;
                }
        }
    }

    @Override // Rg.t
    public Set names() {
        Set setKeySet = ((Map) ((Ng.y) this.f1822b).f5552b).keySet();
        ArrayList arrayList = new ArrayList(cj.t.l(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0493a.d(0, 0, 15, (String) it.next()));
        }
        return C1110A.Z(arrayList);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        C0151l c0151l = (C0151l) this.f1822b;
        if (exception != null) {
            C1037h.a aVar = C1037h.f9166b;
            c0151l.resumeWith(AbstractC1039j.a(exception));
        } else if (task.isCanceled()) {
            c0151l.a(null);
        } else {
            C1037h.a aVar2 = C1037h.f9166b;
            c0151l.resumeWith(task.getResult());
        }
    }

    @Override // W6.e
    public void onDismiss() {
        ((MayaQRScannerFragment) this.f1822b).K1();
    }

    @Override // t4.j
    public void onRefresh() {
        switch (this.f1821a) {
            case 2:
                MayaMissionsHomeFragment mayaMissionsHomeFragment = (MayaMissionsHomeFragment) this.f1822b;
                ((B9.d) mayaMissionsHomeFragment.P1()).k();
                LottieAnimationView lottieAnimationView = mayaMissionsHomeFragment.w0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
            default:
                MayaCreditTransactionListFragment mayaCreditTransactionListFragment = (MayaCreditTransactionListFragment) this.f1822b;
                C0331i c0331iP1 = mayaCreditTransactionListFragment.P1();
                c0331iP1.f = 0;
                c0331iP1.f2891g = false;
                c0331iP1.k(false);
                LottieAnimationView lottieAnimationView2 = mayaCreditTransactionListFragment.w0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieViewLoadingHeader");
                    throw null;
                }
        }
    }

    public w(Ng.y encodedParametersBuilder) {
        this.f1821a = 22;
        kotlin.jvm.internal.j.g(encodedParametersBuilder, "encodedParametersBuilder");
        this.f1822b = encodedParametersBuilder;
    }
}
