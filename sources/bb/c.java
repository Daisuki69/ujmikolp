package Bb;

import A7.r;
import Bj.F;
import Bj.H;
import G7.C0260c;
import M8.T2;
import Na.q;
import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.extensions.ExtensionsManager;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.app.ShareCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.work.ListenableFutureKt;
import cj.L;
import cj.M;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.events.EventFieldsProvider;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.DTXActionImpl;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewInfo;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.common.utility.i0;
import com.paymaya.data.database.repository.y;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FavoriteStatus;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.model.User;
import com.paymaya.domain.store.C1280q0;
import com.paymaya.domain.store.O0;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaSecurityFlutterScreen;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUpdateNameFlutterScreen;
import com.paymaya.mayaui.qr.view.activity.impl.MayaRequestMoneyActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFragment;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaDeviceManagementActivity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyV3Activity;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3Fragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3NewFragment;
import d4.AbstractC1331a;
import de.x;
import de.z;
import e2.C1420b;
import i2.C1585a;
import io.flutter.embedding.engine.FlutterEngineCache;
import j1.C1659g;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import k1.InterfaceC1690a;
import k2.v0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import pg.s;
import pg.t;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Ch.a, NativeCustomFormatAd.OnCustomFormatAdLoadedListener, s, OnCompleteListener, g0, OnFailureListener, Continuation, Ch.f, OnSuccessListener, CallbackToFutureAdapter.Resolver, GuardedEventDispatcher.GuardedOperation, SuccessContinuation, Ch.c, InterfaceC1690a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f393b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f394d;

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.f392a = i;
        this.f393b = obj;
        this.c = obj2;
        this.f394d = obj3;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        List list = (List) obj;
        String str = (String) this.c;
        C1280q0 c1280q0 = (C1280q0) this.f393b;
        y yVar = c1280q0.e;
        yVar.f11328a.b("online_payment", "category = ?", new String[]{str});
        yVar.a(list);
        if (list.size() < 20) {
            c1280q0.f.onNext(new HttpException(Response.error(404, ResponseBody.create(MediaType.parse("application/json"), "{\"error\":{\"code\":-6}}"))));
        }
        c1280q0.b(str, (String) this.f394d);
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f392a) {
            case 12:
                Xb.f fVar = (Xb.f) this.f393b;
                ShopProviderCategory shopProviderCategory = (ShopProviderCategory) this.c;
                ShopHomeSectionCarousel shopHomeSectionCarousel = (ShopHomeSectionCarousel) this.f394d;
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                O0 o02 = fVar.f6567d;
                String categoryCode = shopProviderCategory.getCode();
                o02.getClass();
                kotlin.jvm.internal.j.g(categoryCode, "categoryCode");
                List listB = o02.c.b(new J1.e(categoryCode, 2));
                List list = listB;
                if (list == null || list.isEmpty()) {
                    ((MayaShopHomePageFragment) ((bc.b) fVar.c.get())).T1("Load");
                    return new Pair(null, throwable);
                }
                shopHomeSectionCarousel.setList(listB);
                ((MayaShopHomePageFragment) ((bc.b) fVar.c.get())).Q1(shopHomeSectionCarousel);
                return new Pair(new ShopProviderBase(listB, null), throwable);
            default:
                return ((Transfer) obj).toBuilder().mTransferRecipient((TransferRecipient) this.f393b).mTransferAmount((Amount) this.c).mMessage((String) this.f394d).build();
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f392a) {
            case 14:
                return ((DefaultSurfaceProcessor) this.f393b).lambda$initGlRenderer$10((DynamicRange) this.c, (Map) this.f394d, completer);
            case 15:
                return ((DualSurfaceProcessor) this.f393b).lambda$initGlRenderer$6((DynamicRange) this.c, (Map) this.f394d, completer);
            case 16:
                return ExtensionsManager.lambda$getInstanceAsync$0((ClientVersion) this.f393b, (Context) this.c, (CameraProvider) this.f394d, completer);
            case 17:
                return ListenableFutureKt.executeAsync$lambda$4((Executor) this.f393b, (String) this.c, (Function0) this.f394d, completer);
            default:
                return ListenableFutureKt.launchFuture$lambda$1((CoroutineContext) this.f393b, (F) this.c, (Function2) this.f394d, completer);
        }
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        Object obj = this.c;
        Object obj2 = this.f394d;
        Object obj3 = this.f393b;
        switch (this.f392a) {
            case 6:
                MayaRequestMoneyFragment mayaRequestMoneyFragment = (MayaRequestMoneyFragment) obj3;
                q qVar = mayaRequestMoneyFragment.f13646i0;
                if (qVar != null) {
                    String string = mayaRequestMoneyFragment.getString(R.string.pma_label_qr_share_message, (String) obj, (String) obj2);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    String name = file.getName();
                    kotlin.jvm.internal.j.f(name, "getName(...)");
                    Uri uriC = h0.c(mayaRequestMoneyFragment.requireActivity(), file);
                    kotlin.jvm.internal.j.f(uriC, "getPhotoUri(...)");
                    MayaRequestMoneyActivity mayaRequestMoneyActivity = (MayaRequestMoneyActivity) qVar;
                    ComponentName componentName = mayaRequestMoneyActivity.getComponentName();
                    Intent action = new Intent().setAction("android.intent.action.SEND");
                    action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE, mayaRequestMoneyActivity.getPackageName());
                    action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, mayaRequestMoneyActivity.getPackageName());
                    action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
                    action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
                    action.addFlags(524288);
                    action.addFlags(1);
                    String string2 = mayaRequestMoneyActivity.getString(R.string.pma_label_request_money);
                    action.putExtra("android.intent.extra.TEXT", string);
                    action.setType(MimeTypes.IMAGE_JPEG);
                    action.putExtra("android.intent.extra.STREAM", uriC);
                    ShareSaveDialogFragment shareSaveDialogFragment = new ShareSaveDialogFragment();
                    Bundle bundleE = androidx.media3.datasource.cache.c.e("title", string2, "filename", name);
                    bundleE.putParcelable("intent", action);
                    shareSaveDialogFragment.setArguments(bundleE);
                    shareSaveDialogFragment.show(mayaRequestMoneyActivity.getSupportFragmentManager(), "share");
                }
                break;
            case 27:
                RequestMoneyV3Fragment requestMoneyV3Fragment = (RequestMoneyV3Fragment) obj3;
                x xVar = requestMoneyV3Fragment.f14739j0;
                if (xVar != null) {
                    String string3 = requestMoneyV3Fragment.getString(R.string.pma_label_qr_share_message, (String) obj, (String) obj2);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    String name2 = file.getName();
                    kotlin.jvm.internal.j.f(name2, "getName(...)");
                    Uri uriC2 = h0.c(requestMoneyV3Fragment.requireActivity(), file);
                    kotlin.jvm.internal.j.f(uriC2, "getPhotoUri(...)");
                    ((RequestMoneyV3Activity) xVar).t1(uriC2, string3, name2);
                }
                break;
            default:
                RequestMoneyV3NewFragment requestMoneyV3NewFragment = (RequestMoneyV3NewFragment) obj3;
                z zVar = requestMoneyV3NewFragment.f14758k0;
                if (zVar != null) {
                    String string4 = requestMoneyV3NewFragment.getString(R.string.pma_label_qr_share_message, (String) obj, (String) obj2);
                    kotlin.jvm.internal.j.f(string4, "getString(...)");
                    String name3 = file.getName();
                    kotlin.jvm.internal.j.f(name3, "getName(...)");
                    Uri uriC3 = h0.c(requestMoneyV3NewFragment.requireActivity(), file);
                    kotlin.jvm.internal.j.f(uriC3, "getPhotoUri(...)");
                    ((RequestMoneyV3Activity) zVar).t1(uriC3, string4, name3);
                }
                break;
        }
    }

    @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
    public void execute(RumEventDispatcher rumEventDispatcher) {
        switch (this.f392a) {
            case 19:
                Core.lambda$sendEvent$2((Session) this.f393b, (JSONObject) this.c, (Object[]) this.f394d, rumEventDispatcher);
                break;
            case 20:
                ((DTXActionImpl) this.f393b).lambda$reportError$1((Throwable) this.c, (String) this.f394d, rumEventDispatcher);
                break;
            case 21:
                Dynatrace.lambda$reportError$1((Session) this.f393b, (Throwable) this.c, (String) this.f394d, rumEventDispatcher);
                break;
            default:
                Dynatrace.lambda$sendExceptionEvent$2((Session) this.f393b, (Throwable) this.c, (EventFieldsProvider) this.f394d, rumEventDispatcher);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task it) {
        switch (this.f392a) {
            case 5:
                kotlin.jvm.internal.j.g(it, "it");
                if (it.isSuccessful()) {
                    ReviewInfo reviewInfo = (ReviewInfo) it.getResult();
                    com.google.android.play.core.review.b bVar = (com.google.android.play.core.review.b) ((I1.a) this.f393b);
                    FragmentActivity fragmentActivity = (FragmentActivity) this.c;
                    Task taskA = bVar.a(fragmentActivity, reviewInfo);
                    kotlin.jvm.internal.j.f(taskA, "launchReviewFlow(...)");
                    taskA.addOnCompleteListener(new r(15, (Function0) this.f394d, fragmentActivity));
                }
                break;
            default:
                com.shield.android.a.b.a((JSONObject) this.f393b, (com.shield.android.a.b) this.c, (CountDownLatch) this.f394d, it);
                break;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener
    public void onCustomFormatAdLoaded(NativeCustomFormatAd ad2) {
        Uri uri;
        kotlin.jvm.internal.j.g(ad2, "ad");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C4.c cVar = (C4.c) this.f393b;
        cVar.c.put((String) this.c, ad2);
        String str = cVar.f734d;
        NativeAd.Image image = ad2.getImage(str);
        String string = (image == null || (uri = image.getUri()) == null) ? null : uri.toString();
        String str2 = cVar.e;
        CharSequence text = ad2.getText(str2);
        String string2 = text != null ? text.toString() : null;
        String str3 = cVar.f;
        CharSequence text2 = ad2.getText(str3);
        String string3 = text2 != null ? text2.toString() : null;
        String str4 = cVar.f735g;
        CharSequence text3 = ad2.getText(str4);
        String string4 = text3 != null ? text3.toString() : null;
        if (string != null) {
            linkedHashMap.put(str, string);
        }
        if (string2 != null) {
            linkedHashMap.put(str2, string2);
        }
        if (string3 != null) {
            linkedHashMap.put(str3, string3);
        }
        if (string4 != null) {
            linkedHashMap.put(str4, Boolean.valueOf(string4.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)));
        }
        Log.d("NativeAdCarouselVM", "Ad data loaded: " + linkedHashMap);
        ad2.recordImpression();
        boolean zIsEmpty = linkedHashMap.isEmpty();
        t tVar = (t) this.f394d;
        if (zIsEmpty) {
            tVar.error("EMPTY_AD_DATA", "Ad data is empty", null);
        } else {
            tVar.success(linkedHashMap);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.k] */
    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        Gj.c cVar = (Gj.c) this.f393b;
        PayMayaApplication context = (PayMayaApplication) this.c;
        kotlin.jvm.internal.j.g(context, "$context");
        ?? r22 = (kotlin.jvm.internal.k) this.f394d;
        kotlin.jvm.internal.j.g(it, "it");
        H.w(cVar, null, null, new R4.h(context, r22, null), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    public void onMethodCall(pg.r call, t result) {
        Object obj = this.f394d;
        Object obj2 = this.c;
        Object obj3 = this.f393b;
        switch (this.f392a) {
            case 2:
                Function0 function0 = MayaSecurityFlutterScreen.f12178g;
                kotlin.jvm.internal.j.g(call, "call");
                kotlin.jvm.internal.j.g(result, "result");
                String str = call.f19112a;
                if (str != null) {
                    MayaSecurityFlutterScreen mayaSecurityFlutterScreen = (MayaSecurityFlutterScreen) obj3;
                    switch (str.hashCode()) {
                        case -1997803791:
                            if (str.equals("getTransferLimitsMaintenanceModeToggle")) {
                                S5.c cVar = mayaSecurityFlutterScreen.f;
                                if (cVar != null) {
                                    result.success(Boolean.valueOf(S5.c.b(cVar, A5.b.f62G1)));
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n("flagConfigurationService");
                                    throw null;
                                }
                            }
                            return;
                        case -1983908634:
                            if (str.equals("getInstapayLimitInfo")) {
                                S5.c cVar2 = mayaSecurityFlutterScreen.f;
                                if (cVar2 == null) {
                                    kotlin.jvm.internal.j.n("flagConfigurationService");
                                    throw null;
                                }
                                String strD = cVar2.d(A5.f.f159g);
                                try {
                                    com.google.gson.o oVarM = T2.x(strD).g().m("instapay_limit_info");
                                    Object objJ = oVarM != null ? oVarM.j() : null;
                                    result.success(objJ == null ? "" : objJ);
                                    return;
                                } catch (Exception unused) {
                                    ">>>> Failed to parse instapay_limit_info from: ".concat(strD);
                                    yk.a.d();
                                    result.success("");
                                    return;
                                }
                            }
                            return;
                        case -1799253995:
                            if (str.equals("getSct2FeaturesToggle")) {
                                S5.c cVar3 = mayaSecurityFlutterScreen.f;
                                if (cVar3 != null) {
                                    result.success(Boolean.valueOf(S5.c.b(cVar3, A5.b.p1)));
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n("flagConfigurationService");
                                    throw null;
                                }
                            }
                            return;
                        case -1793560251:
                            if (str.equals("getKycLevel")) {
                                com.paymaya.data.preference.a aVar = mayaSecurityFlutterScreen.f12179d;
                                if (aVar != null) {
                                    AbstractC1331a.t("kyc_level", aVar.k(), result);
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n("preference");
                                    throw null;
                                }
                            }
                            return;
                        case -1750302187:
                            if (str.equals("getLoginHistoryToggle")) {
                                S5.c cVar4 = mayaSecurityFlutterScreen.f;
                                if (cVar4 != null) {
                                    result.success(Boolean.valueOf(S5.c.b(cVar4, A5.b.R0)));
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n("flagConfigurationService");
                                    throw null;
                                }
                            }
                            return;
                        case -1682957889:
                            if (str.equals("getAccessToken")) {
                                com.paymaya.data.preference.a aVar2 = mayaSecurityFlutterScreen.f12179d;
                                if (aVar2 != null) {
                                    AbstractC1331a.t("access_token", aVar2.b(), result);
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n("preference");
                                    throw null;
                                }
                            }
                            return;
                        case -1678179184:
                            if (str.equals("toLandersApplication")) {
                                Function0 function02 = MayaSecurityFlutterScreen.f12178g;
                                if (function02 == null) {
                                    kotlin.jvm.internal.j.n("onCardsNavigate");
                                    throw null;
                                }
                                function02.invoke();
                                mayaSecurityFlutterScreen.finishActivity(66);
                                mayaSecurityFlutterScreen.finish();
                                return;
                            }
                            return;
                        case -1579335544:
                            if (str.equals("changeEmailAddress")) {
                                mayaSecurityFlutterScreen.g1();
                                B5.i.V(mayaSecurityFlutterScreen, "account_recovery");
                                return;
                            }
                            return;
                        case -1440403640:
                            if (str.equals("getSourceAttributes")) {
                                result.success(L.c(new Pair("attributes", M.h(new Pair("source_page", (String) obj2), new Pair("source_button", (String) obj)))));
                                return;
                            }
                            return;
                        case -503990150:
                            if (str.equals("callChatWithUs")) {
                                mayaSecurityFlutterScreen.g1();
                                B5.i.k(mayaSecurityFlutterScreen, "paymaya://chatwithus");
                                return;
                            }
                            return;
                        case -3739394:
                            if (str.equals("manageCards")) {
                                Function0 function03 = MayaSecurityFlutterScreen.f12178g;
                                if (function03 == null) {
                                    kotlin.jvm.internal.j.n("onCardsNavigate");
                                    throw null;
                                }
                                function03.invoke();
                                mayaSecurityFlutterScreen.finishActivity(66);
                                mayaSecurityFlutterScreen.finish();
                                return;
                            }
                            return;
                        case 200708888:
                            if (str.equals("logAnalyticsEvent")) {
                                try {
                                    com.google.gson.q qVarG = T2.x(call.f19113b.toString()).g();
                                    String strJ = qVarG.m("event_name").j();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    com.google.gson.o oVarM2 = qVarG.m("attributes");
                                    if (oVarM2 != null && !(oVarM2 instanceof com.google.gson.p)) {
                                        Iterator it = ((com.google.gson.internal.i) oVarM2.g().f10034a.entrySet()).iterator();
                                        while (((com.google.gson.internal.h) it).hasNext()) {
                                            com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                            linkedHashMap.put(jVarB.getKey(), ((com.google.gson.o) jVarB.getValue()).j());
                                        }
                                    }
                                    linkedHashMap.toString();
                                    yk.a.a();
                                    C1220i c1220i = mayaSecurityFlutterScreen.e;
                                    if (c1220i == null) {
                                        kotlin.jvm.internal.j.n("analyticsUtils");
                                        throw null;
                                    }
                                    C1219h c1219hE = C1219h.e(strJ);
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        c1219hE.h((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    Unit unit = Unit.f18162a;
                                    c1220i.c(mayaSecurityFlutterScreen, c1219hE);
                                    return;
                                } catch (Exception e) {
                                    yk.a.d();
                                    e.printStackTrace();
                                    result.error(String.valueOf(e.getMessage()), e.getMessage(), e);
                                    return;
                                }
                            }
                            return;
                        case 929957753:
                            if (str.equals("getSessionToken")) {
                                com.paymaya.data.preference.a aVar3 = mayaSecurityFlutterScreen.f12179d;
                                if (aVar3 != null) {
                                    AbstractC1331a.t("session_token", aVar3.s(), result);
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n("preference");
                                    throw null;
                                }
                            }
                            return;
                        case 931431019:
                            if (str.equals("changePassword")) {
                                mayaSecurityFlutterScreen.g1();
                                B5.i.V(mayaSecurityFlutterScreen, "change_password");
                                return;
                            }
                            return;
                        case 1228944987:
                            if (str.equals("changeMobileNumber")) {
                                mayaSecurityFlutterScreen.g1();
                                B5.i.V(mayaSecurityFlutterScreen, "change_min");
                                return;
                            }
                            return;
                        case 1243551146:
                            if (str.equals("onSessionTimeout")) {
                                mayaSecurityFlutterScreen.g1().a();
                                return;
                            }
                            return;
                        case 1422461064:
                            if (str.equals("toKYCFlow")) {
                                mayaSecurityFlutterScreen.g1().s(mayaSecurityFlutterScreen, false);
                                return;
                            }
                            return;
                        case 1453802152:
                            if (str.equals("toMayaBlackApplication")) {
                                Function0 function04 = MayaSecurityFlutterScreen.f12178g;
                                if (function04 == null) {
                                    kotlin.jvm.internal.j.n("onCardsNavigate");
                                    throw null;
                                }
                                function04.invoke();
                                mayaSecurityFlutterScreen.finishActivity(66);
                                mayaSecurityFlutterScreen.finish();
                                return;
                            }
                            return;
                        case 1596081769:
                            if (str.equals("callLoginHistory")) {
                                mayaSecurityFlutterScreen.g1();
                                mayaSecurityFlutterScreen.startActivity(new Intent(mayaSecurityFlutterScreen, (Class<?>) MayaDeviceManagementActivity.class));
                                return;
                            }
                            return;
                        case 1671672458:
                            if (str.equals("dismiss")) {
                                FlutterEngineCache.getInstance().remove("securityCenter");
                                mayaSecurityFlutterScreen.finishActivity(66);
                                mayaSecurityFlutterScreen.finish();
                                result.success(Boolean.TRUE);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            default:
                kotlin.jvm.internal.j.g(call, "call");
                kotlin.jvm.internal.j.g(result, "result");
                String str2 = call.f19112a;
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    Le.b bVar = (Le.b) obj3;
                    com.paymaya.data.preference.a aVar4 = bVar.f2963b;
                    Activity activity = (Activity) obj2;
                    switch (iHashCode) {
                        case -1682957889:
                            if (str2.equals("getAccessToken")) {
                                AbstractC1331a.t("access_token", aVar4.b(), result);
                                return;
                            }
                            break;
                        case -1305289599:
                            if (str2.equals("extract")) {
                                if (S5.c.b(bVar.e, A5.b.y0)) {
                                    bVar.c.c(aVar4.C(), "lending", "credit-card", new Cg.c(13, bVar, activity, M.h(new Pair("triggeredBy", "lending"), new Pair("eventTrigger", "credit-card"))));
                                }
                                result.success(Boolean.TRUE);
                                return;
                            }
                            break;
                        case -1179101518:
                            if (str2.equals("getShieldSessionId")) {
                                AbstractC1331a.t("shield_session_id", i0.b(), result);
                                return;
                            }
                            break;
                        case 200708888:
                            if (str2.equals("logAnalyticsEvent")) {
                                try {
                                    com.google.gson.q qVarG2 = T2.x(call.f19113b.toString()).g();
                                    String strJ2 = qVarG2.m("event_name").j();
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    com.google.gson.o oVarM3 = qVarG2.m("attributes");
                                    if (oVarM3 != null && !(oVarM3 instanceof com.google.gson.p)) {
                                        Iterator it2 = ((com.google.gson.internal.i) oVarM3.g().f10034a.entrySet()).iterator();
                                        while (((com.google.gson.internal.h) it2).hasNext()) {
                                            com.google.gson.internal.j jVarB2 = ((com.google.gson.internal.h) it2).b();
                                            linkedHashMap2.put(jVarB2.getKey(), ((com.google.gson.o) jVarB2.getValue()).j());
                                        }
                                    }
                                    C1220i c1220i2 = bVar.f2964d;
                                    C1219h c1219hE2 = C1219h.e(strJ2);
                                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                        c1219hE2.h((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                    Unit unit2 = Unit.f18162a;
                                    c1220i2.c(activity, c1219hE2);
                                    return;
                                } catch (Exception e7) {
                                    yk.a.d();
                                    e7.printStackTrace();
                                    return;
                                }
                            }
                            break;
                        case 929957753:
                            if (str2.equals("getSessionToken")) {
                                AbstractC1331a.t("session_token", aVar4.s(), result);
                                return;
                            }
                            break;
                        case 1243551146:
                            if (str2.equals("onSessionTimeout")) {
                                bVar.f2962a.a();
                                return;
                            }
                            break;
                        case 1954129428:
                            if (str2.equals("onCreditScoringCompleted")) {
                                String str3 = (String) call.a("code");
                                if (str3 == null) {
                                    str3 = "";
                                }
                                C7.f fVar = (C7.f) obj;
                                if (str3.equals("200")) {
                                    String str4 = (String) call.a("dataReferenceId");
                                    Boolean bool = (Boolean) call.a("hasPermissions");
                                    fVar.invoke(new Le.d(str3, str4, String.valueOf(bool != null ? bool.booleanValue() : false)));
                                } else {
                                    String str5 = (String) call.a("message");
                                    fVar.invoke(new Le.c(str3, str5 != null ? str5 : ""));
                                }
                                LinkedHashSet linkedHashSet = E.f10412a;
                                E.a(Le.b.class.getSimpleName(), "removeCreditScoringFlutterCache");
                                FlutterEngineCache.getInstance().remove("creditScoringFullscreen");
                                bVar.b(activity);
                                activity.finishActivity(1400);
                                return;
                            }
                            break;
                    }
                }
                result.notImplemented();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Task task = (Task) this.c;
        C1420b c1420b = (C1420b) this.f394d;
        com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f393b;
        try {
            X2.f fVar = (X2.f) task.getResult();
            if (fVar != null) {
                ((Executor) rVar.f9804d).execute(new Y2.a(c1420b, ((Y.e) rVar.c).i(fVar), 1));
            }
        } catch (FirebaseRemoteConfigException e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    @Override // Ch.a
    public void run() {
        switch (this.f392a) {
            case 0:
                e eVar = (e) this.f393b;
                Transfer transfer = (Transfer) this.c;
                FavoriteDetails favoriteDetailsWithUpdate = (FavoriteDetails) this.f394d;
                eVar.getClass();
                kotlin.jvm.internal.j.g(transfer, "transfer");
                kotlin.jvm.internal.j.g(favoriteDetailsWithUpdate, "favoriteDetailsWithUpdate");
                MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment = (MayaSendMoneyConfirmationFragment) ((Fb.a) eVar.c.get());
                mayaSendMoneyConfirmationFragment.getClass();
                Gb.b bVar = mayaSendMoneyConfirmationFragment.f13761g0;
                if (bVar == null) {
                    kotlin.jvm.internal.j.n("mMayaSendMoneyConfirmationFragmentListener");
                    throw null;
                }
                ((MayaSendMoneyActivity) bVar).d2(transfer, favoriteDetailsWithUpdate, FavoriteStatus.FAVORITE_UPDATE_SUCCESS);
                return;
            case 3:
                C0260c c0260c = MayaUpdateNameFlutterScreen.i;
                com.google.gson.q qVarG = T2.x(((pg.r) this.f393b).f19113b.toString()).g().m("profile_name").g();
                String strJ = qVarG.m("first_name").j();
                String strJ2 = qVarG.m("middle_name").j();
                String strJ3 = qVarG.m("last_name").j();
                MayaUpdateNameFlutterScreen mayaUpdateNameFlutterScreen = (MayaUpdateNameFlutterScreen) this.c;
                User userBuild = mayaUpdateNameFlutterScreen.h1().a().toBuilder().mFirstName(strJ).mMiddleName(strJ2).mLastName(strJ3).build();
                com.paymaya.data.database.repository.H h = mayaUpdateNameFlutterScreen.h1().f11421b;
                h.getClass();
                ContentValues contentValues = new ContentValues();
                contentValues.put("first_name", userBuild.mFirstName());
                contentValues.put("middle_name", userBuild.mMiddleName());
                contentValues.put("last_name", userBuild.mLastName());
                h.f11300a.e("user", contentValues, "user_id = ?", new String[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE});
                C0260c c0260c2 = MayaUpdateNameFlutterScreen.i;
                if (c0260c2 == null) {
                    kotlin.jvm.internal.j.n("onSuccessfulUpdate");
                    throw null;
                }
                c0260c2.invoke();
                ((t) this.f394d).success(Boolean.TRUE);
                return;
            case 7:
                Ag.j jVar = (Ag.j) this.c;
                N9.f fVar = (N9.f) this.f394d;
                Ne.d dVar = (Ne.d) this.f393b;
                Ne.c cVar = new Ne.c(dVar, jVar, fVar);
                dVar.f4395g = cVar;
                dVar.f4393b.requestLocationUpdates(dVar.f4394d, cVar, Looper.getMainLooper()).addOnFailureListener(new C2.f(8));
                return;
            default:
                yk.a.f();
                ((f) this.f393b).s((String) this.c);
                ((C5.a) this.f394d).f("awaiting_device_data");
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        X2.f fVar;
        URL url;
        switch (this.f392a) {
            case 10:
                W2.e eVar = (W2.e) this.f393b;
                eVar.getClass();
                Task task2 = (Task) this.c;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                X2.f fVar2 = (X2.f) task2.getResult();
                Task task3 = (Task) this.f394d;
                return (task3.isSuccessful() && (fVar = (X2.f) task3.getResult()) != null && fVar2.c.equals(fVar.c)) ? Tasks.forResult(Boolean.FALSE) : eVar.f6218d.e(fVar2).continueWith(eVar.f6217b, new W2.d(eVar));
            default:
                X2.m mVar = (X2.m) this.f393b;
                mVar.getClass();
                Task task4 = (Task) this.c;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                Task task5 = (Task) this.f394d;
                try {
                    if (!task5.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                    }
                    try {
                        url = new URL(mVar.c(mVar.f6511n));
                        break;
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    Callback.openConnection(uRLConnectionOpenConnection);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    mVar.l(httpURLConnection, (String) task5.getResult(), ((C2.a) task4.getResult()).f668a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(Gj.c cVar, PayMayaApplication payMayaApplication, Function2 function2) {
        this.f392a = 9;
        this.f393b = cVar;
        this.c = payMayaApplication;
        this.f394d = (kotlin.jvm.internal.k) function2;
    }

    @Override // k1.InterfaceC1690a
    public Object execute() {
        h1.a aVar = (h1.a) this.f393b;
        C1659g c1659g = (C1659g) aVar.f16852d;
        c1659g.getClass();
        c1.i iVar = (c1.i) this.c;
        c1.h hVar = (c1.h) this.f394d;
        String strN = v0.n("SQLiteEventStore");
        if (Log.isLoggable(strN, 3)) {
            Log.d(strN, "Storing event with priority=" + iVar.c + ", name=" + hVar.f9226a + " for destination " + iVar.f9230a);
        }
        ((Long) c1659g.f(new C1585a(1, c1659g, hVar, iVar))).longValue();
        aVar.f16850a.a(iVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String strG;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f393b;
        String str = (String) this.c;
        com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f394d;
        String str2 = (String) obj;
        com.google.firebase.messaging.t tVarD = FirebaseMessaging.d(firebaseMessaging.f9761b);
        U1.g gVar = firebaseMessaging.f9760a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f5905b)) {
            strG = "";
        } else {
            strG = gVar.g();
        }
        String strA = firebaseMessaging.h.a();
        synchronized (tVarD) {
            String strA2 = com.google.firebase.messaging.s.a(System.currentTimeMillis(), str2, strA);
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = tVarD.f9808a.edit();
                editorEdit.putString(strG + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (sVar == null || !str2.equals(sVar.f9806a)) {
            U1.g gVar2 = firebaseMessaging.f9760a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f5905b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.f5905b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(MPDbAdapter.KEY_TOKEN, str2);
                new com.google.firebase.messaging.i(firebaseMessaging.f9761b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
