package Qd;

import Ch.b;
import Ch.c;
import Ch.f;
import D8.C0214w;
import N5.C;
import N5.C0489y;
import Ui.k;
import W6.e;
import We.InterfaceC0604h;
import Xb.A;
import Xb.o;
import Xb.r;
import Xb.u;
import Xb.y;
import Z8.i;
import a6.InterfaceC0632a;
import ac.C0680d;
import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ViewKt;
import b6.C0922a;
import bj.C1042m;
import cc.InterfaceC1097j;
import cc.m;
import cc.x;
import cj.C1112C;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.N;
import com.paymaya.common.utility.O;
import com.paymaya.domain.model.AccountLimitType;
import com.paymaya.domain.model.AccountLimits;
import com.paymaya.domain.model.AccountLimitsFooterItem;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.CreditTransactionItem;
import com.paymaya.domain.model.DataPrivacyProvision;
import com.paymaya.domain.model.Identity;
import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.SavingsConsent;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import com.paymaya.domain.model.User;
import com.paymaya.domain.store.H;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsFragment;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsPageFragment;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsConfirmationFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentConfirmationFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProvidersCollectionFragment;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditConsentFragment;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;
import db.InterfaceC1348a;
import eb.d;
import eb.h;
import g9.InterfaceC1507b;
import g9.InterfaceC1508c;
import g9.InterfaceC1511f;
import ga.g;
import ha.p;
import hh.InterfaceC1573f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.t;
import t4.j;
import v.AbstractC2329d;
import v5.C2342a;
import y5.s;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c, e, H, k, InterfaceC1573f, b, j, InterfaceC0604h, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5354b;

    public /* synthetic */ a(Object obj, int i) {
        this.f5353a = i;
        this.f5354b = obj;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        C2342a favoriteLimits = (C2342a) obj;
        kotlin.jvm.internal.j.g(favoriteLimits, "favoriteLimits");
        return new C1042m((List) this.f5354b, favoriteLimits, (List) obj2);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        String strP;
        Identity identityBuild;
        OngoingRegistration ongoingRegistration;
        ProductV3 targetProduct;
        ProductV3 targetProduct2;
        int i = 2;
        String strConcat = "";
        int i4 = 0;
        switch (this.f5353a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                A7.j jVar = (A7.j) this.f5354b;
                PayMayaError payMayaErrorF = jVar.f(it, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                ((BaseFragment) ((Sd.b) jVar.c.get())).n1();
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF.isNetworkError()) {
                    ((Sd.b) jVar.c.get()).getClass();
                    return;
                } else {
                    ((MayaCreditConsentFragment) ((Sd.b) jVar.c.get())).getClass();
                    return;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 16:
            case 21:
            default:
                io.reactivex.rxjava3.disposables.b it2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                MayaPayBillsSearchFragment mayaPayBillsSearchFragment = (MayaPayBillsSearchFragment) ((g) ((A7.j) this.f5354b).c.get());
                mayaPayBillsSearchFragment.getClass();
                mayaPayBillsSearchFragment.f13485h0 = it2;
                return;
            case 6:
                Pair it3 = (Pair) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                Xa.b bVar = (Xa.b) this.f5354b;
                com.paymaya.data.preference.a aVar = bVar.f6546g;
                if (aVar.e().isPartnerOnboardingEnabled() && aVar.K()) {
                    com.paymaya.data.preference.a aVar2 = bVar.h.f10429a;
                    String strP2 = aVar2.p();
                    kotlin.jvm.internal.j.f(strP2, "getMayaOnboardingPartner(...)");
                    O[] oArrValues = O.values();
                    ArrayList arrayList = new ArrayList(oArrValues.length);
                    for (O o8 : oArrValues) {
                        arrayList.add(o8.f10428a);
                    }
                    if (strP2.length() != 0 && arrayList.contains(strP2)) {
                        O[] oArr = O.f10427b;
                        if (strP2.equals("LANDERS")) {
                            N[] nArr = N.f10426a;
                            strConcat = strP2.concat("_CC_ONBOARDING");
                        } else {
                            N[] nArr2 = N.f10426a;
                            strConcat = strP2.concat("_ONBOARDING");
                        }
                    }
                    aVar2.e0(strConcat);
                    aVar2.t0(false);
                }
                Xa.b bVar2 = (Xa.b) this.f5354b;
                Object obj2 = it3.f18160a;
                kotlin.jvm.internal.j.f(obj2, "<get-first>(...)");
                List list = (List) obj2;
                Object obj3 = it3.f18161b;
                kotlin.jvm.internal.j.f(obj3, "<get-second>(...)");
                List list2 = (List) obj3;
                if (bVar2.i) {
                    strP = null;
                } else {
                    C c = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get())).f13677V;
                    kotlin.jvm.internal.j.d(c);
                    strP = jk.b.p((MayaProfileInputLayout) c.f3562k);
                }
                User.Builder builderSBuilder = User.sBuilder();
                C c10 = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get())).f13677V;
                kotlin.jvm.internal.j.d(c10);
                User.Builder builderMMiddleName = builderSBuilder.mFirstName(jk.b.p((MayaProfileInputLayout) c10.i)).mMiddleName(strP);
                C c11 = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get())).f13677V;
                kotlin.jvm.internal.j.d(c11);
                User.Builder builderMHasNoMiddleName = builderMMiddleName.mLastName(jk.b.p((MayaProfileInputLayout) c11.j)).mHasNoMiddleName(Boolean.valueOf(bVar2.i));
                C c12 = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get())).f13677V;
                kotlin.jvm.internal.j.d(c12);
                User userBuild = builderMHasNoMiddleName.mPassword(jk.b.p((MayaProfileInputLayout) c12.m)).build();
                kotlin.jvm.internal.j.f(userBuild, "build(...)");
                C c13 = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get())).f13677V;
                kotlin.jvm.internal.j.d(c13);
                if (C2576A.H(jk.b.p((MayaProfileInputLayout) c13.h))) {
                    identityBuild = null;
                } else {
                    Identity.Builder builderMType = Identity.sBuilder().mType("email");
                    C c14 = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get())).f13677V;
                    kotlin.jvm.internal.j.d(c14);
                    identityBuild = builderMType.mValue(jk.b.p((MayaProfileInputLayout) c14.h)).build();
                }
                Identity.Builder builderMType2 = Identity.sBuilder().mType("msisdn");
                C c15 = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get())).f13677V;
                kotlin.jvm.internal.j.d(c15);
                Identity identityBuild2 = builderMType2.mValue(Je.c.a(C2576A.b0(jk.b.p((MayaProfileInputLayout) c15.f3563l)).toString())).build();
                kotlin.jvm.internal.j.f(identityBuild2, "build(...)");
                MayaAccountCreationFragment mayaAccountCreationFragment = (MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get());
                mayaAccountCreationFragment.getClass();
                d dVar = mayaAccountCreationFragment.f13679X;
                if (dVar != null) {
                    MayaRegistrationV2Activity mayaRegistrationV2Activity = (MayaRegistrationV2Activity) dVar;
                    OngoingRegistration ongoingRegistration2 = mayaRegistrationV2Activity.f13667q;
                    if (ongoingRegistration2 != null) {
                        ongoingRegistration2.setRegisteringUser(userBuild);
                        ongoingRegistration2.setRegisteringEmailIdentity(identityBuild);
                        ongoingRegistration2.setRegisteringLoginIdentity(identityBuild2);
                        ongoingRegistration = ongoingRegistration2;
                    } else {
                        ongoingRegistration = null;
                    }
                    mayaRegistrationV2Activity.f13667q = ongoingRegistration;
                }
                MayaAccountCreationFragment mayaAccountCreationFragment2 = (MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get());
                mayaAccountCreationFragment2.getClass();
                h hVar = new h((Consent[]) list.toArray(new Consent[0]), (DataPrivacyProvision[]) list2.toArray(new DataPrivacyProvision[0]));
                String strP3 = AbstractC1213b.p(2);
                kotlin.jvm.internal.j.f(strP3, "tapped(...)");
                String strS = mayaAccountCreationFragment2.s();
                C c16 = mayaAccountCreationFragment2.f13677V;
                kotlin.jvm.internal.j.d(c16);
                MayaAccountCreationFragment.J1(mayaAccountCreationFragment2, strP3, strS, c16.f3560d.getText().toString(), mayaAccountCreationFragment2.G1().t0(hVar).toString());
                C c17 = mayaAccountCreationFragment2.f13677V;
                kotlin.jvm.internal.j.d(c17);
                ConstraintLayout constraintLayout = (ConstraintLayout) c17.f;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                E1.c.m(ViewKt.findNavController(constraintLayout), hVar);
                return;
            case 7:
                kotlin.jvm.internal.j.g((Ze.a) obj, "it");
                ((M7.a) this.f5354b).m();
                return;
            case 8:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                C0214w c0214w = (C0214w) this.f5354b;
                PayMayaError payMayaErrorF2 = c0214w.f(throwable, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                MayaShopPaymentConfirmationFragment mayaShopPaymentConfirmationFragment = (MayaShopPaymentConfirmationFragment) ((bc.d) c0214w.c.get());
                mayaShopPaymentConfirmationFragment.getClass();
                String strMSpiel = payMayaErrorF2.mSpiel();
                C1220i c1220iO1 = mayaShopPaymentConfirmationFragment.o1();
                FragmentActivity activity = mayaShopPaymentConfirmationFragment.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
                c1219hD.t(EnumC1217f.PURCHASE);
                c1219hD.n(12);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                PaymentConfirmationSummary paymentConfirmationSummary = mayaShopPaymentConfirmationFragment.f14024X;
                String productCode = (paymentConfirmationSummary == null || (targetProduct2 = paymentConfirmationSummary.getTargetProduct()) == null) ? null : targetProduct2.getProductCode();
                HashMap map = c1219hD.j;
                map.put("product", productCode);
                PaymentConfirmationSummary paymentConfirmationSummary2 = mayaShopPaymentConfirmationFragment.f14024X;
                map.put("provider", (paymentConfirmationSummary2 == null || (targetProduct = paymentConfirmationSummary2.getTargetProduct()) == null) ? null : targetProduct.getProvider());
                map.put(Constants.REASON, strMSpiel);
                c1219hD.i();
                c1220iO1.c(activity, c1219hD);
                InterfaceC1097j interfaceC1097j = mayaShopPaymentConfirmationFragment.f14027a0;
                if (interfaceC1097j != null) {
                    ((MayaShopV2Activity) interfaceC1097j).a(payMayaErrorF2, mayaShopPaymentConfirmationFragment.getString(R.string.maya_label_error_shop_error_title));
                    return;
                }
                return;
            case 9:
                Throwable it4 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                o oVar = (o) this.f5354b;
                PayMayaError payMayaErrorF3 = oVar.f(it4, false);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "paymayaErrorHandling(...)");
                oVar.t(Integer.valueOf(payMayaErrorF3.mErrorCode()), payMayaErrorF3.mSpiel());
                m mVar = ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).f14036s0;
                if (mVar != null) {
                    ((MayaShopV2Activity) mVar).finish();
                    return;
                }
                return;
            case 11:
                List productsList = (List) obj;
                kotlin.jvm.internal.j.g(productsList, "productsList");
                ((r) this.f5354b).k(productsList);
                return;
            case 12:
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                u uVar = (u) this.f5354b;
                PayMayaError payMayaErrorF4 = uVar.f(throwable2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                uVar.m(payMayaErrorF4);
                return;
            case 13:
                Throwable throwable3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable3, "throwable");
                y yVar = (y) this.f5354b;
                PayMayaError payMayaErrorF5 = yVar.f(throwable3, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                int iMErrorCode = payMayaErrorF5.mErrorCode();
                String strMSpiel2 = payMayaErrorF5.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel2, "mSpiel(...)");
                yVar.k(iMErrorCode, strMSpiel2);
                List listB = yVar.f6601d.c.b(new mg.c(6));
                ((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).S1(listB);
                if (!listB.isEmpty()) {
                    ((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).L1();
                    ((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).f14102r0 = true;
                    return;
                }
                if (payMayaErrorF5.isSessionTimeout()) {
                    ((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).T1(payMayaErrorF5.mSpiel());
                    return;
                }
                if (!payMayaErrorF5.isNetworkError()) {
                    ((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).T1(payMayaErrorF5.mSpiel());
                    return;
                }
                bc.j jVar2 = (bc.j) yVar.c.get();
                payMayaErrorF5.mSpiel();
                MayaShopProvidersCollectionFragment mayaShopProvidersCollectionFragment = (MayaShopProvidersCollectionFragment) jVar2;
                x xVar = mayaShopProvidersCollectionFragment.t0;
                if (xVar != null) {
                    String string = mayaShopProvidersCollectionFragment.getString(R.string.maya_label_that_didnt_load_right);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    String string2 = mayaShopProvidersCollectionFragment.getString(R.string.maya_label_connection_issue);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    ((MayaShopV2Activity) xVar).o(string, string2);
                    return;
                }
                return;
            case 14:
                ShopPurchaseHistoryBase shopPurchaseHistoryBase = (ShopPurchaseHistoryBase) obj;
                kotlin.jvm.internal.j.g(shopPurchaseHistoryBase, "shopPurchaseHistoryBase");
                ((A) this.f5354b).m(shopPurchaseHistoryBase);
                return;
            case 15:
                if (((Xe.d) this.f5354b).c.get() != null) {
                    throw new IllegalStateException("Cannot subscribe to observable query in a transaction.");
                }
                return;
            case 17:
                Z8.c cVar = (Z8.c) this.f5354b;
                PayMayaError payMayaErrorF6 = cVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                s sVar = (InterfaceC1507b) cVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF6.mSpiel());
                c1219hH.f11206k.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaErrorF6.mThrowableMessage());
                c1219hH.i();
                ((MayaBaseFragment) sVar).A1(c1219hH);
                ((MayaLoginFragment) ((InterfaceC1507b) cVar.c.get())).Q1(payMayaErrorF6);
                return;
            case 18:
                PayMayaError payMayaErrorF7 = ((Lb.a) this.f5354b).f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "mayaErrorHandling(...)");
                s sVar2 = (InterfaceC1508c) ((Lb.a) this.f5354b).c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF7.mSpiel());
                c1219hH2.f11206k.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaErrorF7.mThrowableMessage());
                ((MayaBaseFragment) sVar2).A1(c1219hH2);
                ((MayaBaseFragment) ((InterfaceC1508c) ((Lb.a) this.f5354b).c.get())).w1();
                ((Lb.a) this.f5354b).m(payMayaErrorF7);
                return;
            case 19:
                Profile profile = (Profile) obj;
                kotlin.jvm.internal.j.g(profile, "profile");
                i iVar = (i) this.f5354b;
                iVar.getClass();
                String strMProfileId = profile.mProfileId();
                String strMValue = profile.mIdentities().get(0).mValue();
                BackUpIdentity backUpIdentityMBackupIdentity = profile.mBackupIdentity();
                if (z.o(backUpIdentityMBackupIdentity != null ? backUpIdentityMBackupIdentity.mType() : null, "email", true)) {
                    kotlin.jvm.internal.j.d(backUpIdentityMBackupIdentity);
                    strConcat = backUpIdentityMBackupIdentity.mValue();
                    kotlin.jvm.internal.j.f(strConcat, "mValue(...)");
                }
                InterfaceC1511f interfaceC1511f = (InterfaceC1511f) iVar.c.get();
                kotlin.jvm.internal.j.d(strMProfileId);
                kotlin.jvm.internal.j.d(strMValue);
                interfaceC1511f.g(strMProfileId, strMValue, strConcat);
                s sVar3 = (InterfaceC1511f) iVar.c.get();
                C1219h c1219h = new C1219h();
                c1219h.n(14);
                c1219h.i();
                ((MayaBaseFragment) sVar3).A1(c1219h);
                String strMWalletId = profile.mWalletId();
                if (S5.c.b(iVar.f6918g, A5.b.f53B1)) {
                    ((InterfaceC1511f) iVar.c.get()).r0(strMWalletId, S5.c.b(iVar.f6918g, A5.b.f127p0) ? "KYC Upgrade" : "Registration Success (Bottom sheet)");
                } else {
                    ((InterfaceC1511f) iVar.c.get()).S(strMWalletId);
                }
                com.paymaya.data.preference.a aVar3 = iVar.f6917d;
                if (aVar3.e().isSavingsAutoProvisioningEnabled()) {
                    if (aVar3.f11330b.getBoolean("savings_auto_provision_opt_in", true)) {
                        androidx.camera.core.impl.a.A(aVar3.f11330b, "savings_auto_provision_opt_in_sent", false);
                        String strE = S5.c.e(iVar.f6918g, A5.g.i);
                        String str = !kotlin.jvm.internal.j.b(strE, "default") ? strE : null;
                        if (str == null) {
                            str = SavingsConsent.TC_DEF_VERSION;
                        }
                        List<SavingsConsent> listConsents = SavingsConsent.Companion.consents(str);
                        "Maya Savings Terms and conditions: ".concat(str);
                        yk.a.a();
                        iVar.e(new Hh.f(iVar.f.f11346b.submitSavingsConsent(listConsents).f(Th.e.c), zh.b.a(), i4).a(new Z8.h(iVar, i)).c());
                    } else {
                        iVar.h.a();
                    }
                }
                if (!S5.c.b(iVar.f6918g, A5.b.f127p0)) {
                    ((InterfaceC1511f) iVar.c.get()).x();
                    return;
                } else {
                    iVar.h.a();
                    ((InterfaceC1511f) iVar.c.get()).J0();
                    return;
                }
            case 20:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                Zd.d dVar2 = (Zd.d) this.f5354b;
                if (permission.f6934b) {
                    ((MLKitQRScannerFragment) ((ce.c) dVar2.c.get())).r1();
                    return;
                } else {
                    dVar2.getClass();
                    return;
                }
            case 22:
                AccountLimits p02 = (AccountLimits) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                C0922a c0922a = (C0922a) this.f5354b;
                c0922a.getClass();
                s sVar4 = (e6.a) c0922a.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(14);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put("attribution", ((MayaBaseFragment) ((e6.a) c0922a.c.get())).n1().f10371a);
                ((MayaBaseFragment) sVar4).A1(c1219hH3);
                ((MayaAccountLimitsFragment) ((e6.a) c0922a.c.get())).K1();
                MayaAccountLimitsFragment mayaAccountLimitsFragment = (MayaAccountLimitsFragment) ((e6.a) c0922a.c.get());
                mayaAccountLimitsFragment.getClass();
                C0680d c0680d = mayaAccountLimitsFragment.f11519f0;
                List<MayaAccountLimitsPageFragment> list3 = c0680d != null ? c0680d.c : null;
                if (list3 != null) {
                    for (MayaAccountLimitsPageFragment mayaAccountLimitsPageFragment : list3) {
                        mayaAccountLimitsPageFragment.getClass();
                        InterfaceC0632a interfaceC0632aG1 = mayaAccountLimitsPageFragment.G1();
                        String str2 = mayaAccountLimitsPageFragment.f11525Z;
                        b6.b bVar3 = (b6.b) interfaceC0632aG1;
                        ArrayList arrayList2 = new ArrayList();
                        if (kotlin.jvm.internal.j.b(str2, "Daily")) {
                            List<AccountLimitType> listMAccountLimitTypesDaily = p02.mAccountLimitTypesDaily();
                            kotlin.jvm.internal.j.f(listMAccountLimitTypesDaily, "mAccountLimitTypesDaily(...)");
                            arrayList2.addAll(listMAccountLimitTypesDaily);
                            AccountLimitsFooterItem accountLimitsFooterItemBuild = AccountLimitsFooterItem.sBuilder().mHeaderType(0).build();
                            kotlin.jvm.internal.j.f(accountLimitsFooterItemBuild, "build(...)");
                            arrayList2.add(accountLimitsFooterItemBuild);
                        } else if (kotlin.jvm.internal.j.b(str2, "Monthly")) {
                            List<AccountLimitType> listMAccountLimitTypesMonthly = p02.mAccountLimitTypesMonthly();
                            kotlin.jvm.internal.j.f(listMAccountLimitTypesMonthly, "mAccountLimitTypesMonthly(...)");
                            arrayList2.addAll(listMAccountLimitTypesMonthly);
                            AccountLimitsFooterItem accountLimitsFooterItemBuild2 = AccountLimitsFooterItem.sBuilder().mHeaderType(1).build();
                            kotlin.jvm.internal.j.f(accountLimitsFooterItemBuild2, "build(...)");
                            arrayList2.add(accountLimitsFooterItemBuild2);
                        }
                        ((MayaAccountLimitsPageFragment) ((e6.b) bVar3.c.get())).H1(arrayList2);
                    }
                }
                C0489y c0489y = ((MayaAccountLimitsFragment) ((e6.a) c0922a.c.get())).f11513Z;
                if (c0489y == null) {
                    kotlin.jvm.internal.j.n("mViewAccountLimitsError");
                    throw null;
                }
                c0489y.f4296b.setVisibility(8);
                c0922a.f = false;
                return;
            case 23:
                BillerTransaction billerTransaction = (BillerTransaction) obj;
                kotlin.jvm.internal.j.g(billerTransaction, "billerTransaction");
                ba.u uVar2 = (ba.u) this.f5354b;
                uVar2.getClass();
                BillerTransaction billerTransactionK = uVar2.k(billerTransaction);
                MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment = (MayaPayBillsConfirmationFragment) ((ga.d) uVar2.c.get());
                mayaPayBillsConfirmationFragment.getClass();
                p pVar = mayaPayBillsConfirmationFragment.f13411e0;
                if (pVar != null) {
                    ((MayaPayBillsActivity) pVar).g2(billerTransactionK, mayaPayBillsConfirmationFragment.I1());
                    return;
                }
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Xe.b query = (Xe.b) obj;
        kotlin.jvm.internal.j.g(query, "query");
        Cursor cursorA = query.a();
        kotlin.jvm.internal.j.d(cursorA);
        ((com.paymaya.data.database.repository.m) this.f5354b).getClass();
        if (!cursorA.moveToFirst()) {
            cursorA.close();
            return C1112C.f9377a;
        }
        ArrayList arrayList = new ArrayList(cursorA.getCount());
        int columnIndex = cursorA.getColumnIndex("accountId");
        int columnIndex2 = cursorA.getColumnIndex("transactionId");
        int columnIndex3 = cursorA.getColumnIndex("transactionReference");
        int columnIndex4 = cursorA.getColumnIndex("totalAmount");
        int columnIndex5 = cursorA.getColumnIndex("currency");
        int columnIndex6 = cursorA.getColumnIndex("transactionType");
        int columnIndex7 = cursorA.getColumnIndex("action");
        int columnIndex8 = cursorA.getColumnIndex(TypedValues.AttributesType.S_TARGET);
        int columnIndex9 = cursorA.getColumnIndex("dateTime");
        do {
            String string = cursorA.getString(columnIndex);
            String string2 = cursorA.getString(columnIndex2);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            arrayList.add(new CreditTransactionItem(string, string2, cursorA.getString(columnIndex3), cursorA.getString(columnIndex4), cursorA.getString(columnIndex5), cursorA.getString(columnIndex6), cursorA.getString(columnIndex7), cursorA.getString(columnIndex8), cursorA.getString(columnIndex9)));
        } while (cursorA.moveToNext());
        cursorA.close();
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.j.d(listUnmodifiableList);
        return listUnmodifiableList;
    }

    public void b(byte[] bArr, int i, int i4, int i6, int i10) throws ChecksumException {
        int i11 = i4 + i6;
        int i12 = i10 == 0 ? 1 : 2;
        int[] iArr = new int[i11 / i12];
        for (int i13 = 0; i13 < i11; i13++) {
            if (i10 == 0 || i13 % 2 == i10 - 1) {
                iArr[i13 / i12] = bArr[i13 + i] & 255;
            }
        }
        try {
            ((G6.r) this.f5354b).e(i6 / i12, iArr);
            for (int i14 = 0; i14 < i4; i14++) {
                if (i10 == 0 || i14 % 2 == i10 - 1) {
                    bArr[i14 + i] = (byte) iArr[i14 / i12];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    @Override // Ui.k
    public boolean c(Object obj, HashMap map, U8.c cVar) {
        Wi.a aVarA;
        Wi.a aVar = (Wi.a) this.f5354b;
        if (aVar == null || !(obj instanceof String) || (aVarA = Wi.a.a((String) obj)) == null) {
            return false;
        }
        boolean z4 = aVarA.b(aVar) >= 0;
        Ri.a.d(aVarA.f6451g + " >= " + aVar.f6451g + " | Result: " + z4);
        return z4;
    }

    @Override // t4.j
    public void i() {
    }

    @Override // W6.e
    public void onDismiss() {
        AbstractC1236z.b((MayaSessionExpiredActivity) this.f5354b);
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception e) {
        kotlin.jvm.internal.j.g(e, "e");
        MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = (MayaShopProviderProductsListFragment) this.f5354b;
        ShapeableImageView shapeableImageView = mayaShopProviderProductsListFragment.f14075r0;
        if (shapeableImageView == null) {
            kotlin.jvm.internal.j.n("mBannerImageView");
            throw null;
        }
        shapeableImageView.setVisibility(8);
        mayaShopProviderProductsListFragment.R1();
    }

    @Override // t4.j
    public void onRefresh() {
        MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) this.f5354b;
        ((Xb.f) mayaShopHomePageFragment.R1()).n();
        LottieAnimationView lottieAnimationView = mayaShopHomePageFragment.f14008s0;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        } else {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
    }

    @Override // com.paymaya.domain.store.H
    public void onSuccess() {
        switch (this.f5353a) {
            case 3:
                ((t) this.f5354b).success("1000");
                return;
            default:
                MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = (MayaShopProviderProductsListFragment) this.f5354b;
                ShapeableImageView shapeableImageView = mayaShopProviderProductsListFragment.f14075r0;
                if (shapeableImageView == null) {
                    kotlin.jvm.internal.j.n("mBannerImageView");
                    throw null;
                }
                shapeableImageView.setVisibility(0);
                mayaShopProviderProductsListFragment.R1();
                return;
        }
    }

    public a(String str) {
        this.f5353a = 5;
        this.f5354b = Wi.a.a(str);
    }

    public a(int i) {
        this.f5353a = i;
        switch (i) {
            case 4:
                this.f5354b = new ConcurrentHashMap(16);
                break;
            case 28:
                break;
            default:
                this.f5354b = new G6.r(M3.a.f3052o, 19);
                break;
        }
    }

    @Override // com.paymaya.domain.store.H, Ah.q, Ah.b
    public void onError(Throwable th2) {
        ((t) this.f5354b).error("1001", th2.getMessage(), null);
    }
}
