package Uj;

import R4.i;
import Vj.h;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import cj.C1124j;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f6005d = new b(new d(true, "    ", SessionDescription.ATTR_TYPE, false, true, a.f6003a), Wj.a.f6452a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f6007b;
    public final Qd.a c = new Qd.a(4);

    public b(d dVar, i iVar) {
        this.f6006a = dVar;
        this.f6007b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r0.f3460b = r4.length();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Pj.a r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.j.g(r6, r0)
            N.e r0 = new N.e
            r0.<init>(r7)
            N.e r1 = new N.e
            Vj.j r2 = Vj.j.c
            Rj.d r3 = r6.d()
            r1.<init>(r5, r2, r0, r3)
            java.lang.Object r6 = r1.r(r6)
            int r1 = r0.f3460b
        L1b:
            r2 = -1
            r3 = 10
            java.lang.Object r4 = r0.f
            java.lang.String r4 = (java.lang.String) r4
            if (r1 == r2) goto L48
            int r2 = r4.length()
            if (r1 >= r2) goto L48
            int r2 = r1 + 1
            char r1 = r4.charAt(r1)
            r4 = 32
            if (r1 == r4) goto L46
            if (r1 == r3) goto L46
            r3 = 13
            if (r1 == r3) goto L46
            r3 = 9
            if (r1 != r3) goto L3f
            goto L46
        L3f:
            r0.f3460b = r2
            byte r3 = Vj.f.b(r1)
            goto L4e
        L46:
            r1 = r2
            goto L1b
        L48:
            int r1 = r4.length()
            r0.f3460b = r1
        L4e:
            r1 = 10
            if (r3 != r1) goto L53
            return r6
        L53:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected EOF after parsing, but had "
            r6.<init>(r1)
            int r1 = r0.f3460b
            int r1 = r1 + (-1)
            char r7 = r7.charAt(r1)
            r6.append(r7)
            java.lang.String r7 = " instead"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 0
            r1 = 6
            N.e.x(r0, r6, r7, r1)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Uj.b.a(Pj.a, java.lang.String):java.lang.Object");
    }

    public final String b(Pj.a serializer, Object obj) {
        char[] cArr;
        j.g(serializer, "serializer");
        Ri.a aVar = new Ri.a(3, (byte) 0);
        Vj.b bVar = Vj.b.c;
        synchronized (bVar) {
            C1124j c1124j = bVar.f6135a;
            cArr = null;
            char[] cArr2 = (char[]) (c1124j.isEmpty() ? null : c1124j.removeLast());
            if (cArr2 != null) {
                bVar.f6136b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        aVar.c = cArr;
        try {
            new h(new A3.i(aVar, 7), this, Vj.j.c, new h[Vj.j.h.size()]).j(serializer, obj);
            return aVar.toString();
        } finally {
            aVar.n();
        }
    }
}
