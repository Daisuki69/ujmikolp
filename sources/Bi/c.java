package Bi;

import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import qi.C2175a;
import qi.C2176b;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f573b;

    public /* synthetic */ c(Object obj, int i) {
        this.f572a = i;
        this.f573b = obj;
    }

    @Override // ki.e
    public final void b(Ff.f fVar) {
        switch (this.f572a) {
            case 0:
                d dVar = (d) this.f573b;
                dVar.i.set(false);
                if (fVar.c == 2 && Boolean.TRUE.equals(fVar.f())) {
                    dVar.f577g.compareAndSet(true, false);
                    dVar.e();
                    break;
                }
                break;
            case 1:
                if (Boolean.TRUE.equals(fVar.f())) {
                    Ni.b bVar = (Ni.b) this.f573b;
                    bVar.e.set(false);
                    String str = bVar.f4501g;
                    if (str != null) {
                        bVar.c.k(str);
                        bVar.f4501g = null;
                    }
                }
                break;
            case 2:
                if (fVar.c == 2 && Boolean.TRUE.equals(fVar.f())) {
                    ((C2175a) this.f573b).f.compareAndSet(true, false);
                    break;
                }
                break;
            case 3:
                if (fVar.c == 2 && Boolean.TRUE.equals(fVar.f())) {
                    C2176b c2176b = (C2176b) this.f573b;
                    c2176b.i.compareAndSet(true, false);
                    c2176b.a();
                    break;
                }
                break;
            case 4:
                if (fVar.c == 2 && Boolean.TRUE.equals(fVar.f())) {
                    ((qi.e) this.f573b).f19808g.compareAndSet(true, false);
                    break;
                }
                break;
            case 5:
                if (fVar.c == 2 && Boolean.TRUE.equals(fVar.f())) {
                    C2176b c2176b2 = (C2176b) this.f573b;
                    c2176b2.i.compareAndSet(true, false);
                    c2176b2.a();
                    break;
                }
                break;
            case 6:
                if (fVar.c == 2) {
                    Boolean boolF = fVar.f();
                    Xh.g gVar = (Xh.g) this.f573b;
                    gVar.getClass();
                    if (Boolean.TRUE.equals(boolF)) {
                        ((AtomicBoolean) gVar.j).compareAndSet(true, false);
                        ((C1781b) gVar.f6641b).k((String) gVar.f);
                    }
                }
                break;
            default:
                if (Boolean.TRUE.equals(fVar.f())) {
                    zi.d dVar2 = (zi.d) this.f573b;
                    dVar2.m.compareAndSet(true, false);
                    dVar2.f21456a.k(dVar2.h);
                }
                break;
        }
    }
}
