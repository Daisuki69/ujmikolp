package X;

import Bj.H;
import Bj.U;
import N9.f;
import W.e;
import android.content.SharedPreferences;
import cj.C1110A;
import cj.C1114E;
import cj.L;
import cj.M;
import cj.S;
import cj.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import k0.C1689a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f6460g;
    public static final HashMap h;
    public static final Object i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lh.c f6461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f6462b;
    public final Y.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y.a f6463d;
    public final Y.e e;

    static {
        a.C0097a c0097a = kotlin.time.a.f18208b;
        f = kotlin.time.a.d(kotlin.time.b.e(14, Aj.b.f332g));
        f6460g = new LinkedHashSet();
        h = new HashMap();
        i = new Object();
    }

    public d(Lh.c cVar, e eVar, Y.c cVar2, Y.a aVar, Y.e eVar2) {
        this.f6461a = cVar;
        this.f6462b = eVar;
        this.c = cVar2;
        this.f6463d = aVar;
        this.e = eVar2;
    }

    public static void c(Pair pair, a aVar) {
        LinkedHashSet linkedHashSet = f6460g;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        synchronized (i) {
            h.put(pair.f18160a, aVar);
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            Unit unit = Unit.f18162a;
        }
    }

    public final void a(ArrayList arrayList) {
        Set<String> setKeySet;
        Set<String> setKeySet2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1689a c1689a = (C1689a) this.e.f6708b;
        if (jCurrentTimeMillis - c1689a.a("last_assets_cleanup") < f) {
            return;
        }
        C1689a c1689a2 = this.f6463d.f6701a;
        SharedPreferences sharedPreferencesD = c1689a2.d();
        Map<String, ?> mapE = sharedPreferencesD == null ? M.e() : sharedPreferencesD.getAll();
        if (mapE == null || (setKeySet = mapE.keySet()) == null) {
            setKeySet = C1114E.f9379a;
        }
        C1689a c1689a3 = this.c.f6703a;
        SharedPreferences sharedPreferencesD2 = c1689a3.d();
        Map<String, ?> mapE2 = sharedPreferencesD2 == null ? M.e() : sharedPreferencesD2.getAll();
        if (mapE2 == null || (setKeySet2 = mapE2.keySet()) == null) {
            setKeySet2 = C1114E.f9379a;
        }
        LinkedHashSet linkedHashSetD = S.d(setKeySet, setKeySet2);
        int iB = L.b(t.l(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, (String) obj);
        }
        Set setY = C1110A.Y(linkedHashSetD);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setY) {
            String key = (String) obj2;
            boolean zContainsKey = linkedHashMap.containsKey(key);
            j.g(key, "key");
            long j = jCurrentTimeMillis;
            boolean z4 = j > Math.max(c1689a2.a(key), c1689a3.a(key));
            if (!zContainsKey && z4) {
                arrayList2.add(obj2);
            }
            jCurrentTimeMillis = j;
        }
        long j6 = jCurrentTimeMillis;
        b bVar = new b(this, 0);
        Lh.c cVar = this.f6461a;
        Ij.e eVar = U.f603a;
        ((ArrayList) cVar.c).add(H.w(H.c(Ij.d.f2362a), null, null, new U.b(arrayList2, cVar, bVar, null), 3));
        c1689a.e(j6, "last_assets_cleanup");
    }

    public final void b(ArrayList arrayList, Function1 function1, Function1 function12, Function1 function13) {
        c cVar = new c(this, function12, 0);
        c cVar2 = new c(this, function13, 1);
        b bVar = new b(this, 1);
        e eVar = this.f6462b;
        eVar.f6164d.add(H.w(eVar.f, eVar.e, null, new W.c(arrayList, eVar, function1, bVar, new f(eVar, 15), cVar, cVar2, null), 2));
    }
}
