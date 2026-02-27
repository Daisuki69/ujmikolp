package com.google.firebase.messaging;

import D.C0187u;
import D8.C0214w;
import G5.InterfaceC0254d;
import Kh.I;
import Kh.T;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import com.airbnb.lottie.LottieAnimationView;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.PushApprovalApi;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.EDDSettings;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.RewardsCatalog;
import com.paymaya.domain.model.RewardsCatalogResult;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.store.C1250b0;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.N;
import com.paymaya.domain.store.O0;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantConfirmationFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import com.paymaya.mayaui.rewardscatalog.view.fragment.MayaRewardsCatalogFragment;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelOperatorSelectionFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelStopSelectionFragment;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import com.paymaya.ui.dashboard.view.fragment.impl.UserActivityFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataAndPersonalizationFragment;
import dOYHB6.yFtIp6.svM7M6;
import hh.InterfaceC1570c;
import hh.InterfaceC1573f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import l9.C1809g;
import l9.C1812j;
import ma.C1859a;
import n3.C1916a;
import org.joda.time.LocalDateTime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C2005a;
import p2.C2007c;
import p2.C2009e;
import p2.InterfaceC2008d;
import p9.InterfaceC2026k;
import pb.InterfaceC2031a;
import qb.C2168a;
import retrofit2.Response;
import s6.InterfaceC2241b;
import t6.InterfaceC2275f;
import v.AbstractC2329d;
import vh.C2356g;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements Ch.f, Ch.c, l0.f, t4.j, io.flutter.plugin.platform.m, hh.n, InterfaceC1573f, kk.d, InterfaceC0254d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9799b;

    public /* synthetic */ p(Object obj, int i) {
        this.f9798a = i;
        this.f9799b = obj;
    }

    public static TrustManagerFactory d(ByteArrayInputStream byteArrayInputStream) throws IOException {
        if (byteArrayInputStream == null) {
            return null;
        }
        try {
            KeyStore keyStoreF = f(CertificateFactory.getInstance("X.509").generateCertificates(byteArrayInputStream));
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStoreF);
            return trustManagerFactory;
        } finally {
            byteArrayInputStream.close();
        }
    }

    public static KeyStore f(Collection collection) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                keyStore = null;
                break;
            }
            TrustManager trustManager = trustManagers[i4];
            if (trustManager instanceof X509TrustManager) {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                X509Certificate[] acceptedIssuers = ((X509TrustManager) trustManager).getAcceptedIssuers();
                for (int i6 = 0; i6 < acceptedIssuers.length; i6++) {
                    keyStore.setCertificateEntry(We.s.f(i6, "systemCA"), acceptedIssuers[i6]);
                }
            } else {
                i4++;
            }
        }
        KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore2.load(null, null);
        if (keyStore != null) {
            Enumeration<String> enumerationAliases = keyStore.aliases();
            while (enumerationAliases.hasMoreElements()) {
                String strNextElement = enumerationAliases.nextElement();
                Certificate certificate = keyStore.getCertificate(strNextElement);
                if (certificate != null) {
                    keyStore2.setCertificateEntry(strNextElement, certificate);
                }
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            keyStore2.setCertificateEntry("proxyCA" + i, (Certificate) it.next());
            i++;
        }
        return keyStore2;
    }

    public static boolean q(Bundle bundle) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("gcm.n.e")) || IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String w(ByteArrayInputStream byteArrayInputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append(line);
                sb2.append(Global.NEWLINE);
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static String y(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // G5.InterfaceC0254d
    public void T() {
        MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) this.f9799b;
        ((C1809g) mayaMerchantPaymentFragment.Q1()).n(mayaMerchantPaymentFragment.P1());
    }

    @Override // kk.d
    public void a() {
        Log.e("OpenCVManager/Helper", "Nothing to install we just wait current installation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ch.c
    public void accept(Object obj) {
        kc.j jVar;
        MayaQRPHMerchantConfirmationFragment mayaQRPHMerchantConfirmationFragment;
        InterfaceC2026k interfaceC2026k;
        int i = 0;
        obj = null;
        Object obj2 = null;
        int i4 = 1;
        switch (this.f9798a) {
            case 2:
                Response response = (Response) obj;
                kotlin.jvm.internal.j.g(response, "response");
                String str = response.headers().get("Last-Modified");
                LocalDateTime localDateTimeC = AbstractC1234x.c(str);
                N n7 = (N) this.f9799b;
                String string = svM7M6.getString(n7.f11375d.f11330b, "key_financial_documents_date", null);
                LocalDateTime localDateTimeC2 = string != null ? AbstractC1234x.c(string) : null;
                if (localDateTimeC2 == null || localDateTimeC == null || localDateTimeC.isAfter(localDateTimeC2)) {
                    Ah.p<List<EDDSettings>> kYCSettings = n7.c.getKYCSettings();
                    M m = new M(n7, i);
                    I i6 = Eh.d.f1366d;
                    kYCSettings.getClass();
                    kYCSettings.f(new Gh.d(i4, m, i6));
                }
                androidx.media3.datasource.cache.c.u(n7.f11375d.f11330b, "key_financial_documents_date", str);
                return;
            case 3:
                Ah.g ctInboxMessageNotification = (Ah.g) obj;
                kotlin.jvm.internal.j.g(ctInboxMessageNotification, "ctInboxMessageNotification");
                C0187u c0187u = ((C1250b0) this.f9799b).f11427b;
                if (c0187u != null) {
                    Object obj3 = ctInboxMessageNotification.f314a;
                    if (obj3 != null && !(obj3 instanceof Qh.f)) {
                        obj2 = obj3;
                    }
                    c0187u.k((CTInboxMessage) obj2);
                    return;
                }
                return;
            case 4:
            case 7:
            case 8:
            case 12:
            case 14:
            case 15:
            case 17:
            case 19:
            case 24:
            case 25:
            default:
                RewardsCatalogResult result = (RewardsCatalogResult) obj;
                kotlin.jvm.internal.j.g(result, "result");
                Bb.f fVar = (Bb.f) this.f9799b;
                fVar.getClass();
                List<RewardsCatalog> rewards = result.getRewards();
                ConstraintLayout constraintLayout = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13720Y;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.j.n("mRewardsCatalogComponent");
                    throw null;
                }
                constraintLayout.setVisibility(0);
                MayaRewardsCatalogFragment mayaRewardsCatalogFragment = (MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get());
                mayaRewardsCatalogFragment.getClass();
                mayaRewardsCatalogFragment.f13731j0 = result.getHasMayaBlack();
                mayaRewardsCatalogFragment.f13732k0 = result.getAccountStatus();
                if (rewards.isEmpty()) {
                    ConstraintLayout constraintLayout2 = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13726e0;
                    if (constraintLayout2 == null) {
                        kotlin.jvm.internal.j.n("mEmptyStateView");
                        throw null;
                    }
                    constraintLayout2.setVisibility(0);
                    TextView textView = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13722a0;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n("mMilesValueTextView");
                        throw null;
                    }
                    textView.setVisibility(8);
                    RecyclerView recyclerView = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13721Z;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.j.n("mRewardsCatalogRecyclerView");
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                } else {
                    MayaRewardsCatalogFragment mayaRewardsCatalogFragment2 = (MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get());
                    mayaRewardsCatalogFragment2.getClass();
                    RecyclerView recyclerView2 = mayaRewardsCatalogFragment2.f13721Z;
                    if (recyclerView2 == null) {
                        kotlin.jvm.internal.j.n("mRewardsCatalogRecyclerView");
                        throw null;
                    }
                    recyclerView2.setVisibility(0);
                    C2168a c2168a = mayaRewardsCatalogFragment2.f13719X;
                    if (c2168a == null) {
                        kotlin.jvm.internal.j.n("mMayaMilesAdapter");
                        throw null;
                    }
                    boolean z4 = mayaRewardsCatalogFragment2.f13731j0;
                    c2168a.c = false;
                    c2168a.f19764d = z4;
                    ArrayList arrayList = c2168a.f19763b;
                    arrayList.clear();
                    arrayList.addAll(rewards);
                    c2168a.notifyDataSetChanged();
                    TextView textView2 = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13722a0;
                    if (textView2 == null) {
                        kotlin.jvm.internal.j.n("mMilesValueTextView");
                        throw null;
                    }
                    textView2.setVisibility(0);
                    ConstraintLayout constraintLayout3 = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13726e0;
                    if (constraintLayout3 == null) {
                        kotlin.jvm.internal.j.n("mEmptyStateView");
                        throw null;
                    }
                    constraintLayout3.setVisibility(8);
                }
                Group group = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13730i0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mGroupFooter");
                    throw null;
                }
                group.setVisibility(0);
                ConstraintLayout constraintLayout4 = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13727f0;
                if (constraintLayout4 == null) {
                    kotlin.jvm.internal.j.n("mErrorStateView");
                    throw null;
                }
                constraintLayout4.setVisibility(8);
                Double milesBalance = result.getMilesBalance();
                double dDoubleValue = milesBalance != null ? milesBalance.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
                TextView textView3 = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13722a0;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n("mMilesValueTextView");
                    throw null;
                }
                String strN = new DecimalFormat("#,##0.00").format(dDoubleValue);
                kotlin.jvm.internal.j.d(strN);
                if (zj.z.n(strN, 2, ".00", false)) {
                    strN = C2576A.N(strN, ".00");
                }
                textView3.setText(strN);
                if (result.getHasMayaBlack()) {
                    MayaRewardsCatalogFragment mayaRewardsCatalogFragment3 = (MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get());
                    TextView textView4 = mayaRewardsCatalogFragment3.f13723b0;
                    if (textView4 == null) {
                        kotlin.jvm.internal.j.n("mMayaMilesCta");
                        throw null;
                    }
                    textView4.setText(mayaRewardsCatalogFragment3.getString(R.string.maya_label_earn_maya_miles));
                } else {
                    MayaRewardsCatalogFragment mayaRewardsCatalogFragment4 = (MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get());
                    TextView textView5 = mayaRewardsCatalogFragment4.f13723b0;
                    if (textView5 == null) {
                        kotlin.jvm.internal.j.n("mMayaMilesCta");
                        throw null;
                    }
                    textView5.setText(mayaRewardsCatalogFragment4.getString(R.string.maya_label_get_maya_black_and_earn));
                }
                InterfaceC2031a interfaceC2031a = (InterfaceC2031a) fVar.c.get();
                String accountStatus = result.getAccountStatus();
                MayaRewardsCatalogFragment mayaRewardsCatalogFragment5 = (MayaRewardsCatalogFragment) interfaceC2031a;
                C1220i c1220iO1 = mayaRewardsCatalogFragment5.o1();
                C1219h c1219hE = C1219h.e("RCATALOG_WIDGET_VIEWED");
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map = c1219hE.j;
                map.put("acct_status", accountStatus);
                TextView textView6 = mayaRewardsCatalogFragment5.f13722a0;
                if (textView6 == null) {
                    kotlin.jvm.internal.j.n("mMilesValueTextView");
                    throw null;
                }
                map.put("miles_balance", textView6.getText().toString());
                String lowerCase = "Dashboard".toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                map.put("page_name", lowerCase);
                c1220iO1.b(c1219hE);
                return;
            case 5:
                ShopProviderBase shopProviderBase = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(shopProviderBase, "shopProviderBase");
                if (shopProviderBase.getData() != null) {
                    com.paymaya.data.database.repository.B b8 = ((O0) this.f9799b).c;
                    List<ShopProvider> items = shopProviderBase.getData();
                    b8.getClass();
                    kotlin.jvm.internal.j.g(items, "items");
                    b8.f11294a.c("shop_provider", com.paymaya.data.database.repository.B.a(items));
                    return;
                }
                return;
            case 6:
                G6.p pVar = (G6.p) this.f9799b;
                ((UserActivityFragment) pVar.c.get()).n1();
                MayaTransactionsActivity mayaTransactionsActivity = (MayaTransactionsActivity) ((UserActivityFragment) pVar.c.get()).f14468V;
                mayaTransactionsActivity.n1();
                B5.i.d0(mayaTransactionsActivity, (PurchasedTicket) obj);
                return;
            case 9:
                ((Lb.a) this.f9799b).f((Throwable) obj, true);
                return;
            case 10:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                A7.j jVar2 = (A7.j) this.f9799b;
                jVar2.getClass();
                MayaTravelViewDataSelection mayaTravelViewDataSelectionQ1 = ((MayaTravelOperatorSelectionFragment) ((jc.c) jVar2.c.get())).Q1();
                if (mayaTravelViewDataSelectionQ1 != null) {
                    mayaTravelViewDataSelectionQ1.f14230b = C1110A.W(p02);
                }
                ((MayaTravelOperatorSelectionFragment) ((jc.c) jVar2.c.get())).L1();
                jVar2.U(p02);
                return;
            case 11:
                C0214w c0214w = (C0214w) this.f9799b;
                PayMayaError payMayaErrorF = c0214w.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                jc.f fVar2 = (jc.f) c0214w.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.CREATE);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                c1219hH.i();
                MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment = (MayaTravelStopSelectionFragment) fVar2;
                C1220i c1220iO12 = mayaTravelStopSelectionFragment.o1();
                FragmentActivity activity = mayaTravelStopSelectionFragment.getActivity();
                c1219hH.p(mayaTravelStopSelectionFragment.u1());
                c1220iO12.c(activity, c1219hH);
                ((MayaBaseFragment) ((jc.f) c0214w.c.get())).w1();
                if (payMayaErrorF.isSessionTimeout() || (jVar = ((MayaTravelStopSelectionFragment) ((jc.f) c0214w.c.get())).f14228Z) == null) {
                    return;
                }
                M2.b.Z(0, null, null, null, null, false, payMayaErrorF, null, false, 447).show(((MayaTravelActivity) jVar).getSupportFragmentManager(), "error_dialog");
                return;
            case 13:
                Decoration p03 = (Decoration) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                ((G6.p) this.f9799b).o(p03);
                return;
            case 16:
                M7.c cVar = (M7.c) this.f9799b;
                PayMayaError payMayaErrorF2 = cVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                od.a aVar = (od.a) cVar.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                c1219hH2.t(EnumC1217f.UPDATE_CONSENTS);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF2.mSpiel());
                ((BaseFragment) aVar).o1(c1219hH2);
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                DataAndPersonalizationFragment dataAndPersonalizationFragment = (DataAndPersonalizationFragment) ((od.a) cVar.c.get());
                dataAndPersonalizationFragment.getClass();
                pd.c cVar2 = dataAndPersonalizationFragment.f14486U;
                if (cVar2 != null) {
                    String string2 = dataAndPersonalizationFragment.getString(R.string.pma_toast_error_title_data_privacy_error);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    ((DataPrivacyActivity) cVar2).a(payMayaErrorF2, string2);
                    return;
                }
                return;
            case 18:
                Throwable th2 = (Throwable) obj;
                jh.e.b(th2, "error is null");
                ((InterfaceC1573f) this.f9799b).accept(new ch.k(new C2356g(th2)));
                return;
            case 20:
                ((l7.b) this.f9799b).f((Throwable) obj, true);
                return;
            case 21:
                C0214w c0214w2 = (C0214w) this.f9799b;
                PayMayaError payMayaErrorF3 = c0214w2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                c0214w2.x(payMayaErrorF3);
                return;
            case 22:
                C1812j c1812j = (C1812j) this.f9799b;
                PayMayaError payMayaErrorF4 = c1812j.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                o9.h hVar = (o9.h) c1812j.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(12);
                c1219hH3.t(EnumC1217f.PAY);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put(Constants.REASON, payMayaErrorF4.mSpiel());
                ((MayaBaseFragment) hVar).A1(c1219hH3);
                if (payMayaErrorF4.isSessionTimeout() || (interfaceC2026k = (mayaQRPHMerchantConfirmationFragment = (MayaQRPHMerchantConfirmationFragment) ((o9.h) c1812j.c.get())).f12904Z) == null) {
                    return;
                }
                ((MayaQRPHMerchantActivity) interfaceC2026k).a(payMayaErrorF4, mayaQRPHMerchantConfirmationFragment.getString(R.string.pma_toast_error_title_merchant_payment_error));
                return;
            case 23:
                List p04 = (List) obj;
                kotlin.jvm.internal.j.g(p04, "p0");
                C1859a c1859a = (C1859a) this.f9799b;
                if (p04.isEmpty()) {
                    View view = ((BaseMayaProfileFragment) ((pa.a) c1859a.c.get())).f13531v0;
                    if (view != null) {
                        view.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mViewAuthorizeRequestsIndicator");
                        throw null;
                    }
                }
                View view2 = ((BaseMayaProfileFragment) ((pa.a) c1859a.c.get())).f13531v0;
                if (view2 != null) {
                    view2.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mViewAuthorizeRequestsIndicator");
                    throw null;
                }
            case 26:
                o6.g gVar = (o6.g) this.f9799b;
                PayMayaError payMayaErrorF5 = gVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                if (gVar.f18794d.e().isAppEventV2BankTransferEnabled()) {
                    ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).S1(payMayaErrorF5);
                } else {
                    InterfaceC2241b interfaceC2241b = (InterfaceC2241b) gVar.c.get();
                    C1219h c1219hH4 = AbstractC2329d.h(12);
                    c1219hH4.t(EnumC1217f.CREATE);
                    c1219hH4.i();
                    EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH4.j.put(Constants.REASON, payMayaErrorF5.mSpiel());
                    ((MayaBaseFragment) interfaceC2241b).A1(c1219hH4);
                }
                if (payMayaErrorF5.isSessionTimeout()) {
                    return;
                }
                MayaBankTransferFormFragment mayaBankTransferFormFragment = (MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get());
                mayaBankTransferFormFragment.getClass();
                InterfaceC2275f interfaceC2275f = mayaBankTransferFormFragment.f11550B0;
                if (interfaceC2275f != null) {
                    ((MayaBankTransferActivity) interfaceC2275f).a(payMayaErrorF5, null);
                    return;
                }
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f9798a) {
            case 1:
                Xe.b query = (Xe.b) obj;
                kotlin.jvm.internal.j.g(query, "query");
                Cursor cursorA = query.a();
                ((com.paymaya.data.database.repository.A) this.f9799b).getClass();
                return com.paymaya.data.database.repository.A.a(cursorA);
            default:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 2) {
                    return ((InterfaceC1570c) this.f9799b).a(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    @Override // kk.d
    public void b() {
        Ci.b bVar = (Ci.b) ((F1.p) this.f9799b).f1533b;
        Log.d("OpenCVManager/Helper", "Waiting for current installation");
        try {
            if (((mk.a) ((mk.c) bVar.f785b)).h((String) bVar.f786d)) {
                Log.d("OpenCVManager/Helper", "Wating for package installation");
            } else {
                Log.d("OpenCVManager/Helper", "OpenCV package was not installed!");
                Log.d("OpenCVManager/Helper", "Init finished with status 2");
                Log.d("OpenCVManager/Helper", "Calling using callback");
                ((Rg.u) bVar.c).o(2);
            }
            Log.d("OpenCVManager/Helper", "Unbind from service");
            ((FragmentActivity) bVar.e).unbindService((F1.p) bVar.f);
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.d("OpenCVManager/Helper", "Init finished with status 255");
            Log.d("OpenCVManager/Helper", "Unbind from service");
            ((FragmentActivity) bVar.e).unbindService((F1.p) bVar.f);
            Log.d("OpenCVManager/Helper", "Calling using callback");
            ((Rg.u) bVar.c).o(255);
        }
    }

    public SSLSocketFactory c(ByteArrayInputStream byteArrayInputStream, ByteArrayInputStream byteArrayInputStream2, ByteArrayInputStream byteArrayInputStream3) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream2);
            PrivateKey privateKeyS = s(byteArrayInputStream3);
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            keyStore.setKeyEntry(EventKeys.CLIENT, privateKeyS, new char[0], new Certificate[]{certificateGenerateCertificate});
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(keyStore, new char[0]);
            byteArrayInputStream2.close();
            byteArrayInputStream3.close();
            TrustManagerFactory trustManagerFactoryD = d(byteArrayInputStream);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(keyManagerFactory.getKeyManagers(), trustManagerFactoryD != null ? trustManagerFactoryD.getTrustManagers() : null, null);
            return sSLContext.getSocketFactory();
        } catch (Throwable th2) {
            byteArrayInputStream2.close();
            byteArrayInputStream3.close();
            throw th2;
        }
    }

    @Override // kk.d
    public void cancel() {
        Log.d("OpenCVManager/Helper", "OpenCV library installation was canceled");
        Ci.b.h = false;
        Log.d("OpenCVManager/Helper", "Init finished with status 3");
        Log.d("OpenCVManager/Helper", "Unbind from service");
        Ci.b bVar = (Ci.b) ((F1.p) this.f9799b).f1533b;
        ((FragmentActivity) bVar.e).unbindService((F1.p) bVar.f);
        Log.d("OpenCVManager/Helper", "Calling using callback");
        ((Rg.u) bVar.c).o(3);
    }

    public boolean e(String str) {
        String strO = o(str);
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strO) || Boolean.parseBoolean(strO);
    }

    public Integer g(String str) {
        String strO = o(str);
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strO));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + y(str) + "(" + strO + ") into an int");
            return null;
        }
    }

    @Override // kk.d
    public String getPackageName() {
        return "OpenCV library";
    }

    public JSONArray h(String str) {
        String strO = o(str);
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        try {
            return new JSONArray(strO);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + y(str) + ": " + strO + ", falling back to default");
            return null;
        }
    }

    @Override // t4.j
    public void i() {
        MayaBillersFragment mayaBillersFragment = (MayaBillersFragment) this.f9799b;
        mayaBillersFragment.Q1().u();
        LottieAnimationView lottieAnimationView = mayaBillersFragment.f13376r0;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        } else {
            kotlin.jvm.internal.j.n("mLottieViewLoadingFooter");
            throw null;
        }
    }

    public int[] j() {
        JSONArray jSONArrayH = h("gcm.n.light_settings");
        if (jSONArrayH == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayH.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayH.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayH.optInt(1);
            iArr[2] = jSONArrayH.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayH + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayH + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] k(String str) {
        JSONArray jSONArrayH = h(str.concat("_loc_args"));
        if (jSONArrayH == null) {
            return null;
        }
        int length = jSONArrayH.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayH.optString(i);
        }
        return strArr;
    }

    public String l(String str) {
        return o(str.concat("_loc_key"));
    }

    public Long m() {
        String strO = o("gcm.n.event_time");
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strO));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + y("gcm.n.event_time") + "(" + strO + ") into a long");
            return null;
        }
    }

    public String n(Resources resources, String str, String str2) {
        String strO = o(str2);
        if (!TextUtils.isEmpty(strO)) {
            return strO;
        }
        String strL = l(str2);
        if (!TextUtils.isEmpty(strL)) {
            int identifier = resources.getIdentifier(strL, TypedValues.Custom.S_STRING, str);
            if (identifier == 0) {
                Log.w("NotificationParams", y(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            Object[] objArrK = k(str2);
            if (objArrK == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, objArrK);
            } catch (MissingFormatArgumentException e) {
                Log.w("NotificationParams", "Missing format argument for " + y(str2) + ": " + Arrays.toString(objArrK) + " Default value will be used.", e);
            }
        }
        return null;
    }

    public String o(String str) {
        Bundle bundle = (Bundle) this.f9799b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    @Override // t4.j
    public void onRefresh() {
        Bb.f fVarQ1 = ((MayaBillersFragment) this.f9799b).Q1();
        if (!((MayaBillersFragment) ((ga.b) fVarQ1.c.get())).y0) {
            ((MayaBillersFragment) ((ga.b) fVarQ1.c.get())).y0 = true;
            new Lh.d(new T(5, new Lh.d(new Lh.d(new Lh.h(((C1273n) fVarQ1.e).e(1, ((MayaBillersFragment) ((ga.b) fVarQ1.c.get())).P1().mSlug()), zh.b.a(), 0), new ba.j(fVarQ1, 1), 2), new ba.k(fVarQ1, 1), 0), new ba.h(fVarQ1, 2)), new ba.l(fVarQ1, 1), 1).e();
        }
        LottieAnimationView lottieAnimationView = ((MayaBillersFragment) this.f9799b).f13375q0;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        } else {
            kotlin.jvm.internal.j.n("mLottieViewLoadingHeader");
            throw null;
        }
    }

    @Override // l0.f
    public void onSuccess(Object obj) {
        ((b1.t) this.f9799b).m(3);
    }

    public long[] p() {
        JSONArray jSONArrayH = h("gcm.n.vibrate_timings");
        if (jSONArrayH == null) {
            return null;
        }
        try {
            if (jSONArrayH.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayH.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayH.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayH + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public PrivateKey r(String str) {
        int iIndexOf = str.indexOf("-----BEGIN PRIVATE KEY-----");
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("PEM begin marker not found: -----BEGIN PRIVATE KEY-----");
        }
        int i = iIndexOf + 27;
        int iIndexOf2 = str.indexOf("-----END PRIVATE KEY-----", i);
        if (iIndexOf2 == -1) {
            throw new IllegalArgumentException("PEM end marker not found: -----END PRIVATE KEY-----");
        }
        String strReplaceAll = str.substring(i, iIndexOf2).replaceAll("\\s+", "");
        ((C1916a) this.f9799b).getClass();
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Xh.i.d(strReplaceAll));
        try {
            return KeyFactory.getInstance("RSA").generatePrivate(pKCS8EncodedKeySpec);
        } catch (InvalidKeySpecException e) {
            try {
                return KeyFactory.getInstance("EC").generatePrivate(pKCS8EncodedKeySpec);
            } catch (InvalidKeySpecException unused) {
                Ri.a.g("Error loading private key: Neither RSA nor EC algorithms could load the key");
                throw new IllegalArgumentException("Invalid PKCS#8 private key format. Key could not be loaded with RSA or EC algorithms.", e);
            }
        }
    }

    public PrivateKey s(ByteArrayInputStream byteArrayInputStream) throws Exception {
        try {
            String strW = w(byteArrayInputStream);
            if (strW.contains("BEGIN PRIVATE KEY")) {
                return r(strW);
            }
            throw new IllegalArgumentException("Unsupported private key format. Must be PEM encoded PKCS#8 format (BEGIN PRIVATE KEY)");
        } catch (Exception e) {
            Ri.a.g("Error loading private key: " + e.getMessage());
            throw e;
        }
    }

    public Bundle t() {
        Bundle bundle = (Bundle) this.f9799b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals(TypedValues.TransitionType.S_FROM)) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // G5.InterfaceC0254d
    public void u() {
        MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) this.f9799b;
        ((C1809g) mayaMerchantPaymentFragment.Q1()).n(mayaMerchantPaymentFragment.P1());
    }

    public C2007c v(JSONObject jSONObject) {
        InterfaceC2008d c2009e;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            c2009e = new C2005a();
        } else {
            c2009e = new C2009e();
        }
        return c2009e.b((I) this.f9799b, jSONObject);
    }

    public boolean x(String str, io.flutter.plugin.platform.l lVar) {
        HashMap map = (HashMap) this.f9799b;
        if (map.containsKey(str)) {
            return false;
        }
        map.put(str, lVar);
        return true;
    }

    public p() {
        this.f9798a = 14;
        this.f9799b = new HashMap();
    }

    public p(PushApprovalApi pushApprovalApi) {
        this.f9798a = 4;
        kotlin.jvm.internal.j.g(pushApprovalApi, "pushApprovalApi");
        this.f9799b = pushApprovalApi;
    }

    public p(int i) {
        this.f9798a = 24;
        this.f9799b = new We.p(i, 1);
    }

    public p(Bundle bundle) {
        this.f9798a = 0;
        if (bundle != null) {
            this.f9799b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }
}
