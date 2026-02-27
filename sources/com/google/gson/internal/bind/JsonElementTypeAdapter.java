package com.google.gson.internal.bind;

import com.google.gson.internal.j;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.y;
import d4.AbstractC1331a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
class JsonElementTypeAdapter extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonElementTypeAdapter f9898a = new JsonElementTypeAdapter();

    private JsonElementTypeAdapter() {
    }

    public static o a(j3.a aVar, int i) {
        int iC = AbstractC2217b.c(i);
        if (iC == 5) {
            return new r(aVar.I());
        }
        if (iC == 6) {
            return new r(new com.google.gson.internal.g(aVar.I()));
        }
        if (iC == 7) {
            return new r(Boolean.valueOf(aVar.z()));
        }
        if (iC != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC1331a.x(i)));
        }
        aVar.G();
        return p.f10033a;
    }

    public static void b(j3.b bVar, o oVar) throws IOException {
        if (oVar == null || (oVar instanceof p)) {
            bVar.r();
            return;
        }
        if (oVar instanceof r) {
            r rVarH = oVar.h();
            Serializable serializable = rVarH.f10035a;
            if (serializable instanceof Number) {
                bVar.D(rVarH.l());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.F(rVarH.c());
                return;
            } else {
                bVar.E(rVarH.j());
                return;
            }
        }
        if (oVar instanceof l) {
            bVar.c();
            Iterator it = oVar.f().f10032a.iterator();
            while (it.hasNext()) {
                b(bVar, (o) it.next());
            }
            bVar.i();
            return;
        }
        if (!(oVar instanceof q)) {
            throw new IllegalArgumentException("Couldn't write " + oVar.getClass());
        }
        bVar.f();
        Iterator it2 = ((com.google.gson.internal.i) oVar.g().f10034a.entrySet()).iterator();
        while (((com.google.gson.internal.h) it2).hasNext()) {
            j jVarB = ((com.google.gson.internal.h) it2).b();
            bVar.m((String) jVarB.getKey());
            b(bVar, (o) jVarB.getValue());
        }
        bVar.k();
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) throws IOException {
        o lVar;
        o lVar2;
        if (aVar instanceof d) {
            d dVar = (d) aVar;
            int iPeek = dVar.peek();
            if (iPeek != 5 && iPeek != 2 && iPeek != 4 && iPeek != 10) {
                o oVar = (o) dVar.X();
                dVar.Q();
                return oVar;
            }
            throw new IllegalStateException("Unexpected " + AbstractC1331a.x(iPeek) + " when reading a JsonElement.");
        }
        int iPeek2 = aVar.peek();
        int iC = AbstractC2217b.c(iPeek2);
        if (iC == 0) {
            aVar.b();
            lVar = new l();
        } else if (iC != 2) {
            lVar = null;
        } else {
            aVar.c();
            lVar = new q();
        }
        if (lVar == null) {
            return a(aVar, iPeek2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.t()) {
                String strE = lVar instanceof q ? aVar.E() : null;
                int iPeek3 = aVar.peek();
                int iC2 = AbstractC2217b.c(iPeek3);
                if (iC2 == 0) {
                    aVar.b();
                    lVar2 = new l();
                } else if (iC2 != 2) {
                    lVar2 = null;
                } else {
                    aVar.c();
                    lVar2 = new q();
                }
                boolean z4 = lVar2 != null;
                if (lVar2 == null) {
                    lVar2 = a(aVar, iPeek3);
                }
                if (lVar instanceof l) {
                    ((l) lVar).f10032a.add(lVar2);
                } else {
                    ((q) lVar).k(strE, lVar2);
                }
                if (z4) {
                    arrayDeque.addLast(lVar);
                    lVar = lVar2;
                }
            } else {
                if (lVar instanceof l) {
                    aVar.i();
                } else {
                    aVar.k();
                }
                if (arrayDeque.isEmpty()) {
                    return lVar;
                }
                lVar = (o) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.y
    public final /* bridge */ /* synthetic */ void write(j3.b bVar, Object obj) throws IOException {
        b(bVar, (o) obj);
    }
}
