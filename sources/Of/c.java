package of;

import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements s, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18818a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18819b;
    public final /* synthetic */ Object c;

    public c(gf.i iVar, c cVar) {
        this.c = iVar;
        this.f18819b = cVar;
    }

    @Override // of.s
    public final long a(long j, e eVar) throws IOException {
        switch (this.f18818a) {
            case 0:
                gf.i iVar = (gf.i) this.c;
                iVar.k();
                try {
                    try {
                        long jA = ((c) this.f18819b).a(8192L, eVar);
                        iVar.i(true);
                        return jA;
                    } catch (IOException e) {
                        if (iVar.l()) {
                            throw iVar.h(e);
                        }
                        throw e;
                    }
                } catch (Throwable th2) {
                    iVar.i(false);
                    throw th2;
                }
            default:
                try {
                    ((u) this.f18819b).g();
                    o oVarQ = eVar.q(1);
                    int i = ((InputStream) this.c).read(oVarQ.f18835a, oVarQ.c, (int) Math.min(8192L, 8192 - oVarQ.c));
                    if (i == -1) {
                        return -1L;
                    }
                    oVarQ.c += i;
                    long j6 = i;
                    eVar.f18822b += j6;
                    return j6;
                } catch (AssertionError e7) {
                    if (e7.getCause() == null || e7.getMessage() == null || !e7.getMessage().contains(numX49.tnTj78("bQuI"))) {
                        throw e7;
                    }
                    throw new IOException(e7);
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f18818a) {
            case 0:
                gf.i iVar = (gf.i) this.c;
                try {
                    try {
                        ((c) this.f18819b).close();
                        iVar.i(true);
                        return;
                    } catch (IOException e) {
                        if (!iVar.l()) {
                            throw e;
                        }
                        throw iVar.h(e);
                    }
                } catch (Throwable th2) {
                    iVar.i(false);
                    throw th2;
                }
            default:
                ((InputStream) this.c).close();
                return;
        }
    }

    @Override // of.s
    public final u timeout() {
        switch (this.f18818a) {
            case 0:
                return (gf.i) this.c;
            default:
                return (u) this.f18819b;
        }
    }

    public final String toString() {
        switch (this.f18818a) {
            case 0:
                return numX49.tnTj78("bQul") + ((c) this.f18819b) + numX49.tnTj78("bQuW");
            default:
                return numX49.tnTj78("bQuq") + ((InputStream) this.c) + numX49.tnTj78("bQuz");
        }
    }

    public c(u uVar, InputStream inputStream) {
        this.f18819b = uVar;
        this.c = inputStream;
    }
}
