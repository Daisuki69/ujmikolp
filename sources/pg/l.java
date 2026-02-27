package pg;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19106a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U8.c f19107b;

    public l(U8.c cVar) {
        this.f19107b = cVar;
    }

    @Override // pg.k
    public final void endOfStream() {
        if (this.f19106a.getAndSet(true)) {
            return;
        }
        U8.c cVar = this.f19107b;
        if (((AtomicReference) cVar.c).get() != this) {
            return;
        }
        n nVar = (n) cVar.f5965d;
        nVar.f19108a.send(nVar.f19109b, null);
    }

    @Override // pg.k
    public final void error(String str, String str2, Object obj) throws IOException {
        if (this.f19106a.get()) {
            return;
        }
        U8.c cVar = this.f19107b;
        if (((AtomicReference) cVar.c).get() != this) {
            return;
        }
        n nVar = (n) cVar.f5965d;
        nVar.f19108a.send(nVar.f19109b, nVar.c.f(str, str2, obj));
    }

    @Override // pg.k
    public final void success(Object obj) {
        if (this.f19106a.get()) {
            return;
        }
        U8.c cVar = this.f19107b;
        if (((AtomicReference) cVar.c).get() != this) {
            return;
        }
        n nVar = (n) cVar.f5965d;
        nVar.f19108a.send(nVar.f19109b, nVar.c.b(obj));
    }
}
