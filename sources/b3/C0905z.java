package b3;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: b3.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0905z implements Tj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0905z f8505a;
    private static final Rj.d descriptor;

    static {
        C0905z c0905z = new C0905z();
        f8505a = c0905z;
        Tj.o oVar = new Tj.o("com.google.firebase.sessions.ProcessData", c0905z, 2);
        oVar.j("pid", false);
        oVar.j("uuid", false);
        descriptor = oVar;
    }

    @Override // Pj.a
    public final Object a(N.e eVar) {
        Rj.d dVar = descriptor;
        N.e eVarB = eVar.b(dVar);
        String strT = null;
        boolean z4 = true;
        int i = 0;
        int iL = 0;
        while (z4) {
            int iJ = eVarB.j(dVar);
            if (iJ == -1) {
                z4 = false;
            } else if (iJ == 0) {
                iL = eVarB.l(dVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new UnknownFieldException(iJ);
                }
                strT = eVarB.t(dVar, 1);
                i |= 2;
            }
        }
        eVarB.v(dVar);
        return new C0862B(i, iL, strT);
    }

    @Override // Tj.h
    public final Pj.a[] b() {
        return new Pj.a[]{Tj.i.f5865a, Tj.r.f5886a};
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        C0862B value = (C0862B) obj;
        kotlin.jvm.internal.j.g(value, "value");
        Rj.d dVar = descriptor;
        Vj.h hVarA = hVar.a(dVar);
        hVarA.d(0, value.f8377a, dVar);
        hVarA.l(dVar, 1, value.f8378b);
        hVarA.m(dVar);
    }

    @Override // Pj.a
    public final Rj.d d() {
        return descriptor;
    }
}
