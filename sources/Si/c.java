package Si;

import A3.i;
import C2.f;
import D.S;
import N.m;
import Oi.k;
import We.s;
import Xh.q;
import bi.EnumC1028f;
import bi.h;
import com.paymaya.domain.store.M;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U8.c f5734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f5735b;
    public final d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fi.c f5736d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f5737g;
    public final h h;
    public final Xh.b i;
    public final mg.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Qi.c f5738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M f5739l;

    public c(String str, U8.c cVar, S s9, d dVar, fi.c cVar2, boolean z4, h hVar, Xh.b bVar, mg.c cVar3, Qi.c cVar4, i iVar, io.split.android.client.storage.splits.c cVar5, d dVar2, d dVar3, Xh.c cVar6, M m) {
        this.f5734a = cVar;
        this.f5735b = s9;
        this.c = dVar;
        this.e = str;
        this.f5736d = cVar2;
        this.f = z4;
        this.h = hVar;
        Objects.requireNonNull(dVar2);
        this.f5737g = dVar2;
        this.i = bVar;
        Objects.requireNonNull(cVar3);
        this.j = cVar3;
        Objects.requireNonNull(cVar4);
        this.f5738k = cVar4;
        Objects.requireNonNull(cVar5);
        Objects.requireNonNull(dVar3);
        Objects.requireNonNull(cVar6);
        Objects.requireNonNull(m);
        this.f5739l = m;
    }

    public final m a(String str, String str2, HashMap map) {
        EnumC1028f enumC1028f = EnumC1028f.f9151a;
        h hVar = this.h;
        if (hVar.d(enumC1028f) || hVar.d(EnumC1028f.f9152b)) {
            return this.f5734a.p(this.e, str, map);
        }
        String strJ = s.j(numX49.tnTj78("bkbP"), str, numX49.tnTj78("bkbb"));
        this.f5737g.getClass();
        d.d(strJ, str2);
        this.f5738k.b();
        return new m(numX49.tnTj78("bkbL"), this.f5739l.k(str, numX49.tnTj78("bkb2")).f16680a, null, null, false);
    }

    public final HashMap b(List list, String str, f fVar) {
        Cg.c cVarB;
        if (list == null) {
            list = new ArrayList();
        }
        HashMap map = new HashMap();
        for (String str2 : list) {
            if (this.c != null && (cVarB = d.b(str2)) != null) {
                boolean z4 = ((Integer) cVarB.f768b) != null;
                d dVar = this.f5737g;
                if (z4) {
                    if (dVar != null) {
                        d.a(str, (String) cVarB.c);
                    }
                } else if (dVar != null) {
                    d.c(cVarB, str);
                }
            }
            this.f5739l.k(str2, null);
            map.put(str2.trim(), fVar.b(new q(numX49.tnTj78("bkbr"), null)));
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A3.i c(java.lang.String r18, java.lang.String r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Si.c.c(java.lang.String, java.lang.String, java.util.HashMap):A3.i");
    }

    public final HashMap d(List list, Map map, boolean z4, f fVar, k kVar) {
        String str = kVar.f4860a;
        Qi.c cVar = this.f5738k;
        d dVar = this.f5737g;
        try {
            if (z4) {
                dVar.getClass();
                d.a("Client has already been destroyed - no calls possible", str);
                return b(list, str, fVar);
            }
            Cg.c cVarP = this.f5735b.p(this.e);
            if (cVarP != null) {
                dVar.getClass();
                d.a(str, (String) cVarP.c);
                return b(list, str, fVar);
            }
            if (list == null) {
                list = new ArrayList();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z5 = false;
            try {
                mg.c cVar2 = this.j;
                Map mapC = this.i.c();
                cVar2.getClass();
                HashMap map2 = new HashMap();
                map2.putAll(mapC);
                if (map != null) {
                    map2.putAll(map);
                }
                HashMap map3 = new HashMap();
                for (String str2 : list) {
                    i iVarC = c(str2, str, map2);
                    map3.put(str2, fVar.b((q) iVarC.c));
                    if (iVarC.f41b) {
                        z5 = true;
                    }
                }
                return map3;
            } finally {
                cVar.j(kVar, System.currentTimeMillis() - jCurrentTimeMillis);
                if (z5) {
                    cVar.L(kVar);
                }
            }
        } catch (Exception e) {
            Ri.a.h(numX49.tnTj78("bkbu") + str + numX49.tnTj78("bkbV"), e);
            cVar.L(kVar);
            return b(list, str, fVar);
        }
    }

    public final void e(String str, String str2, String str3, String str4, Long l6, boolean z4) {
        fi.c cVar = this.f5736d;
        try {
            fi.b bVar = new fi.b(str, str2, str3, System.currentTimeMillis(), str4, l6);
            cVar.a(new i(bVar, z4, 12));
            cVar.c(bVar);
        } catch (Throwable th2) {
            Ri.a.g(numX49.tnTj78("bkbS") + th2.getLocalizedMessage());
        }
    }
}
