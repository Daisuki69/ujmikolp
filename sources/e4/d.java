package E4;

import A5.j;
import Bj.H;
import Bj.L;
import Bj.U;
import H4.f;
import H4.m;
import K4.B;
import K4.C;
import K4.C0271b;
import K4.g;
import Kj.e;
import M8.A0;
import Q4.C0558b;
import Q4.C0560d;
import Q4.C0562f;
import Q4.C0564h;
import Q4.C0566j;
import Q4.C0568l;
import Q4.C0570n;
import Q4.D;
import Q4.G;
import Q4.K;
import Q4.N;
import Q4.p;
import Q4.r;
import Q4.u;
import Q4.w;
import android.os.SystemClock;
import cj.C1132s;
import cj.t;
import com.maya.raven.BuildConfig;
import com.paymaya.PayMayaApplication;
import com.paymaya.domain.store.I;
import com.paymaya.domain.store.J;
import defpackage.Extract;
import dj.C1404b;
import dj.C1406d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static PayMayaApplication f1257a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f1258b = null;
    public static String c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f1259d = null;
    public static String e = "";
    public static String f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f1260g = "";

    public static void a(String str, String str2, String str3, I i) {
        Object next;
        if (!c()) {
            i.b(new C0271b("SDK not initialized properly! Aborting extraction."));
            return;
        }
        String strC = z.a(d.class).c();
        if (strC == null) {
            strC = "Raven";
        }
        A0.w(2, "execution in progress", strC);
        i.a(new C(true));
        m mVar = new m(e, f);
        mVar.c = f1259d;
        PayMayaApplication payMayaApplication = f1257a;
        kotlin.jvm.internal.j.d(payMayaApplication);
        String str4 = f1258b;
        if (str4 == null) {
            throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
        }
        String str5 = c;
        if (str5 == null) {
            throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Gj.c cVar = N4.c.f3526a;
        L lB = N4.c.b(i);
        i.a(new B(true, (HashMap) null, 6));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        String strC2 = z.a(m.class).c();
        if (strC2 == null) {
            strC2 = "collector";
        }
        A0.w(2, "collectExtracts", strC2);
        y yVar = new y();
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.j.f(string, "randomUUID().toString()");
        String upperCase = string.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
        yVar.f18195a = new Extract(BuildConfig.LIB_VERSION, 12, upperCase, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194296, null);
        M4.b bVar = new M4.b(payMayaApplication, str, str2, str3, str4, str5, mVar.c);
        List<F4.a> listG = C1132s.g((w) bVar.h.getValue(), (C0560d) bVar.j.getValue(), (D) bVar.i.getValue(), (p) bVar.f3065k.getValue(), (C0562f) bVar.m.getValue(), (C0564h) bVar.f3066l.getValue(), (u) bVar.f3067n.getValue(), (Q4.y) bVar.f3068o.getValue(), (C0558b) bVar.f3069p.getValue(), (r) bVar.f3070q.getValue(), (N) bVar.f3071r.getValue(), (G) bVar.f3072s.getValue(), (Q4.I) bVar.f3073t.getValue(), (C0566j) bVar.f3074u.getValue(), (C0570n) bVar.f3075v.getValue(), (Q4.B) bVar.f3077x.getValue(), (K) bVar.f3078y.getValue());
        int iB = cj.L.b(t.l(listG, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((F4.a) it.next()).b(), Boolean.FALSE);
        }
        HashMap map = new HashMap(linkedHashMap);
        C1406d c1406dB = cj.r.b();
        Iterator it2 = listG.iterator();
        while (it2.hasNext()) {
            c1406dB.add(new g(((F4.a) it2.next()).b()));
        }
        C1406d c1406dA = cj.r.a(c1406dB);
        Kj.d dVarA = e.a(1, false);
        Bj.r rVarB = H.b();
        for (F4.a aVar : listG) {
            Kj.d dVar = dVarA;
            m mVar2 = mVar;
            C1406d c1406d = c1406dA;
            String strB = aVar.b();
            H4.c cVar2 = new H4.c(map, strB, mVar2, dVar, i, c1406d, yVar, jElapsedRealtime2, rVarB);
            Bj.r rVar = rVarB;
            aVar.f1548b = cVar2;
            ListIterator listIterator = c1406d.listIterator(0);
            while (true) {
                C1404b c1404b = (C1404b) listIterator;
                if (c1404b.hasNext()) {
                    next = c1404b.next();
                    if (kotlin.jvm.internal.j.b(((g) next).f2622a, strB)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            g gVar = (g) next;
            if (gVar != null) {
                gVar.f2623b = SystemClock.elapsedRealtime();
            }
            aVar.a();
            rVarB = rVar;
            mVar = mVar2;
            dVarA = dVar;
            c1406dA = c1406d;
        }
        m mVar3 = mVar;
        H.w(mVar3.f2139d, null, null, new H4.a(lB, rVarB, mVar3, i, jElapsedRealtime, null), 3);
    }

    public static void b(String str, J j) {
        Object next;
        J j6 = j;
        int i = 0;
        if (!c()) {
            j6.b(new C0271b("SDK not initialized properly! Aborting extraction."));
            return;
        }
        String strC = z.a(d.class).c();
        if (strC == null) {
            strC = "Raven";
        }
        A0.w(2, "execution in progress", strC);
        j6.a(new C(true));
        m mVar = new m(e, f);
        mVar.c = f1259d;
        PayMayaApplication payMayaApplication = f1257a;
        kotlin.jvm.internal.j.d(payMayaApplication);
        String str2 = f1258b;
        if (str2 == null) {
            throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
        }
        String str3 = c;
        if (str3 == null) {
            throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bj.r rVarB = H.b();
        j6.a(new B(true, (HashMap) null, 6));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        M4.b bVar = new M4.b(payMayaApplication, str, "base-app", "threat-event", str2, str3, mVar.c);
        List listG = C1132s.g((C0568l) bVar.f3076w.getValue(), (K) bVar.f3078y.getValue());
        C1406d c1406dB = cj.r.b();
        List<F4.a> list = listG;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1406dB.add(new g(((F4.a) it.next()).b()));
        }
        C1406d c1406dA = cj.r.a(c1406dB);
        HashMap map = new HashMap();
        y yVar = new y();
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.j.f(string, "randomUUID().toString()");
        String upperCase = string.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
        yVar.f18195a = new Extract(BuildConfig.LIB_VERSION, 12, upperCase, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194296, null);
        Gj.c cVarC = H.c(U.f603a);
        Kj.d dVarA = e.a(1, false);
        for (F4.a aVar : list) {
            Bj.r rVar = rVarB;
            Kj.d dVar = dVarA;
            long j7 = jElapsedRealtime2;
            aVar.f1548b = new H4.e(cVarC, dVar, map, aVar, j6, c1406dA, yVar, listG, mVar, j7, rVar);
            ListIterator listIterator = c1406dA.listIterator(i);
            while (true) {
                C1404b c1404b = (C1404b) listIterator;
                if (!c1404b.hasNext()) {
                    next = null;
                    break;
                }
                next = c1404b.next();
                ListIterator listIterator2 = listIterator;
                if (kotlin.jvm.internal.j.b(((g) next).f2622a, aVar.b())) {
                    break;
                } else {
                    listIterator = listIterator2;
                }
            }
            g gVar = (g) next;
            Gj.c cVar = cVarC;
            if (gVar != null) {
                gVar.f2623b = SystemClock.elapsedRealtime();
            }
            aVar.a();
            cVarC = cVar;
            j6 = j;
            dVarA = dVar;
            jElapsedRealtime2 = j7;
            rVarB = rVar;
            i = 0;
        }
        Gj.c cVar2 = N4.c.f3526a;
        H.w(mVar.f2139d, null, null, new f(N4.c.b(j), rVarB, mVar, j, jElapsedRealtime, null), 3);
    }

    public static boolean c() {
        return (f1257a == null || c == null || f1258b == null || C2576A.H(f) || C2576A.H(e) || C2576A.H(f1260g)) ? false : true;
    }
}
