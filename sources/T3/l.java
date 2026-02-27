package T3;

import Kh.T;
import N5.x1;
import We.O;
import Xb.A;
import Xb.B;
import Xb.p;
import Xb.r;
import Xb.u;
import ac.w;
import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import b3.W;
import b3.e0;
import ba.s;
import bg.AbstractC0983W;
import c8.InterfaceC1083a;
import cc.D;
import cc.ViewOnClickListenerC1093f;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.data.database.repository.q;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FinancialDocument;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.domain.store.E;
import com.paymaya.domain.store.U;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaAddFavoriteActivity;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaAddFavoriteFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginOTPFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsReceiptFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageProductsListFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryReceiptFragment;
import com.paymaya.ui.qr.view.fragment.impl.MLKitBarcodeScannerFragment;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import d3.InterfaceC1330b;
import d8.InterfaceC1337b;
import dOYHB6.yFtIp6.svM7M6;
import db.InterfaceC1349b;
import dc.C1354e;
import defpackage.AbstractC1414e;
import g9.InterfaceC1508c;
import g9.InterfaceC1511f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import v.AbstractC2329d;
import v5.C2342a;
import zj.z;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements C3.n, U0.a, OnSuccessListener, OnFailureListener, OnCanceledListener, Ch.c, Ch.e, InterfaceC1330b, Ch.d, W6.e, t4.j, com.google.gson.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5786b;

    public /* synthetic */ l(int i, boolean z4) {
        this.f5785a = i;
    }

    private final void d() {
    }

    private final void f() {
    }

    @Override // U0.a
    public PdfDocument a(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.i(str, (byte[]) this.f5786b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ch.c
    public void accept(Object obj) {
        ArrayList arrayList;
        String strMValue;
        final int i = 2;
        int i4 = 7;
        final int i6 = 0;
        final int i10 = 1;
        switch (this.f5785a) {
            case 5:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                Lb.a aVar = (Lb.a) this.f5786b;
                PayMayaError payMayaErrorF = aVar.f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                if (payMayaErrorF.mErrorCode() == -12) {
                    MayaAccountProvisionFragment mayaAccountProvisionFragment = (MayaAccountProvisionFragment) ((InterfaceC1349b) aVar.c.get());
                    mayaAccountProvisionFragment.getClass();
                    mayaAccountProvisionFragment.L1(payMayaErrorF);
                    eb.l lVar = mayaAccountProvisionFragment.f13684X;
                    if (lVar != null) {
                        eb.k kVar = new eb.k(mayaAccountProvisionFragment, payMayaErrorF, i6);
                        eb.k kVar2 = new eb.k(mayaAccountProvisionFragment, payMayaErrorF, i10);
                        MayaRegistrationV2Activity mayaRegistrationV2Activity = (MayaRegistrationV2Activity) lVar;
                        String strMSpiel = payMayaErrorF.mSpiel();
                        PayMayaErrorAction payMayaErrorActionMAction = payMayaErrorF.mAction();
                        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, strMSpiel, payMayaErrorActionMAction != null ? payMayaErrorActionMAction.mTitle() : null, null, false, null, null, false, 499);
                        mayaErrorDialogFragmentZ.f11852e0 = new N9.g(mayaErrorDialogFragmentZ, payMayaErrorF, kVar, i10);
                        mayaErrorDialogFragmentZ.f11851d0 = new Y.e(i4, kVar2, mayaErrorDialogFragmentZ);
                        FragmentManager supportFragmentManager = mayaRegistrationV2Activity.getSupportFragmentManager();
                        kotlin.jvm.internal.j.f(supportFragmentManager, "getSupportFragmentManager(...)");
                        AbstractC0983W.D(mayaErrorDialogFragmentZ, supportFragmentManager, "error_dialog");
                    }
                } else {
                    MayaAccountProvisionFragment mayaAccountProvisionFragment2 = (MayaAccountProvisionFragment) ((InterfaceC1349b) aVar.c.get());
                    mayaAccountProvisionFragment2.getClass();
                    mayaAccountProvisionFragment2.L1(payMayaErrorF);
                    eb.l lVar2 = mayaAccountProvisionFragment2.f13684X;
                    if (lVar2 != null) {
                        mayaAccountProvisionFragment2.getString(R.string.maya_label_that_didnt_load_right);
                        eb.k kVar3 = new eb.k(mayaAccountProvisionFragment2, payMayaErrorF, i);
                        MayaErrorDialogFragment mayaErrorDialogFragmentZ2 = M2.b.Z(0, null, null, null, null, false, payMayaErrorF, null, false, 447);
                        mayaErrorDialogFragmentZ2.f11851d0 = new ab.e(kVar3, mayaErrorDialogFragmentZ2, i10);
                        FragmentManager supportFragmentManager2 = ((MayaRegistrationV2Activity) lVar2).getSupportFragmentManager();
                        kotlin.jvm.internal.j.f(supportFragmentManager2, "getSupportFragmentManager(...)");
                        AbstractC0983W.D(mayaErrorDialogFragmentZ2, supportFragmentManager2, "error_dialog");
                    }
                }
                break;
            case 6:
            case 7:
            case 11:
            case 19:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                List<FinancialDocument> FinancialDocuments = (List) obj;
                kotlin.jvm.internal.j.g(FinancialDocuments, "FinancialDocuments");
                U u3 = (U) this.f5786b;
                u3.f11394b.f11318a.f2812a.b("financial_document", null, null);
                q qVar = u3.f11394b;
                qVar.getClass();
                ArrayList arrayList2 = new ArrayList(FinancialDocuments.size());
                for (FinancialDocument financialDocument : FinancialDocuments) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(SessionDescription.ATTR_TYPE, financialDocument.getType());
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, financialDocument.getName());
                    arrayList2.add(contentValues);
                }
                List listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                kotlin.jvm.internal.j.f(listUnmodifiableList, "unmodifiableList(...)");
                qVar.f11318a.a("financial_document", listUnmodifiableList);
                break;
            case 8:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                Xb.h hVar = (Xb.h) this.f5786b;
                PayMayaError payMayaErrorF2 = hVar.f(it2, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                w wVar = ((MayaShopPageFragment) ((bc.c) hVar.c.get())).f14017s0;
                if (wVar == null || (arrayList = wVar.c) == null || !arrayList.isEmpty()) {
                    ((MayaShopPageFragment) ((bc.c) hVar.c.get())).L1();
                } else if (payMayaErrorF2.isSessionTimeout()) {
                    final MayaShopPageFragment mayaShopPageFragment = (MayaShopPageFragment) ((bc.c) hVar.c.get());
                    mayaShopPageFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaShopPageFragment, 200, null, null, new View.OnClickListener() { // from class: cc.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i6) {
                                case 0:
                                    MayaShopPageFragment mayaShopPageFragment2 = mayaShopPageFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaShopPageFragment2.O1();
                                        mayaShopPageFragment2.Q1().k();
                                        return;
                                    } finally {
                                    }
                                case 1:
                                    MayaShopPageFragment mayaShopPageFragment3 = mayaShopPageFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaShopPageFragment3.Q1().k();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaShopPageFragment mayaShopPageFragment4 = mayaShopPageFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaShopPageFragment4.Q1().k();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                } else if (payMayaErrorF2.isNetworkError()) {
                    final MayaShopPageFragment mayaShopPageFragment2 = (MayaShopPageFragment) ((bc.c) hVar.c.get());
                    mayaShopPageFragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaShopPageFragment2, 100, null, null, new View.OnClickListener() { // from class: cc.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i) {
                                case 0:
                                    MayaShopPageFragment mayaShopPageFragment22 = mayaShopPageFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaShopPageFragment22.O1();
                                        mayaShopPageFragment22.Q1().k();
                                        return;
                                    } finally {
                                    }
                                case 1:
                                    MayaShopPageFragment mayaShopPageFragment3 = mayaShopPageFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaShopPageFragment3.Q1().k();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaShopPageFragment mayaShopPageFragment4 = mayaShopPageFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaShopPageFragment4.Q1().k();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                } else {
                    bc.c cVar = (bc.c) hVar.c.get();
                    String strMSpiel2 = payMayaErrorF2.mSpiel();
                    kotlin.jvm.internal.j.f(strMSpiel2, "mSpiel(...)");
                    final MayaShopPageFragment mayaShopPageFragment3 = (MayaShopPageFragment) cVar;
                    mayaShopPageFragment3.getClass();
                    MayaBaseLoadingFragment.N1(mayaShopPageFragment3, 200, strMSpiel2, null, new View.OnClickListener() { // from class: cc.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    MayaShopPageFragment mayaShopPageFragment22 = mayaShopPageFragment3;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaShopPageFragment22.O1();
                                        mayaShopPageFragment22.Q1().k();
                                        return;
                                    } finally {
                                    }
                                case 1:
                                    MayaShopPageFragment mayaShopPageFragment32 = mayaShopPageFragment3;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaShopPageFragment32.Q1().k();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaShopPageFragment mayaShopPageFragment4 = mayaShopPageFragment3;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaShopPageFragment4.Q1().k();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 28);
                }
                break;
            case 9:
                kotlin.jvm.internal.j.g((List) obj, "it");
                ((MayaShopProviderPageProductsListFragment) ((bc.g) ((r) this.f5786b).c.get())).f14061v0++;
                break;
            case 10:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                u uVar = (u) this.f5786b;
                PayMayaError payMayaErrorF3 = uVar.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                uVar.m(payMayaErrorF3);
                break;
            case 12:
                ShopPurchaseHistoryBase shopPurchaseHistoryBase = (ShopPurchaseHistoryBase) obj;
                kotlin.jvm.internal.j.g(shopPurchaseHistoryBase, "shopPurchaseHistoryBase");
                ((A) this.f5786b).m(shopPurchaseHistoryBase);
                break;
            case 13:
                B b8 = (B) this.f5786b;
                PayMayaError payMayaErrorF4 = b8.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "paymayaErrorHandling(...)");
                ((MayaBaseFragment) ((bc.m) b8.c.get())).w1();
                if (!payMayaErrorF4.isSessionTimeout()) {
                    MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment = (MayaShopPurchaseHistoryReceiptFragment) ((bc.m) b8.c.get());
                    mayaShopPurchaseHistoryReceiptFragment.getClass();
                    D d10 = mayaShopPurchaseHistoryReceiptFragment.R0;
                    if (d10 != null) {
                        String string = mayaShopPurchaseHistoryReceiptFragment.getString(R.string.pma_toast_error_title_shop_error);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        String strMSpiel3 = payMayaErrorF4.mSpiel();
                        kotlin.jvm.internal.j.f(strMSpiel3, "mSpiel(...)");
                        ((MayaShopV2Activity) d10).o(string, strMSpiel3);
                    }
                }
                break;
            case 14:
                Y7.b bVar = (Y7.b) this.f5786b;
                PayMayaError payMayaErrorF5 = bVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "mayaErrorHandling(...)");
                InterfaceC1083a interfaceC1083a = (InterfaceC1083a) bVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.ADD);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("screen", Y7.b.k(bVar.f));
                c1219hH.j.put(Constants.REASON, payMayaErrorF5.mSpiel());
                c1219hH.i();
                ((MayaBaseFragment) interfaceC1083a).A1(c1219hH);
                if (!payMayaErrorF5.isSessionTimeout()) {
                    MayaAddFavoriteFragment mayaAddFavoriteFragment = (MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get());
                    mayaAddFavoriteFragment.getClass();
                    InterfaceC1337b interfaceC1337b = mayaAddFavoriteFragment.f12333g0;
                    if (interfaceC1337b != null) {
                        MayaAddFavoriteActivity mayaAddFavoriteActivity = (MayaAddFavoriteActivity) interfaceC1337b;
                        if (mayaAddFavoriteActivity.getIntent().getBooleanExtra("is_result", false)) {
                            mayaAddFavoriteActivity.setResult(7);
                        }
                        M2.b.Z(0, null, null, null, null, false, payMayaErrorF5, null, false, 447).show(mayaAddFavoriteActivity.getSupportFragmentManager(), "error_dialog");
                    }
                }
                break;
            case 15:
                Y7.f fVar = (Y7.f) this.f5786b;
                PayMayaError payMayaErrorF6 = fVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                fVar.m(payMayaErrorF6);
                break;
            case 16:
                Profile profile = (Profile) obj;
                kotlin.jvm.internal.j.g(profile, "profile");
                com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) ((Lb.a) this.f5786b).f;
                if (aVar2.e().isPartnerOnboardingEnabled() && aVar2.K()) {
                    String strP = aVar2.p();
                    kotlin.jvm.internal.j.f(strP, "getMayaOnboardingPartner(...)");
                    C.s0(aVar2, strP, false);
                }
                Lb.a aVar3 = (Lb.a) this.f5786b;
                aVar3.getClass();
                String strMProfileId = profile.mProfileId();
                String strMValue2 = profile.mIdentities().get(0).mValue();
                BackUpIdentity backUpIdentityMBackupIdentity = profile.mBackupIdentity();
                if (backUpIdentityMBackupIdentity == null || !z.o(backUpIdentityMBackupIdentity.mType(), "email", true)) {
                    strMValue = "";
                } else {
                    BackUpIdentity backUpIdentityMBackupIdentity2 = profile.mBackupIdentity();
                    kotlin.jvm.internal.j.d(backUpIdentityMBackupIdentity2);
                    strMValue = backUpIdentityMBackupIdentity2.mValue();
                    kotlin.jvm.internal.j.f(strMValue, "mValue(...)");
                }
                InterfaceC1508c interfaceC1508c = (InterfaceC1508c) aVar3.c.get();
                kotlin.jvm.internal.j.d(strMProfileId);
                kotlin.jvm.internal.j.d(strMValue2);
                ((MayaLoginOTPFragment) interfaceC1508c).o1().a(strMProfileId, strMValue2, strMValue);
                InterfaceC1508c interfaceC1508c2 = (InterfaceC1508c) aVar3.c.get();
                C1219h c1219h = new C1219h();
                c1219h.n(14);
                c1219h.i();
                ((MayaBaseFragment) interfaceC1508c2).A1(c1219h);
                InterfaceC1508c interfaceC1508c3 = (InterfaceC1508c) aVar3.c.get();
                String strMId = profile.mAccountType().mId();
                MayaLoginOTPFragment mayaLoginOTPFragment = (MayaLoginOTPFragment) interfaceC1508c3;
                mayaLoginOTPFragment.o1();
                Context context = mayaLoginOTPFragment.getContext();
                if (!C.e(strMId)) {
                    FirebaseAnalytics.getInstance(context).f9742a.zzk(null, "account_type", strMId, false);
                }
                if (!"not_accepted".equalsIgnoreCase(svM7M6.getString(((com.paymaya.data.preference.a) aVar3.f).f11330b, "key_privacy_policy_status", ""))) {
                    h9.k kVar4 = ((MayaLoginOTPFragment) ((InterfaceC1508c) aVar3.c.get())).f12790k0;
                    if (kVar4 != null) {
                        kVar4.M0();
                    }
                } else if (S5.c.b((S5.c) aVar3.h, A5.b.f83V0)) {
                    h9.k kVar5 = ((MayaLoginOTPFragment) ((InterfaceC1508c) aVar3.c.get())).f12790k0;
                    if (kVar5 != null) {
                        kVar5.J();
                    }
                } else {
                    h9.k kVar6 = ((MayaLoginOTPFragment) ((InterfaceC1508c) aVar3.c.get())).f12790k0;
                    if (kVar6 != null) {
                        kVar6.p();
                    }
                }
                break;
            case 17:
                Z8.i iVar = (Z8.i) this.f5786b;
                PayMayaError payMayaErrorF7 = iVar.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF7, "paymayaErrorHandling(...)");
                ((InterfaceC1511f) iVar.c.get()).i0(payMayaErrorF7);
                break;
            case 18:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                Q6.l lVar3 = (Q6.l) this.f5786b;
                if (permission.f6934b) {
                    ((MLKitBarcodeScannerFragment) ((ce.b) lVar3.c.get())).r1();
                } else {
                    lVar3.getClass();
                }
                break;
            case 20:
                io.reactivex.rxjava3.disposables.b it3 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                ((ba.o) this.f5786b).e(it3);
                break;
            case 22:
                io.reactivex.rxjava3.disposables.b it4 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                ((ba.u) this.f5786b).e(it4);
                break;
            case 23:
                kotlin.jvm.internal.j.g((Throwable) obj, "it");
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = (MayaPayBillsReceiptFragment) ((ga.f) ((ba.D) this.f5786b).c.get());
                FragmentActivity fragmentActivityRequireActivity = mayaPayBillsReceiptFragment.requireActivity();
                x1 x1Var = mayaPayBillsReceiptFragment.f13469v0;
                kotlin.jvm.internal.j.d(x1Var);
                ConstraintLayout constraintLayout = x1Var.f4276a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                b0.e(fragmentActivityRequireActivity, constraintLayout, null, R.string.maya_label_update_favorite_error, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 852);
                break;
            case 28:
                List<Decoration> decorations = (List) obj;
                kotlin.jvm.internal.j.g(decorations, "decorations");
                E e = (E) this.f5786b;
                e.c.f11316a.b("decoration", null, null);
                com.paymaya.data.database.repository.n nVar = e.c;
                nVar.getClass();
                ArrayList arrayList3 = new ArrayList(decorations.size());
                for (Decoration decoration : decorations) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(MPDbAdapter.KEY_CREATED_AT, decoration.getMCreatedAt());
                    contentValues2.put("updated_at", decoration.getMUpdatedAt());
                    contentValues2.put(TtmlNode.ATTR_ID, decoration.getMId());
                    contentValues2.put("category", decoration.getMCategory());
                    contentValues2.put("label", decoration.getMLabel());
                    contentValues2.put("description", decoration.getMDescription());
                    contentValues2.put("iconUrl", decoration.getMIconUrl());
                    contentValues2.put("imageUrl", decoration.getMImageUrl());
                    Integer mPriority = decoration.getMPriority();
                    contentValues2.put("priority", Integer.valueOf(mPriority != null ? mPriority.intValue() : Integer.MAX_VALUE));
                    contentValues2.put("hidden", Integer.valueOf(decoration.getMHidden() ? 1 : 0));
                    arrayList3.add(contentValues2);
                }
                List listUnmodifiableList2 = Collections.unmodifiableList(arrayList3);
                kotlin.jvm.internal.j.f(listUnmodifiableList2, "unmodifiableList(...)");
                nVar.f11316a.c("decoration", listUnmodifiableList2);
                break;
        }
    }

    @Override // Ch.d
    public Object b(Object obj, Object obj2, Object obj3) {
        BillerDetails billerDetails = (BillerDetails) obj;
        List formSeriesList = (List) obj2;
        C2342a favoriteDetailsOptionals = (C2342a) obj3;
        kotlin.jvm.internal.j.g(billerDetails, "billerDetails");
        kotlin.jvm.internal.j.g(formSeriesList, "formSeriesList");
        kotlin.jvm.internal.j.g(favoriteDetailsOptionals, "favoriteDetailsOptionals");
        s sVar = (s) this.f5786b;
        sVar.getClass();
        sVar.f8607n = (FavoriteDetails) favoriteDetailsOptionals.f20476a;
        return new Pair(billerDetails, formSeriesList);
    }

    @Override // Ch.e
    public Unit c(Object obj, Object obj2, Object obj3, Object obj4) throws Exception {
        List<ShopProvider> data;
        List<ShopProvider> data2;
        List<ProductV3> records;
        int i = 1;
        int i4 = 0;
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        Pair pair3 = (Pair) obj3;
        Pair pair4 = (Pair) obj4;
        kotlin.jvm.internal.j.g(pair, "<destruct>");
        kotlin.jvm.internal.j.g(pair2, "<destruct>");
        kotlin.jvm.internal.j.g(pair3, "<destruct>");
        kotlin.jvm.internal.j.g(pair4, "<destruct>");
        Throwable th2 = (Throwable) pair.f18161b;
        ProductV3Base productV3Base = (ProductV3Base) pair2.f18160a;
        Throwable th3 = (Throwable) pair2.f18161b;
        ShopProviderBase shopProviderBase = (ShopProviderBase) pair3.f18160a;
        Throwable th4 = (Throwable) pair3.f18161b;
        ShopProviderBase shopProviderBase2 = (ShopProviderBase) pair4.f18160a;
        Throwable th5 = (Throwable) pair4.f18161b;
        Xb.f fVar = (Xb.f) this.f5786b;
        Throwable[] thArr = {th2, th3, th4, th5};
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < 4; i6++) {
            Throwable th6 = thArr[i6];
            if (th6 != null) {
                PayMayaError payMayaErrorF = fVar.f(th6, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                if (payMayaErrorF.isSessionTimeout()) {
                    throw new Exception(th6);
                }
                arrayList.add(payMayaErrorF);
            }
        }
        if ((productV3Base == null || (records = productV3Base.getRecords()) == null || records.isEmpty()) && ((shopProviderBase == null || (data2 = shopProviderBase.getData()) == null || data2.isEmpty()) && (shopProviderBase2 == null || (data = shopProviderBase2.getData()) == null || data.isEmpty()))) {
            Xb.f fVar2 = (Xb.f) this.f5786b;
            fVar2.getClass();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) ((bc.b) fVar2.c.get());
                    mayaShopHomePageFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaShopHomePageFragment, 200, null, null, new ViewOnClickListenerC1093f(mayaShopHomePageFragment, i), 30);
                    break;
                }
                PayMayaError payMayaError = (PayMayaError) it.next();
                int iMErrorCode = payMayaError.mErrorCode();
                String strMSpiel = payMayaError.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                fVar2.o(iMErrorCode, strMSpiel);
                if (payMayaError.isNetworkError()) {
                    MayaShopHomePageFragment mayaShopHomePageFragment2 = (MayaShopHomePageFragment) ((bc.b) fVar2.c.get());
                    mayaShopHomePageFragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaShopHomePageFragment2, 100, null, null, new ViewOnClickListenerC1093f(mayaShopHomePageFragment2, i4), 30);
                    break;
                }
            }
        }
        return Unit.f18162a;
    }

    @Override // C3.n
    public K3.b e(String str, C3.a aVar, int i, int i4, HashMap map) {
        if (aVar == C3.a.f696o) {
            return ((g) this.f5786b).e(AbstractC1414e.h("0", str), C3.a.h, i, i4, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got " + aVar);
    }

    public String g(String str) {
        File file = new File((File) this.f5786b, str);
        if (!file.exists()) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(line);
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        return new W((e0) ((d3.d) this.f5786b).get());
    }

    public void h(String str) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File((File) this.f5786b, "glimpse_analytics.log"), true);
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();
    }

    @Override // t4.j
    public void i() {
        int i = this.f5785a;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.f5786b).countDown();
    }

    @Override // W6.e
    public void onDismiss() {
        AbstractC1236z.b((MayaLoginActivity) this.f5786b);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f5786b).countDown();
    }

    @Override // t4.j
    public void onRefresh() {
        switch (this.f5785a) {
            case 25:
                r rVar = (r) ((MayaShopProviderPageProductsListFragment) this.f5786b).P1();
                if (((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).u0) {
                    SpringView springView = ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).f14059r0;
                    if (springView == null) {
                        kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                        throw null;
                    }
                    springView.i();
                } else {
                    ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).u0 = true;
                    ShopProviderSubcategory shopProviderSubcategory = ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).f14063z0;
                    if (shopProviderSubcategory != null) {
                        C1285t0 c1285t0 = rVar.f6590d;
                        String providerName = shopProviderSubcategory.getProviderName();
                        if (providerName == null) {
                            providerName = "";
                        }
                        String code = shopProviderSubcategory.getCode();
                        new T(5, new Lh.d(new Lh.d(new Lh.h(c1285t0.b(providerName, 1, code != null ? code : "", true), zh.b.a(), 0), new Q6.s(rVar, 12), 2), new Xb.q(rVar, 1), 0), new p(rVar, 1)).e();
                    } else {
                        ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).u0 = false;
                        SpringView springView2 = ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).f14059r0;
                        if (springView2 == null) {
                            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                            throw null;
                        }
                        springView2.i();
                    }
                }
                LottieAnimationView lottieAnimationView = ((MayaShopProviderPageProductsListFragment) this.f5786b).t0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
            default:
                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = (MayaShopPurchaseHistoryPageFragment) this.f5786b;
                mayaShopPurchaseHistoryPageFragment.Q1().k();
                LottieAnimationView lottieAnimationView2 = mayaShopPurchaseHistoryPageFragment.f14116x0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f5786b).countDown();
    }

    public /* synthetic */ l(Object obj, int i) {
        this.f5785a = i;
        this.f5786b = obj;
    }

    public l(C1354e mShopV3ErrorRefreshCardViewHolder) {
        this.f5785a = 6;
        kotlin.jvm.internal.j.g(mShopV3ErrorRefreshCardViewHolder, "mShopV3ErrorRefreshCardViewHolder");
        this.f5786b = mShopV3ErrorRefreshCardViewHolder;
    }

    public l(Context context) {
        this.f5785a = 3;
        int i = 0;
        StringBuilder sb2 = O.f6375a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f5786b = new We.p((int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7), i);
    }

    public l(int i) {
        this.f5785a = i;
        switch (i) {
            case 4:
                this.f5786b = new CountDownLatch(1);
                break;
            default:
                this.f5786b = new g(0);
                break;
        }
    }
}
