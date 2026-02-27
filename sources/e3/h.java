package e3;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Tj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f16572a;
    private static final Rj.d descriptor;

    static {
        h hVar = new h();
        f16572a = hVar;
        Tj.o oVar = new Tj.o("com.google.firebase.sessions.settings.SessionConfigs", hVar, 5);
        oVar.j("sessionsEnabled", false);
        oVar.j("sessionSamplingRate", false);
        oVar.j("sessionTimeoutSeconds", false);
        oVar.j("cacheDurationSeconds", false);
        oVar.j("cacheUpdatedTimeSeconds", false);
        descriptor = oVar;
    }

    @Override // Pj.a
    public final Object a(N.e eVar) {
        Rj.d dVar = descriptor;
        N.e eVarB = eVar.b(dVar);
        int i = 0;
        Boolean bool = null;
        Double d10 = null;
        Integer num = null;
        Integer num2 = null;
        Long l6 = null;
        boolean z4 = true;
        while (z4) {
            int iJ = eVarB.j(dVar);
            if (iJ == -1) {
                z4 = false;
            } else if (iJ == 0) {
                bool = (Boolean) eVarB.p(dVar, 0, Tj.a.f5853a, bool);
                i |= 1;
            } else if (iJ == 1) {
                d10 = (Double) eVarB.p(dVar, 1, Tj.c.f5855a, d10);
                i |= 2;
            } else if (iJ == 2) {
                num = (Integer) eVarB.p(dVar, 2, Tj.i.f5865a, num);
                i |= 4;
            } else if (iJ == 3) {
                num2 = (Integer) eVarB.p(dVar, 3, Tj.i.f5865a, num2);
                i |= 8;
            } else {
                if (iJ != 4) {
                    throw new UnknownFieldException(iJ);
                }
                l6 = (Long) eVarB.p(dVar, 4, Tj.k.f5869a, l6);
                i |= 16;
            }
        }
        eVarB.v(dVar);
        return new j(i, bool, d10, num, num2, l6);
    }

    @Override // Tj.h
    public final Pj.a[] b() {
        Pj.a aVarA = Qj.a.a(Tj.a.f5853a);
        Pj.a aVarA2 = Qj.a.a(Tj.c.f5855a);
        Tj.i iVar = Tj.i.f5865a;
        return new Pj.a[]{aVarA, aVarA2, Qj.a.a(iVar), Qj.a.a(iVar), Qj.a.a(Tj.k.f5869a)};
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        j value = (j) obj;
        kotlin.jvm.internal.j.g(value, "value");
        Rj.d dVar = descriptor;
        Vj.h hVarA = hVar.a(dVar);
        hVarA.h(dVar, 0, Tj.a.f5853a, value.f16573a);
        hVarA.h(dVar, 1, Tj.c.f5855a, value.f16574b);
        Tj.i iVar = Tj.i.f5865a;
        hVarA.h(dVar, 2, iVar, value.c);
        hVarA.h(dVar, 3, iVar, value.f16575d);
        hVarA.h(dVar, 4, Tj.k.f5869a, value.e);
        hVarA.m(dVar);
    }

    @Override // Pj.a
    public final Rj.d d() {
        return descriptor;
    }
}
