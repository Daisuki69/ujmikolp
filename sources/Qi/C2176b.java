package qi;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.C1684a;
import ki.C1781b;
import ki.h;
import ph.C2070f1;
import pi.C2151a;
import pi.InterfaceC2153c;

/* JADX INFO: renamed from: qi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2176b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2070f1 f19791b;
    public final zi.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1781b f19792d;
    public final h e;
    public final yi.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19793g;
    public String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19790a = 0;
    public final AtomicBoolean i = new AtomicBoolean(true);

    public C2176b(C2070f1 c2070f1, zi.b bVar, C1781b c1781b, h hVar, yi.f fVar) {
        Bi.c cVar = new Bi.c(this, 3);
        this.f19791b = c2070f1;
        this.c = bVar;
        bVar.a(cVar);
        this.f19792d = c1781b;
        this.e = hVar;
        this.f = fVar;
        this.f19793g = 1800;
    }

    @Override // qi.f
    public final void a() {
        switch (this.f19790a) {
            case 0:
                this.f19792d.k(this.h);
                ((X2.e) ((InterfaceC2153c) ((C2151a) this.f19791b.f19463b).f19707a)).b();
                break;
            default:
                this.f19792d.k(this.h);
                ((X2.e) ((InterfaceC2153c) ((C2151a) this.f19791b.f19463b).f19707a)).b();
                break;
        }
    }

    @Override // qi.f
    public final void b() {
        switch (this.f19790a) {
            case 0:
                if (this.i.get()) {
                    String str = this.h;
                    C1781b c1781b = this.f19792d;
                    if (str != null) {
                        c1781b.k(str);
                    }
                    this.h = c1781b.h(this.e.b(), 0L, this.f19793g, this.c);
                }
                break;
            default:
                if (this.i.get()) {
                    String str2 = this.h;
                    C1781b c1781b2 = this.f19792d;
                    if (str2 != null) {
                        c1781b2.k(str2);
                    }
                    this.h = c1781b2.h(this.e.b(), 0L, this.f19793g, this.c);
                }
                break;
        }
    }

    @Override // qi.f
    public final void flush() {
        switch (this.f19790a) {
            case 0:
                C1684a c1684aB = this.e.b();
                zi.b bVar = this.c;
                yi.f fVar = this.f;
                fVar.d(c1684aB, bVar);
                fVar.e();
                break;
            default:
                C1684a c1684aB2 = this.e.b();
                zi.b bVar2 = this.c;
                yi.f fVar2 = this.f;
                fVar2.d(c1684aB2, bVar2);
                fVar2.e();
                break;
        }
    }

    public C2176b(C2070f1 c2070f1, zi.b bVar, C1781b c1781b, h hVar, yi.f fVar, boolean z4) {
        Bi.c cVar = new Bi.c(this, 5);
        this.f19791b = c2070f1;
        this.c = bVar;
        bVar.a(cVar);
        this.f19792d = c1781b;
        this.e = hVar;
        Objects.requireNonNull(fVar);
        this.f = fVar;
        this.f19793g = 1800;
        new AtomicBoolean(z4);
    }
}
