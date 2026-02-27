package of;

import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements r, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gf.i f18817b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(gf.i iVar, Object obj, int i) {
        this.f18816a = i;
        this.f18817b = iVar;
        this.c = obj;
    }

    @Override // of.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f18816a) {
            case 0:
                gf.i iVar = this.f18817b;
                iVar.k();
                try {
                    try {
                        ((b) this.c).close();
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
                ((OutputStream) this.c).close();
                return;
        }
    }

    @Override // of.r, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f18816a) {
            case 0:
                gf.i iVar = this.f18817b;
                iVar.k();
                try {
                    try {
                        ((b) this.c).flush();
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
                ((OutputStream) this.c).flush();
                return;
        }
    }

    @Override // of.r
    public final void s(long j, e eVar) throws IOException {
        switch (this.f18816a) {
            case 0:
                v.b(eVar.f18822b, 0L, j);
                long j6 = j;
                while (true) {
                    long j7 = 0;
                    if (j6 <= 0) {
                        return;
                    }
                    o oVar = eVar.f18821a;
                    while (true) {
                        if (j7 < 65536) {
                            j7 += (long) (oVar.c - oVar.f18836b);
                            if (j7 >= j6) {
                                j7 = j6;
                            } else {
                                oVar = oVar.f;
                            }
                        }
                    }
                    gf.i iVar = this.f18817b;
                    iVar.k();
                    try {
                        try {
                            ((b) this.c).s(j7, eVar);
                            j6 -= j7;
                            iVar.i(true);
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
                }
                break;
            default:
                v.b(eVar.f18822b, 0L, j);
                while (j > 0) {
                    this.f18817b.g();
                    o oVar2 = eVar.f18821a;
                    int iMin = (int) Math.min(j, oVar2.c - oVar2.f18836b);
                    ((OutputStream) this.c).write(oVar2.f18835a, oVar2.f18836b, iMin);
                    int i = oVar2.f18836b + iMin;
                    oVar2.f18836b = i;
                    long j9 = iMin;
                    j -= j9;
                    eVar.f18822b -= j9;
                    if (i == oVar2.c) {
                        eVar.f18821a = oVar2.a();
                        p.c(oVar2);
                    }
                }
                return;
        }
    }

    @Override // of.r
    public final u timeout() {
        switch (this.f18816a) {
        }
        return this.f18817b;
    }

    public final String toString() {
        switch (this.f18816a) {
            case 0:
                return numX49.tnTj78("bQuB") + ((b) this.c) + numX49.tnTj78("bQuu");
            default:
                return numX49.tnTj78("bQuZ") + ((OutputStream) this.c) + numX49.tnTj78("bQuk");
        }
    }
}
