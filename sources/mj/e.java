package Mj;

import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements i, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3430b;
    public final a c = new a();

    public e(c cVar) {
        this.f3429a = cVar;
    }

    @Override // Mj.i
    public final int A(int i, int i4, byte[] bArr) {
        j.a(bArr.length, i, i4);
        a aVar = this.c;
        if (aVar.c == 0 && this.f3429a.l(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.A(i, ((int) Math.min(i4 - i, aVar.c)) + i, bArr);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws EOFException {
        if (this.f3430b) {
            return;
        }
        this.f3430b = true;
        this.f3429a.e = true;
        a aVar = this.c;
        aVar.skip(aVar.c);
    }

    @Override // Mj.i
    public final long e(a sink) {
        a aVar;
        kotlin.jvm.internal.j.g(sink, "sink");
        long j = 0;
        while (true) {
            c cVar = this.f3429a;
            aVar = this.c;
            if (cVar.l(aVar, 8192L) == -1) {
                break;
            }
            long j6 = aVar.c;
            if (j6 == 0) {
                j6 = 0;
            } else {
                g gVar = aVar.f3424b;
                kotlin.jvm.internal.j.d(gVar);
                int i = gVar.c;
                if (i < 8192 && gVar.e) {
                    j6 -= (long) (i - gVar.f3433b);
                }
            }
            if (j6 > 0) {
                j += j6;
                sink.i(aVar, j6);
            }
        }
        long j7 = aVar.c;
        if (j7 <= 0) {
            return j;
        }
        long j9 = j + j7;
        sink.i(aVar, j7);
        return j9;
    }

    @Override // Mj.i
    public final boolean exhausted() {
        if (this.f3430b) {
            throw new IllegalStateException("Source is closed.");
        }
        a aVar = this.c;
        return aVar.exhausted() && this.f3429a.l(aVar, 8192L) == -1;
    }

    @Override // Mj.i
    public final a getBuffer() {
        return this.c;
    }

    @Override // Mj.d
    public final long l(a sink, long j) {
        kotlin.jvm.internal.j.g(sink, "sink");
        if (this.f3430b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "byteCount: ").toString());
        }
        a aVar = this.c;
        if (aVar.c == 0 && this.f3429a.l(aVar, 8192L) == -1) {
            return -1L;
        }
        return aVar.l(sink, Math.min(j, aVar.c));
    }

    @Override // Mj.i
    public final void o(a sink, long j) throws EOFException {
        a aVar = this.c;
        kotlin.jvm.internal.j.g(sink, "sink");
        try {
            require(j);
            aVar.o(sink, j);
        } catch (EOFException e) {
            sink.i(aVar, aVar.c);
            throw e;
        }
    }

    @Override // Mj.i
    public final e peek() {
        if (this.f3430b) {
            throw new IllegalStateException("Source is closed.");
        }
        return new e(new c(this));
    }

    @Override // Mj.i
    public final byte readByte() throws EOFException {
        require(1L);
        return this.c.readByte();
    }

    @Override // Mj.i
    public final boolean request(long j) {
        a aVar;
        if (this.f3430b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "byteCount: ").toString());
        }
        do {
            aVar = this.c;
            if (aVar.c >= j) {
                return true;
            }
        } while (this.f3429a.l(aVar, 8192L) != -1);
        return false;
    }

    @Override // Mj.i
    public final void require(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException(androidx.media3.datasource.cache.c.i(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    public final String toString() {
        return "buffered(" + this.f3429a + ')';
    }
}
