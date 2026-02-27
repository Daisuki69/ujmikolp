package com.paymaya.domain.store;

import D.CallableC0168a;
import D8.C0214w;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import b6.C0922a;
import bj.C1034e;
import cj.C1110A;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.BankTransferV3Recipient;
import com.paymaya.domain.model.KycLatestSubmissionContentData;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.model.RecommendationResponse;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferOTPFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantOTPFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import com.paymaya.mayaui.rewardscatalog.view.fragment.MayaRewardsCatalogFragment;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelConfirmationFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelOperatorSelectionFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelReceiptFragment;
import com.paymaya.ui.dashboard.view.fragment.impl.UserActivityFragment;
import com.paymaya.ui.dataprivacy.view.dialog.impl.DataPrivacyDialogFragment;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d4.AbstractC1331a;
import dOYHB6.yFtIp6.svM7M6;
import df.C1357C;
import gd.InterfaceC1517a;
import hh.InterfaceC1573f;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import je.InterfaceC1679a;
import l9.C1809g;
import l9.C1812j;
import l9.C1819q;
import ma.C1859a;
import md.InterfaceC1862a;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import okhttp3.ResponseBody;
import org.joda.time.LocalDateTime;
import org.json.JSONException;
import org.json.JSONObject;
import p9.InterfaceC2021f;
import p9.InterfaceC2024i;
import p9.InterfaceC2029n;
import pb.InterfaceC2031a;
import retrofit2.HttpException;
import retrofit2.Response;
import s6.InterfaceC2243d;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 implements Ch.f, Ch.c, l0.f, io.flutter.plugin.platform.n, hh.n, InterfaceC1573f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11334b;

    public /* synthetic */ A0(Object obj, int i) {
        this.f11333a = i;
        this.f11334b = obj;
    }

    @Override // io.flutter.plugin.platform.n
    public void a(int i, int i4) {
        ((TextureRegistry$SurfaceProducer) this.f11334b).setSize(i, i4);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        BankTransferV3 bankTransfer;
        int i = 2;
        BankTransferV3Recipient recipient = null;
        int i4 = 0;
        int i6 = 1;
        switch (this.f11333a) {
            case 1:
                ShopProviderBase shopProviderBase = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(shopProviderBase, "shopProviderBase");
                if (shopProviderBase.getData() != null) {
                    com.paymaya.data.database.repository.B b8 = ((O0) this.f11334b).c;
                    List<ShopProvider> items = shopProviderBase.getData();
                    b8.getClass();
                    kotlin.jvm.internal.j.g(items, "items");
                    b8.f11294a.c("shop_provider", com.paymaya.data.database.repository.B.a(items));
                    return;
                }
                return;
            case 2:
            case 4:
            case 5:
            case 9:
            case 12:
            case 13:
            case 15:
            case 23:
            case 25:
            case 26:
            default:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                Bb.f fVar = (Bb.f) this.f11334b;
                HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                Integer numValueOf = httpException != null ? Integer.valueOf(httpException.code()) : null;
                if (numValueOf != null) {
                    fVar.getClass();
                    if (numValueOf.intValue() == 403) {
                        ConstraintLayout constraintLayout = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13720Y;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                            return;
                        } else {
                            kotlin.jvm.internal.j.n("mRewardsCatalogComponent");
                            throw null;
                        }
                    }
                }
                ConstraintLayout constraintLayout2 = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13720Y;
                if (constraintLayout2 == null) {
                    kotlin.jvm.internal.j.n("mRewardsCatalogComponent");
                    throw null;
                }
                constraintLayout2.setVisibility(0);
                ConstraintLayout constraintLayout3 = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13727f0;
                if (constraintLayout3 == null) {
                    kotlin.jvm.internal.j.n("mErrorStateView");
                    throw null;
                }
                constraintLayout3.setVisibility(0);
                RecyclerView recyclerView = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13721Z;
                if (recyclerView == null) {
                    kotlin.jvm.internal.j.n("mRewardsCatalogRecyclerView");
                    throw null;
                }
                recyclerView.setVisibility(8);
                ConstraintLayout constraintLayout4 = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13726e0;
                if (constraintLayout4 == null) {
                    kotlin.jvm.internal.j.n("mEmptyStateView");
                    throw null;
                }
                constraintLayout4.setVisibility(8);
                Group group = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13730i0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mGroupFooter");
                    throw null;
                }
                group.setVisibility(8);
                TextView textView = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get())).f13722a0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mMilesValueTextView");
                    throw null;
                }
                textView.setVisibility(8);
                MayaRewardsCatalogFragment mayaRewardsCatalogFragment = (MayaRewardsCatalogFragment) ((InterfaceC2031a) fVar.c.get());
                C1220i c1220iO1 = mayaRewardsCatalogFragment.o1();
                C1219h c1219hE = C1219h.e("RCATALOG_ERROR_APPEARED");
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                String lowerCase = "Dashboard".toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                HashMap map = c1219hE.j;
                map.put("page_name", lowerCase);
                map.put("modal", "error_component");
                map.put(StateEvent.Name.ERROR_CODE, String.valueOf(numValueOf));
                map.put("error_message", mayaRewardsCatalogFragment.getString(R.string.maya_label_rewards_catalog_error_title));
                c1220iO1.b(c1219hE);
                return;
            case 3:
                G6.p pVar = (G6.p) this.f11334b;
                PayMayaError payMayaErrorF = pVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                ((UserActivityFragment) pVar.c.get()).n1();
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                UserActivityFragment userActivityFragment = (UserActivityFragment) pVar.c.get();
                InterfaceC1517a interfaceC1517a = userActivityFragment.f14468V;
                userActivityFragment.getString(R.string.pma_toast_error_title_error);
                MayaTransactionsActivity mayaTransactionsActivity = (MayaTransactionsActivity) interfaceC1517a;
                mayaTransactionsActivity.getClass();
                M2.b.Z(0, null, null, null, null, false, payMayaErrorF, null, false, 447).show(mayaTransactionsActivity.getSupportFragmentManager(), "error_dialog");
                return;
            case 6:
                KycLatestSubmissionContentData p02 = (KycLatestSubmissionContentData) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                ((D8.E) this.f11334b).p(p02);
                return;
            case 7:
                PurchasedTicket p03 = (PurchasedTicket) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                Lb.a aVar = (Lb.a) this.f11334b;
                y5.s sVar = (jc.a) aVar.c.get();
                C1219h c1219h = new C1219h();
                c1219h.n(14);
                c1219h.i();
                ((MayaBaseFragment) sVar).A1(c1219h);
                ((com.paymaya.data.preference.a) aVar.f).f11330b.edit().putLong("key_last_travel_qr_timestamp", System.currentTimeMillis()).apply();
                ((MayaBaseFragment) ((jc.a) aVar.c.get())).w1();
                MayaTravelConfirmationFragment mayaTravelConfirmationFragment = (MayaTravelConfirmationFragment) ((jc.a) aVar.c.get());
                mayaTravelConfirmationFragment.getClass();
                kc.a aVar2 = mayaTravelConfirmationFragment.f14190g0;
                if (aVar2 != null) {
                    MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) aVar2;
                    mayaTravelActivity.t1();
                    MayaTravelReceiptFragment mayaTravelReceiptFragment = new MayaTravelReceiptFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ticket_purchase_execute", p03);
                    mayaTravelReceiptFragment.setArguments(bundle);
                    AbstractC1236z.i(mayaTravelActivity, R.id.frame_layout_container, mayaTravelReceiptFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
                    return;
                }
                return;
            case 8:
                A7.j jVar = (A7.j) this.f11334b;
                PayMayaError payMayaErrorF2 = jVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF2.isNetworkError()) {
                    MayaTravelOperatorSelectionFragment mayaTravelOperatorSelectionFragment = (MayaTravelOperatorSelectionFragment) ((jc.c) jVar.c.get());
                    mayaTravelOperatorSelectionFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaTravelOperatorSelectionFragment, 100, null, null, new kc.c(mayaTravelOperatorSelectionFragment, i), 30);
                    return;
                } else {
                    MayaTravelOperatorSelectionFragment mayaTravelOperatorSelectionFragment2 = (MayaTravelOperatorSelectionFragment) ((jc.c) jVar.c.get());
                    mayaTravelOperatorSelectionFragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaTravelOperatorSelectionFragment2, 200, payMayaErrorF2.mSpiel(), null, new kc.c(mayaTravelOperatorSelectionFragment2, i6), 28);
                    return;
                }
            case 10:
                String it = (String) obj;
                kotlin.jvm.internal.j.g(it, "it");
                A7.j jVarG1 = ((MayaPayBillsSearchFragment) this.f11334b).G1();
                if (it.length() >= 2) {
                    MayaPayBillsSearchFragment mayaPayBillsSearchFragment = (MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get());
                    mayaPayBillsSearchFragment.getClass();
                    mayaPayBillsSearchFragment.f13486i0 = it;
                    MayaPayBillsSearchFragment mayaPayBillsSearchFragment2 = (MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get());
                    LottieAnimationView lottieAnimationView = mayaPayBillsSearchFragment2.f13476Y;
                    if (lottieAnimationView == null) {
                        kotlin.jvm.internal.j.n("mLottieAnimationViewLoading");
                        throw null;
                    }
                    lottieAnimationView.setVisibility(0);
                    RecyclerView recyclerView2 = mayaPayBillsSearchFragment2.f13475X;
                    if (recyclerView2 == null) {
                        kotlin.jvm.internal.j.n("mRecyclerViewBillerItems");
                        throw null;
                    }
                    recyclerView2.setVisibility(8);
                    Group group2 = mayaPayBillsSearchFragment2.f13477Z;
                    if (group2 == null) {
                        kotlin.jvm.internal.j.n("mConstraintGroupEmptyResults");
                        throw null;
                    }
                    group2.setVisibility(8);
                    Group group3 = mayaPayBillsSearchFragment2.f13478a0;
                    if (group3 == null) {
                        kotlin.jvm.internal.j.n("mConstraintGroupError");
                        throw null;
                    }
                    group3.setVisibility(8);
                    if (((com.paymaya.data.preference.a) jVarG1.f).e().isBillsPayEventsV2Enabled()) {
                        MayaPayBillsSearchFragment mayaPayBillsSearchFragment3 = (MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get());
                        mayaPayBillsSearchFragment3.getClass();
                        C1219h c1219hE2 = C1219h.e("BILLS_SEARCH_LOAD_PAGE");
                        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                        HashMap map2 = c1219hE2.j;
                        map2.put("source_page", "Pay Bills");
                        AppCompatEditText appCompatEditText = mayaPayBillsSearchFragment3.f13473V;
                        if (appCompatEditText == null) {
                            kotlin.jvm.internal.j.n("mEditTextSearchInput");
                            throw null;
                        }
                        map2.put("keyword", String.valueOf(appCompatEditText.getText()));
                        mayaPayBillsSearchFragment3.o1().b(c1219hE2);
                    }
                    ((MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get())).f13485h0.dispose();
                    ((MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get())).f13488k0 = true;
                    ((MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get())).f13487j0 = 1;
                    Ah.p pVarD = ((C1273n) jVarG1.e).d(1, it);
                    new Lh.d(new Kh.T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarD, pVarD, zh.b.a()), new ba.F(jVarG1, it, i4), i), new ba.F(jVarG1, it, i6), i4), new ba.E(jVarG1, i6)), new Q6.r(jVarG1, 24), i6).e();
                    return;
                }
                return;
            case 11:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                G6.p pVar2 = (G6.p) this.f11334b;
                kotlin.jvm.internal.j.f(pVar2.f(it2, false), "paymayaErrorHandling(...)");
                ((SendMoneyCardFragment) ((InterfaceC1679a) pVar2.c.get())).y1();
                return;
            case 14:
                List consents = (List) obj;
                kotlin.jvm.internal.j.g(consents, "consents");
                M7.c cVar = (M7.c) this.f11334b;
                ArrayList arrayList = new ArrayList(consents);
                DataPrivacyDialogFragment dataPrivacyDialogFragment = (DataPrivacyDialogFragment) ((InterfaceC1862a) cVar.c.get());
                dataPrivacyDialogFragment.getClass();
                nd.a aVar3 = dataPrivacyDialogFragment.f14483U;
                if (aVar3 != null) {
                    aVar3.b(dataPrivacyDialogFragment.f14482T, C1110A.W(arrayList));
                    return;
                }
                return;
            case 16:
                jh.e.b(obj, "value is null");
                ((InterfaceC1573f) this.f11334b).accept(new ch.k(obj));
                return;
            case 17:
                List onlinePayments = (List) obj;
                kotlin.jvm.internal.j.g(onlinePayments, "onlinePayments");
                ((l7.b) this.f11334b).o(onlinePayments);
                return;
            case 18:
                ((C0214w) this.f11334b).y((MerchantPayment) obj);
                return;
            case 19:
                MerchantPayment merchantPayment = (MerchantPayment) obj;
                C1809g c1809g = (C1809g) this.f11334b;
                y5.s sVar2 = (o9.d) c1809g.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.CREATE);
                ((MayaBaseFragment) sVar2).A1(c1219hH);
                InterfaceC2021f interfaceC2021f = ((MayaMerchantPaymentFragment) ((o9.d) c1809g.c.get())).t0;
                if (interfaceC2021f != null) {
                    MayaMerchantConfirmationFragment mayaMerchantConfirmationFragment = new MayaMerchantConfirmationFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("merchant", merchantPayment);
                    mayaMerchantConfirmationFragment.setArguments(bundle2);
                    AbstractC1236z.h((MayaMerchantActivity) interfaceC2021f, R.id.maya_activity_merchant_fragment_container, mayaMerchantConfirmationFragment);
                    return;
                }
                return;
            case 20:
                QRPHMerchantPaymentTransaction completedTransaction = (QRPHMerchantPaymentTransaction) obj;
                kotlin.jvm.internal.j.g(completedTransaction, "completedTransaction");
                C1812j c1812j = (C1812j) this.f11334b;
                y5.s sVar3 = (o9.f) c1812j.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(14);
                c1219hH2.t(EnumC1217f.PAY);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put("attribution", ((MayaBaseFragment) ((o9.f) c1812j.c.get())).n1().f10371a);
                ((MayaBaseFragment) sVar3).A1(c1219hH2);
                o9.f fVar2 = (o9.f) c1812j.c.get();
                String name = completedTransaction.getMerchantDetails().getName();
                String formattedValue = completedTransaction.getAmount().getFormattedValue();
                MayaQRPHDynamicMerchantConfirmationFragment mayaQRPHDynamicMerchantConfirmationFragment = (MayaQRPHDynamicMerchantConfirmationFragment) fVar2;
                mayaQRPHDynamicMerchantConfirmationFragment.getClass();
                String string = mayaQRPHDynamicMerchantConfirmationFragment.getString(R.string.maya_dialog_title_payment_sent, formattedValue);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                String string2 = mayaQRPHDynamicMerchantConfirmationFragment.getString(R.string.maya_dialog_description_payment_sent, name);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                InterfaceC2024i interfaceC2024i = mayaQRPHDynamicMerchantConfirmationFragment.f12892Z;
                if (interfaceC2024i != null) {
                    ((MayaQRPHMerchantActivity) interfaceC2024i).e2(string, string2, completedTransaction);
                    return;
                }
                return;
            case 21:
                ((MayaBaseFragment) ((o9.i) ((C0214w) this.f11334b).c.get())).w1();
                C0214w c0214w = (C0214w) this.f11334b;
                PayMayaError payMayaErrorF3 = c0214w.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                if (payMayaErrorF3.isSessionTimeout()) {
                    return;
                }
                int iMErrorCode = payMayaErrorF3.mErrorCode();
                if (iMErrorCode == -330) {
                    ((MayaQRPHMerchantOTPFragment) ((o9.i) c0214w.c.get())).X1(payMayaErrorF3.mSpiel());
                    return;
                } else if (iMErrorCode == -329) {
                    ((MayaQRPHMerchantOTPFragment) ((o9.i) c0214w.c.get())).Y1(payMayaErrorF3);
                    return;
                } else {
                    ((MayaQRPHMerchantOTPFragment) ((o9.i) c0214w.c.get())).Y1(payMayaErrorF3);
                    return;
                }
            case 22:
                QRPHMerchantPaymentTransaction qrphMerchantPaymentTransaction = (QRPHMerchantPaymentTransaction) obj;
                kotlin.jvm.internal.j.g(qrphMerchantPaymentTransaction, "qrphMerchantPaymentTransaction");
                C1819q c1819q = (C1819q) this.f11334b;
                c1819q.getClass();
                y5.s sVar4 = (o9.j) c1819q.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(14);
                c1219hH3.t(EnumC1217f.CREATE);
                ((MayaBaseFragment) sVar4).A1(c1219hH3);
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) ((o9.j) c1819q.c.get());
                mayaQRPHMerchantPaymentFragment.getClass();
                InterfaceC2029n interfaceC2029n = mayaQRPHMerchantPaymentFragment.t0;
                if (interfaceC2029n != null) {
                    MayaQRPHMerchantConfirmationFragment mayaQRPHMerchantConfirmationFragment = new MayaQRPHMerchantConfirmationFragment();
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("qr_ph_merchant_payment_transaction", qrphMerchantPaymentTransaction);
                    mayaQRPHMerchantConfirmationFragment.setArguments(bundle3);
                    AbstractC1236z.h((MayaQRPHMerchantActivity) interfaceC2029n, R.id.maya_activity_qr_ph_merchant_fragment_container, mayaQRPHMerchantConfirmationFragment);
                    return;
                }
                return;
            case 24:
                kotlin.jvm.internal.j.g((Throwable) obj, "p0");
                View view = ((BaseMayaProfileFragment) ((pa.a) ((C1859a) this.f11334b).c.get())).f13531v0;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mViewAuthorizeRequestsIndicator");
                    throw null;
                }
            case 27:
                ((o6.g) this.f11334b).f((Throwable) obj, true);
                return;
            case 28:
                BankTransferV3 completedTransaction2 = (BankTransferV3) obj;
                kotlin.jvm.internal.j.g(completedTransaction2, "completedTransaction");
                ((MayaBaseFragment) ((InterfaceC2243d) ((C0922a) this.f11334b).c.get())).w1();
                C0922a c0922a = (C0922a) this.f11334b;
                c0922a.getClass();
                y5.s sVar5 = (InterfaceC2243d) c0922a.c.get();
                C1219h c1219h2 = new C1219h();
                c1219h2.n(14);
                c1219h2.i();
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219h2.j.put("attribution", ((MayaBaseFragment) ((InterfaceC2243d) c0922a.c.get())).n1().f10371a);
                ((MayaBaseFragment) sVar5).A1(c1219h2);
                BankTransferV3CreateResponse bankTransferV3CreateResponseW1 = ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).W1();
                if (bankTransferV3CreateResponseW1 != null && (bankTransfer = bankTransferV3CreateResponseW1.getBankTransfer()) != null) {
                    recipient = bankTransfer.getRecipient();
                }
                completedTransaction2.prefillRecipientMissingValues(recipient);
                MayaBankTransferOTPFragment mayaBankTransferOTPFragment = (MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get());
                mayaBankTransferOTPFragment.getClass();
                t6.i iVar = mayaBankTransferOTPFragment.f11579k0;
                if (iVar != null) {
                    ((MayaBankTransferActivity) iVar).c2(completedTransaction2);
                    return;
                }
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f11333a) {
            case 0:
                Response response = (Response) obj;
                kotlin.jvm.internal.j.g(response, "response");
                boolean zIsSuccessful = response.isSuccessful();
                B0 b02 = (B0) this.f11334b;
                if (zIsSuccessful) {
                    String str = response.headers().get("Last-Modified");
                    String string = svM7M6.getString(b02.f11339d.f11330b, "key_action_card_date", null);
                    LocalDateTime localDateTimeC = string != null ? AbstractC1234x.c(string) : null;
                    LocalDateTime localDateTimeC2 = AbstractC1234x.c(str);
                    if (localDateTimeC != null && localDateTimeC2 != null && !localDateTimeC2.isAfter(localDateTimeC)) {
                        return new Kh.J(new CallableC0168a(b02, 14), 3);
                    }
                    Ah.p<RecommendationResponse> actionCardRecommendations = b02.f11338b.getActionCardRecommendations(5);
                    Y.e eVar = new Y.e(21, b02, str);
                    actionCardRecommendations.getClass();
                    return new Lh.f(actionCardRecommendations, eVar, 0);
                }
                b02.f11339d.f11330b.edit().putString("key_action_card_date", null).apply();
                String str2 = response.headers().get("error-code");
                if (str2 == null) {
                    str2 = "-999";
                }
                ResponseBody.Companion companion = ResponseBody.Companion;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("code", str2);
                    break;
                } catch (JSONException unused) {
                    yk.a.e();
                }
                try {
                    jSONObject.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, jSONObject2);
                    break;
                } catch (JSONException unused2) {
                    yk.a.e();
                }
                String string2 = jSONObject.toString();
                kotlin.jvm.internal.j.f(string2, "toString(...)");
                Response responseError = Response.error(response.code(), companion.create(B0.e, string2));
                kotlin.jvm.internal.j.f(responseError, "error(...)");
                throw new HttpException(responseError);
            default:
                return ((Class) this.f11334b).cast(obj);
        }
    }

    public synchronized void b(C1357C c1357c) {
        ((LinkedHashSet) this.f11334b).remove(c1357c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x034e, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K3.d c(B1.a r29, java.util.EnumMap r30) throws com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.domain.store.A0.c(B1.a, java.util.EnumMap):K3.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[Catch: ChecksumException | FormatException -> 0x0052, FormatException -> 0x0054, TryCatch #3 {ChecksumException | FormatException -> 0x0052, blocks: (B:9:0x0011, B:10:0x0022, B:12:0x002a, B:13:0x002d, B:15:0x0031, B:17:0x003b, B:18:0x0041, B:20:0x0046), top: B:32:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K3.d d(K3.b r9, java.util.EnumMap r10) throws com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            r8 = this;
            B1.a r0 = new B1.a
            r0.<init>(r9)
            r9 = 0
            K3.d r9 = r8.c(r0, r10)     // Catch: com.google.zxing.ChecksumException -> Lb com.google.zxing.FormatException -> Lf
            return r9
        Lb:
            r1 = move-exception
            r2 = r1
            r1 = r9
            goto L11
        Lf:
            r1 = move-exception
            r2 = r9
        L11:
            r0.j()     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            r0.f337d = r9     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            r0.e = r9     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            r9 = 1
            r0.f336b = r9     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            r0.i()     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            r0.h()     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            r9 = 0
        L22:
            java.lang.Object r3 = r0.c     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            K3.b r3 = (K3.b) r3     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            int r4 = r3.f2589a     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            if (r9 >= r4) goto L46
            int r4 = r9 + 1
            r5 = r4
        L2d:
            int r6 = r3.f2590b     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            if (r5 >= r6) goto L44
            boolean r6 = r3.b(r9, r5)     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            boolean r7 = r3.b(r5, r9)     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            if (r6 == r7) goto L41
            r3.a(r5, r9)     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            r3.a(r9, r5)     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
        L41:
            int r5 = r5 + 1
            goto L2d
        L44:
            r9 = r4
            goto L22
        L46:
            K3.d r9 = r8.c(r0, r10)     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            d4.f r10 = new d4.f     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            r10.<init>()     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            r9.f2598g = r10     // Catch: com.google.zxing.ChecksumException -> L52 com.google.zxing.FormatException -> L54
            return r9
        L52:
            r9 = move-exception
            goto L55
        L54:
            r9 = move-exception
        L55:
            if (r1 != 0) goto L5b
            if (r2 == 0) goto L5a
            throw r2
        L5a:
            throw r9
        L5b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.domain.store.A0.d(K3.b, java.util.EnumMap):K3.d");
    }

    @Override // io.flutter.plugin.platform.n
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f11334b).getHeight();
    }

    @Override // io.flutter.plugin.platform.n
    public long getId() {
        return ((TextureRegistry$SurfaceProducer) this.f11334b).id();
    }

    @Override // io.flutter.plugin.platform.n
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f11334b).getSurface();
    }

    @Override // io.flutter.plugin.platform.n
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f11334b).getWidth();
    }

    @Override // l0.f
    public void onSuccess(Object obj) {
        ((b1.t) this.f11334b).m(1);
    }

    @Override // io.flutter.plugin.platform.n
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f11334b).release();
        this.f11334b = null;
    }

    @Override // io.flutter.plugin.platform.n
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f11334b).scheduleFrame();
    }

    public A0(int i) {
        this.f11333a = i;
        switch (i) {
            case 9:
                this.f11334b = new LinkedHashSet();
                break;
            case 12:
                break;
            case 25:
                this.f11334b = C1034e.b(new n0.e(0));
                break;
            default:
                this.f11334b = new G6.r(M3.a.f3050l, 19);
                break;
        }
    }
}
