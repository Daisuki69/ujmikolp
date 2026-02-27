package Gf;

import Df.h;
import M8.T2;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import yf.C2531a;
import yf.d;
import yf.j;
import yf.p;
import zf.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements Df.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f1969a;

    public c(p pVar, j jVar) {
        this.f1969a = new h(pVar);
        pVar.G(j.f21262x1, j.D1.f21267a);
        pVar.G(j.f21252t1, jVar.f21267a);
    }

    public static c a(d dVar) throws IOException {
        List arrayList;
        yf.h hVarJ = null;
        if (dVar == null) {
            return null;
        }
        if (!(dVar instanceof p)) {
            throw new IOException("Unexpected object type: ".concat(dVar.getClass().getName()));
        }
        p pVar = (p) dVar;
        String strZ = pVar.z(j.f21252t1);
        j jVar = j.f21261x0;
        if (!jVar.f21267a.equals(strZ)) {
            if (j.f21245q0.f21267a.equals(strZ)) {
                yf.b bVarQ = pVar.q(j.f21247r0);
                d dVar2 = bVarQ instanceof d ? (d) bVarQ : null;
                return (dVar2 == null || !j.f21259w1.equals(dVar2.k(j.f21235m1))) ? new b(pVar) : new If.a(pVar);
            }
            j jVar2 = j.f21218e1;
            if (jVar2.f21267a.equals(strZ)) {
                return new b(pVar, jVar2);
            }
            throw new IOException(AbstractC1414e.h("Invalid XObject Subtype: ", strZ));
        }
        b bVar = new b(new h(pVar), jVar);
        j jVar3 = j.m0;
        yf.b bVarQ2 = pVar.q(jVar3);
        if (bVarQ2 instanceof j) {
            j jVar4 = (j) bVarQ2;
            arrayList = new Df.a(jVar4, jVar4, pVar, jVar3);
        } else if (bVarQ2 instanceof C2531a) {
            C2531a c2531a = (C2531a) bVarQ2;
            c2531a.getClass();
            arrayList = new ArrayList(c2531a.f21151a);
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty() && j.f21167A0.equals(arrayList.get(arrayList.size() - 1))) {
            Iterator it = Arrays.asList(j.f21173C1, j.t0, j.f21189Q).iterator();
            while (it.hasNext()) {
                if (!pVar.f21154a.containsKey((j) it.next())) {
                    try {
                        hVarJ = pVar.J();
                        List list = hVarJ.f21162a;
                        pVar.f((list.isEmpty() ? e.f21416b : (e) list.get(list.size() - 1)).f21417a);
                        return bVar;
                    } finally {
                        T2.d(hVarJ);
                    }
                }
            }
        }
        return bVar;
    }

    @Override // Df.c
    public final yf.b c() {
        return (p) this.f1969a.f1133b;
    }

    public c(h hVar, j jVar) {
        this.f1969a = hVar;
        j jVar2 = j.f21262x1;
        String str = j.D1.f21267a;
        p pVar = (p) hVar.f1133b;
        pVar.G(jVar2, str);
        pVar.G(j.f21252t1, jVar.f21267a);
    }
}
