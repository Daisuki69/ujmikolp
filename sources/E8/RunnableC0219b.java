package E8;

import M8.T2;
import a1.C0622c;
import android.net.http.SslError;
import android.os.Looper;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.webkit.WebResourceErrorCompat;
import androidx.work.Configuration;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkGenerationalId;
import cj.M;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.Order;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.load.view.activity.impl.MayaLoadActivity;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.shield.android.ShieldCallback;
import d4.AbstractC1331a;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import j1.C1659g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import kotlin.Pair;
import n2.C1915b;

/* JADX INFO: renamed from: E8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0219b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1274b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1275d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0219b(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, Executor executor, ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        this.f1273a = 3;
        this.e = imageCapture;
        this.f1274b = outputFileOptions;
        this.c = executor;
        this.f1275d = onImageSavedCallback;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        String strB;
        String str;
        String strB2;
        String str2;
        switch (this.f1273a) {
            case 0:
                C0221d c0221d = (C0221d) this.c;
                Preview preview = (Preview) this.f1275d;
                ImageCapture imageCapture = (ImageCapture) this.e;
                ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) ((S1.y) this.f1274b).get();
                CameraSelector DEFAULT_BACK_CAMERA = CameraSelector.DEFAULT_BACK_CAMERA;
                kotlin.jvm.internal.j.f(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
                try {
                    processCameraProvider.unbindAll();
                    c0221d.c = processCameraProvider.bindToLifecycle(c0221d.f1280b, DEFAULT_BACK_CAMERA, preview, imageCapture);
                    return;
                } catch (Exception unused) {
                    yk.a.e();
                    return;
                }
            case 1:
                pg.r rVar = (pg.r) this.f1274b;
                MayaLoadActivity mayaLoadActivity = (MayaLoadActivity) this.c;
                pg.t tVar = (pg.t) this.f1275d;
                String str3 = (String) this.e;
                int i = MayaLoadActivity.f12708q;
                String str4 = rVar.f19112a;
                if (str4 != null) {
                    switch (str4.hashCode()) {
                        case -1682957889:
                            if (str4.equals("getAccessToken")) {
                                strB = mayaLoadActivity.V1().e.b();
                                str = "access_token";
                                AbstractC1331a.t(str, strB, tVar);
                                return;
                            }
                            break;
                        case -1249356004:
                            if (str4.equals("getMin")) {
                                strB = mayaLoadActivity.V1().e.r();
                                str = "min";
                                AbstractC1331a.t(str, strB, tVar);
                                return;
                            }
                            break;
                        case -1179101518:
                            if (str4.equals("getShieldSessionId")) {
                                mayaLoadActivity.V1();
                                strB = i0.b();
                                str = "shield_session_id";
                                AbstractC1331a.t(str, strB, tVar);
                                return;
                            }
                            break;
                        case -670914607:
                            if (str4.equals("getAvailability")) {
                                Map<String, Boolean> flutterAvailability = mayaLoadActivity.V1().e.e().getFlutterAvailability();
                                kotlin.jvm.internal.j.f(flutterAvailability, "getFlutterAvailability(...)");
                                tVar.success(flutterAvailability);
                                return;
                            }
                            break;
                        case -599445191:
                            if (str4.equals("complete")) {
                                if (str3.equals("packages/paymaya_checkout")) {
                                    mayaLoadActivity.getClass();
                                    FlutterEngineCache.getInstance().remove("checkoutFullscreen");
                                    mayaLoadActivity.W1();
                                    return;
                                } else {
                                    if (str3.equals("packages/maya_load")) {
                                        mayaLoadActivity.getClass();
                                        FlutterEngineCache.getInstance().remove("loadFullscreen");
                                        mayaLoadActivity.n1().q(mayaLoadActivity);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case -476469337:
                            if (str4.equals("finishCurrentModuleForCard")) {
                                pg.u uVar = mayaLoadActivity.f12710o;
                                if (uVar != null) {
                                    uVar.a("onModuleResult", rVar.f19113b, null);
                                }
                                tVar.success(Boolean.TRUE);
                                return;
                            }
                            break;
                        case -169040651:
                            if (str4.equals("requestCheckout")) {
                                String str5 = (String) rVar.a("paymentId");
                                if (str5 != null) {
                                    mayaLoadActivity.getClass();
                                    pg.u uVar2 = mayaLoadActivity.f12711p;
                                    if (uVar2 != null) {
                                        uVar2.a("requestFullscreen", M.h(new Pair("route", "buyLoadScreen"), new Pair("paymentId", str5)), null);
                                    }
                                    mayaLoadActivity.n1();
                                    B5.i.g(mayaLoadActivity);
                                    return;
                                }
                                return;
                            }
                            break;
                        case -67833007:
                            if (str4.equals("getPinningFingerprint")) {
                                strB = mayaLoadActivity.V1().e.t();
                                str = "pinning_fingerprint";
                                AbstractC1331a.t(str, strB, tVar);
                                return;
                            }
                            break;
                        case 200708888:
                            if (str4.equals("logAnalyticsEvent")) {
                                M7.a aVarV1 = mayaLoadActivity.V1();
                                String eventArgumentsString = rVar.f19113b.toString();
                                kotlin.jvm.internal.j.g(eventArgumentsString, "eventArgumentsString");
                                try {
                                    com.google.gson.q qVarG = T2.x(eventArgumentsString).g();
                                    String strJ = qVarG.m("event_name").j();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    com.google.gson.o oVarM = qVarG.m("attributes");
                                    if (oVarM != null && !(oVarM instanceof com.google.gson.p)) {
                                        Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                                        while (((com.google.gson.internal.h) it).hasNext()) {
                                            com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                            linkedHashMap.put(jVarB.getKey(), ((com.google.gson.o) jVarB.getValue()).j());
                                        }
                                    }
                                    linkedHashMap.toString();
                                    yk.a.a();
                                    R8.a aVar = (R8.a) aVarV1.c.get();
                                    kotlin.jvm.internal.j.d(strJ);
                                    ((MayaLoadActivity) aVar).Y1(strJ, linkedHashMap);
                                    break;
                                } catch (Exception unused2) {
                                    ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
                                    yk.a.d();
                                }
                                tVar.success("");
                                return;
                            }
                            break;
                        case 447853137:
                            if (str4.equals("getKycStatus")) {
                                AbstractC1331a.t("kyc_status", mayaLoadActivity.V1().e.l(), tVar);
                                return;
                            }
                            break;
                        case 827711050:
                            if (str4.equals("getToggle")) {
                                M7.a aVarV12 = mayaLoadActivity.V1();
                                Map<String, Boolean> loadFlutterToggles = aVarV12.e.e().getLoadFlutterToggles();
                                A5.b bVar = A5.b.f49A0;
                                S5.c cVar = aVarV12.f;
                                Map mapH = M.h(new Pair("load_min_detection", Boolean.valueOf(S5.c.b(cVar, bVar))), new Pair("load_mobile_google_ad", Boolean.valueOf(S5.c.b(cVar, A5.b.f52B0))), new Pair("load_broadband_google_ad", Boolean.valueOf(S5.c.b(cVar, A5.b.f149z0))), new Pair("load_base_product_price", Boolean.valueOf(S5.c.b(cVar, A5.b.f54C0))));
                                kotlin.jvm.internal.j.d(loadFlutterToggles);
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(loadFlutterToggles);
                                linkedHashMap2.putAll(mapH);
                                tVar.success(linkedHashMap2);
                                return;
                            }
                            break;
                        case 929957753:
                            if (str4.equals("getSessionToken")) {
                                AbstractC1331a.t("session_token", mayaLoadActivity.V1().e.s(), tVar);
                                return;
                            }
                            break;
                        case 1243551146:
                            if (str4.equals("onSessionTimeout")) {
                                mayaLoadActivity.n1().a();
                                return;
                            }
                            break;
                        case 1671672458:
                            if (str4.equals("dismiss")) {
                                yk.a.a();
                                if (str3.equals("packages/paymaya_checkout")) {
                                    mayaLoadActivity.getClass();
                                    FlutterEngineCache.getInstance().remove("checkoutFullscreen");
                                    mayaLoadActivity.W1();
                                    return;
                                } else {
                                    if (str3.equals("packages/maya_load")) {
                                        mayaLoadActivity.getClass();
                                        FlutterEngineCache.getInstance().remove("loadFullscreen");
                                        mayaLoadActivity.X1();
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                    }
                }
                tVar.notImplemented();
                return;
            case 2:
                pg.r rVar2 = (pg.r) this.f1274b;
                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) this.c;
                pg.t tVar2 = (pg.t) this.f1275d;
                String str6 = (String) this.e;
                int i4 = MayaShopV2Activity.f13985B;
                String str7 = rVar2.f19112a;
                if (str7 != null) {
                    switch (str7.hashCode()) {
                        case -1682957889:
                            if (str7.equals("getAccessToken")) {
                                strB2 = mayaShopV2Activity.V1().e.b();
                                str2 = "access_token";
                                AbstractC1331a.t(str2, strB2, tVar2);
                                return;
                            }
                            break;
                        case -1249356004:
                            if (str7.equals("getMin")) {
                                strB2 = mayaShopV2Activity.V1().e.r();
                                str2 = "min";
                                AbstractC1331a.t(str2, strB2, tVar2);
                                return;
                            }
                            break;
                        case -1179101518:
                            if (str7.equals("getShieldSessionId")) {
                                mayaShopV2Activity.V1();
                                strB2 = i0.b();
                                str2 = "shield_session_id";
                                AbstractC1331a.t(str2, strB2, tVar2);
                                return;
                            }
                            break;
                        case -670914607:
                            if (str7.equals("getAvailability")) {
                                Map<String, Boolean> flutterAvailability2 = mayaShopV2Activity.V1().e.e().getFlutterAvailability();
                                kotlin.jvm.internal.j.f(flutterAvailability2, "getFlutterAvailability(...)");
                                tVar2.success(flutterAvailability2);
                                return;
                            }
                            break;
                        case -599445191:
                            if (str7.equals("complete")) {
                                if (!str6.equals("packages/paymaya_checkout")) {
                                    if (str6.equals("packages/maya_load")) {
                                        mayaShopV2Activity.getClass();
                                        FlutterEngineCache.getInstance().remove("loadShopFullscreen");
                                        mayaShopV2Activity.n1();
                                        B5.i.j(mayaShopV2Activity);
                                        return;
                                    }
                                    return;
                                }
                                mayaShopV2Activity.getClass();
                                FlutterEngineCache.getInstance().remove("checkoutFullscreen");
                                mayaShopV2Activity.X1();
                                Boolean bool = (Boolean) rVar2.a("showReceipt");
                                Bb.a aVarV13 = mayaShopV2Activity.V1();
                                if (bool == null || !bool.booleanValue()) {
                                    MayaShopV2Activity mayaShopV2Activity2 = (MayaShopV2Activity) ((Yb.b) aVarV13.c.get());
                                    mayaShopV2Activity2.n1();
                                    B5.i.i(mayaShopV2Activity2);
                                    return;
                                }
                                MayaShopV2Activity mayaShopV2Activity3 = (MayaShopV2Activity) ((Yb.b) aVarV13.c.get());
                                Fragment fragmentFindFragmentByTag = mayaShopV2Activity3.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaShopV2Activity3, MayaShopPaymentFragment.class));
                                MayaShopPaymentFragment mayaShopPaymentFragment = fragmentFindFragmentByTag instanceof MayaShopPaymentFragment ? (MayaShopPaymentFragment) fragmentFindFragmentByTag : null;
                                if (mayaShopPaymentFragment != null) {
                                    String str8 = mayaShopV2Activity3.f13994v;
                                    if (str8 == null) {
                                        kotlin.jvm.internal.j.n("mOrderId");
                                        throw null;
                                    }
                                    Xb.o oVar = (Xb.o) mayaShopPaymentFragment.Y1();
                                    ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).E1();
                                    Ah.p<Order> purchaseOrderStatus = oVar.i.f11477b.getPurchaseOrderStatus(str8);
                                    int i6 = 1;
                                    oVar.e(new Lh.d(new Lh.d(AbstractC1331a.l(purchaseOrderStatus, purchaseOrderStatus, zh.b.a()), new Xb.j(oVar, i6), 2), new Xb.k(oVar, i6), 0).e());
                                    return;
                                }
                                return;
                            }
                            break;
                        case -476469337:
                            if (str7.equals("finishCurrentModuleForCard")) {
                                if (str6.equals("packages/maya_load")) {
                                    pg.u uVar3 = mayaShopV2Activity.f13993u;
                                    if (uVar3 == null) {
                                        kotlin.jvm.internal.j.n("loadFullscreenMethodChannel");
                                        throw null;
                                    }
                                    uVar3.a("onModuleResult", rVar2.f19113b, null);
                                }
                                tVar2.success(Boolean.TRUE);
                                return;
                            }
                            break;
                        case -169040651:
                            if (str7.equals("requestCheckout")) {
                                String str9 = (String) rVar2.a("paymentId");
                                if (str9 != null) {
                                    mayaShopV2Activity.d2(str9);
                                    return;
                                }
                                return;
                            }
                            break;
                        case -67833007:
                            if (str7.equals("getPinningFingerprint")) {
                                mayaShopV2Activity.V1();
                                tVar2.success("");
                                return;
                            }
                            break;
                        case 200708888:
                            if (str7.equals("logAnalyticsEvent")) {
                                Bb.a aVarV14 = mayaShopV2Activity.V1();
                                String eventArgumentsString2 = rVar2.f19113b.toString();
                                kotlin.jvm.internal.j.g(eventArgumentsString2, "eventArgumentsString");
                                try {
                                    com.google.gson.q qVarG2 = T2.x(eventArgumentsString2).g();
                                    String strJ2 = qVarG2.m("event_name").j();
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    com.google.gson.o oVarM2 = qVarG2.m("attributes");
                                    if (oVarM2 != null && !(oVarM2 instanceof com.google.gson.p)) {
                                        Iterator it2 = ((com.google.gson.internal.i) oVarM2.g().f10034a.entrySet()).iterator();
                                        while (((com.google.gson.internal.h) it2).hasNext()) {
                                            com.google.gson.internal.j jVarB2 = ((com.google.gson.internal.h) it2).b();
                                            linkedHashMap3.put(jVarB2.getKey(), ((com.google.gson.o) jVarB2.getValue()).j());
                                        }
                                    }
                                    linkedHashMap3.toString();
                                    yk.a.a();
                                    Yb.b bVar2 = (Yb.b) aVarV14.c.get();
                                    kotlin.jvm.internal.j.d(strJ2);
                                    ((MayaShopV2Activity) bVar2).Y1(strJ2, linkedHashMap3);
                                    break;
                                } catch (Exception e) {
                                    ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString2);
                                    yk.a.d();
                                    e.printStackTrace();
                                }
                                tVar2.success("");
                                return;
                            }
                            break;
                        case 447853137:
                            if (str7.equals("getKycStatus")) {
                                AbstractC1331a.t("kyc_status", mayaShopV2Activity.V1().e.l(), tVar2);
                                return;
                            }
                            break;
                        case 929957753:
                            if (str7.equals("getSessionToken")) {
                                AbstractC1331a.t("session_token", mayaShopV2Activity.V1().e.s(), tVar2);
                                return;
                            }
                            break;
                        case 1203902891:
                            if (str7.equals("showUpgradeScreen")) {
                                EnumC1215d enumC1215d = EnumC1215d.SHOP;
                                EnumC1216e enumC1216e = EnumC1216e.DASHBOARD;
                                mayaShopV2Activity.getClass();
                                String string = mayaShopV2Activity.getString(R.string.maya_label_upgrade_dialog_title);
                                kotlin.jvm.internal.j.f(string, "getString(...)");
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string, mayaShopV2Activity.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaShopV2Activity.getString(R.string.maya_label_upgrade_now), new N9.f(mayaShopV2Activity, 19)), new Pair(mayaShopV2Activity.getString(R.string.maya_label_maybe_later), null), null, 96);
                                mayaAlertBottomSheetDialogFragmentN.s1(enumC1215d);
                                mayaAlertBottomSheetDialogFragmentN.f11820c0 = enumC1216e;
                                FragmentTransaction fragmentTransactionBeginTransaction = mayaShopV2Activity.getSupportFragmentManager().beginTransaction();
                                kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                                fragmentTransactionBeginTransaction.add(mayaAlertBottomSheetDialogFragmentN, "alert_dialog");
                                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                                return;
                            }
                            break;
                        case 1243551146:
                            if (str7.equals("onSessionTimeout")) {
                                mayaShopV2Activity.n1().a();
                                return;
                            }
                            break;
                        case 1671672458:
                            if (str7.equals("dismiss")) {
                                if (str6.equals("packages/paymaya_checkout")) {
                                    mayaShopV2Activity.getClass();
                                    FlutterEngineCache.getInstance().remove("checkoutFullscreen");
                                    mayaShopV2Activity.X1();
                                    return;
                                }
                                if (str6.equals("packages/maya_load")) {
                                    mayaShopV2Activity.getClass();
                                    FlutterEngineCache.getInstance().remove("loadShopFullscreen");
                                    FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
                                    kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
                                    FlutterEngine flutterEngine = flutterEngineCache.get("loadShopFullscreen");
                                    if (flutterEngine == null) {
                                        flutterEngine = new FlutterEngine(mayaShopV2Activity);
                                        flutterEngineCache.put("loadShopFullscreen", flutterEngine);
                                    }
                                    mayaShopV2Activity.f13992t = flutterEngine;
                                    pg.u uVar4 = new pg.u(flutterEngine.getDartExecutor().getBinaryMessenger(), "packages/maya_load");
                                    mayaShopV2Activity.f13993u = uVar4;
                                    uVar4.b(new Zb.a(mayaShopV2Activity, 1));
                                    FlutterEngine flutterEngine2 = mayaShopV2Activity.f13992t;
                                    if (flutterEngine2 == null) {
                                        kotlin.jvm.internal.j.n("loadFlutterFullscreenEngine");
                                        throw null;
                                    }
                                    flutterEngine2.getNavigationChannel().setInitialRoute("home");
                                    FlutterEngine flutterEngine3 = mayaShopV2Activity.f13992t;
                                    if (flutterEngine3 != null) {
                                        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "package:paymaya_module/main.dart", "runLoad"));
                                        return;
                                    } else {
                                        kotlin.jvm.internal.j.n("loadFlutterFullscreenEngine");
                                        throw null;
                                    }
                                }
                                return;
                            }
                            break;
                    }
                }
                tVar2.notImplemented();
                return;
            case 3:
                ((ImageCapture) this.e).lambda$takePicture$2((ImageCapture.OutputFileOptions) this.f1274b, (Executor) this.c, (ImageCapture.OnImageSavedCallback) this.f1275d);
                return;
            case 4:
                ((DefaultSurfaceProcessor) this.f1274b).lambda$initGlRenderer$9((DynamicRange) this.c, (Map) this.f1275d, (CallbackToFutureAdapter.Completer) this.e);
                return;
            case 5:
                ((DualSurfaceProcessor) this.f1274b).lambda$initGlRenderer$5((DynamicRange) this.c, (Map) this.f1275d, (CallbackToFutureAdapter.Completer) this.e);
                return;
            case 6:
                ((MediaSourceEventListener.EventDispatcher) this.f1274b).lambda$upstreamDiscarded$4((MediaSourceEventListener) this.c, (MediaSource.MediaPeriodId) this.f1275d, (MediaLoadData) this.e);
                return;
            case 7:
                Schedulers.lambda$registerRescheduling$0((List) this.f1274b, (WorkGenerationalId) this.c, (Configuration) this.f1275d, (WorkDatabase) this.e);
                return;
            case 8:
                ((com.shield.android.f.f) this.f1274b).a((ShieldCallback) this.c, (Looper) this.f1275d, (Thread) this.e);
                return;
            case 9:
                c1.i iVar = (c1.i) this.c;
                String str10 = iVar.f9230a;
                Z0.h hVar = (Z0.h) this.f1275d;
                c1.h hVar2 = (c1.h) this.e;
                h1.a aVar2 = (h1.a) this.f1274b;
                aVar2.getClass();
                Logger logger = h1.a.f;
                try {
                    d1.f fVarA = aVar2.c.a(str10);
                    if (fVarA == null) {
                        String str11 = "Transport backend '" + str10 + "' is not registered";
                        logger.warning(str11);
                        hVar.b(new IllegalArgumentException(str11));
                    } else {
                        ((C1659g) aVar2.e).k(new Bb.c(29, aVar2, iVar, ((C0622c) fVarA).a(hVar2)));
                        hVar.b(null);
                    }
                    return;
                } catch (Exception e7) {
                    logger.warning("Error scheduling event " + e7.getMessage());
                    hVar.b(e7);
                    return;
                }
            case 10:
                ((FlutterFirebaseCorePlugin) this.f1274b).lambda$initializeApp$2((GeneratedAndroidFirebaseCore.PigeonFirebaseOptions) this.c, (String) this.f1275d, (TaskCompletionSource) this.e);
                return;
            case 11:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f1274b).lambda$onFormResubmission$19((WebView) this.c, (Message) this.f1275d, (Message) this.e);
                return;
            case 12:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f1274b).lambda$onReceivedSslError$29((WebView) this.c, (SslErrorHandler) this.f1275d, (SslError) this.e);
                return;
            case 13:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f1274b).lambda$onReceivedError$7((WebView) this.c, (WebResourceRequest) this.f1275d, (WebResourceErrorCompat) this.e);
                return;
            case 14:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f1274b).lambda$onReceivedHttpError$5((WebView) this.c, (WebResourceRequest) this.f1275d, (WebResourceResponse) this.e);
                return;
            case 15:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f1274b).lambda$onFormResubmission$19((WebView) this.c, (Message) this.f1275d, (Message) this.e);
                return;
            case 16:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f1274b).lambda$onReceivedSslError$29((WebView) this.c, (SslErrorHandler) this.f1275d, (SslError) this.e);
                return;
            case 17:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f1274b).lambda$onReceivedError$7((WebView) this.c, (WebResourceRequest) this.f1275d, (WebResourceError) this.e);
                return;
            case 18:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f1274b).lambda$onReceivedHttpError$5((WebView) this.c, (WebResourceRequest) this.f1275d, (WebResourceResponse) this.e);
                return;
            default:
                C1915b c1915b = (C1915b) this.f1274b;
                String str12 = (String) ((AtomicMarkableReference) c1915b.h).getReference();
                String str13 = (String) this.c;
                j2.h hVar3 = (j2.h) c1915b.c;
                if (str12 != null) {
                    hVar3.j(str13, (String) ((AtomicMarkableReference) c1915b.h).getReference());
                }
                Map map = (Map) this.f1275d;
                if (!map.isEmpty()) {
                    hVar3.h(str13, map, false);
                }
                List list = (List) this.e;
                if (list.isEmpty()) {
                    return;
                }
                hVar3.i(str13, list);
                return;
        }
    }

    public /* synthetic */ RunnableC0219b(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1273a = i;
        this.f1274b = obj;
        this.c = obj2;
        this.f1275d = obj3;
        this.e = obj4;
    }
}
