package Yg;

import M8.T2;
import Mj.g;
import Mj.i;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final Mj.a a(i iVar) {
        j.g(iVar, "<this>");
        Mj.a buffer = iVar.getBuffer();
        Mj.a aVar = new Mj.a();
        if (buffer.c == 0) {
            return aVar;
        }
        g gVar = buffer.f3423a;
        j.d(gVar);
        g gVarE = gVar.e();
        aVar.f3423a = gVarE;
        aVar.f3424b = gVarE;
        for (g gVar2 = gVar.f; gVar2 != null; gVar2 = gVar2.f) {
            g gVar3 = aVar.f3424b;
            j.d(gVar3);
            g gVarE2 = gVar2.e();
            gVar3.d(gVarE2);
            aVar.f3424b = gVarE2;
        }
        aVar.c = buffer.c;
        return aVar;
    }

    public static final long b(i iVar) {
        j.g(iVar, "<this>");
        return iVar.getBuffer().c;
    }

    public static String c(i iVar, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = C2581c.f21468b;
        }
        j.g(iVar, "<this>");
        j.g(charset, "charset");
        return charset.equals(C2581c.f21468b) ? Mj.j.e(iVar) : T2.k(charset.newDecoder(), iVar);
    }
}
