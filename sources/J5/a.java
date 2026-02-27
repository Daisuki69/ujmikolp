package J5;

import A7.C0103a;
import A7.k;
import A7.m;
import A7.o;
import Ah.p;
import Ch.f;
import D.CallableC0170c;
import D.S;
import D.d0;
import D8.B;
import D8.C0196d;
import D8.C0214w;
import D8.E;
import E.h;
import F9.g;
import K6.l;
import K6.n;
import K8.InterfaceC0277b;
import Kh.T;
import Lh.d;
import N5.Q;
import N5.k1;
import W6.e;
import We.A;
import We.G;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import cj.C1110A;
import cj.L;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.callback.Callback;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.J;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.AccessToken;
import com.paymaya.domain.model.AddMoneyViaCardSettings;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.KycSubmissionNotify;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.UpdaterConfigDetails;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherBase;
import com.paymaya.domain.model.VoucherDenomination;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaAutoCashinWalletSettingsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeBottomSheetFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsInProgressFragment;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import n2.C1915b;
import pg.t;
import tj.InterfaceC2288a;
import v.AbstractC2329d;
import w.C2361c;
import y5.s;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Ch.c, e, h, F1.c, f, InterfaceC2288a {
    public static a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f2412d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2414b;

    public /* synthetic */ a(int i) {
        this.f2413a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(Double d10, Double d11) {
        Number numberValueOf;
        double dDoubleValue = d10.doubleValue();
        double dDoubleValue2 = d11.doubleValue();
        if (dDoubleValue2 < 0.01d) {
            dDoubleValue2 = 0.01d;
        }
        int iA = sj.b.a((dDoubleValue / dDoubleValue2) * 100.0d);
        IntRange intRange = new IntRange(0, 99, 1);
        if (!(intRange instanceof wj.c)) {
            if (intRange.isEmpty()) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + intRange + '.');
            }
            Integer num = 0;
            if (iA < num.intValue()) {
                Integer num2 = 0;
                return num2.intValue();
            }
            int i = intRange.f18202b;
            return iA > Integer.valueOf(i).intValue() ? Integer.valueOf(i).intValue() : iA;
        }
        Integer numValueOf = Integer.valueOf(iA);
        wj.b bVar = (wj.b) ((wj.c) intRange);
        if (!bVar.a(numValueOf, Float.valueOf(0.0f)) || bVar.a(Float.valueOf(0.0f), numValueOf)) {
            boolean zA = bVar.a(Float.valueOf(1.0f), numValueOf);
            numberValueOf = numValueOf;
            if (zA) {
                boolean zA2 = bVar.a(numValueOf, Float.valueOf(1.0f));
                numberValueOf = numValueOf;
                if (!zA2) {
                    numberValueOf = Float.valueOf(1.0f);
                }
            }
        } else {
            numberValueOf = Float.valueOf(0.0f);
        }
        return numberValueOf.intValue();
    }

    public static synchronized a c() {
        try {
            if (c == null) {
                a aVar = new a(0);
                aVar.f2414b = new HashMap();
                c = aVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        MayaLoadingDialogFragment mayaLoadingDialogFragment;
        int i = 5;
        int i4 = 12;
        int i6 = 2;
        final int i10 = 1;
        final int i11 = 0;
        switch (this.f2413a) {
            case 1:
                ((Function0) this.f2414b).invoke();
                return;
            case 2:
                AccessToken it = (AccessToken) obj;
                j.g(it, "it");
                ((t) this.f2414b).success(L.c(new Pair("refresh_access_token_response", "true")));
                return;
            case 3:
            case 6:
            case 12:
            case 14:
            case 17:
            case 18:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            default:
                Pair pair = (Pair) obj;
                j.g(pair, "pair");
                ((C0214w) this.f2414b).f1106g = C1110A.W((Collection) pair.f18160a);
                C0214w c0214w = (C0214w) this.f2414b;
                AddMoneyViaCardSettings addMoneyViaCardSettings = (AddMoneyViaCardSettings) pair.f18161b;
                c0214w.f = addMoneyViaCardSettings;
                c0214w.w((List) pair.f18160a, addMoneyViaCardSettings);
                ((MayaBaseLoadingFragment) ((n) ((C0214w) this.f2414b).c.get())).f10359n0 = true;
                return;
            case 4:
                UserActivity userActivity = (UserActivity) obj;
                j.g(userActivity, "userActivity");
                o oVar = (o) this.f2414b;
                if (userActivity.isBillsPayMethod(true) && userActivity.mBillerslug() != null) {
                    a aVarC = c();
                    j.f(aVarC, "getInstance(...)");
                    if (!((HashMap) aVarC.f2414b).containsKey(userActivity.mBillerslug())) {
                        oVar.i = userActivity;
                        new T(i, new d(new Lh.h(oVar.e.b(userActivity.mBillerslug()), zh.b.a(), 0), new C0103a(oVar, i), i6), new k(oVar, i6)).e();
                        return;
                    }
                }
                if (j.b(userActivity.mMethod(), "MONEYINCR") || j.b(userActivity.mMethod(), "MONEYINDB") || j.b(userActivity.mMethod(), "SMP2PCONCD") || j.b(userActivity.mMethod(), "SMP2PCONDB")) {
                    new d(new d(new Lh.h(oVar.f.a(String.valueOf(userActivity.mMethod()), String.valueOf(userActivity.mRequestReferenceNo())), zh.b.a(), 0), new A7.n(oVar, userActivity, i11), i6), new A7.n(oVar, userActivity, i10), i11).e();
                    return;
                }
                if (!j.b(userActivity.mType(), RtspHeaders.TRANSPORT)) {
                    ((MayaBaseFragment) ((F7.c) oVar.c.get())).w1();
                    jk.b.w((F7.c) oVar.c.get(), userActivity);
                    return;
                } else {
                    p<PurchasedTicket> ticketDetails = oVar.f228g.f11403b.getTicketDetails(userActivity.mRequestReferenceNo());
                    new d(new d(AbstractC1331a.l(ticketDetails, ticketDetails, zh.b.a()), new A7.n(oVar, userActivity, i6), i6), new m(oVar, i10), i11).e();
                    return;
                }
            case 5:
                UpdaterConfigDetails updaterConfigDetails = (UpdaterConfigDetails) obj;
                j.g(updaterConfigDetails, "updaterConfigDetails");
                B5.c cVar = (B5.c) this.f2414b;
                androidx.camera.core.impl.a.A(cVar.f354b.f11330b, "key_has_updates", cVar.d(updaterConfigDetails));
                return;
            case 7:
                B9.c cVar2 = (B9.c) this.f2414b;
                PayMayaError payMayaErrorF = cVar2.f((Throwable) obj, true);
                j.f(payMayaErrorF, "mayaErrorHandling(...)");
                G9.e eVar = ((MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) cVar2.c.get())).f12991W;
                if (eVar != null && (mayaLoadingDialogFragment = ((MayaMissionsActivity) eVar).f12955o) != null) {
                    mayaLoadingDialogFragment.dismissAllowingStateLoss();
                }
                Object obj2 = (F9.c) cVar2.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                c1219hH.i();
                ((MayaBaseBottomSheetDialogFragment) obj2).r1(c1219hH);
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF.isNetworkError()) {
                    MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment = (MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) cVar2.c.get());
                    G9.e eVar2 = mayaMissionsEnterCodeBottomSheetFragment.f12991W;
                    if (eVar2 != null) {
                        MayaMissionsActivity mayaMissionsActivity = (MayaMissionsActivity) eVar2;
                        M2.b.Z(0, mayaMissionsActivity.getString(R.string.maya_label_that_didnt_load_right), mayaMissionsActivity.getString(R.string.maya_label_connection_issue), null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(mayaMissionsActivity.getSupportFragmentManager(), "error_dialog");
                    }
                    mayaMissionsEnterCodeBottomSheetFragment.dismiss();
                    return;
                }
                if (payMayaErrorF.mErrorCode() == -306) {
                    MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment2 = (MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) cVar2.c.get());
                    mayaMissionsEnterCodeBottomSheetFragment2.getClass();
                    G9.e eVar3 = mayaMissionsEnterCodeBottomSheetFragment2.f12991W;
                    if (eVar3 != null) {
                        MayaMissionsActivity mayaMissionsActivity2 = (MayaMissionsActivity) eVar3;
                        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, null, null, null, false, payMayaErrorF, null, false, 447);
                        mayaErrorDialogFragmentZ.f11850c0 = new C2361c(mayaMissionsActivity2, 16);
                        mayaErrorDialogFragmentZ.show(mayaMissionsActivity2.getSupportFragmentManager(), "error_dialog");
                    }
                    mayaMissionsEnterCodeBottomSheetFragment2.dismiss();
                    return;
                }
                String strMSpiel = payMayaErrorF.mSpiel();
                if (strMSpiel == null || C2576A.H(strMSpiel)) {
                    MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment3 = (MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) cVar2.c.get());
                    G9.e eVar4 = mayaMissionsEnterCodeBottomSheetFragment3.f12991W;
                    if (eVar4 != null) {
                        ((MayaMissionsActivity) eVar4).W1(null);
                    }
                    mayaMissionsEnterCodeBottomSheetFragment3.dismiss();
                    return;
                }
                F9.c cVar3 = (F9.c) cVar2.c.get();
                String strMSpiel2 = payMayaErrorF.mSpiel();
                j.f(strMSpiel2, "mSpiel(...)");
                MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment4 = (MayaMissionsEnterCodeBottomSheetFragment) cVar3;
                mayaMissionsEnterCodeBottomSheetFragment4.getClass();
                G9.e eVar5 = mayaMissionsEnterCodeBottomSheetFragment4.f12991W;
                if (eVar5 != null) {
                    ((MayaMissionsActivity) eVar5).W1(strMSpiel2);
                }
                mayaMissionsEnterCodeBottomSheetFragment4.dismiss();
                return;
            case 8:
                B9.b bVar = (B9.b) this.f2414b;
                PayMayaError payMayaErrorF2 = bVar.f((Throwable) obj, false);
                j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                SpringView springView = ((MayaMissionsInProgressFragment) ((g) bVar.c.get())).f13035r0;
                if (springView == null) {
                    j.n("mSpringView");
                    throw null;
                }
                springView.i();
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                s sVar = (g) bVar.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                c1219hH2.t(EnumC1217f.APPEAR);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF2.mSpiel());
                ((MayaBaseFragment) sVar).A1(c1219hH2);
                if (payMayaErrorF2.isNetworkError()) {
                    final MayaMissionsInProgressFragment mayaMissionsInProgressFragment = (MayaMissionsInProgressFragment) ((g) bVar.c.get());
                    mayaMissionsInProgressFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaMissionsInProgressFragment, 100, null, null, new View.OnClickListener() { // from class: G9.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    MayaMissionsInProgressFragment mayaMissionsInProgressFragment2 = mayaMissionsInProgressFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaMissionsInProgressFragment2.O1();
                                        mayaMissionsInProgressFragment2.P1().l();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaMissionsInProgressFragment mayaMissionsInProgressFragment3 = mayaMissionsInProgressFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaMissionsInProgressFragment3.O1();
                                        mayaMissionsInProgressFragment3.P1().l();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                    return;
                } else {
                    final MayaMissionsInProgressFragment mayaMissionsInProgressFragment2 = (MayaMissionsInProgressFragment) ((g) bVar.c.get());
                    mayaMissionsInProgressFragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaMissionsInProgressFragment2, 200, null, null, new View.OnClickListener() { // from class: G9.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    MayaMissionsInProgressFragment mayaMissionsInProgressFragment22 = mayaMissionsInProgressFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaMissionsInProgressFragment22.O1();
                                        mayaMissionsInProgressFragment22.P1().l();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaMissionsInProgressFragment mayaMissionsInProgressFragment3 = mayaMissionsInProgressFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaMissionsInProgressFragment3.O1();
                                        mayaMissionsInProgressFragment3.P1().l();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                    return;
                }
            case 9:
                Transfer transfer = (Transfer) obj;
                j.g(transfer, "transfer");
                ((Bb.e) this.f2414b).r(transfer);
                return;
            case 10:
                Transfer transfer2 = (Transfer) obj;
                j.g(transfer2, "transfer");
                ((Bb.o) this.f2414b).l(transfer2);
                return;
            case 11:
                io.reactivex.rxjava3.disposables.b it2 = (io.reactivex.rxjava3.disposables.b) obj;
                j.g(it2, "it");
                ((Bb.p) this.f2414b).e(new io.reactivex.rxjava3.disposables.b[0]);
                return;
            case 13:
                KycSubmissionNotify it3 = (KycSubmissionNotify) obj;
                j.g(it3, "it");
                ((InterfaceC0277b) ((C0196d) this.f2414b).c.get()).F();
                return;
            case 15:
                Throwable p02 = (Throwable) obj;
                j.g(p02, "p0");
                B b8 = (B) this.f2414b;
                b8.getClass();
                b8.l(p02, null, null, new Ag.d(b8, 10));
                return;
            case 16:
                Throwable p03 = (Throwable) obj;
                j.g(p03, "p0");
                E e = (E) this.f2414b;
                e.getClass();
                e.l(p03, null, null, new Ag.d(e, i4));
                return;
            case 19:
                Voucher voucher = (Voucher) obj;
                j.g(voucher, "voucher");
                C0214w c0214w2 = (C0214w) this.f2414b;
                c0214w2.getClass();
                ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).f14297L0 = voucher;
                String strMMechanics = voucher.mMechanics();
                if (strMMechanics != null && !C2576A.H(strMMechanics)) {
                    HtmlTextView htmlTextView = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).f14289C0;
                    if (htmlTextView == null) {
                        j.n("mHtmlTextViewMechanicsContent");
                        throw null;
                    }
                    htmlTextView.setTextHTML(strMMechanics);
                }
                String strMFaq = voucher.mFaq();
                if (strMFaq != null && !C2576A.H(strMFaq)) {
                    HtmlTextView htmlTextView2 = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).f14288B0;
                    if (htmlTextView2 == null) {
                        j.n("mHtmlTextViewFaqContent");
                        throw null;
                    }
                    htmlTextView2.setText(strMFaq);
                }
                Fc.b bVar2 = (Fc.b) c0214w2.c.get();
                String strMCampaignName = voucher.mCampaignName();
                TextView textView = ((MayaVoucherDetailsFragment) bVar2).f14302r0;
                if (textView == null) {
                    j.n("mTextViewCampaignName");
                    throw null;
                }
                textView.setText(strMCampaignName);
                String strMBannerUrl = voucher.mBannerUrl();
                if (strMBannerUrl == null || C2576A.H(strMBannerUrl)) {
                    ImageView imageView = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).f14306z0;
                    if (imageView == null) {
                        j.n("mLottieViewLoadingBanner");
                        throw null;
                    }
                    imageView.setVisibility(8);
                } else {
                    MayaVoucherDetailsFragment mayaVoucherDetailsFragment = (MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get());
                    ImageView imageView2 = mayaVoucherDetailsFragment.f14306z0;
                    if (imageView2 == null) {
                        j.n("mLottieViewLoadingBanner");
                        throw null;
                    }
                    imageView2.setVisibility(0);
                    ImageView imageView3 = mayaVoucherDetailsFragment.f14287A0;
                    if (imageView3 == null) {
                        j.n("mImageViewBanner");
                        throw null;
                    }
                    imageView3.setVisibility(8);
                    G gH = A.d().h(strMBannerUrl);
                    gH.b(2131231676);
                    ImageView imageView4 = mayaVoucherDetailsFragment.f14306z0;
                    if (imageView4 == null) {
                        j.n("mLottieViewLoadingBanner");
                        throw null;
                    }
                    gH.e(imageView4, null);
                }
                VoucherDenomination voucherDenominationMDenomination = voucher.mDenomination();
                if (voucherDenominationMDenomination != null) {
                    String strMStringValue = voucherDenominationMDenomination.mStringValue();
                    if (strMStringValue != null && !C2576A.H(strMStringValue)) {
                        Fc.b bVar3 = (Fc.b) c0214w2.c.get();
                        String strH = AbstractC1414e.h("₱", J.f10420a.format(voucherDenominationMDenomination.mValue()));
                        TextView textView2 = ((MayaVoucherDetailsFragment) bVar3).f14303s0;
                        if (textView2 == null) {
                            j.n("mTextViewAmount");
                            throw null;
                        }
                        textView2.setText(strH);
                        TextView textView3 = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).f14303s0;
                        if (textView3 == null) {
                            j.n("mTextViewAmount");
                            throw null;
                        }
                        textView3.setVisibility(0);
                    } else if ("AMOUNT".equalsIgnoreCase(voucherDenominationMDenomination.mType())) {
                        Fc.b bVar4 = (Fc.b) c0214w2.c.get();
                        String strH2 = AbstractC1414e.h("₱", J.f10420a.format(voucherDenominationMDenomination.mValue()));
                        TextView textView4 = ((MayaVoucherDetailsFragment) bVar4).f14303s0;
                        if (textView4 == null) {
                            j.n("mTextViewAmount");
                            throw null;
                        }
                        textView4.setText(strH2);
                        TextView textView5 = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).f14303s0;
                        if (textView5 == null) {
                            j.n("mTextViewAmount");
                            throw null;
                        }
                        textView5.setVisibility(0);
                    } else {
                        TextView textView6 = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).f14303s0;
                        if (textView6 == null) {
                            j.n("mTextViewAmount");
                            throw null;
                        }
                        textView6.setVisibility(8);
                    }
                    if ("PROMO".equalsIgnoreCase(voucherDenominationMDenomination.mType()) && voucherDenominationMDenomination.mValue() <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                        c0214w2.r(voucher.mStatus());
                    }
                } else {
                    c0214w2.r(voucher.mStatus());
                }
                c0214w2.u(voucher.mEndDate(), voucher.mStatus());
                if ("NEW".equalsIgnoreCase(voucher.mStatus())) {
                    if (((com.paymaya.data.preference.a) c0214w2.e).e().isVoucherCalendarReminderEnabled()) {
                        ImageView imageView5 = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).f14305x0;
                        if (imageView5 == null) {
                            j.n("mImageViewReminderCalendar");
                            throw null;
                        }
                        imageView5.setVisibility(0);
                        AppCompatCheckBox appCompatCheckBox = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).w0;
                        if (appCompatCheckBox == null) {
                            j.n("mCheckBoxReminder");
                            throw null;
                        }
                        appCompatCheckBox.setVisibility(8);
                    } else {
                        ImageView imageView6 = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).f14305x0;
                        if (imageView6 == null) {
                            j.n("mImageViewReminderCalendar");
                            throw null;
                        }
                        imageView6.setVisibility(8);
                        AppCompatCheckBox appCompatCheckBox2 = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).w0;
                        if (appCompatCheckBox2 == null) {
                            j.n("mCheckBoxReminder");
                            throw null;
                        }
                        appCompatCheckBox2.setVisibility(0);
                    }
                }
                Fc.b bVar5 = (Fc.b) c0214w2.c.get();
                boolean zMHasReminder = voucher.mHasReminder();
                AppCompatCheckBox appCompatCheckBox3 = ((MayaVoucherDetailsFragment) bVar5).w0;
                if (appCompatCheckBox3 == null) {
                    j.n("mCheckBoxReminder");
                    throw null;
                }
                appCompatCheckBox3.setChecked(zMHasReminder);
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment2 = (MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get());
                mayaVoucherDetailsFragment2.L1();
                Gc.d dVar = mayaVoucherDetailsFragment2.f14298M0;
                if (dVar != null) {
                    ((MayaVouchersActivity) dVar).Q(mayaVoucherDetailsFragment2);
                }
                c0214w2.t(voucher.mExternalPartnerCode(), voucher.mStatus());
                return;
            case 20:
                VoucherBase voucherBase = (VoucherBase) obj;
                j.g(voucherBase, "voucherBase");
                ((Dc.d) this.f2414b).m(voucherBase);
                return;
            case 21:
                List p04 = (List) obj;
                j.g(p04, "p0");
                C0214w c0214w3 = (C0214w) this.f2414b;
                c0214w3.getClass();
                k1 k1Var = ((InvestPreviewFragment) ((Gd.a) c0214w3.c.get())).f14613a0;
                j.d(k1Var);
                ((Q) k1Var.f).f3874d.setVisibility(8);
                if (p04.isEmpty()) {
                    k1 k1Var2 = ((InvestPreviewFragment) ((Gd.a) c0214w3.c.get())).f14613a0;
                    j.d(k1Var2);
                    ((Q) k1Var2.f).f3873b.setVisibility(8);
                    return;
                }
                k1 k1Var3 = ((InvestPreviewFragment) ((Gd.a) c0214w3.c.get())).f14613a0;
                j.d(k1Var3);
                ((Q) k1Var3.f).f3873b.setVisibility(0);
                InvestPreviewFragment investPreviewFragment = (InvestPreviewFragment) ((Gd.a) c0214w3.c.get());
                investPreviewFragment.getClass();
                Fd.a aVar = investPreviewFragment.f14615c0;
                if (aVar != null) {
                    aVar.submitList(p04);
                    return;
                } else {
                    j.n("mInvestmentPartnerAdapter");
                    throw null;
                }
            case 26:
                AppCompatTextView appCompatTextView = ((MayaAutoCashinWalletSettingsFragment) ((K6.a) ((A7.j) this.f2414b).c.get())).f11616W;
                if (appCompatTextView == null) {
                    j.n("mTextViewAutoCashin");
                    throw null;
                }
                appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maya_ic_auto_cashin, 0, R.drawable.maya_ic_auto_cashin_off, 0);
                ((MayaAutoCashinWalletSettingsFragment) ((K6.a) ((A7.j) this.f2414b).c.get())).w1();
                return;
            case 28:
                CreatePullFunds createPullFunds = (CreatePullFunds) obj;
                j.g(createPullFunds, "createPullFunds");
                G6.s sVar2 = (G6.s) this.f2414b;
                sVar2.getClass();
                ((MayaBaseFragment) ((l) sVar2.c.get())).w1();
                ((MayaCashInViaCardFormFragment) ((l) sVar2.c.get())).J1(createPullFunds, 1);
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 4) {
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
        return ((Ch.e) this.f2414b).c(objArr[0], objArr[1], objArr[2], objArr[3]);
    }

    @Override // E.h
    public c0.f b(E.a aVar) {
        Future futureSubmit;
        S.l("handling bitmap download request in BitmapDownloadRequestHandlerWithTimeLimit....");
        CleverTapInstanceConfig cleverTapInstanceConfig = aVar.f1205d;
        if (cleverTapInstanceConfig != null) {
            long j = aVar.e;
            if (j != -1) {
                C1915b c1915bA = l0.b.a(cleverTapInstanceConfig).a();
                CallableC0170c callableC0170c = new CallableC0170c(6, this, aVar);
                Executor executor = (Executor) c1915bA.e;
                if (!(executor instanceof ExecutorService)) {
                    throw new UnsupportedOperationException("Can't use this method without ExecutorService, Use Execute alternatively ");
                }
                Object obj = null;
                try {
                    futureSubmit = ((ExecutorService) executor).submit(callableC0170c);
                } catch (Exception e) {
                    e = e;
                    futureSubmit = null;
                }
                try {
                    obj = futureSubmit.get(j, TimeUnit.MILLISECONDS);
                } catch (Exception e7) {
                    e = e7;
                    e.printStackTrace();
                    if (futureSubmit != null && !futureSubmit.isCancelled()) {
                        futureSubmit.cancel(true);
                    }
                    S.l("submitAndGetResult :: getNotificationBitmap task timed out");
                }
                c0.f fVar = (c0.f) obj;
                if (fVar == null) {
                    fVar = new c0.f(null, c0.e.f9188d, -1L, null);
                }
                return d0.f(aVar.f1204b, aVar.c, fVar);
            }
        }
        S.l("either config is null or downloadTimeLimitInMillis is negative.");
        S.l("will download bitmap without time limit");
        return ((h) this.f2414b).b(aVar);
    }

    @Override // tj.InterfaceC2288a
    public Object getValue(Object obj, KProperty property) {
        Fragment thisRef = (Fragment) obj;
        j.g(thisRef, "thisRef");
        j.g(property, "property");
        F8.a aVar = (F8.a) this.f2414b;
        if (aVar != null) {
            return aVar;
        }
        F8.a aVar2 = new F8.a(thisRef.getArguments());
        this.f2414b = aVar2;
        return aVar2;
    }

    @Override // W6.e
    public void onDismiss() {
        AbstractC1236z.b((MayaSendMoneyActivity) this.f2414b);
    }

    @Override // F1.c
    public Object zza() {
        return new E1.k(((E1.e) ((C2361c) this.f2414b).f20518b).f1229a);
    }

    public /* synthetic */ a(Object obj, int i) {
        this.f2413a = i;
        this.f2414b = obj;
    }

    public a(I7.f fVar, com.paymaya.data.preference.a preference) {
        this.f2413a = 3;
        j.g(preference, "preference");
        this.f2414b = fVar;
    }
}
