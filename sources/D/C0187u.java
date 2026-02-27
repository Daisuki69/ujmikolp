package D;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import bj.InterfaceC1033d;
import c0.C1053a;
import cj.C1132s;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.paymaya.domain.store.A0;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import e2.C1421c;
import g0.C1494c;
import g0.C1495d;
import j0.C1652a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import k2.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import n2.C1915b;
import n3.C1916a;
import o0.C1954a;
import org.json.JSONObject;
import p0.C2004c;
import w.C2361c;

/* JADX INFO: renamed from: D.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0187u implements Z.h {
    public static int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static CleverTapInstanceConfig f946d;
    public static HashMap e;
    public static final HashMap f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static n0.c f947g = n0.c.f18542a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f949b;

    public C0187u(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) throws Throwable {
        F.k kVar;
        final int i;
        int i4 = 4;
        int i6 = 3;
        int i10 = 2;
        if (context == null || cleverTapInstanceConfig == null) {
            throw new RuntimeException(numX49.tnTj78("Pe2S"));
        }
        c0 c0VarB = c0.f900a.b();
        String str = cleverTapInstanceConfig.f9439a;
        kotlin.jvm.internal.j.d(str);
        Y.f fVar = new Y.f(new Y.e(c0.c(context, c0.b(3, 6, null)), str), new Y.c(c0.c(context, c0.b(4, 2, str))), new Y.a(c0.c(context, c0.b(5, 2, str))));
        B b8 = new B();
        o0.d dVar = new o0.d();
        o0.c cVar = new o0.c();
        cVar.f18754a = new ArrayList();
        C0178k c0178k = new C0178k();
        We.y yVar = new We.y(Looper.getMainLooper(), i10);
        CleverTapInstanceConfig cleverTapInstanceConfig2 = new CleverTapInstanceConfig(cleverTapInstanceConfig);
        c0.k kVar2 = new c0.k(context, cleverTapInstanceConfig2);
        int i11 = 7;
        Qd.a aVar = new Qd.a(cleverTapInstanceConfig2, 25);
        l0.c cVarA = l0.b.a(cleverTapInstanceConfig2);
        cVarA.a().k(numX49.tnTj78("Peby"), new CallableC0170c(i4, context, cleverTapInstanceConfig2));
        Ci.b bVar = new Ci.b(cleverTapInstanceConfig2, c0178k, aVar, new C0190x(0, kVar2, c0.k.class, numX49.tnTj78("Peb7"), numX49.tnTj78("Pebv"), 0, 0), new C0190x(0, kVar2, c0.k.class, numX49.tnTj78("PebY"), numX49.tnTj78("PebA"), 0, 1));
        String str2 = cleverTapInstanceConfig2.f9439a;
        String strTnTj78 = numX49.tnTj78("PebT");
        kotlin.jvm.internal.j.f(str2, strTnTj78);
        F.i iVar = new F.i(context, str2);
        mg.c cVar2 = new mg.c(i6);
        String str3 = cleverTapInstanceConfig2.f9439a;
        kotlin.jvm.internal.j.f(str3, strTnTj78);
        Cg.c cVar3 = new Cg.c(str3, cVar2);
        C1916a c1916a = F.k.f1507b;
        int i12 = cleverTapInstanceConfig2.f9454w;
        c1916a.getClass();
        F.k[] kVarArrValues = F.k.values();
        int length = kVarArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                kVar = null;
                break;
            }
            int i14 = i13;
            kVar = kVarArrValues[i14];
            int i15 = length;
            if (kVar.f1509a == i12) {
                break;
            }
            i13 = i14 + 1;
            length = i15;
        }
        kVar = kVar == null ? F.k.c : kVar;
        String str4 = cleverTapInstanceConfig2.f9439a;
        kotlin.jvm.internal.j.f(str4, strTnTj78);
        Cg.c cVar4 = new Cg.c(kVar, str4, iVar, cVar3);
        cVarA.b().k(numX49.tnTj78("PebR"), new CallableC0188v(context, cleverTapInstanceConfig2, bVar, cVar4, iVar, 0));
        H h = new H(context, cleverTapInstanceConfig2, b8);
        CleverTapInstanceConfig cleverTapInstanceConfig3 = h.f844d;
        S sC = cleverTapInstanceConfig3.c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cleverTapInstanceConfig3.f9439a);
        String strTnTj782 = numX49.tnTj78("Pebp");
        sb2.append(strTnTj782);
        String string = sb2.toString();
        sC.getClass();
        S.s(string, numX49.tnTj78("Peb0"));
        l0.b.a(cleverTapInstanceConfig3).a().k(numX49.tnTj78("Pebg"), new E(h, 0));
        C1915b c1915bA = l0.b.a(cleverTapInstanceConfig3).a();
        c1915bA.e(new A7.c(h, 10));
        c1915bA.k(numX49.tnTj78("Pebf"), new E(h, 1));
        Q q9 = new Q(context, cleverTapInstanceConfig2, cVar4, h, bVar);
        C2361c c2361c = new C2361c(dVar, cVar);
        Ci.b bVar2 = new Ci.b(cleverTapInstanceConfig2, b8, q9, c2361c, kVar2);
        C0181n.f929a.a(context, cleverTapInstanceConfig2);
        r rVar = new r(cleverTapInstanceConfig2, h);
        a0 a0Var = new a0(cleverTapInstanceConfig2, b8, dVar, q9);
        A a8 = new A(context, cleverTapInstanceConfig2, c0178k, rVar, h, bVar);
        Q6.s sVar = new Q6.s(q9, 1);
        String str5 = cleverTapInstanceConfig2.f9439a;
        kotlin.jvm.internal.j.f(str5, strTnTj78);
        Cg.c cVar5 = new Cg.c(context, str5, h);
        N.e eVar = new N.e(fVar);
        Lh.c cVar6 = new Lh.c(20, eVar, cVar5, false);
        ArrayList arrayList = rVar.e;
        O.b bVarJ = null;
        final Ci.b bVar3 = new Ci.b(context, cleverTapInstanceConfig2, new Z(cleverTapInstanceConfig2, arrayList, null, 28));
        final int i16 = 0;
        O.b bVarJ2 = v0.j(new Function1() { // from class: P.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                O.a aVar2 = (O.a) obj;
                switch (i16) {
                    case 0:
                        Ci.b bVar4 = bVar3;
                        j.g(aVar2, numX49.tnTj78("bPPZ"));
                        aVar2.c = true;
                        aVar2.b(numX49.tnTj78("bPPk"));
                        aVar2.a(numX49.tnTj78("bPPB"), O.j.f4519b, numX49.tnTj78("bPPu"));
                        aVar2.h = new b(bVar4, 0);
                        break;
                    case 1:
                        Ci.b bVar5 = bVar3;
                        j.g(aVar2, numX49.tnTj78("bPPL"));
                        aVar2.c = true;
                        aVar2.b(numX49.tnTj78("bPPr"));
                        aVar2.h = new b(bVar5, 1);
                        break;
                    default:
                        Ci.b bVar6 = bVar3;
                        j.g(aVar2, numX49.tnTj78("bPPP"));
                        aVar2.c = true;
                        aVar2.b(numX49.tnTj78("bPPb"));
                        aVar2.a(numX49.tnTj78("bPP2"), O.j.c, Boolean.FALSE);
                        aVar2.h = new b(bVar6, 2);
                        break;
                }
                return Unit.f18162a;
            }
        });
        if (((Class) ((InterfaceC1033d) ((A0) bVar3.e).f11334b).getValue()) != null) {
            i = 1;
            bVarJ = v0.j(new Function1() { // from class: P.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    O.a aVar2 = (O.a) obj;
                    switch (i) {
                        case 0:
                            Ci.b bVar4 = bVar3;
                            j.g(aVar2, numX49.tnTj78("bPPZ"));
                            aVar2.c = true;
                            aVar2.b(numX49.tnTj78("bPPk"));
                            aVar2.a(numX49.tnTj78("bPPB"), O.j.f4519b, numX49.tnTj78("bPPu"));
                            aVar2.h = new b(bVar4, 0);
                            break;
                        case 1:
                            Ci.b bVar5 = bVar3;
                            j.g(aVar2, numX49.tnTj78("bPPL"));
                            aVar2.c = true;
                            aVar2.b(numX49.tnTj78("bPPr"));
                            aVar2.h = new b(bVar5, 1);
                            break;
                        default:
                            Ci.b bVar6 = bVar3;
                            j.g(aVar2, numX49.tnTj78("bPPP"));
                            aVar2.c = true;
                            aVar2.b(numX49.tnTj78("bPPb"));
                            aVar2.a(numX49.tnTj78("bPP2"), O.j.c, Boolean.FALSE);
                            aVar2.h = new b(bVar6, 2);
                            break;
                    }
                    return Unit.f18162a;
                }
            });
        } else {
            i = 1;
        }
        int i17 = i;
        final int i18 = 2;
        O.b bVarJ3 = v0.j(new Function1() { // from class: P.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                O.a aVar2 = (O.a) obj;
                switch (i18) {
                    case 0:
                        Ci.b bVar4 = bVar3;
                        j.g(aVar2, numX49.tnTj78("bPPZ"));
                        aVar2.c = true;
                        aVar2.b(numX49.tnTj78("bPPk"));
                        aVar2.a(numX49.tnTj78("bPPB"), O.j.f4519b, numX49.tnTj78("bPPu"));
                        aVar2.h = new b(bVar4, 0);
                        break;
                    case 1:
                        Ci.b bVar5 = bVar3;
                        j.g(aVar2, numX49.tnTj78("bPPL"));
                        aVar2.c = true;
                        aVar2.b(numX49.tnTj78("bPPr"));
                        aVar2.h = new b(bVar5, 1);
                        break;
                    default:
                        Ci.b bVar6 = bVar3;
                        j.g(aVar2, numX49.tnTj78("bPPP"));
                        aVar2.c = true;
                        aVar2.b(numX49.tnTj78("bPPb"));
                        aVar2.a(numX49.tnTj78("bPP2"), O.j.c, Boolean.FALSE);
                        aVar2.h = new b(bVar6, 2);
                        break;
                }
                return Unit.f18162a;
            }
        });
        O.b[] bVarArr = new O.b[3];
        bVarArr[0] = bVarJ2;
        bVarArr[i17] = bVarJ;
        bVarArr[2] = bVarJ3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i19 = 0;
        for (int i20 = 3; i19 < i20; i20 = 3) {
            O.b bVar4 = bVarArr[i19];
            if (bVar4 != null) {
                linkedHashSet.add(bVar4);
            }
            i19++;
        }
        ArrayList arrayList2 = O.k.f4522d;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = O.k.f4522d.iterator();
        if (it.hasNext()) {
            throw AbstractC1331a.n(it);
        }
        linkedHashSet2.addAll(linkedHashSet);
        S sC2 = cleverTapInstanceConfig2.c();
        String strTnTj783 = numX49.tnTj78("Peb1");
        kotlin.jvm.internal.j.f(sC2, strTnTj783);
        O.k kVar3 = new O.k(linkedHashSet2, sC2);
        R.c cVar7 = new R.c(sVar, cVar5, cVar6, fVar, kVar3);
        cVarA.a().k(numX49.tnTj78("Pebn"), new CallableC0189w(h, fVar, c0VarB, context, cVar4, cleverTapInstanceConfig2, cVar7, rVar));
        cVarA.a().k(numX49.tnTj78("Pebx"), new CallableC0189w(h, a8, cleverTapInstanceConfig2, context, fVar, eVar, cVarA));
        S sC3 = cleverTapInstanceConfig2.c();
        kotlin.jvm.internal.j.f(sC3, strTnTj783);
        Ag.l lVar = new Ag.l(18, context, sC3);
        P5.N n7 = new P5.N(cleverTapInstanceConfig2, context, new X.d(new Lh.c(lVar), new W.e(lVar, sC3), fVar.f6711d, fVar.e, fVar.c));
        Z z4 = new Z();
        z4.f889a = false;
        z4.c = new ArrayList();
        z4.f890b = new ArrayList();
        z4.f891d = new ArrayList();
        z4.e = new ArrayList();
        z4.f = n7;
        androidx.window.layout.adapter.extensions.a aVar2 = new androidx.window.layout.adapter.extensions.a(z4, 22);
        synchronized (n7) {
            try {
                n7.f5028g = aVar2;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        a8.f797n = z4;
        C2004c c2004c = new C2004c();
        cVarA.a().k(numX49.tnTj78("Pebs"), new CallableC0168a(z4, 2));
        j0.g gVar = new j0.g(cleverTapInstanceConfig2, a8, false, fVar, cVar5, kVar3, b8);
        com.google.firebase.messaging.r rVar2 = new com.google.firebase.messaging.r(kVar2, cleverTapInstanceConfig2, h);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar3.f769d;
        F.e eVar2 = F.e.f1496b;
        Object cVar8 = linkedHashMap.get(eVar2);
        if (cVar8 == null) {
            cVar8 = new F.c((mg.c) cVar3.c);
            linkedHashMap.put(eVar2, cVar8);
        }
        c0.i iVar2 = new c0.i();
        String str6 = cleverTapInstanceConfig2.f9439a;
        kotlin.jvm.internal.j.f(str6, strTnTj78);
        S sC4 = cleverTapInstanceConfig2.c();
        kotlin.jvm.internal.j.f(sC4, strTnTj783);
        Y.e eVar3 = new Y.e(str6, sC4, h);
        C0190x c0190x = new C0190x(0, kVar2, c0.k.class, numX49.tnTj78("PebJ"), numX49.tnTj78("Peb5"), 0, 2);
        C0190x c0190x2 = new C0190x(0, kVar2, c0.k.class, numX49.tnTj78("Pebq"), numX49.tnTj78("PebI"), 0, 3);
        S sC5 = cleverTapInstanceConfig2.c();
        kotlin.jvm.internal.j.f(sC5, strTnTj783);
        Ei.a aVar3 = new Ei.a(context, cleverTapInstanceConfig2, b8, a8, h, eVar3, aVar, bVar, cVar, c0190x, c0190x2, sC5);
        C1652a c1652a = new C1652a(cleverTapInstanceConfig2, dVar, a8, eVar3);
        C1915b c1915b = new C1915b(cleverTapInstanceConfig2, b8, aVar3, rVar2);
        int i21 = 1;
        C1421c c1421c = new C1421c(context, C1132s.g(gVar, new j0.i(cleverTapInstanceConfig2, h, aVar), c1652a, new j0.c(cleverTapInstanceConfig2), new j0.h(cleverTapInstanceConfig2, c0178k, rVar, a8), new j0.j(context, cleverTapInstanceConfig2, bVar, rVar, a8), new j0.f(rVar, a8, cleverTapInstanceConfig2), new j0.e(rVar, a8, cleverTapInstanceConfig2), new j0.d(cleverTapInstanceConfig2, a8), new j0.i(cleverTapInstanceConfig2, b8, a8), new j0.d(cleverTapInstanceConfig2, rVar), new j0.d(cleverTapInstanceConfig2, c1915b)));
        c1915b.e = c1421c;
        c0.j jVar = new c0.j(context, cleverTapInstanceConfig2, h, b8, a8, bVar, rVar, rVar2, iVar2, c1652a, kVar2, aVar3, c1421c);
        b0.g gVar2 = new b0.g(context, cleverTapInstanceConfig2, cVar4);
        C0176i c0176i = new C0176i(bVar, context, cleverTapInstanceConfig2, bVar2, a0Var, rVar, yVar, h, cVar, jVar, b8, c0178k, q9, a8, gVar2);
        j0.g gVar3 = new j0.g(cleverTapInstanceConfig2, a8, true, fVar, cVar5, kVar3, b8);
        n0.c cVar9 = n0.c.f18542a;
        C0176i c0176i2 = new C0176i(context, cleverTapInstanceConfig2, c0176i, dVar, cVar, b8, h, rVar, a8, c0178k, gVar3, cVarA);
        N.m mVar = new N.m(fVar, kVar3, cVarA, new Ag.l(i21, context, cleverTapInstanceConfig2));
        jVar.f9209r.add(cVar7);
        T tB = T.b(context);
        kotlin.jvm.internal.j.f(tB, numX49.tnTj78("Pebz"));
        String str7 = cleverTapInstanceConfig2.f9439a;
        kotlin.jvm.internal.j.f(str7, strTnTj78);
        N.k kVar4 = new N.k(context, cleverTapInstanceConfig2, cVarA, a8, rVar, c0176i2, b8, tB, h, new Lh.c(i11, fVar, str7, false), cVar7, kVar3, bVar3, mVar);
        a8.f796l = kVar4;
        C1053a c1053a = new C1053a(1);
        C1053a c1053a2 = new C1053a(0);
        c1053a2.f9182b.add(kVar4.m);
        ArrayList arrayList3 = c1053a.f9182b;
        arrayList3.add(c1053a2);
        arrayList3.add(new c0.h());
        rVar.f939l = c1053a;
        cVarA.a().k(numX49.tnTj78("Pebl"), new CallableC0186t(context, a8, cleverTapInstanceConfig2, h, rVar, c0176i2));
        C0180m c0180m = new C0180m();
        cleverTapInstanceConfig2.c();
        g0.g gVar4 = new g0.g(context, cleverTapInstanceConfig2, bVar, cVar, c0176i2, new i0.a(context, cleverTapInstanceConfig2));
        String strTnTj784 = numX49.tnTj78("PebW");
        CleverTapInstanceConfig cleverTapInstanceConfig4 = gVar4.f;
        for (g0.h hVar : cleverTapInstanceConfig4.f9442g) {
            String str8 = hVar.f16784b;
            try {
                Class.forName(str8);
                gVar4.f16777a.add(hVar);
                cleverTapInstanceConfig4.e(strTnTj784, "SDK Class Available :" + str8);
            } catch (Exception e7) {
                StringBuilder sbW = We.s.w(numX49.tnTj78("Pe29"), str8, numX49.tnTj78("Pe2P"));
                sbW.append(e7.getClass().getName());
                cleverTapInstanceConfig4.e(strTnTj784, sbW.toString());
            }
        }
        l0.b.a(cleverTapInstanceConfig4).c(numX49.tnTj78("Pe2b")).k(numX49.tnTj78("Pe22"), new CallableC0168a(gVar4, 15));
        a8.m = gVar4;
        C c10 = new C(c0180m, cleverTapInstanceConfig2, b8, bVar, h, bVar2, q9, new C0171d(context, cleverTapInstanceConfig2, c0176i2, b8, a0Var, gVar4, rVar, kVar4, c0176i, cVarA), c0176i2, c0176i, c0178k, rVar, a8, kVar4, cVar7, eVar, new b0.f(context, cleverTapInstanceConfig2, h, cVar, c0176i, c0176i2, b8, a8, a0Var, q9, rVar, bVar, c0178k, gVar2, c1915b), a0Var, cVar, yVar, jVar, gVar4, n7, c2004c, cVar4, fVar, kVar3, c2361c, z4, cVarA);
        this.f948a = context;
        this.f949b = c10;
        f947g = cVar9;
        S sE = e();
        String strConcat = str.concat(strTnTj782);
        sE.getClass();
        S.s(strConcat, numX49.tnTj78("Pe2L"));
        cVarA.b().k(numX49.tnTj78("Pe2r"), new CallableC0185s(this, i21));
        f947g.getClass();
        if (((int) (System.currentTimeMillis() / ((long) 1000))) - B.f801y > 5) {
            cleverTapInstanceConfig2.f9443k = true;
        }
        cVarA.b().k("setStatesAsync", new CallableC0185s(this, 2));
        cVarA.b().k(numX49.tnTj78("Pe2Z"), new CallableC0185s(this, 3));
        cVarA.b().k(numX49.tnTj78("Pe2k"), new CallableC0185s(this, 4));
        S.i(numX49.tnTj78("Pe2B") + str + numX49.tnTj78("Pe2u") + cleverTapInstanceConfig.c + numX49.tnTj78("Pe2V") + cleverTapInstanceConfig.f9440b);
    }

    public static C0187u a(Context context, String str) {
        CleverTapInstanceConfig cleverTapInstanceConfig;
        String strTnTj78 = numX49.tnTj78("Pe2j");
        String strTnTj782 = numX49.tnTj78("Pe2d");
        String strTnTj783 = numX49.tnTj78("Pe2i");
        try {
            if (str == null) {
                try {
                    return f(context);
                } catch (Throwable th2) {
                    S.o(strTnTj783, th2.getCause());
                }
            } else {
                String strG = b0.g(context, strTnTj782.concat(str), "");
                if (!strG.isEmpty()) {
                    try {
                        cleverTapInstanceConfig = new CleverTapInstanceConfig(strG);
                    } catch (Throwable unused) {
                        cleverTapInstanceConfig = null;
                    }
                    S.l(strTnTj78.concat(strG));
                    if (cleverTapInstanceConfig != null) {
                        return j(context, cleverTapInstanceConfig);
                    }
                    return null;
                }
                try {
                    C0187u c0187uF = f(context);
                    if (c0187uF != null) {
                        if (((CleverTapInstanceConfig) c0187uF.f949b.f814a).f9439a.equals(str)) {
                            return c0187uF;
                        }
                    }
                } catch (Throwable th3) {
                    S.o(strTnTj783, th3.getCause());
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    public static C0187u b(Context context, String str) {
        HashMap map = e;
        if (map == null) {
            return a(context, str);
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            C0187u c0187u = (C0187u) e.get((String) it.next());
            if (c0187u != null && ((str == null && ((CleverTapInstanceConfig) c0187u.f949b.f814a).f9447p) || c0187u.c().equals(str))) {
                return c0187u;
            }
        }
        return null;
    }

    public static C0187u f(Context context) {
        CleverTapInstanceConfig cleverTapInstanceConfig;
        CleverTapInstanceConfig cleverTapInstanceConfig2 = f946d;
        if (cleverTapInstanceConfig2 != null) {
            return j(context, cleverTapInstanceConfig2);
        }
        T.b(context).getClass();
        String str = T.f867s;
        String str2 = T.f868t;
        S.l(numX49.tnTj78("Pe2E") + T.f869u);
        String str3 = T.f869u;
        S.l(numX49.tnTj78("Pe2F") + T.f870v);
        String str4 = T.f870v;
        S.l(numX49.tnTj78("Pe2H") + T.f871w);
        String str5 = T.f871w;
        S.l(numX49.tnTj78("Pe2O") + T.f872x);
        String str6 = T.f872x;
        if (str == null || str2 == null) {
            S.i(numX49.tnTj78("Pe2t"));
            cleverTapInstanceConfig = null;
        } else {
            if (str3 == null) {
                S.i(numX49.tnTj78("Pe2Q"));
            }
            cleverTapInstanceConfig = new CleverTapInstanceConfig(T.b(context), str, str2, str3);
            if (str4 != null && !str4.trim().isEmpty()) {
                cleverTapInstanceConfig.f9441d = str4;
            }
            if (str5 != null && !str5.trim().isEmpty()) {
                cleverTapInstanceConfig.e = str5;
            }
            if (str6 != null && !str6.trim().isEmpty()) {
                cleverTapInstanceConfig.f = str6;
            }
        }
        f946d = cleverTapInstanceConfig;
        if (cleverTapInstanceConfig != null) {
            return j(context, cleverTapInstanceConfig);
        }
        return null;
    }

    public static C1495d h(Bundle bundle) {
        boolean zContainsKey = bundle.containsKey("wzrk_pn");
        return new C1495d(zContainsKey, zContainsKey && bundle.containsKey(numX49.tnTj78("Pe2U")));
    }

    public static void i(Context context, Bundle bundle) {
        String string;
        try {
            string = bundle.getString("wzrk_acct_id");
        } catch (Throwable unused) {
            string = null;
        }
        HashMap map = e;
        if (map == null) {
            C0187u c0187uA = a(context, string);
            if (c0187uA != null) {
                ((C0176i) c0187uA.f949b.f).v(bundle);
                return;
            }
            return;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            C0187u c0187u = (C0187u) e.get((String) it.next());
            if (c0187u != null && ((string == null && ((CleverTapInstanceConfig) c0187u.f949b.f814a).f9447p) || c0187u.c().equals(string))) {
                ((C0176i) c0187u.f949b.f).v(bundle);
                return;
            }
        }
    }

    public static C0187u j(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (cleverTapInstanceConfig == null) {
            S.l(numX49.tnTj78("Pe2e"));
            return null;
        }
        if (e == null) {
            e = new HashMap();
        }
        HashMap map = e;
        String str = cleverTapInstanceConfig.f9439a;
        C0187u c0187u = (C0187u) map.get(str);
        if (c0187u == null) {
            c0187u = new C0187u(context, cleverTapInstanceConfig);
            e.put(str, c0187u);
        } else if (((CleverTapInstanceConfig) c0187u.f949b.f814a).f9445n) {
            d0.k();
        }
        S.m(We.s.i(str, numX49.tnTj78("Pe28")), numX49.tnTj78("Pe2C") + c0187u);
        return c0187u;
    }

    public final String c() {
        return ((CleverTapInstanceConfig) this.f949b.f814a).f9439a;
    }

    public final ArrayList d() {
        S.b(numX49.tnTj78("Pe24"));
        ArrayList arrayList = new ArrayList();
        synchronized (((C0178k) this.f949b.h).f926b) {
            try {
                Z.p pVar = (Z.p) ((A) this.f949b.j).e;
                if (pVar == null) {
                    S sE = e();
                    String strC = c();
                    sE.getClass();
                    S.g(strC, "Notification Inbox not initialized");
                    return arrayList;
                }
                for (Z.v vVar : pVar.d()) {
                    S.l("CTMessage Dao - " + vVar.c().toString());
                    arrayList.add(new CTInboxMessage(vVar.c()));
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final S e() {
        return ((CleverTapInstanceConfig) this.f949b.f814a).c();
    }

    public final CTInboxMessage g(String str) {
        S.b(numX49.tnTj78("Pe2o") + str + numX49.tnTj78("Pe2K"));
        synchronized (((C0178k) this.f949b.h).f926b) {
            try {
                Z.p pVar = (Z.p) ((A) this.f949b.j).e;
                if (pVar != null) {
                    Z.v vVarC = pVar.c(str);
                    return vVarC != null ? new CTInboxMessage(vVarC.c()) : null;
                }
                S sE = e();
                String strC = c();
                sE.getClass();
                S.g(strC, "Notification Inbox not initialized");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(CTInboxMessage cTInboxMessage) {
        Z.p pVar = (Z.p) ((A) this.f949b.j).e;
        if (pVar != null) {
            l0.b.a(pVar.h).b().k(numX49.tnTj78("Pe2w"), new Z.n(0, pVar, cTInboxMessage));
        } else {
            S sE = e();
            String strC = c();
            sE.getClass();
            S.g(strC, numX49.tnTj78("Pe2c"));
        }
    }

    public final void l(HashMap map) {
        b0.f fVar = (b0.f) this.f949b.f820n;
        CleverTapInstanceConfig cleverTapInstanceConfig = fVar.f;
        if (cleverTapInstanceConfig.f9445n) {
            S.i(numX49.tnTj78("Pe2m"));
        }
        l0.b.a(cleverTapInstanceConfig).b().k(numX49.tnTj78("Pe2D"), new Z.n(1, fVar, map));
    }

    public final void m(String str) {
        CleverTapDisplayUnit cleverTapDisplayUnitB;
        JSONObject jSONObjectA;
        C0176i c0176i = (C0176i) this.f949b.f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("evtName", "Notification Clicked");
            G6.u uVar = (G6.u) ((A) c0176i.i).c;
            if (uVar != null && (cleverTapDisplayUnitB = uVar.b(str)) != null && (jSONObjectA = cleverTapDisplayUnitB.a()) != null) {
                jSONObject.put("evtData", jSONObjectA);
                try {
                    ((B) c0176i.j).o(jSONObjectA);
                } catch (Throwable unused) {
                }
            }
            ((C0176i) c0176i.e).y((Context) c0176i.h, jSONObject, 4);
        } catch (Throwable th2) {
            CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) c0176i.f917g;
            S sC = cleverTapInstanceConfig.c();
            String str2 = numX49.tnTj78("Pe2h") + th2;
            String str3 = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.s(str3, str2);
        }
    }

    public final void n(String str) {
        CleverTapDisplayUnit cleverTapDisplayUnitB;
        JSONObject jSONObjectA;
        C0176i c0176i = (C0176i) this.f949b.f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("evtName", "Notification Viewed");
            G6.u uVar = (G6.u) ((A) c0176i.i).c;
            if (uVar != null && (cleverTapDisplayUnitB = uVar.b(str)) != null && (jSONObjectA = cleverTapDisplayUnitB.a()) != null) {
                jSONObject.put("evtData", jSONObjectA);
            }
            ((C0176i) c0176i.e).y((Context) c0176i.h, jSONObject, 4);
        } catch (Throwable th2) {
            CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) c0176i.f917g;
            S sC = cleverTapInstanceConfig.c();
            String str2 = numX49.tnTj78("Pe2M") + th2;
            String str3 = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.s(str3, str2);
        }
    }

    public final void o(String str, HashMap map) {
        C0176i c0176i = (C0176i) this.f949b.f;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) c0176i.f917g;
        if (str != null) {
            String strTnTj78 = numX49.tnTj78("Pe2N");
            if (str.equals(strTnTj78)) {
                return;
            }
            o0.d dVar = (o0.d) c0176i.m;
            dVar.getClass();
            C1954a c1954a = new C1954a();
            String[] strArr = o0.d.e;
            int i = 0;
            while (true) {
                if (i >= 15) {
                    break;
                }
                if (Objects.equals(d0.g(str), d0.g(strArr[i]))) {
                    C1954a c1954aA = o0.b.a(new String[]{str}, 513, 16);
                    c1954a.f18751a = c1954aA.f18751a;
                    c1954a.f18752b = c1954aA.f18752b;
                    S.l(c1954aA.f18752b);
                    break;
                }
                i++;
            }
            int i4 = c1954a.f18751a;
            o0.c cVar = (o0.c) c0176i.f919l;
            if (i4 > 0) {
                cVar.b(c1954a);
                return;
            }
            C1954a c1954a2 = new C1954a();
            ArrayList arrayList = dVar.f18757a;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Objects.equals(d0.g(str), d0.g((String) it.next()))) {
                        C1954a c1954aA2 = o0.b.a(new String[]{str}, 513, 17);
                        c1954a2.f18751a = c1954aA2.f18751a;
                        c1954a2.f18752b = c1954aA2.f18752b;
                        S.b(str.concat(numX49.tnTj78("Pe26")));
                        break;
                    }
                }
            }
            if (c1954a2.f18751a > 0) {
                cVar.b(c1954a2);
                return;
            }
            if (map == null) {
                map = new HashMap();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                C1954a c1954aA3 = o0.d.a(str);
                if (c1954aA3.f18751a != 0) {
                    jSONObject.put("wzrk_error", n0.b.c(c1954aA3));
                }
                String string = c1954aA3.c.toString();
                JSONObject jSONObject2 = new JSONObject();
                for (String str2 : map.keySet()) {
                    Object obj = map.get(str2);
                    C1954a c1954aC = o0.d.c(str2);
                    String string2 = c1954aC.c.toString();
                    if (c1954aC.f18751a != 0) {
                        jSONObject.put("wzrk_error", n0.b.c(c1954aC));
                    }
                    try {
                        C1954a c1954aD = o0.d.d(2, obj);
                        Object obj2 = c1954aD.c;
                        if (c1954aD.f18751a != 0) {
                            jSONObject.put("wzrk_error", n0.b.c(c1954aD));
                        }
                        jSONObject2.put(string2, obj2);
                    } catch (IllegalArgumentException unused) {
                        C1954a c1954aA4 = o0.b.a(new String[]{string, string2, obj != null ? obj.toString() : strTnTj78}, 512, 7);
                        S sC = cleverTapInstanceConfig.c();
                        String str3 = cleverTapInstanceConfig.f9439a;
                        String str4 = c1954aA4.f18752b;
                        sC.getClass();
                        S.g(str3, str4);
                        cVar.b(c1954aA4);
                    }
                }
                jSONObject.put("evtName", string);
                jSONObject.put("evtData", jSONObject2);
                ((C0176i) c0176i.e).y((Context) c0176i.h, jSONObject, 4);
            } catch (Throwable unused2) {
            }
        }
    }

    public final void p(C1494c c1494c, Context context, Bundle bundle) {
        String strTnTj78 = numX49.tnTj78("Pe2a");
        C c10 = this.f949b;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) c10.f814a;
        try {
            synchronized (((g0.g) c10.f822p).f16782l) {
                try {
                    S sC = cleverTapInstanceConfig.c();
                    String str = cleverTapInstanceConfig.f9439a;
                    String str2 = strTnTj78 + Thread.currentThread().getId();
                    sC.getClass();
                    S.s(str, str2);
                    ((g0.g) this.f949b.f822p).i = c1494c;
                    if (bundle.containsKey("notificationId")) {
                        ((g0.g) this.f949b.f822p).a(context, bundle, bundle.getInt("notificationId"));
                    } else {
                        ((g0.g) this.f949b.f822p).a(context, bundle, -1000);
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            S sC2 = cleverTapInstanceConfig.c();
            String str3 = cleverTapInstanceConfig.f9439a;
            String strTnTj782 = numX49.tnTj78("Pe2X");
            sC2.getClass();
            S.h(str3, strTnTj782, th2);
        }
    }

    public final void q(I.b bVar) {
        r rVar = (r) this.f949b.i;
        if (bVar != null) {
            rVar.c = new WeakReference(bVar);
            return;
        }
        CleverTapInstanceConfig cleverTapInstanceConfig = rVar.f937g;
        S sC = cleverTapInstanceConfig.c();
        String str = cleverTapInstanceConfig.f9439a;
        sC.getClass();
        S.s(str, numX49.tnTj78("Pe2G"));
    }
}
