package p003if;

import dOYHB6.tiZVw8.numX49;
import ef.c;
import of.h;
import of.r;
import of.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements r, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17141b;
    public final /* synthetic */ g c;

    public e(g gVar) {
        this.c = gVar;
        this.f17140a = new h(gVar.f17145d.f18832b.timeout());
    }

    @Override // of.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17141b) {
            return;
        }
        this.f17141b = true;
        g gVar = this.c;
        gVar.getClass();
        h hVar = this.f17140a;
        u uVar = hVar.e;
        hVar.e = u.f18842d;
        uVar.a();
        uVar.d();
        gVar.e = 3;
    }

    @Override // of.r, java.io.Flushable
    public final void flush() {
        if (this.f17141b) {
            return;
        }
        this.c.f17145d.flush();
    }

    @Override // of.r
    public final void s(long j, of.e eVar) {
        if (this.f17141b) {
            throw new IllegalStateException(numX49.tnTj78("bShV"));
        }
        long j6 = eVar.f18822b;
        byte[] bArr = c.f16663a;
        if (j < 0 || 0 > j6 || j6 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.c.f17145d.s(j, eVar);
    }

    @Override // of.r
    public final u timeout() {
        return this.f17140a;
    }
}
