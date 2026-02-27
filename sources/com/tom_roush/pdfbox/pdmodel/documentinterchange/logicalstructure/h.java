package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yf.C2531a;
import yf.m;
import yf.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements Df.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yf.d f16051a;

    public h(String str) {
        yf.d dVar = new yf.d();
        this.f16051a = dVar;
        dVar.G(yf.j.f21262x1, str);
    }

    public static h e(yf.d dVar) {
        String strZ = dVar.z(yf.j.f21262x1);
        if ("StructTreeRoot".equals(strZ)) {
            return new i(dVar);
        }
        if (strZ == null || g.f16050b.equals(strZ)) {
            return new g(dVar);
        }
        throw new IllegalArgumentException("Dictionary must not include a Type entry with a value that is neither StructTreeRoot nor StructElem.");
    }

    private Df.c g(yf.d dVar) {
        String strZ = dVar.z(yf.j.f21262x1);
        if (strZ == null || g.f16050b.equals(strZ)) {
            return new g(dVar);
        }
        if (e.f16047b.equals(strZ)) {
            return new e(dVar);
        }
        if (d.f16045b.equals(strZ)) {
            return new d(dVar);
        }
        return null;
    }

    public void a(g gVar) {
        d(gVar);
        gVar.d0(this);
    }

    public void b(yf.b bVar) {
        if (bVar == null) {
            return;
        }
        yf.d dVarC = c();
        yf.j jVar = yf.j.f21170B0;
        yf.b bVarQ = dVarC.q(jVar);
        if (bVarQ == null) {
            c().F(jVar, bVar);
            return;
        }
        if (bVarQ instanceof C2531a) {
            ((C2531a) bVarQ).f(bVar);
            return;
        }
        C2531a c2531a = new C2531a();
        c2531a.f(bVarQ);
        c2531a.f(bVar);
        c().F(jVar, c2531a);
    }

    public void d(Df.c cVar) {
        if (cVar == null) {
            return;
        }
        b(cVar.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(yf.b r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof yf.d
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r4
            yf.d r0 = (yf.d) r0
            goto L1a
        L9:
            boolean r0 = r4 instanceof yf.m
            if (r0 == 0) goto L19
            r0 = r4
            yf.m r0 = (yf.m) r0
            yf.b r0 = r0.f21270a
            boolean r2 = r0 instanceof yf.d
            if (r2 == 0) goto L19
            yf.d r0 = (yf.d) r0
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L21
            Df.c r4 = r3.g(r0)
            return r4
        L21:
            boolean r0 = r4 instanceof yf.i
            if (r0 == 0) goto L2f
            yf.i r4 = (yf.i) r4
            long r0 = r4.f21165a
            int r4 = (int) r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.h.f(yf.b):java.lang.Object");
    }

    @Override // Df.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public yf.d c() {
        return this.f16051a;
    }

    public List<Object> i() {
        ArrayList arrayList = new ArrayList();
        yf.b bVarQ = c().q(yf.j.f21170B0);
        if (bVarQ instanceof C2531a) {
            Iterator it = ((C2531a) bVarQ).f21151a.iterator();
            while (it.hasNext()) {
                Object objF = f((yf.b) it.next());
                if (objF != null) {
                    arrayList.add(objF);
                }
            }
        } else {
            Object objF2 = f(bVarQ);
            if (objF2 != null) {
                arrayList.add(objF2);
            }
        }
        return arrayList;
    }

    public String j() {
        return c().z(yf.j.f21262x1);
    }

    public void k(g gVar, Object obj) {
        m(gVar, obj);
    }

    public void l(yf.b bVar, Object obj) {
        ArrayList arrayList;
        if (bVar == null || obj == null) {
            return;
        }
        yf.d dVarC = c();
        yf.j jVar = yf.j.f21170B0;
        yf.b bVarQ = dVarC.q(jVar);
        if (bVarQ == null) {
            return;
        }
        yf.b bVarC = obj instanceof Df.c ? ((Df.c) obj).c() : null;
        if (!(bVarQ instanceof C2531a)) {
            boolean zEquals = bVarQ.equals(bVarC);
            if (!zEquals && (bVarQ instanceof m)) {
                zEquals = ((m) bVarQ).f21270a.equals(bVarC);
            }
            if (zEquals) {
                C2531a c2531a = new C2531a();
                c2531a.f(bVar);
                c2531a.f(bVarC);
                c().F(jVar, c2531a);
                return;
            }
            return;
        }
        C2531a c2531a2 = (C2531a) bVarQ;
        int i = 0;
        while (true) {
            arrayList = c2531a2.f21151a;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            yf.b bVarG = c2531a2.g(i);
            if (bVarG == null) {
                if (bVarG == bVarC) {
                    break;
                } else {
                    i++;
                }
            } else if (bVarG.equals(bVarC) || ((bVarG instanceof m) && ((m) bVarG).f21270a.equals(bVarC))) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, bVar);
    }

    public void m(Df.c cVar, Object obj) {
        if (cVar == null) {
            return;
        }
        l(cVar.c(), obj);
    }

    public boolean n(g gVar) {
        boolean zP = p(gVar);
        if (zP) {
            gVar.d0(null);
        }
        return zP;
    }

    public boolean o(yf.b bVar) {
        if (bVar != null) {
            yf.d dVarC = c();
            yf.j jVar = yf.j.f21170B0;
            yf.b bVarQ = dVarC.q(jVar);
            if (bVarQ != null) {
                if (bVarQ instanceof C2531a) {
                    C2531a c2531a = (C2531a) bVarQ;
                    ArrayList arrayList = c2531a.f21151a;
                    boolean zRemove = arrayList.remove(bVar);
                    if (!zRemove) {
                        int i = 0;
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            yf.b bVarG = c2531a.g(i);
                            if ((bVarG instanceof m) && ((m) bVarG).f21270a.equals(bVar)) {
                                zRemove = arrayList.remove(bVarG);
                                break;
                            }
                            i++;
                        }
                    }
                    if (arrayList.size() == 1) {
                        c().F(yf.j.f21170B0, c2531a.k(0));
                    }
                    return zRemove;
                }
                boolean zEquals = bVarQ.equals(bVar);
                if (!zEquals && (bVarQ instanceof m)) {
                    zEquals = ((m) bVarQ).f21270a.equals(bVar);
                }
                if (zEquals) {
                    c().C(jVar);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean p(Df.c cVar) {
        if (cVar == null) {
            return false;
        }
        return o(cVar.c());
    }

    public void q(List<Object> list) {
        C2531a c2531a;
        yf.d dVarC = c();
        yf.j jVar = yf.j.f21170B0;
        if (list == null) {
            c2531a = null;
        } else if (list instanceof Df.a) {
            c2531a = ((Df.a) list).f1123a;
        } else {
            C2531a c2531a2 = new C2531a();
            for (Object obj : list) {
                if (obj instanceof String) {
                    c2531a2.f(new q((String) obj));
                } else if ((obj instanceof Integer) || (obj instanceof Long)) {
                    c2531a2.f(yf.i.m(((Number) obj).longValue()));
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    c2531a2.f(new yf.f(((Number) obj).floatValue()));
                } else if (obj instanceof Df.c) {
                    c2531a2.f(((Df.c) obj).c());
                } else {
                    if (obj != null) {
                        throw new IllegalArgumentException("Error: Don't know how to convert type to COSBase '" + obj.getClass().getName() + "'");
                    }
                    c2531a2.f(yf.k.f21269a);
                }
            }
            c2531a = c2531a2;
        }
        dVarC.F(jVar, c2531a);
    }

    public h(yf.d dVar) {
        this.f16051a = dVar;
    }
}
