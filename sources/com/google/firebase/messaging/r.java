package com.google.firebase.messaging;

import D.CallableC0179l;
import D.CallableC0192z;
import D.H;
import D.S;
import Kh.J;
import M8.A0;
import ag.AbstractC0693c;
import ag.C0691a;
import ag.C0703m;
import aj.InterfaceC0716a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.util.Pair;
import b3.C0895p;
import b3.W;
import bf.InterfaceC0950c;
import bg.AbstractC0983W;
import bg.C0953A0;
import bg.C0955B0;
import bg.C0962F;
import bg.C0965G0;
import bg.C0975N;
import bg.C0977P;
import bg.C0978Q;
import bg.C0984X;
import bg.C0985Y;
import bg.C0986Z;
import bg.C0987a;
import bg.C0990b0;
import bg.C0991c;
import bg.C0992c0;
import bg.C0997f;
import bg.C0998f0;
import bg.C0999g;
import bg.C1001h;
import bg.C1002h0;
import bg.k0;
import bg.n0;
import bg.x0;
import bg.y0;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.Scopes;
import com.google.gson.JsonSyntaxException;
import com.paymaya.data.api.KycCmsApi;
import com.paymaya.domain.model.CustomerAccessToken;
import com.paymaya.domain.model.CustomerAccount;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.T;
import d3.InterfaceC1330b;
import df.C1356B;
import e1.InterfaceC1418b;
import e2.C1421c;
import f0.InterfaceC1454a;
import hf.InterfaceC1565c;
import i1.C1583c;
import io.split.android.client.dtos.Condition;
import io.split.android.client.dtos.Excluded;
import io.split.android.client.dtos.ExcludedSegment;
import io.split.android.client.dtos.RuleBasedSegment;
import io.split.android.client.dtos.Split;
import io.split.android.client.storage.db.SplitEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import j1.InterfaceC1656d;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k3.AbstractC1756a;
import ki.C1781b;
import kotlin.coroutines.CoroutineContext;
import li.ThreadFactoryC1841a;
import n2.C1915b;
import org.json.JSONException;
import org.json.JSONObject;
import p3.C2011b;
import si.C2260b;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Ch.c, Mi.a, Ch.f, Ui.k, InterfaceC1330b, InterfaceC0950c, InterfaceC1418b, io.split.android.client.storage.splits.a {
    public static r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static r f9801g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9803b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9804d;
    public Object e;

    public /* synthetic */ r(int i, boolean z4) {
        this.f9802a = i;
    }

    public static boolean m(C.d dVar, int i) {
        C.f fVar = (C.f) dVar.f653a.get();
        if (fVar == null) {
            return false;
        }
        Handler handler = C.m.f661d;
        handler.sendMessage(handler.obtainMessage(1, i, 0, fVar.f654a));
        return true;
    }

    public static synchronized r r() {
        try {
            if (f == null) {
                f = new r(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f;
    }

    public static r s() {
        if (f9801g == null) {
            f9801g = new r(2);
        }
        return f9801g;
    }

    public synchronized int A() {
        int i;
        String str = (String) ((Map) this.e).get("rc_w");
        i = 60;
        try {
            if (!TextUtils.isEmpty(str)) {
                i = (int) Double.parseDouble(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            S sC = ((CleverTapInstanceConfig) this.c).c();
            String strL = jk.b.l((CleverTapInstanceConfig) this.c);
            String str2 = "GetWindowIntervalInMinutes failed: " + e.getLocalizedMessage();
            sC.getClass();
            S.s(strL, str2);
        }
        return i;
    }

    public boolean B(Context context) {
        if (((Boolean) this.f9804d) == null) {
            this.f9804d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f9804d).booleanValue();
    }

    public boolean C(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public void D() {
        String strValueOf = String.valueOf(5);
        Map map = (Map) this.e;
        map.put("rc_n", strValueOf);
        map.put("rc_w", String.valueOf(60));
        map.put("ts", String.valueOf(0));
        map.put("fetch_min_interval_seconds", String.valueOf(InterfaceC1454a.f16684a));
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.c;
        S sC = cleverTapInstanceConfig.c();
        sC.getClass();
        S.s(jk.b.l(cleverTapInstanceConfig), "Settings loaded with default values: " + map);
    }

    public boolean E(C.f fVar) {
        C.d dVar = (C.d) this.f9804d;
        return (dVar == null || fVar == null || dVar.f653a.get() != fVar) ? false : true;
    }

    public synchronized void F(n0.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("fileutils can't be null");
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Product_Config_" + ((CleverTapInstanceConfig) this.c).f9439a + Global.UNDERSCORE + ((String) this.f9803b));
            sb2.append("/config_settings.json");
            H(t(dVar.b(sb2.toString())));
        } catch (Exception e) {
            e.printStackTrace();
            S sC = ((CleverTapInstanceConfig) this.c).c();
            String strL = jk.b.l((CleverTapInstanceConfig) this.c);
            String str = "LoadSettings failed while reading file: " + e.getLocalizedMessage();
            sC.getClass();
            S.s(strL, str);
        }
    }

    public void G() {
        synchronized (this.e) {
            while (((PriorityQueue) this.c).size() + ((PriorityQueue) this.f9803b).size() >= 120 && !((PriorityQueue) this.f9803b).isEmpty()) {
                try {
                    ((S0.b) ((PriorityQueue) this.f9803b).poll()).f5594b.recycle();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            while (((PriorityQueue) this.c).size() + ((PriorityQueue) this.f9803b).size() >= 120 && !((PriorityQueue) this.c).isEmpty()) {
                ((S0.b) ((PriorityQueue) this.c).poll()).f5594b.recycle();
            }
        }
    }

    public synchronized void H(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        String strValueOf = String.valueOf(jSONObject.get(next));
                        if (!TextUtils.isEmpty(strValueOf)) {
                            ((Map) this.e).put(next, strValueOf);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        S sC = ((CleverTapInstanceConfig) this.c).c();
                        String strL = jk.b.l((CleverTapInstanceConfig) this.c);
                        String str = "Failed loading setting for key " + next + " Error: " + e.getLocalizedMessage();
                        sC.getClass();
                        S.s(strL, str);
                    }
                }
            }
            S sC2 = ((CleverTapInstanceConfig) this.c).c();
            String strL2 = jk.b.l((CleverTapInstanceConfig) this.c);
            String str2 = "LoadSettings completed with settings: " + ((Map) this.e);
            sC2.getClass();
            S.s(strL2, str2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int I() {
        return ((ArrayDeque) this.c).size() + ((ArrayDeque) this.f9804d).size();
    }

    public void J(C.d dVar) {
        dVar.getClass();
        Handler handler = (Handler) this.c;
        handler.removeCallbacksAndMessages(dVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, dVar), 2750);
    }

    public synchronized void K(long j) {
        long jV = v();
        if (j >= 0 && jV != j) {
            ((Map) this.e).put("ts", String.valueOf(j));
            O();
        }
    }

    public synchronized void L(int i) {
        long jX = x();
        if (i > 0 && jX != i) {
            ((Map) this.e).put("rc_n", String.valueOf(i));
            O();
        }
    }

    public void M() {
        C.d dVar = (C.d) this.e;
        if (dVar != null) {
            this.f9804d = dVar;
            this.e = null;
            C.f fVar = (C.f) dVar.f653a.get();
            if (fVar == null) {
                this.f9804d = null;
            } else {
                Handler handler = C.m.f661d;
                handler.sendMessage(handler.obtainMessage(0, fVar.f654a));
            }
        }
    }

    public boolean N(io.split.android.client.storage.splits.b bVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = bVar.f17621b.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Gi.d) this.e).a(((Split) it.next()).name));
        }
        ArrayList arrayList3 = bVar.f17620a;
        C1421c c1421c = (C1421c) this.c;
        c1421c.getClass();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        Ri.a aVar = (Ri.a) c1421c.f16555b;
        int i = aVar.f5558b;
        if (size > i) {
            List listV = AbstractC0983W.v(size / i, arrayList3);
            ArrayList arrayList5 = new ArrayList(listV.size());
            Iterator it2 = listV.iterator();
            while (it2.hasNext()) {
                arrayList5.add(new CallableC0192z(new Z.n(5, c1421c, (List) it2.next()), 5));
            }
            try {
                List listInvokeAll = ((ExecutorService) aVar.c).invokeAll(arrayList5, 60, TimeUnit.SECONDS);
                arrayList = new ArrayList();
                Iterator it3 = listInvokeAll.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((Future) it3.next()).get());
                }
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                Ri.a.g(e.getLocalizedMessage());
                arrayList = new ArrayList();
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList4.addAll((List) it4.next());
            }
        } else {
            arrayList4 = C1421c.h(arrayList3, (Gi.d) c1421c.c);
        }
        ((SplitRoomDatabase) this.f9804d).runInTransaction(new io.split.android.client.storage.splits.e(this, bVar, arrayList4, arrayList2, concurrentHashMap, concurrentHashMap2, 0));
        return true;
    }

    public synchronized void O() {
        C1915b c1915bA = l0.b.a((CleverTapInstanceConfig) this.c).a();
        c1915bA.e(new C1258f0(this, 6));
        c1915bA.k("ProductConfigSettings#updateConfigToFile", new CallableC0192z(this, 3));
    }

    @Override // bf.InterfaceC0950c
    public void a(Serializable serializable) {
        this.c = serializable;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        CustomerAccount it = (CustomerAccount) obj;
        kotlin.jvm.internal.j.g(it, "it");
        A7.h hVar = (A7.h) this.c;
        String customerId = it.getOwner().getCustomerId();
        A7.f fVar = new A7.f(0, hVar, this.e);
        hVar.f214k.c(customerId, (String) this.f9803b, (String) this.f9804d, fVar);
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        CustomerAccessToken customerAccessToken = (CustomerAccessToken) obj;
        kotlin.jvm.internal.j.g(customerAccessToken, "customerAccessToken");
        JSONObject jSONObjectF = A0.f((String) this.f9803b, (String) this.f9804d, (String) this.e, ((Boolean) this.c).booleanValue());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Scopes.PROFILE, jSONObjectF);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("customer_access_token", customerAccessToken.getToken());
        } catch (JSONException unused2) {
            yk.a.e();
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    @Override // bf.InterfaceC0950c
    public void b(String str, HashMap map) {
        this.f9803b = "sqlite_error";
        this.f9804d = str;
        this.e = map;
    }

    @Override // Ui.k
    public boolean c(Object obj, HashMap map, U8.c cVar) {
        Cg.c cVar2;
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        Mi.c cVar3 = (Mi.c) this.c;
        RuleBasedSegment ruleBasedSegment = (RuleBasedSegment) cVar3.f3410a.get((String) this.f9803b);
        if (ruleBasedSegment == null) {
            cVar2 = null;
        } else {
            Q6.n nVar = cVar3.f3411b;
            nVar.getClass();
            String name = ruleBasedSegment.getName();
            Excluded excluded = ruleBasedSegment.getExcluded();
            List<Condition> conditions = ruleBasedSegment.getConditions();
            StringBuilder sbW = We.s.w("Dropping rule based segment name=", name, " due to large number of conditions (");
            sbW.append(conditions.size());
            sbW.append(")");
            List listU = ((Ci.b) nVar.f5284b).u(str, sbW.toString(), conditions);
            if (listU == null) {
                listU = new ArrayList();
            }
            if (excluded == null) {
                excluded = Excluded.createEmpty();
            }
            Set<String> keys = excluded.getKeys();
            Set<ExcludedSegment> segments = excluded.getSegments();
            ruleBasedSegment.getTrafficTypeName();
            ruleBasedSegment.getChangeNumber();
            cVar2 = new Cg.c(keys, segments, listU);
        }
        if (cVar2 == null || ((Set) cVar2.f768b).contains(str)) {
            return false;
        }
        for (ExcludedSegment excludedSegment : (Set) cVar2.c) {
            boolean zIsStandard = excludedSegment.isStandard();
            Li.b bVar = (Li.b) this.f9804d;
            if (zIsStandard && bVar.getAll().contains(excludedSegment.getName())) {
                return false;
            }
            boolean zIsRuleBased = excludedSegment.isRuleBased();
            Li.b bVar2 = (Li.b) this.e;
            if (zIsRuleBased && new r(cVar3, bVar, bVar2, excludedSegment.getName()).c(str, map, cVar)) {
                return false;
            }
            if (excludedSegment.isLarge() && bVar2.getAll().contains(excludedSegment.getName())) {
                return false;
            }
        }
        Iterator it = ((List) cVar2.f769d).iterator();
        while (it.hasNext()) {
            if (((Ti.a) it.next()).f5843b.a(str, map, cVar)) {
                return true;
            }
        }
        return false;
    }

    public df.j d(boolean z4) throws IOException {
        try {
            df.j jVarD = ((InterfaceC1565c) this.e).d(z4);
            if (jVarD == null) {
                return jVarD;
            }
            if (M2.b.c == null) {
                throw null;
            }
            jVarD.m = this;
            return jVarD;
        } catch (IOException e) {
            ((mg.c) this.c).getClass();
            f(e);
            throw e;
        }
    }

    public IOException e(boolean z4, boolean z5, IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        mg.c cVar = (mg.c) this.c;
        if (z5) {
            if (iOException != null) {
                cVar.getClass();
            } else {
                cVar.getClass();
            }
        }
        if (z4) {
            if (iOException != null) {
                cVar.getClass();
            } else {
                cVar.getClass();
            }
        }
        return ((gf.k) this.f9803b).a(this, z5, z4, iOException);
    }

    public void f(IOException iOException) {
        ((gf.d) this.f9804d).e();
        gf.e eVarConnection = ((InterfaceC1565c) this.e).connection();
        synchronized (eVarConnection.f16813b) {
            try {
                if (iOException instanceof com.tencent.cloud.ai.network.okhttp3.internal.http2.v) {
                    int i = ((com.tencent.cloud.ai.network.okhttp3.internal.http2.v) iOException).f15523a;
                    if (i == 5) {
                        int i4 = eVarConnection.f16818n + 1;
                        eVarConnection.f16818n = i4;
                        if (i4 > 1) {
                            eVarConnection.f16816k = true;
                            eVarConnection.f16817l++;
                        }
                    } else if (i != 6) {
                        eVarConnection.f16816k = true;
                        eVarConnection.f16817l++;
                    }
                } else {
                    if (!(eVarConnection.h != null) || (iOException instanceof com.tencent.cloud.ai.network.okhttp3.internal.http2.a)) {
                        eVarConnection.f16816k = true;
                        if (eVarConnection.m == 0) {
                            eVarConnection.f16813b.b(eVarConnection.c, iOException);
                            eVarConnection.f16817l++;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(ArrayDeque arrayDeque, C1356B c1356b) {
        synchronized (this) {
            if (!arrayDeque.remove(c1356b)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        i();
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f9802a) {
            case 10:
                return new C0895p((U1.g) ((d3.d) this.f9803b).get(), (e3.m) ((d3.d) this.c).get(), (CoroutineContext) ((d3.d) this.f9804d).get(), (W) ((d3.d) this.e).get());
            default:
                return new i1.g((Executor) ((InterfaceC0716a) this.f9803b).get(), (InterfaceC1656d) ((InterfaceC0716a) this.c).get(), (C1583c) ((U8.c) this.f9804d).get(), (k1.b) ((InterfaceC0716a) this.e).get());
        }
    }

    public C0703m[] h() {
        Context context = (Context) this.f9803b;
        n0 n0Var = (n0) this.f9804d;
        C0965G0 c0965g0 = (C0965G0) this.e;
        C0962F c0962f = new C0962F(context, n0Var, c0965g0);
        int i = 2;
        AbstractC0693c.c(c0962f, C0962F.f8784t, null, C0985Y.f8905q, 2);
        AbstractC0693c.c(c0962f, C0962F.f8785u, null, C0999g.h, 2);
        AbstractC0693c.c(c0962f, C0962F.f8786v, null, C0999g.f8990u, 2);
        AbstractC0693c.c(c0962f, C0962F.f8788w, null, C0999g.m, 2);
        int i4 = 15;
        AbstractC0693c.c(c0962f, C0962F.f8789x, null, new C0991c(c0962f, i4), 2);
        AbstractC0693c.c(c0962f, C0962F.f8791y, null, new C0991c(c0962f, i), 2);
        int i6 = 0;
        AbstractC0693c.c(c0962f, C0962F.f8733B, null, new C0991c(c0962f, i6), 2);
        int i10 = 14;
        AbstractC0693c.c(c0962f, C0962F.f8735C, null, new k0(c0962f, i10), 2);
        AbstractC0693c.c(c0962f, C0962F.f8792z, null, new C0991c(c0962f, 27), 2);
        AbstractC0693c.c(c0962f, C0962F.f8731A, null, new C0991c(c0962f, 24), 2);
        AbstractC0693c.c(c0962f, C0962F.f8741F, null, new C0991c(c0962f, 10), 2);
        AbstractC0693c.c(c0962f, C0962F.f8743G, null, new C0991c(c0962f, 20), 2);
        AbstractC0693c.c(c0962f, C0962F.f8745H, null, new C0991c(c0962f, 8), 2);
        AbstractC0693c.c(c0962f, C0962F.f8747I, null, new C0991c(c0962f, i10), 2);
        AbstractC0693c.c(c0962f, C0962F.f8749K, null, new C0991c(c0962f, 17), 2);
        AbstractC0693c.c(c0962f, C0962F.J, null, new C0991c(c0962f, 12), 2);
        int i11 = 6;
        AbstractC0693c.c(c0962f, C0962F.f8754O, null, new k0(c0962f, i11), 2);
        AbstractC0693c.c(c0962f, C0962F.f8755P, null, new k0(c0962f, i4), 2);
        int i12 = 13;
        AbstractC0693c.c(c0962f, C0962F.f8756Q, null, new k0(c0962f, i12), 2);
        int i13 = 5;
        AbstractC0693c.c(c0962f, C0962F.f8757R, null, new k0(c0962f, i13), 2);
        int i14 = 7;
        AbstractC0693c.c(c0962f, C0962F.f8758S, null, new k0(c0962f, i14), 2);
        int i15 = 9;
        AbstractC0693c.c(c0962f, C0962F.f8759T, null, new k0(c0962f, i15), 2);
        int i16 = 11;
        AbstractC0693c.c(c0962f, C0962F.f8760U, null, new k0(c0962f, i16), 2);
        AbstractC0693c.c(c0962f, C0962F.f8761V, null, new k0(c0962f, i6), 2);
        AbstractC0693c.c(c0962f, C0962F.f8762W, null, C0985Y.f8902n, 2);
        int i17 = 4;
        AbstractC0693c.c(c0962f, C0962F.f8763X, null, new k0(c0962f, i17), 2);
        AbstractC0693c.c(c0962f, C0962F.f8764Y, null, C0985Y.f8904p, 2);
        AbstractC0693c.c(c0962f, C0962F.f8765Z, null, C0985Y.m, 2);
        AbstractC0693c.c(c0962f, C0962F.f8766a0, null, C0999g.f8978T, 2);
        AbstractC0693c.c(c0962f, C0962F.f8767b0, null, C0999g.f8976R, 2);
        AbstractC0693c.c(c0962f, C0962F.f8768c0, null, C0999g.f8993x, 2);
        AbstractC0693c.c(c0962f, C0962F.f8769d0, null, new C0991c(c0962f, i13), 2);
        AbstractC0693c.c(c0962f, C0962F.f8739E, null, new C0991c(c0962f, 18), 2);
        AbstractC0693c.c(c0962f, C0962F.f8737D, null, new C0991c(c0962f, 21), 2);
        AbstractC0693c.c(c0962f, C0962F.f8770e0, null, new C0991c(c0962f, i15), 2);
        AbstractC0693c.c(c0962f, C0962F.f8771f0, null, new C0991c(c0962f, i16), 2);
        AbstractC0693c.c(c0962f, C0962F.f8772g0, null, new C0991c(c0962f, 16), 2);
        AbstractC0693c.c(c0962f, C0962F.f8773h0, null, new C0991c(c0962f, 19), 2);
        AbstractC0693c.c(c0962f, C0962F.f8774i0, null, new C0991c(c0962f, 22), 2);
        AbstractC0693c.c(c0962f, C0962F.f8775j0, null, new C0991c(c0962f, i12), 2);
        AbstractC0693c.c(c0962f, C0962F.f8776k0, null, new C0991c(c0962f, i14), 2);
        AbstractC0693c.c(c0962f, C0962F.f8777l0, null, new C0991c(c0962f, 25), 2);
        AbstractC0693c.c(c0962f, C0962F.m0, null, new C0991c(c0962f, 29), 2);
        int i18 = 1;
        AbstractC0693c.c(c0962f, C0962F.f8778n0, null, new k0(c0962f, i18), 2);
        int i19 = 3;
        AbstractC0693c.c(c0962f, C0962F.f8779o0, null, new k0(c0962f, i19), 2);
        AbstractC0693c.c(c0962f, C0962F.f8780p0, null, new C0991c(c0962f, 28), 2);
        AbstractC0693c.c(c0962f, C0962F.f8753N, null, C0999g.f8974P, 2);
        AbstractC0693c.c(c0962f, C0962F.f8752M, null, C0999g.f8989t, 2);
        AbstractC0693c.c(c0962f, C0962F.f8751L, null, C0999g.f8992w, 2);
        AbstractC0693c.c(c0962f, C0962F.f8781q0, null, new C0991c(c0962f, i11), 2);
        AbstractC0693c.c(c0962f, C0962F.f8782r0, null, new C0991c(c0962f, i19), 2);
        AbstractC0693c.c(c0962f, C0962F.f8783s0, null, new C0991c(c0962f, i18), 2);
        AbstractC0693c.c(c0962f, C0962F.t0, null, new k0(c0962f, 10), 2);
        AbstractC0693c.c(c0962f, C0962F.u0, null, new k0(c0962f, 8), 2);
        AbstractC0693c.c(c0962f, C0962F.f8787v0, null, new k0(c0962f, 12), 2);
        AbstractC0693c.c(c0962f, C0962F.w0, null, new C0991c(c0962f, i17), 2);
        AbstractC0693c.c(c0962f, C0962F.f8790x0, null, C0999g.f8982l, 2);
        AbstractC0693c.c(c0962f, C0962F.y0, null, C0985Y.f8910v, 2);
        AbstractC0693c.c(c0962f, C0962F.f8793z0, null, C0999g.f8985p, 2);
        AbstractC0693c.c(c0962f, C0962F.f8732A0, null, C0999g.f8987r, 2);
        AbstractC0693c.c(c0962f, C0962F.f8734B0, null, C0985Y.f8913y, 2);
        AbstractC0693c.c(c0962f, C0962F.f8736C0, null, C0985Y.f8909u, 2);
        AbstractC0693c.c(c0962f, C0962F.f8738D0, null, C0985Y.f8906r, 2);
        AbstractC0693c.c(c0962f, C0962F.f8740E0, null, C0691a.f7185q, 2);
        AbstractC0693c.c(c0962f, C0962F.f8742F0, null, C0999g.f8980g, 2);
        AbstractC0693c.c(c0962f, C0962F.f8744G0, null, C0985Y.f8897S, 2);
        AbstractC0693c.c(c0962f, C0962F.f8746H0, null, C0985Y.f8912x, 2);
        AbstractC0693c.c(c0962f, C0962F.I0, null, new C0991c(c0962f, 23), 2);
        AbstractC0693c.c(c0962f, C0962F.f8748J0, null, new k0(c0962f, i), 2);
        AbstractC0693c.c(c0962f, C0962F.f8750K0, null, new C0991c(c0962f, 26), 2);
        C0703m c0703mF = c0962f.f();
        x0 x0Var = (x0) this.c;
        C0998f0 c0998f0 = new C0998f0(context, n0Var, x0Var, c0965g0);
        AbstractC0693c.c(c0998f0, C0998f0.i, null, new C0987a(c0998f0, i14), 2);
        AbstractC0693c.c(c0998f0, C0998f0.j, null, new C0987a(c0998f0, i12), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8955k, null, new C0987a(c0998f0, i11), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8956l, null, new C0987a(c0998f0, 11), 2);
        c0998f0.d(C0998f0.m, C0985Y.f8903o, new C0987a(c0998f0, 16));
        AbstractC0693c.c(c0998f0, C0998f0.f8957n, null, new C0987a(c0998f0, i17), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8958o, null, new C0987a(c0998f0, 5), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8959p, null, new C0987a(c0998f0, i18), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8960q, null, new C0987a(c0998f0, 3), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8961r, null, new C0987a(c0998f0, i), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8962s, null, C0985Y.f8900k, 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8963t, null, C0999g.j, 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8964u, null, new C0987a(c0998f0, 20), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8965v, null, new C0987a(c0998f0, 18), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8966w, null, new C0987a(c0998f0, 19), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8967x, null, new C0987a(c0998f0, 21), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8968y, null, new C0985Y(c0998f0), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8969z, null, new C0987a(c0998f0, 0), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8947A, null, new C0987a(c0998f0, 8), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8948B, null, new C0987a(c0998f0, 9), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8949C, null, C0985Y.f8901l, 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8950D, null, new C0987a(c0998f0, 14), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8951E, null, new C0987a(c0998f0, 10), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8952F, null, new C0987a(c0998f0, 12), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8953G, null, new C0987a(c0998f0, 17), 2);
        AbstractC0693c.c(c0998f0, C0998f0.f8954H, null, new C0987a(c0998f0, 15), 2);
        C0703m c0703mF2 = c0998f0.f();
        C0975N c0975n = new C0975N(context, c0965g0);
        AbstractC0693c.c(c0975n, C0975N.f8825d, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.e, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8826g, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.h, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.i, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.j, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8827k, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8828l, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.m, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8833r, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8834s, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8835t, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8837v, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8839x, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8829n, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8830o, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8831p, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8832q, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8836u, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8838w, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8840y, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8841z, null, null, 6);
        AbstractC0693c.c(c0975n, C0975N.f8824A, null, null, 6);
        C0703m c0703mF3 = c0975n.f();
        C1002h0 c1002h0 = new C1002h0(context, x0Var, c0965g0);
        AbstractC0693c.c(c1002h0, C1002h0.e, null, null, 6);
        AbstractC0693c.c(c1002h0, C1002h0.f, null, null, 6);
        AbstractC0693c.c(c1002h0, C1002h0.f9009g, null, null, 6);
        AbstractC0693c.c(c1002h0, C1002h0.h, null, null, 6);
        AbstractC0693c.c(c1002h0, C1002h0.i, null, null, 6);
        AbstractC0693c.c(c1002h0, C1002h0.j, null, null, 6);
        AbstractC0693c.c(c1002h0, C1002h0.f9010k, null, null, 6);
        AbstractC0693c.c(c1002h0, C1002h0.f9011l, new O4.k(c1002h0, 7), null, 4);
        AbstractC0693c.c(c1002h0, C1002h0.m, null, null, 6);
        C0703m c0703mF4 = c1002h0.f();
        C0984X c0984x = new C0984X(context, x0Var, c0965g0);
        AbstractC0693c.c(c0984x, C0984X.e, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8875g, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.h, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.i, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.j, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8876k, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8877l, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.m, C0999g.f8977S, null, 4);
        AbstractC0693c.c(c0984x, C0984X.f8878n, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8879o, new O4.k(c0984x, i11), null, 4);
        AbstractC0693c.c(c0984x, C0984X.f8880p, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8881q, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8882r, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8883s, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8884t, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8885u, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8886v, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8887w, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8888x, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8889y, null, null, 6);
        AbstractC0693c.c(c0984x, C0984X.f8890z, null, null, 6);
        C0703m c0703mF5 = c0984x.f();
        C0955B0 c0955b0 = new C0955B0(context, n0Var, c0965g0);
        AbstractC0693c.c(c0955b0, C0955B0.f8698q, null, new C0953A0(c0955b0, 7), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8700r, null, new C0997f(c0955b0, i), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8702s, null, new C0997f(c0955b0, 3), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8704t, null, new C0997f(c0955b0, i17), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8705u, null, new C0997f(c0955b0, 5), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8706v, null, new C0997f(c0955b0, 6), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8708w, null, new C0997f(c0955b0, 7), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8709x, null, new C0997f(c0955b0, 9), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8711y, null, new C0997f(c0955b0, 12), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8712z, null, new C0997f(c0955b0, 13), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8651A, null, new C0997f(c0955b0, 14), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8653B, null, new C0997f(c0955b0, 15), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8655C, null, new C0997f(c0955b0, 16), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8657D, null, new C0997f(c0955b0, 19), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8659E, null, new C0997f(c0955b0, 21), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8661F, null, new C0997f(c0955b0, 1), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8663G, null, new C0997f(c0955b0, 0), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8665H, null, new C0997f(c0955b0, 11), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8666I, null, new C0997f(c0955b0, 17), 2);
        AbstractC0693c.c(c0955b0, C0955B0.J, null, new C0997f(c0955b0, 8), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8667K, null, new C0997f(c0955b0, 10), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8668L, null, new C0997f(c0955b0, 18), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8669M, null, new C0997f(c0955b0, 20), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8670N, null, new C0997f(c0955b0, 27), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8671O, null, new y0(c0955b0, 15), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8672P, null, new C0997f(c0955b0, 25), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8673Q, null, new y0(c0955b0, 5), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8676T, null, new y0(c0955b0, 14), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8677U, null, new y0(c0955b0, 23), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8678V, null, new y0(c0955b0, 25), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8679W, null, new y0(c0955b0, 20), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8680X, null, new y0(c0955b0, 22), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8681Y, null, new y0(c0955b0, 24), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8682Z, null, new C0997f(c0955b0, 23), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8683a0, null, new C0997f(c0955b0, 26), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8684b0, null, new C0997f(c0955b0, 28), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8685c0, null, new C0953A0(c0955b0, 3), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8686d0, null, new C0953A0(c0955b0, 5), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8687e0, null, new C0997f(c0955b0, 22), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8674R, null, new C0953A0(c0955b0, 0), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8688f0, null, new C0953A0(c0955b0, i17), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8675S, null, new C0953A0(c0955b0, 6), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8689g0, null, new C0953A0(c0955b0, 1), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8690h0, null, new y0(c0955b0, 18), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8691i0, null, new y0(c0955b0, 29), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8692j0, null, new y0(c0955b0, 21), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8693k0, null, new C0997f(c0955b0, 24), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8694l0, null, new y0(c0955b0, 13), 2);
        AbstractC0693c.c(c0955b0, C0955B0.m0, null, new y0(c0955b0, 11), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8695n0, null, new y0(c0955b0, 9), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8696o0, null, new C0953A0(c0955b0, i), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8697p0, null, new y0(c0955b0, 27), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8699q0, null, new y0(c0955b0, i), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8701r0, null, new y0(c0955b0, i17), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8703s0, null, new y0(c0955b0, 6), 2);
        AbstractC0693c.c(c0955b0, C0955B0.t0, null, new y0(c0955b0, 3), 2);
        AbstractC0693c.c(c0955b0, C0955B0.u0, null, new y0(c0955b0, 8), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8707v0, null, new C0997f(c0955b0, 29), 2);
        AbstractC0693c.c(c0955b0, C0955B0.w0, null, new y0(c0955b0, 1), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8710x0, null, new y0(c0955b0, 10), 2);
        AbstractC0693c.c(c0955b0, C0955B0.y0, null, new y0(c0955b0, 12), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8713z0, null, new y0(c0955b0, 0), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8652A0, null, new y0(c0955b0, 7), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8654B0, null, new y0(c0955b0, 19), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8656C0, null, new y0(c0955b0, 17), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8658D0, null, new y0(c0955b0, 16), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8660E0, null, new y0(c0955b0, 28), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8662F0, null, new y0(c0955b0, 26), 2);
        AbstractC0693c.c(c0955b0, C0955B0.f8664G0, null, C0985Y.f8892B, 2);
        C0703m c0703mF6 = c0955b0.f();
        C0990b0 c0990b0 = new C0990b0(context, c0965g0);
        AbstractC0693c.c(c0990b0, C0990b0.e, null, new C0986Z(c0990b0, 3), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f, null, new C0986Z(c0990b0, 1), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8922g, null, new C0986Z(c0990b0, 0), 2);
        AbstractC0693c.c(c0990b0, C0990b0.h, null, new C0986Z(c0990b0, i), 2);
        AbstractC0693c.c(c0990b0, C0990b0.i, null, new C0986Z(c0990b0, 9), 2);
        AbstractC0693c.c(c0990b0, C0990b0.j, null, new C0986Z(c0990b0, 5), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8923k, null, new C0986Z(c0990b0, 6), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8924l, null, new C0986Z(c0990b0, 7), 2);
        AbstractC0693c.c(c0990b0, C0990b0.m, null, new C0986Z(c0990b0, 8), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8925n, null, new C0986Z(c0990b0, 10), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8926o, null, new C0986Z(c0990b0, 11), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8927p, null, new C0986Z(c0990b0, 12), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8928q, null, new C0986Z(c0990b0, 14), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8929r, null, new C0986Z(c0990b0, 13), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8930s, null, new C0986Z(c0990b0, 15), 2);
        AbstractC0693c.c(c0990b0, C0990b0.f8931t, null, new C0986Z(c0990b0, i17), 2);
        C0703m c0703mF7 = c0990b0.f();
        C0992c0 c0992c0 = new C0992c0(context, n0Var, c0965g0);
        AbstractC0693c.c(c0992c0, C0992c0.e, null, C0985Y.f, 2);
        AbstractC0693c.c(c0992c0, C0992c0.f, null, C0985Y.f8899g, 2);
        AbstractC0693c.c(c0992c0, C0992c0.f8935g, null, C0985Y.e, 2);
        AbstractC0693c.c(c0992c0, C0992c0.h, null, C0985Y.i, 2);
        AbstractC0693c.c(c0992c0, C0992c0.i, null, C0985Y.h, 2);
        C0703m c0703mF8 = c0992c0.f();
        C1001h c1001h = new C1001h(context, c0965g0);
        AbstractC0693c.c(c1001h, C1001h.f8997d, null, C0999g.f8979b, 2);
        AbstractC0693c.c(c1001h, C1001h.e, null, C0691a.f7187s, 2);
        AbstractC0693c.c(c1001h, C1001h.f, null, C0691a.f7188t, 2);
        AbstractC0693c.c(c1001h, C1001h.f8998g, null, C0691a.f7175R, 2);
        AbstractC0693c.c(c1001h, C1001h.h, null, C0691a.f7177T, 2);
        AbstractC0693c.c(c1001h, C1001h.i, null, C0691a.f7192x, 2);
        AbstractC0693c.c(c1001h, C1001h.j, null, C0691a.f7193y, 2);
        AbstractC0693c.c(c1001h, C1001h.f8999k, null, C0691a.f7191w, 2);
        AbstractC0693c.c(c1001h, C1001h.f9000l, null, C0691a.f7189u, 2);
        AbstractC0693c.c(c1001h, C1001h.m, null, C0691a.f7190v, 2);
        AbstractC0693c.c(c1001h, C1001h.f9001n, null, C0691a.f7173P, 2);
        AbstractC0693c.c(c1001h, C1001h.f9002o, null, C0691a.f7171B, 2);
        AbstractC0693c.c(c1001h, C1001h.f9003p, null, C0691a.f7172K, 2);
        AbstractC0693c.c(c1001h, C1001h.f9004q, null, C0691a.f7176S, 2);
        AbstractC0693c.c(c1001h, C1001h.f9005r, null, C0691a.f7174Q, 2);
        AbstractC0693c.c(c1001h, C1001h.f9006s, null, C0999g.f, 2);
        AbstractC0693c.c(c1001h, C1001h.f9007t, null, C0999g.c, 2);
        AbstractC0693c.c(c1001h, C1001h.f9008u, null, C0999g.e, 2);
        C0703m c0703mF9 = c1001h.f();
        C0978Q c0978q = new C0978Q(context, n0Var, c0965g0);
        AbstractC0693c.c(c0978q, C0978Q.f8851g, null, new C0977P(c0978q, 1), 2);
        AbstractC0693c.c(c0978q, C0978Q.h, null, new C0977P(c0978q, 0), 2);
        AbstractC0693c.c(c0978q, C0978Q.i, null, new C0977P(c0978q, i), 2);
        AbstractC0693c.c(c0978q, C0978Q.j, null, new C0977P(c0978q, 3), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8852k, null, new C0977P(c0978q, 4), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8853l, null, new C0977P(c0978q, 5), 2);
        AbstractC0693c.c(c0978q, C0978Q.m, null, new C0977P(c0978q, 6), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8854n, null, new C0977P(c0978q, 7), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8855o, null, new C0977P(c0978q, 8), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8856p, null, new C0977P(c0978q, 9), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8857q, null, new C0977P(c0978q, 10), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8858r, null, new C0977P(c0978q, 11), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8859s, null, new C0977P(c0978q, 12), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8860t, null, new C0977P(c0978q, 18), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8861u, null, new C0977P(c0978q, 19), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8862v, null, new C0977P(c0978q, 20), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8863w, null, new C0977P(c0978q, 21), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8864x, null, new C0977P(c0978q, 22), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8865y, null, new C0977P(c0978q, 23), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8866z, null, new C0977P(c0978q, 14), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8847A, null, new C0977P(c0978q, 15), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8848B, null, new C0977P(c0978q, 17), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8849C, null, new C0977P(c0978q, 16), 2);
        AbstractC0693c.c(c0978q, C0978Q.f8850D, null, new C0977P(c0978q, 13), 2);
        return new C0703m[]{c0703mF, c0703mF2, c0703mF3, c0703mF4, c0703mF5, c0703mF6, c0703mF7, c0703mF8, c0703mF9, c0978q.f()};
    }

    public void i() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.e).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.c).size() < 64) {
                        throw null;
                    }
                }
                I();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList.size() > 0) {
            if (arrayList.get(0) != null) {
                throw new ClassCastException();
            }
            p();
            throw null;
        }
    }

    public void j(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        ((LinkedHashSet) this.f9804d).add(new Pair(str, str2));
    }

    public URI k() {
        String strI;
        String str;
        LinkedHashSet<Pair> linkedHashSet = (LinkedHashSet) this.f9804d;
        if (linkedHashSet.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Pair pair : linkedHashSet) {
                sb2.append((String) pair.first);
                sb2.append("=");
                sb2.append((String) pair.second);
                sb2.append("&");
            }
            strI = sb2.substring(0, sb2.length() - 1);
        } else {
            strI = null;
        }
        String str2 = (String) this.e;
        if (AbstractC0983W.q(str2)) {
            str = strI;
        } else if (AbstractC0983W.q(strI)) {
            str = str2;
        } else {
            if (!"&".equals(str2.substring(0, 1))) {
                strI = We.s.i(strI, "&");
            }
            strI = We.s.i(strI, str2);
            str = strI;
        }
        URI uri = (URI) this.c;
        return new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(), (String) this.f9803b, str, null);
    }

    public void l(S0.b bVar) {
        synchronized (this.e) {
            G();
            ((PriorityQueue) this.c).offer(bVar);
        }
    }

    public void n(C.f fVar) {
        synchronized (this.f9803b) {
            try {
                if (E(fVar)) {
                    ((Handler) this.c).removeCallbacksAndMessages((C.d) this.f9804d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String o(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X509Certificate x509Certificate = (X509Certificate) it.next();
            sb2.append(x509Certificate.getSubjectDN().getName());
            sb2.append(" - sha256/");
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            ((M2.b) this.e).getClass();
            byte[] bArrT = M2.b.T("sha256", encoded);
            ((C2011b) this.f9804d).getClass();
            sb2.append(Base64.encodeToString(bArrT, 0));
        }
        return sb2.toString();
    }

    public synchronized ExecutorService p() {
        try {
            if (((ThreadPoolExecutor) this.f9803b) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                byte[] bArr = ef.c.f16663a;
                this.f9803b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ef.b(0, "OkHttp Dispatcher", false));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (ThreadPoolExecutor) this.f9803b;
    }

    public d0.b q() {
        return (d0.b) ((InterfaceC1033d) this.e).getValue();
    }

    public JSONObject t(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.c;
            S sC = cleverTapInstanceConfig.c();
            String strL = jk.b.l(cleverTapInstanceConfig);
            String str2 = "LoadSettings failed: " + e.getLocalizedMessage();
            sC.getClass();
            S.s(strL, str2);
            return null;
        }
    }

    public Ah.p u() {
        boolean zB = S5.c.b((S5.c) this.f9804d, A5.b.w0);
        KycCmsApi kycCmsApi = (KycCmsApi) this.f9803b;
        if (zB) {
            return kycCmsApi.getCmsEkycShortFlowContentV8().h(Th.e.c).d(new C1258f0(this, 0));
        }
        com.paymaya.data.preference.a aVar = (com.paymaya.data.preference.a) this.c;
        if (aVar.I() && aVar.e().isShortenedFlowPhilsysEnabled() && aVar.e().isKycCMSv8MockEnabled()) {
            return new J(new CallableC0179l((Context) this.e, 1), 3).h(Th.e.c);
        }
        if (!aVar.I() || !aVar.e().isShortenedFlowPhilsysEnabled()) {
            return aVar.I() ? kycCmsApi.getCmsEkycShortFlowContentV6().h(Th.e.c) : kycCmsApi.getCmsContent().h(Th.e.c);
        }
        Lh.h hVarH = kycCmsApi.getCmsEkycShortFlowContentV7().h(Th.e.c);
        return aVar.e().isKycCmsV7InjectTofuFieldsEnabled() ? hVarH.d(new T(this, 1)) : hVarH;
    }

    public synchronized long v() {
        long j;
        String str = (String) ((Map) this.e).get("ts");
        j = 0;
        try {
            if (!TextUtils.isEmpty(str)) {
                j = (long) Double.parseDouble(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            S sC = ((CleverTapInstanceConfig) this.c).c();
            String strL = jk.b.l((CleverTapInstanceConfig) this.c);
            String str2 = "GetLastFetchTimeStampInMillis failed: " + e.getLocalizedMessage();
            sC.getClass();
            S.s(strL, str2);
        }
        return j;
    }

    public Xh.b w(String str, io.split.android.client.storage.attributes.c cVar) {
        C1421c c1421c = new C1421c(11, str, cVar);
        return new Xh.b(cVar, (Si.d) this.f9803b, (Si.d) this.c, (io.split.android.client.storage.attributes.d) this.f9804d, c1421c, (C1781b) this.e);
    }

    public synchronized int x() {
        int i;
        String str = (String) ((Map) this.e).get("rc_n");
        i = 5;
        try {
            if (!TextUtils.isEmpty(str)) {
                i = (int) Double.parseDouble(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            S sC = ((CleverTapInstanceConfig) this.c).c();
            String strL = jk.b.l((CleverTapInstanceConfig) this.c);
            String str2 = "GetNoOfCallsInAllowedWindow failed: " + e.getLocalizedMessage();
            sC.getClass();
            S.s(strL, str2);
        }
        return i;
    }

    public ArrayList y() {
        ArrayList arrayList;
        synchronized (this.e) {
            arrayList = new ArrayList((PriorityQueue) this.f9803b);
            arrayList.addAll((PriorityQueue) this.c);
        }
        return arrayList;
    }

    public X2.e z() {
        ArrayList arrayList;
        String strR;
        SplitRoomDatabase splitRoomDatabase = (SplitRoomDatabase) this.f9804d;
        Map<String, SplitEntity> allAsMap = splitRoomDatabase.getSplitQueryDao().getAllAsMap();
        Gi.d dVar = (Gi.d) ((C1258f0) this.f9803b).f11441b;
        if (allAsMap == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList(allAsMap.size());
            for (Map.Entry<String, SplitEntity> entry : allAsMap.entrySet()) {
                if (entry != null && entry.getValue() != null) {
                    try {
                        String strR2 = dVar.r(entry.getKey());
                        if (strR2 != null && (strR = dVar.r(entry.getValue().getBody())) != null) {
                            arrayList2.add(new Split(strR2, strR));
                        }
                    } catch (JsonSyntaxException unused) {
                        Ri.a.g("Could not parse entity to split: " + entry.getKey());
                    }
                }
            }
            arrayList = arrayList2;
        }
        io.split.android.client.storage.splits.f fVar = new io.split.android.client.storage.splits.f(splitRoomDatabase, arrayList, (Gi.d) this.e);
        fVar.run();
        long jLongValue = fVar.f17632b.longValue();
        fVar.c.longValue();
        String str = fVar.f17633d;
        String str2 = fVar.e;
        Object map = fVar.f;
        Object map2 = fVar.f17634g;
        List list = fVar.h;
        X2.e eVar = new X2.e();
        eVar.f6480a = jLongValue;
        eVar.f6481b = list;
        eVar.c = str;
        eVar.f6482d = str2;
        if (map == null) {
            map = new HashMap();
        }
        eVar.e = map;
        if (map2 == null) {
            map2 = new HashMap();
        }
        eVar.f = map2;
        return eVar;
    }

    public r(A7.h hVar, String str, String str2, Map map) {
        this.f9802a = 1;
        this.c = hVar;
        this.f9803b = str;
        this.f9804d = str2;
        this.e = map;
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f9802a = i;
        this.f9803b = obj;
        this.c = obj2;
        this.f9804d = obj3;
        this.e = obj4;
    }

    public r(String str, String str2, Boolean bool, String str3) {
        this.f9802a = 6;
        this.f9803b = str;
        this.f9804d = str2;
        this.c = bool;
        this.e = str3;
    }

    public r(SplitRoomDatabase splitRoomDatabase, Gi.d dVar) {
        this.f9802a = 22;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(iAvailableProcessors, new ThreadFactoryC1841a());
        C1258f0 c1258f0 = new C1258f0(dVar);
        C1421c c1421c = new C1421c(new Ri.a(iAvailableProcessors, 6, executorServiceNewFixedThreadPool), dVar);
        Objects.requireNonNull(splitRoomDatabase);
        this.f9804d = splitRoomDatabase;
        this.f9803b = c1258f0;
        this.c = c1421c;
        this.e = dVar;
    }

    public r(KycCmsApi mKycCmsApi, com.paymaya.data.preference.a mPreference, S5.c flagConfigurationService, Context mContext) {
        this.f9802a = 13;
        kotlin.jvm.internal.j.g(mKycCmsApi, "mKycCmsApi");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f9803b = mKycCmsApi;
        this.c = mPreference;
        this.f9804d = flagConfigurationService;
        this.e = mContext;
    }

    public r(c0.k kVar, CleverTapInstanceConfig cleverTapInstanceConfig, H h) {
        this.f9802a = 14;
        this.f9803b = kVar;
        this.c = cleverTapInstanceConfig;
        this.f9804d = h;
        this.e = C1034e.b(new W4.b(this, 15));
    }

    public r(URI uri) {
        this.f9802a = 21;
        Objects.requireNonNull(uri);
        this.c = uri;
        String rawPath = uri.getRawPath();
        if (rawPath != null) {
            this.f9803b = rawPath;
            this.e = uri.getQuery();
        } else {
            this.f9803b = null;
        }
        this.f9804d = new LinkedHashSet();
    }

    public r(SplitRoomDatabase splitRoomDatabase, Gi.d dVar, Ji.a aVar) {
        this.f9802a = 4;
        Objects.requireNonNull(dVar);
        this.e = dVar;
        Objects.requireNonNull(splitRoomDatabase);
        this.c = splitRoomDatabase;
        this.f9803b = splitRoomDatabase.ruleBasedSegmentDao();
        Objects.requireNonNull(aVar);
        this.f9804d = aVar;
    }

    public r(Mi.c cVar, Li.b bVar, Li.b bVar2, String str) {
        this.f9802a = 7;
        Objects.requireNonNull(cVar);
        this.c = cVar;
        Objects.requireNonNull(bVar);
        this.f9804d = bVar;
        Objects.requireNonNull(bVar2);
        this.e = bVar2;
        Objects.requireNonNull(str);
        this.f9803b = str;
    }

    public r(io.split.android.client.network.d dVar, C2260b c2260b, C2011b c2011b) {
        this.f9802a = 24;
        this.c = dVar;
        this.f9803b = "https://sdk.split.io/api";
        this.f9804d = c2260b;
        this.e = c2011b;
    }

    public r(U8.c cVar, io.split.android.client.service.sseclient.b bVar) {
        this.f9802a = 27;
        Objects.requireNonNull(cVar);
        this.c = cVar;
        this.f9804d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.e = bVar;
        this.f9803b = "1.3";
    }

    public r(T t5) {
        this.f9802a = 20;
        Object obj = (LinkedHashMap) t5.f11391b;
        L l6 = new L(15);
        C2011b c2011b = new C2011b(23);
        M2.b bVar = new M2.b(24);
        this.f9803b = obj == null ? new HashMap() : obj;
        this.c = l6;
        this.f9804d = c2011b;
        this.e = bVar;
    }

    public r(String str, CleverTapInstanceConfig cleverTapInstanceConfig, n0.d dVar) {
        this.f9802a = 16;
        this.e = Collections.synchronizedMap(new HashMap());
        this.f9803b = str;
        this.c = cleverTapInstanceConfig;
        this.f9804d = dVar;
        D();
    }

    public r(int i) {
        this.f9802a = i;
        switch (i) {
            case 2:
                this.f9803b = new Object();
                this.c = new Handler(Looper.getMainLooper(), new C.c(this, 0));
                break;
            case 5:
                this.e = new Object();
                B9.a aVar = new B9.a(7);
                this.c = new PriorityQueue(120, aVar);
                this.f9803b = new PriorityQueue(120, aVar);
                this.f9804d = new ArrayList();
                break;
            case 15:
                this.e = new ArrayDeque();
                this.c = new ArrayDeque();
                this.f9804d = new ArrayDeque();
                break;
            case 23:
                z2.d dVar = AbstractC1756a.f18032a;
                this.f9804d = new ConcurrentHashMap();
                this.e = new ConcurrentHashMap();
                this.f9803b = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto";
                this.c = dVar;
                break;
            default:
                this.f9803b = null;
                this.c = null;
                this.f9804d = null;
                this.e = new ArrayDeque();
                break;
        }
    }
}
