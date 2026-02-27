package A5;

import D8.C0193a;
import G5.q;
import Kh.C0307l;
import Kh.C0310o;
import Kh.Q;
import Xh.n;
import android.content.Context;
import android.content.SharedPreferences;
import bi.C1026d;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.L;
import cj.M;
import com.google.firebase.messaging.r;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import io.split.android.client.service.sseclient.notifications.NotificationProcessor;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import n3.C1916a;
import pg.C2038a;
import xi.C2482a;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S5.a f176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1220i f177b;
    public final InterfaceC1033d c = C1034e.b(new j(0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f178d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f179g;
    public boolean h;

    public m(S5.a aVar, C1220i c1220i) {
        this.f176a = aVar;
        this.f177b = c1220i;
    }

    public static void b(Function0 function0) {
        Uh.b bVar = X5.f.c;
        if (bVar != null) {
            new C0310o(new C0307l(bVar.c(k.f171b), 2), new J5.a(function0, 1), Eh.d.c, Eh.d.f1365b).f();
        }
    }

    public static void c(Function0 function0) {
        Uh.b bVar = X5.f.c;
        if (bVar != null) {
            Q qI = new C0307l(bVar.c(k.c), 2).i(1L, TimeUnit.SECONDS);
            J5.c cVar = new J5.c(function0, 1);
            C1916a c1916a = Eh.d.c;
            mg.c cVar2 = Eh.d.f1365b;
            new C0310o(new C0310o(qI, cVar, c1916a, cVar2), c1916a, new V2.c(function0, 1), cVar2).f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bj.d, java.lang.Object] */
    public final void a(boolean z4) {
        n nVar;
        V5.c cVar = this.f176a.f5670a;
        W5.b bVar = cVar.f;
        if (bVar != null) {
            Xh.h hVar = bVar.c;
            if (hVar != null && hVar.a()) {
                W5.b bVar2 = cVar.f;
                if (bVar2 != null) {
                    yk.a.a();
                    Xh.h hVar2 = bVar2.c;
                    if (hVar2 != null) {
                        hVar2.i = true;
                        Ei.c cVar2 = (Ei.c) hVar2.f6645b.get();
                        if (cVar2 != null) {
                            Yh.a aVar = hVar2.c;
                            cVar2.f1374a.remove(aVar);
                            Ei.a aVar2 = cVar2.i;
                            aVar2.getClass();
                            ((Ai.c) aVar2.e).d(aVar.f6788a);
                            ((Bi.e) aVar2.f).a(aVar);
                            ((C1026d) aVar2.i).c.remove(aVar);
                            Set set = (Set) ((r) aVar2.j).f9804d;
                            String str = aVar.f6788a;
                            set.remove(str);
                            C2038a c2038a = ((zi.c) aVar2.f1370g).f21454g;
                            synchronized (c2038a) {
                                try {
                                    C2482a c2482a = (C2482a) ((ConcurrentHashMap) c2038a.c).get(str);
                                    if (c2482a != null) {
                                        c2482a.s();
                                    }
                                    ((ConcurrentHashMap) c2038a.c).remove(str);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            ((NotificationProcessor) aVar2.h).unregisterMembershipsProcessor(str);
                            if (new HashSet(cVar2.f1374a.values()).isEmpty() && (nVar = (n) hVar2.f6644a.get()) != null) {
                                if (nVar instanceof n) {
                                    try {
                                        nVar.f6662d.set(true);
                                    } catch (ClassCastException unused) {
                                    }
                                }
                                nVar.a();
                            }
                        }
                    }
                    bVar2.c = null;
                    A3.i iVar = bVar2.f6309a;
                    C0193a c0193a = iVar != null ? ((n) iVar.c).f6660a : null;
                    if (c0193a != null) {
                        c0193a.f1033b = true;
                    }
                }
                cVar.f = null;
            }
        }
        W5.c cVarB = cVar.b();
        W5.e eVar = W5.e.f6314b;
        cVarB.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) cVarB.f6312b.getValue();
        kotlin.jvm.internal.j.f(sharedPreferences, "<get-sharedPreferences>(...)");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        kotlin.jvm.internal.j.f(editor, "editor");
        editor.remove("user");
        editor.apply();
        Oh.c cVar3 = X5.f.f6540b;
        if (cVar3 != null) {
            Ph.d.a(cVar3);
        }
        X5.f.f6540b = null;
        Uh.b bVar3 = X5.f.f6541d;
        if (bVar3 != null) {
            bVar3.onNext(U5.a.f5943b);
        }
        this.f179g = false;
        if (z4) {
            return;
        }
        this.e = false;
    }

    public final C5.a d() {
        return (C5.a) this.c.getValue();
    }

    public final boolean e() {
        W5.b bVar;
        Xh.h hVar;
        if (this.e) {
            V5.c cVar = this.f176a.f5670a;
            A3.i iVar = cVar.f6080d;
            if ((iVar != null && iVar.f41b) && (bVar = cVar.e) != null && (hVar = bVar.c) != null && hVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final void f(EnumC1217f enumC1217f, Map map) {
        C1219h c1219hD = C1219h.d(EnumC1215d.SPLIT);
        c1219hD.t(enumC1217f);
        c1219hD.n(14);
        for (Map.Entry entry : map.entrySet()) {
            c1219hD.g((String) entry.getKey(), (String) entry.getValue());
        }
        this.f177b.b(c1219hD);
    }

    public final void g(String osVersion, String str) {
        kotlin.jvm.internal.j.g(osVersion, "osVersion");
        this.f176a.f5670a.i.putAll(M.h(new Pair("os_name", "android"), new Pair("os_version", osVersion), new Pair("app_id", "com.paymaya"), new Pair("version_number", str), new Pair("build_number", 13435)));
    }

    public final void h() {
        int i = 1;
        if (this.e) {
            return;
        }
        d().f739a = true;
        d().e("split_sdk_ready_cache");
        d().e("split_sdk_ready");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        Map mapC = L.c(new Pair("traffic_type", "anonymous"));
        h hVar = new h(this, mapC, 0);
        h hVar2 = new h(this, mapC, 1);
        i iVar = new i(this, 0);
        S5.a aVar = this.f176a;
        X5.f.c = X5.f.y(hVar, hVar2, iVar);
        V5.c cVar = aVar.f5670a;
        A3.i iVar2 = cVar.f6080d;
        if (iVar2 != null && iVar2.f41b && iVar2 != null) {
            ((n) iVar2.c).a();
            iVar2.f41b = false;
            yk.a.a();
        }
        Context context = cVar.f6079b;
        String str = cVar.f6078a;
        A3.i iVar3 = new A3.i(context, cVar.c, str);
        cVar.f6080d = iVar3;
        Ih.n nVarZ = X5.f.z(iVar3, str, W5.e.f6314b, new V5.a(cVar, 2), new X5.b(cVar, i));
        X5.d dVar = X5.d.f6537a;
        Q6.r rVar = new Q6.r(X5.f.c, 6);
        C1916a c1916a = Eh.d.c;
        X5.f.f6539a = (Oh.c) new Ih.i(new Ih.i(nVarZ, rVar, c1916a, Eh.d.f1365b), c1916a, c1916a, new q(dVar)).c();
        this.e = true;
    }

    public final void i(String str) {
        if (this.f179g) {
            return;
        }
        d().f739a = true;
        d().e("split_sdk_ready_cache");
        d().e("split_sdk_ready");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        Map mapC = L.c(new Pair("traffic_type", "user"));
        h hVar = new h(this, mapC, 2);
        h hVar2 = new h(this, mapC, 3);
        i iVar = new i(this, 1);
        S5.a aVar = this.f176a;
        X5.f.f6541d = X5.f.y(hVar, hVar2, iVar);
        V5.c cVar = aVar.f5670a;
        Ih.n nVarZ = X5.f.z(cVar.f6080d, str, W5.e.c, new V5.a(cVar, 1), new X5.b(cVar, 0));
        X5.e eVar = X5.e.f6538a;
        Q6.r rVar = new Q6.r(X5.f.f6541d, 6);
        C1916a c1916a = Eh.d.c;
        X5.f.f6540b = (Oh.c) new Ih.i(new Ih.i(nVarZ, rVar, c1916a, Eh.d.f1365b), c1916a, c1916a, new q(eVar)).c();
        this.f179g = true;
    }
}
