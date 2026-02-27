package b3;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: b3.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0866F implements Tj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0866F f8387a;
    private static final Rj.d descriptor;

    static {
        C0866F c0866f = new C0866F();
        f8387a = c0866f;
        Tj.o oVar = new Tj.o("com.google.firebase.sessions.SessionData", c0866f, 3);
        oVar.j("sessionDetails", false);
        oVar.j("backgroundTime", true);
        oVar.j("processDataMap", true);
        descriptor = oVar;
    }

    @Override // Pj.a
    public final Object a(N.e eVar) {
        Rj.d dVar = descriptor;
        N.e eVarB = eVar.b(dVar);
        Pj.a[] aVarArr = C0868H.f8388d;
        C0872L c0872l = null;
        boolean z4 = true;
        int i = 0;
        h0 h0Var = null;
        Map map = null;
        while (z4) {
            int iJ = eVarB.j(dVar);
            if (iJ == -1) {
                z4 = false;
            } else if (iJ == 0) {
                c0872l = (C0872L) eVarB.q(dVar, 0, C0870J.f8392a, c0872l);
                i |= 1;
            } else if (iJ == 1) {
                h0Var = (h0) eVarB.p(dVar, 1, f0.f8457a, h0Var);
                i |= 2;
            } else {
                if (iJ != 2) {
                    throw new UnknownFieldException(iJ);
                }
                map = (Map) eVarB.p(dVar, 2, aVarArr[2], map);
                i |= 4;
            }
        }
        eVarB.v(dVar);
        return new C0868H(i, c0872l, h0Var, map);
    }

    @Override // Tj.h
    public final Pj.a[] b() {
        return new Pj.a[]{C0870J.f8392a, Qj.a.a(f0.f8457a), Qj.a.a(C0868H.f8388d[2])};
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        C0868H value = (C0868H) obj;
        kotlin.jvm.internal.j.g(value, "value");
        Rj.d dVar = descriptor;
        Vj.h hVarA = hVar.a(dVar);
        C0867G c0867g = C0868H.Companion;
        hVarA.i(dVar, 0, C0870J.f8392a, value.f8389a);
        boolean zN = hVarA.n(dVar);
        h0 h0Var = value.f8390b;
        if (zN || h0Var != null) {
            hVarA.h(dVar, 1, f0.f8457a, h0Var);
        }
        boolean zN2 = hVarA.n(dVar);
        Map map = value.c;
        if (zN2 || map != null) {
            hVarA.h(dVar, 2, C0868H.f8388d[2], map);
        }
        hVarA.m(dVar);
    }

    @Override // Pj.a
    public final Rj.d d() {
        return descriptor;
    }
}
