package Gc;

import A7.r;
import D8.C0214w;
import G6.v;
import Kh.T;
import L9.C0323a;
import L9.C0331i;
import L9.I;
import L9.o;
import L9.q;
import L9.s;
import N5.C0441c;
import P5.V;
import P5.Y;
import P9.k;
import Q6.t;
import Q9.B;
import Q9.InterfaceC0573c;
import Sb.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import cg.InterfaceC1101b;
import cj.L;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.ContactReferencePatchResponse;
import com.paymaya.domain.model.CreditEligibility;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.MayaXPEntrypointEasyCredit;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebLoadingFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditInterstitialActivity;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditActivationAllSetEnhanceFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditActivationConfirmDetailFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaDisplayNamePasswordBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersPageFragment;
import com.paymaya.mayaui.xp.view.fragment.MayaXpEntryFragment;
import com.paymaya.ui.common.view.fragment.impl.UpgradePayMayaPlusFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import o1.AbstractC1955a;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements t4.j, t4.h, InterfaceC1101b, Ch.c, Ch.f, W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1965b;

    public /* synthetic */ h(Object obj, int i) {
        this.f1964a = i;
        this.f1965b = obj;
    }

    @Override // t4.h
    public void a(int i, View rootView) {
        kotlin.jvm.internal.j.g(rootView, "rootView");
        float fAbs = Math.abs(i / rootView.getHeight());
        if (fAbs > 1.0f) {
            fAbs = 1.0f;
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f1965b;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.j.n("mLottieAnimationView");
            throw null;
        }
        lottieAnimationView.setAlpha(fAbs);
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f1965b;
        if (lottieAnimationView2 == null) {
            kotlin.jvm.internal.j.n("mLottieAnimationView");
            throw null;
        }
        lottieAnimationView2.setScaleX(fAbs);
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) this.f1965b;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.setScaleY(fAbs);
        } else {
            kotlin.jvm.internal.j.n("mLottieAnimationView");
            throw null;
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        MayaLoadingDialogFragment mayaLoadingDialogFragment;
        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment;
        S7.f fVar;
        final int i = 2;
        final int i4 = 0;
        int i6 = 12;
        final int i10 = 1;
        switch (this.f1964a) {
            case 3:
                OTP p02 = (OTP) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                C0323a c0323a = (C0323a) this.f1965b;
                c0323a.getClass();
                ((MayaBaseFragment) ((P9.a) c0323a.c.get())).w1();
                P9.a aVar = (P9.a) c0323a.c.get();
                String strMOtpId = p02.mOtpId();
                kotlin.jvm.internal.j.f(strMOtpId, "mOtpId(...)");
                MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment = (MayaCreditActivationAllSetEnhanceFragment) aVar;
                mayaCreditActivationAllSetEnhanceFragment.getClass();
                InterfaceC0573c interfaceC0573c = mayaCreditActivationAllSetEnhanceFragment.f13097Z;
                if (interfaceC0573c != null) {
                    ((NewMayaCreditActivity) interfaceC0573c).g2(strMOtpId);
                    return;
                }
                return;
            case 4:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                PayMayaError payMayaErrorF = ((A7.j) this.f1965b).f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                A7.j jVar = (A7.j) this.f1965b;
                jVar.getClass();
                if (!payMayaErrorF.isSessionTimeout() && payMayaErrorF.mStatusCode() == 422) {
                    MayaCreditInterstitialActivity mayaCreditInterstitialActivity = (MayaCreditInterstitialActivity) ((M9.b) jVar.c.get());
                    mayaCreditInterstitialActivity.getClass();
                    E.a("MayaCreditInterstitialActivity", "showIneligibleScreen");
                    mayaCreditInterstitialActivity.n1();
                    B5.i.r(mayaCreditInterstitialActivity, true, false, EnumC1216e.INITIAL_CHECKS_INELIGIBLE);
                } else if (!payMayaErrorF.isSessionTimeout()) {
                    MayaCreditInterstitialActivity mayaCreditInterstitialActivity2 = (MayaCreditInterstitialActivity) ((M9.b) jVar.c.get());
                    mayaCreditInterstitialActivity2.getClass();
                    E.a("MayaCreditInterstitialActivity", "showEligibilityErrorDialog");
                    String string = mayaCreditInterstitialActivity2.getString(R.string.maya_label_credit_interstitial_eligibility_error_message);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    mayaCreditInterstitialActivity2.X1(string, new N9.c(mayaCreditInterstitialActivity2, i10));
                }
                ((A7.j) this.f1965b).F(payMayaErrorF, it);
                return;
            case 5:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                PayMayaError payMayaErrorF2 = ((C0331i) this.f1965b).f(it2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                C0331i c0331i = (C0331i) this.f1965b;
                c0331i.getClass();
                ((MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get())).Q1(true);
                int i11 = c0331i.f;
                if (i11 >= 2) {
                    c0331i.f = i11 - 1;
                    if (payMayaErrorF2.mErrorCode() == -1) {
                        c0331i.f2891g = true;
                        ((MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get())).Q1(false);
                    } else if (!payMayaErrorF2.isSessionTimeout()) {
                        MayaCreditTransactionListFragment mayaCreditTransactionListFragment = (MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get());
                        FragmentActivity fragmentActivityRequireActivity = mayaCreditTransactionListFragment.requireActivity();
                        SpringView springView = mayaCreditTransactionListFragment.f13113p0;
                        if (springView == null) {
                            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                            throw null;
                        }
                        b0.e(fragmentActivityRequireActivity, springView, null, R.string.maya_label_transactions_load_more_failed, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 596);
                    }
                }
                ((C0331i) this.f1965b).m(payMayaErrorF2, it2);
                return;
            case 6:
                CreditEligibility p03 = (CreditEligibility) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                o oVar = (o) this.f1965b;
                oVar.getClass();
                ((MayaBaseFragment) ((P9.g) oVar.c.get())).w1();
                CreditTerm term = p03.getTerm();
                if (term != null) {
                    CreditReviewUiModel creditReviewUiModel = oVar.h;
                    if (creditReviewUiModel == null) {
                        kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                        throw null;
                    }
                    creditReviewUiModel.m = term;
                    creditReviewUiModel.f13057d = new DecimalFormat("#.##").format(term.getFeeRate() * ((double) 100)).toString();
                    P9.g gVar = (P9.g) oVar.c.get();
                    CreditReviewUiModel creditReviewUiModel2 = oVar.h;
                    if (creditReviewUiModel2 != null) {
                        ((NewMayaCreditActivationConfirmDetailFragment) gVar).I1(creditReviewUiModel2);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                        throw null;
                    }
                }
                return;
            case 7:
                Throwable error = (Throwable) obj;
                kotlin.jvm.internal.j.g(error, "error");
                PayMayaError payMayaErrorF3 = ((q) this.f1965b).f(error, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                q qVar = (q) this.f1965b;
                if (!payMayaErrorF3.isSessionTimeout()) {
                    if (payMayaErrorF3.isNetworkError()) {
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = (NewMayaCreditAssignContactReferenceFragment) ((P9.h) qVar.c.get());
                        Q9.q qVar2 = newMayaCreditAssignContactReferenceFragment.f13172e0;
                        if (qVar2 != null) {
                            ((NewMayaCreditActivity) qVar2).o(newMayaCreditAssignContactReferenceFragment.getString(R.string.maya_label_credit_activation_error_title), newMayaCreditAssignContactReferenceFragment.getString(R.string.maya_label_credit_activation_error_message));
                        }
                    } else {
                        NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment2 = (NewMayaCreditAssignContactReferenceFragment) ((P9.h) qVar.c.get());
                        newMayaCreditAssignContactReferenceFragment2.getClass();
                        Q9.q qVar3 = newMayaCreditAssignContactReferenceFragment2.f13172e0;
                        if (qVar3 != null) {
                            ((NewMayaCreditActivity) qVar3).o(newMayaCreditAssignContactReferenceFragment2.getString(R.string.maya_label_credit_activation_error_title), payMayaErrorF3.mSpiel());
                        }
                    }
                }
                q qVar4 = (q) this.f1965b;
                if (!payMayaErrorF3.isSessionTimeout() && !payMayaErrorF3.isNetworkError()) {
                    P9.h hVar = (P9.h) qVar4.c.get();
                    Map mapC = L.c(new Pair("product", "mec"));
                    ((NewMayaCreditAssignContactReferenceFragment) hVar).getClass();
                    E.b(error, mapC);
                }
                yk.a.e();
                return;
            case 8:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                PayMayaError payMayaErrorF4 = ((s) this.f1965b).f(it3, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                s sVar = (s) this.f1965b;
                sVar.getClass();
                ((MayaBaseFragment) ((P9.j) sVar.c.get())).w1();
                if (!payMayaErrorF4.isSessionTimeout()) {
                    if (payMayaErrorF4.isNetworkError()) {
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar.c.get());
                        B b8 = newMayaCreditEnhancedActivationFragment.f13196B0;
                        if (b8 != null) {
                            ((NewMayaCreditActivity) b8).o(newMayaCreditEnhancedActivationFragment.getString(R.string.maya_label_credit_activation_error_title), newMayaCreditEnhancedActivationFragment.getString(R.string.maya_label_credit_activation_error_message));
                        }
                    } else {
                        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar.c.get());
                        newMayaCreditEnhancedActivationFragment2.getClass();
                        B b10 = newMayaCreditEnhancedActivationFragment2.f13196B0;
                        if (b10 != null) {
                            ((NewMayaCreditActivity) b10).o(newMayaCreditEnhancedActivationFragment2.getString(R.string.maya_label_credit_activation_error_title), payMayaErrorF4.mSpiel());
                        }
                    }
                }
                ((s) this.f1965b).q(payMayaErrorF4, it3);
                return;
            case 9:
                MayaXPEntrypointEasyCredit it4 = (MayaXPEntrypointEasyCredit) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                L9.B b11 = (L9.B) this.f1965b;
                b11.getClass();
                if (!it4.getVisibility() || b11.f2857d.L()) {
                    return;
                }
                k kVar = (k) b11.c.get();
                int target = it4.getTarget();
                FragmentTransaction fragmentTransactionBeginTransaction = ((NewMayaCreditFragment) kVar).getChildFragmentManager().beginTransaction();
                MayaXpEntryFragment mayaXpEntryFragment = new MayaXpEntryFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("target_score", target);
                mayaXpEntryFragment.setArguments(bundle);
                fragmentTransactionBeginTransaction.replace(R.id.frame_layout_xp_meter, mayaXpEntryFragment).commit();
                return;
            case 10:
                Throwable it5 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                C0214w c0214w = (C0214w) this.f1965b;
                PayMayaError payMayaErrorF5 = c0214w.f(it5, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                c0214w.z(payMayaErrorF5);
                return;
            case 11:
                Throwable it6 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it6, "it");
                G6.k kVar2 = (G6.k) this.f1965b;
                PayMayaError payMayaErrorF6 = kVar2.f(it6, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                kVar2.y(payMayaErrorF6);
                kVar2.s(payMayaErrorF6, it6);
                return;
            case 12:
                kotlin.jvm.internal.j.g((ContactReferencePatchResponse) obj, "it");
                ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) ((I) this.f1965b).c.get())).requireActivity().onBackPressed();
                return;
            case 13:
                kotlin.jvm.internal.j.g((Profile) obj, "it");
                A7.j jVar2 = (A7.j) this.f1965b;
                ((MayaAccountRecoveryFragment) ((Rb.b) jVar2.c.get())).H1();
                jVar2.y();
                return;
            case 14:
                C0214w c0214w2 = (C0214w) this.f1965b;
                PayMayaError payMayaErrorF7 = c0214w2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                ((MayaBaseFragment) ((Rb.d) c0214w2.c.get())).w1();
                if (payMayaErrorF7.isSessionTimeout()) {
                    return;
                }
                int iMErrorCode = payMayaErrorF7.mErrorCode();
                if (iMErrorCode == -20) {
                    new Hh.a(new Hh.f(((S0) c0214w2.f1106g).b(), zh.b.a(), 0), new r(i6, c0214w2, payMayaErrorF7), 1).c();
                    return;
                }
                if (iMErrorCode != -265 && iMErrorCode != -12) {
                    MayaChangeMinFragment mayaChangeMinFragment = (MayaChangeMinFragment) ((Rb.d) c0214w2.c.get());
                    mayaChangeMinFragment.getClass();
                    l lVar = mayaChangeMinFragment.f13943a0;
                    if (lVar != null) {
                        ((MayaSettingsActivity) lVar).c2(mayaChangeMinFragment.getString(R.string.maya_label_thats_not_it), payMayaErrorF7.mSpiel());
                        return;
                    }
                    return;
                }
                MayaChangeMinFragment mayaChangeMinFragment2 = (MayaChangeMinFragment) ((Rb.d) c0214w2.c.get());
                mayaChangeMinFragment2.getClass();
                l lVar2 = mayaChangeMinFragment2.f13943a0;
                if (lVar2 != null) {
                    MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231347, mayaChangeMinFragment2.getString(R.string.maya_label_thats_not_it), payMayaErrorF7.mSpiel(), null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                    mayaErrorDialogFragmentZ.f11850c0 = mayaChangeMinFragment2;
                    mayaErrorDialogFragmentZ.show(((MayaSettingsActivity) lVar2).getSupportFragmentManager(), "error_dialog");
                    return;
                }
                return;
            case 15:
                Lb.e eVar = (Lb.e) this.f1965b;
                PayMayaError payMayaErrorF8 = eVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF8, "paymayaErrorHandling(...)");
                y5.s sVar2 = (Rb.f) eVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF8.mSpiel());
                ((MayaBaseFragment) sVar2).A1(c1219hH);
                ((MayaBaseFragment) ((Rb.f) eVar.c.get())).w1();
                if (payMayaErrorF8.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF8.mStatusCode() == 422 && payMayaErrorF8.mErrorCode() == -12) {
                    MayaChangePasswordFragment mayaChangePasswordFragment = (MayaChangePasswordFragment) ((Rb.f) eVar.c.get());
                    Sb.o oVar2 = mayaChangePasswordFragment.f13953b0;
                    if (oVar2 != null) {
                        oVar2.a(payMayaErrorF8, mayaChangePasswordFragment.getString(R.string.maya_change_password_error_title));
                        return;
                    }
                    return;
                }
                if (payMayaErrorF8.mStatusCode() == 400 && payMayaErrorF8.mErrorCode() == -19) {
                    MayaChangePasswordFragment mayaChangePasswordFragment2 = (MayaChangePasswordFragment) ((Rb.f) eVar.c.get());
                    MayaInputLayout mayaInputLayout = mayaChangePasswordFragment2.f13949X;
                    if (mayaInputLayout == null) {
                        kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                        throw null;
                    }
                    mayaInputLayout.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_error_medium);
                    mayaInputLayout.setHelperErrorText(mayaChangePasswordFragment2.getString(R.string.maya_change_password_error_new_password_the_same_as_current));
                    mayaInputLayout.p();
                    Button button = ((MayaChangePasswordFragment) ((Rb.f) eVar.c.get())).f13951Z;
                    if (button != null) {
                        button.setEnabled(false);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mButtonSave");
                        throw null;
                    }
                }
                if (payMayaErrorF8.mStatusCode() == 422 && payMayaErrorF8.mErrorCode() == -225) {
                    MayaChangePasswordFragment mayaChangePasswordFragment3 = (MayaChangePasswordFragment) ((Rb.f) eVar.c.get());
                    Sb.o oVar3 = mayaChangePasswordFragment3.f13953b0;
                    if (oVar3 != null) {
                        oVar3.a(payMayaErrorF8, mayaChangePasswordFragment3.getString(R.string.maya_change_password_error_title));
                        return;
                    }
                    return;
                }
                MayaChangePasswordFragment mayaChangePasswordFragment4 = (MayaChangePasswordFragment) ((Rb.f) eVar.c.get());
                mayaChangePasswordFragment4.getClass();
                Sb.o oVar4 = mayaChangePasswordFragment4.f13953b0;
                if (oVar4 != null) {
                    oVar4.a(payMayaErrorF8, mayaChangePasswordFragment4.getString(R.string.maya_change_password_error_title));
                    return;
                }
                return;
            case 16:
                A7.j jVar3 = (A7.j) this.f1965b;
                PayMayaError payMayaErrorF9 = jVar3.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF9, "mayaErrorHandling(...)");
                Qb.e eVar2 = ((MayaDisplayNamePasswordBottomSheetDialogFragment) ((Pb.a) jVar3.c.get())).f13859Y;
                if (eVar2 != null && (mayaLoadingDialogFragment = ((MayaSettingsActivity) eVar2).f13842p) != null) {
                    mayaLoadingDialogFragment.dismissAllowingStateLoss();
                }
                ((Pb.a) jVar3.c.get()).dismiss();
                if (payMayaErrorF9.isSessionTimeout()) {
                    return;
                }
                int iMErrorCode2 = payMayaErrorF9.mErrorCode();
                if (iMErrorCode2 == -20) {
                    jVar3.e(new Hh.a(new Hh.f(((S0) jVar3.f).b(), zh.b.a(), 0), new r(13, jVar3, payMayaErrorF9), 1).c());
                    return;
                }
                if (iMErrorCode2 != -12) {
                    MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment = (MayaDisplayNamePasswordBottomSheetDialogFragment) ((Pb.a) jVar3.c.get());
                    Qb.e eVar3 = mayaDisplayNamePasswordBottomSheetDialogFragment.f13859Y;
                    if (eVar3 != null) {
                        ((MayaSettingsActivity) eVar3).a(payMayaErrorF9, mayaDisplayNamePasswordBottomSheetDialogFragment.getString(R.string.maya_label_thats_not_it));
                        return;
                    }
                    return;
                }
                MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment2 = (MayaDisplayNamePasswordBottomSheetDialogFragment) ((Pb.a) jVar3.c.get());
                Qb.e eVar4 = mayaDisplayNamePasswordBottomSheetDialogFragment2.f13859Y;
                if (eVar4 != null) {
                    MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) eVar4;
                    MayaErrorDialogFragment mayaErrorDialogFragmentZ2 = M2.b.Z(0, mayaDisplayNamePasswordBottomSheetDialogFragment2.getString(R.string.maya_label_thats_not_it), payMayaErrorF9.mSpiel(), null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT);
                    mayaErrorDialogFragmentZ2.f11850c0 = new Gb.d(mayaSettingsActivity, 21);
                    mayaErrorDialogFragmentZ2.show(mayaSettingsActivity.getSupportFragmentManager(), "error_dialog");
                    return;
                }
                return;
            case 17:
            case 19:
            case 20:
            case 22:
            case 23:
            case 25:
            default:
                Bb.f fVar2 = (Bb.f) this.f1965b;
                PayMayaError payMayaErrorF10 = fVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF10, "mayaErrorHandling(...)");
                if (payMayaErrorF10.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF10.isNetworkError()) {
                    final MayaWebLoadingFragment mayaWebLoadingFragment = (MayaWebLoadingFragment) ((X6.j) fVar2.c.get());
                    mayaWebLoadingFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaWebLoadingFragment, 100, null, null, new View.OnClickListener() { // from class: Y6.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    MayaWebLoadingFragment mayaWebLoadingFragment2 = mayaWebLoadingFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaWebLoadingFragment2.L1();
                                        mayaWebLoadingFragment2.P1().p();
                                        return;
                                    } finally {
                                    }
                                case 1:
                                    MayaWebLoadingFragment mayaWebLoadingFragment3 = mayaWebLoadingFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        C1220i c1220iO1 = mayaWebLoadingFragment3.o1();
                                        FragmentActivity activity = mayaWebLoadingFragment3.getActivity();
                                        C1219h c1219hD = C1219h.d(EnumC1215d.CREATOR_STORE);
                                        c1219hD.r(EnumC1216e.RESTRICTION);
                                        c1219hD.n(17);
                                        c1219hD.t(EnumC1217f.BACK);
                                        c1220iO1.c(activity, c1219hD);
                                        r rVar = mayaWebLoadingFragment3.f11972o0;
                                        if (rVar != null) {
                                            MayaWebActivity mayaWebActivity = (MayaWebActivity) rVar;
                                            mayaWebActivity.n1();
                                            B5.i.j(mayaWebActivity);
                                        }
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaWebLoadingFragment mayaWebLoadingFragment4 = mayaWebLoadingFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaWebLoadingFragment4.L1();
                                        mayaWebLoadingFragment4.P1().p();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                    return;
                } else {
                    if (payMayaErrorF10.mErrorCode() == -357) {
                        final MayaWebLoadingFragment mayaWebLoadingFragment2 = (MayaWebLoadingFragment) ((X6.j) fVar2.c.get());
                        mayaWebLoadingFragment2.f10338R = true;
                        mayaWebLoadingFragment2.F1();
                        mayaWebLoadingFragment2.m1().o(EnumC1215d.CREATOR_STORE);
                        mayaWebLoadingFragment2.m1().r(EnumC1216e.RESTRICTION);
                        mayaWebLoadingFragment2.M1(200, mayaWebLoadingFragment2.getString(R.string.maya_label_underage_error_spiel), mayaWebLoadingFragment2.getString(R.string.maya_label_underage_error_title), mayaWebLoadingFragment2.getString(R.string.maya_label_back_to_home), 2131231241, new View.OnClickListener() { // from class: Y6.q
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        MayaWebLoadingFragment mayaWebLoadingFragment22 = mayaWebLoadingFragment2;
                                        Callback.onClick_enter(view);
                                        try {
                                            mayaWebLoadingFragment22.L1();
                                            mayaWebLoadingFragment22.P1().p();
                                            return;
                                        } finally {
                                        }
                                    case 1:
                                        MayaWebLoadingFragment mayaWebLoadingFragment3 = mayaWebLoadingFragment2;
                                        Callback.onClick_enter(view);
                                        try {
                                            C1220i c1220iO1 = mayaWebLoadingFragment3.o1();
                                            FragmentActivity activity = mayaWebLoadingFragment3.getActivity();
                                            C1219h c1219hD = C1219h.d(EnumC1215d.CREATOR_STORE);
                                            c1219hD.r(EnumC1216e.RESTRICTION);
                                            c1219hD.n(17);
                                            c1219hD.t(EnumC1217f.BACK);
                                            c1220iO1.c(activity, c1219hD);
                                            r rVar = mayaWebLoadingFragment3.f11972o0;
                                            if (rVar != null) {
                                                MayaWebActivity mayaWebActivity = (MayaWebActivity) rVar;
                                                mayaWebActivity.n1();
                                                B5.i.j(mayaWebActivity);
                                            }
                                            return;
                                        } finally {
                                        }
                                    default:
                                        MayaWebLoadingFragment mayaWebLoadingFragment4 = mayaWebLoadingFragment2;
                                        Callback.onClick_enter(view);
                                        try {
                                            mayaWebLoadingFragment4.L1();
                                            mayaWebLoadingFragment4.P1().p();
                                            return;
                                        } finally {
                                        }
                                }
                            }
                        });
                        return;
                    }
                    X6.j jVar4 = (X6.j) fVar2.c.get();
                    String strMSpiel = payMayaErrorF10.mSpiel();
                    kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                    final MayaWebLoadingFragment mayaWebLoadingFragment3 = (MayaWebLoadingFragment) jVar4;
                    mayaWebLoadingFragment3.getClass();
                    MayaBaseLoadingFragment.N1(mayaWebLoadingFragment3, 200, strMSpiel, null, new View.OnClickListener() { // from class: Y6.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i) {
                                case 0:
                                    MayaWebLoadingFragment mayaWebLoadingFragment22 = mayaWebLoadingFragment3;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaWebLoadingFragment22.L1();
                                        mayaWebLoadingFragment22.P1().p();
                                        return;
                                    } finally {
                                    }
                                case 1:
                                    MayaWebLoadingFragment mayaWebLoadingFragment32 = mayaWebLoadingFragment3;
                                    Callback.onClick_enter(view);
                                    try {
                                        C1220i c1220iO1 = mayaWebLoadingFragment32.o1();
                                        FragmentActivity activity = mayaWebLoadingFragment32.getActivity();
                                        C1219h c1219hD = C1219h.d(EnumC1215d.CREATOR_STORE);
                                        c1219hD.r(EnumC1216e.RESTRICTION);
                                        c1219hD.n(17);
                                        c1219hD.t(EnumC1217f.BACK);
                                        c1220iO1.c(activity, c1219hD);
                                        r rVar = mayaWebLoadingFragment32.f11972o0;
                                        if (rVar != null) {
                                            MayaWebActivity mayaWebActivity = (MayaWebActivity) rVar;
                                            mayaWebActivity.n1();
                                            B5.i.j(mayaWebActivity);
                                        }
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaWebLoadingFragment mayaWebLoadingFragment4 = mayaWebLoadingFragment3;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaWebLoadingFragment4.L1();
                                        mayaWebLoadingFragment4.P1().p();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 28);
                    return;
                }
            case 18:
                List consents = (List) obj;
                kotlin.jvm.internal.j.g(consents, "consents");
                C0214w c0214w3 = (C0214w) this.f1965b;
                y5.s sVar3 = (R7.b) c0214w3.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(14);
                c1219hH2.t(EnumC1217f.UPDATE_CONSENTS);
                c1219hH2.i();
                ((MayaBaseFragment) sVar3).A1(c1219hH2);
                ((com.paymaya.data.preference.a) c0214w3.e).U(false);
                if (!"settings".equalsIgnoreCase(((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214w3.c.get())).f12289e0) || (fVar = (mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214w3.c.get())).f12287c0) == null) {
                    return;
                }
                String string2 = mayaDataPrivacyDataPersonalizationFragment.getString(R.string.maya_label_settings_updated_title);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                String string3 = mayaDataPrivacyDataPersonalizationFragment.getString(R.string.maya_label_settings_updated_description);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                fVar.t(string2, string3);
                return;
            case 21:
                Throwable it7 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it7, "it");
                N9.f fVar3 = (N9.f) this.f1965b;
                if (fVar3 != null) {
                    fVar3.invoke(it7);
                    return;
                }
                return;
            case 24:
                kotlin.jvm.internal.j.g((Profile) obj, "profile");
                C0214w c0214w4 = (C0214w) this.f1965b;
                Group group = ((UpgradePayMayaPlusFragment) ((Vc.b) c0214w4.c.get())).f14416W;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mGroupLoadingScreen");
                    throw null;
                }
                group.setVisibility(8);
                if ("kyc1".equals(((com.paymaya.data.preference.a) c0214w4.e).l())) {
                    Wc.c cVar = ((UpgradePayMayaPlusFragment) ((Vc.b) c0214w4.c.get())).f14418Y;
                    kotlin.jvm.internal.j.d(cVar);
                    cVar.M();
                    return;
                }
                c0214w4.q();
                UpgradePayMayaPlusFragment upgradePayMayaPlusFragment = (UpgradePayMayaPlusFragment) ((Vc.b) c0214w4.c.get());
                TextView textView = upgradePayMayaPlusFragment.f14415V;
                if (textView != null) {
                    textView.setText(upgradePayMayaPlusFragment.getString(R.string.pma_label_default_upgrade_spiel));
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewSpiel");
                    throw null;
                }
            case 26:
                kotlin.jvm.internal.j.g((io.reactivex.rxjava3.disposables.b) obj, "it");
                ((Bb.f) this.f1965b).e(new io.reactivex.rxjava3.disposables.b[0]);
                return;
            case 27:
                Profile profile = (Profile) obj;
                kotlin.jvm.internal.j.g(profile, "profile");
                ((MayaBaseFragment) ((X6.f) ((Q6.o) this.f1965b).c.get())).w1();
                MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) ((X6.f) ((Q6.o) this.f1965b).c.get());
                C1220i c1220iO1 = mayaSessionExpiredFragment.o1();
                FragmentActivity fragmentActivityRequireActivity2 = mayaSessionExpiredFragment.requireActivity();
                C1219h c1219h = new C1219h();
                c1219h.n(14);
                c1219h.i();
                c1220iO1.c(fragmentActivityRequireActivity2, c1219h);
                Q6.o oVar5 = (Q6.o) this.f1965b;
                oVar5.q(profile, oVar5.f5286k);
                return;
            case 28:
                t tVar = (t) this.f1965b;
                PayMayaError payMayaErrorF11 = tVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF11, "paymayaErrorHandling(...)");
                ((MayaWebFragment) ((X6.h) tVar.c.get())).setHasOptionsMenu(false);
                if (payMayaErrorF11.isSessionTimeout()) {
                    tVar.h = true;
                    return;
                } else if (payMayaErrorF11.isNetworkError()) {
                    ((MayaWebFragment) ((X6.h) tVar.c.get())).T1();
                    return;
                } else {
                    ((MayaWebFragment) ((X6.h) tVar.c.get())).U1();
                    return;
                }
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Object objApply = ((Ch.f) ((T) this.f1965b).c).apply(new Object[]{obj});
        Objects.requireNonNull(objApply, "The zipper returned a null value");
        return objApply;
    }

    @Override // t4.h
    public void b() {
    }

    @Override // t4.h
    public void c() {
    }

    @Override // t4.h
    public void d() {
    }

    @Override // t4.h
    public void e() {
    }

    @Override // t4.h
    public void f(View rootView, boolean z4) {
        kotlin.jvm.internal.j.g(rootView, "rootView");
    }

    @Override // t4.h
    public void g() {
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f1964a) {
            case 2:
                B2.b bVar = (B2.b) ((com.google.firebase.messaging.r) this.f1965b).f9804d;
                AbstractC1955a.d(bVar);
                return bVar;
            case 22:
                ((v) this.f1965b).getClass();
                return new Uh.d();
            default:
                ((Y) this.f1965b).getClass();
                return new V(3);
        }
    }

    @Override // t4.h
    public View h(LayoutInflater inflater, SpringView springView) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        C0441c c0441cE = C0441c.e(inflater, springView);
        this.f1965b = (LottieAnimationView) c0441cE.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) c0441cE.f4066b;
        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // t4.j
    public void i() {
    }

    public void j(z2.d definition) {
        kotlin.jvm.internal.j.g(definition, "definition");
        AbstractC1173g.w(((Sg.a) this.f1965b).a(definition));
    }

    @Override // W6.e
    public void onDismiss() {
        ((MayaQRScannerFragment) this.f1965b).M1();
    }

    @Override // t4.j
    public void onRefresh() {
        MayaVouchersPageFragment mayaVouchersPageFragment = (MayaVouchersPageFragment) this.f1965b;
        ((Dc.d) mayaVouchersPageFragment.P1()).k();
        LottieAnimationView lottieAnimationView = mayaVouchersPageFragment.w0;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        } else {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
    }

    public h(int i) {
        this.f1964a = i;
        switch (i) {
            case 19:
                this.f1965b = new Sg.a();
                break;
        }
    }
}
