package b3;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements Tj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f8457a;
    private static final Rj.d descriptor;

    static {
        f0 f0Var = new f0();
        f8457a = f0Var;
        Tj.o oVar = new Tj.o("com.google.firebase.sessions.Time", f0Var, 3);
        oVar.j("ms", false);
        oVar.j("us", true);
        oVar.j("seconds", true);
        descriptor = oVar;
    }

    @Override // Pj.a
    public final Object a(N.e eVar) {
        Rj.d dVar = descriptor;
        N.e eVarB = eVar.b(dVar);
        int i = 0;
        long jN = 0;
        long jN2 = 0;
        long jN3 = 0;
        boolean z4 = true;
        while (z4) {
            int iJ = eVarB.j(dVar);
            if (iJ == -1) {
                z4 = false;
            } else if (iJ == 0) {
                jN = eVarB.n(dVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                jN2 = eVarB.n(dVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    throw new UnknownFieldException(iJ);
                }
                jN3 = eVarB.n(dVar, 2);
                i |= 4;
            }
        }
        eVarB.v(dVar);
        return new h0(jN, jN2, i, jN3);
    }

    @Override // Tj.h
    public final Pj.a[] b() {
        Tj.k kVar = Tj.k.f5869a;
        return new Pj.a[]{kVar, kVar, kVar};
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        h0 value = (h0) obj;
        kotlin.jvm.internal.j.g(value, "value");
        Rj.d dVar = descriptor;
        Vj.h hVarA = hVar.a(dVar);
        long j = value.f8465a;
        hVarA.f(dVar, 0, j);
        boolean zN = hVarA.n(dVar);
        long j6 = value.f8466b;
        if (zN || j6 != ((long) 1000) * j) {
            hVarA.f(dVar, 1, j6);
        }
        boolean zN2 = hVarA.n(dVar);
        long j7 = value.c;
        if (zN2 || j7 != j / ((long) 1000)) {
            hVarA.f(dVar, 2, j7);
        }
        hVarA.m(dVar);
    }

    @Override // Pj.a
    public final Rj.d d() {
        return descriptor;
    }
}
