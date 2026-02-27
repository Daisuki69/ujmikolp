package Mj;

import We.s;
import cj.C1127m;
import java.io.EOFException;
import java.io.Flushable;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements i, AutoCloseable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f3423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f3424b;
    public long c;

    @Override // Mj.i
    public final int A(int i, int i4, byte[] bArr) {
        j.a(bArr.length, i, i4);
        g gVar = this.f3423a;
        if (gVar == null) {
            return -1;
        }
        int iMin = Math.min(i4 - i, gVar.b());
        int i6 = (i + iMin) - i;
        int i10 = gVar.f3433b;
        C1127m.d(i, i10, i10 + i6, gVar.f3432a, bArr);
        gVar.f3433b += i6;
        this.c -= (long) iMin;
        if (j.b(gVar)) {
            b();
        }
        return iMin;
    }

    public final void b() {
        g gVar = this.f3423a;
        kotlin.jvm.internal.j.d(gVar);
        g gVar2 = gVar.f;
        this.f3423a = gVar2;
        if (gVar2 == null) {
            this.f3424b = null;
        } else {
            gVar2.f3435g = null;
        }
        gVar.f = null;
        h.a(gVar);
    }

    public final /* synthetic */ void c() {
        g gVar = this.f3424b;
        kotlin.jvm.internal.j.d(gVar);
        g gVar2 = gVar.f3435g;
        this.f3424b = gVar2;
        if (gVar2 == null) {
            this.f3423a = null;
        } else {
            gVar2.f = null;
        }
        gVar.f3435g = null;
        h.a(gVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // Mj.i
    public final long e(a sink) {
        kotlin.jvm.internal.j.g(sink, "sink");
        long j = this.c;
        if (j > 0) {
            sink.i(this, j);
        }
        return j;
    }

    @Override // Mj.i
    public final boolean exhausted() {
        return this.c == 0;
    }

    public final void f(d source) {
        kotlin.jvm.internal.j.g(source, "source");
        while (source.l(this, 8192L) != -1) {
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    public final /* synthetic */ g g(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        g gVar = this.f3424b;
        if (gVar == null) {
            g gVarB = h.b();
            this.f3423a = gVarB;
            this.f3424b = gVarB;
            return gVarB;
        }
        if (gVar.c + i <= 8192 && gVar.e) {
            return gVar;
        }
        g gVarB2 = h.b();
        gVar.d(gVarB2);
        this.f3424b = gVarB2;
        return gVarB2;
    }

    @Override // Mj.i
    public final a getBuffer() {
        return this;
    }

    public final void i(a source, long j) {
        g gVarB;
        kotlin.jvm.internal.j.g(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        long j6 = source.c;
        if (0 > j6 || j6 < j || j < 0) {
            throw new IllegalArgumentException(s.h(j6, "))", androidx.camera.core.impl.a.s(j, "offset (0) and byteCount (", ") are not within the range [0..size(")));
        }
        while (j > 0) {
            kotlin.jvm.internal.j.d(source.f3423a);
            int i = 0;
            if (j < r0.b()) {
                g gVar = this.f3424b;
                if (gVar != null && gVar.e) {
                    long j7 = ((long) gVar.c) + j;
                    j jVar = gVar.f3434d;
                    if (j7 - ((long) ((jVar == null || ((f) jVar).f3431b <= 0) ? gVar.f3433b : 0)) <= 8192) {
                        g gVar2 = source.f3423a;
                        kotlin.jvm.internal.j.d(gVar2);
                        gVar2.f(gVar, (int) j);
                        source.c -= j;
                        this.c += j;
                        return;
                    }
                }
                g gVar3 = source.f3423a;
                kotlin.jvm.internal.j.d(gVar3);
                int i4 = (int) j;
                if (i4 <= 0 || i4 > gVar3.c - gVar3.f3433b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    gVarB = gVar3.e();
                } else {
                    gVarB = h.b();
                    int i6 = gVar3.f3433b;
                    C1127m.d(0, i6, i6 + i4, gVar3.f3432a, gVarB.f3432a);
                }
                gVarB.c = gVarB.f3433b + i4;
                gVar3.f3433b += i4;
                g gVar4 = gVar3.f3435g;
                if (gVar4 != null) {
                    gVar4.d(gVarB);
                } else {
                    gVarB.f = gVar3;
                    gVar3.f3435g = gVarB;
                }
                source.f3423a = gVarB;
            }
            g gVar5 = source.f3423a;
            kotlin.jvm.internal.j.d(gVar5);
            long jB = gVar5.b();
            g gVarC = gVar5.c();
            source.f3423a = gVarC;
            if (gVarC == null) {
                source.f3424b = null;
            }
            if (this.f3423a == null) {
                this.f3423a = gVar5;
                this.f3424b = gVar5;
            } else {
                g gVar6 = this.f3424b;
                kotlin.jvm.internal.j.d(gVar6);
                gVar6.d(gVar5);
                g gVar7 = gVar5.f3435g;
                if (gVar7 == null) {
                    throw new IllegalStateException("cannot compact");
                }
                if (gVar7.e) {
                    int i10 = gVar5.c - gVar5.f3433b;
                    kotlin.jvm.internal.j.d(gVar7);
                    int i11 = 8192 - gVar7.c;
                    g gVar8 = gVar5.f3435g;
                    kotlin.jvm.internal.j.d(gVar8);
                    j jVar2 = gVar8.f3434d;
                    if (jVar2 == null || ((f) jVar2).f3431b <= 0) {
                        g gVar9 = gVar5.f3435g;
                        kotlin.jvm.internal.j.d(gVar9);
                        i = gVar9.f3433b;
                    }
                    if (i10 <= i11 + i) {
                        g gVar10 = gVar5.f3435g;
                        kotlin.jvm.internal.j.d(gVar10);
                        gVar5.f(gVar10, i10);
                        if (gVar5.c() != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        h.a(gVar5);
                        gVar5 = gVar10;
                    }
                }
                this.f3424b = gVar5;
                if (gVar5.f3435g == null) {
                    this.f3423a = gVar5;
                }
            }
            source.c -= jB;
            this.c += jB;
            j -= jB;
        }
    }

    public final void k(byte[] source, int i, int i4) {
        kotlin.jvm.internal.j.g(source, "source");
        j.a(source.length, i, i4);
        int i6 = i;
        while (i6 < i4) {
            g gVarG = g(1);
            int iMin = Math.min(i4 - i6, gVarG.a()) + i6;
            C1127m.d(gVarG.c, i6, iMin, source, gVarG.f3432a);
            gVarG.c = (iMin - i6) + gVarG.c;
            i6 = iMin;
        }
        this.c += (long) (i4 - i);
    }

    @Override // Mj.d
    public final long l(a sink, long j) {
        kotlin.jvm.internal.j.g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.i(j, "byteCount (", ") < 0").toString());
        }
        long j6 = this.c;
        if (j6 == 0) {
            return -1L;
        }
        if (j > j6) {
            j = j6;
        }
        sink.i(this, j);
        return j;
    }

    @Override // Mj.i
    public final void o(a sink, long j) throws EOFException {
        kotlin.jvm.internal.j.g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.i(j, "byteCount (", ") < 0").toString());
        }
        long j6 = this.c;
        if (j6 >= j) {
            sink.i(this, j);
        } else {
            sink.i(this, j6);
            throw new EOFException(s.h(this.c, " bytes were written.", androidx.camera.core.impl.a.s(j, "Buffer exhausted before writing ", " bytes. Only ")));
        }
    }

    @Override // Mj.i
    public final e peek() {
        return new e(new c(this));
    }

    @Override // Mj.i
    public final byte readByte() throws EOFException {
        g gVar = this.f3423a;
        if (gVar == null) {
            throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: 1)");
        }
        int iB = gVar.b();
        if (iB == 0) {
            b();
            return readByte();
        }
        int i = gVar.f3433b;
        gVar.f3433b = i + 1;
        byte b8 = gVar.f3432a[i];
        this.c--;
        if (iB == 1) {
            b();
        }
        return b8;
    }

    @Override // Mj.i
    public final boolean request(long j) {
        if (j >= 0) {
            return this.c >= j;
        }
        throw new IllegalArgumentException(androidx.media3.datasource.cache.c.i(j, "byteCount: ", " < 0").toString());
    }

    @Override // Mj.i
    public final void require(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "byteCount: ").toString());
        }
        if (this.c >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: " + j + ')');
    }

    public final void skip(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.i(j, "byteCount (", ") < 0").toString());
        }
        long j6 = j;
        while (j6 > 0) {
            g gVar = this.f3423a;
            if (gVar == null) {
                throw new EOFException(androidx.media3.datasource.cache.c.i(j, "Buffer exhausted before skipping ", " bytes."));
            }
            int iMin = (int) Math.min(j6, gVar.c - gVar.f3433b);
            long j7 = iMin;
            this.c -= j7;
            j6 -= j7;
            int i = gVar.f3433b + iMin;
            gVar.f3433b = i;
            if (i == gVar.c) {
                b();
            }
        }
    }

    public final String toString() {
        long j = this.c;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        long j6 = 64;
        int iMin = (int) Math.min(j6, j);
        StringBuilder sb2 = new StringBuilder((iMin * 2) + (this.c > j6 ? 1 : 0));
        int i = 0;
        for (g gVar = this.f3423a; gVar != null; gVar = gVar.f) {
            int i4 = 0;
            while (i < iMin && i4 < gVar.b()) {
                int i6 = i4 + 1;
                byte b8 = gVar.f3432a[gVar.f3433b + i4];
                i++;
                char[] cArr = j.f3440a;
                sb2.append(cArr[(b8 >> 4) & 15]);
                sb2.append(cArr[b8 & 15]);
                i4 = i6;
            }
        }
        if (this.c > j6) {
            sb2.append((char) 8230);
        }
        return "Buffer(size=" + this.c + " hex=" + ((Object) sb2) + ')';
    }
}
