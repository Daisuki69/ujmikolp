package Nh;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Ah.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4466b;
    public final i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4467d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dh.c f4465a = new Dh.c(1);

    public h(g gVar) {
        i iVar;
        i iVar2;
        this.f4466b = gVar;
        if (gVar.c.f1159b) {
            iVar2 = j.f4469g;
        } else {
            while (true) {
                if (gVar.f4463b.isEmpty()) {
                    iVar = new i(gVar.f);
                    gVar.c.a(iVar);
                    break;
                } else {
                    iVar = (i) gVar.f4463b.poll();
                    if (iVar != null) {
                        break;
                    }
                }
            }
            iVar2 = iVar;
        }
        this.c = iVar2;
    }

    @Override // Ah.n
    public final io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f4465a.f1159b ? Dh.b.f1156a : this.c.e(runnable, j, timeUnit, this.f4465a);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (this.f4467d.compareAndSet(false, true)) {
            this.f4465a.dispose();
            g gVar = this.f4466b;
            gVar.getClass();
            long jNanoTime = System.nanoTime() + gVar.f4462a;
            i iVar = this.c;
            iVar.c = jNanoTime;
            gVar.f4463b.offer(iVar);
        }
    }
}
