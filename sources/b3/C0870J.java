package b3;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: b3.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0870J implements Tj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0870J f8392a;
    private static final Rj.d descriptor;

    static {
        C0870J c0870j = new C0870J();
        f8392a = c0870j;
        Tj.o oVar = new Tj.o("com.google.firebase.sessions.SessionDetails", c0870j, 4);
        oVar.j("sessionId", false);
        oVar.j("firstSessionId", false);
        oVar.j("sessionIndex", false);
        oVar.j("sessionStartTimestampUs", false);
        descriptor = oVar;
    }

    @Override // Pj.a
    public final Object a(N.e eVar) {
        Rj.d dVar = descriptor;
        N.e eVarB = eVar.b(dVar);
        int i = 0;
        int iL = 0;
        String strT = null;
        String strT2 = null;
        long jN = 0;
        boolean z4 = true;
        while (z4) {
            int iJ = eVarB.j(dVar);
            if (iJ == -1) {
                z4 = false;
            } else if (iJ == 0) {
                strT = eVarB.t(dVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                strT2 = eVarB.t(dVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                iL = eVarB.l(dVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    throw new UnknownFieldException(iJ);
                }
                jN = eVarB.n(dVar, 3);
                i |= 8;
            }
        }
        eVarB.v(dVar);
        return new C0872L(jN, strT, i, iL, strT2);
    }

    @Override // Tj.h
    public final Pj.a[] b() {
        Tj.r rVar = Tj.r.f5886a;
        return new Pj.a[]{rVar, rVar, Tj.i.f5865a, Tj.k.f5869a};
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        C0872L value = (C0872L) obj;
        kotlin.jvm.internal.j.g(value, "value");
        Rj.d dVar = descriptor;
        Vj.h hVarA = hVar.a(dVar);
        hVarA.l(dVar, 0, value.f8393a);
        hVarA.l(dVar, 1, value.f8394b);
        hVarA.d(2, value.c, dVar);
        hVarA.f(dVar, 3, value.f8395d);
        hVarA.m(dVar);
    }

    @Override // Pj.a
    public final Rj.d d() {
        return descriptor;
    }
}
