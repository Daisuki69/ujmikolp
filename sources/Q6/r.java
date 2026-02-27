package Q6;

import D8.C0214w;
import Kh.T;
import L9.B;
import N5.A1;
import N5.C0447e;
import N5.C0491z;
import Xb.A;
import Xb.u;
import Xb.y;
import ag.C0700j;
import ag.C0707q;
import ag.C0708r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.PermissionRequest;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import bi.EnumC1028f;
import cc.InterfaceC1097j;
import cc.ViewOnClickListenerC1093f;
import cj.C1110A;
import cj.C1112C;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.agent.Global;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1228q;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.InterfaceC1227p;
import com.paymaya.common.utility.b0;
import com.paymaya.data.database.repository.C1239c;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.PushNotification;
import com.paymaya.domain.model.ShopPurchaseHistoryPushNotification;
import com.paymaya.domain.store.E;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaFavoriteActivity;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteCategoryFragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginOTPFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentConfirmationFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import d8.InterfaceC1338c;
import dOYHB6.tiZVw8.numX49;
import g9.InterfaceC1508c;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.zip.ZipFile;
import javax.xml.parsers.DocumentBuilder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import v.AbstractC2329d;
import zj.C2576A;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Ch.c, t4.j, pg.m, W6.e, U0.a, Ui.k, W6.d, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5291b;

    public /* synthetic */ r(Object obj, int i) {
        this.f5290a = i;
        this.f5291b = obj;
    }

    public static void d(Node node, List list, ArrayList arrayList, boolean z4) {
        int i = 0;
        boolean z5 = z4 || kotlin.jvm.internal.j.b(node.getNodeName(), "queries");
        ArrayList arrayListW = C1110A.W(list);
        if (z5) {
            String nodeName = node.getNodeName();
            kotlin.jvm.internal.j.c(nodeName, "node.nodeName");
            arrayListW.add(nodeName);
            String strF = C1110A.F(arrayListW, Global.COLON, null, null, null, 62);
            NamedNodeMap attributes = node.getAttributes();
            kotlin.jvm.internal.j.c(attributes, "node.attributes");
            StringBuilder sb2 = new StringBuilder();
            int length = attributes.getLength();
            for (int i4 = 0; i4 < length; i4++) {
                if (i4 != 0) {
                    sb2.append(", ");
                }
                Node nodeItem = attributes.item(i4);
                kotlin.jvm.internal.j.c(nodeItem, "attrs.item(i)");
                sb2.append(nodeItem.getNodeName().toString() + "=" + nodeItem.getNodeValue());
            }
            String string = sb2.toString();
            kotlin.jvm.internal.j.c(string, "sb.toString()");
            arrayList.add(new C0700j(strF, string));
        }
        while (true) {
            NodeList childNodes = node.getChildNodes();
            kotlin.jvm.internal.j.c(childNodes, "node.childNodes");
            if (i >= childNodes.getLength()) {
                return;
            }
            Node nodeItem2 = node.getChildNodes().item(i);
            kotlin.jvm.internal.j.c(nodeItem2, "node.childNodes.item(i)");
            d(nodeItem2, arrayListW, arrayList, z5);
            i++;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    @Override // U0.a
    public PdfDocument a(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.h(context.getContentResolver().openFileDescriptor((Uri) this.f5291b, "r"), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ch.c
    public void accept(Object obj) {
        PermissionRequest permissionRequest;
        ProductV3 targetProduct;
        ProductV3 targetProduct2;
        ProductV3 targetProduct3;
        InterfaceC1338c interfaceC1338c;
        int i = 14;
        name = null;
        String name = null;
        final int i4 = 0;
        final int i6 = 1;
        switch (this.f5290a) {
            case 0:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                t tVar = (t) this.f5291b;
                if (!permission.f6934b || (permissionRequest = ((MayaWebFragment) ((X6.h) tVar.c.get())).f11952E0) == null) {
                    return;
                }
                permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 15:
            case 17:
            case 21:
            case 22:
            case 25:
            case 26:
            default:
                kotlin.jvm.internal.j.g((Throwable) obj, "it");
                ((E) this.f5291b).c.f11316a.b("decoration", null, null);
                return;
            case 6:
                EnumC1028f event = (EnumC1028f) obj;
                kotlin.jvm.internal.j.g(event, "event");
                int iOrdinal = event.ordinal();
                Uh.b bVar = (Uh.b) this.f5291b;
                if (iOrdinal == 0) {
                    if (bVar != null) {
                        bVar.onNext(U5.a.c);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (bVar != null) {
                        bVar.onNext(U5.a.f5944d);
                        return;
                    }
                    return;
                } else if (iOrdinal == 2) {
                    if (bVar != null) {
                        bVar.onNext(U5.a.e);
                        return;
                    }
                    return;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (bVar != null) {
                        bVar.onNext(U5.a.f);
                        return;
                    }
                    return;
                }
            case 7:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((Lb.a) this.f5291b).e(it);
                return;
            case 8:
                PushNotification pushNotification = (PushNotification) obj;
                kotlin.jvm.internal.j.g(pushNotification, "pushNotification");
                Lb.a aVar = (Lb.a) this.f5291b;
                aVar.getClass();
                String strMStatus = ((ShopPurchaseHistoryPushNotification) pushNotification).mStatus();
                if (C1110A.v(((MayaShopFragment) ((bc.a) aVar.c.get())).t0, strMStatus)) {
                    return;
                }
                MayaShopFragment mayaShopFragment = (MayaShopFragment) ((bc.a) aVar.c.get());
                String str = mayaShopFragment.t0.isEmpty() ? null : (String) mayaShopFragment.t0.get(0);
                Object[] objArr = str == null || C2576A.H(str);
                if ("DISBURSEMENT_SUCCESSFUL".equalsIgnoreCase(strMStatus)) {
                    final MayaShopFragment mayaShopFragment2 = (MayaShopFragment) ((bc.a) aVar.c.get());
                    mayaShopFragment2.getClass();
                    Runnable runnable = new Runnable() { // from class: cc.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    final MayaShopFragment mayaShopFragment3 = mayaShopFragment2;
                                    C0491z c0491z = mayaShopFragment3.w0;
                                    kotlin.jvm.internal.j.d(c0491z);
                                    CardView cardView = ((A1) c0491z.f).f3548b;
                                    C0491z c0491z2 = mayaShopFragment3.w0;
                                    kotlin.jvm.internal.j.d(c0491z2);
                                    ConstraintLayout constraintLayout = (ConstraintLayout) c0491z2.c;
                                    kotlin.jvm.internal.j.f(constraintLayout, numX49.tnTj78("btQM"));
                                    final int i10 = 0;
                                    AbstractC1228q.c(cardView, constraintLayout, new InterfaceC1227p() { // from class: cc.c
                                        @Override // com.paymaya.common.utility.InterfaceC1227p
                                        public final void a() {
                                            switch (i10) {
                                                case 0:
                                                    mayaShopFragment3.U1();
                                                    break;
                                                default:
                                                    mayaShopFragment3.U1();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final MayaShopFragment mayaShopFragment4 = mayaShopFragment2;
                                    C0491z c0491z3 = mayaShopFragment4.w0;
                                    kotlin.jvm.internal.j.d(c0491z3);
                                    CardView cardView2 = ((A1) c0491z3.e).f3548b;
                                    C0491z c0491z4 = mayaShopFragment4.w0;
                                    kotlin.jvm.internal.j.d(c0491z4);
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) c0491z4.c;
                                    kotlin.jvm.internal.j.f(constraintLayout2, numX49.tnTj78("btQh"));
                                    final int i11 = 1;
                                    AbstractC1228q.c(cardView2, constraintLayout2, new InterfaceC1227p() { // from class: cc.c
                                        @Override // com.paymaya.common.utility.InterfaceC1227p
                                        public final void a() {
                                            switch (i11) {
                                                case 0:
                                                    mayaShopFragment4.U1();
                                                    break;
                                                default:
                                                    mayaShopFragment4.U1();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    mayaShopFragment2.t0.add("DISBURSEMENT_SUCCESSFUL");
                    mayaShopFragment2.u0.add(runnable);
                    if (objArr == true) {
                        ((MayaShopFragment) ((bc.a) aVar.c.get())).P1();
                        return;
                    }
                    return;
                }
                if ("KYUUBI_PENDING".equalsIgnoreCase(strMStatus)) {
                    final MayaShopFragment mayaShopFragment3 = (MayaShopFragment) ((bc.a) aVar.c.get());
                    mayaShopFragment3.getClass();
                    Runnable runnable2 = new Runnable() { // from class: cc.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    final MayaShopFragment mayaShopFragment32 = mayaShopFragment3;
                                    C0491z c0491z = mayaShopFragment32.w0;
                                    kotlin.jvm.internal.j.d(c0491z);
                                    CardView cardView = ((A1) c0491z.f).f3548b;
                                    C0491z c0491z2 = mayaShopFragment32.w0;
                                    kotlin.jvm.internal.j.d(c0491z2);
                                    ConstraintLayout constraintLayout = (ConstraintLayout) c0491z2.c;
                                    kotlin.jvm.internal.j.f(constraintLayout, numX49.tnTj78("btQM"));
                                    final int i10 = 0;
                                    AbstractC1228q.c(cardView, constraintLayout, new InterfaceC1227p() { // from class: cc.c
                                        @Override // com.paymaya.common.utility.InterfaceC1227p
                                        public final void a() {
                                            switch (i10) {
                                                case 0:
                                                    mayaShopFragment32.U1();
                                                    break;
                                                default:
                                                    mayaShopFragment32.U1();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final MayaShopFragment mayaShopFragment4 = mayaShopFragment3;
                                    C0491z c0491z3 = mayaShopFragment4.w0;
                                    kotlin.jvm.internal.j.d(c0491z3);
                                    CardView cardView2 = ((A1) c0491z3.e).f3548b;
                                    C0491z c0491z4 = mayaShopFragment4.w0;
                                    kotlin.jvm.internal.j.d(c0491z4);
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) c0491z4.c;
                                    kotlin.jvm.internal.j.f(constraintLayout2, numX49.tnTj78("btQh"));
                                    final int i11 = 1;
                                    AbstractC1228q.c(cardView2, constraintLayout2, new InterfaceC1227p() { // from class: cc.c
                                        @Override // com.paymaya.common.utility.InterfaceC1227p
                                        public final void a() {
                                            switch (i11) {
                                                case 0:
                                                    mayaShopFragment4.U1();
                                                    break;
                                                default:
                                                    mayaShopFragment4.U1();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    mayaShopFragment3.t0.add("KYUUBI_PENDING");
                    mayaShopFragment3.u0.add(runnable2);
                    if (objArr == true) {
                        ((MayaShopFragment) ((bc.a) aVar.c.get())).P1();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                kotlin.jvm.internal.j.g((Throwable) obj, "it");
                MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) ((bc.b) ((Xb.f) this.f5291b).c.get());
                mayaShopHomePageFragment.getClass();
                MayaBaseLoadingFragment.N1(mayaShopHomePageFragment, 200, null, null, new ViewOnClickListenerC1093f(mayaShopHomePageFragment, i6), 30);
                return;
            case 10:
                Order executedOrder = (Order) obj;
                kotlin.jvm.internal.j.g(executedOrder, "executedOrder");
                C0214w c0214w = (C0214w) this.f5291b;
                PaymentConfirmationSummary paymentConfirmationSummary = ((MayaShopPaymentConfirmationFragment) ((bc.d) c0214w.c.get())).f14024X;
                String unformattedTargetNumber = paymentConfirmationSummary != null ? paymentConfirmationSummary.getUnformattedTargetNumber() : null;
                if (unformattedTargetNumber != null && !C2576A.H(unformattedTargetNumber)) {
                    androidx.media3.datasource.cache.c.u(((com.paymaya.data.preference.a) c0214w.e).f11330b, "key_shop_recent_recipient_number", unformattedTargetNumber);
                }
                MayaShopPaymentConfirmationFragment mayaShopPaymentConfirmationFragment = (MayaShopPaymentConfirmationFragment) ((bc.d) c0214w.c.get());
                mayaShopPaymentConfirmationFragment.getClass();
                C1220i c1220iO1 = mayaShopPaymentConfirmationFragment.o1();
                FragmentActivity activity = mayaShopPaymentConfirmationFragment.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
                c1219hD.t(EnumC1217f.PURCHASE);
                c1219hD.n(14);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                PaymentConfirmationSummary paymentConfirmationSummary2 = mayaShopPaymentConfirmationFragment.f14024X;
                String productCode = (paymentConfirmationSummary2 == null || (targetProduct3 = paymentConfirmationSummary2.getTargetProduct()) == null) ? null : targetProduct3.getProductCode();
                HashMap map = c1219hD.j;
                map.put("product", productCode);
                PaymentConfirmationSummary paymentConfirmationSummary3 = mayaShopPaymentConfirmationFragment.f14024X;
                map.put("provider", (paymentConfirmationSummary3 == null || (targetProduct2 = paymentConfirmationSummary3.getTargetProduct()) == null) ? null : targetProduct2.getProvider());
                map.put("attribution", mayaShopPaymentConfirmationFragment.n1().f10371a);
                c1219hD.i();
                c1220iO1.c(activity, c1219hD);
                InterfaceC1097j interfaceC1097j = mayaShopPaymentConfirmationFragment.f14027a0;
                if (interfaceC1097j != null) {
                    PaymentConfirmationSummary paymentConfirmationSummary4 = mayaShopPaymentConfirmationFragment.f14024X;
                    if (paymentConfirmationSummary4 != null && (targetProduct = paymentConfirmationSummary4.getTargetProduct()) != null) {
                        name = targetProduct.getName();
                    }
                    N9.f fVar = new N9.f(mayaShopPaymentConfirmationFragment, 28);
                    W4.b bVar2 = new W4.b(mayaShopPaymentConfirmationFragment, 8);
                    MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1097j;
                    String string = mayaShopV2Activity.getString(R.string.maya_shop_success_dialog_title, name);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(R.drawable.maya_ic_success, string, mayaShopV2Activity.getString(R.string.maya_shop_success_dialog_description), new Pair(mayaShopV2Activity.getString(R.string.maya_label_finish), new N9.f(bVar2, 18)), new Pair(mayaShopV2Activity.getString(R.string.maya_label_view_receipt), new C7.f(i, executedOrder, fVar)), null, 96);
                    mayaAlertBottomSheetDialogFragmentN.setCancelable(false);
                    mayaAlertBottomSheetDialogFragmentN.show(mayaShopV2Activity.getSupportFragmentManager(), "success_dialog");
                    return;
                }
                return;
            case 11:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                Xb.r rVar = (Xb.r) this.f5291b;
                PayMayaError payMayaErrorF = rVar.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                rVar.l(payMayaErrorF);
                return;
            case 12:
                kotlin.jvm.internal.j.g((List) obj, "it");
                ((MayaShopProviderProductsListFragment) ((bc.h) ((u) this.f5291b).c.get())).f14079z0++;
                return;
            case 13:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                ((y) this.f5291b).m(p02);
                return;
            case 14:
                A a8 = (A) this.f5291b;
                PayMayaError payMayaErrorF2 = a8.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                a8.l(payMayaErrorF2);
                return;
            case 16:
                Y7.d dVar = (Y7.d) this.f5291b;
                PayMayaError payMayaErrorF3 = dVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "mayaErrorHandling(...)");
                c8.b bVar3 = (c8.b) dVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.DELETE);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, payMayaErrorF3.mSpiel());
                c1219hH.i();
                ((MayaBaseFragment) bVar3).A1(c1219hH);
                ((MayaBaseFragment) ((c8.b) dVar.c.get())).w1();
                if (payMayaErrorF3.isSessionTimeout() || (interfaceC1338c = ((MayaFavoriteCategoryFragment) ((c8.b) dVar.c.get())).f12343Y) == null) {
                    return;
                }
                MayaFavoriteActivity mayaFavoriteActivity = (MayaFavoriteActivity) interfaceC1338c;
                Fragment fragmentFindFragmentByTag = mayaFavoriteActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaFavoriteActivity, MayaFavoriteFragment.class));
                MayaFavoriteFragment mayaFavoriteFragment = fragmentFindFragmentByTag instanceof MayaFavoriteFragment ? (MayaFavoriteFragment) fragmentFindFragmentByTag : null;
                if (mayaFavoriteFragment != null) {
                    FragmentActivity activity2 = mayaFavoriteFragment.getActivity();
                    C0447e c0447e = mayaFavoriteFragment.f12345o0;
                    kotlin.jvm.internal.j.d(c0447e);
                    CoordinatorLayout coordinatorLayoutFavorites = (CoordinatorLayout) c0447e.c;
                    kotlin.jvm.internal.j.f(coordinatorLayoutFavorites, "coordinatorLayoutFavorites");
                    b0.e(activity2, coordinatorLayoutFavorites, null, R.string.maya_label_remove_favorite_error, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 852);
                    return;
                }
                return;
            case 18:
                PayMayaError payMayaErrorF4 = ((Lb.a) this.f5291b).f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "mayaErrorHandling(...)");
                InterfaceC1508c interfaceC1508c = (InterfaceC1508c) ((Lb.a) this.f5291b).c.get();
                C1219h c1219hH2 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put(Constants.REASON, payMayaErrorF4.mSpiel());
                c1219hH2.f11206k.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaErrorF4.mThrowableMessage());
                ((MayaBaseFragment) interfaceC1508c).A1(c1219hH2);
                Lb.a aVar2 = (Lb.a) this.f5291b;
                aVar2.getClass();
                if (payMayaErrorF4.mErrorCode() == -394 || payMayaErrorF4.mErrorCode() == -395) {
                    h9.k kVar = ((MayaLoginOTPFragment) ((InterfaceC1508c) aVar2.c.get())).f12790k0;
                    if (kVar != null) {
                        kVar.I0(payMayaErrorF4);
                        return;
                    }
                    return;
                }
                h9.k kVar2 = ((MayaLoginOTPFragment) ((InterfaceC1508c) aVar2.c.get())).f12790k0;
                if (kVar2 != null) {
                    kVar2.T(payMayaErrorF4);
                    return;
                }
                return;
            case 19:
                io.reactivex.rxjava3.disposables.b it2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                ((Z8.i) this.f5291b).e(it2);
                return;
            case 20:
                Ze.a permission2 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission2, "permission");
                Zd.d dVar2 = (Zd.d) this.f5291b;
                if (permission2.f6934b) {
                    ((MLKitQRScannerFragment) ((ce.c) dVar2.c.get())).w1();
                    return;
                } else {
                    dVar2.getClass();
                    return;
                }
            case 23:
                io.reactivex.rxjava3.disposables.b it3 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                ((ba.u) this.f5291b).e(it3);
                return;
            case 24:
                io.reactivex.rxjava3.disposables.b it4 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                MayaPayBillsSearchFragment mayaPayBillsSearchFragment = (MayaPayBillsSearchFragment) ((ga.g) ((A7.j) this.f5291b).c.get());
                mayaPayBillsSearchFragment.getClass();
                mayaPayBillsSearchFragment.f13485h0 = it4;
                return;
            case 27:
                String text = (String) obj;
                kotlin.jvm.internal.j.g(text, "text");
                MayaShopSearchFragment mayaShopSearchFragment = (MayaShopSearchFragment) this.f5291b;
                mayaShopSearchFragment.f14173l0 = text;
                if (mayaShopSearchFragment.f14174n0) {
                    mayaShopSearchFragment.f14174n0 = false;
                    return;
                } else {
                    mayaShopSearchFragment.G1().l();
                    return;
                }
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Xe.b query = (Xe.b) obj;
        kotlin.jvm.internal.j.g(query, "query");
        Cursor cursorA = query.a();
        kotlin.jvm.internal.j.d(cursorA);
        ((C1239c) this.f5291b).getClass();
        return C1239c.a(cursorA);
    }

    public ArrayList b() throws IOException {
        String strC;
        String str;
        Element elementCreateElement;
        String str2;
        String strC2;
        byte[] bArr;
        ZipFile zipFile = new ZipFile(((Context) this.f5291b).getApplicationInfo().sourceDir);
        InputStream inputStream = zipFile.getInputStream(zipFile.getEntry("AndroidManifest.xml"));
        C0708r c0708r = new C0708r();
        kotlin.jvm.internal.j.c(inputStream, "inputStream");
        U8.c cVar = new U8.c();
        c0708r.f7227a = cVar;
        byte[] bArr2 = new byte[inputStream.available()];
        c0708r.c = bArr2;
        inputStream.read(bArr2);
        inputStream.close();
        while (true) {
            int i = c0708r.h;
            byte[] bArr3 = c0708r.c;
            if (bArr3 == null) {
                kotlin.jvm.internal.j.l();
            }
            if (i >= bArr3.length) {
                U8.c cVar2 = c0708r.f7227a;
                if (cVar2 == null) {
                    kotlin.jvm.internal.j.l();
                }
                cVar2.getClass();
                Document document = (Document) cVar.c;
                if (document == null) {
                    kotlin.jvm.internal.j.l();
                }
                Node nodeItem = document.getChildNodes().item(0);
                kotlin.jvm.internal.j.c(nodeItem, "doc!!.childNodes.item(0)");
                C1112C c1112c = C1112C.f9377a;
                ArrayList arrayList = new ArrayList();
                d(nodeItem, c1112c, arrayList, false);
                return arrayList;
            }
            int iA = c0708r.a(c0708r.h);
            if (iA == -1) {
                U8.c cVar3 = c0708r.f7227a;
                if (cVar3 == null) {
                    kotlin.jvm.internal.j.l();
                }
                cVar3.getClass();
            } else if (iA == 524291) {
                U8.c cVar4 = c0708r.f7227a;
                if (cVar4 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Document documentNewDocument = ((DocumentBuilder) cVar4.f5965d).newDocument();
                cVar4.c = documentNewDocument;
                ((Stack) cVar4.f5964b).push(documentNewDocument);
                c0708r.h += 8;
            } else if (iA == 524672) {
                int iA2 = c0708r.a(c0708r.h + 4);
                int i4 = (iA2 / 4) - 2;
                c0708r.e = new int[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    int[] iArr = c0708r.e;
                    if (iArr == null) {
                        kotlin.jvm.internal.j.l();
                    }
                    iArr[i6] = c0708r.a(((i6 + 2) * 4) + c0708r.h);
                }
                c0708r.h += iA2;
            } else if (iA != 1835009) {
                switch (iA) {
                    case 1048832:
                        c0708r.b(true);
                        break;
                    case 1048833:
                        c0708r.b(false);
                        break;
                    case 1048834:
                        int iA3 = c0708r.a(c0708r.h + 16);
                        int iA4 = c0708r.a(c0708r.h + 20);
                        int i10 = c0708r.h;
                        int i11 = i10 + 28;
                        byte[] bArr4 = c0708r.c;
                        if (bArr4 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        int i12 = 65280 & (bArr4[i10 + 29] << 8);
                        byte[] bArr5 = c0708r.c;
                        if (bArr5 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        int i13 = i12 | (bArr5[i11] & 255);
                        String strC3 = c0708r.c(iA4);
                        HashMap map = c0708r.f7228b;
                        if (iA3 == -1) {
                            str = strC3;
                            strC = "";
                        } else {
                            strC = c0708r.c(iA3);
                            str = map.containsKey(strC) ? ((String) map.get(strC)) + ':' + strC3 : strC3;
                        }
                        c0708r.h += 36;
                        C0707q[] c0707qArr = new C0707q[i13];
                        for (int i14 = 0; i14 < i13; i14++) {
                            int iA5 = c0708r.a(c0708r.h);
                            int iA6 = c0708r.a(c0708r.h + 4);
                            int iA7 = c0708r.a(c0708r.h + 8);
                            int iA8 = c0708r.a(c0708r.h + 12);
                            int iA9 = c0708r.a(c0708r.h + 16);
                            C0707q c0707q = new C0707q();
                            c0707q.f7224a = c0708r.c(iA6);
                            if (iA5 == -1) {
                                c0707q.c = null;
                                c0707q.f7225b = null;
                            } else {
                                String strC4 = c0708r.c(iA5);
                                if (map.containsKey(strC4)) {
                                    c0707q.c = strC4;
                                    c0707q.f7225b = (String) map.get(strC4);
                                }
                            }
                            if (iA7 == -1) {
                                switch (iA8) {
                                    case 16777224:
                                        strC2 = String.format("@id/0x%08X", Arrays.copyOf(new Object[]{Integer.valueOf(iA9)}, 1));
                                        break;
                                    case 33554440:
                                        strC2 = String.format("?id/0x%08X", Arrays.copyOf(new Object[]{Integer.valueOf(iA9)}, 1));
                                        break;
                                    case 50331656:
                                        strC2 = c0708r.c(iA9);
                                        break;
                                    case 67108872:
                                        strC2 = String.valueOf(Float.intBitsToFloat(iA9));
                                        break;
                                    case 83886088:
                                        strC2 = String.valueOf(iA9 >> 8) + C0708r.i[iA9 & 255];
                                        break;
                                    case 100663304:
                                        strC2 = new DecimalFormat("#.##%").format(((double) iA9) / ((double) Integer.MAX_VALUE));
                                        break;
                                    case 268435464:
                                    case 285212680:
                                        strC2 = String.valueOf(iA9);
                                        break;
                                    case 301989896:
                                        strC2 = Boolean.toString(iA9 != 0);
                                        break;
                                    case 469762056:
                                    case 486539272:
                                        strC2 = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(iA9)}, 1));
                                        break;
                                    default:
                                        strC2 = String.format("%08X/0x%08X", Arrays.copyOf(new Object[]{Integer.valueOf(iA8), Integer.valueOf(iA9)}, 2));
                                        break;
                                }
                                c0707q.f7226d = strC2;
                            } else {
                                c0707q.f7226d = c0708r.c(iA7);
                            }
                            c0707qArr[i14] = c0707q;
                            c0708r.h += 20;
                        }
                        U8.c cVar5 = c0708r.f7227a;
                        if (cVar5 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        cVar5.getClass();
                        if (strC == null || "".equals(strC)) {
                            Document document2 = (Document) cVar5.c;
                            if (document2 == null) {
                                kotlin.jvm.internal.j.l();
                            }
                            elementCreateElement = document2.createElement(strC3);
                            str2 = "document!!.createElement(localName)";
                        } else {
                            Document document3 = (Document) cVar5.c;
                            if (document3 == null) {
                                kotlin.jvm.internal.j.l();
                            }
                            elementCreateElement = document3.createElementNS(strC, str);
                            str2 = "document!!.createElementNS(uri, qName)";
                        }
                        kotlin.jvm.internal.j.c(elementCreateElement, str2);
                        for (int i15 = 0; i15 < i13; i15++) {
                            C0707q c0707q2 = c0707qArr[i15];
                            String str3 = c0707q2 != null ? c0707q2.c : null;
                            if (str3 == null || "".equals(str3)) {
                                elementCreateElement.setAttribute(c0707q2 != null ? c0707q2.f7224a : null, c0707q2 != null ? c0707q2.f7226d : null);
                            } else {
                                String str4 = c0707q2 != null ? c0707q2.c : null;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(c0707q2 != null ? c0707q2.f7225b : null);
                                sb2.append(':');
                                sb2.append(c0707q2 != null ? c0707q2.f7224a : null);
                                elementCreateElement.setAttributeNS(str4, sb2.toString(), c0707q2 != null ? c0707q2.f7226d : null);
                            }
                        }
                        Stack stack = (Stack) cVar5.f5964b;
                        Object objPeek = stack.peek();
                        if (objPeek == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        ((Node) objPeek).appendChild(elementCreateElement);
                        stack.push(elementCreateElement);
                        break;
                    case 1048835:
                        int iA10 = c0708r.a(c0708r.h + 16);
                        c0708r.c(c0708r.a(c0708r.h + 20));
                        if (iA10 != -1) {
                            c0708r.c(iA10);
                        }
                        U8.c cVar6 = c0708r.f7227a;
                        if (cVar6 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        ((Stack) cVar6.f5964b).pop();
                        c0708r.h += 24;
                        break;
                    case 1048836:
                        String strC5 = c0708r.c(c0708r.a(c0708r.h + 16));
                        U8.c cVar7 = c0708r.f7227a;
                        if (cVar7 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        Object objPeek2 = ((Stack) cVar7.f5964b).peek();
                        if (objPeek2 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        Node node = (Node) objPeek2;
                        Document document4 = (Document) cVar7.c;
                        if (document4 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        node.appendChild(document4.createCDATASection(strC5));
                        c0708r.h += 28;
                        break;
                    default:
                        c0708r.h += 4;
                        break;
                }
            } else {
                int iA11 = c0708r.a(c0708r.h + 4);
                c0708r.f = c0708r.a(c0708r.h + 8);
                c0708r.f7230g = c0708r.a(c0708r.h + 12);
                int i16 = c0708r.h;
                int iA12 = c0708r.a(i16 + 20) + i16;
                int iA13 = c0708r.a(c0708r.h + 24);
                int i17 = c0708r.f;
                c0708r.f7229d = new String[i17];
                for (int i18 = 0; i18 < i17; i18++) {
                    int iA14 = c0708r.a(((i18 + 7) * 4) + c0708r.h) + iA12;
                    String[] strArr = c0708r.f7229d;
                    if (strArr == null) {
                        kotlin.jvm.internal.j.l();
                    }
                    byte[] bArr6 = c0708r.c;
                    if (bArr6 == null) {
                        kotlin.jvm.internal.j.l();
                    }
                    int i19 = iA14 + 1;
                    byte b8 = bArr6[i19];
                    byte[] bArr7 = c0708r.c;
                    if (bArr7 == null) {
                        kotlin.jvm.internal.j.l();
                    }
                    if (b8 == bArr7[iA14]) {
                        byte[] bArr8 = c0708r.c;
                        if (bArr8 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        int i20 = bArr8[iA14];
                        bArr = new byte[i20];
                        for (int i21 = 0; i21 < i20; i21++) {
                            byte[] bArr9 = c0708r.c;
                            if (bArr9 == null) {
                                kotlin.jvm.internal.j.l();
                            }
                            bArr[i21] = bArr9[iA14 + 2 + i21];
                        }
                    } else {
                        byte[] bArr10 = c0708r.c;
                        if (bArr10 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        int i22 = (bArr10[i19] << 8) & 65280;
                        byte[] bArr11 = c0708r.c;
                        if (bArr11 == null) {
                            kotlin.jvm.internal.j.l();
                        }
                        int i23 = i22 | (bArr11[iA14] & 255);
                        bArr = new byte[i23];
                        for (int i24 = 0; i24 < i23; i24++) {
                            byte[] bArr12 = c0708r.c;
                            if (bArr12 == null) {
                                kotlin.jvm.internal.j.l();
                            }
                            bArr[i24] = bArr12[(i24 * 2) + iA14 + 2];
                        }
                    }
                    strArr[i18] = new String(bArr, C2581c.f21468b);
                }
                if (iA13 > 0) {
                    for (int i25 = 0; i25 < c0708r.f7230g; i25++) {
                    }
                }
                c0708r.h += iA11;
            }
        }
    }

    @Override // Ui.k
    public boolean c(Object obj, HashMap map, U8.c cVar) {
        Wi.a aVarA;
        Wi.a aVar = (Wi.a) this.f5291b;
        if (aVar == null || !(obj instanceof String) || (aVarA = Wi.a.a((String) obj)) == null) {
            return false;
        }
        boolean zEquals = aVarA.equals(aVar);
        Ri.a.d(aVarA.f6451g + " == " + aVar.f6451g + " | Result: " + zEquals);
        return zEquals;
    }

    @Override // t4.j
    public void i() {
        int i = this.f5290a;
    }

    @Override // pg.m
    public void onCancel(Object obj) {
        ((Re.c) this.f5291b).f5518a = null;
    }

    @Override // W6.d
    public void onClose() {
        AbstractC1236z.b((MayaLoginActivity) this.f5291b);
    }

    @Override // W6.e
    public void onDismiss() {
        AbstractC1236z.b((MayaSessionExpiredActivity) this.f5291b);
    }

    @Override // pg.m
    public void onListen(Object obj, pg.k kVar) {
        ((Re.c) this.f5291b).f5518a = (pg.l) kVar;
    }

    @Override // t4.j
    public void onRefresh() {
        switch (this.f5290a) {
            case 1:
                NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) this.f5291b;
                B bP1 = newMayaCreditFragment.P1();
                bP1.n();
                bP1.o();
                LottieAnimationView lottieAnimationView = newMayaCreditFragment.f13255Y0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
            default:
                u uVar = (u) ((MayaShopProviderProductsListFragment) this.f5291b).P1();
                if (((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).f14070C0) {
                    SpringView springView = ((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).w0;
                    if (springView == null) {
                        kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                        throw null;
                    }
                    springView.i();
                } else {
                    ((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).f14070C0 = true;
                    new T(5, new Lh.d(new Lh.d(new Lh.h(uVar.f6595d.c(1, ((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).Q1().getName(), true), zh.b.a(), 0), new n(uVar, 12), 2), new Xb.t(uVar, 1), 0), new Xb.s(uVar, 1)).e();
                }
                LottieAnimationView lottieAnimationView2 = ((MayaShopProviderProductsListFragment) this.f5291b).f14077v0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.d();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLottieView");
                    throw null;
                }
        }
    }

    public r(String str) {
        this.f5290a = 5;
        this.f5291b = Wi.a.a(str);
    }

    public r(int i) {
        this.f5290a = i;
        switch (i) {
            case 17:
                this.f5291b = Z3.a.e;
                break;
        }
    }
}
