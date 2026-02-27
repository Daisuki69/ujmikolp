package Fg;

import Bj.C0144h0;
import Bj.H;
import Bj.U;
import M8.T2;
import Ng.C0496d;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import bg.AbstractC0983W;
import d4.AbstractC1331a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.z;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rg.a f1622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rg.a f1623b;
    public static final Cg.c c;

    static {
        F fC;
        C1790e c1790eA = z.a(d.class);
        F fC2 = null;
        try {
            fC = z.c(d.class);
        } catch (Throwable unused) {
            fC = null;
        }
        f1622a = new Rg.a("CallLogger", new Wg.a(c1790eA, fC));
        C1790e c1790eA2 = z.a(Unit.class);
        try {
            fC2 = z.c(Unit.class);
        } catch (Throwable unused2) {
        }
        f1623b = new Rg.a("DisableLogging", new Wg.a(c1790eA2, fC2));
        c = jk.b.f("Logging", j.f1613a, new Ag.a(20));
    }

    public static final Object a(g gVar, e eVar, ArrayList arrayList, Jg.c cVar, k kVar) {
        Charset charsetB;
        Object obj = cVar.f2522d;
        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        Og.f fVar = (Og.f) obj;
        d dVar = new d(gVar);
        cVar.f.f(f1622a, dVar);
        StringBuilder sb2 = new StringBuilder();
        if (eVar.f1604a) {
            sb2.append("REQUEST: " + AbstractC0983W.a(cVar.f2520a));
            sb2.append('\n');
            sb2.append("METHOD: " + cVar.f2521b);
            sb2.append('\n');
        }
        if (eVar.f1605b) {
            sb2.append("COMMON HEADERS\n");
            S1.s.o(sb2, cVar.c.a(), arrayList);
            sb2.append("CONTENT HEADERS");
            sb2.append('\n');
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw AbstractC1331a.n(it);
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw AbstractC1331a.n(it2);
            }
            Long lA = fVar.a();
            if (lA != null) {
                long jLongValue = lA.longValue();
                List list = Ng.q.f4436a;
                S1.s.n(sb2, RtspHeaders.CONTENT_LENGTH, String.valueOf(jLongValue));
            }
            C0496d c0496dB = fVar.b();
            if (c0496dB != null) {
                List list2 = Ng.q.f4436a;
                S1.s.n(sb2, RtspHeaders.CONTENT_TYPE, c0496dB.toString());
            }
            S1.s.o(sb2, fVar.c().a(), arrayList);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        if (string.length() > 0) {
            dVar.c(string);
        }
        if (string.length() == 0 || !eVar.c) {
            dVar.a();
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("BODY Content-Type: " + fVar.b());
        sb3.append('\n');
        C0496d c0496dB2 = fVar.b();
        if (c0496dB2 == null || (charsetB = T2.b(c0496dB2)) == null) {
            charsetB = C2581c.f21468b;
        }
        Charset charset = charsetB;
        io.ktor.utils.io.k kVar2 = new io.ktor.utils.io.k(false);
        H.w(C0144h0.f623a, U.f603a.plus(new Jj.a()), null, new l(kVar2, charset, sb3, dVar, null), 2);
        return X5.f.w(fVar, kVar2, kVar);
    }

    public static final void b(e eVar, StringBuilder sb2, Jg.b bVar, Throwable th2) {
        if (eVar.f1604a) {
            sb2.append("RESPONSE " + bVar.getUrl() + " failed with exception: " + th2);
        }
    }
}
