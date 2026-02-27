package Re;

import Q6.r;
import java.io.IOException;
import pg.j;
import pg.k;
import pg.l;
import pg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f5518a;

    public c(j jVar, String str) {
        new n(jVar, str).a(new r(this, 2));
    }

    @Override // pg.k
    public final void endOfStream() {
        l lVar = this.f5518a;
        if (lVar != null) {
            lVar.endOfStream();
        }
    }

    @Override // pg.k
    public final void error(String str, String str2, Object obj) throws IOException {
        l lVar = this.f5518a;
        if (lVar != null) {
            lVar.error(str, str2, obj);
        }
    }

    @Override // pg.k
    public final void success(Object obj) {
        l lVar = this.f5518a;
        if (lVar != null) {
            lVar.success(obj);
        }
    }
}
