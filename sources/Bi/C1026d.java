package bi;

import dOYHB6.tiZVw8.numX49;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: bi.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1026d extends AbstractRunnableC1025c implements InterfaceC1027e {
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9150d = new Object();

    @Override // bi.InterfaceC1027e
    public final void a(i iVar) {
        Objects.requireNonNull(iVar);
        try {
            this.f9148a.add(iVar);
        } catch (IllegalStateException unused) {
            Ri.a.d(numX49.tnTj78("bu6u"));
        }
    }

    @Override // bi.AbstractRunnableC1025c
    public final void b() {
        try {
            i iVar = (i) this.f9148a.take();
            synchronized (this.f9150d) {
                try {
                    this.f9149b.add(iVar);
                    int iOrdinal = iVar.ordinal();
                    if (iOrdinal == 1 || iOrdinal == 7 || iOrdinal == 9 || iOrdinal == 11 || iOrdinal == 4 || iOrdinal == 5) {
                        Iterator it = this.c.values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1027e) it.next()).a(iVar);
                        }
                    }
                } finally {
                }
            }
        } catch (InterruptedException e) {
            Ri.a.d(e.getMessage());
        }
    }
}
