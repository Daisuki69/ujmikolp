package of;

import dOYHB6.tiZVw8.numX49;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements s, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f18826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f18827b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18828d;

    public j(n nVar, Inflater inflater) {
        this.f18826a = nVar;
        this.f18827b = inflater;
    }

    @Override // of.s
    public final long a(long j, e eVar) throws IOException {
        boolean z4;
        if (this.f18828d) {
            throw new IllegalStateException(numX49.tnTj78("bQuJ"));
        }
        do {
            Inflater inflater = this.f18827b;
            boolean zNeedsInput = inflater.needsInput();
            n nVar = this.f18826a;
            z4 = false;
            if (zNeedsInput) {
                int i = this.c;
                if (i != 0) {
                    int remaining = i - inflater.getRemaining();
                    this.c -= remaining;
                    nVar.i(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    throw new IllegalStateException(numX49.tnTj78("bQu5"));
                }
                if (nVar.m()) {
                    z4 = true;
                } else {
                    o oVar = nVar.f18833a.f18821a;
                    int i4 = oVar.c;
                    int i6 = oVar.f18836b;
                    int i10 = i4 - i6;
                    this.c = i10;
                    inflater.setInput(oVar.f18835a, i6, i10);
                }
            }
            try {
                o oVarQ = eVar.q(1);
                int iInflate = inflater.inflate(oVarQ.f18835a, oVarQ.c, (int) Math.min(8192L, 8192 - oVarQ.c));
                if (iInflate > 0) {
                    oVarQ.c += iInflate;
                    long j6 = iInflate;
                    eVar.f18822b += j6;
                    return j6;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i11 = this.c;
                if (i11 != 0) {
                    int remaining2 = i11 - inflater.getRemaining();
                    this.c -= remaining2;
                    nVar.i(remaining2);
                }
                if (oVarQ.f18836b != oVarQ.c) {
                    return -1L;
                }
                eVar.f18821a = oVarQ.a();
                p.c(oVarQ);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z4);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f18828d) {
            return;
        }
        this.f18827b.end();
        this.f18828d = true;
        this.f18826a.close();
    }

    @Override // of.s
    public final u timeout() {
        return this.f18826a.f18834b.timeout();
    }
}
