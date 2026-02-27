package c1;

import E8.RunnableC0219b;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9246b;
    public final Z0.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z0.f f9247d;
    public final s e;

    public r(i iVar, String str, Z0.c cVar, Z0.f fVar, s sVar) {
        this.f9245a = iVar;
        this.f9246b = str;
        this.c = cVar;
        this.f9247d = fVar;
        this.e = sVar;
    }

    public final void a(Z0.d dVar, Z0.h hVar) {
        i iVar = this.f9245a;
        if (dVar == null) {
            throw new NullPointerException("Null event");
        }
        String str = this.f9246b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        Z0.f fVar = this.f9247d;
        if (fVar == null) {
            throw new NullPointerException("Null transformer");
        }
        Z0.c cVar = this.c;
        s sVar = this.e;
        Z0.a aVar = (Z0.a) dVar;
        i iVarA = iVar.a(aVar.f6871b);
        Xh.g gVar = new Xh.g();
        gVar.f = new HashMap();
        gVar.f6642d = Long.valueOf(sVar.f9248a.f());
        gVar.e = Long.valueOf(sVar.f9249b.f());
        gVar.f6640a = str;
        gVar.c = new k(cVar, (byte[]) fVar.apply(aVar.f6870a));
        gVar.f6641b = null;
        Z0.b bVar = aVar.c;
        if (bVar != null) {
            gVar.f6643g = bVar.f6872a;
        }
        h hVarB = gVar.b();
        h1.a aVar2 = (h1.a) sVar.c;
        aVar2.getClass();
        aVar2.f16851b.execute(new RunnableC0219b(aVar2, iVarA, hVar, hVarB, 9));
    }

    public final void b(Z0.d dVar) {
        a(dVar, new androidx.media3.extractor.flv.a(22));
    }
}
