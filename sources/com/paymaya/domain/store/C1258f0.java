package com.paymaya.domain.store;

import D8.C0214w;
import G5.C0256f;
import G5.InterfaceC0254d;
import G5.ViewOnFocusChangeListenerC0257g;
import a7.InterfaceC0642c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import b6.C0922a;
import bj.InterfaceC1033d;
import cj.C1110A;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.KycCaptureGuide;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycIdGuide;
import com.paymaya.domain.model.MayaCreditCardAccountStatus;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.model.ReferralEligibilityData;
import com.paymaya.domain.model.RewardsCatalog;
import com.paymaya.domain.model.RewardsCatalogAccount;
import com.paymaya.domain.model.RewardsCatalogAccountBalance;
import com.paymaya.domain.model.RewardsCatalogAmount;
import com.paymaya.domain.model.RewardsCatalogData;
import com.paymaya.domain.model.RewardsCatalogMetadata;
import com.paymaya.domain.model.RewardsCatalogMoney;
import com.paymaya.domain.model.RewardsCatalogProduct;
import com.paymaya.domain.model.RewardsCatalogResult;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferOTPFragment;
import com.paymaya.mayaui.common.view.widget.MayaHtmlTextView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordEnterMinFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantOTPFragment;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelConfirmationFragment;
import com.paymaya.ui.dataprivacy.view.dialog.impl.DataPrivacyDialogFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFormFragment;
import d3.InterfaceC1330b;
import e3.C1423a;
import g0.InterfaceC1493b;
import i8.C1594b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import k3.C1761f;
import kotlin.jvm.functions.Function1;
import l9.C1803a;
import l9.C1809g;
import l9.C1812j;
import l9.C1819q;
import m8.InterfaceC1854a;
import ma.C1859a;
import md.InterfaceC1862a;
import n8.C1934b;
import n8.InterfaceC1935c;
import p7.InterfaceC2015a;
import p9.InterfaceC2024i;
import p9.InterfaceC2027l;
import pg.C2038a;
import q7.ViewOnClickListenerC2167a;
import s6.InterfaceC2241b;
import s6.InterfaceC2243d;
import t6.C2274e;
import v.AbstractC2329d;

