package I6;

import A5.f;
import L9.C0323a;
import Le.k;
import Le.m;
import M8.A0;
import M8.T2;
import Q6.g;
import S1.y;
import U2.A;
import U2.s;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.room.QueryInterceptorDatabase;
import b5.p;
import cj.C1110A;
import cj.C1129o;
import cj.M;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.gson.internal.h;
import com.google.gson.internal.i;
import com.google.gson.internal.j;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.CustomerAccessToken;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.Identity;
import com.paymaya.domain.model.User;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.domain.store.B;
import com.paymaya.domain.store.C;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1249b;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.activity.impl.MayaFullScreenFlutterFragmentActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.funds.view.activity.impl.FundsActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycAccountUnderReviewActivity;
import com.paymaya.mayaui.loanscreditcard.view.activity.impl.MayaLoansCreditCardActivity;
import com.paymaya.mayaui.settings.view.fragment.MayaFlutterAdsInternalOnlyFragment;
import d4.AbstractC1331a;
import dj.C1406d;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import pg.r;
import pg.t;
import pg.u;
import s5.l;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2209b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2210d;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.f2208a = i;
        this.f2209b = obj;
        this.f2210d = obj2;
        this.c = obj3;
    }

    private final void a() {
        ((SessionManager) this.f2209b).lambda$setApplicationContext$0((Context) this.f2210d, (PerfSession) this.c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
    private final void b() {
        String strB;
        String strC;
        String strA;
        Object obj;
        r rVar = (r) this.f2209b;
        String str = rVar.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            t tVar = (t) this.c;
            MayaFlutterAdsInternalOnlyFragment mayaFlutterAdsInternalOnlyFragment = (MayaFlutterAdsInternalOnlyFragment) this.f2210d;
            p pVar = null;
            string = null;
            String string = null;
            Object obj2 = rVar.f19113b;
            switch (iHashCode) {
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        mayaFlutterAdsInternalOnlyFragment.getClass();
                        q qVarG = T2.x(obj2.toString()).g();
                        String strJ = qVarG.m("event_name").j();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        o oVarM = qVarG.m("attributes");
                        if (oVarM != null && !(oVarM instanceof com.google.gson.p)) {
                            Iterator it = ((i) oVarM.g().f10034a.entrySet()).iterator();
                            while (((h) it).hasNext()) {
                                j jVarB = ((h) it).b();
                                linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                            }
                        }
                        linkedHashMap.toString();
                        yk.a.a();
                        C1219h c1219hE = C1219h.e(strJ);
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
                        }
                        mayaFlutterAdsInternalOnlyFragment.f13878K.b(c1219hE);
                        return;
                    }
                    break;
                case 310638497:
                    if (str.equals("getAdKitUserTags")) {
                        Object objE = l.c;
                        if (objE == null) {
                            objE = M.e();
                        }
                        tVar.success(objE);
                        return;
                    }
                    break;
                case 1139553253:
                    if (str.equals("getVerticalBannerHeader")) {
                        try {
                            pVar = (p) new com.google.gson.j().e(mayaFlutterAdsInternalOnlyFragment.f13879P.d(f.h), p.class);
                        } catch (Exception e) {
                            Log.e("ConfigParser", "Failed to parse VerticalBannerHeaderConfig", e);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        if (pVar != null && (strA = pVar.a()) != null) {
                            linkedHashMap2.put("badge_text", strA);
                        }
                        if (pVar != null && (strC = pVar.c()) != null) {
                            linkedHashMap2.put("title_text", strC);
                        }
                        if (pVar != null && (strB = pVar.b()) != null) {
                            linkedHashMap2.put("subtitle_text", strB);
                        }
                        tVar.success(linkedHashMap2);
                        return;
                    }
                    break;
                case 1611630172:
                    if (str.equals("showWebView")) {
                        if (obj2 instanceof String) {
                            CharSequence charSequence = (CharSequence) obj2;
                            if (((String) (charSequence.length() != 0 ? charSequence : null)) != null) {
                                mayaFlutterAdsInternalOnlyFragment.f13877B.k0(mayaFlutterAdsInternalOnlyFragment.getActivity(), (String) obj2);
                                return;
                            }
                            return;
                        }
                        if (obj2 instanceof Map) {
                            Map map = (Map) obj2;
                            if (!map.isEmpty() && (obj = map.get(ImagesContract.URL)) != null) {
                                string = obj.toString();
                            }
                            if (string != null) {
                                mayaFlutterAdsInternalOnlyFragment.f13877B.k0(mayaFlutterAdsInternalOnlyFragment.getActivity(), string);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("AD_KIT_INTERNAL_ONLY", "Unhandled method '" + str + "' for instance: engine_flutter_ads");
    }

    private final void c() {
        S2.f fVar = (S2.f) this.f2209b;
        fVar.getClass();
        s sVarY = U2.t.y();
        sVarY.i();
        U2.t.t((U2.t) sVarY.f10116b, (U2.o) this.f2210d);
        fVar.d(sVarY, (U2.i) this.c);
    }

    private final void d() {
        S2.f fVar = (S2.f) this.f2209b;
        fVar.getClass();
        s sVarY = U2.t.y();
        sVarY.i();
        U2.t.u((U2.t) sVarY.f10116b, (A) this.f2210d);
        fVar.d(sVarY, (U2.i) this.c);
    }

    private final void e() {
        S2.f fVar = (S2.f) this.f2209b;
        fVar.getClass();
        s sVarY = U2.t.y();
        sVarY.i();
        U2.t.v((U2.t) sVarY.f10116b, (U2.r) this.f2210d);
        fVar.d(sVarY, (U2.i) this.c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void f() {
        r rVar = (r) this.f2209b;
        T6.a aVar = (T6.a) this.f2210d;
        t channelResult = (t) this.c;
        String str = rVar.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1357454091:
                    if (str.equals("getProfileAndToken")) {
                        aVar.w1("getProfileAndToken");
                        C0323a c0323aT1 = aVar.t1();
                        kotlin.jvm.internal.j.g(channelResult, "channelResult");
                        Identity identityF = ((C1293x0) c0323aT1.h).f();
                        String strMType = identityF != null ? identityF.mType() : null;
                        String strMValue = identityF != null ? identityF.mValue() : null;
                        Boolean boolMVerified = identityF != null ? identityF.mVerified() : null;
                        String strL = ((com.paymaya.data.preference.a) c0323aT1.e).l();
                        if (strMType == null || strMValue == null || boolMVerified == null || strL == null) {
                            ((T6.a) ((S6.a) c0323aT1.c.get())).v1("getProfileAndToken");
                            yk.a.a();
                            channelResult.error("", "Oops! Something’s up. But don’t worry, we’re now looking into it. Please try again later.", null);
                            return;
                        }
                        B b8 = (B) c0323aT1.f;
                        String audience = ((FundsActivity) ((S6.a) c0323aT1.c.get())).f12398t;
                        b8.getClass();
                        kotlin.jvm.internal.j.g(audience, "audience");
                        Ah.p<CustomerAccessToken> customerAccessToken = b8.f11337b.getCustomerAccessToken(audience);
                        kotlin.jvm.internal.j.f(customerAccessToken, "getCustomerAccessToken(...)");
                        c0323aT1.l(new Lh.d(new Lh.d(new Lh.d(new Lh.h(customerAccessToken, zh.b.a(), 0).d(new com.google.firebase.messaging.r(strMType, strMValue, boolMVerified, strL)), new Q6.f(c0323aT1, channelResult, 8), 2), new Q6.f(c0323aT1, channelResult, 9), 0), new Q6.d(c0323aT1), 1));
                        return;
                    }
                    break;
                case -207051658:
                    if (str.equals("getServerUrl")) {
                        aVar.w1("getServerUrl");
                        C0323a c0323aT12 = aVar.t1();
                        kotlin.jvm.internal.j.g(channelResult, "channelResult");
                        String str2 = "{ \"url\": \"" + ((FundsActivity) ((S6.a) c0323aT12.c.get())).f12399u + "\" }";
                        yk.a.a();
                        ((T6.a) ((S6.a) c0323aT12.c.get())).v1("getServerUrl");
                        channelResult.success(str2);
                        return;
                    }
                    break;
                case -137764607:
                    if (str.equals("getCustomerAccessToken")) {
                        aVar.w1("getCustomerAccessToken");
                        C0323a c0323aT13 = aVar.t1();
                        kotlin.jvm.internal.j.g(channelResult, "channelResult");
                        B b10 = (B) c0323aT13.f;
                        String audience2 = ((FundsActivity) ((S6.a) c0323aT13.c.get())).f12398t;
                        b10.getClass();
                        kotlin.jvm.internal.j.g(audience2, "audience");
                        Ah.p<CustomerAccessToken> customerAccessToken2 = b10.f11337b.getCustomerAccessToken(audience2);
                        kotlin.jvm.internal.j.f(customerAccessToken2, "getCustomerAccessToken(...)");
                        c0323aT13.l(new Lh.d(new Lh.d(new Lh.d(new Lh.h(customerAccessToken2, zh.b.a(), 0).d(Q6.e.e), new Q6.f(c0323aT13, channelResult, 6), 2), new Q6.f(c0323aT13, channelResult, 7), 0), new Q6.c(c0323aT13, 1), 1));
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        C0323a c0323aT14 = aVar.t1();
                        String eventArgumentsString = rVar.f19113b.toString();
                        kotlin.jvm.internal.j.g(eventArgumentsString, "eventArgumentsString");
                        try {
                            q qVarG = T2.x(eventArgumentsString).g();
                            String strJ = qVarG.m("event_name").j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o oVarM = qVarG.m("attributes");
                            if (oVarM != null && !(oVarM instanceof com.google.gson.p)) {
                                Iterator it = ((i) oVarM.g().f10034a.entrySet()).iterator();
                                while (((h) it).hasNext()) {
                                    j jVarB = ((h) it).b();
                                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                }
                            }
                            linkedHashMap.toString();
                            yk.a.a();
                            S6.a aVar2 = (S6.a) c0323aT14.c.get();
                            kotlin.jvm.internal.j.d(strJ);
                            ((T6.a) aVar2).u1(strJ, linkedHashMap);
                            break;
                        } catch (Exception e) {
                            ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
                            yk.a.d();
                            e.printStackTrace();
                        }
                        channelResult.success("");
                        return;
                    }
                    break;
                case 697674406:
                    if (str.equals("getBalance")) {
                        aVar.w1("getBalance");
                        C0323a c0323aT15 = aVar.t1();
                        kotlin.jvm.internal.j.g(channelResult, "channelResult");
                        c0323aT15.l(new Lh.d(new Lh.d(new Lh.d(new Lh.f(new Lh.h(((C1247a) c0323aT15.f2878g).a(), zh.b.a(), 0), new Q6.d(c0323aT15), 2).d(Q6.e.f5268b), new Q6.f(c0323aT15, channelResult, 0), 2), new Q6.f(c0323aT15, channelResult, 1), 0), new g(c0323aT15, 0), 1));
                        return;
                    }
                    break;
                case 727434611:
                    if (str.equals("getProfile")) {
                        aVar.w1("getProfile");
                        C0323a c0323aT16 = aVar.t1();
                        kotlin.jvm.internal.j.g(channelResult, "channelResult");
                        Identity identityF2 = ((C1293x0) c0323aT16.h).f();
                        String strMType2 = identityF2 != null ? identityF2.mType() : null;
                        String strMValue2 = identityF2 != null ? identityF2.mValue() : null;
                        Boolean boolMVerified2 = identityF2 != null ? identityF2.mVerified() : null;
                        String strL2 = ((com.paymaya.data.preference.a) c0323aT16.e).l();
                        if (strMType2 == null || strMValue2 == null || boolMVerified2 == null || strL2 == null) {
                            yk.a.a();
                            channelResult.error("", "Oops! Something’s up. But don’t worry, we’re now looking into it. Please try again later.", null);
                            return;
                        }
                        String string = A0.f(strMType2, strMValue2, strL2, boolMVerified2.booleanValue()).toString();
                        kotlin.jvm.internal.j.f(string, "toString(...)");
                        ">>>> Flutter call: getProfile = ".concat(string);
                        yk.a.a();
                        ((T6.a) ((S6.a) c0323aT16.c.get())).v1("getProfile");
                        channelResult.success(string);
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        aVar.w1("getSessionToken");
                        C0323a c0323aT17 = aVar.t1();
                        kotlin.jvm.internal.j.g(channelResult, "channelResult");
                        AbstractC1331a.t("session_token", ((com.paymaya.data.preference.a) c0323aT17.e).s(), channelResult);
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        aVar.e.a();
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        yk.a.a();
                        channelResult.success("");
                        aVar.finishActivity(1200);
                        aVar.finish();
                        return;
                    }
                    break;
                case 1954849993:
                    if (str.equals("getBalanceAndLimits")) {
                        aVar.w1("getBalanceAndLimits");
                        C0323a c0323aT18 = aVar.t1();
                        kotlin.jvm.internal.j.g(channelResult, "channelResult");
                        c0323aT18.l(new Lh.d(new Lh.d(new Lh.d(new Lh.h(Ah.p.l(new Lh.f(new Lh.h(((C1247a) c0323aT18.f2878g).a(), zh.b.a(), 0), new Q6.h(c0323aT18), 2), new Lh.h(((C1249b) c0323aT18.i).a(), zh.b.a(), 0), Q6.e.c), zh.b.a(), 0), new Q6.f(c0323aT18, channelResult, 2), 2), new Q6.f(c0323aT18, channelResult, 3), 0), new Gb.d(c0323aT18, 25), 1));
                        return;
                    }
                    break;
                case 2097629423:
                    if (str.equals("getAccountLimits")) {
                        aVar.w1("getAccountLimits");
                        C0323a c0323aT19 = aVar.t1();
                        kotlin.jvm.internal.j.g(channelResult, "channelResult");
                        c0323aT19.l(new Lh.d(new Lh.d(new Lh.d(new Lh.h(((C1249b) c0323aT19.i).a(), zh.b.a(), 0).d(Q6.e.f5269d), new Q6.f(c0323aT19, channelResult, 4), 2), new Q6.f(c0323aT19, channelResult, 5), 0), new Q6.b(c0323aT19, 1), 1));
                        return;
                    }
                    break;
            }
        }
        channelResult.notImplemented();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void g() {
        r rVar = (r) this.f2209b;
        t tVar = (t) this.c;
        String str = rVar.f19112a;
        T6.b bVar = (T6.b) this.f2210d;
        if (str != null) {
            switch (str.hashCode()) {
                case -1793560251:
                    if (str.equals("getKycLevel")) {
                        bVar.a2(tVar);
                        return;
                    }
                    break;
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        bVar.Z1(tVar);
                        return;
                    }
                    break;
                case -1249356004:
                    if (str.equals("getMin")) {
                        bVar.b2(tVar);
                        return;
                    }
                    break;
                case -1179101518:
                    if (str.equals("getShieldSessionId")) {
                        bVar.d2(tVar);
                        return;
                    }
                    break;
                case -670914607:
                    if (str.equals("getAvailability")) {
                        tVar.success(bVar.W1());
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        bVar.e2(rVar.f19113b.toString());
                        tVar.success("");
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        bVar.c2(tVar);
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        bVar.n1().a();
                        return;
                    }
                    break;
            }
        }
        if (bVar.i2(rVar, tVar)) {
            return;
        }
        tVar.notImplemented();
    }

    private final void h() {
        MayaDropDown mayaDropDown = (MayaDropDown) this.f2209b;
        Va.f.a(mayaDropDown, (ValidationResult) ((Function2) this.f2210d).invoke((FieldType) this.c, mayaDropDown.getSelectedData()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void i() {
        Map mapL;
        DartExecutor dartExecutor;
        DartExecutor dartExecutor2;
        NavigationChannel navigationChannel;
        FlutterEngine flutterEngine;
        int i = 3;
        r rVar = (r) this.f2209b;
        MayaLoansCreditCardActivity mayaLoansCreditCardActivity = (MayaLoansCreditCardActivity) this.f2210d;
        t tVar = (t) this.c;
        int i4 = MayaLoansCreditCardActivity.f12712u;
        String str = rVar.f19112a;
        if (str != null) {
            int i6 = 1;
            switch (str.hashCode()) {
                case -1986243916:
                    if (str.equals("showContactReferenceScreen")) {
                        mayaLoansCreditCardActivity.getClass();
                        Map mapV1 = mayaLoansCreditCardActivity.V1(rVar.f19113b);
                        String str2 = mapV1 != null ? (String) mapV1.get("source_screen") : null;
                        mayaLoansCreditCardActivity.Y1(EnumC1216e.CONTACT_REFERENCE, 2, mapV1 != null ? (String) mapV1.get("product_key") : null);
                        mayaLoansCreditCardActivity.n1();
                        B5.i.f0(mayaLoansCreditCardActivity, "FRAGMENT_CONTACT_REFERENCE", str2 != null ? str2 : "");
                        mayaLoansCreditCardActivity.f12718s = tVar;
                        return;
                    }
                    break;
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        AbstractC1331a.t("access_token", ((com.paymaya.data.preference.a) mayaLoansCreditCardActivity.W1().e).b(), tVar);
                        return;
                    }
                    break;
                case -1305289599:
                    if (str.equals("extract")) {
                        C0323a c0323aW1 = mayaLoansCreditCardActivity.W1();
                        if (S5.c.b((S5.c) c0323aW1.f, A5.b.y0)) {
                            int i10 = 0;
                            Map mapH = M.h(new Pair("triggeredBy", "lending"), new Pair("eventTrigger", "credit-card"));
                            c0323aW1.e(new Lh.d(new Lh.d(new Lh.h(((C) c0323aW1.h).a(), zh.b.a(), i10), new U8.b(c0323aW1, mapH), 2), new U8.c(i10, c0323aW1, mapH, tVar), i10).e());
                        }
                        tVar.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1249356004:
                    if (str.equals("getMin")) {
                        AbstractC1331a.t("min", ((com.paymaya.data.preference.a) mayaLoansCreditCardActivity.W1().e).r(), tVar);
                        return;
                    }
                    break;
                case -1179101518:
                    if (str.equals("getShieldSessionId")) {
                        mayaLoansCreditCardActivity.W1();
                        AbstractC1331a.t("shield_session_id", i0.b(), tVar);
                        return;
                    }
                    break;
                case -815423637:
                    if (str.equals("requestBillsPay")) {
                        String str3 = (String) rVar.a("route");
                        if (str3 != null) {
                            mayaLoansCreditCardActivity.getIntent().setData(Uri.parse(str3));
                            mayaLoansCreditCardActivity.getIntent().putExtra("should_dismiss_flutter_engine", true);
                            mayaLoansCreditCardActivity.n1();
                            B5.i.e(mayaLoansCreditCardActivity);
                            return;
                        }
                        return;
                    }
                    break;
                case -573598512:
                    if (str.equals("getGeolocation")) {
                        K.d((K) mayaLoansCreditCardActivity.W1().i, new A7.d(tVar, i6));
                        return;
                    }
                    break;
                case -427330671:
                    if (str.equals("showSelectTransactionScreen")) {
                        Map mapV12 = mayaLoansCreditCardActivity.V1(rVar.f19113b);
                        EnumC1216e enumC1216e = EnumC1216e.INSTALLMENT;
                        if (mapV12 == null) {
                            mayaLoansCreditCardActivity.Y1(enumC1216e, 12, "");
                            return;
                        }
                        mayaLoansCreditCardActivity.Y1(enumC1216e, 14, "");
                        FlutterEngineCache.getInstance().remove("loansCreditCard");
                        mayaLoansCreditCardActivity.X1();
                        mayaLoansCreditCardActivity.n1();
                        mayaLoansCreditCardActivity.W1();
                        B5.i.y(mayaLoansCreditCardActivity, "selectTransactionScreen?" + C1110A.F(mapV12.entrySet(), "&", null, null, new Rg.g(12), 30));
                        return;
                    }
                    break;
                case -67833007:
                    if (str.equals("getPinningFingerprint")) {
                        AbstractC1331a.t("pinning_fingerprint", ((com.paymaya.data.preference.a) mayaLoansCreditCardActivity.W1().e).t(), tVar);
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        C0323a c0323aW12 = mayaLoansCreditCardActivity.W1();
                        String eventArgumentsString = rVar.f19113b.toString();
                        kotlin.jvm.internal.j.g(eventArgumentsString, "eventArgumentsString");
                        try {
                            q qVarG = T2.x(eventArgumentsString).g();
                            String strJ = qVarG.m("event_name").j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o oVarM = qVarG.m("attributes");
                            if (oVarM != null && !(oVarM instanceof com.google.gson.p)) {
                                Iterator it = ((i) oVarM.g().f10034a.entrySet()).iterator();
                                while (((h) it).hasNext()) {
                                    j jVarB = ((h) it).b();
                                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                }
                            }
                            linkedHashMap.toString();
                            yk.a.a();
                            V8.a aVar = (V8.a) c0323aW12.c.get();
                            kotlin.jvm.internal.j.d(strJ);
                            ((MayaLoansCreditCardActivity) aVar).Z1(strJ, linkedHashMap);
                            break;
                        } catch (Exception unused) {
                            ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
                            yk.a.d();
                        }
                        tVar.success("");
                        return;
                    }
                    break;
                case 287777717:
                    if (str.equals("startDataExtract")) {
                        C0323a c0323aW13 = mayaLoansCreditCardActivity.W1();
                        ((K) c0323aW13.i).c(((com.paymaya.data.preference.a) c0323aW13.e).C(), "lending", "credit-card", new Qd.a(tVar, i));
                        return;
                    }
                    break;
                case 328315452:
                    if (str.equals("uploadDocument")) {
                        mayaLoansCreditCardActivity.f12719t = tVar;
                        Map mapV13 = mayaLoansCreditCardActivity.V1(rVar.f19113b);
                        String str4 = mapV13 != null ? (String) mapV13.get("product_key") : null;
                        String str5 = mapV13 != null ? (String) mapV13.get("loan_application_id") : null;
                        MayaLoansCreditCardActivity mayaLoansCreditCardActivity2 = (MayaLoansCreditCardActivity) ((V8.a) mayaLoansCreditCardActivity.W1().c.get());
                        mayaLoansCreditCardActivity2.getClass();
                        if (str4 == null || str5 == null) {
                            mayaLoansCreditCardActivity2.Y1(EnumC1216e.DBL, 12, "");
                            return;
                        }
                        E.a("MayaLoansCreditCardActivity", "showIncomeDocs");
                        Le.j jVar = mayaLoansCreditCardActivity2.f12714o;
                        if (jVar == null) {
                            kotlin.jvm.internal.j.n("mIncomeDocumentUploader");
                            throw null;
                        }
                        ((Le.i) jVar).a(mayaLoansCreditCardActivity2);
                        Le.j jVar2 = mayaLoansCreditCardActivity2.f12714o;
                        if (jVar2 == null) {
                            kotlin.jvm.internal.j.n("mIncomeDocumentUploader");
                            throw null;
                        }
                        String string = mayaLoansCreditCardActivity2.getString(R.string.maya_label_document_upload_title);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        String string2 = mayaLoansCreditCardActivity2.getString(R.string.maya_label_document_upload_sub_title);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        String string3 = mayaLoansCreditCardActivity2.getString(R.string.maya_label_document_source_page_landers_cc);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        String string4 = mayaLoansCreditCardActivity2.getString(R.string.maya_label_document_source_button);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        ((Le.i) jVar2).b(mayaLoansCreditCardActivity2, string, string2, string3, string4, str4, new C7.g(6, mayaLoansCreditCardActivity2, str4, str5));
                        return;
                    }
                    break;
                case 356491852:
                    if (str.equals("showAccountUnderReviewScreen")) {
                        mayaLoansCreditCardActivity.n1();
                        mayaLoansCreditCardActivity.startActivity(new Intent(mayaLoansCreditCardActivity.getApplicationContext(), (Class<?>) MayaKycAccountUnderReviewActivity.class));
                        return;
                    }
                    break;
                case 402407612:
                    if (str.equals("completeKyc")) {
                        C0323a c0323aW14 = mayaLoansCreditCardActivity.W1();
                        V8.a aVar2 = (V8.a) c0323aW14.c.get();
                        boolean zB = S5.c.b((S5.c) c0323aW14.f, A5.b.f68L0);
                        MayaLoansCreditCardActivity mayaLoansCreditCardActivity3 = (MayaLoansCreditCardActivity) aVar2;
                        mayaLoansCreditCardActivity3.getClass();
                        if (!zB) {
                            mayaLoansCreditCardActivity3.n1().s(mayaLoansCreditCardActivity3, false);
                            return;
                        }
                        Map mapV14 = mayaLoansCreditCardActivity3.V1(rVar.f19113b);
                        String str6 = mapV14 != null ? (String) mapV14.get("entrypoint") : null;
                        String str7 = mapV14 != null ? (String) mapV14.get("product_key") : null;
                        EnumC1216e enumC1216e2 = EnumC1216e.KYC0;
                        if (str6 == null) {
                            mayaLoansCreditCardActivity3.Y1(enumC1216e2, 12, str7);
                            return;
                        }
                        mayaLoansCreditCardActivity3.Y1(enumC1216e2, 2, str7);
                        Intent intentP0 = mayaLoansCreditCardActivity3.n1().p0(mayaLoansCreditCardActivity3, str6);
                        intentP0.setData(mayaLoansCreditCardActivity3.getIntent().getData());
                        B5.i.v0(mayaLoansCreditCardActivity3, intentP0);
                        mayaLoansCreditCardActivity3.startActivity(intentP0);
                        return;
                    }
                    break;
                case 447853137:
                    if (str.equals("getKycStatus")) {
                        AbstractC1331a.t("kyc_status", ((com.paymaya.data.preference.a) mayaLoansCreditCardActivity.W1().e).l(), tVar);
                        return;
                    }
                    break;
                case 616915695:
                    if (str.equals("showUpdateProfileScreen")) {
                        C0323a c0323aW15 = mayaLoansCreditCardActivity.W1();
                        Map mapV15 = ((MayaLoansCreditCardActivity) ((V8.a) c0323aW15.c.get())).V1(rVar.f19113b);
                        String str8 = mapV15 != null ? (String) mapV15.get("product_key") : null;
                        boolean zB2 = S5.c.b((S5.c) c0323aW15.f, A5.b.f69M0);
                        EnumC1216e enumC1216e3 = EnumC1216e.UPDATE_PERSONAL_DETAILS;
                        if (zB2 && kotlin.jvm.internal.j.b(str8, "MAYA_BLACK_CREDIT_CARD_CONSUMER_LOAN")) {
                            MayaLoansCreditCardActivity mayaLoansCreditCardActivity4 = (MayaLoansCreditCardActivity) ((V8.a) c0323aW15.c.get());
                            mayaLoansCreditCardActivity4.getClass();
                            Map mapV16 = mayaLoansCreditCardActivity4.V1(rVar.f19113b);
                            String str9 = mapV16 != null ? (String) mapV16.get("source_screen") : null;
                            mayaLoansCreditCardActivity4.Y1(enumC1216e3, 2, mapV16 != null ? (String) mapV16.get("product_key") : null);
                            mayaLoansCreditCardActivity4.n1();
                            B5.i.e0(mayaLoansCreditCardActivity4, "FRAGMENT_PERSONAL_DETAILS", str9 != null ? str9 : "");
                            mayaLoansCreditCardActivity4.f12718s = tVar;
                            return;
                        }
                        MayaLoansCreditCardActivity mayaLoansCreditCardActivity5 = (MayaLoansCreditCardActivity) ((V8.a) c0323aW15.c.get());
                        mayaLoansCreditCardActivity5.getClass();
                        Map mapV17 = mayaLoansCreditCardActivity5.V1(rVar.f19113b);
                        String str10 = mapV17 != null ? (String) mapV17.get("source_screen") : null;
                        mayaLoansCreditCardActivity5.Y1(enumC1216e3, 2, mapV17 != null ? (String) mapV17.get("product_key") : null);
                        mayaLoansCreditCardActivity5.n1();
                        B5.i.f0(mayaLoansCreditCardActivity5, "FRAGMENT_PERSONAL_INFO", str10 != null ? str10 : "");
                        mayaLoansCreditCardActivity5.f12718s = tVar;
                        return;
                    }
                    break;
                case 662974457:
                    if (str.equals("openSecurityDepositAccount")) {
                        Object obj = rVar.f19113b;
                        Map map = obj instanceof Map ? (Map) obj : null;
                        if (map != null) {
                            ArrayList arrayList = new ArrayList(map.size());
                            for (Map.Entry entry : map.entrySet()) {
                                arrayList.add(new Pair(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
                            }
                            mapL = M.l(arrayList);
                        } else {
                            mapL = null;
                        }
                        if (mapL != null) {
                            MayaLoansCreditCardActivity mayaLoansCreditCardActivity6 = (MayaLoansCreditCardActivity) ((V8.a) mayaLoansCreditCardActivity.W1().c.get());
                            mayaLoansCreditCardActivity6.getClass();
                            E.a("MayaLoansCreditCardActivity", "openSecurityDepositAccount");
                            k kVar = mayaLoansCreditCardActivity6.f12715p;
                            if (kVar == null) {
                                kotlin.jvm.internal.j.n("securityDepositFlutterScreen");
                                throw null;
                            }
                            ((m) kVar).a(mayaLoansCreditCardActivity6);
                            k kVar2 = mayaLoansCreditCardActivity6.f12715p;
                            if (kVar2 != null) {
                                ((m) kVar2).c(mayaLoansCreditCardActivity6, mapL, new C7.f(10, mayaLoansCreditCardActivity6, mapL));
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("securityDepositFlutterScreen");
                                throw null;
                            }
                        }
                        return;
                    }
                    break;
                case 827711050:
                    if (str.equals("getToggle")) {
                        tVar.success(mayaLoansCreditCardActivity.W1().n());
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        AbstractC1331a.t("session_token", ((com.paymaya.data.preference.a) mayaLoansCreditCardActivity.W1().e).s(), tVar);
                        return;
                    }
                    break;
                case 1203583139:
                    if (str.equals("launchCreditScoring")) {
                        Object obj2 = rVar.f19113b;
                        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str11 = (String) obj2;
                        Le.a aVar3 = mayaLoansCreditCardActivity.f12716q;
                        if (aVar3 == null) {
                            kotlin.jvm.internal.j.n("mCreditScoring");
                            throw null;
                        }
                        ((Le.b) aVar3).b(mayaLoansCreditCardActivity);
                        Le.a aVar4 = mayaLoansCreditCardActivity.f12716q;
                        if (aVar4 == null) {
                            kotlin.jvm.internal.j.n("mCreditScoring");
                            throw null;
                        }
                        C7.f fVar = new C7.f(9, mayaLoansCreditCardActivity, tVar);
                        Le.b bVar = (Le.b) aVar4;
                        FlutterEngine flutterEngine2 = FlutterEngineCache.getInstance().get("creditScoringFullscreen");
                        if (flutterEngine2 != null && (navigationChannel = flutterEngine2.getNavigationChannel()) != null) {
                            navigationChannel.setInitialRoute(str11);
                        }
                        if (flutterEngine2 != null && (dartExecutor2 = flutterEngine2.getDartExecutor()) != null) {
                            dartExecutor2.executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "package:paymaya_module/main.dart", "runCreditScoringV2"));
                        }
                        if (flutterEngine2 != null && (dartExecutor = flutterEngine2.getDartExecutor()) != null) {
                            new u(dartExecutor.getBinaryMessenger(), "packages/paymaya_credit_scoring").b(new Bb.c(4, bVar, mayaLoansCreditCardActivity, fVar));
                        }
                        Intent intentBuild = new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaFullScreenFlutterFragmentActivity.class, "creditScoringFullscreen").backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build(mayaLoansCreditCardActivity.getApplicationContext());
                        kotlin.jvm.internal.j.f(intentBuild, "build(...)");
                        intentBuild.putExtra("applyTransition", false);
                        intentBuild.putExtra("engineId", "creditScoringFullscreen");
                        mayaLoansCreditCardActivity.startActivityForResult(intentBuild, 1400);
                        return;
                    }
                    break;
                case 1203902891:
                    if (str.equals("showUpgradeScreen")) {
                        EnumC1215d enumC1215d = EnumC1215d.LOANS_CREDIT_CARD;
                        EnumC1216e enumC1216e4 = EnumC1216e.DASHBOARD;
                        mayaLoansCreditCardActivity.getClass();
                        E.a("MayaLoansCreditCardActivity", "showUpgradeRequiredDialog");
                        String string5 = mayaLoansCreditCardActivity.getString(R.string.maya_label_upgrade_dialog_title);
                        kotlin.jvm.internal.j.f(string5, "getString(...)");
                        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string5, mayaLoansCreditCardActivity.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaLoansCreditCardActivity.getString(R.string.maya_label_upgrade_now), new N9.f(mayaLoansCreditCardActivity, 16)), new Pair(mayaLoansCreditCardActivity.getString(R.string.maya_label_maybe_later), null), null, 96);
                        mayaAlertBottomSheetDialogFragmentN.s1(enumC1215d);
                        mayaAlertBottomSheetDialogFragmentN.f11820c0 = enumC1216e4;
                        FragmentTransaction fragmentTransactionBeginTransaction = mayaLoansCreditCardActivity.getSupportFragmentManager().beginTransaction();
                        kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                        fragmentTransactionBeginTransaction.add(mayaAlertBottomSheetDialogFragmentN, "alert_dialog");
                        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        mayaLoansCreditCardActivity.n1().a();
                        return;
                    }
                    break;
                case 1470672960:
                    if (str.equals("showWorkDetailsScreen")) {
                        C0323a c0323aW16 = mayaLoansCreditCardActivity.W1();
                        Map mapV18 = ((MayaLoansCreditCardActivity) ((V8.a) c0323aW16.c.get())).V1(rVar.f19113b);
                        String str12 = mapV18 != null ? (String) mapV18.get("product_key") : null;
                        boolean zB3 = S5.c.b((S5.c) c0323aW16.f, A5.b.f69M0);
                        EnumC1216e enumC1216e5 = EnumC1216e.WORK_DETAILS;
                        if (zB3 && kotlin.jvm.internal.j.b(str12, "MAYA_BLACK_CREDIT_CARD_CONSUMER_LOAN")) {
                            MayaLoansCreditCardActivity mayaLoansCreditCardActivity7 = (MayaLoansCreditCardActivity) ((V8.a) c0323aW16.c.get());
                            mayaLoansCreditCardActivity7.getClass();
                            Map mapV19 = mayaLoansCreditCardActivity7.V1(rVar.f19113b);
                            String str13 = mapV19 != null ? (String) mapV19.get("source_screen") : null;
                            mayaLoansCreditCardActivity7.Y1(enumC1216e5, 2, mapV19 != null ? (String) mapV19.get("product_key") : null);
                            mayaLoansCreditCardActivity7.n1();
                            B5.i.e0(mayaLoansCreditCardActivity7, "FRAGMENT_UNDERWRITING_REQUIREMENTS", str13 != null ? str13 : "");
                            mayaLoansCreditCardActivity7.f12718s = tVar;
                            return;
                        }
                        MayaLoansCreditCardActivity mayaLoansCreditCardActivity8 = (MayaLoansCreditCardActivity) ((V8.a) c0323aW16.c.get());
                        mayaLoansCreditCardActivity8.getClass();
                        Map mapV110 = mayaLoansCreditCardActivity8.V1(rVar.f19113b);
                        String str14 = mapV110 != null ? (String) mapV110.get("source_screen") : null;
                        mayaLoansCreditCardActivity8.Y1(enumC1216e5, 2, mapV110 != null ? (String) mapV110.get("product_key") : null);
                        mayaLoansCreditCardActivity8.n1();
                        B5.i.f0(mayaLoansCreditCardActivity8, "FRAGMENT_WORK_DETAILS", str14 != null ? str14 : "");
                        mayaLoansCreditCardActivity8.f12718s = tVar;
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        yk.a.a();
                        mayaLoansCreditCardActivity.getClass();
                        FlutterEngineCache.getInstance().remove("loansCreditCard");
                        mayaLoansCreditCardActivity.X1();
                        Bundle extras = mayaLoansCreditCardActivity.getIntent().getExtras();
                        String string6 = extras != null ? extras.getString("sub_route") : null;
                        String str15 = string6 != null ? string6 : "";
                        mayaLoansCreditCardActivity.W1();
                        if (C1129o.C(new String[]{"paymaya://credit/card", "paymaya://credit/card/pending", "paymaya://credit/card/repayment", "securityDepositScreen", "dblSecuritySelectionScreen", "securityDepositReprocessScreen", "ccReviewingApplicationScreen"}).contains(C2576A.Y(str15, Global.QUESTION)) && (flutterEngine = FlutterEngineCache.getInstance().get("mycards")) != null) {
                            new u(flutterEngine.getDartExecutor().getBinaryMessenger(), "packages/paymaya_card").a("reloadHome", null, null);
                            return;
                        }
                        return;
                    }
                    break;
                case 1811096719:
                    if (str.equals("getUserInfo")) {
                        User userA = ((Z0) mayaLoansCreditCardActivity.W1().f2878g).a();
                        String strMFirstName = userA.mFirstName();
                        if (strMFirstName == null) {
                            strMFirstName = "";
                        }
                        Pair pair = new Pair("first_name", strMFirstName);
                        String strMLastName = userA.mLastName();
                        if (strMLastName == null) {
                            strMLastName = "";
                        }
                        Pair pair2 = new Pair("last_name", strMLastName);
                        String strMMiddleName = userA.mMiddleName();
                        tVar.success(M.h(pair, pair2, new Pair("middle_name", strMMiddleName != null ? strMMiddleName : "")));
                        return;
                    }
                    break;
            }
        }
        tVar.notImplemented();
    }

    private final void j() {
        ((BiConsumer) this.f2209b).accept((String) this.f2210d, (X2.f) this.c);
    }

    private final void k() {
        ((DefaultSurfaceProcessor) this.f2209b).lambda$executeSafely$12((Runnable) this.f2210d, (Runnable) this.c);
    }

    private final void l() {
        ((InternalImageProcessor) this.f2209b).lambda$safeProcess$0((ImageProcessor.Request) this.f2210d, (CallbackToFutureAdapter.Completer) this.c);
    }

    private final void m() {
        ((SurfaceProcessorNode) this.f2209b).lambda$sendSurfaceOutputs$0((SurfaceEdge) this.f2210d, (Map.Entry) this.c);
    }

    private final void n() {
        ((DualSurfaceProcessor) this.f2209b).lambda$executeSafely$8((Runnable) this.f2210d, (Runnable) this.c);
    }

    private final void o() {
        ((AudioSource) this.f2209b).lambda$setAudioSourceCallback$6((Executor) this.f2210d, (AudioSource.AudioSourceCallback) this.c);
    }

    private final void p() {
        ((BufferedAudioStream) this.f2209b).lambda$setCallback$3((AudioStream.AudioStreamCallback) this.f2210d, (Executor) this.c);
    }

    private final void q() {
        Util.lambda$postOrRunWithCompletion$0((S1.E) this.f2209b, (Runnable) this.f2210d, this.c);
    }

    private final void r() {
        Util.lambda$transformFutureAsync$2((y) this.f2209b, (S1.E) this.f2210d, (S1.q) this.c);
    }

    private final void s() {
        ((AudioRendererEventListener.EventDispatcher) this.f2209b).lambda$inputFormatChanged$2((Format) this.f2210d, (DecoderReuseEvaluation) this.c);
    }

    private final void t() {
        ((DrmSessionEventListener.EventDispatcher) this.f2209b).lambda$drmSessionManagerError$2((DrmSessionEventListener) this.f2210d, (Exception) this.c);
    }

    private final void u() {
        ((MediaSourceEventListener.EventDispatcher) this.f2209b).lambda$downstreamFormatChanged$5((MediaSourceEventListener) this.f2210d, (MediaLoadData) this.c);
    }

    private final void v() {
        QueryInterceptorDatabase.query$lambda$7((QueryInterceptorDatabase) this.f2209b, (String) this.f2210d, (Object[]) this.c);
    }

    private final void w() {
        QueryInterceptorDatabase.execSQL$lambda$12((QueryInterceptorDatabase) this.f2209b, (String) this.f2210d, (C1406d) this.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x021f, code lost:
    
        if (r3 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0221, code lost:
    
        if (r4 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0223, code lost:
    
        r4 = (java.lang.String) r0.a("data");
        r7 = (java.lang.String) r0.a("dataReferenceId");
        r0 = (java.lang.Boolean) r0.a("permission");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023b, code lost:
    
        if (r0 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x023d, code lost:
    
        r0 = r0.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0242, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0244, code lost:
    
        if (r4 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0246, code lost:
    
        r8 = (com.paymaya.domain.model.CreditEligibility) new com.google.gson.j().e(r4, com.paymaya.domain.model.CreditEligibility.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0254, code lost:
    
        ((com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity) ((M9.d) r1.c.get())).Y1("CREDIT_SCORING_EXTRACT_FAILURE", cj.L.c(new kotlin.Pair("data", r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026a, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x026b, code lost:
    
        if (r8 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026d, code lost:
    
        r3 = (com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity) ((M9.d) r1.c.get());
        r3.getClass();
        com.paymaya.common.utility.E.a("NewMayaCreditActivity", "showSuccessEligible");
        r3 = r3.f13086r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0281, code lost:
    
        if (r3 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0283, code lost:
    
        r3.invoke(r7, java.lang.Boolean.valueOf(r0), r8);
        ((com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity) ((M9.d) r1.c.get())).Y1("CREDIT_SCORING_EXTRACT_SUCCESS", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x029a, code lost:
    
        kotlin.jvm.internal.j.n("mOnModuleResult");
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a2, code lost:
    
        ((com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity) ((M9.d) r1.c.get())).Y1("CREDIT_SCORING_EXTRACT_FAILURE", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02b0, code lost:
    
        if (r3 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b2, code lost:
    
        if (r4 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02b4, code lost:
    
        r0 = (com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity) ((M9.d) r1.c.get());
        r0.getClass();
        com.paymaya.common.utility.E.a("NewMayaCreditActivity", "showIneligibleScreen");
        r0.n1();
        B5.i.r(r0, true, true, com.paymaya.common.utility.EnumC1216e.FULL_CHECKS_INELIGIBLE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02d1, code lost:
    
        ((com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity) ((M9.d) r1.c.get())).Y1("CREDIT_SCORING_EXTRACT_FAILURE", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02de, code lost:
    
        com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity.Z1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0125, code lost:
    
        if (r1.equals("creditScoringComplete") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e2, code lost:
    
        if (r1.equals("finishCurrentModuleForCard") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e4, code lost:
    
        r1 = r2.X1();
        r3 = r0.a("success");
        r4 = java.lang.Boolean.TRUE;
        r3 = kotlin.jvm.internal.j.b(r3, r4);
        r4 = kotlin.jvm.internal.j.b(r0.a("isEligible"), r4);
        r2 = cj.M.h(new kotlin.Pair("success", java.lang.String.valueOf(r3)), new kotlin.Pair("isEligible", java.lang.String.valueOf(r4)));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 3158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.a.run():void");
    }

    public /* synthetic */ a(r rVar, t tVar, MayaFlutterAdsInternalOnlyFragment mayaFlutterAdsInternalOnlyFragment) {
        this.f2208a = 7;
        this.f2209b = rVar;
        this.c = tVar;
        this.f2210d = mayaFlutterAdsInternalOnlyFragment;
    }
}
