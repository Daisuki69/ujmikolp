package sh;

import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends ch.u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f20095b;
    public final i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f20096d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1485a f20094a = new C1485a(0);

    public h(g gVar) {
        i iVar;
        i iVar2;
        this.f20095b = gVar;
        if (gVar.c.f16758b) {
            iVar2 = j.h;
        } else {
            while (true) {
                if (gVar.f20092b.isEmpty()) {
                    iVar = new i(gVar.f);
                    gVar.c.a(iVar);
                    break;
                } else {
                    iVar = (i) gVar.f20092b.poll();
                    if (iVar != null) {
                        break;
                    }
                }
            }
            iVar2 = iVar;
        }
        this.c = iVar2;
    }

    @Override // ch.u
    public final InterfaceC1486b b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f20094a.f16758b ? EnumC1605c.f17149a : this.c.e(runnable, j, timeUnit, this.f20094a);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f20096d.compareAndSet(false, true)) {
            this.f20094a.dispose();
            if (j.i) {
                this.c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            g gVar = this.f20095b;
            gVar.getClass();
            long jNanoTime = System.nanoTime() + gVar.f20091a;
            i iVar = this.c;
            iVar.c = jNanoTime;
            gVar.f20092b.offer(iVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f20095b;
        gVar.getClass();
        long jNanoTime = System.nanoTime() + gVar.f20091a;
        i iVar = this.c;
        iVar.c = jNanoTime;
        gVar.f20092b.offer(iVar);
    }
}
