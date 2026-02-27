package n2;

import A7.l;
import Bj.D0;
import Bj.H;
import Bj.U;
import D.AbstractC0184q;
import D.B;
import D.P;
import D.S;
import E8.RunnableC0220c;
import G6.v;
import Gc.h;
import Kh.I;
import P5.N;
import Z.m;
import Z0.c;
import a1.C0620a;
import aj.InterfaceC0716a;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import b1.t;
import b3.C0864D;
import b3.InterfaceC0875O;
import b3.e0;
import b3.i0;
import bg.AbstractC0983W;
import c0.d;
import c1.s;
import cg.InterfaceC1101b;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.r;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.paymaya.common.utility.C1220i;
import com.paymaya.data.api.MayaInboxNotificationsClientApi;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.store.S0;
import d0.C1325a;
import d3.InterfaceC1330b;
import d4.AbstractC1331a;
import e0.C1416a;
import e1.InterfaceC1418b;
import e2.C1421c;
import e2.C1422d;
import gf.g;
import h2.C1531a;
import h2.i;
import h2.w;
import i1.C1583c;
import i2.e;
import j1.InterfaceC1655c;
import j1.InterfaceC1656d;
import j2.C1663b;
import j2.C1664c;
import j2.C1666e;
import j2.C1667f;
import j2.InterfaceC1665d;
import j2.n;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k2.C1692B;
import k2.C1693C;
import k2.C1697G;
import k2.C1706P;
import k2.C1707Q;
import k2.C1708S;
import k2.C1709T;
import k2.C1711V;
import k2.C1712W;
import k2.C1713X;
import k2.C1717b0;
import k2.C1723e0;
import k2.C1725f0;
import k2.C1729h0;
import k2.C1731i0;
import k2.E0;
import k2.L0;
import kotlin.coroutines.CoroutineContext;
import l0.f;
import n3.C1916a;
import o2.C1956a;
import o2.C1957b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pg.C2038a;

