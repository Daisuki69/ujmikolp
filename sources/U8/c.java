package U8;

import Ah.g;
import Ah.p;
import Ch.f;
import D.T;
import L9.C0323a;
import Lh.d;
import Lh.h;
import O4.k;
import Q6.n;
import W6.e;
import X2.m;
import X2.o;
import ag.AbstractC0693c;
import ag.C0691a;
import ag.C0694d;
import ag.C0695e;
import ag.C0696f;
import ag.C0703m;
import ag.C0704n;
import ag.C0706p;
import aj.InterfaceC0716a;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.navigation.ActivityKt;
import cj.C1112C;
import cj.C1132s;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.firebase.messaging.r;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.data.database.repository.B;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.E0;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.O0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.loanscreditcard.view.activity.impl.MayaLoansCreditCardActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.tbruyelle.rxpermissions2.RxPermissionsFragment;
import e1.InterfaceC1418b;
import e2.C1422d;
import g0.InterfaceC1493b;
import h0.InterfaceC1530a;
import hh.InterfaceC1569b;
import i1.C1581a;
import i1.C1583c;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.split.android.client.dtos.ConditionType;
import io.split.android.client.dtos.Prerequisite;
import io.split.android.client.dtos.Split;
import io.split.android.client.exceptions.ChangeNumberExceptionWrapper;
import io.split.android.client.network.HttpException;
import io.split.android.client.service.http.HttpFetcherException;
import io.split.android.client.service.http.HttpRecorderException;
import io.split.android.client.service.sseclient.SseAuthenticationResponse;
import j1.InterfaceC1656d;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import mi.InterfaceC1866a;
import mi.InterfaceC1867b;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import n2.C1915b;
import p2.C2009e;
import p3.C2011b;
import pg.E;
import pg.InterfaceC2043f;
import pg.l;
import pg.s;
import pg.t;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Ch.c, f, e, InterfaceC1418b, f2.b, f2.a, s, InterfaceC1530a, InterfaceC1569b, InterfaceC2043f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5964b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5965d;

    public c() throws ParserConfigurationException {
        this.f5963a = 13;
        DocumentBuilder documentBuilderNewDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        j.c(documentBuilderNewDocumentBuilder, "DocumentBuilderFactory.n…ce().newDocumentBuilder()");
        this.f5965d = documentBuilderNewDocumentBuilder;
        this.f5964b = new Stack();
    }

    public static String e(Ti.b bVar, String str) {
        Map map = bVar.f5849k;
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public static String f(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains(Global.QUESTION)) {
            return androidx.camera.core.impl.a.j(str, Global.QUESTION, string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return We.s.i(str, string);
    }

    public static int m(int i, int i4, K3.a aVar) {
        int i6 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            if (aVar.d(i + i10)) {
                i6 |= 1 << ((i4 - i10) - 1);
            }
        }
        return i6;
    }

    public static URI q(HashMap map, URI uri) {
        r rVar = new r(uri);
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof Iterable) {
                Iterator it = ((Iterable) entry.getValue()).iterator();
                while (it.hasNext()) {
                    rVar.j((String) entry.getKey(), it.next().toString());
                }
            } else {
                rVar.j((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return rVar.k();
    }

    public C0703m[] a() {
        Context context = (Context) this.f5964b;
        Y.e eVar = (Y.e) this.c;
        C0694d c0694d = (C0694d) this.f5965d;
        C0696f c0696f = new C0696f(context, eVar, c0694d);
        AbstractC0693c.b(c0696f, C0696f.f7201g, C0691a.f);
        AbstractC0693c.b(c0696f, C0696f.h, C0691a.f7178b);
        AbstractC0693c.b(c0696f, C0696f.i, C0691a.e);
        AbstractC0693c.b(c0696f, C0696f.j, C0691a.f7180k);
        AbstractC0693c.b(c0696f, C0696f.f7202k, C0691a.i);
        AbstractC0693c.b(c0696f, C0696f.f7203l, C0691a.c);
        AbstractC0693c.b(c0696f, C0696f.m, new k(c0696f, 3));
        AbstractC0693c.b(c0696f, C0696f.f7204n, C0691a.f7179g);
        C0703m c0703mA = c0696f.a();
        C0706p c0706p = new C0706p(context, eVar, c0694d);
        AbstractC0693c.b(c0706p, C0706p.f, C0691a.f7182n);
        AbstractC0693c.b(c0706p, C0706p.f7222g, C0691a.f7184p);
        AbstractC0693c.b(c0706p, C0706p.h, C0691a.f7183o);
        C0703m c0703mA2 = c0706p.a();
        C0704n c0704n = new C0704n(context, eVar, c0694d);
        AbstractC0693c.b(c0704n, C0704n.f, C0691a.m);
        AbstractC0693c.b(c0704n, C0704n.f7218g, C0691a.f7181l);
        C0703m c0703mA3 = c0704n.a();
        C0695e c0695e = new C0695e(context, c0694d);
        AbstractC0693c.b(c0695e, C0695e.f7200d, C0691a.j);
        AbstractC0693c.b(c0695e, C0695e.e, C0691a.h);
        return new C0703m[]{c0703mA, c0703mA2, c0703mA3, c0695e.a()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.i, qj.n] */
    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f5963a) {
            case 0:
                Throwable it = (Throwable) obj;
                j.g(it, "it");
                ((MayaLoansCreditCardActivity) ((V8.a) ((C0323a) this.f5964b).c.get())).Z1("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.c);
                ((t) this.f5965d).error("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", "MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.c);
                break;
            case 3:
                g state = (g) obj;
                j.g(state, "state");
                Object obj2 = state.f314a;
                if (obj2 == null || (obj2 instanceof Qh.f)) {
                    obj2 = null;
                }
                U5.a aVar = (U5.a) obj2;
                int i = aVar == null ? -1 : X5.c.f6536a[aVar.ordinal()];
                if (i == 1) {
                    ((Function0) this.f5964b).invoke();
                    break;
                } else if (i == 2) {
                    ((Function0) this.c).invoke();
                    break;
                } else if (i == 3) {
                    ((Function0) this.f5965d).invoke();
                    break;
                }
                break;
            case 7:
                MFAChallengeInformation it2 = (MFAChallengeInformation) obj;
                j.g(it2, "it");
                MfaMeta mfaMeta = (MfaMeta) this.c;
                ((i) this.f5964b).invoke(mfaMeta.getChallengeId(), mfaMeta.getTransactionType(), (String) this.f5965d);
                break;
            case 8:
                MFAChallengeInformation it3 = (MFAChallengeInformation) obj;
                j.g(it3, "it");
                MfaMeta mfaMeta2 = (MfaMeta) this.c;
                ((Z8.c) this.f5964b).s(mfaMeta2.getChallengeId(), mfaMeta2.getTransactionType(), (String) this.f5965d);
                break;
            default:
                ShopProviderBase shopProviderBase = (ShopProviderBase) obj;
                j.g(shopProviderBase, "shopProviderBase");
                O0 o02 = (O0) this.f5964b;
                B b8 = o02.c;
                List<ShopProvider> items = shopProviderBase.getData();
                if (items == null) {
                    items = C1112C.f9377a;
                }
                b8.getClass();
                String categoryCode = (String) this.c;
                j.g(categoryCode, "categoryCode");
                j.g(items, "items");
                ArrayList arrayListD = C1132s.d(We.s.p(new StringBuilder("%\"code\":\""), categoryCode, "\"%"));
                A7.f fVarA = b8.f11294a.a();
                fVarA.j("shop_provider", "categories LIKE ?", (String[]) arrayListD.toArray(new String[0]));
                fVarA.k("shop_provider", B.a(items));
                fVarA.d();
                String str = (String) this.f5965d;
                if (str != null) {
                    o02.e.s0(categoryCode, str);
                }
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f5963a) {
            case 6:
                List it = (List) obj;
                j.g(it, "it");
                p pVarL = p.l((Lh.i) this.f5964b, (Lh.f) this.c, new Qd.a(it, 16));
                Y7.f fVar = (Y7.f) this.f5965d;
                return new d(new d(new h(pVarL.d(new Q6.s(fVar, 16)), zh.b.a(), 0), new n(fVar, 16), 2), new R4.i(fVar, 14), 0);
            default:
                Pair pair = (Pair) obj;
                j.g(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f18160a).booleanValue();
                String str = (String) pair.f18161b;
                String categoryCode = (String) this.f5965d;
                O0 o02 = (O0) this.f5964b;
                if (zBooleanValue) {
                    return new d(o02.f11378b.getShopProviders((HashMap) this.c).d(new C1258f0(o02, 2)), new c(17, o02, categoryCode, str), 2);
                }
                o02.getClass();
                j.g(categoryCode, "categoryCode");
                return p.c(new ShopProviderBase(o02.c.b(new J1.e(categoryCode, 2)), null));
        }
    }

    @Override // f2.b
    public void b(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f5965d;
        if (countDownLatch != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str)) {
            countDownLatch.countDown();
        }
    }

    public synchronized void c() {
        if (!((LinkedHashSet) this.f5964b).isEmpty()) {
            ((m) this.c).e(0L);
        }
    }

    public void d(int i, URI uri, HashMap map) throws HttpFetcherException {
        boolean z4 = (uri.getHost() == null || "https://sdk.split.io/api".equals(uri.getHost())) ? false : true;
        boolean zEquals = "1.3".equals(map.get(CmcdData.Factory.STREAMING_FORMAT_SS));
        if (i == 400 && z4 && zEquals) {
            throw new HttpFetcherException(((URI) this.c).toString(), "Proxy is outdated", 9010);
        }
    }

    public String g(int i, StringBuilder sb2) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            W3.h hVarI = i(i, str);
            String strA = W3.k.a(hVarI.f6234b);
            if (strA != null) {
                sb2.append(strA);
            }
            String strValueOf = hVarI.f6235d ? String.valueOf(hVarI.c) : null;
            int i4 = hVarI.f6237a;
            if (i == i4) {
                return sb2.toString();
            }
            i = i4;
            str = strValueOf;
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f5963a) {
            case 14:
                return new c1.s(new N4.d(27), new M2.b(27), (h1.b) ((Ci.b) this.f5964b).get(), (i1.f) ((C1915b) this.c).get(), (i1.g) ((r) this.f5965d).get());
            default:
                return new C1583c((Context) ((d3.c) this.f5964b).f16259b, (InterfaceC1656d) ((InterfaceC0716a) this.c).get(), (C1581a) ((C2011b) this.f5965d).get());
        }
    }

    @Override // f2.a
    public void h(Bundle bundle) {
        synchronized (this.c) {
            try {
                C1422d c1422d = C1422d.f16556a;
                c1422d.f("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f5965d = new CountDownLatch(1);
                ((L) this.f5964b).h(bundle);
                c1422d.f("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f5965d).await(500, TimeUnit.MILLISECONDS)) {
                        c1422d.f("App exception callback received from Analytics listener.");
                    } else {
                        c1422d.g("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f5965d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0209, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0216, code lost:
    
        r3 = r1.f1542b;
        r5 = r3 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x021c, code lost:
    
        if (r5 <= r6.f2588b) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x021f, code lost:
    
        if (r3 >= r5) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0225, code lost:
    
        if (r6.d(r3) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x022d, code lost:
    
        if (s(r1.f1542b) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x022f, code lost:
    
        r3 = r1.f1542b;
        r5 = r3 + 5;
        r6 = r6.f2588b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0235, code lost:
    
        if (r5 >= r6) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0237, code lost:
    
        r1.f1542b = r3 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x023c, code lost:
    
        r1.f1542b = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x023e, code lost:
    
        r1.c = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0241, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0244, code lost:
    
        r1.f1542b += 3;
        r1.c = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x024f, code lost:
    
        r3 = new A3.i((java.lang.Object) null, false, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0259, code lost:
    
        r3 = r5.f41b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        r3 = r1.f1542b;
        r5 = r3 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        if (r5 <= r6.f2588b) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        if (r3 >= r5) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r6.d(r3) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (s(r1.f1542b) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e7, code lost:
    
        r3 = r1.f1542b;
        r5 = r3 + 5;
        r6 = r6.f2588b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
    
        if (r5 >= r6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        r1.f1542b = r3 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        r1.f1542b = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
    
        r1.c = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        r1.f1542b += 3;
        r1.c = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0108, code lost:
    
        r5 = new A3.i((java.lang.Object) null, false, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0339 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0303 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public W3.h i(int r19, java.lang.String r20) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U8.c.i(int, java.lang.String):W3.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ri.a j() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U8.c.j():Ri.a");
    }

    public Object k(HashMap map, HashMap map2) throws HttpFetcherException {
        switch (this.f5963a) {
            case 26:
                URI uri = (URI) this.c;
                try {
                    r rVar = new r(uri);
                    if (map.containsKey("till")) {
                        map.put("till", map.remove("till"));
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        Object value = entry.getValue();
                        rVar.j((String) entry.getKey(), value != null ? value.toString() : "");
                    }
                    URI uriK = rVar.k();
                    io.split.android.client.network.g gVarC = ((io.split.android.client.network.d) this.f5964b).c(uriK, 1, null, map2).c();
                    String str = gVarC.f17591b;
                    Ri.a.p("Received from: " + uriK + " -> " + str);
                    if (gVarC.b()) {
                        Object objD = ((InterfaceC1867b) this.f5965d).d(str);
                        if (objD != null) {
                            return objD;
                        }
                        throw new IllegalStateException("Wrong data received from split changes server");
                    }
                    int i = gVarC.f6237a;
                    d(i, uriK, map);
                    throw new HttpFetcherException(uri.toString(), "http return code " + i, Integer.valueOf(i));
                } catch (HttpException e) {
                    throw new HttpFetcherException(uri.toString(), e.getLocalizedMessage(), e.f17569a);
                } catch (HttpFetcherException e7) {
                    throw e7;
                } catch (Exception e10) {
                    throw new HttpFetcherException(uri.toString(), e10.getLocalizedMessage());
                }
            default:
                URI uri2 = (URI) this.c;
                try {
                    URI uriQ = q(map, uri2);
                    io.split.android.client.network.g gVarC2 = ((io.split.android.client.network.d) this.f5964b).c(uriQ, 1, null, null).c();
                    String str2 = gVarC2.f17591b;
                    Ri.a.p("Received from: " + uriQ.toString() + " -> " + str2);
                    if (gVarC2.b()) {
                        SseAuthenticationResponse sseAuthenticationResponse = (SseAuthenticationResponse) ((C2009e) this.f5965d).d(str2);
                        if (sseAuthenticationResponse != null) {
                            return sseAuthenticationResponse;
                        }
                        throw new IllegalStateException("Wrong data received from authentication server");
                    }
                    int i4 = gVarC2.f6237a;
                    if (i4 >= 400 && i4 < 500) {
                        return new SseAuthenticationResponse(true);
                    }
                    throw new IllegalStateException("http return code " + i4);
                } catch (HttpException e11) {
                    throw new HttpFetcherException(uri2.toString(), e11.getLocalizedMessage(), e11.f17569a);
                } catch (Exception e12) {
                    throw new HttpFetcherException(uri2.toString(), e12.getLocalizedMessage());
                }
        }
    }

    public void l(Object obj) throws HttpRecorderException {
        URI uri = (URI) this.c;
        Objects.requireNonNull(obj);
        try {
            io.split.android.client.network.g gVarC = ((io.split.android.client.network.d) this.f5964b).c(uri, 2, ((InterfaceC1866a) this.f5965d).a(obj), null).c();
            if (gVarC.b()) {
                return;
            }
            int i = gVarC.f6237a;
            throw new HttpRecorderException(uri.toString(), "http return code " + i, Integer.valueOf(i));
        } catch (HttpException e) {
            throw new HttpRecorderException(uri.toString(), e.getLocalizedMessage(), e.f17569a);
        } catch (HttpRecorderException e7) {
            throw e7;
        } catch (Exception e10) {
            throw new HttpRecorderException(uri.toString(), e10.getLocalizedMessage());
        }
    }

    public RxPermissionsFragment n() {
        RxPermissionsFragment rxPermissionsFragment;
        synchronized (this) {
            try {
                if (((RxPermissionsFragment) this.f5964b) == null) {
                    Ze.c cVar = (Ze.c) this.f5965d;
                    FragmentManager fragmentManager = (FragmentManager) this.c;
                    cVar.getClass();
                    RxPermissionsFragment rxPermissionsFragment2 = (RxPermissionsFragment) fragmentManager.findFragmentByTag("c");
                    if (rxPermissionsFragment2 == null) {
                        rxPermissionsFragment2 = new RxPermissionsFragment();
                        fragmentManager.beginTransaction().add(rxPermissionsFragment2, "c").commitNow();
                    }
                    this.f5964b = rxPermissionsFragment2;
                }
                rxPermissionsFragment = (RxPermissionsFragment) this.f5964b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rxPermissionsFragment;
    }

    public N.m o(String str, Ti.b bVar, HashMap map) throws ChangeNumberExceptionWrapper {
        long j = bVar.f5848g;
        try {
            boolean z4 = bVar.c;
            ArrayList<Prerequisite> arrayList = bVar.f5851n;
            String str2 = bVar.f5847d;
            if (z4) {
                return new N.m(str2, "killed", Long.valueOf(j), e(bVar, str2), bVar.m);
            }
            if (!arrayList.isEmpty()) {
                for (Prerequisite prerequisite : arrayList) {
                    if (!prerequisite.getTreatments().contains((String) p(str, prerequisite.getFlagName(), map).f3485b)) {
                        return new N.m(bVar.f5847d, "prerequisites not met", Long.valueOf(j), e(bVar, str2), bVar.m);
                    }
                }
            }
            boolean z5 = false;
            for (Ti.a aVar : bVar.e) {
                int i = bVar.j;
                if (!z5 && aVar.f5842a == ConditionType.ROLLOUT) {
                    int i4 = bVar.h;
                    if (i4 < 100 && ((int) (Math.abs(X5.f.s(bVar.i, i, str) % 100) + 1)) > i4) {
                        return new N.m(bVar.f5847d, "not in split", Long.valueOf(j), e(bVar, str2), bVar.m);
                    }
                    z5 = true;
                }
                if (aVar.f5843b.a(str, map, this)) {
                    String strR = X5.f.r(str, bVar.f5846b, aVar.c, i, (M) this.f5965d);
                    return new N.m(strR, aVar.f5844d, Long.valueOf(j), e(bVar, strR), bVar.m);
                }
            }
            return new N.m(bVar.f5847d, "default rule", Long.valueOf(j), e(bVar, str2), bVar.m);
        } catch (Exception unused) {
            throw new ChangeNumberExceptionWrapper(j);
        }
    }

    @Override // W6.e
    public void onDismiss() {
        switch (this.f5963a) {
            case 11:
                MayaRegistrationV2Activity mayaRegistrationV2Activity = (MayaRegistrationV2Activity) this.f5964b;
                Bb.f fVar = mayaRegistrationV2Activity.f13665o;
                if (fVar == null) {
                    j.n("mMayaRegistrationV2ActivityPresenter");
                    throw null;
                }
                ((E0) fVar.e).c.o0("");
                ((Function1) this.c).invoke(((MayaErrorDialogFragment) this.f5965d).r1());
                ActivityKt.findNavController(mayaRegistrationV2Activity, R.id.nav_host_fragment).popBackStack(R.id.maya_account_creation_fragment, false);
                return;
            default:
                MayaRegistrationActivity mayaRegistrationActivity = (MayaRegistrationActivity) this.f5964b;
                ((E0) mayaRegistrationActivity.Y1().f).c.o0("");
                ((Function1) this.c).invoke(((MayaErrorDialogFragment) this.f5965d).r1());
                AbstractC1236z.b(mayaRegistrationActivity);
                return;
        }
    }

    @Override // pg.InterfaceC2043f
    public void onMessage(ByteBuffer byteBuffer, pg.g gVar) {
        pg.n nVar = (pg.n) this.f5965d;
        pg.r rVarA = nVar.c.a(byteBuffer);
        String str = rVarA.f19112a;
        boolean zEquals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.c;
        String str2 = nVar.f19109b;
        E e = nVar.c;
        pg.m mVar = (pg.m) this.f5964b;
        Object obj = rVarA.f19113b;
        if (!zEquals) {
            if (!str.equals("cancel")) {
                gVar.reply(null);
                return;
            }
            if (((pg.k) atomicReference.getAndSet(null)) == null) {
                gVar.reply(e.f(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "No active stream to cancel", null));
                return;
            }
            try {
                mVar.onCancel(obj);
                gVar.reply(e.b(null));
                return;
            } catch (RuntimeException e7) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e7);
                gVar.reply(e.f(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e7.getMessage(), null));
                return;
            }
        }
        l lVar = new l(this);
        if (((pg.k) atomicReference.getAndSet(lVar)) != null) {
            try {
                mVar.onCancel(null);
            } catch (RuntimeException e10) {
                Log.e("EventChannel#" + str2, "Failed to close existing event stream", e10);
            }
        }
        try {
            mVar.onListen(obj, lVar);
            gVar.reply(e.b(null));
        } catch (RuntimeException e11) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str2, "Failed to open event stream", e11);
            gVar.reply(e.f(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e11.getMessage(), null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155  */
    @Override // pg.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(pg.r r13, pg.t r14) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U8.c.onMethodCall(pg.r, pg.t):void");
    }

    public N.m p(String str, String str2, HashMap map) {
        Ti.b bVarB;
        M m = (M) this.f5965d;
        try {
            R4.i iVar = (R4.i) this.c;
            Split split = ((io.split.android.client.storage.splits.c) this.f5964b).get(str2);
            iVar.getClass();
            try {
                bVarB = iVar.b(split, str);
            } catch (Throwable th2) {
                Ri.a.i(th2, "Could not parse feature flag: %s", split != null ? split.name : "null");
                bVarB = null;
            }
            return bVarB == null ? new N.m(SessionDescription.ATTR_CONTROL, m.k(str2, "definition not found").f16680a, null, null, true) : o(str, bVarB, map);
        } catch (ChangeNumberExceptionWrapper e) {
            Ri.a.i(e, "Catch Change Number Exception", new Object[0]);
            return new N.m(SessionDescription.ATTR_CONTROL, m.k(str2, Constants.EXCEPTION).f16680a, Long.valueOf(e.f17568a), null, true);
        } catch (Exception e7) {
            Ri.a.i(e7, "Catch All Exception", new Object[0]);
            return new N.m(SessionDescription.ATTR_CONTROL, m.k(str2, Constants.EXCEPTION).f16680a, null, null, true);
        }
    }

    public void r(String str, String str2) {
        ((HashMap) this.f5965d).put(str, str2);
    }

    public boolean s(int i) {
        int i4;
        int i6 = i + 1;
        K3.a aVar = (K3.a) this.f5964b;
        if (i6 > aVar.f2588b) {
            return false;
        }
        for (int i10 = 0; i10 < 5 && (i4 = i10 + i) < aVar.f2588b; i10++) {
            if (i10 == 2) {
                if (!aVar.d(i + 2)) {
                    return false;
                }
            } else if (aVar.d(i4)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.f5963a = i;
        this.f5964b = obj;
        this.c = obj2;
        this.f5965d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(qj.n nVar, MfaMeta mfaMeta, String str) {
        this.f5963a = 7;
        this.f5964b = (i) nVar;
        this.c = mfaMeta;
        this.f5965d = str;
    }

    public c(Uri uri, Map headers, String str) {
        this.f5963a = 18;
        j.g(headers, "headers");
        this.f5964b = uri;
        this.c = headers;
        this.f5965d = str;
    }

    public c(dc.h hVar, com.paymaya.data.preference.a mPreference, C1220i mAnalyticsUtils) {
        this.f5963a = 4;
        j.g(mPreference, "mPreference");
        j.g(mAnalyticsUtils, "mAnalyticsUtils");
        this.f5964b = hVar;
        this.c = mPreference;
        this.f5965d = mAnalyticsUtils;
    }

    public c(io.split.android.client.network.d dVar, URI uri, InterfaceC1866a interfaceC1866a) {
        this.f5963a = 27;
        Objects.requireNonNull(dVar);
        this.f5964b = dVar;
        this.c = uri;
        this.f5965d = interfaceC1866a;
    }

    public c(io.split.android.client.network.d dVar, URI uri, InterfaceC1867b interfaceC1867b) {
        this.f5963a = 26;
        Objects.requireNonNull(dVar);
        this.f5964b = dVar;
        Objects.requireNonNull(uri);
        this.c = uri;
        Objects.requireNonNull(interfaceC1867b);
        this.f5965d = interfaceC1867b;
    }

    public c(InterfaceC1493b interfaceC1493b, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f5963a = 21;
        this.c = context;
        this.f5964b = cleverTapInstanceConfig;
        this.f5965d = interfaceC1493b;
        T.b(context);
    }

    public c(String str, HashMap map) {
        this.f5963a = 25;
        this.f5964b = str;
        this.c = map;
        this.f5965d = new HashMap();
    }

    public c(K3.a aVar) {
        this.f5963a = 1;
        F3.a aVar2 = new F3.a(4);
        aVar2.f1542b = 0;
        aVar2.c = 1;
        this.c = aVar2;
        this.f5965d = new StringBuilder();
        this.f5964b = aVar;
    }

    public c(L l6) {
        this.f5963a = 19;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.c = new Object();
        this.f5964b = l6;
    }

    @Override // hh.InterfaceC1569b
    public void accept(Object obj, Object obj2) {
        Map map = (Map) obj;
        Object objApply = ((hh.n) this.f5965d).apply(obj2);
        Collection collection = (Collection) map.get(objApply);
        if (collection == null) {
            collection = (Collection) ((hh.n) this.f5964b).apply(objApply);
            map.put(objApply, collection);
        }
        collection.add(((hh.n) this.c).apply(obj2));
    }

    public c(U1.g gVar, C2.e eVar, X2.j jVar, X2.d dVar, Context context, String str, o oVar, ScheduledExecutorService scheduledExecutorService) {
        this.f5963a = 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f5964b = linkedHashSet;
        this.c = new m(gVar, eVar, jVar, dVar, context, str, linkedHashSet, oVar, scheduledExecutorService);
        this.f5965d = scheduledExecutorService;
    }

    public c(Ze.c cVar, FragmentManager fragmentManager) {
        this.f5963a = 9;
        this.f5965d = cVar;
        this.c = fragmentManager;
    }

    public c(pg.n nVar, pg.m mVar) {
        this.f5963a = 29;
        this.f5965d = nVar;
        this.c = new AtomicReference(null);
        this.f5964b = mVar;
    }
}
