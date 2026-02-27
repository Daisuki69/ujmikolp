package Kh;

import java.util.concurrent.TimeUnit;
import pi.C2151a;

/* JADX INFO: renamed from: Kh.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0305j extends AbstractC0296a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2735b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0305j(Ah.h hVar, Object obj, int i) {
        super(hVar);
        this.f2735b = i;
        this.c = obj;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        switch (this.f2735b) {
            case 0:
                Rh.a aVar = new Rh.a(jVar);
                Ah.n nVarA = ((Nh.e) this.c).a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.f2715a.g(new Gh.e(aVar, nVarA));
                break;
            case 1:
                this.f2715a.g(new Gh.e(0, jVar, (Ch.c) this.c));
                break;
            case 2:
                this.f2715a.g(new C0312q(jVar, (Ch.g) this.c, 0));
                break;
            case 3:
                this.f2715a.g(new u(jVar, (C2151a) this.c));
                break;
            default:
                Gh.d dVar = new Gh.d(jVar);
                jVar.a(dVar);
                Dh.a.d(dVar, ((Nh.j) this.c).b(new S1.v(8, this, dVar, false)));
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0305j(Nh.e eVar) {
        this.f2735b = 0;
        C0311p c0311p = C0311p.f2745a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        super(c0311p);
        this.c = eVar;
    }
}
