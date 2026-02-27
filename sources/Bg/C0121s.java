package Bg;

import M8.A0;
import M8.T2;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Bg.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0121s extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f556b;

    public /* synthetic */ C0121s(Object obj, int i) {
        this.f555a = i;
        this.f556b = obj;
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.f555a) {
            case 0:
                return ((C0121s) this.f556b).available();
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f555a) {
            case 0:
                super.close();
                ((C0121s) this.f556b).close();
                break;
            default:
                A0.i((io.ktor.utils.io.n) this.f556b);
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        switch (this.f555a) {
            case 0:
                return ((C0121s) this.f556b).read();
            default:
                io.ktor.utils.io.n nVar = (io.ktor.utils.io.n) this.f556b;
                if (!nVar.i()) {
                    if (nVar.f().exhausted()) {
                        Bj.H.x(kotlin.coroutines.g.f18170a, new Zg.a(nVar, null));
                    }
                    if (!nVar.i()) {
                        return nVar.f().readByte() & 255;
                    }
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] b8, int i, int i4) throws Throwable {
        switch (this.f555a) {
            case 0:
                kotlin.jvm.internal.j.g(b8, "b");
                return ((C0121s) this.f556b).read(b8, i, i4);
            default:
                kotlin.jvm.internal.j.g(b8, "b");
                io.ktor.utils.io.n nVar = (io.ktor.utils.io.n) this.f556b;
                if (!nVar.i()) {
                    if (nVar.f().exhausted()) {
                        Bj.H.x(kotlin.coroutines.g.f18170a, new Zg.a(nVar, null));
                    }
                    int iA = nVar.f().A(i, Math.min(T2.p(nVar), i4) + i, b8);
                    if (iA >= 0) {
                        return iA;
                    }
                    if (!nVar.i()) {
                        return 0;
                    }
                }
                return -1;
        }
    }
}
