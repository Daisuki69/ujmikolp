package V2;

import A7.h;
import B5.l;
import Bb.o;
import C.k;
import D.C0190x;
import D8.C0196d;
import D8.C0198f;
import D8.C0214w;
import D8.D;
import D8.G;
import D8.N;
import F9.e;
import G6.p;
import G6.t;
import Ic.f;
import K6.g;
import K6.m;
import K8.InterfaceC0278c;
import K8.w;
import Kh.I;
import L6.InterfaceC0316b;
import N5.C0450f;
import N5.C1;
import N5.k1;
import Xh.i;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import bj.C1042m;
import com.dynatrace.android.callback.Callback;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.KycAdditionalDocsUploadResponse;
import com.paymaya.domain.model.KycLatestSubmissionContentData;
import com.paymaya.domain.model.KycMinorPhotos;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Success;
import com.paymaya.domain.model.Voucher;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInWebFragment;
import com.paymaya.mayaui.kyczoloz.utils.d;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsCompletedFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import w.C2361c;
import y5.s;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Ch.c, k, F1.c, Ch.a {
    public static volatile c c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6042b;

    public /* synthetic */ c(Object obj, int i) {
        this.f6041a = i;
        this.f6042b = obj;
    }

    public static ArrayList a(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        j.f(enumConstants, numX49.tnTj78("bPKL"));
        ArrayList arrayList = new ArrayList(enumConstants.length);
        for (Object obj : enumConstants) {
            arrayList.add(((Enum) obj).name());
        }
        return arrayList;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        String strMVerificationUrl;
        String strTnTj78 = numX49.tnTj78("bPKr");
        int i = 8;
        String strTnTj782 = numX49.tnTj78("bPKZ");
        String strTnTj783 = numX49.tnTj78("bPKk");
        String strTnTj784 = numX49.tnTj78("bPKB");
        String strTnTj785 = numX49.tnTj78("bPKu");
        String strTnTj786 = numX49.tnTj78("bPKV");
        String strTnTj787 = numX49.tnTj78("bPKS");
        final int i4 = 0;
        final int i6 = 1;
        switch (this.f6041a) {
            case 1:
                j.g((Throwable) obj, strTnTj787);
                ((Function0) this.f6042b).invoke();
                return;
            case 2:
                ((h) this.f6042b).D(((Boolean) obj).booleanValue());
                return;
            case 3:
                ((l) this.f6042b).c();
                return;
            case 4:
                B9.b bVar = (B9.b) this.f6042b;
                PayMayaError payMayaErrorF = bVar.f((Throwable) obj, false);
                j.f(payMayaErrorF, strTnTj78);
                SpringView springView = ((MayaMissionsCompletedFragment) ((F9.a) bVar.c.get())).f12962r0;
                if (springView == null) {
                    j.n(numX49.tnTj78("bPKy"));
                    throw null;
                }
                springView.i();
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                s sVar = (F9.a) bVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.APPEAR);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(strTnTj783, payMayaErrorF.mSpiel());
                ((MayaBaseFragment) sVar).A1(c1219hH);
                if (payMayaErrorF.isNetworkError()) {
                    final MayaMissionsCompletedFragment mayaMissionsCompletedFragment = (MayaMissionsCompletedFragment) ((F9.a) bVar.c.get());
                    mayaMissionsCompletedFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaMissionsCompletedFragment, 100, null, null, new View.OnClickListener() { // from class: G9.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    MayaMissionsCompletedFragment mayaMissionsCompletedFragment2 = mayaMissionsCompletedFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaMissionsCompletedFragment2.O1();
                                        mayaMissionsCompletedFragment2.P1().k();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaMissionsCompletedFragment mayaMissionsCompletedFragment3 = mayaMissionsCompletedFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaMissionsCompletedFragment3.O1();
                                        mayaMissionsCompletedFragment3.P1().k();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                    return;
                } else {
                    final MayaMissionsCompletedFragment mayaMissionsCompletedFragment2 = (MayaMissionsCompletedFragment) ((F9.a) bVar.c.get());
                    mayaMissionsCompletedFragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaMissionsCompletedFragment2, 200, null, null, new View.OnClickListener() { // from class: G9.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i6) {
                                case 0:
                                    MayaMissionsCompletedFragment mayaMissionsCompletedFragment22 = mayaMissionsCompletedFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaMissionsCompletedFragment22.O1();
                                        mayaMissionsCompletedFragment22.P1().k();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaMissionsCompletedFragment mayaMissionsCompletedFragment3 = mayaMissionsCompletedFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaMissionsCompletedFragment3.O1();
                                        mayaMissionsCompletedFragment3.P1().k();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                    return;
                }
            case 5:
                j.g((Throwable) obj, strTnTj787);
                ((MayaMissionsFragment) ((e) ((B9.c) this.f6042b).c.get())).P1();
                return;
            case 6:
                Ze.a aVar = (Ze.a) obj;
                j.g(aVar, strTnTj786);
                ((Bb.a) this.f6042b).getClass();
                if (aVar.f6934b) {
                    yk.a.a();
                    return;
                } else if (aVar.c) {
                    yk.a.a();
                    return;
                } else {
                    yk.a.a();
                    return;
                }
            case 7:
                io.reactivex.rxjava3.disposables.b bVar2 = (io.reactivex.rxjava3.disposables.b) obj;
                j.g(bVar2, strTnTj787);
                ((Bb.e) this.f6042b).e(bVar2);
                return;
            case 8:
                o oVar = (o) this.f6042b;
                PayMayaError payMayaErrorF2 = oVar.f((Throwable) obj, false);
                j.f(payMayaErrorF2, strTnTj78);
                oVar.k(payMayaErrorF2);
                return;
            case 9:
            case 15:
            case 19:
            case 20:
            case 21:
            case 24:
            default:
                j.g((Success) obj, strTnTj787);
                t tVar = (t) this.f6042b;
                ExecutePullFunds executePullFundsP1 = ((MayaCashInWebFragment) ((m) tVar.c.get())).P1();
                if (executePullFundsP1 == null || (strMVerificationUrl = executePullFundsP1.mVerificationUrl()) == null) {
                    return;
                }
                ((MayaCashInWebFragment) ((m) tVar.c.get())).L1();
                ((MayaCashInWebFragment) ((m) tVar.c.get())).R1().b();
                MayaCashInWebFragment mayaCashInWebFragment = (MayaCashInWebFragment) ((m) tVar.c.get());
                mayaCashInWebFragment.getClass();
                WebView webView = mayaCashInWebFragment.f11757p0;
                if (webView == null) {
                    j.n(numX49.tnTj78("bPKd"));
                    throw null;
                }
                webView.loadUrl(strMVerificationUrl);
                ProgressBar progressBar = ((MayaCashInWebFragment) ((m) tVar.c.get())).f11758q0;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                } else {
                    j.n(numX49.tnTj78("bPKj"));
                    throw null;
                }
            case 10:
                KycLatestSubmissionContentData kycLatestSubmissionContentData = (KycLatestSubmissionContentData) obj;
                j.g(kycLatestSubmissionContentData, strTnTj786);
                ((C0196d) this.f6042b).q(kycLatestSubmissionContentData);
                return;
            case 11:
                C1042m c1042m = (C1042m) obj;
                j.g(c1042m, strTnTj786);
                C0198f c0198f = (C0198f) this.f6042b;
                File cacheDir = ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).requireContext().getCacheDir();
                j.f(cacheDir, numX49.tnTj78("bPK6"));
                d.c(cacheDir);
                InterfaceC0278c interfaceC0278c = (InterfaceC0278c) c0198f.c.get();
                KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse = (KycAdditionalDocsUploadResponse) c1042m.f9174a;
                KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse2 = (KycAdditionalDocsUploadResponse) c1042m.f9175b;
                KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse3 = (KycAdditionalDocsUploadResponse) c1042m.c;
                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) interfaceC0278c;
                mayaKycAdditionalDocumentsFragment.getClass();
                j.g(kycAdditionalDocsUploadResponse, numX49.tnTj78("bPKa"));
                j.g(kycAdditionalDocsUploadResponse2, numX49.tnTj78("bPKX"));
                j.g(kycAdditionalDocsUploadResponse3, numX49.tnTj78("bPKG"));
                String privateUrl = kycAdditionalDocsUploadResponse.getFile().getPrivateUrl();
                if (privateUrl == null) {
                    privateUrl = strTnTj785;
                }
                String privateUrl2 = kycAdditionalDocsUploadResponse2.getFile().getPrivateUrl();
                if (privateUrl2 == null) {
                    privateUrl2 = strTnTj785;
                }
                String privateUrl3 = kycAdditionalDocsUploadResponse3.getFile().getPrivateUrl();
                if (privateUrl3 != null) {
                    strTnTj785 = privateUrl3;
                }
                i.H(mayaKycAdditionalDocumentsFragment, new KycMinorPhotos(privateUrl, privateUrl2, strTnTj785), numX49.tnTj78("bPK3"));
                ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) c0198f.c.get())).P1();
                return;
            case 12:
                Throwable throwable = (Throwable) obj;
                j.g(throwable, "throwable");
                ((D) this.f6042b).B(throwable);
                return;
            case 13:
                Throwable th2 = (Throwable) obj;
                j.g(th2, strTnTj782);
                G g8 = (G) this.f6042b;
                MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment = (MayaKycLivenessCaptureFragment) ((w) g8.c.get());
                mayaKycLivenessCaptureFragment.getClass();
                Gb.d dVar = new Gb.d(mayaKycLivenessCaptureFragment, 19);
                mayaKycLivenessCaptureFragment.K1();
                HuiYanOsApi.startHuiYanAuth(strTnTj785, mayaKycLivenessCaptureFragment.f14176W, dVar);
                ((MayaKycLivenessCaptureFragment) ((w) g8.c.get())).f12564c0 = true;
                g8.f1013g = th2;
                return;
            case 14:
                Throwable th3 = (Throwable) obj;
                j.g(th3, strTnTj786);
                N n7 = (N) this.f6042b;
                n7.getClass();
                n7.l(th3, new C0190x(0, n7.c.get(), K8.G.class, "showPreSubmissionTokenExpiredError", "showPreSubmissionTokenExpiredError()V", 0, 13), null, new Ag.d(n7, 13));
                return;
            case 16:
                Ze.a aVar2 = (Ze.a) obj;
                j.g(aVar2, strTnTj787);
                C0214w c0214w = (C0214w) this.f6042b;
                Voucher voucher = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get())).f14297L0;
                if (voucher != null) {
                    if (!aVar2.f6934b) {
                        ((MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get())).V1(voucher);
                        ((MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get())).X1();
                        return;
                    }
                    MayaVoucherDetailsFragment mayaVoucherDetailsFragment = (MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get());
                    mayaVoucherDetailsFragment.getClass();
                    long millis = AbstractC1234x.b(voucher.mEndDate()).getMillis();
                    String string = mayaVoucherDetailsFragment.getString(R.string.maya_label_format_voucher_calendar_reminder_description_link, We.s.l(numX49.tnTj78("bPKw"), voucher.mCode(), numX49.tnTj78("bPKc"), voucher.mCode(), numX49.tnTj78("bPKm")));
                    j.f(string, numX49.tnTj78("bPKD"));
                    Context contextRequireContext = mayaVoucherDetailsFragment.requireContext();
                    String strTnTj788 = numX49.tnTj78("bPKh");
                    j.f(contextRequireContext, strTnTj788);
                    Long lK = jk.b.k(contextRequireContext);
                    Context contextRequireContext2 = mayaVoucherDetailsFragment.requireContext();
                    j.f(contextRequireContext2, strTnTj788);
                    String strMCampaignName = voucher.mCampaignName();
                    j.f(strMCampaignName, numX49.tnTj78("bPKM"));
                    Long lQ = jk.b.q(contextRequireContext2, lK, strMCampaignName, string, millis, millis + 1);
                    Context contextRequireContext3 = mayaVoucherDetailsFragment.requireContext();
                    j.f(contextRequireContext3, strTnTj788);
                    Long lR = jk.b.r(contextRequireContext3, lQ);
                    C0214w c0214wP1 = mayaVoucherDetailsFragment.P1();
                    Voucher voucher2 = ((MayaVoucherDetailsFragment) ((Fc.b) c0214wP1.c.get())).f14297L0;
                    if (voucher2 != null) {
                        if (lQ == null || lR == null) {
                            ((MayaVoucherDetailsFragment) ((Fc.b) c0214wP1.c.get())).X1();
                            ((MayaVoucherDetailsFragment) ((Fc.b) c0214wP1.c.get())).V1(voucher2);
                            return;
                        }
                        ((MayaVoucherDetailsFragment) ((Fc.b) c0214wP1.c.get())).Y1();
                        MayaVoucherDetailsFragment mayaVoucherDetailsFragment2 = (MayaVoucherDetailsFragment) ((Fc.b) c0214wP1.c.get());
                        mayaVoucherDetailsFragment2.getClass();
                        C1220i c1220iO1 = mayaVoucherDetailsFragment2.o1();
                        FragmentActivity activity = mayaVoucherDetailsFragment2.getActivity();
                        C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
                        c1219hD.n(14);
                        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                        c1219hD.j.put(numX49.tnTj78("bPKN"), String.valueOf(voucher2.mAssignmentId()));
                        c1220iO1.c(activity, c1219hD);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                io.reactivex.rxjava3.disposables.b bVar3 = (io.reactivex.rxjava3.disposables.b) obj;
                j.g(bVar3, strTnTj787);
                ((Dc.d) this.f6042b).e(bVar3);
                return;
            case 18:
                List<OnlinePayment> list = (List) obj;
                j.g(list, strTnTj786);
                C0214w c0214w2 = (C0214w) this.f6042b;
                c0214w2.getClass();
                if (list.isEmpty()) {
                    k1 k1Var = ((InvestPreviewFragment) ((Gd.a) c0214w2.c.get())).f14613a0;
                    j.d(k1Var);
                    ((ConstraintLayout) ((C0450f) k1Var.f4139d).c).setVisibility(8);
                    return;
                }
                k1 k1Var2 = ((InvestPreviewFragment) ((Gd.a) c0214w2.c.get())).f14613a0;
                j.d(k1Var2);
                ((ConstraintLayout) ((C0450f) k1Var2.f4139d).c).setVisibility(0);
                InvestPreviewFragment investPreviewFragment = (InvestPreviewFragment) ((Gd.a) c0214w2.c.get());
                investPreviewFragment.getClass();
                k1 k1Var3 = investPreviewFragment.f14613a0;
                j.d(k1Var3);
                LinearLayout linearLayout = (LinearLayout) ((C0450f) k1Var3.f4139d).f4087b;
                linearLayout.removeAllViews();
                for (OnlinePayment onlinePayment : list) {
                    ImageView imageView = new ImageView(investPreviewFragment.requireContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ((Number) investPreviewFragment.f14616d0.getValue()).floatValue();
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setAdjustViewBounds(true);
                    imageView.setOnClickListener(new Ad.a(i, investPreviewFragment, onlinePayment));
                    linearLayout.addView(imageView, layoutParams);
                    investPreviewFragment.requireContext();
                    C.d0(imageView, onlinePayment.mBackgroundUrl());
                }
                k1 k1Var4 = ((InvestPreviewFragment) ((Gd.a) c0214w2.c.get())).f14613a0;
                j.d(k1Var4);
                ((LinearLayout) ((C0450f) k1Var4.f4139d).f4088d).setVisibility(8);
                return;
            case 22:
                Throwable th4 = (Throwable) obj;
                j.g(th4, strTnTj782);
                ((F8.b) this.f6042b).b(th4 instanceof Exception ? (Exception) th4 : null, null);
                return;
            case 23:
                Throwable throwable2 = (Throwable) obj;
                j.g(throwable2, "throwable");
                C0214w c0214w3 = (C0214w) this.f6042b;
                PayMayaError payMayaErrorF3 = c0214w3.f(throwable2, true);
                j.f(payMayaErrorF3, strTnTj784);
                s sVar2 = (K6.b) c0214w3.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                EnumC1217f enumC1217f = EnumC1217f.EXECUTE;
                c1219hH2.t(enumC1217f);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(strTnTj783, payMayaErrorF3.mSpiel());
                BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) c0214w3.f1106g;
                String id = bankPullPaymentOption != null ? bankPullPaymentOption.getId() : null;
                HashMap map = c1219hH2.j;
                String strTnTj789 = numX49.tnTj78("bPKK");
                map.put(strTnTj789, id);
                c1219hH2.i();
                ((MayaBaseFragment) sVar2).z1(c1219hH2);
                if (payMayaErrorF3.isSessionTimeout()) {
                    return;
                }
                MayaBankPullConfirmationFragment mayaBankPullConfirmationFragment = (MayaBankPullConfirmationFragment) ((K6.b) c0214w3.c.get());
                mayaBankPullConfirmationFragment.getClass();
                C1219h c1219h = new C1219h();
                c1219h.n(12);
                c1219h.t(enumC1217f);
                c1219h.j.put(strTnTj783, payMayaErrorF3.mSpiel());
                c1219h.j.put(strTnTj789, mayaBankPullConfirmationFragment.f11627b0);
                c1219h.i();
                mayaBankPullConfirmationFragment.z1(c1219h);
                InterfaceC0316b interfaceC0316b = mayaBankPullConfirmationFragment.f11626a0;
                if (interfaceC0316b != null) {
                    ((MayaCashInActivity) interfaceC0316b).a(payMayaErrorF3, mayaBankPullConfirmationFragment.getString(R.string.pma_toast_error_title_add_money_error));
                    return;
                }
                return;
            case 25:
                CreatePullFunds createPullFunds = (CreatePullFunds) obj;
                j.g(createPullFunds, numX49.tnTj78("bPKo"));
                ((G6.k) this.f6042b).w(createPullFunds);
                return;
            case 26:
                G6.m mVar = (G6.m) this.f6042b;
                PayMayaError payMayaErrorF4 = mVar.f((Throwable) obj, true);
                j.f(payMayaErrorF4, strTnTj784);
                s sVar3 = (g) mVar.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put(strTnTj783, payMayaErrorF4.mSpiel());
                ((MayaBaseFragment) sVar3).A1(c1219hH3);
                ((MayaBaseFragment) ((g) mVar.c.get())).w1();
                if (payMayaErrorF4.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF4.isNetworkError()) {
                    ((MayaCashInCodeFragment) ((g) mVar.c.get())).I1(payMayaErrorF4.mSpiel());
                    return;
                } else {
                    MayaCashInCodeFragment mayaCashInCodeFragment = (MayaCashInCodeFragment) ((g) mVar.c.get());
                    mayaCashInCodeFragment.I1(mayaCashInCodeFragment.getString(R.string.maya_label_connection_issue));
                    return;
                }
            case 27:
                p pVar = (p) this.f6042b;
                PayMayaError payMayaErrorF5 = pVar.f((Throwable) obj, true);
                j.f(payMayaErrorF5, strTnTj784);
                pVar.s(payMayaErrorF5);
                return;
            case 28:
                ExecutePullFunds executePullFunds = (ExecutePullFunds) obj;
                j.g(executePullFunds, numX49.tnTj78("bPKi"));
                C0214w c0214w4 = (C0214w) this.f6042b;
                s sVar4 = (K6.k) c0214w4.c.get();
                C1219h c1219hH4 = AbstractC2329d.h(14);
                c1219hH4.t(EnumC1217f.VIA_CARD_EXECUTE);
                ((MayaBaseFragment) sVar4).A1(c1219hH4);
                String strMVerificationUrl2 = executePullFunds.mVerificationUrl();
                if (strMVerificationUrl2 == null || C2576A.H(strMVerificationUrl2)) {
                    L6.t tVar2 = ((MayaCashInViaCardConfirmationFragment) ((K6.k) c0214w4.c.get())).f11730h0;
                    if (tVar2 != null) {
                        ((MayaCashInActivity) tVar2).d2(executePullFunds);
                        return;
                    }
                    return;
                }
                MayaCashInViaCardConfirmationFragment mayaCashInViaCardConfirmationFragment = (MayaCashInViaCardConfirmationFragment) ((K6.k) c0214w4.c.get());
                C0214w c0214wG1 = mayaCashInViaCardConfirmationFragment.G1();
                String strMPaymentId = executePullFunds.mPaymentId();
                if (((com.paymaya.data.preference.a) c0214wG1.e).e().isKountEnabled() && strMPaymentId != null) {
                    K6.k kVar = (K6.k) c0214wG1.c.get();
                    String strT = z.t(strMPaymentId, numX49.tnTj78("bPKE"), strTnTj785);
                    MayaCashInViaCardConfirmationFragment mayaCashInViaCardConfirmationFragment2 = (MayaCashInViaCardConfirmationFragment) kVar;
                    mayaCashInViaCardConfirmationFragment2.getClass();
                    if (p4.c.h == null) {
                        p4.c cVar = new p4.c();
                        cVar.f19064d = 0;
                        cVar.e = 1;
                        cVar.f = null;
                        cVar.f19065g = null;
                        cVar.f19065g = Executors.newSingleThreadExecutor();
                        p4.c.h = cVar;
                    }
                    p4.c cVar2 = p4.c.h;
                    cVar2.getClass();
                    cVar2.f19063b = true;
                    cVar2.b(null, numX49.tnTj78("bPKF"));
                    cVar2.f = mayaCashInViaCardConfirmationFragment2.getContext();
                    Locale locale = Locale.US;
                    cVar2.b(null, numX49.tnTj78("bPKH"));
                    cVar2.f19062a = 776000;
                    cVar2.b(null, numX49.tnTj78("bPKO"));
                    cVar2.b(null, numX49.tnTj78("bPKQ"));
                    cVar2.c = numX49.tnTj78("bPKt");
                    cVar2.f19064d = 2;
                    cVar2.b(null, numX49.tnTj78("bPKU"));
                    cVar2.e = 2;
                    I i10 = new I(6);
                    if (cVar2.f == null) {
                        cVar2.a(i10, null, strT, Boolean.FALSE, p4.b.CONTEXT_NOT_SET);
                    } else {
                        cVar2.b(null, numX49.tnTj78("bPKe") + strT + numX49.tnTj78("bPK8"));
                        cVar2.f19065g.execute(new V4.e(cVar2, strT, i10));
                    }
                }
                L6.t tVar3 = mayaCashInViaCardConfirmationFragment.f11730h0;
                if (tVar3 != null) {
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) tVar3;
                    MayaCashInWebFragment mayaCashInWebFragment2 = new MayaCashInWebFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(numX49.tnTj78("bPKC"), executePullFunds);
                    bundle.putParcelable(numX49.tnTj78("bPK4"), null);
                    mayaCashInWebFragment2.setArguments(bundle);
                    AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, mayaCashInWebFragment2, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                    return;
                }
                return;
        }
    }

    public Set b() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.f6042b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) this.f6042b);
        }
        return setUnmodifiableSet;
    }

    public MappedByteBuffer c(String str) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd = ((Context) this.f6042b).getAssets().openFd(str);
        j.f(assetFileDescriptorOpenFd, numX49.tnTj78("bPKv"));
        MappedByteBuffer map = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
        j.f(map, numX49.tnTj78("bPK7"));
        return map;
    }

    public void d(String str, String str2) {
        C1 c12 = ((f) this.f6042b).f2289a;
        c12.f3572d.setText(str);
        c12.c.setText(str2);
        c12.f3573g.setVisibility(0);
        c12.i.setVisibility(8);
    }

    @Override // Ch.a
    public void run() {
        ((Ch.c) this.f6042b).accept(Ah.g.f313b);
    }

    @Override // F1.c
    public Object zza() {
        return new E1.d(((E1.e) ((C2361c) this.f6042b).f20518b).f1229a);
    }

    public c() {
        this.f6041a = 0;
        this.f6042b = new HashSet();
    }
}
