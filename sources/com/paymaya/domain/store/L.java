package com.paymaya.domain.store;

import D8.C0214w;
import M8.T2;
import N5.D1;
import N5.r1;
import We.InterfaceC0604h;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.http.X509TrustManagerExtensions;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.media3.extractor.ts.TsExtractor;
import bg.AbstractC0983W;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.ComplianceApi;
import com.paymaya.data.api.ForgotPasswordApi;
import com.paymaya.data.api.KycSubmissionApi;
import com.paymaya.domain.model.DecoratedActivity;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PersonalizationGiphy;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantOTPFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelHomeFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelRouteSelectionFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataPrivacyPolicyFragment;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardFragment;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardPreviewFragment;
import e1.InterfaceC1418b;
import e2.C1421c;
import gc.C1516a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.reactivex.rxjava3.exceptions.CompositeException;
import j1.C1661i;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import je.InterfaceC1679a;
import kotlin.Pair;
import l3.C1798a;
import l9.C1804b;
import l9.C1809g;
import l9.C1819q;
import o9.InterfaceC1970a;
import o9.InterfaceC1972c;
import p2.C2007c;
import p9.InterfaceC2017b;
import p9.InterfaceC2019d;
import p9.InterfaceC2025j;
import p9.ViewOnClickListenerC2020e;
import p9.ViewOnClickListenerC2028m;
import retrofit2.Response;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements Ch.f, Ch.c, InterfaceC0604h, pg.s, f2.a, SuccessContinuation, InterfaceC1418b, hh.n, Ah.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11367b;

    public /* synthetic */ L(Object obj, int i) {
        this.f11366a = i;
        this.f11367b = obj;
    }

    @Override // Ah.j
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        ((Ah.j) this.f11367b).a(bVar);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        List list;
        String gifId;
        MayaDynamicMerchantConfirmationFragment mayaDynamicMerchantConfirmationFragment;
        InterfaceC2017b interfaceC2017b;
        MayaMerchantConfirmationFragment mayaMerchantConfirmationFragment;
        InterfaceC2019d interfaceC2019d;
        int i = 2;
        final int i4 = 0;
        final int i6 = 1;
        switch (this.f11366a) {
            case 4:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((U0) this.f11367b).f11396a.X(false);
                return;
            case 9:
                Throwable p02 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                D8.E e = (D8.E) this.f11367b;
                C8.a.m(e, p02, null, new com.squareup.wire.internal.a(e, 7), 6);
                return;
            case 10:
                C1516a c1516a = (C1516a) this.f11367b;
                PayMayaError payMayaErrorF = c1516a.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                N5.G0 g02 = ((MayaTravelHomeFragment) ((jc.b) c1516a.c.get())).f14196Z;
                if (g02 == null) {
                    kotlin.jvm.internal.j.n("mViewFeaturedPartnersLoading");
                    throw null;
                }
                g02.f3627b.setVisibility(8);
                if (payMayaErrorF.isSessionTimeout() || (list = c1516a.f) == null || !list.isEmpty()) {
                    return;
                }
                Group group = ((MayaTravelHomeFragment) ((jc.b) c1516a.c.get())).f14195Y;
                if (group != null) {
                    group.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mGroupFeaturedPartners");
                    throw null;
                }
            case 11:
                Bb.f fVar = (Bb.f) this.f11367b;
                PayMayaError payMayaErrorF2 = fVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF2.isNetworkError()) {
                    final MayaTravelRouteSelectionFragment mayaTravelRouteSelectionFragment = (MayaTravelRouteSelectionFragment) ((jc.e) fVar.c.get());
                    mayaTravelRouteSelectionFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaTravelRouteSelectionFragment, 100, null, null, new View.OnClickListener() { // from class: kc.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i6) {
                                case 0:
                                    MayaTravelRouteSelectionFragment mayaTravelRouteSelectionFragment2 = mayaTravelRouteSelectionFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaTravelRouteSelectionFragment2.P1().v();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaTravelRouteSelectionFragment mayaTravelRouteSelectionFragment3 = mayaTravelRouteSelectionFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaTravelRouteSelectionFragment3.P1().v();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                    return;
                } else {
                    final MayaTravelRouteSelectionFragment mayaTravelRouteSelectionFragment2 = (MayaTravelRouteSelectionFragment) ((jc.e) fVar.c.get());
                    mayaTravelRouteSelectionFragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaTravelRouteSelectionFragment2, 200, payMayaErrorF2.mSpiel(), null, new View.OnClickListener() { // from class: kc.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    MayaTravelRouteSelectionFragment mayaTravelRouteSelectionFragment22 = mayaTravelRouteSelectionFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaTravelRouteSelectionFragment22.P1().v();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaTravelRouteSelectionFragment mayaTravelRouteSelectionFragment3 = mayaTravelRouteSelectionFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaTravelRouteSelectionFragment3.P1().v();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 28);
                    return;
                }
            case 13:
                DecoratedActivity p03 = (DecoratedActivity) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                G6.p pVar = (G6.p) this.f11367b;
                Decoration mDecoration = p03.getMDecoration();
                TransferPersonalizationMeta mMeta = p03.getMMeta();
                String mProvider = p03.getMProvider();
                if (mMeta == null) {
                    if (mDecoration != null) {
                        ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).r1();
                        pVar.o(mDecoration);
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.j.b(mProvider, "paymaya") && mDecoration != null) {
                    ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).r1();
                    pVar.o(mDecoration);
                    return;
                }
                if (kotlin.jvm.internal.j.b(mProvider, "giphy")) {
                    PersonalizationGiphy gifDecoration = mMeta.getGifDecoration();
                    if (gifDecoration == null || (gifId = gifDecoration.getGifId()) == null) {
                        gifId = "0";
                    }
                    ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).y1();
                    SendMoneyCardFragment sendMoneyCardFragment = (SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get());
                    D1 d12 = sendMoneyCardFragment.f14764S;
                    kotlin.jvm.internal.j.d(d12);
                    ((Group) ((N5.I) d12.h).j).setVisibility(0);
                    D1 d13 = sendMoneyCardFragment.f14764S;
                    kotlin.jvm.internal.j.d(d13);
                    ((ImageView) ((N5.I) d13.h).f3649k).setVisibility(8);
                    ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).t1(gifId);
                    return;
                }
                return;
            case 17:
                M7.c cVar = (M7.c) this.f11367b;
                PayMayaError payMayaErrorF3 = cVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "paymayaErrorHandling(...)");
                Object obj2 = (od.b) cVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.UPDATE_CONSENTS);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF3.mSpiel());
                ((BaseFragment) obj2).o1(c1219hH);
                if (payMayaErrorF3.isSessionTimeout()) {
                    return;
                }
                DataPrivacyPolicyFragment dataPrivacyPolicyFragment = (DataPrivacyPolicyFragment) ((od.b) cVar.c.get());
                dataPrivacyPolicyFragment.getClass();
                pd.e eVar = dataPrivacyPolicyFragment.f14493X;
                if (eVar != null) {
                    String string = dataPrivacyPolicyFragment.getString(R.string.pma_toast_error_title_data_privacy_error);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    ((DataPrivacyActivity) eVar).a(payMayaErrorF3, string);
                    return;
                }
                return;
            case 21:
                C1804b c1804b = (C1804b) this.f11367b;
                PayMayaError payMayaErrorF4 = c1804b.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                y5.s sVar = (InterfaceC1970a) c1804b.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                c1219hH2.t(EnumC1217f.PAY);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF4.mSpiel());
                ((MayaBaseFragment) sVar).A1(c1219hH2);
                if (payMayaErrorF4.mErrorCode() != -155) {
                    if (payMayaErrorF4.isSessionTimeout() || (interfaceC2017b = (mayaDynamicMerchantConfirmationFragment = (MayaDynamicMerchantConfirmationFragment) ((InterfaceC1970a) c1804b.c.get())).f12863Z) == null) {
                        return;
                    }
                    M2.b.Z(0, mayaDynamicMerchantConfirmationFragment.getString(R.string.pma_toast_error_title_merchant_payment_error), null, null, null, false, payMayaErrorF4, null, false, 445).show(((MayaDynamicMerchantActivity) interfaceC2017b).getSupportFragmentManager(), "error_dialog");
                    return;
                }
                MayaDynamicMerchantConfirmationFragment mayaDynamicMerchantConfirmationFragment2 = (MayaDynamicMerchantConfirmationFragment) ((InterfaceC1970a) c1804b.c.get());
                InterfaceC2017b interfaceC2017b2 = mayaDynamicMerchantConfirmationFragment2.f12863Z;
                if (interfaceC2017b2 != null) {
                    MayaDynamicMerchantActivity mayaDynamicMerchantActivity = (MayaDynamicMerchantActivity) interfaceC2017b2;
                    MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, mayaDynamicMerchantConfirmationFragment2.getString(R.string.pma_toast_error_title_merchant_payment_error), null, null, null, false, payMayaErrorF4, null, false, 445);
                    mayaErrorDialogFragmentZ.f11850c0 = new C1258f0(mayaDynamicMerchantActivity, 26);
                    mayaErrorDialogFragmentZ.show(mayaDynamicMerchantActivity.getSupportFragmentManager(), "error_dialog");
                    return;
                }
                return;
            case 22:
                C1804b c1804b2 = (C1804b) this.f11367b;
                PayMayaError payMayaErrorF5 = c1804b2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                y5.s sVar2 = (InterfaceC1972c) c1804b2.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(12);
                c1219hH3.t(EnumC1217f.PAY);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put(Constants.REASON, payMayaErrorF5.mSpiel());
                ((MayaBaseFragment) sVar2).A1(c1219hH3);
                if (payMayaErrorF5.isSessionTimeout() || (interfaceC2019d = (mayaMerchantConfirmationFragment = (MayaMerchantConfirmationFragment) ((InterfaceC1972c) c1804b2.c.get())).f12875Z) == null) {
                    return;
                }
                M2.b.Z(0, mayaMerchantConfirmationFragment.getString(R.string.pma_toast_error_title_merchant_payment_error), null, null, null, false, payMayaErrorF5, null, false, 445).show(((MayaMerchantActivity) interfaceC2019d).getSupportFragmentManager(), "error_dialog");
                return;
            case 23:
                C1809g c1809g = (C1809g) this.f11367b;
                PayMayaError payMayaErrorF6 = c1809g.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                if (payMayaErrorF6.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF6.isNetworkError()) {
                    o9.d dVar = (o9.d) c1809g.c.get();
                    String strMSpiel = payMayaErrorF6.mSpiel();
                    MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) dVar;
                    mayaMerchantPaymentFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaMerchantPaymentFragment, 100, strMSpiel, null, new ViewOnClickListenerC2020e(mayaMerchantPaymentFragment, i), 28);
                    return;
                }
                o9.d dVar2 = (o9.d) c1809g.c.get();
                String strMSpiel2 = payMayaErrorF6.mSpiel();
                MayaMerchantPaymentFragment mayaMerchantPaymentFragment2 = (MayaMerchantPaymentFragment) dVar2;
                mayaMerchantPaymentFragment2.getClass();
                MayaBaseLoadingFragment.N1(mayaMerchantPaymentFragment2, 200, strMSpiel2, null, new ViewOnClickListenerC2020e(mayaMerchantPaymentFragment2, i6), 28);
                return;
            case 24:
                Bb.f fVar2 = (Bb.f) this.f11367b;
                PayMayaError payMayaErrorF7 = fVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                y5.s sVar3 = (o9.g) fVar2.c.get();
                C1219h c1219hH4 = AbstractC2329d.h(12);
                c1219hH4.t(EnumC1217f.CREATE);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH4.j.put(Constants.REASON, payMayaErrorF7.mSpiel());
                ((MayaBaseFragment) sVar3).A1(c1219hH4);
                if (payMayaErrorF7.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF7.mErrorCode() == -337) {
                    InterfaceC2025j interfaceC2025j = ((MayaQRPHDynamicMerchantPaymentFragment) ((o9.g) fVar2.c.get())).f12897Y;
                    if (interfaceC2025j != null) {
                        ((MayaQRPHMerchantActivity) interfaceC2025j).f2();
                        return;
                    }
                    return;
                }
                MayaQRPHDynamicMerchantPaymentFragment mayaQRPHDynamicMerchantPaymentFragment = (MayaQRPHDynamicMerchantPaymentFragment) ((o9.g) fVar2.c.get());
                InterfaceC2025j interfaceC2025j2 = mayaQRPHDynamicMerchantPaymentFragment.f12897Y;
                if (interfaceC2025j2 != null) {
                    ((MayaQRPHMerchantActivity) interfaceC2025j2).a(payMayaErrorF7, mayaQRPHDynamicMerchantPaymentFragment.getString(R.string.pma_toast_error_title_merchant_payment_error));
                    return;
                }
                return;
            case 25:
                C0214w c0214w = (C0214w) this.f11367b;
                PayMayaError payMayaErrorF8 = c0214w.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF8, "mayaErrorHandling(...)");
                ((MayaBaseFragment) ((o9.i) c0214w.c.get())).w1();
                if (payMayaErrorF8.isSessionTimeout()) {
                    return;
                }
                y5.s sVar4 = (o9.i) c0214w.c.get();
                C1219h c1219hH5 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH5.j.put(Constants.REASON, payMayaErrorF8.mSpiel());
                ((MayaBaseFragment) sVar4).A1(c1219hH5);
                if (payMayaErrorF8.mErrorCode() == -332) {
                    ((MayaQRPHMerchantOTPFragment) ((o9.i) c0214w.c.get())).X1(payMayaErrorF8.mSpiel());
                    return;
                } else {
                    ((MayaQRPHMerchantOTPFragment) ((o9.i) c0214w.c.get())).Y1(payMayaErrorF8);
                    return;
                }
            default:
                C1819q c1819q = (C1819q) this.f11367b;
                PayMayaError payMayaErrorF9 = c1819q.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF9, "mayaErrorHandling(...)");
                if (payMayaErrorF9.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF9.isNetworkError()) {
                    o9.j jVar = (o9.j) c1819q.c.get();
                    String strMSpiel3 = payMayaErrorF9.mSpiel();
                    kotlin.jvm.internal.j.f(strMSpiel3, "mSpiel(...)");
                    MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) jVar;
                    mayaQRPHMerchantPaymentFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaQRPHMerchantPaymentFragment, 100, strMSpiel3, null, new ViewOnClickListenerC2028m(mayaQRPHMerchantPaymentFragment, i), 28);
                    return;
                }
                o9.j jVar2 = (o9.j) c1819q.c.get();
                String strMSpiel4 = payMayaErrorF9.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel4, "mSpiel(...)");
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment2 = (MayaQRPHMerchantPaymentFragment) jVar2;
                mayaQRPHMerchantPaymentFragment2.getClass();
                MayaBaseLoadingFragment.N1(mayaQRPHMerchantPaymentFragment2, 200, strMSpiel4, null, new ViewOnClickListenerC2028m(mayaQRPHMerchantPaymentFragment2, i6), 28);
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f11366a) {
            case 3:
                Pair pair = (Pair) obj;
                kotlin.jvm.internal.j.g(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f18160a).booleanValue();
                String str = (String) pair.f18161b;
                O0 o02 = (O0) this.f11367b;
                if (!zBooleanValue) {
                    return Ah.p.c(o02.c.b(new mg.c(6)));
                }
                o02.getClass();
                return new Lh.d(o02.f11378b.getShopProviders(T2.s()).d(Z.f11416o), new M0(o02, str), 2);
            default:
                List list = (List) obj;
                Collections.sort(list, (Comparator) this.f11367b);
                return list;
        }
    }

    public void b(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f11367b;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public List c(String str, Certificate[] certificateArr) {
        if (certificateArr == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Certificate certificate : certificateArr) {
                try {
                    arrayList.add((X509Certificate) certificate);
                } catch (ClassCastException unused) {
                    Ri.a.p("Ignored non-X.509 certificate in chain cleaning");
                }
            }
            return ((X509TrustManagerExtensions) this.f11367b).checkServerTrusted((X509Certificate[]) arrayList.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException unused2) {
            return Collections.EMPTY_LIST;
        }
    }

    public Pattern d(String str) {
        Object obj;
        T t5 = (T) this.f11367b;
        synchronized (t5) {
            obj = ((C1798a) t5.f11391b).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        ((T) this.f11367b).d(str, patternCompile);
        return patternCompile;
    }

    public void e() {
        synchronized (((X2.c) this.f11367b).h) {
            try {
                X2.c cVar = (X2.c) this.f11367b;
                if (cVar.f6473a) {
                    ((Handler) cVar.f6475d).obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        return new C1661i((Context) ((d3.c) this.f11367b).f16259b, Integer.valueOf(C1661i.f17667d).intValue(), "com.google.android.datatransport.events");
    }

    @Override // f2.a
    public void h(Bundle bundle) {
        ((Y1.c) ((Y1.b) this.f11367b)).a("clx", Constants.FIREBASE_APPLICATION_EXCEPTION, bundle);
    }

    @Override // Ah.j
    public void onComplete() {
        ((Ah.j) this.f11367b).onComplete();
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception e) {
        switch (this.f11366a) {
            case 5:
                dc.m mVar = (dc.m) this.f11367b;
                mVar.f.setVisibility(0);
                mVar.e.setVisibility(4);
                break;
            default:
                kotlin.jvm.internal.j.g(e, "e");
                SendMoneyCardPreviewFragment sendMoneyCardPreviewFragment = (SendMoneyCardPreviewFragment) this.f11367b;
                r1 r1Var = sendMoneyCardPreviewFragment.f14768S;
                if (r1Var != null) {
                    kotlin.jvm.internal.j.d(r1Var);
                    ((ImageView) ((N5.I) r1Var.f4198b).f).setImageResource(2131231797);
                    r1 r1Var2 = sendMoneyCardPreviewFragment.f14768S;
                    kotlin.jvm.internal.j.d(r1Var2);
                    ((FrameLayout) ((N5.I) r1Var2.f4198b).f3648g).setVisibility(0);
                }
                break;
        }
    }

    @Override // pg.s
    public void onMethodCall(pg.r rVar, pg.t tVar) {
        if (!"check".equals(rVar.f19112a)) {
            tVar.notImplemented();
        } else {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((T) this.f11367b).f11391b;
            tVar.success(T.c(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }

    @Override // Ah.j
    public void onNext(Object obj) {
        if (((Response) obj) == null) {
            throw new NullPointerException("response == null");
        }
        ((Ah.j) this.f11367b).onNext(new mg.c(0));
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        switch (this.f11366a) {
            case 5:
                dc.m mVar = (dc.m) this.f11367b;
                mVar.f.setVisibility(4);
                mVar.e.setVisibility(0);
                break;
            default:
                r1 r1Var = ((SendMoneyCardPreviewFragment) this.f11367b).f14768S;
                if (r1Var != null) {
                    kotlin.jvm.internal.j.d(r1Var);
                    ((FrameLayout) ((N5.I) r1Var.f4198b).f3648g).setVisibility(0);
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        if (((C2007c) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        C1421c c1421c = (C1421c) this.f11367b;
        h2.l.a((h2.l) c1421c.c);
        h2.l lVar = (h2.l) c1421c.c;
        lVar.m.t(lVar.e.f17092a, null);
        lVar.f16887r.trySetResult(null);
        return Tasks.forResult(null);
    }

    public L(int i) {
        this.f11366a = i;
        switch (i) {
            case 14:
                break;
            case 15:
                X509TrustManager x509TrustManager = null;
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    int length = trustManagers.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            TrustManager trustManager = trustManagers[i4];
                            if (trustManager instanceof X509TrustManager) {
                                x509TrustManager = (X509TrustManager) trustManager;
                            } else {
                                i4++;
                            }
                        } else {
                            Ri.a.q("No X509TrustManager found");
                        }
                    }
                } catch (KeyStoreException | NoSuchAlgorithmException e) {
                    Ri.a.g("Error getting default TrustManager: " + e.getMessage());
                }
                this.f11367b = new X509TrustManagerExtensions(x509TrustManager);
                break;
            case 20:
                T t5 = new T(19);
                t5.f11391b = new C1798a(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 0.75f, true);
                this.f11367b = t5;
                break;
            default:
                this.f11367b = new ArrayList(20);
                break;
        }
    }

    @Override // Ah.j
    public void onError(Throwable th2) {
        int i = 0;
        Ah.j jVar = (Ah.j) this.f11367b;
        try {
            if (th2 != null) {
                jVar.onNext(new mg.c(i));
                jVar.onComplete();
                return;
            }
            throw new NullPointerException("error == null");
        } catch (Throwable th3) {
            try {
                jVar.onError(th3);
            } catch (Throwable th4) {
                AbstractC0983W.G(th4);
                E1.c.k(new CompositeException(th3, th4));
            }
        }
    }

    public L(ForgotPasswordApi forgotPasswordApi) {
        this.f11366a = 1;
        kotlin.jvm.internal.j.g(forgotPasswordApi, "forgotPasswordApi");
        this.f11367b = forgotPasswordApi;
    }

    public L(ComplianceApi complianceApi) {
        this.f11366a = 0;
        kotlin.jvm.internal.j.g(complianceApi, "complianceApi");
        this.f11367b = complianceApi;
    }

    public L(KycSubmissionApi mKycSubmissionApi) {
        this.f11366a = 2;
        kotlin.jvm.internal.j.g(mKycSubmissionApi, "mKycSubmissionApi");
        this.f11367b = mKycSubmissionApi;
    }
}
