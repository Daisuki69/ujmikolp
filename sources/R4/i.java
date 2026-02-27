package R4;

import Kh.T;
import N5.E;
import Q6.n;
import We.InterfaceC0604h;
import Xb.B;
import Xb.r;
import Xb.x;
import Xb.y;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.Navigation;
import b3.C0869I;
import b3.U;
import ba.o;
import ba.s;
import ba.u;
import ca.InterfaceC1085a;
import cc.D;
import ce.InterfaceC1098a;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.imageview.ShapeableImageView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.ComplianceApi;
import com.paymaya.data.api.KycCmsAddressApi;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.CustomerAccount;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Registration;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopPurchaseOfficialReceipt;
import com.paymaya.domain.store.C;
import com.paymaya.mayaui.common.view.dialog.impl.MayaShareSaveDialogFragment;
import com.paymaya.mayaui.kyczoloz.utils.ComplianceRequest;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsConfirmationFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProvidersCollectionFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryReceiptFragment;
import com.paymaya.ui.qr.view.fragment.impl.BarcodeScannerFragment;
import d3.InterfaceC1330b;
import db.InterfaceC1349b;
import dc.C1353d;
import ha.p;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.split.android.client.dtos.Split;
import io.split.android.client.dtos.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import pg.k;
import pg.l;
import pg.m;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements OnSuccessListener, m, Ch.c, InterfaceC1330b, W6.e, InterfaceC0604h, t4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5470b;

    public /* synthetic */ i() {
        this.f5469a = 23;
    }

    public Lh.h a(String str) {
        return ((KycCmsAddressApi) this.f5470b).getCities(-1, str, "name,cities.name").h(Th.e.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ch.c
    public void accept(Object obj) {
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment;
        ha.m mVar;
        MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment;
        p pVar;
        switch (this.f5469a) {
            case 4:
                Ze.a it = (Ze.a) obj;
                kotlin.jvm.internal.j.g(it, "it");
                Q6.p pVar2 = (Q6.p) ((MayaShareSaveDialogFragment) this.f5470b).t1();
                if (!it.f6934b) {
                    MayaShareSaveDialogFragment mayaShareSaveDialogFragment = (MayaShareSaveDialogFragment) ((V6.f) pVar2.c.get());
                    Toast.makeText(mayaShareSaveDialogFragment.getActivity(), mayaShareSaveDialogFragment.getString(R.string.pma_label_image_not_saved), 0).show();
                    ((V6.f) pVar2.c.get()).dismiss();
                } else {
                    String strS1 = ((MayaShareSaveDialogFragment) ((V6.f) pVar2.c.get())).s1();
                    if (strS1 != null) {
                        ((MayaShareSaveDialogFragment) ((V6.f) pVar2.c.get())).u1(strS1);
                    }
                }
                break;
            case 5:
            case 7:
            case 11:
            case 13:
            case 18:
            case 19:
            default:
                CustomerAccount it2 = (CustomerAccount) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                androidx.media3.datasource.cache.c.u(((C) this.f5470b).c.f11330b, "key_customer_account_product_offering_level", it2.getProductOffering().getLevel());
                break;
            case 6:
                kotlin.jvm.internal.j.g((Registration) obj, "it");
                Lb.a aVar = (Lb.a) this.f5470b;
                aVar.getClass();
                MayaAccountProvisionFragment mayaAccountProvisionFragment = (MayaAccountProvisionFragment) ((InterfaceC1349b) aVar.c.get());
                mayaAccountProvisionFragment.getClass();
                ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_maya_account_provision_fragment_to_maya_verify_registration_fragment);
                E e = mayaAccountProvisionFragment.f13682V;
                kotlin.jvm.internal.j.d(e);
                String string = ((Button) e.f3586b).getText().toString();
                String strP = AbstractC1213b.p(3);
                kotlin.jvm.internal.j.f(strP, "tapped(...)");
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment, string, strP, mayaAccountProvisionFragment.s(), mayaAccountProvisionFragment.G1().t0(actionOnlyNavDirections).toString(), null, null, 48);
                E e7 = mayaAccountProvisionFragment.f13682V;
                kotlin.jvm.internal.j.d(e7);
                FrameLayout frameLayout = (FrameLayout) e7.f3587d;
                kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
                E1.c.m(Navigation.findNavController(frameLayout), actionOnlyNavDirections);
                boolean z4 = mayaAccountProvisionFragment.f13686Z;
                mayaAccountProvisionFragment.f13687a0 = z4 ? 1 : 0;
                mayaAccountProvisionFragment.f13688b0 = !z4 ? 1 : 0;
                break;
            case 8:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                Xb.f fVar = (Xb.f) this.f5470b;
                PayMayaError payMayaErrorF = fVar.f(it3, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                fVar.o(iMErrorCode, strMSpiel);
                break;
            case 9:
                ShopProviderBase it4 = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                ((Xb.h) this.f5470b).l(it4.getData());
                break;
            case 10:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                r rVar = (r) this.f5470b;
                PayMayaError payMayaErrorF2 = rVar.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                rVar.l(payMayaErrorF2);
                break;
            case 12:
                ShopPurchaseOfficialReceipt receiptLocation = (ShopPurchaseOfficialReceipt) obj;
                kotlin.jvm.internal.j.g(receiptLocation, "receiptLocation");
                B b8 = (B) this.f5470b;
                ((MayaBaseFragment) ((bc.m) b8.c.get())).w1();
                bc.m mVar2 = (bc.m) b8.c.get();
                String officialReceiptUrl = receiptLocation.getLocation();
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment = (MayaShopPurchaseHistoryReceiptFragment) mVar2;
                mayaShopPurchaseHistoryReceiptFragment.getClass();
                kotlin.jvm.internal.j.g(officialReceiptUrl, "officialReceiptUrl");
                D d10 = mayaShopPurchaseHistoryReceiptFragment.R0;
                if (d10 != null) {
                    MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) d10;
                    mayaShopV2Activity.n1();
                    B5.i.f(mayaShopV2Activity, officialReceiptUrl);
                }
                break;
            case 14:
                Y7.f fVar2 = (Y7.f) this.f5470b;
                PayMayaError payMayaErrorF3 = fVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                fVar2.m(payMayaErrorF3);
                break;
            case 15:
                Lb.a aVar2 = (Lb.a) this.f5470b;
                PayMayaError payMayaErrorF4 = aVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                aVar2.m(payMayaErrorF4);
                break;
            case 16:
                io.reactivex.rxjava3.disposables.b it5 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                ((Z8.f) this.f5470b).e(it5);
                break;
            case 17:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                Zd.b bVar = (Zd.b) this.f5470b;
                if (!permission.f6934b) {
                    bVar.getClass();
                } else {
                    ((BarcodeScannerFragment) ((InterfaceC1098a) bVar.c.get())).r1();
                }
                break;
            case 20:
                Pair it6 = (Pair) obj;
                kotlin.jvm.internal.j.g(it6, "it");
                o oVar = (o) this.f5470b;
                BillerTransaction oldBillerTransaction = (BillerTransaction) it6.f18160a;
                BillerDetails billerDetails = (BillerDetails) it6.f18161b;
                oVar.getClass();
                kotlin.jvm.internal.j.g(oldBillerTransaction, "oldBillerTransaction");
                kotlin.jvm.internal.j.g(billerDetails, "billerDetails");
                BillerTransaction billerTransactionBuild = oldBillerTransaction.toBuilder().mBiller(oldBillerTransaction.mBiller().toBuilder().mName(billerDetails.mName()).mIconUrl(billerDetails.mIconUrl()).build()).build();
                kotlin.jvm.internal.j.f(billerTransactionBuild, "build(...)");
                ((MayaPayBillsActivity) ((InterfaceC1085a) ((o) this.f5470b).c.get())).g2(billerTransactionBuild, null);
                break;
            case 21:
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                s sVar = (s) this.f5470b;
                PayMayaError payMayaErrorF5 = sVar.f(throwable2, false);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "paymayaErrorHandling(...)");
                ga.c cVar = (ga.c) sVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.CREATE);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF5.mSpiel());
                c1219hH.i();
                BillerDetails billerDetails2 = sVar.f8616w;
                c1219hH.j.put("biller", billerDetails2 == null ? sVar.f8617x : billerDetails2.mName());
                ((MayaBaseFragment) cVar).A1(c1219hH);
                if (!payMayaErrorF5.isSessionTimeout() && (mVar = (mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) ((ga.c) sVar.c.get())).f13391L0) != null) {
                    ((MayaPayBillsActivity) mVar).a(payMayaErrorF5, mayaPayBillsBIRFragment.getString(R.string.maya_toast_error_title_pay_bills_error));
                    break;
                }
                break;
            case 22:
                u uVar = (u) this.f5470b;
                PayMayaError payMayaErrorF6 = uVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF6, "mayaErrorHandling(...)");
                String strMName = ((MayaPayBillsConfirmationFragment) ((ga.d) uVar.c.get())).G1().mBiller().mName();
                if (strMName == null) {
                    strMName = "";
                }
                C1219h c1219hH2 = AbstractC2329d.h(12);
                c1219hH2.t(EnumC1217f.CONFIRMATION);
                c1219hH2.i();
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF6.mSpiel());
                c1219hH2.j.put("biller", strMName);
                if (uVar.l()) {
                    c1219hH2.g("favoriteId", (String) ((MayaPayBillsConfirmationFragment) ((ga.d) uVar.c.get())).f13415i0.getValue());
                    c1219hH2.g("notificationId", (String) ((MayaPayBillsConfirmationFragment) ((ga.d) uVar.c.get())).f13416j0.getValue());
                    uVar.h = true;
                }
                ((MayaBaseFragment) ((ga.d) uVar.c.get())).A1(c1219hH2);
                if (!payMayaErrorF6.isSessionTimeout() && (pVar = (mayaPayBillsConfirmationFragment = (MayaPayBillsConfirmationFragment) ((ga.d) uVar.c.get())).f13411e0) != null) {
                    ((MayaPayBillsActivity) pVar).a(payMayaErrorF6, mayaPayBillsConfirmationFragment.getString(R.string.maya_toast_error_title_pay_bills_error));
                    break;
                }
                break;
        }
    }

    public Ti.b b(Split split, String str) {
        if (split == null || split.status != Status.ACTIVE) {
            return null;
        }
        List listU = ((Ci.b) this.f5470b).u(str, "Dropping feature flag name=" + split.name + " due to large number of conditions (" + split.conditions.size() + ")", split.conditions);
        if (listU == null) {
            return null;
        }
        return new Ti.b(split.name, split.seed, split.killed, split.defaultTreatment, listU, split.trafficTypeName, split.changeNumber, split.trafficAllocation.intValue(), split.trafficAllocationSeed.intValue(), split.algo, split.configurations, split.sets, split.impressionsDisabled, new ArrayList(split.getPrerequisites()));
    }

    public Hh.f c(ComplianceRequest complianceRequest) {
        String strK = new com.google.gson.j().k(complianceRequest);
        kotlin.jvm.internal.j.d(strK);
        MediaType mediaType = Je.d.f2515a;
        return ((ComplianceApi) this.f5470b).saveFatcaProfile(RequestBody.Companion.create(Je.d.f2515a, strK)).f(Th.e.c);
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        return new C0869I((U) ((d3.d) this.f5470b).get());
    }

    @Override // t4.j
    public void i() {
    }

    @Override // pg.m
    public void onCancel(Object obj) {
        ((V4.g) this.f5470b).f6072b.h = null;
    }

    @Override // W6.e
    public void onDismiss() {
        AbstractC1236z.b((MayaLoginActivity) this.f5470b);
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception e) {
        kotlin.jvm.internal.j.g(e, "e");
        MayaShopProviderPageFragment mayaShopProviderPageFragment = (MayaShopProviderPageFragment) this.f5470b;
        ShapeableImageView shapeableImageView = mayaShopProviderPageFragment.u0;
        if (shapeableImageView == null) {
            kotlin.jvm.internal.j.n("mBannerImageView");
            throw null;
        }
        shapeableImageView.setVisibility(8);
        mayaShopProviderPageFragment.Q1();
    }

    @Override // pg.m
    public void onListen(Object obj, k kVar) {
        ((V4.g) this.f5470b).f6072b.h = (l) kVar;
    }

    @Override // t4.j
    public void onRefresh() {
        y yVar = (y) ((MayaShopProvidersCollectionFragment) this.f5470b).Q1();
        if (((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).u0) {
            ((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).R1().i();
        } else {
            ((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).u0 = true;
            new T(5, new Lh.d(new Lh.d(new Lh.h(yVar.f6601d.a(), zh.b.a(), 0), new Q6.s(yVar, 14), 2), new n(yVar, 13), 0), new x(yVar, 0)).e();
        }
        LottieAnimationView lottieAnimationView = ((MayaShopProvidersCollectionFragment) this.f5470b).f14101q0;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        } else {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        ((O4.k) this.f5470b).invoke(obj);
    }

    public /* synthetic */ i(Object obj, int i) {
        this.f5469a = i;
        this.f5470b = obj;
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        MayaShopProviderPageFragment mayaShopProviderPageFragment = (MayaShopProviderPageFragment) this.f5470b;
        ShapeableImageView shapeableImageView = mayaShopProviderPageFragment.u0;
        if (shapeableImageView == null) {
            kotlin.jvm.internal.j.n("mBannerImageView");
            throw null;
        }
        shapeableImageView.setVisibility(0);
        mayaShopProviderPageFragment.Q1();
    }

    public i(KycCmsAddressApi mKycCmsAddressApi) {
        this.f5469a = 29;
        kotlin.jvm.internal.j.g(mKycCmsAddressApi, "mKycCmsAddressApi");
        this.f5470b = mKycCmsAddressApi;
    }

    public i(ComplianceApi complianceApi) {
        this.f5469a = 28;
        kotlin.jvm.internal.j.g(complianceApi, "complianceApi");
        this.f5470b = complianceApi;
    }

    public i(C1353d mShopV3BuyAgainPurchaseViewHolder) {
        this.f5469a = 7;
        kotlin.jvm.internal.j.g(mShopV3BuyAgainPurchaseViewHolder, "mShopV3BuyAgainPurchaseViewHolder");
        this.f5470b = mShopV3BuyAgainPurchaseViewHolder;
    }

    public i(Ci.b bVar) {
        this.f5469a = 2;
        Objects.requireNonNull(bVar);
        this.f5470b = bVar;
    }

    public i(Map map, Map map2, Map map3, Map map4, Map map5) {
        this.f5469a = 5;
        this.f5470b = map;
    }
}
