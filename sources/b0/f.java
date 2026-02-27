package b0;

import D.A;
import D.B;
import D.C0176i;
import D.C0178k;
import D.CallableC0168a;
import D.H;
import D.Q;
import D.S;
import D.Z;
import D.a0;
import D.r;
import P5.N;
import Z.n;
import android.content.Context;
import b1.t;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import n2.C1915b;
import o0.C1954a;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8271a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0176i f8272b;
    public final C0176i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0178k f8273d;
    public final r e;
    public final CleverTapInstanceConfig f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f8274g;
    public final A h;
    public final B i;
    public final Ci.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H f8275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Q f8276l;
    public final g0.g m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f8277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0.c f8278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f8279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1915b f8280q;

    public f(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, H h, o0.c cVar, C0176i c0176i, C0176i c0176i2, B b8, A a8, a0 a0Var, Q q9, r rVar, Ci.b bVar, C0178k c0178k, g gVar, C1915b c1915b) {
        this.f = cleverTapInstanceConfig;
        this.f8274g = context;
        this.f8275k = h;
        this.f8278o = cVar;
        this.c = c0176i;
        this.f8272b = c0176i2;
        this.i = b8;
        this.m = (g0.g) a8.m;
        this.f8277n = a0Var;
        this.f8276l = q9;
        this.e = rVar;
        this.j = bVar;
        this.h = a8;
        this.f8273d = c0178k;
        this.f8279p = gVar;
        this.f8280q = c1915b;
    }

    public static void a(f fVar) {
        Z z4 = (Z) fVar.h.f797n;
        if (z4 != null) {
            S.c("variables", "Clear user content in CTVariables");
            z4.f889a = false;
            N n7 = (N) z4.f;
            synchronized (n7) {
                try {
                    N.d("Clear user content in VarCache");
                    HashMap map = new HashMap((ConcurrentHashMap) n7.f5026b);
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        if (((ConcurrentHashMap) n7.f5026b).get((String) it.next()) != null) {
                            throw new ClassCastException();
                        }
                    }
                    n7.a(new HashMap(), map);
                    l0.b.a((CleverTapInstanceConfig) n7.e).b().k("VarCache#saveDiffsAsync", new CallableC0168a(n7, 17));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void b(f fVar) {
        A a8;
        synchronized (fVar.f8273d.f926b) {
            a8 = fVar.h;
            a8.e = null;
        }
        a8.g();
    }

    public static void c(f fVar) {
        L.b bVar = (L.b) fVar.h.f793d;
        if (bVar != null && bVar.c) {
            bVar.f2793b = fVar.f8275k.f();
            bVar.c();
            l0.c cVarA = l0.b.a(bVar.f2792a);
            cVarA.d(cVarA.f18219b, cVarA.c, "Main").k("fetchFeatureFlags", new L.a(bVar, 0));
            return;
        }
        CleverTapInstanceConfig cleverTapInstanceConfig = fVar.f;
        S sC = cleverTapInstanceConfig.c();
        String str = cleverTapInstanceConfig.f9439a;
        sC.getClass();
        S.s(str, "DisplayUnit : Can't reset Display Units, CTFeatureFlagsController is null");
    }

    public static void d(f fVar) {
        CleverTapInstanceConfig cleverTapInstanceConfig = fVar.f;
        boolean z4 = cleverTapInstanceConfig.h;
        String str = cleverTapInstanceConfig.f9439a;
        if (z4) {
            cleverTapInstanceConfig.c().getClass();
            S.g(str, "Product Config is not enabled for this instance");
            return;
        }
        A a8 = fVar.h;
        t tVar = (t) a8.f794g;
        if (tVar != null) {
            com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) tVar.h;
            rVar.D();
            n0.d dVar = (n0.d) tVar.f8335d;
            if (dVar == null) {
                throw new IllegalArgumentException("FileUtils can't be null");
            }
            l0.b.a((CleverTapInstanceConfig) rVar.c).a().k("ProductConfigSettings#eraseStoredSettingsFile", new n(3, rVar, dVar));
        }
        String strF = fVar.f8275k.f();
        CleverTapInstanceConfig cleverTapInstanceConfig2 = fVar.f;
        n0.d dVar2 = new n0.d(fVar.f8274g, cleverTapInstanceConfig2);
        com.google.firebase.messaging.r rVar2 = new com.google.firebase.messaging.r(strF, cleverTapInstanceConfig2, dVar2);
        r rVar3 = fVar.e;
        t tVar2 = new t();
        tVar2.f8333a = Collections.synchronizedMap(new HashMap());
        tVar2.f8334b = Collections.synchronizedMap(new HashMap());
        tVar2.c = new AtomicBoolean(false);
        tVar2.f = new AtomicBoolean(false);
        tVar2.i = Collections.synchronizedMap(new HashMap());
        tVar2.e = cleverTapInstanceConfig2;
        tVar2.f8336g = rVar3;
        tVar2.h = rVar2;
        tVar2.f8335d = dVar2;
        tVar2.i();
        a8.f794g = tVar2;
        cleverTapInstanceConfig.c().getClass();
        S.s(str, "Product Config reset");
    }

    public final void e() {
        List<InterfaceC0845a> list = this.e.f938k;
        synchronized (list) {
            try {
                for (InterfaceC0845a interfaceC0845a : list) {
                    if (interfaceC0845a != null) {
                        interfaceC0845a.a(this.f8275k.f(), this.f.f9439a);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.f8275k.f846k;
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        arrayList.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f8278o.b((C1954a) it.next());
        }
    }
}
