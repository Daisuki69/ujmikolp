package V5;

import A3.i;
import D8.C0193a;
import W5.e;
import Xh.n;
import android.content.Context;
import android.content.SharedPreferences;
import bj.C1034e;
import bj.EnumC1035f;
import cj.L;
import cj.t;
import defpackage.AbstractC1414e;
import io.split.android.client.dtos.Split;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6079b;
    public final Integer c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f6080d;
    public W5.b e;
    public W5.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uh.b f6081g = new Uh.b(null);
    public final Uh.b h = new Uh.b(null);
    public final HashMap i = new HashMap();
    public final Object j = C1034e.a(EnumC1035f.f9163a, new a(this, 0));

    public c(Context context, Integer num, String str) {
        this.f6078a = str;
        this.f6079b = context;
        this.c = num;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [bj.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [bj.d, java.lang.Object] */
    public final void a(e eVar) {
        C0193a c0193a;
        Ti.b bVarB;
        i iVar = this.f6080d;
        String str = eVar.f6316a;
        LinkedHashMap linkedHashMap = null;
        if (iVar != null && (c0193a = ((n) iVar.c).f6660a) != null) {
            io.split.android.client.storage.splits.c cVar = (io.split.android.client.storage.splits.c) c0193a.c;
            ArrayList arrayList = new ArrayList();
            try {
                if (c0193a.f1033b) {
                    Ri.a.g("Manager has already been destroyed - no calls possible");
                } else if (cVar.getAll().size() > 0) {
                    for (Split split : cVar.getAll().values()) {
                        R4.i iVar2 = (R4.i) c0193a.f1034d;
                        iVar2.getClass();
                        try {
                            bVarB = iVar2.b(split, null);
                        } catch (Throwable th2) {
                            Ri.a.i(th2, "Could not parse feature flag: %s", split != null ? split.name : "null");
                            bVarB = null;
                        }
                        if (bVarB != null) {
                            arrayList.add(C0193a.e(bVarB));
                        }
                    }
                }
            } catch (Exception e) {
                AbstractC1414e.o(e, new StringBuilder("Error getting feature flags: "));
            }
            ArrayList<Yh.b> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (j.b(((Yh.b) obj).f6790b, str)) {
                    arrayList2.add(obj);
                }
            }
            int iB = L.b(t.l(arrayList2, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
            for (Yh.b bVar : arrayList2) {
                linkedHashMap2.put(bVar.f6789a, bVar.c);
            }
            linkedHashMap = linkedHashMap2;
        }
        W5.c cVarB = b();
        cVarB.getClass();
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        Map mapA = cVarB.a(eVar);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(L.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String str4 = (String) mapA.get(str2);
            if (str4 != null) {
                str3 = str4;
            }
            linkedHashMap3.put(key, str3);
        }
        SharedPreferences sharedPreferences = (SharedPreferences) cVarB.f6312b.getValue();
        j.f(sharedPreferences, "<get-sharedPreferences>(...)");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        j.f(editor, "editor");
        String strK = ((com.google.gson.j) Y5.b.f6757a.getValue()).k(linkedHashMap3);
        j.f(strK, "toJson(...)");
        editor.putString(str, strK);
        editor.apply();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bj.d, java.lang.Object] */
    public final W5.c b() {
        return (W5.c) this.j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(A5.f r14) {
        /*
            r13 = this;
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.j.g(r14, r0)
            W5.e r0 = r14.f161b
            W5.e r1 = W5.e.c
            if (r0 != r1) goto Lf
            W5.b r0 = r13.f
        Ld:
            r1 = r0
            goto L12
        Lf:
            W5.b r0 = r13.e
            goto Ld
        L12:
            r2 = 0
            if (r1 == 0) goto L62
            java.lang.String r3 = r14.f160a
            Xh.h r0 = r1.c
            if (r0 == 0) goto L5d
            Si.c r4 = r0.e
            boolean r7 = r0.i
            java.lang.String r10 = "control"
            com.paymaya.domain.store.M r11 = r4.f5739l
            Oi.k r9 = Oi.k.TREATMENT_WITH_CONFIG
            r12 = 0
            java.util.List r5 = java.util.Collections.singletonList(r3)     // Catch: java.lang.Exception -> L47
            C2.f r8 = new C2.f     // Catch: java.lang.Exception -> L47
            r0 = 11
            r8.<init>(r0)     // Catch: java.lang.Exception -> L47
            r6 = 0
            java.util.HashMap r0 = r4.d(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L47
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L47
            Xh.q r0 = (Xh.q) r0     // Catch: java.lang.Exception -> L47
            if (r0 != 0) goto L5a
            r11.k(r3, r12)     // Catch: java.lang.Exception -> L47
            Xh.q r0 = new Xh.q     // Catch: java.lang.Exception -> L47
            r0.<init>(r10, r12)     // Catch: java.lang.Exception -> L47
            goto L5a
        L47:
            r0 = move-exception
            java.lang.String r5 = "Client getTreatmentWithConfig exception"
            Ri.a.h(r5, r0)
            Qi.c r0 = r4.f5738k
            r0.L(r9)
            r11.k(r3, r12)
            Xh.q r0 = new Xh.q
            r0.<init>(r10, r12)
        L5a:
            java.lang.String r0 = r0.f6673b
            goto L5e
        L5d:
            r0 = r2
        L5e:
            yk.a.a()
            goto L63
        L62:
            r0 = r2
        L63:
            if (r1 != 0) goto L83
            W5.c r0 = r13.b()
            r0.getClass()
            Y5.a r1 = r14.a()
            java.util.Map r0 = r0.a(r1)
            java.lang.String r14 = r14.getKey()
            java.lang.Object r14 = r0.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L81
            goto L85
        L81:
            r0 = r14
            goto L8e
        L83:
            if (r0 != 0) goto L87
        L85:
            r0 = r2
            goto L8e
        L87:
            W5.c r1 = r13.b()
            r1.b(r14, r0)
        L8e:
            if (r0 == 0) goto L9e
            boolean r14 = zj.C2576A.H(r0)
            if (r14 == 0) goto L97
            goto L9e
        L97:
            M8.T2.x(r0)     // Catch: com.google.gson.JsonParseException -> L9b
            return r0
        L9b:
            yk.a.d()
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.c.c(A5.f):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(Y5.d r15, java.util.Map r16) {
        /*
            r14 = this;
            Y5.a r0 = r15.a()
            W5.e r1 = W5.e.c
            if (r0 != r1) goto Lc
            W5.b r0 = r14.f
        La:
            r1 = r0
            goto Lf
        Lc:
            W5.b r0 = r14.e
            goto La
        Lf:
            r2 = 0
            java.lang.String r3 = "control"
            if (r1 == 0) goto L60
            java.lang.String r4 = r15.getKey()
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.j.g(r4, r0)
            Xh.h r0 = r1.c
            if (r0 == 0) goto L5b
            Si.c r5 = r0.e
            boolean r8 = r0.i
            java.lang.String r11 = "control"
            com.paymaya.domain.store.M r12 = r5.f5739l
            Oi.k r10 = Oi.k.TREATMENT
            r13 = 0
            java.util.List r6 = java.util.Collections.singletonList(r4)     // Catch: java.lang.Exception -> L4b
            C2.f r9 = new C2.f     // Catch: java.lang.Exception -> L4b
            r0 = 12
            r9.<init>(r0)     // Catch: java.lang.Exception -> L4b
            r7 = r16
            java.util.HashMap r0 = r5.d(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L4b
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L4b
            if (r0 != 0) goto L49
            r12.k(r4, r13)     // Catch: java.lang.Exception -> L4b
            goto L59
        L49:
            r11 = r0
            goto L59
        L4b:
            r0 = move-exception
            java.lang.String r6 = "Client getTreatment exception"
            Ri.a.h(r6, r0)
            Qi.c r0 = r5.f5738k
            r0.L(r10)
            r12.k(r4, r13)
        L59:
            if (r11 != 0) goto L5c
        L5b:
            r11 = r3
        L5c:
            yk.a.a()
            goto L61
        L60:
            r11 = r2
        L61:
            if (r1 != 0) goto L80
            W5.c r0 = r14.b()
            r0.getClass()
            Y5.a r1 = r15.a()
            java.util.Map r0 = r0.a(r1)
            java.lang.String r15 = r15.getKey()
            java.lang.Object r15 = r0.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto L7f
            return r2
        L7f:
            return r15
        L80:
            boolean r0 = kotlin.jvm.internal.j.b(r11, r3)
            if (r0 == 0) goto L87
            return r2
        L87:
            W5.c r0 = r14.b()
            r0.b(r15, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.c.d(Y5.d, java.util.Map):java.lang.String");
    }
}
