package of;

import dOYHB6.tiZVw8.numX49;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements f, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f18831a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f18832b;
    public boolean c;

    public m(r rVar) {
        this.f18832b = rVar;
    }

    @Override // of.f
    public final f a(String str) {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuP9"));
        }
        this.f18831a.f(0, str.length(), str);
        g();
        return this;
    }

    public final f b(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPP"));
        }
        this.f18831a.k(bArr.length, bArr);
        g();
        return this;
    }

    public final f c(int i) {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPb"));
        }
        e eVar = this.f18831a;
        o oVarQ = eVar.q(4);
        int i4 = oVarQ.c;
        byte[] bArr = oVarQ.f18835a;
        bArr[i4] = (byte) ((i >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i & 255);
        oVarQ.c = i4 + 4;
        eVar.f18822b += 4;
        g();
        return this;
    }

    @Override // of.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        r rVar = this.f18832b;
        if (this.c) {
            return;
        }
        try {
            e eVar = this.f18831a;
            long j = eVar.f18822b;
            if (j > 0) {
                rVar.s(j, eVar);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            rVar.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th == null) {
            return;
        }
        Charset charset = v.f18845a;
        throw th;
    }

    public final f f(int i) {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuP2"));
        }
        this.f18831a.t(i);
        g();
        return this;
    }

    @Override // of.r, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPL"));
        }
        e eVar = this.f18831a;
        long j = eVar.f18822b;
        r rVar = this.f18832b;
        if (j > 0) {
            rVar.s(j, eVar);
        }
        rVar.flush();
    }

    public final f g() {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPr"));
        }
        e eVar = this.f18831a;
        long j = eVar.f18822b;
        if (j == 0) {
            j = 0;
        } else {
            o oVar = eVar.f18821a.f18838g;
            int i = oVar.c;
            if (i < 8192 && oVar.e) {
                j -= (long) (i - oVar.f18836b);
            }
        }
        if (j > 0) {
            this.f18832b.s(j, eVar);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // of.r
    public final void s(long j, e eVar) {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPZ"));
        }
        this.f18831a.s(j, eVar);
        g();
    }

    @Override // of.r
    public final u timeout() {
        return this.f18832b.timeout();
    }

    public final String toString() {
        return numX49.tnTj78("bQuPk") + this.f18832b + numX49.tnTj78("bQuPB");
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPu"));
        }
        int iWrite = this.f18831a.write(byteBuffer);
        g();
        return iWrite;
    }
}
