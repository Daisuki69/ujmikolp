package xi;

import Bi.d;
import Rg.u;
import java.util.concurrent.LinkedBlockingDeque;
import si.C2261c;
import yi.f;

/* JADX INFO: renamed from: xi.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2482a extends u {
    public final d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingDeque f21006d;

    public C2482a(d dVar, LinkedBlockingDeque linkedBlockingDeque) {
        super(4);
        this.c = dVar;
        this.f21006d = linkedBlockingDeque;
    }

    @Override // Rg.u
    public final void q() throws InterruptedException {
        try {
            C2261c c2261c = (C2261c) this.f21006d.take();
            d dVar = this.c;
            if (dVar.f577g.get() && dVar.i.compareAndSet(false, true)) {
                f fVar = dVar.f574a;
                fVar.f();
                fVar.c(dVar.c.g(true, c2261c.f20122b, c2261c.c), c2261c.f20121a, dVar.f);
                fVar.e();
            }
            Ri.a.d("A new notification to update segments has been received. Enqueuing polling task.");
        } catch (InterruptedException e) {
            Ri.a.d("My segments update worker has been interrupted");
            throw e;
        }
    }
}
