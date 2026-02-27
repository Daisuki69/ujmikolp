package Tg;

import Tj.h;
import Tj.i;
import Tj.k;
import Tj.o;
import kotlin.jvm.internal.j;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5827a;
    private static final Rj.d descriptor;

    static {
        b bVar = new b();
        f5827a = bVar;
        o oVar = new o("io.ktor.util.date.GMTDate", bVar, 9);
        oVar.j("seconds", false);
        oVar.j("minutes", false);
        oVar.j("hours", false);
        oVar.j("dayOfWeek", false);
        oVar.j("dayOfMonth", false);
        oVar.j("dayOfYear", false);
        oVar.j("month", false);
        oVar.j("year", false);
        oVar.j("timestamp", false);
        descriptor = oVar;
    }

    @Override // Pj.a
    public final Object a(N.e eVar) {
        Rj.d dVar = descriptor;
        N.e eVarB = eVar.b(dVar);
        Pj.a[] aVarArr = d.j;
        e eVar2 = null;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        int iL4 = 0;
        int iL5 = 0;
        int iL6 = 0;
        f fVar = null;
        long jN = 0;
        boolean z4 = true;
        while (z4) {
            int iJ = eVarB.j(dVar);
            switch (iJ) {
                case -1:
                    z4 = false;
                    break;
                case 0:
                    iL = eVarB.l(dVar, 0);
                    i |= 1;
                    break;
                case 1:
                    iL2 = eVarB.l(dVar, 1);
                    i |= 2;
                    break;
                case 2:
                    iL3 = eVarB.l(dVar, 2);
                    i |= 4;
                    break;
                case 3:
                    fVar = (f) eVarB.q(dVar, 3, aVarArr[3], fVar);
                    i |= 8;
                    break;
                case 4:
                    iL4 = eVarB.l(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    iL5 = eVarB.l(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    eVar2 = (e) eVarB.q(dVar, 6, aVarArr[6], eVar2);
                    i |= 64;
                    break;
                case 7:
                    iL6 = eVarB.l(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    jN = eVarB.n(dVar, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iJ);
            }
        }
        eVarB.v(dVar);
        return new d(i, iL, iL2, iL3, fVar, iL4, iL5, eVar2, iL6, jN);
    }

    @Override // Tj.h
    public final Pj.a[] b() {
        Pj.a[] aVarArr = d.j;
        Pj.a aVar = aVarArr[3];
        Pj.a aVar2 = aVarArr[6];
        i iVar = i.f5865a;
        return new Pj.a[]{iVar, iVar, iVar, aVar, iVar, iVar, aVar2, iVar, k.f5869a};
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        d value = (d) obj;
        j.g(value, "value");
        Rj.d dVar = descriptor;
        Vj.h hVarA = hVar.a(dVar);
        hVarA.d(0, value.f5828a, dVar);
        hVarA.d(1, value.f5829b, dVar);
        hVarA.d(2, value.c, dVar);
        Pj.a[] aVarArr = d.j;
        hVarA.i(dVar, 3, aVarArr[3], value.f5830d);
        hVarA.d(4, value.e, dVar);
        hVarA.d(5, value.f, dVar);
        hVarA.i(dVar, 6, aVarArr[6], value.f5831g);
        hVarA.d(7, value.h, dVar);
        hVarA.f(dVar, 8, value.i);
        hVarA.m(dVar);
    }

    @Override // Pj.a
    public final Rj.d d() {
        return descriptor;
    }
}
