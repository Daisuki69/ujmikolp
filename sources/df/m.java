package df;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m implements Closeable, AutoCloseable {
    public final byte[] b() throws IOException {
        long jC = c();
        if (jC > 2147483647L) {
            throw new IOException(androidx.camera.core.impl.a.f(jC, "Cannot buffer entire body for content length: "));
        }
        of.g gVarG = g();
        try {
            byte[] bArrX = gVarG.x();
            gVarG.close();
            if (jC == -1 || jC == bArrX.length) {
                return bArrX;
            }
            throw new IOException(We.s.o(androidx.camera.core.impl.a.s(jC, "Content-Length (", ") and stream length ("), ") disagree", bArrX.length));
        } catch (Throwable th2) {
            if (gVarG != null) {
                try {
                    gVarG.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ef.c.h(g());
    }

    public abstract C1362d f();

    public abstract of.g g();

    public final String i() throws IOException {
        Charset charsetForName;
        of.g gVarG = g();
        try {
            C1362d c1362dF = f();
            if (c1362dF != null) {
                charsetForName = StandardCharsets.UTF_8;
                try {
                    String str = c1362dF.f16404b;
                    if (str != null) {
                        charsetForName = Charset.forName(str);
                    }
                } catch (IllegalArgumentException unused) {
                }
            } else {
                charsetForName = StandardCharsets.UTF_8;
            }
            int iN = gVarG.n(ef.c.f16665d);
            if (iN != -1) {
                if (iN == 0) {
                    charsetForName = StandardCharsets.UTF_8;
                } else if (iN == 1) {
                    charsetForName = StandardCharsets.UTF_16BE;
                } else if (iN == 2) {
                    charsetForName = StandardCharsets.UTF_16LE;
                } else if (iN == 3) {
                    charsetForName = ef.c.e;
                } else {
                    if (iN != 4) {
                        throw new AssertionError();
                    }
                    charsetForName = ef.c.f;
                }
            }
            String strJ = gVarG.j(charsetForName);
            gVarG.close();
            return strJ;
        } catch (Throwable th2) {
            if (gVarG != null) {
                try {
                    gVarG.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
