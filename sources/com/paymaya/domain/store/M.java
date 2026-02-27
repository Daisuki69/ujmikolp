package com.paymaya.domain.store;

import D8.C0214w;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.webkit.ProxyConfig;
import b6.C0922a;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.KycTencentApi;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.EDDSettings;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.model.TicketPurchaseConfirmation;
import com.paymaya.mayaui.accountlimits.view.activity.impl.MayaAccountLimitsActivity;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsFragment;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsPageFragment;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferConfirmationFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferOTPFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantConfirmationFragment;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelConfirmationFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelStopSelectionFragment;
import com.paymaya.ui.common.view.dialog.impl.SuccessDialogFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataAndPersonalizationFragment;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardFragment;
import dOYHB6.yFtIp6.svM7M6;
import e1.InterfaceC1418b;
import ei.C1446a;
import ei.C1447b;
import f6.InterfaceC1467c;
import hh.InterfaceC1568a;
import hh.InterfaceC1573f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import je.InterfaceC1679a;
import kotlin.Pair;
import l9.C1812j;
import m5.C1847a;
import org.joda.time.LocalDateTime;
import p9.InterfaceC2026k;
import ph.C2139x;
import q6.C2166c;
import retrofit2.Response;
import s6.InterfaceC2240a;
import s6.InterfaceC2241b;
import s6.InterfaceC2243d;
import t6.InterfaceC2270a;
import t6.InterfaceC2275f;
import t6.ViewOnClickListenerC2271b;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class M implements Ch.c, Ch.f, InterfaceC1418b, t4.j, InterfaceC1573f, InterfaceC1568a, kk.d, hh.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11371b;

    public /* synthetic */ M(Object obj, int i) {
        this.f11370a = i;
        this.f11371b = obj;
    }

    public static void c(Socket socket, SSLSocket sSLSocket) {
        if (socket != null && socket != sSLSocket) {
            try {
                socket.close();
            } catch (IOException e) {
                Ri.a.q("Failed to close origin SSL socket: " + e.getMessage());
            }
        }
        if (sSLSocket != null) {
            try {
                sSLSocket.close();
            } catch (IOException e7) {
                Ri.a.q("Failed to close tunnel socket: " + e7.getMessage());
            }
        }
    }

    public static U8.c d(io.split.android.client.network.e eVar, URL url, SSLSocketFactory sSLSocketFactory, io.split.android.client.network.k kVar, boolean z4) throws Exception {
        SSLSocket sSLSocketB;
        Certificate[] certificateArr;
        Socket socket;
        SSLSocket sSLSocket = null;
        Certificate[] peerCertificates = null;
        sSLSocket = null;
        try {
            sSLSocketB = new mg.c(24).b(eVar.f17583a, eVar.f17584b, url.getHost(), g(url), sSLSocketFactory, kVar, z4);
            try {
                try {
                    if (ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(url.getProtocol())) {
                        try {
                            Socket socketCreateSocket = sSLSocketFactory.createSocket((Socket) sSLSocketB, url.getHost(), g(url), true);
                            try {
                                if (!(socketCreateSocket instanceof SSLSocket)) {
                                    throw new IOException("Failed to create SSLSocket to origin");
                                }
                                SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
                                sSLSocket2.setUseClientMode(true);
                                sSLSocket2.startHandshake();
                                try {
                                    peerCertificates = sSLSocket2.getSession().getPeerCertificates();
                                } catch (Exception e) {
                                    Ri.a.q("Could not capture origin server certificates: " + e.getMessage());
                                }
                                certificateArr = peerCertificates;
                                socket = socketCreateSocket;
                            } catch (Exception e7) {
                                e = e7;
                                Ri.a.g("Failed to establish SSL connection to origin: " + e.getMessage());
                                throw new IOException("Failed to establish SSL connection to origin server", e);
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                    } else {
                        certificateArr = null;
                        socket = sSLSocketB;
                    }
                    return new U8.c(23, sSLSocketB, (SSLSocket) socket, certificateArr);
                } catch (Exception e11) {
                    e = e11;
                    c(sSLSocket, sSLSocketB);
                    throw e;
                }
            } catch (Exception e12) {
                e = e12;
                sSLSocket = sSLSocketB;
            }
        } catch (Exception e13) {
            e = e13;
            sSLSocketB = null;
        }
    }

    public static int g(URL url) {
        int port = url.getPort();
        if (port == -1) {
            if (ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(url.getProtocol())) {
                return 443;
            }
            if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(url.getProtocol())) {
                return 80;
            }
        }
        return port;
    }

    public static boolean h(int i) {
        return (48 <= i && i <= 57) || i == 35 || i == 42;
    }

    @Override // kk.d
    public void a() {
        Ci.b bVar = (Ci.b) ((F1.p) this.f11371b).f1533b;
        Log.d("OpenCVManager/Helper", "Trying to install OpenCV lib via Google Play");
        try {
            if (((mk.a) ((mk.c) bVar.f785b)).h((String) bVar.f786d)) {
                Ci.b.h = true;
                Log.d("OpenCVManager/Helper", "Package installation started");
                Log.d("OpenCVManager/Helper", "Unbind from service");
                ((FragmentActivity) bVar.e).unbindService((F1.p) bVar.f);
                return;
            }
            Log.d("OpenCVManager/Helper", "OpenCV package was not installed!");
            Log.d("OpenCVManager/Helper", "Init finished with status 2");
            Log.d("OpenCVManager/Helper", "Unbind from service");
            ((FragmentActivity) bVar.e).unbindService((F1.p) bVar.f);
            Log.d("OpenCVManager/Helper", "Calling using callback");
            ((Rg.u) bVar.c).o(2);
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.d("OpenCVManager/Helper", "Init finished with status 255");
            Log.d("OpenCVManager/Helper", "Unbind from service");
            ((FragmentActivity) bVar.e).unbindService((F1.p) bVar.f);
            Log.d("OpenCVManager/Helper", "Calling using callback");
            ((Rg.u) bVar.c).o(255);
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment;
        InterfaceC2270a interfaceC2270a;
        int i = 1;
        switch (this.f11370a) {
            case 0:
                List<EDDSettings> eddSettings = (List) obj;
                kotlin.jvm.internal.j.g(eddSettings, "eddSettings");
                N n7 = (N) this.f11371b;
                n7.f11374b.f11317a.f2812a.b("kyc_settings", null, null);
                com.paymaya.data.database.repository.o oVar = n7.f11374b;
                oVar.getClass();
                ArrayList arrayList = new ArrayList(eddSettings.size());
                for (EDDSettings eDDSettings : eddSettings) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("max_banks", Integer.valueOf(eDDSettings.getMaxBanks()));
                    contentValues.put("max_alternative_income_sources", Integer.valueOf(eDDSettings.getMaxAlternativeIncomeSources()));
                    contentValues.put("max_related_companies", Integer.valueOf(eDDSettings.getMaxRelatedCompanies()));
                    contentValues.put("max_financial_docs", Integer.valueOf(eDDSettings.getMaxFinancialDocs()));
                    arrayList.add(contentValues);
                }
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                kotlin.jvm.internal.j.f(listUnmodifiableList, "unmodifiableList(...)");
                oVar.f11317a.a("kyc_settings", listUnmodifiableList);
                return;
            case 7:
                AccountBalance accountBalance = (AccountBalance) obj;
                Lb.a aVar = (Lb.a) this.f11371b;
                ((MayaBaseFragment) ((jc.a) aVar.c.get())).w1();
                Amount amountMAvailableBalance = accountBalance != null ? accountBalance.mAvailableBalance() : null;
                jc.a aVar2 = (jc.a) aVar.c.get();
                String formattedValue = amountMAvailableBalance != null ? amountMAvailableBalance.getFormattedValue() : null;
                MayaTravelConfirmationFragment mayaTravelConfirmationFragment = (MayaTravelConfirmationFragment) aVar2;
                TextView textView = mayaTravelConfirmationFragment.f14181X;
                if (textView != null) {
                    textView.setText(mayaTravelConfirmationFragment.getString(R.string.maya_currency_symbol_with_amount_value, formattedValue));
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewAvailableBalance");
                    throw null;
                }
            case 9:
                TicketPurchaseConfirmation p02 = (TicketPurchaseConfirmation) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                C0214w c0214w = (C0214w) this.f11371b;
                jc.f fVar = (jc.f) c0214w.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.CREATE);
                c1219hH.i();
                MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment = (MayaTravelStopSelectionFragment) fVar;
                C1220i c1220iO1 = mayaTravelStopSelectionFragment.o1();
                FragmentActivity activity = mayaTravelStopSelectionFragment.getActivity();
                c1219hH.p(mayaTravelStopSelectionFragment.u1());
                c1220iO1.c(activity, c1219hH);
                ((MayaBaseFragment) ((jc.f) c0214w.c.get())).w1();
                MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment2 = (MayaTravelStopSelectionFragment) ((jc.f) c0214w.c.get());
                mayaTravelStopSelectionFragment2.getClass();
                kc.j jVar = mayaTravelStopSelectionFragment2.f14228Z;
                if (jVar != null) {
                    MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) jVar;
                    MayaTravelConfirmationFragment mayaTravelConfirmationFragment2 = new MayaTravelConfirmationFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ticket_purchase_confirmation", p02);
                    mayaTravelConfirmationFragment2.setArguments(bundle);
                    AbstractC1236z.i(mayaTravelActivity, R.id.frame_layout_container, mayaTravelConfirmationFragment2, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
                    return;
                }
                return;
            case 10:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                G6.p pVar = (G6.p) this.f11371b;
                kotlin.jvm.internal.j.f(pVar.f(it, false), "paymayaErrorHandling(...)");
                ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).y1();
                return;
            case 13:
                List consents = (List) obj;
                kotlin.jvm.internal.j.g(consents, "consents");
                M7.c cVar = (M7.c) this.f11371b;
                Object obj2 = (od.a) cVar.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(14);
                c1219hH2.t(EnumC1217f.UPDATE_CONSENTS);
                ((BaseFragment) obj2).o1(c1219hH2);
                cVar.f.U(false);
                if (!"settings".equalsIgnoreCase(((DataAndPersonalizationFragment) ((od.a) cVar.c.get())).s1())) {
                    pd.c cVar2 = ((DataAndPersonalizationFragment) ((od.a) cVar.c.get())).f14486U;
                    kotlin.jvm.internal.j.d(cVar2);
                    DataPrivacyActivity dataPrivacyActivity = (DataPrivacyActivity) cVar2;
                    dataPrivacyActivity.e.q(dataPrivacyActivity);
                    return;
                }
                DataAndPersonalizationFragment dataAndPersonalizationFragment = (DataAndPersonalizationFragment) ((od.a) cVar.c.get());
                pd.c cVar3 = dataAndPersonalizationFragment.f14486U;
                if (cVar3 != null) {
                    String string = dataAndPersonalizationFragment.getString(R.string.pma_label_settings_successfully_changed);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    String string2 = dataAndPersonalizationFragment.getString(R.string.pma_dialog_success_data_and_personalization_settings);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    DataPrivacyActivity dataPrivacyActivity2 = (DataPrivacyActivity) cVar3;
                    Bundle bundleE = androidx.media3.datasource.cache.c.e("title", string, "content", string2);
                    SuccessDialogFragment successDialogFragment = new SuccessDialogFragment();
                    successDialogFragment.setArguments(bundleE);
                    successDialogFragment.f14398V = new A0(dataPrivacyActivity2, 23);
                    successDialogFragment.show(dataPrivacyActivity2.getSupportFragmentManager(), "success_dialog");
                    return;
                }
                return;
            case 14:
                ((InterfaceC1568a) this.f11371b).run();
                return;
            case 17:
                OnlinePayment it2 = (OnlinePayment) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                ((l7.b) this.f11371b).m(it2);
                return;
            case 18:
                ((C0214w) this.f11371b).y((MerchantPayment) obj);
                return;
            case 19:
                QRPHMerchantPaymentTransaction completedTransaction = (QRPHMerchantPaymentTransaction) obj;
                kotlin.jvm.internal.j.g(completedTransaction, "completedTransaction");
                C1812j c1812j = (C1812j) this.f11371b;
                y5.s sVar = (o9.h) c1812j.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(14);
                c1219hH3.t(EnumC1217f.PAY);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put("attribution", ((MayaBaseFragment) ((o9.h) c1812j.c.get())).n1().f10371a);
                ((MayaBaseFragment) sVar).A1(c1219hH3);
                o9.h hVar = (o9.h) c1812j.c.get();
                String name = completedTransaction.getMerchantDetails().getName();
                String formattedValue2 = completedTransaction.getAmount().getFormattedValue();
                MayaQRPHMerchantConfirmationFragment mayaQRPHMerchantConfirmationFragment = (MayaQRPHMerchantConfirmationFragment) hVar;
                mayaQRPHMerchantConfirmationFragment.getClass();
                String string3 = mayaQRPHMerchantConfirmationFragment.getString(R.string.maya_dialog_title_payment_sent, formattedValue2);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                String string4 = mayaQRPHMerchantConfirmationFragment.getString(R.string.maya_dialog_description_payment_sent, name);
                kotlin.jvm.internal.j.f(string4, "getString(...)");
                InterfaceC2026k interfaceC2026k = mayaQRPHMerchantConfirmationFragment.f12904Z;
                if (interfaceC2026k != null) {
                    ((MayaQRPHMerchantActivity) interfaceC2026k).e2(string3, string4, completedTransaction);
                    return;
                }
                return;
            case 22:
                ((MayaBaseFragment) ((InterfaceC2240a) ((o6.c) this.f11371b).c.get())).w1();
                o6.c cVar4 = (o6.c) this.f11371b;
                PayMayaError payMayaErrorF = cVar4.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                if (cVar4.f18787g.e().isAppEventV2BankTransferEnabled()) {
                    ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar4.c.get())).H1(payMayaErrorF, "BANK_TRANSFER_CONFIRMATION");
                } else {
                    y5.s sVar2 = (InterfaceC2240a) cVar4.c.get();
                    C1219h c1219hH4 = AbstractC2329d.h(12);
                    c1219hH4.t(EnumC1217f.CONFIRMATION);
                    c1219hH4.i();
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH4.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                    ((MayaBaseFragment) sVar2).A1(c1219hH4);
                }
                if (payMayaErrorF.isSessionTimeout() || (interfaceC2270a = (mayaBankTransferConfirmationFragment = (MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar4.c.get())).f11547f0) == null) {
                    return;
                }
                ((MayaBankTransferActivity) interfaceC2270a).a(payMayaErrorF, mayaBankTransferConfirmationFragment.getString(R.string.pma_toast_error_title_send_money_error));
                return;
            case 23:
                o6.g gVar = (o6.g) this.f11371b;
                PayMayaError payMayaErrorF2 = gVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                gVar.j = false;
                MayaBankTransferFormFragment mayaBankTransferFormFragment = (MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get());
                InterfaceC2275f interfaceC2275f = mayaBankTransferFormFragment.f11550B0;
                if (interfaceC2275f != null) {
                    MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) interfaceC2275f;
                    mayaBankTransferActivity.R1();
                    mayaBankTransferActivity.S1();
                }
                mayaBankTransferFormFragment.L1();
                if (gVar.f18794d.e().isAppEventV2BankTransferEnabled()) {
                    ((MayaBankTransferFormFragment) ((InterfaceC2241b) gVar.c.get())).S1(payMayaErrorF2);
                }
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                InterfaceC2241b interfaceC2241b = (InterfaceC2241b) gVar.c.get();
                String strMSpiel = payMayaErrorF2.mSpiel();
                MayaBankTransferFormFragment mayaBankTransferFormFragment2 = (MayaBankTransferFormFragment) interfaceC2241b;
                InterfaceC2275f interfaceC2275f2 = mayaBankTransferFormFragment2.f11550B0;
                if (interfaceC2275f2 != null) {
                    MayaBankTransferActivity mayaBankTransferActivity2 = (MayaBankTransferActivity) interfaceC2275f2;
                    mayaBankTransferActivity2.r1();
                    mayaBankTransferActivity2.s1();
                }
                MayaBaseLoadingFragment.N1(mayaBankTransferFormFragment2, 200, strMSpiel, null, new ViewOnClickListenerC2271b(mayaBankTransferFormFragment2, i), 28);
                return;
            case 24:
                o6.n nVar = (o6.n) this.f11371b;
                PayMayaError payMayaErrorF3 = nVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                nVar.l(payMayaErrorF3);
                return;
            case 26:
                ((MayaBaseFragment) ((InterfaceC2243d) ((C0922a) this.f11371b).c.get())).w1();
                C0922a c0922a = (C0922a) this.f11371b;
                PayMayaError payMayaErrorF4 = c0922a.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                c0922a.f = false;
                if (payMayaErrorF4.isNetworkError()) {
                    y5.s sVar3 = (InterfaceC2243d) c0922a.c.get();
                    C1219h c1219hH5 = AbstractC2329d.h(12);
                    EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH5.j.put(Constants.REASON, payMayaErrorF4.mSpiel());
                    c1219hH5.i();
                    ((MayaBaseFragment) sVar3).A1(c1219hH5);
                    ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).Z1(payMayaErrorF4);
                    return;
                }
                if (payMayaErrorF4.isSessionTimeout()) {
                    return;
                }
                y5.s sVar4 = (InterfaceC2243d) c0922a.c.get();
                C1219h c1219hH6 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH6.j.put(Constants.REASON, payMayaErrorF4.mSpiel());
                c1219hH6.i();
                ((MayaBaseFragment) sVar4).A1(c1219hH6);
                int iMErrorCode = payMayaErrorF4.mErrorCode();
                if (iMErrorCode == -332) {
                    ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).Z1(payMayaErrorF4);
                    return;
                }
                if (iMErrorCode != -340) {
                    ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).a2(payMayaErrorF4);
                    return;
                }
                MayaBankTransferOTPFragment mayaBankTransferOTPFragment = (MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get());
                mayaBankTransferOTPFragment.getClass();
                t6.i iVar = mayaBankTransferOTPFragment.f11579k0;
                if (iVar != null) {
                    MayaBankTransferActivity mayaBankTransferActivity3 = (MayaBankTransferActivity) iVar;
                    MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, null, null, null, false, payMayaErrorF4, null, false, 447);
                    mayaErrorDialogFragmentZ.f11850c0 = new C2166c(mayaErrorDialogFragmentZ, mayaBankTransferActivity3, i);
                    mayaErrorDialogFragmentZ.show(mayaBankTransferActivity3.getSupportFragmentManager(), "error_dialog");
                    return;
                }
                return;
            case 27:
                ((p8.b) this.f11371b).k();
                return;
            default:
                ((ch.r) this.f11371b).onError((Throwable) obj);
                return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // Ch.f
    public Object apply(Object obj) {
        Object obj2 = this.f11371b;
        switch (this.f11370a) {
            case 2:
                Response response = (Response) obj;
                kotlin.jvm.internal.j.g(response, "response");
                String str = response.headers().get("Last-Modified");
                LocalDateTime localDateTimeE = AbstractC1234x.e(str);
                String string = svM7M6.getString(((O0) obj2).e.f11330b, "key_shop_providers_collection_date", null);
                LocalDateTime localDateTimeE2 = string != null ? AbstractC1234x.e(string) : null;
                return new Pair(Boolean.valueOf(localDateTimeE2 == null || localDateTimeE == null || localDateTimeE.isAfter(localDateTimeE2)), str);
            case 25:
                FavoriteCount it = (FavoriteCount) obj;
                kotlin.jvm.internal.j.g(it, "it");
                return Ah.p.c((List) obj2);
            default:
                Object objApply = ((C2139x) obj2).c.apply(new Object[]{obj});
                jh.e.b(objApply, "The combiner returned a null value");
                return objApply;
        }
    }

    @Override // kk.d
    public void b() {
        Log.e("OpenCVManager/Helper", "Installation was not started! Nothing to wait!");
    }

    @Override // kk.d
    public void cancel() {
        Log.d("OpenCVManager/Helper", "OpenCV library installation was canceled");
        Log.d("OpenCVManager/Helper", "Init finished with status 3");
        Log.d("OpenCVManager/Helper", "Unbind from service");
        Ci.b bVar = (Ci.b) ((F1.p) this.f11371b).f1533b;
        ((FragmentActivity) bVar.e).unbindService((F1.p) bVar.f);
        Log.d("OpenCVManager/Helper", "Calling using callback");
        ((Rg.u) bVar.c).o(3);
    }

    public io.split.android.client.network.g e(io.split.android.client.network.e eVar, URL url, int i, HashMap map, String str, SSLSocketFactory sSLSocketFactory, io.split.android.client.network.k kVar) throws IOException {
        try {
            U8.c cVarD = d(eVar, url, sSLSocketFactory, kVar, false);
            SSLSocket sSLSocket = (SSLSocket) cVarD.c;
            SSLSocket sSLSocket2 = (SSLSocket) cVarD.f5964b;
            try {
                return ((Kh.I) this.f11371b).e((SSLSocket) cVarD.c, url, i, map, str, (Certificate[]) cVarD.f5965d);
            } finally {
                c(sSLSocket, sSLSocket2);
            }
        } catch (SocketException e) {
            throw e;
        } catch (Exception e7) {
            Ri.a.g("Failed to execute request through custom tunnel: " + e7.getMessage());
            throw new IOException("Failed to execute request through custom tunnel", e7);
        }
    }

    public io.split.android.client.network.i f(io.split.android.client.network.e eVar, URL url, int i, HashMap map, SSLSocketFactory sSLSocketFactory, io.split.android.client.network.k kVar) throws IOException {
        try {
            U8.c cVarD = d(eVar, url, sSLSocketFactory, kVar, true);
            SSLSocket sSLSocket = (SSLSocket) cVarD.c;
            return ((Kh.I) this.f11371b).f(sSLSocket, sSLSocket != ((SSLSocket) cVarD.f5964b) ? sSLSocket : null, url, i, map);
        } catch (SocketException e) {
            throw e;
        } catch (Exception e7) {
            throw new IOException("Failed to execute request through custom tunnel", e7);
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        return new d1.d((Context) ((d3.c) this.f11371b).f16259b, new N4.d(27), new M2.b(27));
    }

    @Override // kk.d
    public String getPackageName() {
        return "OpenCV library";
    }

    @Override // t4.j
    public void i() {
    }

    public void j() {
        ((C1847a) this.f11371b).d();
    }

    public C1446a k(String str, String str2) {
        Map map = ((C1447b) this.f11371b).f16681a;
        if (map == null || ((C1446a) map.get(str)) == null) {
            return new C1446a(str2);
        }
        return new C1446a(str2 == null ? null : "fallback - ".concat(str2));
    }

    @Override // t4.j
    public void onRefresh() {
        InterfaceC1467c interfaceC1467c = ((MayaAccountLimitsPageFragment) ((e6.b) ((b6.b) ((MayaAccountLimitsPageFragment) this.f11371b).G1()).c.get())).f11523X;
        if (interfaceC1467c != null) {
            MayaAccountLimitsActivity mayaAccountLimitsActivity = (MayaAccountLimitsActivity) interfaceC1467c;
            MayaAccountLimitsFragment mayaAccountLimitsFragment = (MayaAccountLimitsFragment) mayaAccountLimitsActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaAccountLimitsActivity, MayaAccountLimitsFragment.class));
            if (mayaAccountLimitsFragment != null) {
                mayaAccountLimitsFragment.G1().l();
            }
        }
        LottieAnimationView lottieAnimationView = ((MayaAccountLimitsPageFragment) this.f11371b).f11521V;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        } else {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
    }

    @Override // hh.InterfaceC1568a
    public void run() {
        ((InterfaceC1573f) this.f11371b).accept(ch.k.f9368b);
    }

    public M(KycTencentApi mKycTencentApi) {
        this.f11370a = 1;
        kotlin.jvm.internal.j.g(mKycTencentApi, "mKycTencentApi");
        this.f11371b = mKycTencentApi;
    }

    public M(Fragment fragment, s5.f fVar) {
        this.f11370a = 20;
        C1847a c1847a = new C1847a();
        this.f11371b = c1847a;
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        kotlin.jvm.internal.j.g(fragmentActivityRequireActivity, "<set-?>");
        c1847a.f17715a = fragmentActivityRequireActivity;
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        kotlin.jvm.internal.j.g(viewLifecycleOwner, "<set-?>");
        c1847a.f17716b = viewLifecycleOwner;
        c1847a.c = fragment;
        c1847a.i = fVar;
    }

    public M(C1447b c1447b) {
        this.f11370a = 5;
        Objects.requireNonNull(c1447b);
        this.f11371b = c1447b;
    }

    public M(AppCompatActivity activity) {
        this.f11370a = 20;
        s5.f fVar = s5.f.f;
        kotlin.jvm.internal.j.g(activity, "activity");
        C1847a c1847a = new C1847a();
        this.f11371b = c1847a;
        c1847a.f17715a = activity;
        c1847a.f17716b = activity;
        c1847a.c = activity;
        c1847a.i = fVar;
    }

    public M() {
        this.f11370a = 12;
        this.f11371b = new Kh.I(24);
    }
}
