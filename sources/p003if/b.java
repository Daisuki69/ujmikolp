package p003if;

import dOYHB6.tiZVw8.numX49;
import of.e;
import of.h;
import of.m;
import of.r;
import of.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements r, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17136b;
    public final /* synthetic */ g c;

    public b(g gVar) {
        this.c = gVar;
        this.f17135a = new h(gVar.f17145d.f18832b.timeout());
    }

    @Override // of.r, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f17136b) {
            return;
        }
        this.f17136b = true;
        this.c.f17145d.a("0\r\n\r\n");
        g gVar = this.c;
        h hVar = this.f17135a;
        gVar.getClass();
        u uVar = hVar.e;
        hVar.e = u.f18842d;
        uVar.a();
        uVar.d();
        this.c.e = 3;
    }

    @Override // of.r, java.io.Flushable
    public final synchronized void flush() {
        if (this.f17136b) {
            return;
        }
        this.c.f17145d.flush();
    }

    @Override // of.r
    public final void s(long j, e eVar) {
        boolean z4 = this.f17136b;
        String strTnTj78 = numX49.tnTj78("bShb");
        if (z4) {
            throw new IllegalStateException(strTnTj78);
        }
        if (j == 0) {
            return;
        }
        g gVar = this.c;
        m mVar = gVar.f17145d;
        if (mVar.c) {
            throw new IllegalStateException(strTnTj78);
        }
        mVar.f18831a.D(j);
        mVar.g();
        m mVar2 = gVar.f17145d;
        String strTnTj782 = numX49.tnTj78("bSh2");
        mVar2.a(strTnTj782);
        mVar2.s(j, eVar);
        mVar2.a(strTnTj782);
    }

    @Override // of.r
    public final u timeout() {
        return this.f17135a;
    }
}