/* JADX INFO: renamed from: com.paymaya.domain.store.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1258f0 implements Ch.f, InterfaceC0642c, InterfaceC0254d, InterfaceC1330b, l0.f, Ch.c, OnCompleteListener, hh.o, W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11441b;

    public /* synthetic */ C1258f0(Object obj, int i) {
        this.f11440a = i;
        this.f11441b = obj;
    }

    @Override // G5.InterfaceC0254d
    public void T() {
        RequestMoneyFormFragment requestMoneyFormFragment = (RequestMoneyFormFragment) this.f11441b;
        TextInputEditText textInputEditText = requestMoneyFormFragment.f14699W;
        if (textInputEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextAmount");
            throw null;
        }
        InterfaceC1033d interfaceC1033d = requestMoneyFormFragment.f14709g0;
        ViewCompat.setBackgroundTintList(textInputEditText, (ColorStateList) interfaceC1033d.getValue());
        TextInputLayout textInputLayout = requestMoneyFormFragment.f14698V;
        if (textInputLayout == null) {
            kotlin.jvm.internal.j.n("mLayoutAmount");
            throw null;
        }
        textInputLayout.setDefaultHintTextColor((ColorStateList) interfaceC1033d.getValue());
        requestMoneyFormFragment.f14712j0 = false;
        ((Zd.f) requestMoneyFormFragment.s1()).k();
    }

    public void a(String str, Set set) {
        if (str == null || str.trim().isEmpty()) {
            Ri.a.g("Host cannot be null or empty. Ignoring entry");
            return;
        }
        if (set == null || set.isEmpty()) {
            Ri.a.g("Pins cannot be null or empty. Ignoring entry for host ".concat(str));
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            io.split.android.client.network.a aVar = (io.split.android.client.network.a) it.next();
            if (aVar == null) {
                Ri.a.g("Pin cannot be null. Ignoring entry for host ".concat(str));
            } else if (aVar.a().equalsIgnoreCase("sha256") || aVar.a().equalsIgnoreCase("sha1")) {
                hashSet.add(aVar);
            } else {
                Ri.a.g("Invalid algorithm. Must be sha256 or sha1. Ignoring entry for host ".concat(str));
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        ((LinkedHashMap) this.f11441b).put(str, hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ch.c
    public void accept(Object obj) {
        kc.a aVar;
        MayaQRPHDynamicMerchantConfirmationFragment mayaQRPHDynamicMerchantConfirmationFragment;
        InterfaceC2024i interfaceC2024i;
        int i = 2;
        boolean z4 = false;
        Object[] objArr = 0;
        int i4 = 1;
        switch (this.f11440a) {
            case 7:
                Throwable p02 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                D8.E e = (D8.E) this.f11441b;
                C8.a.m(e, p02, null, new com.squareup.wire.internal.a(e, 7), 6);
                return;
            case 8:
                Lb.a aVar2 = (Lb.a) this.f11441b;
                PayMayaError payMayaErrorF = aVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                jc.a aVar3 = (jc.a) aVar2.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                c1219hH.i();
                ((MayaBaseFragment) aVar3).A1(c1219hH);
                ((MayaBaseFragment) ((jc.a) aVar2.c.get())).w1();
                if (payMayaErrorF.isSessionTimeout() || (aVar = ((MayaTravelConfirmationFragment) ((jc.a) aVar2.c.get())).f14190g0) == null) {
                    return;
                }
                M2.b.Z(0, null, null, null, null, false, payMayaErrorF, null, false, 447).show(((MayaTravelActivity) aVar).getSupportFragmentManager(), "error_dialog");
                return;
            case 9:
            case 10:
            case 13:
            case 14:
            case 16:
            case 17:
            case 24:
            case 26:
            default:
                ((MayaBaseFragment) ((InterfaceC2243d) ((C0922a) this.f11441b).c.get())).w1();
                C0922a c0922a = (C0922a) this.f11441b;
                PayMayaError payMayaErrorF2 = c0922a.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                if (c0922a.e.e().isAppEventV2BankTransferEnabled()) {
                    ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).Y1(payMayaErrorF2);
                }
                if (payMayaErrorF2.isNetworkError()) {
                    InterfaceC2243d interfaceC2243d = (InterfaceC2243d) c0922a.c.get();
                    C1219h c1219hH2 = AbstractC2329d.h(12);
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH2.j.put(Constants.REASON, payMayaErrorF2.mSpiel());
                    c1219hH2.i();
                    ((MayaBaseFragment) interfaceC2243d).A1(c1219hH2);
                    ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).Z1(payMayaErrorF2);
                    return;
                }
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                InterfaceC2243d interfaceC2243d2 = (InterfaceC2243d) c0922a.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put(Constants.REASON, payMayaErrorF2.mSpiel());
                c1219hH3.i();
                ((MayaBaseFragment) interfaceC2243d2).A1(c1219hH3);
                ((MayaBankTransferOTPFragment) ((InterfaceC2243d) c0922a.c.get())).a2(payMayaErrorF2);
                return;
            case 11:
                ((Function1) this.f11441b).invoke(obj);
                return;
            case 12:
                PayMayaError payMayaErrorF3 = ((C1594b) this.f11441b).f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                C1594b c1594b = (C1594b) this.f11441b;
                ((MayaBaseFragment) ((InterfaceC1854a) c1594b.c.get())).w1();
                if (payMayaErrorF3.isNetworkError()) {
                    InterfaceC1935c interfaceC1935c = ((MayaForgotPasswordEnterMinFragment) ((InterfaceC1854a) c1594b.c.get())).f12370Z;
                    if (interfaceC1935c != null) {
                        ((MayaForgotPasswordActivity) interfaceC1935c).V1(payMayaErrorF3);
                        return;
                    }
                    return;
                }
                MayaForgotPasswordEnterMinFragment mayaForgotPasswordEnterMinFragment = (MayaForgotPasswordEnterMinFragment) ((InterfaceC1854a) c1594b.c.get());
                InterfaceC1935c interfaceC1935c2 = mayaForgotPasswordEnterMinFragment.f12370Z;
                if (interfaceC1935c2 != null) {
                    ((MayaForgotPasswordActivity) interfaceC1935c2).X1(mayaForgotPasswordEnterMinFragment.getString(R.string.maya_label_that_didnt_load_right), mayaForgotPasswordEnterMinFragment.getString(R.string.maya_label_error_incorrect_mobile_number), mayaForgotPasswordEnterMinFragment.getString(R.string.maya_label_button_back_to_login), mayaForgotPasswordEnterMinFragment.getString(R.string.maya_label_button_retry), new C1934b(mayaForgotPasswordEnterMinFragment, i4), new H0(10));
                    return;
                }
                return;
            case 15:
                M7.c cVar = (M7.c) this.f11441b;
                PayMayaError payMayaError = cVar.f((Throwable) obj, false);
                DataPrivacyDialogFragment dataPrivacyDialogFragment = (DataPrivacyDialogFragment) ((InterfaceC1862a) cVar.c.get());
                dataPrivacyDialogFragment.getClass();
                kotlin.jvm.internal.j.g(payMayaError, "payMayaError");
                nd.a aVar4 = dataPrivacyDialogFragment.f14483U;
                if (aVar4 != null) {
                    aVar4.a(payMayaError, dataPrivacyDialogFragment.getString(R.string.pma_toast_error_title_login_error));
                    return;
                }
                return;
            case 18:
                l7.b bVar = (l7.b) this.f11441b;
                PayMayaError payMayaErrorF4 = bVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                if (!payMayaErrorF4.isSessionTimeout()) {
                    if (payMayaErrorF4.mErrorCode() == -800) {
                        MayaCreatorStoreFragment mayaCreatorStoreFragment = (MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get());
                        String string = mayaCreatorStoreFragment.requireArguments().getString("creator_store_title");
                        com.squareup.wire.internal.a aVar5 = new com.squareup.wire.internal.a(mayaCreatorStoreFragment, 18);
                        ViewOnClickListenerC2167a viewOnClickListenerC2167a = new ViewOnClickListenerC2167a(mayaCreatorStoreFragment, i4);
                        mayaCreatorStoreFragment.m0 = 2;
                        FrameLayout frameLayout = mayaCreatorStoreFragment.f10342V;
                        if (frameLayout == null) {
                            kotlin.jvm.internal.j.n("mFrameLayoutContentContainer");
                            throw null;
                        }
                        frameLayout.setVisibility(8);
                        FrameLayout frameLayout2 = mayaCreatorStoreFragment.f10343W;
                        if (frameLayout2 == null) {
                            kotlin.jvm.internal.j.n("mFrameLayoutLoadingContainer");
                            throw null;
                        }
                        frameLayout2.setVisibility(8);
                        FrameLayout frameLayout3 = mayaCreatorStoreFragment.f10344X;
                        if (frameLayout3 == null) {
                            kotlin.jvm.internal.j.n("mFrameLayoutErrorContainer");
                            throw null;
                        }
                        frameLayout3.setVisibility(8);
                        FrameLayout frameLayout4 = mayaCreatorStoreFragment.f10345Y;
                        if (frameLayout4 == null) {
                            kotlin.jvm.internal.j.n("mFrameLayoutMaintenanceContainer");
                            throw null;
                        }
                        frameLayout4.setVisibility(8);
                        FrameLayout frameLayout5 = mayaCreatorStoreFragment.f10346Z;
                        if (frameLayout5 == null) {
                            kotlin.jvm.internal.j.n("mFrameLayoutError2Container");
                            throw null;
                        }
                        frameLayout5.setVisibility(0);
                        TextView textView = mayaCreatorStoreFragment.f10356j0;
                        if (textView != null) {
                            textView.setOnClickListener(new qf.d(viewOnClickListenerC2167a, 25));
                        }
                        MayaHtmlTextView mayaHtmlTextView = mayaCreatorStoreFragment.f10355i0;
                        if (mayaHtmlTextView != null) {
                            mayaHtmlTextView.setOnLinkClickListener(new C1803a(aVar5, 28));
                        }
                        TextView textView2 = mayaCreatorStoreFragment.f10356j0;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        }
                        ImageView imageView = mayaCreatorStoreFragment.f10353g0;
                        if (imageView != null) {
                            imageView.setImageDrawable(ContextCompat.getDrawable(mayaCreatorStoreFragment.requireContext(), 2131231452));
                        }
                        TextView textView3 = mayaCreatorStoreFragment.f10354h0;
                        if (textView3 != null) {
                            textView3.setText(mayaCreatorStoreFragment.getString(R.string.maya_label_unavailable_feature));
                        }
                        MayaHtmlTextView mayaHtmlTextView2 = mayaCreatorStoreFragment.f10355i0;
                        if (mayaHtmlTextView2 != null) {
                            mayaHtmlTextView2.setVisibility(0);
                        }
                        MayaHtmlTextView mayaHtmlTextView3 = mayaCreatorStoreFragment.f10355i0;
                        if (mayaHtmlTextView3 != null) {
                            mayaHtmlTextView3.setTextHTML(mayaCreatorStoreFragment.getString(R.string.maya_label_unavailable_feature_description, string));
                        }
                        ((MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get())).S1();
                    } else if (payMayaErrorF4.mErrorCode() == -6 || !bVar.j.isEmpty()) {
                        bVar.h = true;
                        bVar.o(bVar.j);
                    } else if (payMayaErrorF4.isNetworkError()) {
                        InterfaceC2015a interfaceC2015a = (InterfaceC2015a) bVar.c.get();
                        String strMSpiel = payMayaErrorF4.mSpiel();
                        kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                        MayaCreatorStoreFragment mayaCreatorStoreFragment2 = (MayaCreatorStoreFragment) interfaceC2015a;
                        mayaCreatorStoreFragment2.getClass();
                        MayaBaseLoadingFragment.N1(mayaCreatorStoreFragment2, 100, strMSpiel, null, new ViewOnClickListenerC2167a(mayaCreatorStoreFragment2, i), 28);
                        ((MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get())).S1();
                    } else {
                        InterfaceC2015a interfaceC2015a2 = (InterfaceC2015a) bVar.c.get();
                        String strMSpiel2 = payMayaErrorF4.mSpiel();
                        MayaCreatorStoreFragment mayaCreatorStoreFragment3 = (MayaCreatorStoreFragment) interfaceC2015a2;
                        mayaCreatorStoreFragment3.getClass();
                        MayaBaseLoadingFragment.N1(mayaCreatorStoreFragment3, 200, strMSpiel2, null, new ViewOnClickListenerC2167a(mayaCreatorStoreFragment3, objArr == true ? 1 : 0), 28);
                        ((MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get())).S1();
                    }
                }
                ((MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get())).T1();
                return;
            case 19:
                C0214w c0214w = (C0214w) this.f11441b;
                PayMayaError payMayaErrorF5 = c0214w.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                c0214w.x(payMayaErrorF5);
                return;
            case 20:
                C1809g c1809g = (C1809g) this.f11441b;
                PayMayaError payMayaErrorF6 = c1809g.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                c1809g.o(payMayaErrorF6);
                return;
            case 21:
                C1812j c1812j = (C1812j) this.f11441b;
                PayMayaError payMayaErrorF7 = c1812j.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                o9.f fVar = (o9.f) c1812j.c.get();
                C1219h c1219hH4 = AbstractC2329d.h(12);
                c1219hH4.t(EnumC1217f.PAY);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH4.j.put(Constants.REASON, payMayaErrorF7.mSpiel());
                ((MayaBaseFragment) fVar).A1(c1219hH4);
                if (payMayaErrorF7.isSessionTimeout() || (interfaceC2024i = (mayaQRPHDynamicMerchantConfirmationFragment = (MayaQRPHDynamicMerchantConfirmationFragment) ((o9.f) c1812j.c.get())).f12892Z) == null) {
                    return;
                }
                ((MayaQRPHMerchantActivity) interfaceC2024i).a(payMayaErrorF7, mayaQRPHDynamicMerchantConfirmationFragment.getString(R.string.pma_toast_error_title_merchant_payment_error));
                return;
            case 22:
                QRPHMerchantPaymentTransaction completedTransaction = (QRPHMerchantPaymentTransaction) obj;
                kotlin.jvm.internal.j.g(completedTransaction, "completedTransaction");
                C0214w c0214w2 = (C0214w) this.f11441b;
                c0214w2.getClass();
                o9.i iVar = (o9.i) c0214w2.c.get();
                C1219h c1219hH5 = AbstractC2329d.h(14);
                EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH5.j.put("attribution", ((MayaBaseFragment) ((o9.i) c0214w2.c.get())).n1().f10371a);
                ((MayaBaseFragment) iVar).A1(c1219hH5);
                MayaQRPHMerchantOTPFragment mayaQRPHMerchantOTPFragment = (MayaQRPHMerchantOTPFragment) ((o9.i) c0214w2.c.get());
                mayaQRPHMerchantOTPFragment.getClass();
                InterfaceC2027l interfaceC2027l = mayaQRPHMerchantOTPFragment.f12907k0;
                if (interfaceC2027l != null) {
                    ((MayaQRPHMerchantActivity) interfaceC2027l).d2(completedTransaction);
                    return;
                }
                return;
            case 23:
                C1819q c1819q = (C1819q) this.f11441b;
                PayMayaError payMayaErrorF8 = c1819q.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF8, "mayaErrorHandling(...)");
                c1819q.n(payMayaErrorF8);
                return;
            case 25:
                ReferralEligibilityData it = (ReferralEligibilityData) obj;
                kotlin.jvm.internal.j.g(it, "it");
                C1859a c1859a = (C1859a) this.f11441b;
                c1859a.getClass();
                if (it.getCanBeReferred()) {
                    Group group = ((BaseMayaProfileFragment) ((pa.a) c1859a.c.get())).f13529r0;
                    if (group != null) {
                        group.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mConstraintGroupSubmitInviteCode");
                        throw null;
                    }
                }
                Group group2 = ((BaseMayaProfileFragment) ((pa.a) c1859a.c.get())).f13529r0;
                if (group2 != null) {
                    group2.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mConstraintGroupSubmitInviteCode");
                    throw null;
                }
            case 27:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                ((Lb.a) this.f11441b).getClass();
                if (permission.f6934b) {
                    yk.a.a();
                    return;
                } else if (permission.c) {
                    yk.a.a();
                    return;
                } else {
                    yk.a.a();
                    return;
                }
            case 28:
                AccountBalance accountBalance = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(accountBalance, "accountBalance");
                o6.g gVar = (o6.g) this.f11441b;
                gVar.getClass();
                InterfaceC2241b interfaceC2241b = (InterfaceC2241b) gVar.c.get();
                String formattedValue = accountBalance.mAvailableBalance().getFormattedValue();
                kotlin.jvm.internal.j.f(formattedValue, "getFormattedValue(...)");
                MayaBankTransferFormFragment mayaBankTransferFormFragment = (MayaBankTransferFormFragment) interfaceC2241b;
                mayaBankTransferFormFragment.getClass();
                C0256f c0256f = mayaBankTransferFormFragment.f11551C0;
                if (c0256f != null) {
                    AppCompatEditText appCompatEditText = mayaBankTransferFormFragment.f11555r0;
                    if (appCompatEditText == null) {
                        kotlin.jvm.internal.j.n("mEditTextAmount");
                        throw null;
                    }
                    appCompatEditText.removeTextChangedListener(c0256f);
                }
                MayaInputLayout mayaInputLayout = mayaBankTransferFormFragment.f11554q0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                    throw null;
                }
                mayaInputLayout.setHelperInfoText(mayaBankTransferFormFragment.getString(R.string.maya_format_amount_helper, formattedValue));
                AppCompatEditText appCompatEditText2 = mayaBankTransferFormFragment.f11555r0;
                if (appCompatEditText2 == null) {
                    kotlin.jvm.internal.j.n("mEditTextAmount");
                    throw null;
                }
                C0256f c0256f2 = new C0256f(appCompatEditText2, AudioStats.AUDIO_AMPLITUDE_NONE, com.paymaya.common.utility.C.F(formattedValue).doubleValue());
                String string2 = mayaBankTransferFormFragment.getString(R.string.maya_php_currency);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                c0256f2.f1741o = string2;
                c0256f2.f1742p = 0;
                c0256f2.m = new C2038a(17, mayaBankTransferFormFragment, formattedValue, z4);
                mayaBankTransferFormFragment.f11551C0 = c0256f2;
                MayaInputLayout mayaInputLayout2 = mayaBankTransferFormFragment.f11554q0;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                    throw null;
                }
                mayaInputLayout2.q();
                appCompatEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0257g(c0256f2, new C2274e(mayaBankTransferFormFragment, i4), 0));
                AppCompatEditText appCompatEditText3 = mayaBankTransferFormFragment.f11555r0;
                if (appCompatEditText3 != null) {
                    appCompatEditText3.addTextChangedListener(c0256f2);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mEditTextAmount");
                    throw null;
                }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        ArrayList arrayList;
        RewardsCatalogAccountBalance balance;
        RewardsCatalogMoney points;
        String strJ;
        RewardsCatalogMoney points2;
        RewardsCatalogMoney points3;
        switch (this.f11440a) {
            case 0:
                KycCmsContent liveContent = (KycCmsContent) obj;
                kotlin.jvm.internal.j.g(liveContent, "liveContent");
                KycCmsContentData data = liveContent.getData();
                List<KycCaptureGuide> captureGuides = liveContent.getData().getCaptureGuides();
                if (captureGuides != null) {
                    List<KycCaptureGuide> list = captureGuides;
                    ArrayList arrayList2 = new ArrayList(cj.t.l(list, 10));
                    for (KycCaptureGuide kycCaptureGuide : list) {
                        ((com.google.firebase.messaging.r) this.f11441b).getClass();
                        List<KycIdGuide> idGuide = kycCaptureGuide.getIdGuide();
                        ArrayList arrayList3 = new ArrayList(cj.t.l(idGuide, 10));
                        for (KycIdGuide kycIdGuideCopy$default : idGuide) {
                            if (kotlin.jvm.internal.j.b(kycIdGuideCopy$default.getFront(), "DRIVERS_LICENSE")) {
                                kycIdGuideCopy$default = KycIdGuide.copy$default(kycIdGuideCopy$default, null, null, "DRIVERS_BACK", 3, null);
                            }
                            arrayList3.add(kycIdGuideCopy$default);
                        }
                        arrayList2.add(KycCaptureGuide.copy$default(kycCaptureGuide, null, null, null, null, null, null, null, null, null, arrayList3, FrameMetricsAggregator.EVERY_DURATION, null));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return KycCmsContent.copy$default(liveContent, KycCmsContentData.copy$default(data, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268433407, null), null, 2, null);
            case 1:
                RewardsCatalogData response = (RewardsCatalogData) obj;
                kotlin.jvm.internal.j.g(response, "response");
                ((G0) this.f11441b).getClass();
                List<RewardsCatalogProduct> data2 = response.getData();
                ArrayList arrayList4 = new ArrayList(cj.t.l(data2, 10));
                Iterator<T> it = data2.iterator();
                while (true) {
                    dValueOf = null;
                    Double dValueOf = null;
                    if (!it.hasNext()) {
                        RewardsCatalogMetadata metadata = response.getMetadata();
                        RewardsCatalogAccount account = metadata != null ? metadata.getAccount() : null;
                        Double dValueOf2 = (account == null || (balance = account.getBalance()) == null || (points = balance.getPoints()) == null) ? null : Double.valueOf(points.getValue());
                        String status = account != null ? account.getStatus() : null;
                        return new RewardsCatalogResult(arrayList4, dValueOf2, MayaCreditCardAccountStatus.Companion.from(status) == MayaCreditCardAccountStatus.ACTIVE, status);
                    }
                    RewardsCatalogProduct rewardsCatalogProduct = (RewardsCatalogProduct) it.next();
                    String productId = rewardsCatalogProduct.getProductId();
                    String name = rewardsCatalogProduct.getName();
                    String tile = rewardsCatalogProduct.getImages().getTile();
                    List<RewardsCatalogAmount> amounts = rewardsCatalogProduct.getAmounts();
                    NumberFormat numberInstance = NumberFormat.getNumberInstance();
                    RewardsCatalogAmount rewardsCatalogAmount = (RewardsCatalogAmount) C1110A.B(amounts);
                    Double dValueOf3 = (rewardsCatalogAmount == null || (points3 = rewardsCatalogAmount.getPoints()) == null) ? null : Double.valueOf(Math.abs(points3.getValue()));
                    RewardsCatalogAmount rewardsCatalogAmount2 = (RewardsCatalogAmount) C1110A.H(amounts);
                    if (rewardsCatalogAmount2 != null && (points2 = rewardsCatalogAmount2.getPoints()) != null) {
                        dValueOf = Double.valueOf(Math.abs(points2.getValue()));
                    }
                    if (dValueOf3 == null) {
                        strJ = "0";
                    } else if (dValueOf == null || kotlin.jvm.internal.j.a(dValueOf3, dValueOf)) {
                        strJ = numberInstance.format(dValueOf3.doubleValue());
                        kotlin.jvm.internal.j.f(strJ, "format(...)");
                    } else {
                        strJ = androidx.camera.core.impl.a.j(numberInstance.format(dValueOf3.doubleValue()), Global.HYPHEN, numberInstance.format(dValueOf.doubleValue()));
                    }
                    arrayList4.add(new RewardsCatalog(productId, name, tile, strJ));
                }
                break;
            default:
                ShopProviderBase it2 = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                ((O0) this.f11441b).getClass();
                List<ShopProvider> data3 = it2.getData();
                return new ShopProviderBase(data3 != null ? C1110A.Q(new R.a(new R.a(new N0(1), 2), 3), data3) : null, it2.getMeta());
        }
    }

    public boolean b(CharSequence charSequence, C1761f c1761f) {
        String str = c1761f.f18101b;
        if (str.length() != 0) {
            Matcher matcher = ((L) this.f11441b).d(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        return new C1423a((Context) ((d3.c) this.f11441b).f16259b);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        U8.c cVar = (U8.c) this.f11441b;
        if (!zIsSuccessful) {
            ((CleverTapInstanceConfig) cVar.f5964b).f("FCMFCM token using googleservices.json failed", task.getException());
            ((g0.g) ((InterfaceC1493b) cVar.f5965d)).e(null);
            return;
        }
        String str = task.getResult() != null ? (String) task.getResult() : null;
        ((CleverTapInstanceConfig) cVar.f5964b).e("PushProvider", "FCMFCM token using googleservices.json - " + str);
        ((g0.g) ((InterfaceC1493b) cVar.f5965d)).e(str);
    }

    @Override // W6.e
    public void onDismiss() {
        ((MayaDynamicMerchantActivity) this.f11441b).finish();
    }

    @Override // l0.f
    public void onSuccess(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f11441b;
        if (!zBooleanValue) {
            D.S sC = ((CleverTapInstanceConfig) rVar.c).c();
            String strL = jk.b.l((CleverTapInstanceConfig) rVar.c);
            sC.getClass();
            D.S.s(strL, "Product Config settings: writing Failed");
            return;
        }
        D.S sC2 = ((CleverTapInstanceConfig) rVar.c).c();
        String strL2 = jk.b.l((CleverTapInstanceConfig) rVar.c);
        String str = "Product Config settings: writing Success " + ((Map) rVar.e);
        sC2.getClass();
        D.S.s(strL2, str);
    }

    @Override // hh.o
    public boolean test(Object obj) {
        return ((Class) this.f11441b).isInstance(obj);
    }

    @Override // G5.InterfaceC0254d
    public void u() {
        RequestMoneyFormFragment requestMoneyFormFragment = (RequestMoneyFormFragment) this.f11441b;
        TextInputEditText textInputEditText = requestMoneyFormFragment.f14699W;
        if (textInputEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextAmount");
            throw null;
        }
        InterfaceC1033d interfaceC1033d = requestMoneyFormFragment.f14708f0;
        ViewCompat.setBackgroundTintList(textInputEditText, (ColorStateList) interfaceC1033d.getValue());
        TextInputLayout textInputLayout = requestMoneyFormFragment.f14698V;
        if (textInputLayout == null) {
            kotlin.jvm.internal.j.n("mLayoutAmount");
            throw null;
        }
        textInputLayout.setDefaultHintTextColor((ColorStateList) interfaceC1033d.getValue());
        requestMoneyFormFragment.f14712j0 = true;
        ((Zd.f) requestMoneyFormFragment.s1()).k();
    }

    public C1258f0(Gi.d dVar) {
        this.f11440a = 14;
        Objects.requireNonNull(dVar);
        this.f11441b = dVar;
    }

    public C1258f0(int i) {
        this.f11440a = i;
        switch (i) {
            case 17:
                this.f11441b = new L(20);
                break;
            default:
                this.f11441b = new LinkedHashMap();
                break;
        }
    }
}
