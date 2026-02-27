package p003if;

import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import of.e;
import of.h;
import of.s;
import of.u;

/* JADX INFO: renamed from: if.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1601a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17134b;
    public final /* synthetic */ g c;

    public AbstractC1601a(g gVar) {
        this.c = gVar;
        this.f17133a = new h(gVar.c.f18834b.timeout());
    }

    @Override // of.s
    public long a(long j, e eVar) throws IOException {
        g gVar = this.c;
        try {
            return gVar.c.a(j, eVar);
        } catch (IOException e) {
            gVar.f17144b.k();
            b();
            throw e;
        }
    }

    public final void b() {
        g gVar = this.c;
        int i = gVar.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException(numX49.tnTj78("bShP") + gVar.e);
        }
        h hVar = this.f17133a;
        u uVar = hVar.e;
        hVar.e = u.f18842d;
        uVar.a();
        uVar.d();
        gVar.e = 6;
    }

    @Override // of.s
    public final u timeout() {
        return this.f17133a;
    }
}