/* JADX INFO: renamed from: n2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1915b implements InterfaceC1101b, InterfaceC1330b, InterfaceC1418b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18587b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18588d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f18589g;
    public final Object h;

    public /* synthetic */ C1915b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f18586a = i;
        this.f18587b = obj;
        this.c = obj2;
        this.f18588d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.f18589g = obj6;
        this.h = obj7;
    }

    public static final JSONArray a(C1915b c1915b, JSONArray jSONArray, String str) {
        S s9 = (S) c1915b.h;
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt != null) {
                try {
                    JSONObject jSONObjectL = c1915b.l(str);
                    jSONObjectL.put("evtData", objOpt);
                    jSONArray2.put(jSONObjectL);
                    s9.getClass();
                    S.s("ContentFetch", "Added content fetch item: " + objOpt);
                } catch (Exception e) {
                    s9.getClass();
                    S.t("ContentFetch", "Error adding content fetch item: " + objOpt, e);
                }
            }
        }
        return jSONArray2;
    }

    public static final Boolean b(C1915b c1915b, JSONArray jSONArray, d dVar) {
        JSONObject jSONObjectD = ((Ei.a) c1915b.c).d(null);
        if (jSONObjectD == null) {
            return Boolean.FALSE;
        }
        C1325a c1325a = new C1325a(jSONObjectD, jSONArray, 0);
        ((S) c1915b.h).getClass();
        S.g("ContentFetch", "Fetching Content: " + c1325a);
        try {
            d0.b bVarQ = ((r) c1915b.f18588d).q();
            bVarQ.getClass();
            String strC = bVarQ.c(false);
            if (strC == null) {
                strC = "clevertap-prod.com";
            }
            C1416a c1416aC = bVarQ.f16235a.c(d0.b.b(bVarQ, strC, "content", c1325a.toString(), null, 24));
            try {
                Boolean boolValueOf = Boolean.valueOf(c1915b.o(c1416aC, !H.u(dVar.getContext())));
                c1416aC.close();
                return boolValueOf;
            } finally {
            }
        } catch (Exception e) {
            S.h("ContentFetch", "An exception occurred while fetching content.", e);
            return Boolean.FALSE;
        }
    }

    public static C1707Q c(C1707Q c1707q, C1667f c1667f, C1915b c1915b, Map map) {
        Map mapUnmodifiableMap;
        C1706P c1706pA = c1707q.a();
        String strF = ((InterfaceC1665d) c1667f.f17680b).f();
        if (strF != null) {
            c1706pA.e = new C1723e0(strF);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        B1.a aVar = (B1.a) c1915b.e;
        if (zIsEmpty) {
            mapUnmodifiableMap = ((C1666e) ((AtomicMarkableReference) aVar.c).getReference()).a();
        } else {
            HashMap map2 = new HashMap(((C1666e) ((AtomicMarkableReference) aVar.c).getReference()).a());
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = C1666e.b(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strB)) {
                    map2.put(strB, C1666e.b(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap = Collections.unmodifiableMap(map2);
        }
        List listN = n(mapUnmodifiableMap);
        List listN2 = n(((C1666e) ((AtomicMarkableReference) ((B1.a) c1915b.f).c).getReference()).a());
        if (!listN.isEmpty() || !listN2.isEmpty()) {
            C1708S c1708s = c1707q.c;
            c1706pA.c = new C1708S(c1708s.f17886a, listN, listN2, c1708s.f17888d, c1708s.e, c1708s.f, c1708s.f17889g);
        }
        return c1706pA.a();
    }

    public static L0 f(C1707Q c1707q, C1915b c1915b) {
        List listA = ((g) c1915b.f18589g).a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            n nVar = (n) listA.get(i);
            nVar.getClass();
            C1725f0 c1725f0 = new C1725f0();
            C1663b c1663b = (C1663b) nVar;
            String str = c1663b.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = c1663b.f17673b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            c1725f0.f17942a = new C1729h0(str2, str);
            String str3 = c1663b.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            c1725f0.f17943b = str3;
            String str4 = c1663b.f17674d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            c1725f0.c = str4;
            c1725f0.f17944d = c1663b.f;
            c1725f0.e = (byte) (c1725f0.e | 1);
            arrayList.add(c1725f0.a());
        }
        if (arrayList.isEmpty()) {
            return c1707q;
        }
        C1706P c1706pA = c1707q.a();
        c1706pA.f = new C1731i0(arrayList);
        return c1706pA.a();
    }

    public static String i(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            bufferedInputStream.close();
            throw th2;
        }
    }

    public static C1915b j(Context context, w wVar, C1915b c1915b, N n7, C1667f c1667f, C1915b c1915b2, C2038a c2038a, t tVar, C1421c c1421c, i iVar, e eVar) {
        h2.r rVar = new h2.r(context, wVar, n7, c2038a, tVar);
        C1914a c1914a = new C1914a(c1915b, tVar, iVar);
        l2.a aVar = C1956a.f18760b;
        s.b(context);
        return new C1915b(rVar, c1914a, new C1956a(new C1957b(s.a().c(new C0620a(C1956a.c, C1956a.f18761d)).a("FIREBASE_CRASHLYTICS_REPORT", new c("json"), C1956a.e), tVar.h(), c1421c)), c1667f, c1915b2, wVar, eVar, 5);
    }

    public static List n(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new C1697G(str, str2));
        }
        Collections.sort(arrayList, new l(11));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void q(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean r(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                r(file2);
            }
        }
        return file.delete();
    }

    public static List s(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void d(m mVar) {
        Executor executor = (Executor) this.f18588d;
        synchronized (this) {
            ((ArrayList) this.f).add(new l0.d(executor, mVar, 0));
        }
    }

    public void e(f fVar) {
        ((ArrayList) this.h).add(new l0.d((Executor) this.f18588d, fVar, 1));
    }

    public void g() throws Throwable {
        ((S) this.h).k("ContentFetch", "Cancelling pending content fetch jobs");
        ((D0) this.f).b(null);
        H.x(kotlin.coroutines.g.f18170a, new c0.c(this, null));
        H.i((Gj.c) this.f18589g, null);
        D0 d0E = H.e(1);
        this.f = d0E;
        Ij.e eVar = U.f603a;
        this.f18589g = H.c(kotlin.coroutines.e.d(d0E, Ij.d.f2362a.limitedParallelism(5)));
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f18586a) {
            case 1:
                return new I2.c((U1.g) ((Gb.d) this.f18587b).get(), (B2.b) ((h) this.c).get(), (C2.e) ((v) this.f18588d).get(), (B2.b) ((G6.w) this.e).get(), (RemoteConfigManager) ((mg.c) this.f).get(), (K2.a) ((N4.d) this.f18589g).get(), (SessionManager) ((C1916a) this.h).get());
            case 2:
                PayMayaClientApi payMayaClientApi = (PayMayaClientApi) ((InterfaceC1101b) this.f18587b).get();
                com.paymaya.data.preference.a aVar = (com.paymaya.data.preference.a) ((InterfaceC1101b) this.c).get();
                C1220i c1220i = (C1220i) ((InterfaceC1101b) this.f18588d).get();
                L5.a aVar2 = (L5.a) ((InterfaceC1101b) this.e).get();
                MayaInboxNotificationsClientApi mayaInboxNotificationsClientApi = (MayaInboxNotificationsClientApi) ((InterfaceC1101b) this.f).get();
                A5.m mVar = (A5.m) ((InterfaceC1101b) this.f18589g).get();
                S5.c cVar = (S5.c) ((InterfaceC1101b) this.h).get();
                S0 s02 = new S0();
                s02.f11387b = aVar;
                s02.c = c1220i;
                s02.f11388d = payMayaClientApi;
                s02.e = aVar2;
                s02.f = mayaInboxNotificationsClientApi;
                s02.f11389g = mVar;
                s02.h = cVar;
                return s02;
            case 3:
                return new e0((e3.m) ((d3.d) this.f18587b).get(), (b3.U) ((d3.d) this.c).get(), (InterfaceC0875O) ((d3.d) this.f18588d).get(), (i0) ((d3.d) this.e).get(), (DataStore) ((d3.d) this.f).get(), (C0864D) ((d3.d) this.f18589g).get(), (CoroutineContext) ((d3.d) this.h).get());
            default:
                return new i1.f((Context) ((d3.c) this.f18587b).f16259b, (d1.e) ((InterfaceC0716a) this.c).get(), (InterfaceC1656d) ((InterfaceC0716a) this.f18588d).get(), (C1583c) ((U8.c) this.e).get(), (Executor) ((InterfaceC0716a) this.f).get(), (k1.b) ((InterfaceC0716a) this.f18589g).get(), new N4.d(27), new M2.b(27), (InterfaceC1655c) ((InterfaceC0716a) this.h).get());
        }
    }

    public void h(String str) {
        File file = new File((File) this.c, str);
        if (file.exists() && r(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public void k(String str, Callable callable) {
        ((Executor) this.e).execute(new P(5, str, (Object) this, (Object) callable));
    }

    public JSONObject l(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SessionDescription.ATTR_TYPE, "event");
        jSONObject.put("evtName", "content_fetch");
        B b8 = (B) this.f18587b;
        jSONObject.put(CmcdData.Factory.STREAMING_FORMAT_SS, b8.f);
        jSONObject.put("pg", B.f800x);
        jSONObject.put("ep", (int) (System.currentTimeMillis() / ((long) 1000)));
        jSONObject.put("f", b8.j);
        jSONObject.put("lsl", b8.m);
        jSONObject.put("pai", str);
        return jSONObject;
    }

    public File m(String str, String str2) {
        File file = new File((File) this.e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public boolean o(C1416a c1416a, boolean z4) {
        C1421c c1421c;
        int i = c1416a.f16544a;
        boolean z5 = i == 200;
        S s9 = (S) this.h;
        if (!z5) {
            if (i == 429) {
                s9.k("ContentFetch", "Content fetch request was rate limited (429). Consider reducing request frequency.");
                return false;
            }
            s9.k("ContentFetch", "Content fetch request failed with response code: " + i);
            return false;
        }
        BufferedReader bufferedReader = c1416a.f16546d;
        String strX = bufferedReader != null ? AbstractC0983W.x(bufferedReader) : null;
        JSONObject jSONObjectH = AbstractC0184q.h(strX);
        s9.k("ContentFetch", "Content fetch response received successfully with isUserSwitching = " + z4);
        if (strX != null && jSONObjectH != null && (c1421c = (C1421c) this.e) != null) {
            c1421c.i(false, jSONObjectH, strX, z4);
        }
        return true;
    }

    public void p(Throwable th2, Thread thread, String str, C1664c c1664c, boolean z4) {
        C2038a c2038a;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b8;
        boolean zEquals = str.equals(AppMeasurement.CRASH_ORIGIN);
        h2.r rVar = (h2.r) this.f18587b;
        Context context = rVar.f16907a;
        int i = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        r rVar2 = null;
        while (true) {
            boolean zIsEmpty = stack.isEmpty();
            c2038a = rVar.f16909d;
            if (zIsEmpty) {
                break;
            }
            Throwable th3 = (Throwable) stack.pop();
            rVar2 = new r(th3.getLocalizedMessage(), th3.getClass().getName(), c2038a.c(th3.getStackTrace()), rVar2, 25);
        }
        C1706P c1706p = new C1706P();
        c1706p.f17879b = str;
        c1706p.f17878a = c1664c.f17676b;
        c1706p.f17881g = (byte) (c1706p.f17881g | 1);
        E0 e0E = C1422d.f16557b.e(context);
        int i4 = ((C1717b0) e0E).c;
        Boolean boolValueOf = i4 > 0 ? Boolean.valueOf(i4 != 100) : null;
        ArrayList arrayListD = C1422d.d(context);
        byte b10 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) rVar2.f9804d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b11 = (byte) 1;
        List listD = h2.r.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        Boolean bool = boolValueOf;
        if (b11 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b11 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
        }
        arrayList.add(new C1713X(name, 4, listD));
        if (z4) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    b8 = b11;
                } else {
                    StackTraceElement[] stackTraceElementArrC = c2038a.c(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List listD2 = h2.r.d(stackTraceElementArrC, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b11 != 1) {
                        byte b12 = b11;
                        StringBuilder sb3 = new StringBuilder();
                        if (b12 == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(AbstractC1331a.o(sb3, "Missing required properties:"));
                    }
                    b8 = b11;
                    arrayList.add(new C1713X(name2, 0, listD2));
                }
                it2 = it;
                b11 = b8;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C1711V c1711vC = h2.r.c(rVar2, 0);
        C1712W c1712wE = h2.r.e();
        List listA = rVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        C1709T c1709t = new C1709T(listUnmodifiableList, c1711vC, null, c1712wE, listA);
        if (b10 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b10 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(AbstractC1331a.o(sb4, "Missing required properties:"));
        }
        c1706p.c = new C1708S(c1709t, null, null, bool, e0E, arrayListD, i);
        c1706p.f17880d = rVar.b(i);
        C1707Q c1707qA = c1706p.a();
        C1667f c1667f = (C1667f) this.e;
        C1915b c1915b = (C1915b) this.f;
        L0 l0F = f(c(c1707qA, c1667f, c1915b, c1664c.c), c1915b);
        if (z4) {
            ((C1914a) this.c).d(l0F, c1664c.f17675a, zEquals);
        } else {
            ((e) this.h).f17093b.a(new RunnableC0220c(2, this, l0F, c1664c, zEquals));
        }
    }

    public Task t(Executor executor, String str) {
        TaskCompletionSource taskCompletionSource;
        ArrayList<File> arrayListB = ((C1914a) this.c).b();
        ArrayList<C1531a> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                l2.a aVar = C1914a.f18582g;
                String strE = C1914a.e(file);
                aVar.getClass();
                arrayList.add(new C1531a(l2.a.i(strE), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C1531a c1531a : arrayList) {
            if (str == null || str.equals(c1531a.f16854b)) {
                C1956a c1956a = (C1956a) this.f18588d;
                C1693C c1693c = c1531a.f16853a;
                boolean z4 = true;
                if (c1693c.f == null || c1693c.f17836g == null) {
                    h2.v vVarB = ((w) this.f18589g).b(true);
                    C1692B c1692bA = c1531a.f16853a.a();
                    c1692bA.e = vVarB.f16919a;
                    C1692B c1692bA2 = c1692bA.a().a();
                    c1692bA2.f = vVarB.f16920b;
                    c1531a = new C1531a(c1692bA2.a(), c1531a.f16854b, c1531a.c);
                }
                boolean z5 = str != null;
                C1957b c1957b = c1956a.f18762a;
                synchronized (c1957b.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z5) {
                            ((AtomicInteger) c1957b.i.f16555b).getAndIncrement();
                            if (c1957b.f.size() >= c1957b.e) {
                                z4 = false;
                            }
                            if (z4) {
                                C1422d c1422d = C1422d.f16556a;
                                c1422d.c("Enqueueing report: " + c1531a.f16854b);
                                c1422d.c("Queue size: " + c1957b.f.size());
                                c1957b.f18766g.execute(new P(6, c1957b, c1531a, taskCompletionSource));
                                c1422d.c("Closing task for report: " + c1531a.f16854b);
                                taskCompletionSource.trySetResult(c1531a);
                            } else {
                                c1957b.a();
                                String str2 = "Dropping report due to queue being full: " + c1531a.f16854b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) c1957b.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(c1531a);
                            }
                        } else {
                            c1957b.b(c1531a, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new de.m(this, 8)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    public C1915b(CleverTapInstanceConfig cleverTapInstanceConfig, B b8, Ei.a aVar, r rVar) {
        this.f18586a = 4;
        this.f18587b = b8;
        this.c = aVar;
        this.f18588d = rVar;
        D0 d0E = H.e(1);
        this.f = d0E;
        Ij.e eVar = U.f603a;
        this.f18589g = H.c(kotlin.coroutines.e.d(d0E, Ij.d.f2362a.limitedParallelism(5)));
        this.h = cleverTapInstanceConfig.c();
    }

    public C1915b(CleverTapInstanceConfig cleverTapInstanceConfig, Executor executor, Executor executor2, String str) {
        this.f18586a = 8;
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.e = executor;
        this.f18588d = executor2;
        this.c = cleverTapInstanceConfig;
        this.f18587b = str;
    }

    public C1915b(I i, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2, InterfaceC1101b interfaceC1101b3, InterfaceC1101b interfaceC1101b4, InterfaceC1101b interfaceC1101b5, InterfaceC1101b interfaceC1101b6, InterfaceC1101b interfaceC1101b7) {
        this.f18586a = 2;
        this.f18587b = interfaceC1101b;
        this.c = interfaceC1101b2;
        this.f18588d = interfaceC1101b3;
        this.e = interfaceC1101b4;
        this.f = interfaceC1101b5;
        this.f18589g = interfaceC1101b6;
        this.h = interfaceC1101b7;
    }

    public C1915b(Context context) {
        String string;
        String strReplaceAll;
        this.f18586a = 0;
        String str = ((C1717b0) C1422d.f16557b.e(context)).f17919a;
        this.f18587b = str;
        File filesDir = context.getFilesDir();
        this.c = filesDir;
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            if (str.length() > 40) {
                strReplaceAll = h2.f.h(str);
            } else {
                strReplaceAll = str.replaceAll("[^a-zA-Z0-9.]", Global.UNDERSCORE);
            }
            sb2.append(strReplaceAll);
            string = sb2.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        q(file);
        this.f18588d = file;
        File file2 = new File(file, "open-sessions");
        q(file2);
        this.e = file2;
        File file3 = new File(file, "reports");
        q(file3);
        this.f = file3;
        File file4 = new File(file, "priority-reports");
        q(file4);
        this.f18589g = file4;
        File file5 = new File(file, "native-reports");
        q(file5);
        this.h = file5;
    }

    public C1915b(String str, C1915b c1915b, e eVar) {
        this.f18586a = 7;
        this.e = new B1.a(this, false);
        this.f = new B1.a(this, true);
        this.f18589g = new g();
        this.h = new AtomicMarkableReference(null, false);
        this.f18587b = str;
        this.c = new j2.h(c1915b);
        this.f18588d = eVar;
    }
}
